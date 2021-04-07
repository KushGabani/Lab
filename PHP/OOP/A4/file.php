<?php

class File
{  
    $target_directory = "";
    $target_file = "";
    $validUpload = FALSE;
    $imageFileType = "";

    public function __construct($target_dir) {  
        $this->target_directory = $target_dir;
    }

    public function upload($files)  {
        $isImage = getimagesize($files["fileToUpload"]["tmp_name"])
        if($isImage) {
            $validUpload = TRUE;
        } else {
            $validUpload = FALSE;
        }
        
        if(file_exists($target_file)) {
            $validUpload = FALSE;
        }
        if(in_array($imageFileType, array("jpg", "png", "jpeg"))) {
            $validUpload = FALSE;
        }

        if($validUpload) {
            if(move_uploaded_file(files["fileToUpload"]["tmp_name"], $target_file)) {
                return htmlspecialchars(basename(files["fileToUpload"]["name"])) . " uploaded!";
            } else {
                return "Error while uploading...";
            }
        } else {
            return "Could not upload file";
        }
    }

    public function download($file) {
        if (file_exists($file)) {
            header('Content-Description: File Transfer');
            header('Content-Type: application/octet-stream');
            header('Content-Disposition: attachment; filename="'.basename($file).'"');
            header('Expires: 0');
            header('Cache-Control: must-revalidate');
            header('Pragma: public');
            header('Content-Length: ' . filesize($file));
            readfile($file);
            exit;
        }
    }
}  

?>
<?php 
include "file.php"
?>
<!DOCTYPE html>
<html>
    <body>

        <form action="<?php echo $_SERVER['PHP_SELF']  ?>" method="post" enctype="multipart/form-data">
            Select image to upload:
            <input type="file" name="fileToUpload" id="fileToUpload">
            <input type="submit" value="Upload" name="submitUpload">
        </form>

        <form action="<?php echo $_SERVER['PHP_SELF']  ?>" method="post" enctype="multipart/form-data">
            Enter the path to download:
            <input type="file" name="fileToDownload" id="fileToDownload">
            <input type="submit" value="Download" name="submitDownload">
        </form>
    </body>
</html>

<?php
$file_operator = new File();
if(isset($_POST['submitUpload'])) {
    echo $file_operator->upload($_FILES);
}

if(isset($_POST['submitDownload'])) {;
    echo $file_operator->download($_FILES["fileToDownload"]);
}
?>
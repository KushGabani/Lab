<?php
    $host = "localhost";
    $user = "root";
    $pass ="";
    $database = "emp";

    $con = mysqli_connect($host,$user,$pass,$database);

    $name = $email = $gender = $department = $contact = $designation = $password = '';

    if($_SERVER['REQUEST_METHOD']=='POST'){
        $endata= 0;
        function formatInput($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
         }

         function checkIsNotNull($field) {
            global $endata;
            if (empty($_POST[$field])) {
                echo "<h3>" . $field . " is required. </h3> <br />";
            }else {
                $name = formatInput($_POST[$field]);
                if ($field == "email") {
                    $pattern = "/^[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9-]+(\.[a-z0-9-]+)*(\.[a-z]{2,})$/i";
                    if (preg_match($pattern, $field)) {
                        echo "<h3>Invalid email format. </h3> <br />"; 
                    }
                    else {
                        $endata++;
                    }
                } else {
                    $endata++;
                }
            }
         }

        if(isset($_POST['submit'])){
            foreach (array("name", "email", "gender", "department", "contact", "designation", "password") as $formField) {
                checkIsNotNull($formField);
            }

            if($endata == 7) {
                $sql = '';
                if(isset($_POST['submit'])){
                    $email = $_POST["email"];
                    $sql = "SELECT email FROM emp where email = '$email';";
                    $result = mysqli_query($con,$sql);
                    if(mysqli_num_rows($result) == 0){
                        $name = $_POST['name'];
                        $gender = $_POST['gender'];
                        $department= $_POST['department'];
                        $contact = $_POST['contact'];
                        $designation = $_POST['designation'];
                        $email = $_POST['email'];
                        $password = $_POST['password'];

                        $sql = "INSERT INTO `emp` (`name`, `gender`, `department`, `contact`, `designation`, `email`, `password`) VALUES ('$name', '$gender', '$department', '$contact', '$designation', '$email', '$password')";
                        mysqli_query($con,$sql);
                        echo "Employee added!";
                    }
                    else{
                        echo "Employee with this email already exists.";
                    }
                }
            }
        }
    }
?>
<?php
    session_start();
    $host = "localhost";
    $user = "root";
    $pass ="";
    $database = "comp_info";

    $con = mysqli_connect($host,$user,$pass,$database);

    $email = $jdate = $contact = $name = $gender = $designation = $address = '';

    $emailErr = $jdateErr = $contactErr = $nameErr = $genderErr = $designationErr = $addressErr = '';

    $opUserEmail = '';

    if($_SERVER['REQUEST_METHOD']=='POST'){

        $endata= 0;
        function test_input($data) {
            $data = trim($data);
            $data = stripslashes($data);
            $data = htmlspecialchars($data);
            return $data;
         }

        if(isset($_POST['submit']) || isset($_POST['updateUserInfo'])){

            if (empty($_POST["name"])) {
                $nameErr = "Name is required";
            }else {
                $name = test_input($_POST["name"]);
                $endata++;
            }
            
            if (empty($_POST["email"])) {
                $emailErr = "Email is required";
            }
            else {
                $email = test_input($_POST["email"]);
                // check if e-mail address is well-formed
                if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
                    $emailErr = "Invalid email format"; 
                }
                else{
                    $endata++;
                }
            }
            
            if (empty($_POST['jdate'])) {
                $jdateErr = "Joining Date is required";
            }else {
                $jdate = test_input($_POST["jdate"]);
                $endata++;
            }
            
            if (empty($_POST["address"])) {
                $addressErr = "Address is required";
            }else {
                $address = test_input($_POST["address"]);
                $endata++;
            }
            
            if (empty($_POST["contact"])) {
                $contactErr = "Contact is required";
            }else {
                $contact = test_input($_POST["contact"]);
                $endata++;
            }
            
            if (empty($_POST["gender"])) {
                $genderErr = "Gender is required";
            }else {
                $gender = test_input($_POST["gender"]);
                $endata++;
            }
            
            if (empty($_POST['desig'])) {
                $designationErr = "Designation is required";
            }else {
                $designation = test_input($_POST['desig']);
                $endata++;
            }

            $sqldate=date('Y-m-d',strtotime($jdate));

            if($endata == 7){

                $sql = '';
                if(isset($_POST['submit'])){
                    $sql3 = "SELECT * FROM emp_tbl where email = '$email';";
                    $result3 = mysqli_query($con,$sql3);
                    $num = mysqli_num_rows($result3);
                    if(mysqli_num_rows($result3) == 0){
                        $sql = "INSERT INTO `emp_tbl` (`email`, `joindate`, `contact`, `name`, `gender`, `designation`, `address`) VALUES ('$email', '$sqldate', '$contact', '$name', '$gender', '$designation', '$address')";
                        mysqli_query($con,$sql);

                    }
                    else{
                        echo "User with this email Id already exists.";

                    }
                }
                if(isset($_POST['updateUserInfo'])){
                    $sql = "UPDATE `emp_tbl` SET `email` = '$email', `joindate` = '$sqldate', `contact` = '$contact', `name` = '$name', `address` = '$address', `designation` = '$designation', `email` = '$email' WHERE `emp_tbl`.`email` = 'himanshu03000@gmail.com';";
                    mysqli_query($con,$sql);

                }
            }
        }

        if(isset($_POST['adminlogin'])){
            $pass = $_POST['adminPass'];
            $email = $_POST['adminEmail'];
            $sqlpass = $sqlEmail = '';
            $sql = "SELECT `email`, `pass` FROM `admin`";
            $result = mysqli_query($con,$sql);
            while($row = mysqli_fetch_assoc($result)){
                $sqlEmail = $row['email'];
                $sqlpass = $row['pass'];
            }
            if($email==$sqlEmail && $pass == $sqlpass){
                header("Location: employeeInfo.php");
            }
            else{
                echo "Your EmailId or password was incorrect.";
            }
        }

        if(isset($_POST['admindelete'])){
            $opUserEmail = $_POST['opUserEmail'];
            $sql = "DELETE FROM `emp_tbl` WHERE email = '$opUserEmail';";
            mysqli_query($con,$sql);
        }

        if(isset($_POST['adminupdate'])){
            $_SESSION['opUserEmail'] = $_POST['opUserEmail'];
            header("Location: updateEmployee.php");
        }
    }
?>
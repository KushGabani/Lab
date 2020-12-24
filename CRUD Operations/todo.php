<?php 
    session_start();
    $host = "localhost";
    $user = "root";
    $pass ="";
    $database = "emp";

    $con = mysqli_connect($host,$user,$pass,$database);

    $email = $managername = $workassign = $workdescription = $date = '';

    if ($_SERVER['REQUEST_METHOD'] == 'POST') {
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
            } else {
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
            foreach (array("email", "managername","workassign", "workdescription", "date") as $formField) {
                checkIsNotNull($formField);
            }

            if($endata == 5) {
                if(isset($_POST['submit'])){
                    $email =  $_POST['email'];
                    $managername = $_POST['managername'];
                    $workassign = $_POST['workassign'];
                    $workdescription = $_POST['workdescription'];
                    $date = $_POST['date'];

                    $checkquery = "SELECT email FROM emp where email = '$email';";
                    $result = mysqli_query($con,$checkquery);
                    $storedEmail = '';
                    while($row = mysqli_fetch_assoc($result)){
                        $storedEmail = $row['email'];
                    }
                    if($email==$storedEmail){
                        $insertQuery = "INSERT INTO `todo` (`email`, `managername`, `workassign`, `workdescription`, `date`) VALUES ('$email', '$managername', '$workassign', '$workdescription', '$date')";
                        mysqli_query($con,$insertQuery);
                        echo '<script>alert("Task Assigned!")</script>'; 
                    }
                    else{
                        echo '<h1>The employee data does not exist.</h1>';
                    }
                }
            }
        }
    }
?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>To-do Tasks</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
</head>
<body>
    <div class="row" style = "margin-top: 8rem">
        <div class="col-md-12 my-4" style="display: flex; justify-content: center; align-items: center;">
        </div>
            <div class="col-md-9 mx-auto">
                <div class="card">
                    <div class="card-body">
                        <form method="post">
                            <div class="row">
                                <div class="col text-center">
                                    <h2>To-do Task Form</h2>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <hr />
                                </div>
                            </div>

                            <div class="row" style = "margin-bottom: 1.5rem">
                                <div class="col-md">
                                        <label>Email</label>
                                        <input type="text" placeholder="Email ID..." class="form-control" name="email">
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Select Manager</label>
                                        <select name="managername" id=""  class="form-control">
                                            <option value="" disabled selected>Select Manager</option>
                                            <option value="m1">m1</option>
                                            <option value="m2">m2</option>
                                            <option value="m3">m3</option>
                                        </select>
                                    </div>  
                                </div>
                                <div class="col-md-6">
                                <div class="form-group">
                                    <label>Work Assign</label>
                                    <select name="workassign" id=""  class="form-control">
                                        <option value="" disabled selected>Assign Work</option>
                                        <option value="development">Development</option>
                                        <option value="testing">Testing</option>
                                        <option value="analysis">Analysis</option>
                                        <option value="maintainence">Maintainence</option>
                                    </select>
                                    </div>  
                                </div>
                            </div>
                            
                            <div class="row" style = "margin-bottom: 2rem">
                                <div class="col-md-6">
                                        <label>Work Description</label>
                                        <input type="text" placeholder="Work Description..." class="form-control" name="workdescription">
                                </div>
                                <div class="col-md-6">
                                    <label>Date</label>
                                    <div>
                                        <input class="form-control" type="date" value="2020-12-23" id="date" name="date">
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <button class="btn-block btn btn-success btn-lg" name="submit">Submit</button>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>
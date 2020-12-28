<?php 
    session_start();
    $host = "localhost";
    $user = "root";
    $pass ="";
    $database = "emp";

    $con = mysqli_connect($host,$user,$pass,$database);

    $email = $password = '';

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
            foreach (array("email","password") as $formField) {
                checkIsNotNull($formField);
            }

            $storedEmail = $storedPassword = '';
            $password = $_POST['password'];
            $email = $_POST['email'];
            $sql = "SELECT `email`, `password` FROM `emp`";
            $result = mysqli_query($con,$sql);
            while($row = mysqli_fetch_assoc($result)){
                $storedEmail = $row['email'];
                $storedPassword = $row['password'];
            }
            if($email==$storedEmail && $password == $storedPassword){
                $_SESSION['email'] = $email;
                header("Location: welcome.php");
            }
            else{
                echo 'The employee data does not exist.';
            }
        }
    }
?>

<html>
    <head>
        <meta charset="UTF-8">
        <title>Employee Login Form<Form></Form></title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container" style = "margin-top: 12rem">
            <div class="row">
                <div class="col-md-9 mx-auto">
                    <div class="card">
                        <div class="card-body">
                            <form method="post" action = "">
                                <div class="row">
                                    <div class="col text-center">
                                        <h6>Employee Login</h6>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <hr />
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <label>Email ID</label>
                                        <input type="text" class="form-control" placeholder="Email ID" name="email" >
                                    </div>
                                </div>
                                
                                <div class="row my-4">
                                <div class = "col">
                                        <label>Password</label>
                                        <input type="password" placeholder="Password..." class="form-control" name="password">
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
        </div>
    </body>
</html>

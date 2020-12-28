<?php
    session_start();
    $host = "localhost";
    $user = "root";
    $pass ="";
    $database = "emp";

    $con = mysqli_connect($host,$user,$pass,$database);

    $email = $_SESSION['email'];
    $flag = false;
    $getTasksQuery = "SELECT * FROM todo where email = '$email';";
    $result = mysqli_query($con,$getTasksQuery);
    if ($result) {
        $flag = true;
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
</head>
<body>
    <h1>Welcome! <?php echo $_SESSION['email'] ?></h1>

    <div class = "container d-flex m-auto" style = "margin-top: 3rem">
        <?php 
            echo "<table class='table table-bordered'>
                    <thead>
                    <tr>
                        <th>Email</th>
                        <th>Manager name</th>
                        <th>Work Assign</th>
                        <th>Work Description</th>
                        <th>Date</th>
                    </tr>
                    </thead>";
                    
            if($flag) {
                echo "<tbody>";
                while($row = mysqli_fetch_assoc($result)){
                    echo "<tr> <td>" .$row['email'] . "</td><td>" . $row['managername'] . "</td><td>" .$row['workassign'] . "</td><td>" . $row['workdescription'] . "</td><td>" . $row['date'] . "</td></tr>";
                }
                echo "</tbody></table>";
            }
        ?>
  </div>
</body>
</html>
<?php
    include_once 'phpcode.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Info</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <!-- Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</head>
<body>
    <div class="container border p-4 mt-5">
    <h2 class="my-1 mb-4 mx-auto text-center">Employee Info</h2>
    <table class="table table-striped text-center">
        <thead>
            <tr>
                <th>Name</th>
                <th>Gender</th>
                <th>Email</th>
                <th>Join Date</th>
                <th>Contact</th>
                <th>Designation</th>    
                <th>Address</th>
                <th colspan="2">Operations</th>
            </tr>
        </thead>  
        <tbody>  
        <?php
            $sql = "SELECT * FROM emp_tbl";
            $result = mysqli_query($con,$sql);
            while($row = mysqli_fetch_assoc($result)){
            ?>
                
                <tr>
                    <td> <?php echo $row['name']?> </td>
                    <td> <?php echo $row['gender']?> </td>
                    <td> <?php echo $row['email']?> </td>
                    <td> <?php echo $row['joindate']?> </td>
                    <td> <?php echo $row['contact']?> </td>
                    <td> <?php echo $row['designation']?> </td>
                    <td> <address> <?php echo $row['address']?> </address> </td>
                    <form method="post">
                        <input type="hidden" name="opUserEmail" value="<?php echo $row['email']?>">
                        <td><input type="submit" class="btn btn-success" name="adminupdate" value="Update"/></td>
                        <td><input type="submit" class="btn btn-danger" name="admindelete" value="Delete"/></td>
                    </form>
                </tr>
            <?php
            }
        ?>
        </tbody>
    </table>
    </div>
</body>
</html>
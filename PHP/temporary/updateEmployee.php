<?php
    include_once 'phpcode.php';
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <!-- Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    <style>
        .error{
            color: red;
        }
    </style>
</head>
<body>
    <?php
        $result1Arr = array();
        $opUserEmail = $_SESSION['opUserEmail'];
        $sql = "SELECT * FROM emp_tbl where email = '$opUserEmail';";
        $result = mysqli_query($con,$sql);
        while($row = mysqli_fetch_assoc($result)){
            $result1Arr = $row;
        }
        echo $result1Arr['address'];
    ?>
    <div class="container">
        <div class="row">
            <div class="col-md-12 my-4" style="display: flex; justify-content: center; align-items: center;">
                <h3>Employee Form</h3><br/>
            </div>
            <div class="col-md-9 mx-auto">
                <div class="card">
                    <div class="card-body">
                        <form method="post">
                            <div class="row">
                                <div class="col text-center">
                                    <h6>Employee SignUp</h6>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col">
                                    <hr />
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Employee Name</label>
                                    <input type="text" class="form-control" placeholder="Employee Name" name="name" value="<?php echo $result1Arr['name']?>">
                                    <span class = "error"><?php echo $nameErr;?></span>
                                </div>
                                <div class="col-md-6">
                                        <label>Join Date</label>
                                        <input type="date" placeholder="Join Date" class="form-control" name="jdate" value="<?php echo $result1Arr['joindate']?>">
                                        <span class = "error"><?php echo $jdateErr;?></span>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                        <label>Contact No</label>
                                        <input type="text" placeholder="Contact No." class="form-control" name="contact" value="<?php echo $result1Arr['contact']?>">
                                        <span class = "error"><?php echo $contactErr;?></span>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Email-ID</label>
                                        <input type="email" placeholder="Email Id" class="form-control" name="email" value="<?php echo $result1Arr['email']?>">
                                        <span class = "error"><?php echo $emailErr;?></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Gender</label><br>
                                        <input type="radio" name="gender" id="" value="male" <?php if($result1Arr['gender']=='male'){echo 'checked';} ?> >&nbsp;Male
                                        <input type="radio" name="gender" id="" value="female" <?php if($result1Arr['gender']=='female'){echo 'checked';} ?>>&nbsp;Female
                                        <span class = "error"><?php echo $genderErr;?></span>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="desig">Employee Designation : </label>
                                        <select name="desig" id=""  class="form-control">
                                            <option value="" disabled selected>Select Designation</option>
                                            <option value="Manager" <?php if($result1Arr['designation']=='Manager'){echo 'selected';} ?> >Manager</option>
                                            <option value="Project Manager" <?php if($result1Arr['designation']=='Project Manager'){echo 'selected';} ?> >Project Manager</option>
                                            <option value="Senior Developer" <?php if($result1Arr['designation']=='Senior Developer'){echo 'selected';} ?> >Senior Developer</option>
                                            <option value="Junior Developer" <?php if($result1Arr['designation']=='Junior Developer'){echo 'selected';} ?> >Junior Developer</option>
                                        </select>
                                        <span class = "error"><?php echo $designationErr;?></span>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="form-group">
                                        <label>Address : </label><br>
                                        <textarea class="form-control" name="address" id=""  rows="3"><?php echo $result1Arr['address']; ?></textarea>
                                        <span class = "error"><?php echo $addressErr;?></span>
                                    </div>
                                </div>
                            </div>

                            <br />
                            <div class="row">
                                <div class="col">
                                    <div class="form-group">
                                        <button class="btn-block btn btn-success btn-lg" name="updateUserInfo">Update</button>
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
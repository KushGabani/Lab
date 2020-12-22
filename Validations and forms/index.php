<html>
    <head>
        <meta charset="UTF-8">
        <title>Employee Registration <Form></Form></title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    </head>
    <body>
    <div class="container">
        <div class="row">
            <div class="col-md-12 my-4" style="display: flex; justify-content: center; align-items: center;">
                <h3>Employee Form</h3><br/>
            </div>
            <div class="col-md-9 mx-auto">
                <div class="card">
                    <div class="card-body">
                        <form method="post" action = "submitAction.php">
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
                                    <input type="text" class="form-control" placeholder="Employee Name" name="name" >
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Email-ID</label>
                                        <input type="email" placeholder="Email Id" class="form-control" name="email">
                                    </div>
                                </div>
                            </div>
                            
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label>Gender</label><br>
                                        <input type="radio" name="gender" id="" value="male">&nbsp;Male&nbsp;&nbsp;&nbsp;
                                        <input type="radio" name="gender" id="" value="female">&nbsp;Female
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group">
                                        <label for="department">Employee Department : </label>
                                        <select name="department" id=""  class="form-control">
                                            <option value="" disabled selected>Select Department</option>
                                            <option value="Sale">Sale</option>
                                            <option value="Purchase">Purchase</option>
                                            <option value="Marketing">Marketing</option>
                                            <option value="Clerk">Clerk</option>
                                        </select>
                                    </div>
                                </div>
                            </div>

                            <div class="row">
                                <div class="col-md-6">
                                        <label>Contact No</label>
                                        <input type="text" placeholder="Contact No." class="form-control" name="contact">
                                </div>
                                <div class="col-md-6">
                                        <label>Designation</label>
                                        <input type="text" placeholder="Designation" class="form-control" name="designation">
                                </div>
                            </div>
                            <br />
                            <div class="row" style = "margin-bottom: 1rem">
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

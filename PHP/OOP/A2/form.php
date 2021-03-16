<?php
include "db.php";

$database = new DB;
$database->connect();
if(isset($_POST['submit'])){
    $pname = $_POST['pname'];
    $pdesc = $_POST['pdesc'];
    $pprice = $_POST['pprice'];
    $cid = $_POST['cid'];
    $pcreated = "16-03-2021";

    $values = array("'".$pname."'", "'".$pdesc."'", $pprice, $cid, "'".$pcreated."'");
    $database->insert("products", $values);
}
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

    <a href="view.php"><button>View</button></a>
    <form action="<?php echo $_SERVER['PHP_SELF']; ?>" method="POST">
        <label>Name : </label>
        <input type="text" name="pname" />
        <br /><br />

        <label>Price : </label>
        <input type="text" name="pprice" />
        <br /><br />

        <label>Description : </label>
        <TextArea type="text" name="pdesc" ></TextArea>
        <br /><br />

        <label>Categories : </label>
        <select name="cid">
            <option value="1">Fashion</option>
            <option value="2">Electronics</option>
            <option value="3">Motors</option>
        </select>
        <br /><br />

        <button type="submit" name="submit">Insert</button>
    </form>
</body>
</html>
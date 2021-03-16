<?php
include "db.php"
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>View</title>
</head>
<body>
    <table style="border: 1px solid black">
    <?php 
        $database = new DB;
        $database->connect();
        echo "<tr>";
        $columns = array("pid", "pname", "pdesc", "pprice", "cid", "pcreated");
        foreach ($columns as $key => $value) {
            echo "<th>".$value."</th>";
        }
        echo "</tr>";
        $result = $database->view("products", $columns);
        echo "<br />";
        foreach ($result as $key => $row) {
            echo "<tr>";
            foreach ($row as $col => $value) {
                echo "<td>". $value ."</td>";
            }
            echo "</tr>";
        }
    ?>
    </table>
    <body>
</html>
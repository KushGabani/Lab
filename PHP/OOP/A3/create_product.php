<?php 
    include "operations.php";
    $operation = new Operation();
    $categories = $operation->viewCategory();  
 
    if (isset($_GET["update"])) {
        $name = $_POST["name"];
        $category = $_POST["category"];
        $desc = $_POST["desc"];
        $price = $_POST["price"];
        $id = $_POST["id"];
 
        $operation->updateProd($name, $price, $desc, $category, $id);
        
        
    } else {
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $name = $_POST["name"];
            $category = $_POST["category"];
            $desc = $_POST["desc"];
            $price = $_POST["price"];
    
            $operation->insertProd($name, $price, $desc, $category);
        }
    }
    
    if (isset($_GET["action"]) && isset($_GET["id"])) $prod = $operation->getProductById($_GET["id"]);
 
?>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title><?php echo isset($_GET["action"]) ? "Update" : "Create" ?> Product</title>
</head>
<body>
    <div class="container">
 
       
        <form action="<?php echo isset($_GET["action"]) ? "?update" : "" ?>" class="create-prod" method="POST">
 
            <h1><?php echo isset($_GET["action"]) ? "Update" : "Create" ?> Product</h1>
 
            <div class="form-controls">
                <label for="name">Name: </label>
                <input type="text" name="name" value="<?php echo isset($_GET['action']) ?  trim($prod['prod_name']) : "" ?>">
            </div>
 
            <div class="form-controls">
                <label for="price">Price: </label>
                <input type="text" name="price" value="<?php echo isset($_GET["action"]) ? $prod["prod_price"] : "" ?>">
            </div>
 
            <div class="form-controls">
                <label for="desc">Description:  </label>
                <input type="text" name="desc" value="<?php echo isset($_GET["action"]) ? $prod["prod_desc"] : "" ?>">
            </div>
 
            <div class="form-controls">
                <label for="category">Category:  </label>
 
                <select name="category">
                    <option value="NULL">-- Select -- </option>
                    <?php 
    
                            while($category = mysqli_fetch_assoc($categories)) {
                                if (!isset($_GET["action"])) echo "<option value=".$category["id"]."> ".$category["category"]."</option>";
                                else {
                                    if ($category["id"] == $prod["cat_id"])
                                        echo "<option value=".$category["id"]." selected> ".$category["category"]."</option>";
                                    else echo "<option value=".$category["id"]."> ".$category["category"]."</option>";
                                }                               
                            }                      
                    ?>
                </select>
            </div>
            <div class="form-controls btn-submit">
                <input type="submit" value=" <?php echo isset($_GET["action"]) ? "Update" : "Create +" ?>" class="btn">
                <a href="../Ass1" class="btn-view-products">View Products</a>
                <input type="text" name="id" value="<?php echo isset($_GET["action"]) ? $prod["id"] : "" ?>" hidden>
            </div>
        </form>
    </div>
 
</body>
</html>

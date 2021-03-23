<?php 
    include "dbconn.php";
 
    class Operation extends DBCon { // Operation class inherits DBCon class
 
        //Methods
        public function ViewProducts() {
            $query = "SELECT * FROM tbl_products;";
            $result = mysqli_query($this->connect(), $query);
 
            if (!$result) echo "Error occured!";
            else {
                if (mysqli_num_rows($result) == 0) echo "No Records Found!";
                else return $result;
            }
                 
        }
 
        public function viewCategory() {
            $query = "SELECT * from tbl_category;";
            $result = mysqli_query($this->connect(), $query);
 
            if (!$result) echo "Error occured!";
            else {
                if (mysqli_num_rows($result) == 0) echo "No Records Found!";
                else return $result;
            }
        }
 
        public function insertProd($name, $price, $desc, $category) {
            $query = "INSERT INTO tbl_products (`prod_name`, `prod_desc`, `prod_price`, `cat_id`) VALUES ('$name', '$desc' , '$price', '$category')";
            
            $result = mysqli_query($this->connect(), $query);
            if (!$result) echo "ERROR!! occured while creating a product.";
            else echo "Product created SUCCESSFULLY!";
        }
 
        public function updateProd($name, $price, $dec, $category, $id) {
            $query = "UPDATE tbl_products SET prod_name='$name', prod_desc='$dec', prod_price='$price', cat_id='$category' WHERE id='$id'";
 
            try {
                $result = mysqli_query($this->connect(), $query);
                echo "Records Updated Successfully!";
            } catch (Exception $e) {
                echo $e->getMessage();
            }  
 
        }
 
        public function getProductById($id) {
            $query = "SELECT * from tbl_products WHERE id='$id'";
            try {
                $result = mysqli_query($this->connect(), $query);
                return mysqli_fetch_array($result);
 
            } catch (Exception $e) {
                echo $e->getMessage();
            }
        }
 
    }
 
    
?>

<?php

class DB
{  
    private $host;
    private $user;
    private $pass;
    private $database;
    private $con;

    public function __construct()  
    {  
        $this->host = "localhost";
        $this->user = "root";
        $this->pass = "";
        $this->database = "php_assignment";
    }  

    public function connect()  
    { 
        try {
            $this->con = mysqli_connect($this->host,$this->user,$this->pass,$this->database);
        }
        catch (Exception $e){
            echo "Error creating the database";
        }
    }

    public function view($table, $cols = array("*")) {
        $get_column = $cols == array("*") ? "*" : implode(", ", $cols); 
        $query = "select " . $get_column . " from " . $table . ";";
        
        $array = array();
        if($this->con) {
            $result = mysqli_query($this->con, $query);
            while($row = mysqli_fetch_assoc($result)) {
                $array[] = $row;
            }
            return $array;
        }
    }
}  

?>
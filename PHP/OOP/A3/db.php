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
}  

?>
<?php

class Car{
    public $id;
    public $license;
    public $driver; 
    public $passengers;

    public function __construct($license, $driver){
        $this->license = $license;
        $this->driver= $driver;
    }

    public function PrintDataCar(){
        echo "License: $this->license, Conductor: {
        $this->diver->name}, documente {$this->driver->document}";
    }

}
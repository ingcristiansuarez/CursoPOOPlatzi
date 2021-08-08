<?php

require_once('Car.php');
require_once('Account.php');

$car = new Car("AWS431", new Account("Cosme fulanito","AWS111"));
$car->printDataCar();
package MotorDepot;

open class MotorDepot(var driverName: String, var flightName: String, var carName: String, var startFlight: String, var endFlight: String) {

    open fun driverInfo(){
        println("Имя водителя: $driverName. Рейс: $flightName. Машина: $carName.")
    }

    open fun infoAboutDateFlight() {
        println("Начало рейса в $startFlight. Конец рейса в $endFlight.")
    }
}

import MotorDepot.MotorDepot

open class Dispatcher(driverName: String, flightName: String, carName: String, startFlight: String, endFlight: String): MotorDepot(driverName, flightName, carName, startFlight, endFlight) {

    open fun suspensionDriver() {
        println("Водитель ${driverName} на рейсе ${flightName} на ${carName} отстранен.");
    }
}
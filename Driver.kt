import MotorDepot.MotorDepot

open class Driver(driverName: String, flightName: String, carName: String, numberApplications: Int, startFlight: String, endFlight: String): MotorDepot(driverName, flightName, carName, startFlight, endFlight) {
    var numberApplications = 0;

    open fun requestForRepairs() {
        println("Водитель $driverName на рейсе $flightName запрашивает ремонт для $carName.");
    }

    open fun completionOfTheFlight() {
        println("Водитель $driverName на рейсе $flightName на $carName машине завершил рейс.");
    }

    open fun addApplication(additionalApplications: Int) {
        if(additionalApplications > 0) {
            if(numberApplications + additionalApplications  < 5) {
                numberApplications += additionalApplications;
                println("У водителя $driverName $numberApplications заявок.  До максимума, ${5 - numberApplications} заявок.");

            } else {
                println("У водителя $driverName больше пяти заявок.");
            }
        } else {
            println("Введите правильное количество заявок.");
        }
    }
}
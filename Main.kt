import MotorDepot.MotorDepot

fun main() {
    println("Заполняет информацию о водителе.");

    print("Введите имя водителя: ");
    val driverName : String = readLine().toString();

    print("Введите название рейса: ");
    val flightName : String = readLine().toString();

    print("Введите название автомобиля: ");
    val carName : String = readLine().toString();

    print("Введите начало рейса: ");
    val startFlight : String = readLine().toString();

    print("Введите конец рейса: ");
    val endFlight : String = readLine().toString();

    println();

    val firstDriverMotorDepot = MotorDepot(driverName, flightName, carName, startFlight, endFlight);
    firstDriverMotorDepot.driverInfo();

    println();

    val firstDriverDispatcher = Dispatcher(driverName, flightName, carName, startFlight, endFlight);
    firstDriverDispatcher.suspensionDriver();

    println();

    println("Максимальное количество заявок у водителя, 5.");
    val firstDriver = Driver(driverName, flightName, carName, 5, startFlight, endFlight);
    firstDriver.requestForRepairs();
    firstDriver.completionOfTheFlight();
    firstDriver.addApplication(3);
}
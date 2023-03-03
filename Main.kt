fun main() {
    println("Введите название оператора");
    val name: String = readLine()!!.toString();

    println("Введите цену за одну минуту");
    val price = readLine()!!.toDouble();

    println("Введите покрываимываю площадь");
    val square = readLine()!!.toDouble();

    println("Введите мощность интернета");
    val g = readLine().toString();

    println("Оплата наличными");
    val isCashFee = readLine()!!.toBoolean();
    
    val operator1 = Operator(name, price, square, g, isCashFee);

    println("Хотите вывести информацию о оплате");
    val userAnswer = readLine().toBoolean();

    if (userAnswer) {
        println(operator1.getQp());
        println(operator1.getQ());
    }

    val operator2 = Operator("Dom Ru", 19.0, 35.0, "4G", false);

    operator2.getFullInfo();
    operator2.getOperatorName();
}


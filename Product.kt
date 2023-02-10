class Product(_name: String, _price: Int) {
    val name: String = _name;
    val price: Int = _price;
    var type: String = "";
    var quantity: Int = 0;

    constructor(_name: String, _price: Int, _type: String, _quantity: Int) : this(_name, _price) {
        type = _type;
        quantity = _quantity;
    }

    fun printFullInfo() {
        println("Название товара - $name. Цена за одну штуку - $price. Тип - $type. В наличии $quantity.");
    }

    fun printProductAdvertisement() {
        println("Купив $name за $price вы улучшите свою жизнь в три раза!");
    }

    fun printInfoQuantity() {
        println("Добрый день! $name у нас на складе имеется, $quantity штук.");
    }
}
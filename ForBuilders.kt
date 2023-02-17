import PackageProduct.Product

class ForBuilders(_name: String, _price: Int, _type: String, _quantity: Int, _suitableWeather: String, _manufacturer: String, _grant: Int) : Product(_name, _price, _type, _quantity) {
    val suitableWeather = _suitableWeather;
    val manufacturer = _manufacturer;
    val grant = _grant;

    fun infoAboutSuitableWeather() {
        when(suitableWeather) {
            "Дождливо" -> println("Зонт");
            "Солнечно" -> println("Кепка");
            "Облачно" -> println("Толстовка");
        }
    }

    fun infoAboutGrant() {
        when(grant) {
            2 -> println("Вы можете купить еще один товар чтобы увеличить гарантию на товар до 3 лет");
            3 -> println("Вы можете купить еще один товар чтобы увеличить гарантию на товар до 6 лет");
            6 -> println("У вас максимальный срок на гарантию");
        }
    }

    fun priceWithDiscount(discount: Int) {
        val discountNumber: Int = price * (discount / 100);
        println(price + discountNumber);
    }
}
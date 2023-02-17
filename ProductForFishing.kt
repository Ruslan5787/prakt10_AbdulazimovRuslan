import PackageProduct.Product;

class ProductForFishing(_name: String, _price: Int, _type: String, _quantity: Int, _suitableWeather: String, _manufacturer: String, _howManyFishCanYouCatch: Int) : Product(_name, _price, _type, _quantity) {
    val suitableWeather = _suitableWeather;
    val manufacturer = _manufacturer;
    val howManyFishCanYouCatch = _howManyFishCanYouCatch;

    fun infoAboutSuitableWeather() {
        when(suitableWeather) {
            "Дождливо" -> println("Зонт");
            "Солнечно" -> println("Кепка");
            "Облачно" -> println("Толстовка");
        }
    }

    fun infoAboutFish() {
        when(howManyFishCanYouCatch) {
            3 -> println("Вы выловили 3 рыбы");
            6 -> println("Вы выловили 6 рыбы");
            9 -> println("Вы выловили 9 рыбы");
        }
    }

    fun priceWithDiscount(discount: Int) {
        val discountNumber: Int = price * (discount / 100);
        println(price + discountNumber);
    }
}
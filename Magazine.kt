package PackageMagazine;

import PackageBook.Book;

class Magazine(name: String, author: String, yearIssue: String, numberPages: Int,
               _amountAdvertising: Int, _price: Int) : Book(name, author, yearIssue, numberPages) {
    var amountAdvertising = _amountAdvertising;
    var price = _price;

    fun infoAboutMagazine() {
        println("Журнал называется ${name} от автора ${author}");
    }

    fun infoAboutAdvertising() {
        when {
            amountAdvertising <= 2 && amountAdvertising > 0 -> println("В журнале мало рекламы");
            amountAdvertising <= 5 && amountAdvertising > 0 -> println("В журнале среднее количество рекламы");
            amountAdvertising <= 10 && amountAdvertising > 0 -> println("В журнале много рекламы");
        }
    }

    fun priceWithDiscount(discount: Int) {
        val discountNumber: Int = price * (discount / 100);
        println(price + discountNumber);
    }
}
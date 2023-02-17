package PackageBook;

open class Book(_name: String, _author: String) {
    val name: String = _name;
    val author: String = _author;
    var yearIssue: String = "";
    var numberPages: Int = 0
        set (value) {
            if((value > 0) && (value < 5000)) {
                field = value;
            }
        }

    constructor(_name: String, _author: String, _yearIssue: String, _numberPages: Int) : this(_name, _author) {
        yearIssue = _yearIssue;
        numberPages = _numberPages;
    }

    internal fun printFullInfo() {
        println("Название - $name. Автор книги - $author. Дата издания - $yearIssue. Количество страниц $numberPages");
    }

    internal fun getBookSize() {
        println(numberPages);
        when {
            numberPages <= 100 && numberPages > 0 -> println("Размер книги - маленький");
            numberPages <= 250 && numberPages > 100 -> println("Размер книги - средний");
            numberPages > 250 -> println("Размер книги - большая");
            else -> println("Некоретное количество страниц")
        }
    }

    internal fun getPageDifference(pagesAnotherBook: Int) {
        if(numberPages > pagesAnotherBook) {
            println("Разница в страницах ${numberPages - pagesAnotherBook}");
        } else {
            println("Разница в страницах ${pagesAnotherBook - numberPages}");
        }
    }
}

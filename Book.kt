class Book(_name: String, _author: String) {
    val name: String = _name;
    val author: String = _author;
    var yearIssue: String = "";
    var numberPages: Int = 0;

    constructor(_name: String, _yearIssue: String, _author: String, _numberPages: Int) : this(_name, _author) {
        yearIssue = _yearIssue;
        numberPages = _numberPages;
    }

    fun printFullInfo() {
        println("Название - $name. Автор книги - $author. Дата издания - $yearIssue. Количество страниц $numberPages");
    }

    fun printBookAdvertisement() {
        println("Прочитав $name от $author вы увеличите свой кругозор в мире книг!");
    }

    fun printInfoAboutPages() {
        println("Количество страниц в $name от $author, $numberPages");
    }
}

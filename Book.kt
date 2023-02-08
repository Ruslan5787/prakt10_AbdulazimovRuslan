class Book(val name: String, val author: String, val yearIssue: String, val numberPages: Int) {
    fun printName() {
        println(name);
    }

    fun printAuthor() {
        println(author);
    }

    fun printYearIssue() {
        println(yearIssue);
    }

    fun printNumberPages() {
        println(numberPages);
    }
}
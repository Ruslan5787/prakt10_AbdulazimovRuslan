fun main() {
    val novel = Book("Мартин Иден", "Джек Лондон", "12 октября 1979г.", 640);
    val fantasy = Book("Автостопом по галактике", "Дуглас Адамс");

    novel.printInfoAboutPages()
    novel.printBookAdvertisement()

    fantasy.printFullInfo()
    fantasy.printBookAdvertisement()

    val hammer = Product("Мололток", 700, "Инструмент", 3);
    val trampoline = Product("Батут", 3500, "Развлечения", 9);

    hammer.printProductAdvertisement();
    hammer.printInfoQuantity();

    trampoline.printFullInfo();
    trampoline.printProductAdvertisement();
}
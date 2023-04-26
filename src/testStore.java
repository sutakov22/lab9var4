public class testStore {
    public static void main(String[] args) {
        BookStore myStore = new BookStore();
        Book myBook1 = new Book("Метро 2033", "АСТ", false);
        myStore.addProduct(myBook1);
        myStore.addProduct(new Book("Механический принц", "Рипол-Классик", true));
        Magazine myMagazine = new Magazine("Cosmopolitan", "Hearst Corporation", true);
        myStore.addProduct(myMagazine);
        myStore.printStore();
        System.out.println("Количество книг - " + myStore.getBookCount() + " Количество журналов - " + myStore.getMagazineCount());
        myStore.removeProduct(myBook1);
        myStore.printStore();
        System.out.println("Количество книг - " + myStore.getBookCount() + " Количество журналов - " + myStore.getMagazineCount());
    }
}

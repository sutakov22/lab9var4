public class Book extends Publisher {
    private Boolean hardCover;

    Book() {
        super();
        hardCover = false;
    }

    Book(String bookName, String publisherName, Boolean isHardCover) {
        super(bookName, publisherName);
        hardCover = isHardCover;
    }

    public void setHardCover(Boolean isHardCover) {
        hardCover = isHardCover;
    }

    public Boolean isHardCover() {
        return hardCover;
    }

    public String toString() {
        return getProductName() + " " + getPublisherName() + " " + (isHardCover() ? "Твёрдый" : "Мягкий") + " переплёт";
    }
}
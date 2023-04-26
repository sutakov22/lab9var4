public class Magazine extends Publisher {
    private Boolean glossy;

    Magazine() {
        super();
        glossy = false;
    }

    Magazine(String magazineName, String publisherName, Boolean isGlossy) {
        super(magazineName, publisherName);
        glossy = isGlossy;
    }

    public void setGlossy(Boolean isGlossy) {
        glossy = isGlossy;
    }

    public Boolean isGlossy() {
        return glossy;
    }

    public String toString() {
        return getProductName() + " " + getPublisherName() + " " + (isGlossy() ? "Глянцевый" : "Не глянцевый") + " журнал";
    }
}

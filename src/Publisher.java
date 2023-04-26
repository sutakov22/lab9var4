public class Publisher {
    private String publisherName;
    private String productName;

    public Publisher() {
        publisherName = "";
        productName = "";
    }

    public Publisher(String _productName, String _publisherName) {
        publisherName = _publisherName;
        productName = _productName;
    }

    public void setPulisherName(String name) {
        publisherName = name;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setProductName(String name) {
        productName = name;
    }

    public String getProductName() {
        return productName;
    }
}

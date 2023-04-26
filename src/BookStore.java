import java.util.ArrayList;

public class BookStore {
    private ArrayList<Publisher> publishers = new ArrayList<Publisher>();

    public void addProduct(Publisher m) {
        publishers.add(m);
    }

    public BookStore() {

    }

    public int getBookCount() {
        int count = 0;
        for (Publisher a : publishers) {
            if (a instanceof Book)
                count++;
        }
        return count;
    }

    public int getMagazineCount() {
        int count = 0;
        for (Publisher a : publishers) {
            if (a instanceof Magazine)
                count++;
        }
        return count;
    }

    public BookStore(ArrayList<Publisher> n) {
        publishers = n;
    }

    public void printStore() {
        System.out.println("В магазине: ");
        for (Publisher a : publishers) {
            System.out.println("\t" + a.toString());
        }
    }

    public void removeProduct(Publisher m) {
        if (publishers.contains(m))
            publishers.remove(m);
    }
}

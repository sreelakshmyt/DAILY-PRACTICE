package INTERFACE.TASK3;

interface Storable {
    void storeItem();
    void retrieveItem();
}

class Book implements Storable {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void storeItem() {
        System.out.println("Storing the book: " + title);
    }

    public void retrieveItem() {
        System.out.println("Retrieving the book: " + title);
    }
}

class Electronics implements Storable {
    String itemName;

    public Electronics(String itemName) {
        this.itemName = itemName;
    }

    public void storeItem() {
        System.out.println("Storing the electronic item: " + itemName);
    }

    public void retrieveItem() {
        System.out.println("Retrieving the electronic item: " + itemName);
    }
}

public class ShelfTest {
    public static void main(String[] args) {
        Storable book = new Book("Java Programming");
        Storable electronics = new Electronics("Smartphone");

        book.storeItem();
        electronics.storeItem();

        book.retrieveItem();
        electronics.retrieveItem();
    }
}


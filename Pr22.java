class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks;

    Library(int books) {
        this.availableBooks = books;
    }

    void issueBook(int count) throws BookNotAvailableException {
        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}

public class pr22 {
    public static void main(String[] args) {
        Library lib = new Library(3);

        try {
            lib.issueBook(2); // valid
            lib.issueBook(2); // will throw exception
        } catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

/*
Output:
Book issued successfully
Remaining books: 1
Exception: Requested books not available
*/

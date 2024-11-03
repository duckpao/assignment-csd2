class BookNode {
    String bcode, title, author, isbn, publisher;
    int quantity, lended;
    double price;
    BookNode left, right;

    public BookNode(String bcode, String title, String author, String isbn, String publisher, int quantity, int lended, double price) {
        this.bcode = bcode;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.quantity = quantity;
        this.lended = lended;
        this.price = price;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Book [Code=" + bcode + ", Title=" + title + ", Author=" + author + ", ISBN=" + isbn +
               ", Publisher=" + publisher + ", Quantity=" + quantity + ", Lended=" + lended + ", Price=" + price + "]";
    }
}

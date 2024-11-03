class BookBST {
    private BookNode root;

    public void insert(BookNode newBook) {
        root = insertRec(root, newBook);
    }

    private BookNode insertRec(BookNode root, BookNode newBook) {
        if (root == null) {
            return newBook;
        }
        if (newBook.bcode.compareTo(root.bcode) < 0) {
            root.left = insertRec(root.left, newBook);
        } else if (newBook.bcode.compareTo(root.bcode) > 0) {
            root.right = insertRec(root.right, newBook);
        }
        return root;
    }

    public void inOrderTraversal() {
        inOrderRec(root);
    }

    private void inOrderRec(BookNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root);
            inOrderRec(root.right);
        }
    }
}

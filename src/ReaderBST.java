class ReaderBST {
    private ReaderNode root;

    public void insert(ReaderNode newReader) {
        root = insertRec(root, newReader);
    }

    private ReaderNode insertRec(ReaderNode root, ReaderNode newReader) {
        if (root == null) {
            return newReader;
        }
        if (newReader.rcode.compareTo(root.rcode) < 0) {
            root.left = insertRec(root.left, newReader);
        } else if (newReader.rcode.compareTo(root.rcode) > 0) {
            root.right = insertRec(root.right, newReader);
        }
        return root;
    }

    public void preOrderTraversal() {
        preOrderRec(root);
    }

    private void preOrderRec(ReaderNode root) {
        if (root != null) {
            System.out.println(root);
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
}



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
    public void menu(){
        System.out.println("====Reader Management======");
        System.out.println("1.Load data from file");
        System.out.println("2.Input and add to tree");
        System.out.println("3.Display data by pre-order traversal");
        System.out.println("4.Save reader tree to file by pre-order traversal");
        System.out.println("5.Search by rcode");
        System.out.println("6.Delete by copying rcode");
        System.out.println("7.Search by name");
        System.out.println("8.Search lending books by rcode");
        System.out.println("9.Exit");
        System.out.println();
        System.out.print("Enter your choice: ");
        
    
    
    }
}

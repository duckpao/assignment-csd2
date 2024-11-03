class ReaderNode {
    String rcode, name;
    int byear;
    ReaderNode left, right;

    public ReaderNode(String rcode, String name, int byear) {
        this.rcode = rcode;
        this.name = name;
        this.byear = byear;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Reader [Code=" + rcode + ", Name=" + name + ", Birth Year=" + byear + "]";
    }
}

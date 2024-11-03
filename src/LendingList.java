class LendingList {
    private LendingNode head;

    public void addLending(LendingNode newLending) {
        newLending.next = head;
        head = newLending;
    }

    public void displayLendings() {
        LendingNode current = head;
        while (current != null) {
            System.out.println(current);
            current = current.next;
        }
    }
}

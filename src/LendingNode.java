import java.util.Date;

class LendingNode {
    String bcode, rcode;
    Date ldate, rdate;
    int state; // 1: borrowed, 2: returned
    LendingNode next;

    public LendingNode(String bcode, String rcode, Date ldate, int state) {
        this.bcode = bcode;
        this.rcode = rcode;
        this.ldate = ldate;
        this.state = state;
        this.rdate = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return "Lending [Book Code=" + bcode + ", Reader Code=" + rcode + 
               ", Lend Date=" + ldate + ", Return Date=" + rdate + ", State=" + state + "]";
    }
}

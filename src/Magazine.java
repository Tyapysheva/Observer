public class Magazine {
    private int issue = 0;
    private static int count = 0;

    public Magazine() {
        this.issue = ++count;
    }

    public String toString() {
        return "Issue" + issue;
    }
}

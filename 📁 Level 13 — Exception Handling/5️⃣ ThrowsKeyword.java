public class ThrowsKeyword {

    public static void check(int marks) throws Exception {

        if (marks < 33) {
            throw new Exception("Fail");
        }

        System.out.println("Pass");
    }

    public static void main(String[] args) {

        try {
            check(25);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

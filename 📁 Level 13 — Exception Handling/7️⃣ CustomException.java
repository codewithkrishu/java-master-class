public class CustomException {

    static class AgeException extends Exception {

        AgeException(String message) {
            super(message);
        }
    }


    static class MarksException extends Exception {

        MarksException(String message) {
            super(message);
        }
    }


    public static void main(String[] args) {

        // AgeException

        int age = 15;

        try {
            if (age < 18) {
                throw new AgeException("Age must be 18 or Above");
            }

            System.out.println("Eligible");

        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }


        // MarksException

        int marks = 30;

        try {
            if (marks < 33) {
                throw new MarksException("Fail");
            }

            System.out.println("Pass");

        } catch (MarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

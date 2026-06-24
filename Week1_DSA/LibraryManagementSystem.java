public class LibraryManagementSystem {

    public static void main(String[] args) {

        String books[] = {
                "Java",
                "Python",
                "DSA"
        };

        String search = "Python";

        for(String book : books) {

            if(book.equals(search)) {

                System.out.println(
                        "Book Found");
            }
        }
    }
}

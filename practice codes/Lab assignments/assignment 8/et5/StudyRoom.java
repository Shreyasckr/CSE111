class StudyRoom extends Library {
    public static int totalBooks = 0;
    private String book1 = null;
    private String book2 = null;

    public StudyRoom(String name) {
        super(name);
    }

    public void addBook(String bookName) {
        if (book1 == null) {
            book1 = bookName;
            totalBooks++;
        } else if (book2 == null) {
            book2 = bookName;
            totalBooks++;
        }
    }

    @Override
    public void showRoomInfo() {
        System.out.println(name + " Details:");
        if (book1 != null) System.out.println("Book 1: " + book1);
        if (book2 != null) System.out.println("Book 2: " + book2);
        else System.out.println("No book added");
    }

    public String getBook1() { return book1; }
    public String getBook2() { return book2; }
    public void setBook1(String book) { book1 = book; }
    public void setBook2(String book) { book2 = book; }

    public void removeBook(int num) {
        if (num == 1 && book1 != null) {
            System.out.println("Book 1 Removed from " + name);
            book1 = null;
            totalBooks--;
        } else if (num == 2 && book2 != null) {
            System.out.println("Book 2 Removed from " + name);
            book2 = null;
            totalBooks--;
        }
    }
}
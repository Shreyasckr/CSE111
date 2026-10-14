public class Borrower{
    public static int book_count[] = {3, 3, 3};
    public static String book_name[] = {"Pather Panchali","Durgesh Nandini", "Anandmath"};
    public String name;
    public String[] books = new String[3];
    public int count = 0;
    
    public Borrower(String s){
        name = s;
    }
    
    public void borrowBook(String s){
        for(int i = 0; i<book_name.length; i++){
            if(s.equals(book_name[i])){
                if(book_count[i]>0){
                    books[count++] = book_name[i];
                    book_count[i]--;
                }
                else{
                    System.out.println("The book is not available");
                }
            }
        }
    }
    
    public void borrowerDetails(){
        System.out.println("Name: "+name);
        System.out.println("Books Borrowed:");
        for(int i = 0; i<count; i++){
            System.out.println(books[i]);
        }
    }
    
    public static int remainingBooks(String s){
        for(int i = 0; i<book_name.length; i++){
            if(s.equals(book_name[i])){
                return book_count[i];
            }
        }
        return 0;
    }
    
    public static void bookStatus(){
        for(int i = 0; i<book_name.length; i++){
            System.out.println(book_name[i]+": "+book_count[i]);
        }
    }
}

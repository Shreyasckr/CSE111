public class Book extends Product{
    public String isbn;
    public String publisher;
    
    public Book(int i, String t, int p, String n, String m){
        super(i, t, p);
        isbn = n;
        publisher = m;
    }
    
    public String printDetail(){
        return getIdTitlePrice() + "\nISBN: "+isbn+" Publisher: "+publisher;
    }
}
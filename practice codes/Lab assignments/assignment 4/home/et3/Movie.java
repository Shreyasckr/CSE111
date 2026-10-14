public class Movie{
    public String name;
    public String genre;
    public String time = "Unknown";
    
    public Movie(String s1, String s2, String s3){
        name = s1;
        genre = s2;
        time = s3;
    }
    
    public Movie(String s1, String s2){
        name = s1;
        genre = s2;
    }
}
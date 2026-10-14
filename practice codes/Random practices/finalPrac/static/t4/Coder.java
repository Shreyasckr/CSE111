public class Coder{
    public String handle;
    public int rating;
    public String type = "Pupil";
    
    public Coder(String s, int n){
        handle = s;
        rating = n;
        if(n>=1600){
            type = "Expert";
        }
    }
}
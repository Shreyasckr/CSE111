public class CD extends Product{
    public int duration;
    public String genre;
    public String band;
    
    public CD(int i, String t, int p, String b, int d, String g){
        super(i, t, p);
        duration = d;
        genre = g;
        band = b;
    }
    
    public String printDetail(){
       return getIdTitlePrice() + "\nBand: "+band+" Duration: "+duration+" minutes Genre: "+genre;
    }
}
public class NikeBD{
    public static int br = 0;
    public static int tjordan = 0;
    public static int tcortez = 0;
    public static int tkobe = 0;
    public static int total = 0;
    
    public String name;
    public int jordan = 0;
    public int cortez = 0;
    public int kobe = 0;
    public int sold = 0;
    
    public NikeBD(String s){
        name = s;
        br++;
    }
    
    public void details(){
        System.out.println("Nike "+name+" outlet:");
        System.out.println("Products Currently Stocked: Jordan: "+jordan+", Cortez: "+cortez+", Kobe: "+kobe);
        System.out.println("Sold: "+sold);
    }
    
    public static void status(){
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches opened: "+br);
        System.out.println("Currently Stocked: Jordan: "+tjordan+", Cortez: "+tcortez+", Kobe: "+tkobe);
        System.out.println("Sold: "+total);
    }
    
    public void restockProducts(String s, int n){
        if(s.equals("Jordan")){
            jordan += n;
            tjordan += n;
        }
        else if(s.equals("Cortez")){
            cortez += n;
            tcortez += n;
        }
        if(s.equals("Kobe")){
            kobe += n;
            tkobe += n;
        }
    }
    
    public void restockProducts(String[] str, int[] quan){
        for(int i = 0; i<str.length; i++){
            this.restockProducts(str[i], quan[i]);
        }
    }
    
    public void productSold(String s1, int n, String s2, int m){
        if(s1.equals("Jordan")){
            jordan -= n;
            tjordan -= n;
            sold += n;
            total += n;
        }
        else if(s1.equals("Cortez")){
            cortez -= n;
            tcortez -= n;
            sold += n;
            total += n;
        }
        if(s1.equals("Kobe")){
            kobe -= n;
            tkobe -= n;
            sold += n;
            total += n;
        }
        if(s2.equals("Jordan")){
            jordan -= m;
            tjordan -= m;
            sold += m;
            total += m;
        }
        else if(s2.equals("Cortez")){
            cortez -= m;
            tcortez -= m;
            sold += m;
            total += m;
        }
        if(s2.equals("Kobe")){
            kobe -= m;
            tkobe -= m;
            sold += m;
            total += m;
        }
    }
}
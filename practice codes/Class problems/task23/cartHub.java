public class cartHub{
    public Cart[] arr;
    
    public void addCart(Cart a, Cart b, Cart c){
        arr = new Cart[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
    }
    
    public void allCartInfo(){
        for(int i = 0; i<arr.length; i++){
            arr[i].info();
        }
    }
}
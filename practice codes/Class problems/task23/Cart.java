public class Cart {
    public String[] items = new String[5];
    public int[] price = new int[5];
    public int count = 0;
    
    // Array to hold other carts when this object acts as a Hub
    public Cart[] carts; 
    
    public void storeProduct(String s, int n) {
        items[count] = s;
        price[count] = n;
        count++;
    }
    
    public void storeProduct(String s, int n, String s2, int n2) {
        items[count] = s;
        price[count] = n;
        count++;
        items[count] = s2;
        price[count] = n2;
        count++;
    }
    
    public void info() {
        System.out.println("Cart Items:");
        if (count == 0) {
            System.out.println("Cart is empty.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(items[i] + " - " + price[i]);
            }
        }
    }
    
    public void transferItem(Cart obj, String s) {
        // 1. Search in the CURRENT cart's array
        for (int i = 0; i < count; i++) {
            if (items[i].equals(s)) {
                System.out.println("Item transferred successfully.");
                
                // 2. Store the item in the destination cart (obj)
                obj.storeProduct(items[i], price[i]);
                
                // 3. Manually shift elements left to "delete" the transferred item
                for (int j = i; j < count - 1; j++) {
                    items[j] = items[j + 1];
                    price[j] = price[j + 1];
                }
                
                // 4. Clean up the last slot and decrease the count
                items[count - 1] = null;
                price[count - 1] = 0;
                count--;
                break; // Stop looping once the item is found and moved
            }
        }
    }
    
    // --- Methods brought over from the deleted carthub class ---
    
    public void addCart(Cart a, Cart b, Cart c) {
        carts = new Cart[3]; // Properly initialized as a Cart array
        carts[0] = a;
        carts[1] = b;
        carts[2] = c;
    }
    
    public void allCartInfo() {
        for (int i = 0; i < carts.length; i++) {
            carts[i].info();
        }
    }
}

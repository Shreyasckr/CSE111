import java.util.Scanner;
public class cfProb26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sides = 0;
        for(int i = 0; i<n; i++){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                sides += 4;
            }
            else if(s.equals("Cube")){
                sides += 6;
            }
            else if(s.equals("Octahedron")){
                sides += 8;
            }
            else if(s.equals("Dodecahedron")){
                sides += 12;
            }
            else if(s.equals("Icosahedron")){
                sides += 20;
            }
        }
        System.out.println(sides);
    }
}
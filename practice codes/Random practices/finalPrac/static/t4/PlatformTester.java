public class PlatformTester {
    public static void main(String[] args) {
        Coder c1 = new Coder("tourist", 3800);
        Coder c2 = new Coder("benq", 3500);
        Coder c3 = new Coder("newbie_coder", 1200);
        Coder c4 = new Coder("algo_master", 1900);
        System.out.println("1-------------------");
        Platform cf = new Platform("Codeforces Div 1");
        cf.registerCoder(c1);
        cf.registerCoder(c2);
        System.out.println("2-------------------");
        cf.platformDetails();
        System.out.println("3-------------------");
        cf.registerCoder(c3);
        cf.registerCoder(c4);
        System.out.println("4-------------------");
        cf.platformDetails();
    }
}

//1-------------------
//tourist (Expert) registered successfully.
//benq (Expert) registered successfully.
//2-------------------
//Platform: Codeforces Div 1
//Total Registered: 2
//Average Rating: 3650.0
//Registered Coders:
//- tourist
//- benq
//3-------------------
//newbie_coder (Pupil) registered successfully.
//Registration failed! Platform capacity reached. Cannot register algo_master.
//4-------------------
//Platform: Codeforces Div 1
//Total Registered: 3
//Average Rating: 2833.3333333333335
//Registered Coders:
//- tourist
//- benq
//- newbie_coder
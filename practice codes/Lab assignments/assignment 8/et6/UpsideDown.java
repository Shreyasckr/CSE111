class UpsideDown extends Hawkins {
    public static int totalBridges = 0;
    private Hawkins bridge1 = null;
    private Hawkins bridge2 = null;

    public UpsideDown(String name) {
        super(name);
    }

    public void connect(Hawkins h) {
        if (bridge1 == null) {
            bridge1 = h;
            totalBridges++;
        } else if (bridge2 == null) {
            bridge2 = h;
            totalBridges++;
        } else {
            System.out.println("No further bridges with " + name);
        }
    }

    public void disconnect(int num) {
        if (num == 1 && bridge1 != null) {
            bridge1 = null;
            totalBridges--;
        } else if (num == 2 && bridge2 != null) {
            bridge2 = null;
            totalBridges--;
        } else {
            System.out.println("Invalid bridge number!");
        }
    }

    public void details() {
        System.out.println(name + " Details:");
        if (bridge1 != null) System.out.println("Bridge 1: " + bridge1.name);
        if (bridge2 != null) System.out.println("Bridge 2: " + bridge2.name);
    }

    public Hawkins getBridge1() { return bridge1; }
    public Hawkins getBridge2() { return bridge2; }

    public void activate(Hawkins h) {
        System.out.println("Activating the door of " + h.name);
    }
}
public class NavigationSystem {
    public String systemName;
    public Road[] roadObjects;
    public boolean[] safeRoads;
    public int count;
    public NavigationSystem(String systemName) {
        this.systemName = systemName;
        roadObjects = new Road[10];
        safeRoads = new boolean[10];
        System.out.println("Navigation System " + systemName + " activated.");
    }
    public void addRoad(Road obj) {
        roadObjects[count] = obj;
        if (obj.accidents < 5 && obj.lighting >= 4) {
            safeRoads[count] = true;
        } else {
            safeRoads[count] = false;
        }
        count++;
    }
    public void checkRoute(Road obj) {
        checkRoute(obj, "Not emergency");
    }
    public void checkRoute(Road obj, String urgencyLevel) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (roadObjects[i].name.equals(obj.name)) {
                index = i;
                break;
            }
        }
        if (safeRoads[index]) {
            System.out.println("Route " + obj.name + " is safe. Continue driving.");
            return;
        }
        if (urgencyLevel.equals("Emergency") && obj.accidents <= 7 && obj.lighting >= 3) {
            System.out.println("Emergency route allowed via " + obj.name);
            return;
        }
        System.out.println("Warning! " + obj.name + " is unsafe.");
        System.out.println("Searching for alternate route...");
        for (int i = index - 1, j = index +1; i >= 0 || j<count; i--, j++) { // searching for road nearest to current road
            if (safeRoads[i]) {
                System.out.println("Redirecting to " + roadObjects[i].name);
                return;
            }
            if (safeRoads[j]) {
                System.out.println("Redirecting to " + roadObjects[i].name);
                return;
            }
        }
    }
    public void systemReport() {
        System.out.println("Navigation System: " + systemName);
        System.out.println("Total Roads: " + count +"/" + roadObjects.length);
        for (int i = 0; i < count; i++) {
            System.out.print(roadObjects[i].name + " : ");
            if (safeRoads[i]) System.out.println("Safe");
            else System.out.println("Unsafe");
        }
    }
}
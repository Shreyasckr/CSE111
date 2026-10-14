public class SmartSecurityCamera extends SmartDevice {
    private int storageGB;
    private int originalStorageGB;
    private boolean nightVision = false;
    private static final String ADMIN_PIN = "ADMIN123";
    
    public SmartSecurityCamera(String name, double battery, int storageGB) {
        super(name, battery);
        this.storageGB = storageGB;
        this.originalStorageGB = storageGB;
    }
    
    @Override
    public void powerOn() {
        if (storageGB <= 0) {
            System.out.println("Error: " + deviceName + " storage full.");
            System.out.println("Recording disabled.");
            return;
        }
        super.powerOn();
    }
    
    @Override
    public void powerOff() {
        if (nightVision) System.out.println("Turning off Night Vision.");
        nightVision = false;
        super.powerOff();
    }
    
    public void record(boolean useNightVision) {
        if (useNightVision) System.out.println("[IR SENSORS ACTIVE]");
        System.out.println("Recording standard footage.");
        this.nightVision = useNightVision;
        storageGB--;
    }
    
    public void record() {
        record(false);
    }
    
    public void formatCard(String pin) {
        System.out.println("REQUEST: Format SD Card initiated.");
        if (!isActive) {
            System.out.println("ERROR: Device must be ON to format.");
            return;
        }
        if (pin.equals(ADMIN_PIN)) {
            System.out.println("Auth Success. Wiping data.");
            storageGB = originalStorageGB;
            System.out.println("SUCCESS: Storage restored to " + originalStorageGB + "GB.");
        } else {
            System.out.println("ACCESS DENIED: Incorrect PIN.");
        }
    }
}
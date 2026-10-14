public class User {
    public String username;
    public User(String username) {
        this.username = username;
    }
    public String getProfile() {
        return "User: " + username;
    }
}
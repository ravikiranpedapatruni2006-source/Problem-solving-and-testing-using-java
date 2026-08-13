import java.util.*;

public class SecureAuthenticationStress {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Valid username-password combinations
        Map<String, String> users = new HashMap<>();
        users.put("admin", "admin123");

        for (int i = 0; i < n; i++) {
            String username = sc.next();
            String password = sc.next();

            if (validate(username, password, users)) {
                System.out.println("SUCCESS");
            } else {
                System.out.println("FAILURE");
            }
        }

        sc.close();
    }

    static boolean validate(String username, String password,
                            Map<String, String> users) {

        // Boundary value validation
        if (username.length() < 3 || username.length() > 20) {
            return false;
        }

        if (password.length() < 6 || password.length() > 20) {
            return false;
        }

        // Authentication
        return users.containsKey(username)
                && users.get(username).equals(password);
    }
}

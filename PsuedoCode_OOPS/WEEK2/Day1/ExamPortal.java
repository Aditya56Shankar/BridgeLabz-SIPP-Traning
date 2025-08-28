// Base Class
class User {
    protected String username;
    protected String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean login() {
        // Base login (just username/password check)
        System.out.println("Validating user credentials...");
        return true;
    }
}

// Student Subclass
class Student extends User {
    private boolean enrolled;

    public Student(String username, String password, boolean enrolled) {
        super(username, password);
        this.enrolled = enrolled;
    }

    @Override
    public boolean login() {
        if(super.login() && enrolled) {
            System.out.println("Student " + username + " logged in successfully!");
            return true;
        } else {
            System.out.println("Student login failed: not enrolled.");
            return false;
        }
    }
}

// Admin Subclass
class Admin extends User {
    private boolean hasPrivileges;

    public Admin(String username, String password, boolean hasPrivileges) {
        super(username, password);
        this.hasPrivileges = hasPrivileges;
    }

    @Override
    public boolean login() {
        if(super.login() && hasPrivileges) {
            System.out.println("Admin " + username + " logged in with management tools!");
            return true;
        } else {
            System.out.println("Admin login failed: insufficient privileges.");
            return false;
        }
    }
}

// Example Run
public class ExamPortal {
    public static void main(String[] args) {
        User s1 = new Student("john123", "pass123", true);
        s1.login();

        User a1 = new Admin("admin01", "adminpass", true);
        a1.login();
    }
}

import java.util.*;

abstract class JobRole {
    String roleName;
    JobRole(String roleName) { this.roleName = roleName; }
    public String toString() { return roleName; }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() { super("Software Engineer"); }
}

class Resume<T extends JobRole> {
    private T role;
    Resume(T role) { this.role = role; }
    public T getRole() { return role; }
}

public class ResumeScreeningSystem {
    public static void displayRoles(List<? extends JobRole> roles) {
        for (JobRole role : roles)
            System.out.println(role);
    }

    public static void main(String[] args) {
        List<JobRole> roleList = new ArrayList<>();
        roleList.add(new SoftwareEngineer());
        displayRoles(roleList);
    }
}
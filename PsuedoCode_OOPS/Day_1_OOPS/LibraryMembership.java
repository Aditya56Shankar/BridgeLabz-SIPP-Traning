import java.time.LocalDate;

public class LibraryMembership {
    private String name;
    private String memberId;
    private LocalDate membershipDate;
    private LocalDate expiryDate;

    // Constructor
    public LibraryMembership(String name, String memberId, LocalDate membershipDate, LocalDate expiryDate) {
        this.name = name;
        this.memberId = memberId;
        this.membershipDate = membershipDate;
        this.expiryDate = expiryDate;
    }

    // Method to check membership validity
    public boolean isMembershipValid(LocalDate currentDate) {
        return !currentDate.isAfter(expiryDate);  // valid if currentDate <= expiryDate
    }

    // Optional: Getters
    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public LocalDate getMembershipDate() {
        return membershipDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }
}

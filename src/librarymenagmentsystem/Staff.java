import java.util.List;

public class Staff extends Person {
    public Staff(String userId, String name, String email) {
        super(userId, name, email);
    }

    @Override
    public boolean borrow(ILibraryItem item) {
        // Custom borrowing rules for staff can be added here.
        return false;
    }

    @Override
    public boolean returnItem(ILibraryItem item) {
        // Returning logic for staff can be added here.
        return false;
    }
}

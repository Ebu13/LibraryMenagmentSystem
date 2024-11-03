import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<ILibraryItem> borrowedItems;

    public Student(String userId, String name, String email) {
        super(userId, name, email);
        borrowedItems = new ArrayList<>();
    }

    @Override
    public boolean borrow(ILibraryItem item) {
        if (item.isAvailable()) {
            borrowedItems.add(item);
            item.setAvailable(false);
            return true;
        }
        return false;
    }

    @Override
    public boolean returnItem(ILibraryItem item) {
        if (borrowedItems.contains(item)) {
            borrowedItems.remove(item);
            item.setAvailable(true);
            return true;
        }
        return false;
    }
}

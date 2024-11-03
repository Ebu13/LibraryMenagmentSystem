import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<ILibraryItem> items;
    private List<IUser> users;

    public Library() {
        items = new ArrayList<>();
        users = new ArrayList<>();
    }

    public void addItem(ILibraryItem item) {
        items.add(item);
    }

    public void addUser(IUser user) {
        users.add(user);
    }

    public ILibraryItem findItem(String id) {
        for (ILibraryItem item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public IUser findUser(String id) {
        for (IUser user : users) {
            if (user.getUserId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public boolean borrow(String userId, String itemId) {
        IUser user = findUser(userId);
        ILibraryItem item = findItem(itemId);
        if (user != null && item != null) {
            return user.borrow(item);
        }
        return false;
    }

    public boolean returnItem(String userId, String itemId) {
        IUser user = findUser(userId);
        ILibraryItem item = findItem(itemId);
        if (user != null && item != null) {
            return user.returnItem(item);
        }
        return false;
    }
}

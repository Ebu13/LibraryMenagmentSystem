public interface IUser {

    String getUserId();
    String getName();
    String getEmail();
    boolean borrow(ILibraryItem item);
    boolean returnItem(ILibraryItem item);
    
}

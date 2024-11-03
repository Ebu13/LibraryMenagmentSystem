public interface ILibraryItem {
    String getId();
    String getTitle();
    boolean isAvailable();
    public void setAvailable(boolean available);
}

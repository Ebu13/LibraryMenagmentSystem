public abstract class LibraryItem implements ILibraryItem {
    protected String id;
    protected String title;
    protected boolean available;

    public LibraryItem(String id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }
}

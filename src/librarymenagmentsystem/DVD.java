public class DVD extends LibraryItem {
    private String director;

    public DVD(String id, String title, String director) {
        super(id, title);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }
}

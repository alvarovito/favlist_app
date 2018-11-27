package app.favlist.favlist;

public class ListItem {
    private String name;

    public ListItem() {
    }

    public ListItem(String listName) {
        this.name = listName;
    }

    public String getName(){
        return this.name;
    }
}

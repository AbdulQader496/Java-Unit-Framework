package framework.pages;

public enum MainPageNavigation {
    JAVASCRIPT_ALERT("JavaScript Alerts"),
    ADD_REMOVE_PAGE("Add/Remove Elements"),
    SORTABLE_DATA_TABLES("Sortable Data Tables"),
    DYNAMIC_CONTROLS("Dynamic Controls"),
    FILE_DOWNLOAD("File Download"),
    FILE_UPLOAD("File Upload"),
    BASIC_AUTH("Basic Auth");

    public final String label;

    private MainPageNavigation(String label) {
        this.label = label;
    }
}

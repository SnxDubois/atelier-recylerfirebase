package fr.wildcodeschool.atelierfirebaselist;

public class Sport {

    private String name;
    private boolean group;
    private boolean outdoor;

    public Sport(String name, boolean group, boolean outdoor) {
        this.name = name;
        this.group = group;
        this.outdoor = outdoor;
    }

    public Sport() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public boolean isOutdoor() {
        return outdoor;
    }

    public void setOutdoor(boolean outdoor) {
        this.outdoor = outdoor;
    }
}

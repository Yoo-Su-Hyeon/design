package hw.ch11;

import java.util.List;

public abstract class Entry {
    private Entry parent;

    public abstract String getName();
    public abstract int getSize();
    public abstract List<Entry> search(String keyword);

    public void setParent(Entry parent) {
        this.parent = parent;
    }

    public String getFullName() {
        if (parent == null) {
            return "/" + getName();
        }
        return parent.getFullName() + "/" + getName();
    }

    public void printList() {
        printList("");
    }

    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + " (" + getSize() + ")";
    }
}
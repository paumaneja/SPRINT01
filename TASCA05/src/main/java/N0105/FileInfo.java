package N0105;

import java.io.Serializable;
import java.util.Date;

public class FileInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private boolean isDirectory;
    private Date lastModified;

    public FileInfo(String name, boolean isDirectory, Date lastModified) {
        this.name = name;
        this.isDirectory = isDirectory;
        this.lastModified = lastModified;
    }

    public String getName() {
        return name;
    }

    public boolean isDirectory() {
        return isDirectory;
    }

    public Date getLastModified() {
        return lastModified;
    }

    @Override
    public String toString() {
        return name + " (" + (isDirectory ? "D" : "F") + ") - Last Modified: " + lastModified;
    }
}

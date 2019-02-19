package song;

public class Song {
    private String name;
    private int recordLenght;

    public Song(String name, int recordLenght) {
        this.name = name;
        this.recordLenght = recordLenght;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRecordLenght() {
        return recordLenght;
    }

    public void setRecordLenght(int recordLenght) {
        this.recordLenght = recordLenght;
    }
}

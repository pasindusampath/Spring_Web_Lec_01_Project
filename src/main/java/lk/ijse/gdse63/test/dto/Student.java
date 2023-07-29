package lk.ijse.gdse63.test.dto;

public class Student {
    private int id;
    private String name;
    private int prfMark;
    private int dbmMark;

    public Student(int id, String name, int prfMark, int dbmMark) {
        this.id = id;
        this.name = name;
        this.prfMark = prfMark;
        this.dbmMark = dbmMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrfMark() {
        return prfMark;
    }

    public void setPrfMark(int prfMark) {
        this.prfMark = prfMark;
    }

    public int getDbmMark() {
        return dbmMark;
    }

    public void setDbmMark(int dbmMark) {
        this.dbmMark = dbmMark;
    }
}

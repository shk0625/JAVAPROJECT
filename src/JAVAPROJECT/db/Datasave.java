package JAVAPROJECT.db;

import java.util.Date;

public class Datasave {
    private String korwords;
    private int day;

    public Datasave(int day, String korwords) {
    }

    public String getWords() {
        return korwords;
    }

    public void setWords(String words) {
        this.korwords = words;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}

package ug.edu.pl.domain;

public class Book {
    private int id;
    private String title;
    private String publishing;
    private int dd;
    private int mm;
    private int yyyy;
    private int author_id;
    public Book(int id, String t, String p, int dd, int mm, int yyyy, int idA){
        this.id=id;
        this.title=t;
        this.publishing=p;
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy;
        this.author_id=idA;

    }
    public Book(String t, String p, int dd, int mm, int yyyy, int idA){
        this.title=t;
        this.publishing=p;
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy;
        this.author_id=idA;
    }
    public Book(String t, String p, int dd, int mm, int yyyy){
        this.title=t;
        this.publishing=p;
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy;
    }
    private String ddToDay(){

        if(this.dd<10) return "0"+dd;
        return Integer.toString(dd);
    }
    private String mmToMonth(){
        if(this.mm<10) return "0"+mm;
        return Integer.toString(mm);
    }

    public String getDate(){
        return this.yyyy+"-"+this.mmToMonth()+"-"+this.ddToDay();
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public int getDd() {
        return dd;
    }

    public void setDd(int dd) {
        this.dd = dd;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getYyyy() {
        return yyyy;
    }

    public void setYyyy(int yyyy) {
        this.yyyy = yyyy;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", publishing='" + publishing + '\'' +
                ", dd=" + dd +
                ", mm=" + mm +
                ", yyyy=" + yyyy +
                ", author_id=" + author_id +
                '}';
    }
}

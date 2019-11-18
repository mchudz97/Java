package ug.edu.pl.domain;

public class Author {
    private int id;
    private String name;
    private String pername;
    private int dd;
    private int mm;
    private int yyyy;
    public Author(int id,String n, String p, int dd, int mm, int yyyy){
        this.id=id;
        this.name=n;
        this.pername=p;
        this.dd=dd;
        this.mm=mm;
        this.yyyy=yyyy;
    }
    public Author(String n, String p, int dd, int mm, int yyyy){
        this.name=n;
        this.pername=p;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPername() {
        return pername;
    }

    public void setPername(String pername) {
        this.pername = pername;
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

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pername='" + pername + '\'' +
                ", dd=" + dd +
                ", mm=" + mm +
                ", yyyy=" + yyyy +
                '}';
    }
}

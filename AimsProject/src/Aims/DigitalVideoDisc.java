package Aims;

public class DigitalVideoDisc {


    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

 
    private static int nbDigitalVideoDisc = 0;


    private int id;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }


    public DigitalVideoDisc(String title) {
        this.title = title;

    
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;

     
        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;

        nbDigitalVideoDisc++;
        this.id = nbDigitalVideoDisc;
    }

    // toString() method for displaying DVD information
    @Override
    public String toString() {
        return "DigitalVideoDisc{" +
                "ID=" + id +
                ", Title='" + title + '\'' +
                ", Category='" + category + '\'' +
                ", Director='" + director + '\'' +
                ", Length=" + length +
                ", Cost=" + cost +
                '}';
    }

    
    public void setTitle(String title2) {
        this.title = title2;
    }


    public static int getNbDigitalVideoDisc() {
        return nbDigitalVideoDisc;
    }
}

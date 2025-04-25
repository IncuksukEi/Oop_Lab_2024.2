package hust.soict.hedspi.aims.media;

public class DigitalVideoDisc extends Disc implements Playable {
    private static int nbDigitalVideoDiscs = 0;

    public DigitalVideoDisc(String title) {
        super(++nbDigitalVideoDiscs, title, null, 0, null, 0);
    }

    public DigitalVideoDisc(String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, null, 0);
    }

    public DigitalVideoDisc(String director, String category, String title, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, 0);
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        super(++nbDigitalVideoDiscs, title, category, cost, director, length);
    }

    public void printDetail() {
        System.out.println("DVD - " + getTitle() + " - " + getCategory() + " - " + getDirector() + " - " + getLength() + ": " + getCost() + " $");
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }

    public String getTitle(){
        return this.title;
    }
    public String getCategories(){
        return this.categories;
    }
    public String getDirector(){
        return this.director;
    }
    public int getLength(){
        return this.length;
    }
    public float getCost(){
        return this.cost;
    }
    public  void setTitle(String title){
        this.title = title;
    }
    public void setCategories(String categories){
        this.categories = categories;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public void setLength(int length){
        this.length = length;
    }
    public void setCost(float cost){
        this.cost = cost;
    }
    public int getId() {
        return this.id;
    }
    @Override
    public String toString(){
        return ("DVD - "+this.title+" - "+this.categories+" - "+this.director+" - "+this.length +" - "+this.cost+"$");
    }
    public boolean isMatch(String title){
        if (this.title.equals(title)){
            return true;
        }
        return false;
    }
}

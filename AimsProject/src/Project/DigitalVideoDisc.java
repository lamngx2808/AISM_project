package Project;

public class DigitalVideoDisc {
	private String title;
	public String getTitle() {
		return title;
	}
	private String category;
	private String director;
	private int length;
	private float cost; 
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}
	public static int getNbDigitalVideoDiscs() {
		return nbDigitalVideoDiscs;
	}
	public static void setNbDigitalVideoDiscs(int nbDigitalVideoDiscs) {
		DigitalVideoDisc.nbDigitalVideoDiscs = nbDigitalVideoDiscs;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public DigitalVideoDisc(String title,String category, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.cost=cost;
	}
	public DigitalVideoDisc(String title, String category, String director,int length, float cost) {
		super();
		this.title=title;
		this.category=category;
		this.director=director;
		this.length=length;
		this.cost=cost;
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
	private static int nbDigitalVideoDiscs = 0;
	private int id;
	@Override
    public boolean equals(Object obj){
        DigitalVideoDisc disc = (DigitalVideoDisc)obj;
        return this.title.equals(disc.title) && this.category.equals(disc.category)
                && this.director.equals(disc.director) && this.length == disc.length
                && this.cost == disc.cost;
    
	}
}

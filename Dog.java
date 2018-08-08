

public class Dog {
	private String color;
	private String name;
	private String breed;
	private int hungry;
	private int energy;
	
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public int getHungry() {
		return hungry;
	}

	public int getEnergy() {
		return energy;
	}

	public Dog(String color, String name,String breed, int hungry, int energy){
		this.color = color;
		this.name = name;
		this.breed = breed;
		this.hungry = hungry;
		this.energy = energy;	
	}
	
	public void sleep(){
		hungry++;
		energy++;
	}
	
	public void eat(){
		hungry--;
		energy++;
	}
	
	private void  bark(){
		System.out.println("Bow Wow \n" );
	}
	
	public String toString(){
		return(name + "\n" + breed + "\n" + color + "\n"+ hungry + "\n" + energy + "\n");
	}
	

}

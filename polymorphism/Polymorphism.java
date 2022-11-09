package polymorphism;

class Animal{
	private String name;

	public Animal(String name) {// contructor ekle
		super();
		this.name = name;
	}

	public String getName() {// getter setter ekle
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void Speak(){// bir tane metot tanımladık
		System.out.println("Hayvan konusuyor");
	}
}
class Bird extends Animal{

	public Bird(String name) {
		super(name);
		
	}

	@Override
	public void Speak() {// animaldaki metodu overidde ettik 
		System.out.println(getName()+" ötüyor");
		
	}
	
	
}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
		
	}

	@Override
	public void Speak() {
		System.out.println(getName()+" havlıyor");
		
	}
	
	
}
class Horse extends Animal{

	public Horse(String name) {
		super(name);
		
	}

	@Override
	public void Speak() {
		System.out.println(getName()+" kişniyor");
		
	}
	
	
}
public class Polymorphism{

	public static void Speaktry(Animal animal){// sadece bu metodla hangi hayvanoı cagırtırsan cagırt ona gore calısır
		animal.Speak();
	}
	public static void main(String[]args){
		Animal animal=new Animal("hayvan");
		Bird bird=new Bird("limon");
		Dog dog =new Dog("Karabaş");
		Horse horse =new Horse("Şahin");
		
		/*animal.Speak();
		bird.Speak();
		dog.Speak();
		horse.Speak();*/
		
		//Animal animal2=new Bird("limon");// buraya hangi hayvanı yazarsak o calısıyor.Bird dog horse falan
		//animal2.Speak();
		
		Speaktry(new Dog("Ateş"));// yukarıya kac tane class eklersen ekle sadece burayı degiştirmen yeterli oluyor 
	}
}

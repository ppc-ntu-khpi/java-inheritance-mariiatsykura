package domain;

public class Tiger extends Predator {

    public String kind;

    public Tiger(String name, int weight, int height, String color, String Category, String kind) {
        this.name=name;
        this.weight=weight;
        this.height=height;
        this.color=color;
        this.Category=Category;
        this.kind=kind;
    }

    public Tiger() {
        this("Zoe", 250, 180, "white", "Cat family", "Bengal tiger" );
    }
    
    public Tiger (String name) {
    this(name, 250, 180, "white", "Cat family", "Bengal tiger" );}
    
    public void eat() {
        System.out.println("Tiger eats meat");
    }
    public void drink() {
        System.out.println("Tiger drinks water");
    }
public void sleep() {
    System.out.println("Tiger sleeps 17 hours a day");
    }

public void talk() {
    System.out.println("RrrrRRRrrr");
    }

public String toString() {
    return super.toString()+"\nkind: \t"+this.kind+"\n\nThis is a Bengal tiger!";
    }

    public void run() {
        System.out.println("Tiger runs at a speed of 60 km/h");
    }

    public void roar() {
        System.out.println("The roar of a tiger can be heard up to 1.5 km away");
    }

    public void climb() {
        System.out.println("Sharp claws make it possible to climb trees");
    }
    
    public void hunt() {
        System.out.println("Tiger hunts almost all kinds of animals");
    }
    
    public void territoryProtection() {
        System.out.println("The territory is assigned to the tiger with odorous marks, scratches in the ground and on trees.");
    }
    }


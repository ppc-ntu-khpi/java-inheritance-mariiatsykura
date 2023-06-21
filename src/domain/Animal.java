package domain;

public class Animal {

    protected String name;

    protected int weight;

    protected int height;

    protected String color;

    protected String Category;

    public Animal() {
        name="generic animal";
        weight=25;
    }

    public void eat() {
        System.out.println("Animal eats..."); 
    }

    public void drink() {
        System.out.println("Animal drinks");
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }

    public void talk() {
        System.out.println("Animal talks...");
    }

    @Override
    public String toString() {
        return "Animal: " + "\nname:\t " + name + "\nweight: \t" + weight + "kg " + "\nheight: \t" + height + "\ncolor: \t" + color + "\nCategory: \t" + Category;
    } }

    

/**
 * Created by parde on 5/10/2017.
 */
public class Book {

    private String name;
    private float price;

    public Book(String name, float price) {
        this.name = name;
        this.price = price;
    }

    // Getters
    public String getName() {
        return name;
    }
    public float getPrice() {
        return price;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public void print() {
        System.out.println("The book name is: " + getName() + " and price is: " + getPrice());
    }
}

package companies;

import interfaces.Phone;

public class Apple implements Phone {
    private String capacity;
    private String color;
    private double price;
    private String model;

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCapacity() {
        return this.capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Constructor implicit
    public Apple() { }

    // Constructor explicit
    public Apple(String capacity, String color, double price, String model) {
        this.capacity = capacity;
        this.color = color;
        this.price = price;
        this.model = model;
    }

    // Metoda pentru clonarea unui telefon Apple
    public Phone makeClone() throws CloneNotSupportedException {
        //System.out.println("I will clone an Apple phone");
        // Cream un obiect nou ce va pastra clona obiectului dorit
        Apple clone = new Apple();

        try {
        	// Apelam metoda clone() ce va intoarce o copie a obiectului ce o apeleaza
        	// Apple implements Phone -> Phone extends Cloneable
        	// In instanta curenta se va clona un telefon Apple
        	clone = (Apple)super.clone();
        } catch (CloneNotSupportedException exception) {
            System.out.println("I could not make a copy of an Apple phone, Error: " + exception.getMessage());
            exception.printStackTrace();
        }
        // Returnam clona creata
        return clone;
    }

    // Metoda pentru afisarea datelor unui obiect Apple
    public String toString() {
        return "Apple [Capacity = " + this.capacity + ", Color = " + this.color + ", Price = " + this.price + ", Model = " + this.model + "]";
    }
}
package companies;

import interfaces.Phone;

public class Samsung implements Phone {
	private String capacity;
    private String color;
    private double price;
    private String model;
    
    // Constructor implicit
    public Samsung() { }

    // Constructor explicit
    public Samsung(String capacity, String color, double price, String model) {
        this.capacity = capacity;
        this.color = color;
        this.price = price;
        this.model = model;
    }

    // Metoda pentru clonarea unui telefon Samsung
    public Phone makeClone() throws CloneNotSupportedException {
    	//System.out.println("I will clone a Samsung phone");
        // Cream un obiect nou ce va pastra clona obiectului dorit
    	Samsung clone = new Samsung();

        try {
        	// Apelam metoda clone() ce va intoarce o copie a obiectului ce o apeleaza
        	// Samsung implements Phone -> Phone extends Cloneable
        	// In instanta curenta se va clona un telefon Samsung
        	clone = (Samsung)super.clone();
        } catch (CloneNotSupportedException exception) {
            System.out.println("I could not make a copy of a Samsung phone, Error: " + exception.getMessage());
            exception.printStackTrace();
        }

        // Returnam clona creata
        return clone;
    }
    
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
    
    // Metoda pentru afisarea datelor unui obiect Samsung
    public String toString() {
        return "Samsung [Capacity = " + this.capacity + ", Color = " + this.color + ", Price = " + this.price + ", Model = " + this.model + "]";
    }
}
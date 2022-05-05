package companies;

import interfaces.Phone;

	/**
	 * Samsung represents one of the company from our factory
	 * 
	 * @author Mihaela 
	 *
	 */
public class Samsung implements Phone {
	private String capacity;
    private String color;
    private double price;
    private String model;
    
    // Constructor implicit
    public Samsung() { }

    /**
     * Constructs and initializes the characteristics for a Samsung product
     * @param capacity 
     * a characteristic of a Samsung product
     * @param color 
     * a characteristic of a Samsung product
     * @param price 
     * a characteristic of a Samsung product
     * @param model 
     * a characteristic of a Samsung product
     */
    // Constructor explicit
    public Samsung(String capacity, String color, double price, String model) {
        this.capacity = capacity;
        this.color = color;
        this.price = price;
        this.model = model;
    }

    /**
     * Cloning a Samsung product
     */
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
    
    /**
     * Display the info about a Samsung product
     */
    // Metoda pentru afisarea datelor unui obiect Samsung
    public String toString() {
        return "Samsung [Capacity = " + this.capacity + ", Color = " + this.color + ", Price = " + this.price + ", Model = " + this.model + "]";
    }
}
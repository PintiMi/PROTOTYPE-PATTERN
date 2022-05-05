package factory;

import interfaces.Phone;
import java.util.ArrayList;
/**
 * PhoneFactory represents our factory
 * 
 * @author Mihaela
 *
 */
public class PhoneFactory {
	// Atribut pentru pastrarea evidentei telefoanelor clonate
    public ArrayList<Phone> clonedPhonesList = new ArrayList<Phone>();

    // Metoda getter pentru a prelua lista de telefoane clonate
    public ArrayList<Phone> getClonedPhonesList() {
        return this.clonedPhonesList;
    }

    // Metoda setter pentru a seta lista de telefoane clonate dintr-o alta lista
    public void setClonedPhonesList(ArrayList<Phone> clonedPhonesList) {
        this.clonedPhonesList = clonedPhonesList;
    }
    
    public PhoneFactory() { }

    /**
     * Cloning an Apple product or a Samsung product from Apple and Samsung class
     * @param phone 
     * the Apple or Samsung product
     * @return
     * @throws CloneNotSupportedException
     */
    // Metoda pentru clonarea unui telefon ce apeleaza metoda makeClone() implementata
    // in clasa fiecarei companii de telefoane mobile (Apple, Samsung etc.)
    public Phone CreateClone(Phone phone) throws CloneNotSupportedException {
    	// metoda makeClone() returneaza copia instantei ce o apeleaza
        Phone phoneCopy = phone.makeClone();
        System.out.println("I made a copy of: " + phone.toString());
        return phoneCopy;
    }

    /**
     * Adding the product after it has been cloned in the factory list of the cloned products
     * @param clonedPhone 
     * the clone of the products
     */
    // Metoda pentru adaugarea unui telefon clonat in lista de telefoane clonate
    public void AddCloneToFactory(Phone clonedPhone) {
        System.out.println("Added cloned phone to list: " + clonedPhone.toString());
        this.clonedPhonesList.add(clonedPhone);
    }

    /**
     * Display the list of cloned products 
     */
    // Metoda pentru afisarea listei de telefoane clonate
    public void PrintClonedPhones() {
    	System.out.println("List of cloned phones:");
        for(int i = 0; i < this.clonedPhonesList.size(); ++i) {
            System.out.println(i + 1 + ". " + this.clonedPhonesList.get(i));
        }
    }
}
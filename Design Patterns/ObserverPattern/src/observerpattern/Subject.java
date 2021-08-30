/*
Eita holo Subject interface. Object ra eita use kore observer hishebe nijeke register kore ebong eta use kore observer theke 
remove o hoye jay
 */
package observerpattern;

/**
 *
 * @author User
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
    /*
    this method calls the update method of each observers that are registered to update the informations
    */
    
    
}

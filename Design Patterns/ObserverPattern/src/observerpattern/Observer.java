/* 
All potential Observers need to implement the observer interface.this interface just has one method, update(), 
that gets called when the subject's state changes
*/
package observerpattern;

/**
 *
 * @author User
 */
public interface Observer {
    public void update(int temp, int humidity);

}

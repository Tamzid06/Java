/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern;

public abstract class CoffeeDecorator extends Coffee{
    //ekhane amra boltesi je Coffee class er getdescription() ta must ekhane override korte hobe
    public abstract String getDescription();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata11;

import java.util.Date;

/**
 *
 * @author Naz
 */
public class Kata11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Blas",new Date(49,8,24));
        System.out.println(person.getName()+" tiene " + person.getAge());
                
    }
    
}

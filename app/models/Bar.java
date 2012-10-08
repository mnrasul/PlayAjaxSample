/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.persistence.Entity;
import play.db.jpa.JPABase;
import play.db.jpa.Model;

/**
 *
 * @author Nasir
 */
@Entity
public class Bar extends Model{
    public String name;
    
    public static void delete(long id){
        Bar bar = Bar.findById(id);
        bar.delete();
    }
}

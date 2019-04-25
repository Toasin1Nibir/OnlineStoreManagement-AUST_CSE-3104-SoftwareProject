/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinestore;

/**
 *
 * @author Simanta
 */
public class DepartmentGS {
    String dept_name, dept_id;
    int total;
    public DepartmentGS( String id, String name, int total ) {
        dept_id = id;
        dept_name = name;
        this.total = total;
    }

    public String getDept_name() {
        return dept_name;
    }

    public String getDept_id() {
        return dept_id;
    }

    public int getTotal() {
        return total;
    }

   
    
    
}

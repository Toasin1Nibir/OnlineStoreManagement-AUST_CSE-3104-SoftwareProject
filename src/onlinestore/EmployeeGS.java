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
public class EmployeeGS {
    int empid;
    String n, d, p, a,c,e;
    EmployeeGS(int empid, String name, String dept, String phone, String ad,String city,String email ) {
       this.empid = empid;
       n = name;
       d = dept;
       p = phone;
       a = ad;
       c = city;
       e = email;
    }

    public int getEmpid() {
        return empid;
    }

    public String getN() {
        return n;
    }

    public String getD() {
        return d;
    }

    public String getP() {
        return p;
    }

    public String getA() {
        return a;
    }

    public String getC() {
        return c;
    }

    public String getE() {
        return e;
    }
}

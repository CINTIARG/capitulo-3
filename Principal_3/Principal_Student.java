
package Principal_3;

import Cap_3.ShowStudent;
import Cap_3.Student;

public class Principal_Student {
   public static void main (String [] args){
     Student sn=new Student(23,2,20);
        ShowStudent std = new ShowStudent(sn);
        System.out.println(std.getStud());
   
    } 
}

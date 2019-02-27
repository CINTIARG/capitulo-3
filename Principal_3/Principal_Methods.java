
package Principal_3;

import Cap_3.ArithmeticMethods;
import Cap_3.ArithmeticMethods2;

public class Principal_Methods {
        public static void main(String []args){
        ArithmeticMethods am=new ArithmeticMethods();
        System.out.println(am.displayNumberPlus10());
        System.out.println(am.displayNumberPlus100());
        System.out.println(am.displayNumberPlus1000());

        ArithmeticMethods2 am2=new ArithmeticMethods2(1,2);
        System.out.println(am2.displayNumberPlus10());
        System.out.println(am2.displayNumberPlus100());
        System.out.println(am2.displayNumberPlus1000());

}
}

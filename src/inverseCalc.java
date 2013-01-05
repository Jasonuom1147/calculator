/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author toshiba
 */
public class inverseCalc {
        public static int[] EuclidiosEktet(int a, int b){ 
     int[] apot = new int[3];
     int yp;

     if (b == 0)  {  
         apot[0] = a;
         apot[1] = 1;
         apot[2] = 0;
     }
     else
         {   
            yp = a/b;
            apot = EuclidiosEktet(b, a % b);
            int temp = apot[1] - apot[2]*yp;
            apot[1] = apot[2];
            apot[2] = temp;
         }
     return apot;
    }
}

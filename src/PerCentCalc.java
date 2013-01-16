/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class PerCentCalc extends MyCalc{
    public double numberper(double first,double second){
        double res;
        double flag;
        flag=(100+second)/100;
        res=first*flag;
        return res; //return percentage calculation of the first number
    }
    
}

/*
 * By:     Matthew Fischer
 * Date:   
 */
package calculator;

/**
 *
 * @author Matthew Fischer
 */
public class Number {
    public Double num;
    
    public Number(String n){
        num = Double.parseDouble(n);
    }
    
    
    
    // return string
    public String toString(){
        return Double.toString(num);
    }
}

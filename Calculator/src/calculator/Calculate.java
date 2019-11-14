/*
 * By:     Matthew Fischer
 * Date:   
 */
package calculator;

public class Calculate {
    public double answer;
    
    Number num1;
    Number num2;
    
    char sign;
        
    public Calculate(String n1, String n2,char s){
        num1 = new Number(n1);
        num2 = new Number(n2);
        sign = s;
    }
    
    // method
           
    // calc
    public void getAnswer(){
        switch(sign){
            case '*':
                answer = num1.num * num2.num;
                break;
            case '/':
                answer = num1.num / num2.num;
                break;
            case '-':
                answer = num1.num - num2.num;
                break;
            case '+':
                answer = num1.num + num2.num;
                break;
        }
       
    }
    
    
    // toString
    public String toString(){

        return Double.toString(answer);
    }
    
    
    
    
}

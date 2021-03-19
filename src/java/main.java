
import com.kimson.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thinkpro
 */
public class main {

    public static void main(String[] args) {
//        System.out.println("Hello bro");
        //TEST TRẦU BÒ
        
        long expected = 120;//kì vọng hàm tính giai thừa trả lại 120 khi giá trị đưa vào là 5
        long actual;
        int input = 5;
        actual=MathUtility.getFactorial(input);//check giá trị trả về
        System.out.println("5! Expected "+expected+" Actual "+actual);
        //một test case, một test case
        
        //case 2 0! thì sao??
        expected=1;
        input=0;
        actual=MathUtility.getFactorial(input);
        System.out.println("0! Expected "+expected+" Actual "+actual);
        //case 3 2!
        expected=2;
        input=2;
        actual=MathUtility.getFactorial(input);
        System.out.println("2! Expected "+expected+" Actual "+actual);
        //case 4 -1!
        
        input=-1;
        actual=MathUtility.getFactorial(input);
//        System.out.println("-1! Expected "+expected+" Actual "+actual); không in được ngoại lệ

        //TEST AUTOMATION DÙNG THƯ VIỆN
        
        
    }
}

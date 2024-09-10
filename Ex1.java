import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// Below of the attributes you will see the main method
public class Ex1 {

    int num;

    public Ex1() {
        
    }
    public Ex1(int num) {
        this.num = num;    
    }
    
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
    public void showResult() {
        List<Integer> nums = new ArrayList<Integer>();
        boolean result = false;
        String msg;

        for(int i = 0; i <= num; i++) {
            if(i == 0) {
                nums.add(i);
            }
            if(i == 1 || i == 2) {
                nums.add(1);
            }
            if(i > 2){
                int n = nums.get(i-2) + nums.get(i-1);
                nums.add(n);
            }
            if(nums.get(i) >= num) {
                if(nums.get(i) == num) {
                    result = true;
                }
                break;
            }
        }
        if(result == true) {
            msg = "YES. It's an element of the sequence!";
        } else {
            msg = "It's NOT an element of the sequence.";
        }
        System.out.printf("CHECKED: %s\nNUMBER: %d\nIs this number an element of Fibonacci sequence? \n%s",nums,num,msg);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex1 obj = new Ex1();

        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        obj.setNum(input);
        obj.showResult();
        sc.close();
    }


}
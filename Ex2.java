import java.util.Scanner;
// Below of the attributes you will see the main method
public class Ex2 {

    private String text;

    public Ex2() {
    }

    public Ex2(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void checking(char ch) {
        String x = String.valueOf(ch).toUpperCase();
        String y = String.valueOf(ch).toLowerCase();
        int n = 0;

        if(text.contains(x) || text.contains(y)) {
            if (Character.isUpperCase(ch)) {
                text = text.toUpperCase();
            } else if (Character.isLowerCase(ch)) {
                text = text.toLowerCase();
            }
            
            System.out.print("It contains and repeat: ");
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == ch) {
                    n++;
                }
            }
            System.out.print(n + " time's.");
        }else {
            System.out.printf("Have not '%s' or '%s' in our %sString%s.", x, y, "\"", "\"");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ex2 strCheck = new Ex2();

        System.out.printf("Enter a %sString%s (a random text): ","\"","\"");
        String text = sc.nextLine();
        System.out.println("Now, enter a character which have appeared in your before 'String': \n");
        char ch = sc.nextLine().charAt(0);
        strCheck.setText(text);
        strCheck.checking(ch);

        sc.close();
    }
}

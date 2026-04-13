import java.util.Scanner;

public class Test {
    public static void main(String[] args)  throws Exception{
        Scanner scanner =  new Scanner(System.in);

        System.out.println("사칙연산을 골라주세요(+,-,*,/):  ");
        String op = scanner.nextLine();
        
        System.out.print("x 값 입력: ");
        String strX = scanner.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y 값 입력: ");
        String strY = scanner.nextLine();
        int y = Integer.parseInt(strY);

        int result = 0;

        switch(op){
            case "+":
            result = x+y;
            System.out.println("x+y: "+result);
            break;

            case "-":
            result = x-y;
            System.out.println("x-y: "+result);
            break;

            case "*":
            result = x*y;
            System.out.println("x*y: "+result);
            break;

            case "/":
            result = x/y;
            System.out.println("x/y: "+result);
            break;
        }
    }
    }

    


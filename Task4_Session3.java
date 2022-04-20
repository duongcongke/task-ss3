public class Task4_Session3 {public class Ex10_Greeting {
    public static void main(String[] args) {
        String day = "Monday";
        String hour = "am";
        switch (day){
            case "Sunday":
                System.out.println("Sunday is a Holiday ...");
                switch (hour){
                    case "am" :
                        System.out.println("Good Morning");
                        break;
                    case "pm" :
                        System.out.println("Good Evening");
                        break;
                }
                break;
            case "Monday":
                System.out.println("Monday is a Working Day...");
                switch (hour) {
                    case "am":
                        System.out.println("Good Morning");
                        break;
                    case "pm":
                        System.out.println("Good Evening");
                        break;
                }
                break;
            default:
                System.out.println("InvalidDay");
        }
    }
}

}
public class Ex11_PrintMultiplesWhileLoop {
    public static void main(String[] args) {
        int num = 1;
        int product = 0;
        while (num<=5) {
            product = num * 10;
            System.out.printf("\n %d * 10 = %d", num, product);
            num++;
        }
        System.out.println("\nOutside the Loop");
    }
} public class Ex12_InfiniteWhileLoop {
    public static void main(String[] args) {
        while(true){
            System.out.println("Welcome to Loops...");
        }
    }
}public class Ex13_SumOfNumbers {
    public static void main(String[] args) {
        int num = 1, sum = 0;
        do{
            sum = sum + num;
            num++;
        }
        while (num<=10);
        System.out.printf("Sum of 10 Numbers: %d\n",sum);
    }
}public class Ex14_PrintMultiplesWithForLoop {
    public static void main(String[] args) {
        int num, product;
        for(num=1; num<=5; num++){
            product=num*10;
            System.out.printf("\n %d*10=%d",num, product);
        }
    }
}public class Ex15_ForLoopWithVariables {
    public static void main(String[] args) {
        int product;
        for(int num = 1; num <= 5; num++){
            product = num*10;
            System.out.printf("\n %d*10 = %d",num, product);
        }
    }
}public class Ex16_ForLoopWithComma {
    public static void main(String[] args) {
        int i,j;
        int max=10;
        for(i=0, j=max; i<=max;i++,j--){
            System.out.printf("\n%d + %d = %d",i ,j, i+j);
        }
    }
}public class Ex17_ForLoopWithNoIntialization {
    public static void main(String[] args) {
        int num = 1;
        boolean flag = false;
        for(; !flag; num++){
            System.out.println("Value of num: "+num);
            if(num==5){
                flag=true;
            }
        }
    }
}public class Ex19_DisplayPattern {
    public static void main(String[] args) {
        int row, col;
        for(row = 1; row<=5; row++){
            for(col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}public class Ex21_NumberRoot {
    public static void main(String[] args) {
        int count, square, cube;
        for(count=1; count<300;count++){
            if (count%3==0){
                continue;
            }
            square=count*count;
            cube=count*count*count;
            System.out.printf("\nSquare of %d is %d and Cube is %d",count,square,cube);
        }
    }
}public class Ex22_TestLabeledBreak {
    public static void main(String[] args) {
        int i;
        outer:
        for (i=0;i<5;i++){
            if(i==2){
                System.out.println("Hello");
                break outer;
            }
            System.out.println("This is the outer loop");
        }
        System.out.println("Good-Bye");
    }
}public class Ex23_NumberPyramid {
    public static void main(String[] args) {
        outer:
        for (int i=1; i<5; i++){
            for (int j=1;j<5;j++){
                if(j>i){
                    System.out.println();
                    continue outer;
                }
                System.out.print(j);
            }
            System.out.println("\nThis is the outer loop.");
        }
        System.out.println("Good-Bye");
    }
}public class Ex2_ModifiedIf {
    public static void main(String[] args) {
        int first=400, second=700, result;
        result = first + second;
        if(result>1000){
            second=second+100;
        }
        System.out.println("The value of second is "+second);
    }
}public class Ex3_Number_Division {
    public static void main(String[] args) {
        int number = 11, remainder;
        remainder = number%2;
        if(remainder == 0){
            System.out.println("Number is even");
        }
        else{
            System.out.println("Number is odd");
        }
    }
}import java.util.Scanner;
public class Ex4_NumberDivisiblility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Number");
        int num = input.nextInt();
        if (num%3 == 0){
            System.out.println("Inside Outer if Block");
            if(num%5 == 0){
                System.out.println("Number is divisible by 3 and 5");
            }else {
                System.out.println("Number is divisible by 3, but not by 5");
            }
        }else {
            System.out.println("Number is not divisible by 3");
        }

    }
}public class Ex5_CheckMarks {
    public static void main(String[] args) {
        int totalMarks=59;
        if(totalMarks>=90){
            System.out.println("Grade = A+");
        }else if(totalMarks>=60){
            System.out.println("Grade = A");
        }
        else if(totalMarks>=40){
            System.out.println("Grade = B");
        }
        else if(totalMarks>=30){
            System.out.println("Grade=C");
        }
        else {
            System.out.println("Fail");
        }
    }
}public class Ex6_TestNumbericOperation {
    public static void main(String[] args) {
        int choice = 3;
        switch (choice){
            case 1:
                System.out.println("Addition");
                break;
            case 2:
                System.out.println("Subtraction");
                break;
            case 3:
                System.out.println("Multiplication");
                break;
            case 4:
                System.out.println("Division");
                break;
            default:
                System.out.println("InvalidChoice");
        }

    }
}public class Ex7_NumberOfDays {
    public static void main(String[] args) {
        int month = 5;
        int year = 2001;
        int numDays = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (year%4 == 0){
                    numDays = 29;
                }else {
                    numDays = 28;
                }
                break;
            default:
                System.out.println("IncalidMonth");
        }
        System.out.println("Month: "+month);
        System.out.println("Number of Days: "+numDays);
    }
}public class Ex8_DayofWeek {
    public static void main(String[] args) {
        String day = "Monday";
        switch (day){
            case "Sunday":
                System.out.println("First day of the Week");
                break;
            case "Monday":
                System.out.println("Second Day of Week");
                break;
            case "Tuesday":
                System.out.println("Third day of the Week");
                break;
            case "Wednesday":
                System.out.println("Fourth Day of Week");
                break;
            case "Thursday":
                System.out.println("Fifth day of the Week");
                break;
            case "Friday":
                System.out.println("Sixth Day of Week");
                break;
            case "Saturday":
                System.out.println("Seventh day of the Week");
                break;
            default:
                System.out.println("Invalid Day");

        }
    }
}public class Ex9_TestSwitchEnumeration {
    enum Cards{
        Spade, Heart, Diamond, Club
    }

    public static void main(String[] args) {
        Cards card = Cards.Diamond;
        switch (card){
            case Spade:
                System.out.println("SPADE");
                break;
            case Heart:
                System.out.println("HEART");
                break;
            case Diamond:
                System.out.println("DIAMOND");
                break;
            case Club:
                System.out.println("CLUB");
                break;
        }
    }
}
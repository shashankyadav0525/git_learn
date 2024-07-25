import java.util.Scanner;


class use_of_switch_case
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
        System.out.println("enter your choise");
		int a = read.nextInt();
        System.out.println("In that number the day is:--->");
		switch(a) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
		}
        System.out.println("thank you:");
	}
   
}


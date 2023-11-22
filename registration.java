package daa;
import java.util.*;
import java.util.Random;
public class registration {
	static int year;
	static int num;
	static int marks;
	static String name;
	static int h,ds;
	static String add;
	static double fees;
	static String s;
	static int reg = 10000;
	static String c;
	static double dis;
	static double a;
	static double nm;
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name = ");
		name = sc.nextLine();
		System.out.print("Enter year = ");
		year = sc.nextInt();
		System.out.print("Enter your permanent address = ");
		sc.nextLine();
		add = sc.nextLine();
		switch(year)
		{
		case 1:
		{
			first();
			break;
		}
		case 2:
		{
			other();
			break;
		}
		case 3:
		{
			other();
			break;
		}
		case 4:
		{
			other();
			break;
		}
		}
	}	

	static void first() {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Entrance examination marks  = ");
		marks = sc.nextInt();
		if(marks>=800&&marks<=1000)
		{
			System.out.println("You can choose any of the following branches.");
			System.out.println("1. Computer Science & Engineering");
			System.out.println("2. Artificial Intelligence & Machine Learning. ");
			System.out.println("3. Information Science & Engineering ");
			System.out.println("4. Electronics and Communication Engineering.");
			System.out.println("5. Electrical and Electronics Engineering.");
			System.out.println("6. Mechanical Engineering.");
			System.out.print("Enter your choice = ");
			n = sc.nextInt();
			switch(n)
			{
			case 1:
			{
				fees = 100000 + reg;
				nm = 100000;
				s = "CSE";
				break;
			}
			case 2:
			{
				fees = 95000 + reg;
				nm = 95000;
				s = "AI-ML";
				break;
			}
			case 3:
			{
				fees = 90000 + reg;
				nm = 90000;
				s = "ISE";
				break;
			}
			case 4:
			{
				fees = 85000 + reg;
				nm = 85000;
				s = "ECE";
				break;
			}
			case 5:
			{
				fees = 70000 + reg;
				nm = 70000;
				s = "EEE";
				break;
			}
			case 6:
			{
				fees = 60000 + reg;
				nm = 60000;
				s = "ME";
				break;
			}
			}
		}
		else if(marks>=500&&marks<800)
		{
			System.out.println("1. Information Science & Engineering ");
			System.out.println("2. Electronics and Communication Engineering.");
			System.out.println("3. Electrical and Electronics Engineering.");
			System.out.println("4. Mechanical Engineering.");
			System.out.print("Enter your choice = ");
			n = sc.nextInt();
			switch(n)
			{
			case 1:
			{
				fees = 90000+reg;
				nm = 90000;
				s = "ISE";
				break;
			}
			case 2:
			{
				fees = 85000 + reg;
				nm = 85000;
				s = "ECE";
				break;
			}
			case 3:
			{
				fees = 70000 + reg;
				nm = 70000;
				s = "EEE";
				break;
			}
			case 4:
			{
				fees = 60000 + reg;
				nm = 60000;
				s = "ME";
				break;
			}
			}
		}
		else
		{
			System.out.println("1. Electrical and Electronics Engineering.");
			System.out.println("2. Mechanical Engineering.");
			System.out.print("Enter your choice = ");
			n = sc.nextInt();
			switch(n)
			{
			case 1:
			{
				fees = 70000 + reg;
				nm = 70000;
				s = "EEE";
				break;
			}
			case 2:
			{
				fees = 60000 + reg;
				nm = 60000;
				s = "ME";
				break;
			}
			}
		}
		discount();
		resident();
		receipt1();
	}
	static void other()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Course = ");
		c=sc.next();
		switch(c)
		{
		case "CSE":
			nm = 100000;
			fees+=100000;
			break;
		case "AI-ML":
			nm = 95000;
			fees+=95000;
			break;
		case "ISE":
			nm = 90000;
			fees+=90000;
			break;
		case "ECE":
			nm = 85000;
			fees+=85000;
			break;
		case "EEE":
			nm = 70000;
			fees+=70000;
			break;
		case "ME":
			nm = 60000;
			fees+=60000;
		}
		resident();
		receipt2();
	}
	static void discount()
	{
		if(marks>=950&&marks<=1000)
		{
			dis=(nm*0.3);
		}
		else if(marks>=900&&marks<950)
		{
			dis=nm*0.2;
		}
		else if(marks>=850&&marks<900)
		{
			dis=nm*0.1;
		}
		else
		{
			dis = 0.0;
		}
		fees-=dis;
	}
	public static void resident() {
		System.out.println("Choose");
		System.out.println("1. Hostel");
		System.out.println("2. Day scholar");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		switch(n) {
		case 1:fees=fees+80000;
		h+=80000;
		break;
		case 2:System.out.println("Do you want bus facility?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int m=sc.nextInt();
		switch(m) {
		case 1:System.out.print("Enter the residential address = ");
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println("Enter the distance of your address from the college");
		int k=sc.nextInt();
		if(k<=10)
		{
			fees=fees+15000;
			ds+=15000;
		}
		else if(k>=10&&k<=20)
		{
			fees=fees+20000;
			ds+=20000;
		}
		else if(k>=20&&k<=30)
		{
			fees=fees+25000;
			ds+=25000;
		}
		break;
		case 2:ds+=0;
		break;
		}

		}
	}	
	public static void receipt1() {
		System.out.printf("\n\tBNM INSTITUTE OF TECHNOLOGY\n");
		System.out.println("\t Banashankari, 27th Cross");
		System.out.println("=================Receipt=================\n");
		System.out.printf("Receipt no.: "+num);
		System.out.printf("\tName: "+name);
		System.out.printf("\nCourse: "+s);
		System.out.println("\t\tYear: "+year);
		System.out.println("-----------------------------------------");
		System.out.println("Tuition fee: "+nm);
		System.out.println("Library fee : 1500");
		System.out.println("Infrastructure fee : 2000");
		System.out.println("Registration fee : "+reg);
		System.out.println("Hostel fee: "+h);
		System.out.println("Day scholar: "+ ds);
		System.out.println("Discount: "+dis);
		System.out.println("-----------------------------------------\n");
		a = fees+1500+2000;
		System.out.println("Total:  "+a);
		System.out.println("\n\nSignature");
	}
	public static void receipt2() {
		System.out.printf("\n\tBNM INSTITUTE OF TECHNOLOGY\n");
		System.out.println("\t Banashankari, 27th Cross");
		System.out.println("=================Receipt=================\n");
		System.out.printf("Receipt no.: "+num);
		System.out.printf("\tName: " +name);
		System.out.printf("\nCourse: "+c);
		System.out.println("\t\tYear: "+year);
		System.out.println("-----------------------------------------");
		System.out.println("Tuition fee: "+nm);
		System.out.println("Library fee : 1500");
		System.out.println("Infrastructure fee : 2000");
		System.out.println("Hostel fee: "+h);
		System.out.println("Day scholar: " +ds);
		System.out.println("-----------------------------------------\n");
		a = fees+1500+2000;
		System.out.println("Total: "+a);
		System.out.println("\n\nSignature");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		num=r.nextInt(100000);
		String id,pwrd,i="bnmit-2022",pwd="bnmit1234";
		while(true)
		{
			System.out.print("Enter login id = ");
			id=sc.next();
			if(id.equals(i)==true)
			{
				while(true)
				{
					System.out.print("Enter Password = ");
					pwrd=sc.next();
					if(pwrd.equals(pwd)==true)
					{
						System.out.println("LOGIN SUCCESSFUL");
						input();
						System.exit(0);
					}
					else
					{
						System.out.println("Invalid password. Enter again.");
					}
				}
			}
			else
			{
				System.out.println("Invalid Id,try again");
			}
		}
	}
}



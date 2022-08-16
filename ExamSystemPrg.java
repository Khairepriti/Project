package examsystem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class course {
	Scanner sc = new Scanner(System.in);
	//Java Questions
	static String q1 = "Constructor overloading is not possible in Java.\r\n" + "True\r\n" + "False\r\n";
	static String q2 = "JAVA is case sensitive language.\r\n" + "True\r\n" + "False\r\n";
	static String q3 = "Constructor same name as a class name.\r\n" + "True\r\n" + "False\r\n";
	static String q4 = "A class's name must begin with an uppercase letter.\r\n" + "True\r\n" + "False\r\n";
	static String q5 = "multiple inheritance is not supported in java.\r\n" + "True\r\n" + "False\r\n";

	static Question[] que = { new Question(q1, "False"), new Question(q2, "True"), new Question(q3, "True"),
			new Question(q4, "True"), new Question(q5, "True") };
	
	//HTML Questions
	static String h1 = "What does HTML stand for Hyper Text Markup Language?\r\n" + "a. True\r\n" + "b. False\r\n";
	static String h2 = "Choose the correct HTML element for the largest heading:\r\n" + "a. h1\r\n" + "b. h5\r\n";
	static String h3 = "What is the correct HTML element for inserting a line break?\r\n" + "a. br\r\n"
			+ "b. break\r\n";
	static String h4 = "Which character is used to indicate an end tag?\r\n" + "a. / \r\n" + "b.*\r\n";
	static String h5 = "Inline elements are normally displayed without starting a new line.\r\n" + "a.True\r\n"
			+ "b.False\r\n";
	static Question2[] que2 = { new Question2(h1, "a"), new Question2(h2, "a"), new Question2(h3, "a"),
			new Question2(h4, "a"), new Question2(h5, "a") };

	public static void taketest(Question[] que) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < que.length; i++) {
			System.out.println(que[i].promt);
			String answer = sc.next();

			if (answer.equals(que[i].ans)) {
				score++;
			}
		}
		System.out.println("\n\nYou got " + score + "/" + que.length);
	}

	public static void taketest2(Question2[] que2) {
		int score = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < que2.length; i++) {
			System.out.println(que2[i].promt2);
			String answer = sc.next();

			if (answer.equals(que2[i].ans2)) {
				score++;
			}
		}
		System.out.println("\n\nYou got " + score + "/" + que.length);
	}
}

class Register implements Comparator<RegistrationPage> {
	@Override
	public int compare(RegistrationPage r1, RegistrationPage r2) {
		
		return r1.getUsername().compareTo(r2.getUsername());
	}

	public void firstname(String name) {
		

	}
}

public class ExamSystemPrg extends course {

	public static void main(String[] args) {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		String course1 = "Java";
		String course2 = "HTML";
		while (true) {
			System.out.println("**************************************************************************");
			System.out.println("Enter 1 for register..\n");
			System.out.println("enter 2 for login...\n");
			System.out.println("Enter 3 for show course details..\n");
			System.out.println("Enter 4  Start Exam..\n");
			System.out.println("Enter 5 for exit");
			System.out.println("**************************************************************************");
			System.out.println("Make your choice : ");
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				String name;
				int mobno;
				String course;
				String username;
				String pass;
				String email;
				String dob;
				String address;
				ArrayList<RegistrationPage> regarry = new ArrayList<RegistrationPage>();
				System.out.println("enter student name: ");
				name = sc.next();
				System.out.println("enter User name: ");
				username = sc.next();
				System.out.println("enter password name: ");
				pass = sc.next();
				System.out.println("enter e-Mail id name: ");
				email = sc.next();
				System.out.println("enter Course name: ");
				course = sc.next();
				System.out.println("enter Mobile number : ");
				mobno = sc.nextInt();
				System.out.println("enter Date of Birth name: ");
				dob = sc.next();
				// System.out.println("enter address: ");
				// address=sc.next();
				RegistrationPage r1 = new RegistrationPage();
				r1.setName(name);
				r1.setUsername(username);
				r1.setPass(pass);
				r1.setEmail(email);
				r1.setCourse(course);
				// r1.setAddress(address);
				r1.setMobno(mobno);
				r1.setDob(dob);
				regarry.add(r1);
				r1.getName();
				System.out.println("**************************************************************");
				System.out.println("Registration done. ");
				System.out.println("Name: " + r1.getName());
				System.out.println(" User Name: " + r1.getUsername());
				System.out.println("Email id : " + r1.getEmail());
				System.out.println("Date of birth : " + r1.getDob());
				System.out.println("Course Enroll : " + r1.getCourse());
				System.out.println("Mobile Number : " + r1.getMobno());

				System.out.println("******************************************************************");
				break;
			}
			// TODO Auto-generated method stub

			// Login page
			case 2: {
				HashMap<String, String> logarr = new HashMap<String, String>();
				logarr.put("Priti123", "p123");
				logarr.put("Khaire123", "k123");
				logarr.put("rakesh789", "r789");
				logarr.put("sharma456", "s456");
				System.out.println(logarr);

				try {
					Scanner scanner = new Scanner(System.in);
					System.out.print(" Enter user name => ");
					String userName = scanner.nextLine();

					System.out.print(" Enter password => ");
					String password = scanner.nextLine();

					if (logarr.containsKey(userName)) {
						if (logarr.get(userName).equals(password)) {
							System.out.println(" User successfully logged-in.. ");
						} else {
							System.out.println(" In valid userName of password ");
						}
					}
				} finally {

				}
			}
				break;

			case 3: {
				System.out.println("Course name: " + course1);
				System.out.println("Course name: " + course2);
				break;
			}

			case 4: {

				System.out.println("Enter your course:\n 1.JAVA \n 2.HTML");
				String co = sc.next();
				if (co.equalsIgnoreCase(course1)) {
					course c1 = new course();
					c1.taketest(que);
					System.out.println("Start JAVA exam\n");
				} else if (co.equalsIgnoreCase(course2)) {
					course c2 = new course();
					c2.taketest2(que2);
					System.out.print("start HTML exam\n");
				}
			}
				break;

			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
			}
		}
	}
}

import java.util.Scanner;

public class MainProgram {
	public static void main(String[] args) {
		MainProgram mainProgram = new MainProgram();
		mainProgram.printBanner();
		while (true) {
			int studentID = mainProgram.receiveStudentID();
			mainProgram.runModule(studentID);
		}
	}

	public void printBanner() {
		System.out.println("[2020-Fall Software Engineering]");
		System.out.println("Simple Software Development Project");
		System.out.println();
	}

	public int receiveStudentID() {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a student ID: ");
		return input.nextInt();
	}

	public void runModule(int studentID) {
		if (studentID == 11530)
			System.out.println("No. It is the professor ID.\n");
		else {
			if (studentID == 1810954) {
				System.out.println("[Student ID: " + studentID + "]");
				System.out.println("1. Calculate the maximum of three");
				System.out.println("2. Calculate the minimum of three");

				Scanner sc = new Scanner(System.in);

				System.out.print("Enter menu number : ");
				int select = sc.nextInt();

				if (select == 1 || select == 2) {
					System.out.print("Enter three integers separated by space : ");
					int num1 = sc.nextInt();
					int num2 = sc.nextInt();
					int num3 = sc.nextInt();
					if (select == 1)
						System.out.println("Result : " + maxOfThree(num1, num2, num3));
					else if (select == 2)
						System.out.println("Result : " + minOfThree(num1, num2, num3));
				} else
					System.out.println("Please enter only 1 or 2");
			}

			else if (studentID == 1810989) {
				System.out.println("[Student ID: 1810989]");
				System.out.println("1. Calculate the maximum");
				System.out.println("2. Calculate the absolute value");
				System.out.print("Enter menu number: ");
				Scanner sc = new Scanner(System.in);
				while (true) {
					int menuNumber = sc.nextInt();
					if (menuNumber == 1) {
						int input1, input2;
						System.out.print("Enter 2 integers: ");
						input1 = sc.nextInt();
						input2 = sc.nextInt();
						System.out.println("The maximum is " + calculateMax(input1, input2) + ".");
						break;
					} else if (menuNumber == 2) {
						int input;
						System.out.print("Enter an integer: ");
						input = sc.nextInt();
						System.out.println("The absolute value is " + calculateAbs(input) + ".");
						break;
					} else {
						System.out.println("Wrong number. Please enter again");
						System.out.print("Enter menu number: ");
					}
				}

			}
			
			else if (studentID == 1811141){
				System.out.println("[Student ID: 1811141]");
				System.out.println("1. Factorial");
				System.out.println("2. Absolute");

				System.out.print("Enter menu number: ");
				Scanner sc = new Scanner(System.in);
				
				int menu = sc.nextInt();
				while( true ){
					if( menu == 1){
						int num;
						int result;

						System.out.print("Enter a positive integer: ");
						num = sc.nextInt();
						
						result = nam_fact(num);
						System.out.println("Result of Factorial Function: " + result);

						break;

					}
					else if ( menu == 2) {
						double num;
						double result;
						
						System.out.print("Enter a real number: ");
						sc.hasNextLine();
						num = sc.nextDouble();
						
						result = nam_abs(num);
						System.out.println("Result of Absolute Function: " + result);
						
						break;
					}
					else{
						System.out.print("Wrong number! Enter menu number again:");
						menu = sc.nextInt();
					}
				}
			}
			
			
			else if (studentID == 1811258) {
				System.out.println("[Student ID: 1811258]");
				System.out.println("1. Calculate the absolute value");
				System.out.println("2. Calculate the maximum value");

				Scanner scan = new Scanner(System.in);
				System.out.print("Enter menu number : ");

				while (true) {
					int menuNum = scan.nextInt();
					
					if (menuNum == 1) {
						System.out.print("Input one integer: ");
						int num = scan.nextInt();
						int result = makeAbs(num);
						
						System.out.println("The absolute value is " + result);
						break;
					} 
					else if (menuNum == 2) {
						System.out.print("Input two integer: ");
						int num1 = scan.nextInt();
						int num2 = scan.nextInt();
						int result = makeMax(num1, num2);
						
						System.out.println("The maximum value is " + result);
						break;
					} 
					else 
						System.out.print("Enter correct menu number: ");
				}
			}
			
			else if(studentID == 1811494) {
				System.out.println("[Student ID: 1811494]");
				System.out.println("1. Calculate the Factorial");
				System.out.println("2. Calculate the minimum value");
				
				Scanner sc = new Scanner(System.in);
				
				while(true) {
					System.out.print("Enter menu number : ");
					int menuNum = sc.nextInt();
					
					if(menuNum == 1) {
						System.out.print("Please enter an integer number : ");
						int number = sc.nextInt();
						int result = factorial(number);
						System.out.println("The factorial result value is "+result+"\n");
						break;
					} else if(menuNum == 2) {
						System.out.print("Please enter an integer number 1 : ");
						int number = sc.nextInt();
						System.out.print("Please enter an integer number 2 : ");
						int number2 = sc.nextInt();
						int result = minNum(number, number2); 
						System.out.println("The minimum result value is "+result+"\n");
						break;
					} else {
						System.out.println("You have entered an invalid number. Please try again.");
					}
				}
			}
			else if(studentID == 1811424) {
				System.out.println("[Student ID: 1811424]");
				System.out.println("1. Calculate the Max Number");
				System.out.Println("2. Calculate the Min Number");

				Scanner sc = new Scanner(System.in);

				while(true) {
					System.out.print("Enter menu number : ");
					int meNu = sc.nextInt();

					if(meNu == 1) {
						System.out.print("Enter two integer numbers : ");
						int num1 = sc.nextInt();
						int num2 = sc.nextInt();
						int max = maxNumber(num1,num2);
						System.out.println("Max Number is "+max+"\n");
						break;
					}
					else if(meNu == 2){
						System.out.print("Enter two integer numbers : ");
						int num1 = sc.nextInt();
						int num2 = sc.nextInt();
						int min = minNumber(num1,num2);
						System.out.println("Min number is "+min+"\n");
						break;
					}
					else{
						System.out.println("Wrong number! Enter a correct number again");
					}
				}
			}
			else if (studentID == 1811126) {
				System.out.println("[Student ID: 1811126]");
				System.out.println("1. Calculate The Max Value");
				System.out.println("2. Calculate The Absolute Value");

				Scanner scanner = new Scanner(System.in);

				while (true) {
					System.out.print("Enter a menu number : ");
					int menu_num = scanner.nextInt();

					if(menu_num == 1) {
						System.out.print("Enter two integer number : ");
						int number1 = scanner.nextInt();
						int number2 = scanner.nextInt(); 
						System.out.println("The Max Value is " + getMax(number1, number2));
						break;
					}
					else if(menu_num == 2){
						System.out.print("Enter an integer number : ");
						int number1 = scanner.nextInt();
						System.out.println("The Absolute Vaue is " + getAbs(number1));
						break;
					}
					else {
						System.out.println("Enter a menu number again.");
					}
	
				}
	
			}


			
		}
		
	}
	
	public int minNum(int number, int number2) {
		int min = number;
		if(number > number2) min = number2;
		return min;
	}
	
	public int factorial(int number) {
		if(number <= 1) {
			return number;
		} else {
			return factorial(number-1)*number;
		}
	}


	public int maxOfThree(int a, int b, int c) {
		int maxNum = a;
		if (maxNum < b || maxNum < c) {
			maxNum = b;

			if (maxNum < c) {
				maxNum = c;
			}
		}
		return maxNum;
	}

	public int minOfThree(int a, int b, int c) {
		int minNum = a;
		if (minNum > b || minNum > c) {
			minNum = b;
			if (minNum > c) {
				minNum = c;
			}
		}
		return minNum;
	}

	public static int calculateMax(int a, int b) {
		if (a > b)
			return a;
		else
			return b;
	}

	public static int calculateAbs(int a) {
		if (a < 0)
			return a * (-1);
		return a;
	}
	
	public int nam_fact( int n){
		int i;
		int fac = 1;
		if( n == 0 || n == 1)
			return fac;
		else {
			for( i = 1; i < n+1 ; i++){
				fac = fac * i;
			}
		}
		return fac;
	}

	public double nam_abs(double a){
		if (a >= 0)
			return a;
		else
			return (-1)*a;
	}
	
	public int makeAbs(int a) {
		if (a >= 0)
			return a;
		else 
			return a * (-1);
	}
	
	public int makeMax(int a, int b) {
		if (a >= b)
			return a;
		else
			return b;
	}
	public int maxNumber(int a, int b){
		if(a >= b)
			return a;
		else
			return b;
	}
	public int minNumber(int a, int b){
		if(a <= b)
			return a;
		else
			return b;
	}
	public int getMax(int a, int b) {
		return (a >= b) ? a : b;
	}
	public int getAbs(int a) {
		return (a >= 0) ? a : -a;
	}
}

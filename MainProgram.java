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
        	if(studentID == 1810954) {
			System.out.println("[Student ID: "+studentID+"]");
        		System.out.println("1. Calculate the maximum of three");
                System.out.println("2. Calculate the minimum of three");
               
                Scanner sc = new Scanner(System.in);
                
                System.out.print("Enter menu number : ");
                int select = sc.nextInt();
                
                System.out.print("Enter a num1 : ");
   	            int num1 = sc.nextInt();
   	            System.out.print("Enter a num2 : ");
   	            int num2 = sc.nextInt();
   	            System.out.print("Enter a num3 : ");
   	            int num3 = sc.nextInt();
   	            
   	            if(select == 1)
   	            	System.out.println("Result : " + maxOfThree(num1, num2, num3)); 
   	            else if(select == 2)
                    System.out.println("Result : " + minOfThree(num1, num2, num3));
                else 
                	System.out.println("Please enter only 1 or 2");
        	}
        	
		else if(studentID == 1810989){
			System.out.println("[Student ID: 1810989]");
			System.out.println("1. Calculate the maximum");
			System.out.println("2. Calculate the absolute value");
			System.out.print("Enter menu number: ");
			Scanner sc = new Scanner(System.in);
			while(true){
				int menuNumber = sc.nextInt();
				if(menuNumber == 1){
					int input1, input2;
					System.out.print("Enter 2 integers: ");
					input1 = sc.nextInt();
					input2 = sc.nextInt();
					System.out.println("The maximum is "+calculateMax(input1,input2)+".");
					break;
				}
				else if(menuNumber == 2){
					int input;
					System.out.print("Enter an integer: ");
					input = sc.nextInt();
					System.out.println("The absolute value is "+calculateAbs(input)+".");
					break;
				}
				else{
					System.out.println("Wrong number. Please enter again");
					System.out.print("Enter menu number: ");
				}
			}
			sc.close();
			
		}

        	System.out.println("To be developed...\n");
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

    public int calculateMax(int a, int b){
	    if(a > b)
		    return a;
	    else
		    return b;
    }
    
    public int calculateAbs(int a){
    	if(a < 0)
		return a*(-1);
	return a;
    }
}

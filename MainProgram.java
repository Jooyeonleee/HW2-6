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
            	while (true) {
            		System.out.println("[Student ID: "+studentID+"]");
            		System.out.println("1. Calculate the maximum of three");
                    System.out.println("2. Calculate the minimum of three");
                    System.out.println("3. Exit");
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.print("Enter menu number : ");
                    int select = sc.nextInt();
                    
                    if(select == 1 || select == 2) {
                    	System.out.print("Enter a num1 : ");
       	            	int num1 = sc.nextInt();
       	            	System.out.print("Enter a num2 : ");
       	            	int num2 = sc.nextInt();
       	            	System.out.print("Enter a num3 : ");
       	            	int num3 = sc.nextInt();
       	            	if(select == 1)
       	            		System.out.println("Answer : " + maxOfThree(num1, num2, num3)); 
       	            	else if(select == 2)
                        	System.out.println("Answer : " + minOfThree(num1, num2, num3));
                    }else if(select == 3) break;
                    else System.out.println("Please enter only 1 or 2 or 3");
                }
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
}

import java.io.*;  // Import the File class
import java.util.*; // Import the Scanner class to read text files

class compSciList {
  public void compSciClassList() {
    try{
      File compSciFile = new File("COMP_SCI_CLASS_LIST.txt");
      Scanner compSciClassReader = new Scanner(compSciFile);
      while (compSciClassReader.hasNextLine()) {
        String data = compSciClassReader.nextLine();
        System.out.println(data);
      }
      compSciClassReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
    int CS201 = 3;
    int CS221 = 3;
    int CS231 = 3;
    int CS240 = 4;
    int CS256 = 4;    
  }
}

class mathList extends compSciList {
  public void mathClassList() {
    try{
      File mathFile = new File("MATH_CLASS_LIST.txt");
      Scanner mathClassReader = new Scanner(mathFile);
      while (mathClassReader.hasNextLine()) {
        String data = mathClassReader.nextLine();
        System.out.println(data);
      }
      mathClassReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
    int MATH202 = 4;
    int MATH260 = 4;
  }
}

class commList extends compSciList {
  public void commClassList() {
    try{
      File commFile = new File("COMM_CLASS_LIST.txt");
      Scanner commClassReader = new Scanner(commFile);
      while (commClassReader.hasNextLine()) {
        String data = commClassReader.nextLine();
        System.out.println(data);
      }
      commClassReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
    int COMM133 = 3;
    int COMM166 = 3;
    int COMM237 = 3;
  }
}

class enrollment {
  public void enrollmentStart() {

    int i = 0;
    int totalCredit = 0;

    Scanner user_input = new Scanner(System.in);
    Scanner user_input_int = new Scanner(System.in);
    Scanner user_input_string = new Scanner(System.in);

    System.out.println("Welcome UWGB enrollment System");  

    while (i < 1000) {
    System.out.println();
    System.out.println("You can see the class list");
    System.out.println("1. Computer Science \n2. Math \n3. Communication \n0. Exit");
    System.out.println();
    System.out.print("Please enter the number to choose: ");
    int user_select_class_list = user_input_int.nextInt();  
    System.out.println();  

      if (user_select_class_list == 1) {
        compSciList compSciMajorclass = new compSciList();
        compSciMajorclass.compSciClassList();
        i++;
      } else if (user_select_class_list == 2) {
        mathList compSciMajorclassMath = new mathList();
        compSciMajorclassMath.mathClassList();
        i++;
      } else if (user_select_class_list == 3) {
        commList compSciMajorclassComm = new commList();
        compSciMajorclassComm.commClassList();
        i++;
      } else if (user_select_class_list == 0) {
        break; 
      } else {
        System.out.println("Invalid Input!");
      }
    } 

    ArrayList<String> classList = new ArrayList<String>();

    while (i < 1000) {
    System.out.println("You can select to next thing");
    System.out.println("1. ADD \n2. DROP \n0. Finish");
    System.out.println();
    System.out.print("Please enter the number to choose: ");
    int user_select_class_process = user_input_int.nextInt();  
    System.out.println();  

      if (user_select_class_process == 1) {
        if(totalCredit > 18){
          System.out.println("Total Creadit Can't Over 18");
        } else { 
        System.out.print("Which Class do you want to add: ");
        String userInputAddClass = user_input.nextLine();
          if(userInputAddClass.matches("CS201|CS221|CS231|CS292|CS353|CS358|CS361|CS452|CS464|CS490|COMM133|COMM166|COMM237")) {
            classList.add(userInputAddClass); 
            totalCredit += 3; 
          } else if (userInputAddClass.matches("CS240|CS256|CS316|CS351|CS371|MATH202|MATH260")) {
            classList.add(userInputAddClass); 
            totalCredit += 4; 
          } else {
            System.out.println("Invalid Input!");
          }
        System.out.println();
        i++;
        }
      } else if (user_select_class_process == 2) {
          System.out.print("Your Class List is: ");
          System.out.println(classList);
          System.out.println();
          System.out.println("It Strat with 0!");
          System.out.print("Select Position to drop class: ");
          int userInputDropClass = user_input.nextInt();
          classList.remove(userInputDropClass);
          System.out.println();
        i++;
      } else if (user_select_class_process == 0) {
        if(totalCredit < 6) {
          System.out.println("You must have at least one class");
        } else {
          break; 
        }
      } else {
        System.out.println("Invalid Input!");
      }
    }
    System.out.print("Your Class List is: ");
    System.out.println(classList);
    System.out.println();
    System.out.print("Your Total Creadit is " + totalCredit);
  }
}

class Main {
  public static void main(String[] args) {
    enrollment runCode = new enrollment();
    runCode.enrollmentStart();
  }
}
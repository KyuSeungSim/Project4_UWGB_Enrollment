import java.io.*;  // Import the File class
import java.util.*; // Import the Scanner class to read text files

class compSciList {
  public void compSciClassList() {
    try{
      File myObj = new File("COMP_SCI_CLASS_LIST.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
  }
}

class mathList extends compSciList {
  public void mathClassList() {
    try{
      File myObj = new File("MATH_CLASS_LIST.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
  }
}

class commList extends compSciList {
  public void commClassList() {
    try{
      File myObj = new File("COMM_CLASS_LIST.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
      }
  }
}



class enrollment {

  public void matchClass() {

  }

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
        System.out.println();
        System.out.print("Which Class do you want to add: ");
        String userInputAddClass = user_input.nextLine();
        classList.add(userInputAddClass);
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
        break; 
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
import java.io.*;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files

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

  public void addClass() {

    /*  for(int userIndex = 0; userIndex < userClassList.length; userIndex += 0) {
      System.out.println("EX) CS201");
      System.out.print("Enter Your Class Name: ");

      String userInput = user_input.nextLine();

      if(totalCredit > 18) {
        System.out.println("Total Credit can't over 18");
        userIndex -= 1;
        break;
      } else if(userInput.equals("CS201")){  // Making checking list
        userClassList[userIndex] = userInput;
        userIndex += 1;
        totalCredit += 3;
        System.out.println("Success to Input!");
      } else if(userInput.equals("CS221")){  // Making checking list
        userClassList[userIndex] = userInput;
        userIndex += 1;
        totalCredit += 3;
        System.out.println("Success to Input!");
      } else if(userInput.equals("CS240")){  // Making checking list
        userClassList[userIndex] = userInput;
        userIndex += 1;
        totalCredit += 4;
        System.out.println("Success to Input!");
      }

    } // for loop end
    */

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
 
    System.out.print("How many class will take this semester: ");
    int user_input_class_list = user_input.nextInt();
    String[] userClassList = new String[user_input_class_list];
    System.out.println();    


    while (i < 1000) {
    System.out.println("You can select to next thing");
    System.out.println("1. ADD \n2. DROP \n3. Switch \n0. Finish");
    System.out.println();
    System.out.print("Please enter the number to choose: ");
    int user_select_class_process = user_input_int.nextInt();  
    System.out.println();  

      if (user_select_class_process == 1) {
        for(int userIndex = 0; userIndex < userClassList.length; userIndex += 0) {
          System.out.println("EX) CS201 and Finish input 0");
          System.out.print("Enter Your Class Name: ");

          String userInput = user_input.nextLine();

          if(totalCredit > 18) {
            System.out.println("Total Credit can't over 18");
            break;
          } else if(userInput.equals("CS201")){  // Making checking list
            userClassList[userIndex] = userInput;
            userIndex += 1;
            totalCredit += 3;
            System.out.println("Success to Input!");
          } else if(userInput.equals("CS221")){  // Making checking list
            userClassList[userIndex] = userInput;
            userIndex += 1;
            totalCredit += 3;
            System.out.println("Success to Input!");
          } else if(userInput.equals("CS240")){  // Making checking list
            userClassList[userIndex] = userInput;
            userIndex += 1;
            totalCredit += 4;
            System.out.println("Success to Input!");
          } else if(userInput.equals("0")){
            break;
          }

        } // for loop end

        i++;
      } else if (user_select_class_process == 2) {
          System.out.print("Your Class List is: ");
          for (int c = 0; c < userClassList.length; c++) {
            System.out.print(userClassList[c] + ", ");
          }
          System.out.println();



        i++;
      } else if (user_select_class_process == 3) {



        i++;
      } else if (user_select_class_process == 0) {
        break; 
      } else {
        System.out.println("Invalid Input!");
      }
    }

    System.out.print("Your Class List is: ");
    
    for (int c = 0; c < userClassList.length; c++) {
      System.out.print(userClassList[c] + ", ");
    }
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
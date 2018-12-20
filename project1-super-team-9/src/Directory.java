import java.util.*;
import java.io.*;

public class Directory{
  // class variables
  private static ArrayList <Person> listPerson = new ArrayList<Person>();
  private static ArrayList <Student> pingList = new ArrayList<Student>();
  private static String fName;
  private static String lName;
  private static String address;
  private static String pNumber;
  private static String mentee;
  private static boolean runProgram = true;
  private static String mentor;

  public static void main(String[]args) throws Exception{
    populateArray();

    //to create an object for file on disk
    File inputFile = new File("directory.txt");
//    System.out.println("Does the file exists: " + inputFile.exists());
    //keyboard scanner for user input
    Scanner kb = null;
    //file scanner to read from the disk file
    Scanner in = null;
    // prinwriter to write in File
    PrintWriter pw = null;

//  while (runProgram){
    try{
        // Take the user inputFile
        System.out.println("What do you want to do? (1, 2 ,3 ....etc)");
        System.out.println("1.  Find Entry");
        System.out.println("2.  Ping Mentees");
        System.out.println("3.  Add  Entry");
        System.out.println("4.  Edit Entry");
        System.out.println("5.  Delete Entry");
        System.out.println("6.  Exit");

          kb = new Scanner(System.in);
          in = new Scanner(inputFile);
          pw = new PrintWriter(inputFile);
          //while (user)
          int choice = kb.nextInt();
          switch(choice){

            // in case of 1
            case 1:
              System.out.println("Find Entry   by First  Name Press 1: \n" +
                                 "Find Entry   by Last   Name Press 2: \n" +
                                 "Find Entry   by Member Type Press 3: \n" +
                                 "Find Student by Mentor Name Press 4: \n");
              int findChoice = kb.nextInt();
              if (findChoice == 1){
                System.out.println("Please enter First name");
                String f = kb.next();
                findByFirstName(f);
              }
              else if(findChoice == 2){
                // IN PROCESS. Need to have student object returned and passed into ping methods.
                System.out.print("Please enter mentee's last name: ");
                String l = kb.next();
              }
              else if(findChoice == 3){
                System.out.println("Please enter the Type you want");
                System.out.println("For Undergraduate Student Press 1: \n" +
                                   "For      Graduate Student Press 2: \n" +
                                   "For     Industrial mentor Press 3: \n" +
                                   "For      Arcademic mentor Press 4: \n");
                int findType = kb.nextInt();
                if (findType == 1){
                  printUndergraduateStudents();
                }
                else if (findType == 2){
                  printGraduateStudents();
                }
                else if (findType == 3){
                  printIndustrialMentors();
                }
                else if (findType == 4){
                  printAcademicMentors();
                }
                else {
                  System.out.println("Wrong choice for type");
                }
              }

              else if(findChoice == 4){
                System.out.println("Please enter the mentor name");
                String mName = kb.next();
                findByMentorName(mName);
              }
              else{
                System.out.println("Wrong Menu Choice");
              }

              break;
            // in case of 2
            case 2:
            System.out.println("Enter mentee last name: ");
            String lName = kb.next();
            pingMentee(lName);
            System.out.println("Do you wish to display all Pinged students? (Y/Other key)");
            char seePing = kb.next().charAt(0);
            if (seePing == 'Y' || seePing == 'y'){
              getPingList();
            }

              break;
            // in case of 3
            case 3:
            //System.out.println("Add entry: ");
            int personType;
            int personSubType;

            System.out.println("To add Student Press 1 \n"+
                               "To add Faculty Press 2");
            personType = kb.nextInt();
            if (personType == 1){
              System.out.println("To add Undergraduate Press 1 \n"+
                                 "To add      Graduate Press 2");
              personSubType = kb.nextInt();
              if (personSubType == 1)
                createUndergraduateStudent();
              else if (personSubType == 2)
                createGraduateStudent();
              else{
                System.out.println("Wrong Student Choice");
              }
            }

            else if (personType == 2){
              System.out.println("To add Industry Mentor Press 1 \n"+
                                 "To add Academic Mentor Press 2");
              personSubType = kb.nextInt();
              if (personSubType == 1)
                createIndustryMentor();
              else if (personSubType == 2)
                createAcademicMentor();
              else{
                System.out.println("Wrong Mentor Choice");
              }
            }
            else{
              System.out.println("Wrong Person Choice");
            }

              break;
            // case 4 for editing
            case 4:
              System.out.println("Edit entry: ");
              System.out.println("UNDER CONSTRUCTION");
              break;
            // case 5 to delete entry
            case 5:
              System.out.println("Delete entry: ");
              System.out.println("UNDER CONSTRUCTION");
              break;
            // This case (6) allows the user to END the program
            case 6:
              runProgram = false; // Stops program
              break;
            //default case
            default:
              System.out.println("default");
              break;
      }//End of switch

    }//end of try
    catch(IOException e){
      System.out.println("File not found");
    }
    catch(InputMismatchException e){
      System.out.println("Choice should be either '1' or '2' ");
    }
    catch(Exception e){
      System.out.println(e.getMessage());
    }
    finally{
      kb.close();
      pw.close();
      in.close();
      writeToFile();
    }
//    }//End of while loop

  }//End of main

  // Methods for creating objects
  // 1. create UndergraduateStudent
  public static void createUndergraduateStudent(){
    try(Scanner kb = new Scanner(System.in)){
      String fName;
      String lName;
      String address;
      String pNumber;
      String mentor;

      System.out.print("Please enter the First name:  ");
      fName = kb.next();
      System.out.print("Please enter the Last name:  ");
      lName = kb.next();
      System.out.print("Please enter the Address:  ");
      address = kb.next();
      System.out.print("Please enter the Phone Number:  ");
      pNumber = kb.next();
      System.out.print("Please enter the Mentor name:  ");
      mentor = kb.next();

      Person uGS = new UndergraduateStudent(fName,lName,address,pNumber,mentor);
      listPerson.add(uGS);
      System.out.println("Added " + fName + " " + lName + " as UnderGraduate Student" );
    }
    catch(Exception e){
      System.out.println("error");
    }
  }// end of create undergraduate

  // 2. create graduate student
  public static void createGraduateStudent(){
    try(Scanner kb = new Scanner(System.in)){
      String fName;
      String lName;
      String address;
      String pNumber;
      String mentor;

      System.out.print("Please enter the First name:  ");
      fName = kb.next();
      System.out.print("Please enter the Last name:  ");
      lName = kb.next();
      System.out.print("Please enter the Address:  ");
      address = kb.next();
      System.out.print("Please enter the Phone Number:  ");
      pNumber = kb.next();
      System.out.print("Please enter the Mentor name:  ");
      mentor = kb.next();

      Person gS = new GraduateStudent(fName,lName,address,pNumber,mentor);
      listPerson.add(gS);
    }
    catch(Exception e){
      System.out.println("error");
    }
    System.out.println("Added " + fName + " " + lName + " as Graduate Student" );
  }// end of create graduate student

  public static void createIndustryMentor(){
    try(Scanner kb = new Scanner(System.in)){
      String fName;
      String lName;
      String address;
      String pNumber;
      String mentee;
      String choice;

      System.out.print("Please enter the First name:  ");
      fName = kb.next();
      System.out.print("Please enter the Last name:  ");
      lName = kb.next();
      System.out.print("Please enter the Address:  ");
      address = kb.next();
      System.out.print("Please enter the Phone Number:  ");
      pNumber = kb.next();
      // System.out.print("Does this person have a mentee?");
      // choice = kb.next();
      // if (choice == "y" || choice == "Y"){
      //   System.out.print("Please enter the Mentee name:  ");
      //   mentee = kb.next();
      // }
      // else
      //   mentee = null;
      Faculty inMentor = new IndustrialMentor(fName,lName,address,pNumber);
      // inMentor.fillMenteeList(mentee);
      listPerson.add(inMentor);
    }

    catch(Exception e){
      System.out.println("error");
    }
    System.out.println("Added " + fName + " " + lName + " as Industrial mentor" );
  }

  public static void createAcademicMentor(){
    try(Scanner kb = new Scanner(System.in)){
      String fName="s";
      String lName="s";
      String address;
      String pNumber;
      String mentee;
      String choice;

      System.out.print("Please enter the First name:  ");
      fName = kb.next();
      System.out.print("Please enter the Last name:  ");
      lName = kb.next();
      System.out.print("Please enter the Address:  ");
      address = kb.next();
      System.out.print("Please enter the Phone Number:  ");
      pNumber = kb.next();
      // System.out.print("Does this person have a mentee?");
      // choice = kb.next();
      // if (choice == "y" || choice == "Y"){
      //   System.out.print("Please enter the Mentee name:  ");
      //   mentee = kb.next();
      // }
      // else
      //   mentee = null;
      // Person acMentor2=new AcademicMentor(fName,lName,address,pNumber,mentee);
      // listPerson.add(acMentor2);
      Faculty acMentor = new AcademicMentor(fName,lName,address,pNumber);
      //acMentor.fillMenteeList(mentee);
      listPerson.add(acMentor);
    }
    catch(Exception e){
      System.out.println("error");
    }
    System.out.println("Added " + fName + " " + lName + " as Acadamic Mentor" );
  }

  // public static void fillMentorList(){
  //
  // }
  public static void populateArray(){
    try(Scanner input = new Scanner(new File("directory.txt"))){

      while(input.hasNext()){

        String status;
        status = input.next();
        if (status.charAt(0) == 'u'){
          fName = input.next();
          lName = input.next();
          address = input.next();
          pNumber = input.next();
          mentor = input.next();
          Person newPerson= new UndergraduateStudent(fName,lName,address,pNumber,mentor);
          listPerson.add(newPerson);
        }
        else if (status.charAt(0) == 'g'){
          fName = input.next();
          lName = input.next();
          address = input.next();
          pNumber = input.next();
          mentor = input.next();
          Person newPerson = new GraduateStudent(fName,lName,address,pNumber,mentor);
          listPerson.add(newPerson);
        }
        else if (status.charAt(0) == 'i'){
          fName=input.next();
          lName=input.next();
          address=input.next();
          pNumber=input.next();
          Person newPerson= new IndustrialMentor(fName,lName,address,pNumber);
          listPerson.add(newPerson);
        }
        else if (status.charAt(0) == 'a'){
          fName=input.next();
          lName=input.next();
          address=input.next();
          pNumber=input.next();
          mentor = input.next();
          Person newPerson= new AcademicMentor(fName,lName,address,pNumber);
          listPerson.add(newPerson);
        }
        else{
          System.out.println("Input data Error");
        }
      }// end of while
    }// end of try
    catch(NoSuchElementException e) {
      System.out.println("Problem with reading File");
    }
    catch(FileNotFoundException e){
      System.out.println(e.getMessage());
    }
  }// end of populate ArrayList

  public static void writeToFile(){
    try(PrintWriter pw = new PrintWriter(new File("directory.txt"))){
      for (int i = 0; i < listPerson.size(); i++){
        pw.println(listPerson.get(i).toString());
      }
    }catch(Exception e){
      System.out.println("File not Found");
    }
  }

  public static void findByFirstName(String f){
    for (int i = 0; i < listPerson.size(); i++){
      if (listPerson.get(i).getFirstName().equals(f)){
        Person person = listPerson.get(i);
        System.out.println("\nFirst Name is:  " + person.getFirstName());
        System.out.println("Last  Name is:  " + person.getLastName());
        System.out.println("Address    is:  " + person.getAddress());
        System.out.println("Phone no.  is:  " + person.getPhoneNumber());
      }
    }
  }// end of findByFirstName

  public static void findByLastName(String l){
    for (int i = 0; i < listPerson.size(); i++){
      if (listPerson.get(i).getLastName().equals(l)){
        Person person = listPerson.get(i);
        System.out.println("\nFirst Name is:  " + person.getFirstName());
        System.out.println("Last  Name is:  " + person.getLastName());
        System.out.println("Address    is:  " + person.getAddress());
        System.out.println("Phone no.  is:  " + person.getPhoneNumber());
      }
    }
  }

  public static void findByMentorName(String mName){
    for (int i = 0; i < listPerson.size(); i++){
      Person person = listPerson.get(i);
      if (person instanceof UndergraduateStudent){
        UndergraduateStudent und = (UndergraduateStudent) person;
        if (und.getMentor().equals(mName)){
          System.out.println("\nFirst Name is:  " + und.getFirstName());
          System.out.println("Last  Name is:  " + und.getLastName());
          System.out.println("Address    is:  " + und.getAddress());
          System.out.println("Phone no.  is:  " + und.getPhoneNumber());
        }
      }
      else if (person instanceof GraduateStudent){
        GraduateStudent grad = (GraduateStudent) person;
        if (grad.getMentor().equals(mName)){
          System.out.println("\nFirst Name is:  " + grad.getFirstName());
          System.out.println("Last  Name is:  " + grad.getLastName());
          System.out.println("Address    is:  " + grad.getAddress());
          System.out.println("Phone no.  is:  " + grad.getPhoneNumber());
        }
      }
    }// end for
  }// end of methods
  public static void printUndergraduateStudents(){
    for(Person p : listPerson){
      if(p instanceof UndergraduateStudent){
        System.out.println(p);
      }
    }
  }
  public static void printGraduateStudents(){
    for(Person p : listPerson){
      if(p instanceof GraduateStudent){
        System.out.println(p);
      }
    }
  }
  public static void printIndustrialMentors(){
    for(Person p : listPerson){
      if(p instanceof IndustrialMentor){
        System.out.println(p);
      }
    }
  }
  public static void printAcademicMentors(){
    for(Person p : listPerson){
      if(p instanceof AcademicMentor){
        System.out.println(p);
      }
    }
  }
  public static void pingMentee(String lName){
    Student mentee;
    for (int i = 0; i < listPerson.size(); i++){
      if (listPerson.get(i).getLastName().equals(lName)){
        Person person = listPerson.get(i);
        mentee = (Student) person;
        pingList.add(mentee);
        System.out.print(mentee.getFirstName() + " " + mentee.getLastName() + " has been pinged by " +
                          mentee.getMentor() + "\n" );
      }
    }
  }
  public static void getPingList(){
    System.out.println("The following students have been pinged: ");
    for (int i = 0; i<pingList.size(); i++){
      System.out.println((pingList.get(i)).getFirstName() + " " + (pingList.get(i)).getLastName() + ", pinged by " +
                          (pingList.get(i)).getMentor());
    }
  }

}//End of class

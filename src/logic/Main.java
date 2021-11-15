package logic;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import models.Person;
import models.Gender;

public class Main {
    Boolean finishedScanning = false;
    String fileName = "C:\\courses\\Java\\person_register\\src\\person_store.txt";
    FileWriter fileWriterInstance = new FileWriter(fileName, true);
    BufferedWriter fileWriter = new BufferedWriter(fileWriterInstance);
    ArrayList<Person> persons = new ArrayList<Person>();
    Scanner scanner = new Scanner(new File(fileName));
    Person person = new Person();
    Scanner scanData = new Scanner(System.in);
    public static void main(String[] args) throws IOException {


        System.out.println("CHoose the right choice");
        System.out.println("0. For registering new user");
        System.out.println("1. For Displaying all users");
        System.out.println("2. For modifying Existing user");
        int choice = scanData.nextInt();
        switch(choice){
            case 0:
                this.registerUser();
                break;
            case 1:
                this.displayAll();
                break;
            case 2:
                this.editUser();
                break;
            case 3:
                this.deleteUser();
                break;
            default:
                System.out.println("Bad choice");

        }
       try {
             if(choice == 0 ){
                 System.out.print("How many people do you want to record?: ");
                 int numberOfPeople = scanData.nextInt();
                 Person person1 = new Person();
                 int savedSuccessCount = 0;
                 for (int i =0; i<numberOfPeople; i++){
                     System.out.print("p"+(i+1)+" firstName: ");
                     person1.setFirstName(scanData.next());
                     System.out.print("p"+(i+1)+" lastName: ");
                     person1.setLastName(scanData.next());
                     System.out.print("p"+(i+1)+" Age: ");
                     person1.setAge(scanData.next());
                     System.out.print("p"+(i+1)+" Gender: ");
                     person1.gender=Gender.valueOf(scanData.next().toUpperCase());
                     String dataToAppend = person1.getFirstName()+" "+person1.getLastName()+" "+person1.getAge()+" "+person1.getGender()+"\n";
                     fileWriter.write(dataToAppend);
                     savedSuccessCount ++;
                 }
                 if(numberOfPeople == savedSuccessCount){
                     finishedScanning = true;
                     fileWriter.close();
                 }

                 System.out.print("Added "+numberOfPeople+(numberOfPeople >1 ? " people ": " person ")+"successfully!");
             } else if(choice == 1){
                 finishedScanning = true;
                 while(scanner.hasNextLine() && finishedScanning){
                     StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
                     person.setFirstName(tokenizer.nextToken());
                     person.setLastName(tokenizer.nextToken());
                     person.setAge(tokenizer.nextToken());
                     person.gender = Gender.valueOf(tokenizer.nextToken());
                     persons.add(person);
                 }
                 for(Person p: persons){
                     System.out.println("----------------Person "+(persons.indexOf(p)+1) +" Info--------------\n");
                     System.out.println("                FirstName: "+p.getFirstName());
                     System.out.println("                LastName: "+p.getLastName());
                     System.out.println("                Age: "+p.getAge());
                     System.out.println("                Gender: "+p.getGender());
                     System.out.println();
                     System.out.println();
                 }
             }else if(choice == 2){
                 System.out.print("Enter unique ID of the person: ");
                 int ID = scanData.nextInt();
             }
             else{
                 System.out.println("Bad choice!!!");
             }
       }catch (Exception e){
           e.printStackTrace();
       }
       finally {
           scanData.close();
           scanner.close();

       }

    }
public void   registerUser(){
        System.out.print("How many people do you want to record?: ");
        int numberOfPeople = scanData.nextInt();
        Person person1 = new Person();
        int savedSuccessCount = 0;
        for (int i =0; i<numberOfPeople; i++){
            System.out.print("p"+(i+1)+" firstName: ");
            person1.setFirstName(scanData.next());
            System.out.print("p"+(i+1)+" lastName: ");
            person1.setLastName(scanData.next());
            System.out.print("p"+(i+1)+" Age: ");
            person1.setAge(scanData.next());
            System.out.print("p"+(i+1)+" Gender: ");
            person1.gender=Gender.valueOf(scanData.next().toUpperCase());
            String dataToAppend = person1.getFirstName()+" "+person1.getLastName()+" "+person1.getAge()+" "+person1.getGender()+"\n";
            fileWriter.write(dataToAppend);
            savedSuccessCount ++;
        }
        if(numberOfPeople == savedSuccessCount){
            finishedScanning = true;
            fileWriter.close();
        }

        System.out.print("Added "+numberOfPeople+(numberOfPeople >1 ? " people ": " person ")+"successfully!");

    }
   public void displayAll(){
       finishedScanning = true;
       while(scanner.hasNextLine() && finishedScanning){
           StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
           person.setFirstName(tokenizer.nextToken());
           person.setLastName(tokenizer.nextToken());
           person.setAge(tokenizer.nextToken());
           person.gender = Gender.valueOf(tokenizer.nextToken());
           persons.add(person);
       }
       for(Person p: persons){
           System.out.println("----------------Person "+(persons.indexOf(p)+1) +" Info--------------\n");
           System.out.println("                FirstName: "+p.getFirstName());
           System.out.println("                LastName: "+p.getLastName());
           System.out.println("                Age: "+p.getAge());
           System.out.println("                Gender: "+p.getGender());
           System.out.println();
           System.out.println();
       }
   }
   public void editUser(){
        this.displayAll();
       System.out.print("Enter unique ID of the person: ");
       int ID = scanData.nextInt();
       for (Person p: persons){
           if(p.id == ID){

           }
       }
   }
}

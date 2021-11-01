package logic;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import models.Person;
import models.Gender;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("person_store.txt"));
        BufferedWriter fileWriter = new BufferedWriter(new OutputStream(new File"C:\\courses\\Java\\person_register\\src\\person_store.txt", true)));
        ArrayList<Person> persons = new ArrayList<Person>();
        Person person = new Person();
        Boolean finishedScanning = false;
        Scanner scanData = new Scanner(System.in);
       try {
           System.out.print("How many people do you want to record?: ");
           int numberOfPeople = scanData.nextInt();
           for (int i =0; i<numberOfPeople; i++){

               System.out.print("p"+(i+1)+" firstName: ");
               person.setFirstName(scanData.next());
               System.out.print("p"+(i+1)+" lastName: ");
               person.setLastName(scanData.next());
               System.out.print("p"+(i+1)+" Age: ");
               person.setAge(scanData.next());
               System.out.print("p"+(i+1)+" Gender: ");
               person.gender=Gender.valueOf(scanData.next());
               String dataToAppend = person.getFirstName()+" "+person.getLastName()+" "+person.getAge()+" "+person.getGender()+"\n";
               fileWriter.append(dataToAppend);
               System.out.print(dataToAppend);
           }
           System.out.print("Added "+numberOfPeople+(numberOfPeople >1 ? " people ": " person ")+"successfully!");
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
       }catch (Exception e){
           e.printStackTrace();
       }
       finally {

           scanData.close();
           scanner.close();
       }

    }
}

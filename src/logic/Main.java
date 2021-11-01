package logic;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import models.Person;
import models.Gender;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("person_store.txt"));
        ArrayList<Person> persons = new ArrayList<Person>();

       try {
           while(scanner.hasNextLine()){
               StringTokenizer tokenizer = new StringTokenizer(scanner.nextLine(), " ");
               Person person = new Person();
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

    }
}

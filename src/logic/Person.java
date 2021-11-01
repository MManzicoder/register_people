


public class Person{

    private String firstName;
    private String lastName;
    private int age;
    //Enumeration variables demo
    public Gender gender;
    public Person(){};
    public Person(String firstName, String lastName, int age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String userInfoToString(){
        return "Hi "+firstName+ " "+lastName+ " You are "+age+ " Years old";
    }
}

package models;
public class Person{

    private String firstName;
    private String lastName;
    private String age;
    //Enumeration variables demo
    public Gender gender;
    public Person(){};
    public Person(String firstName, String lastName, String age, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setAge(String age){
        this.age =  age;
    }
    public String getBothNames(){
        return this.firstName+" "+this.lastName;
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
    public String getAge(){
        return this.age;
    }
    public Gender getGender(){
        return this.gender;
    }
    public String userInfoToString(){
        return "Hi "+firstName+ " "+lastName+ " You are "+age+ " Years old";
    }
}
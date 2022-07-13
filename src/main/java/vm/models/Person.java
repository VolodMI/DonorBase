package vm.models;



public class Person {
    private int id;
    private String name;
    private int age;
    private String email;
    private String phoneNumber;
    private String bloodType;
    private String rhD;
    private String sex;
    private String date;
    private int volume;


    public Person(int id, String name, int age, String sex, String email, String phoneNumber, String bloodType, String rhD,  String date, int volume) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.bloodType = bloodType;
        this.rhD = rhD;
        this.sex = sex;
        this.date = date;
        this.volume = volume;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getRhD() {
        return rhD;
    }

    public void setRhD(String rhD) {
        this.rhD = rhD;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Person() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
package org.example.learn;

public class Staff {
  private   String name ;
  private   int age ;
  private   String position;
  private String address;
  private   String gender ;

  // constructor

//// all args constructor
    public Staff(String name, int age, String position, String address, String gender) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.address = address;
        this.gender = gender;
    }

////     No Args constructo
    public Staff() {
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Staff s = new Staff();
        s.setName("Mr Matin");
        s.setAddress("Akerele");
        s.setAge(50);
        s.setGender("Male");
        System.out.println(s);
        Staff s2 = new Staff("Mr Philip", 55, "Senior Staff","Oniru", "male");

        System.out.println(s2);


    }
}

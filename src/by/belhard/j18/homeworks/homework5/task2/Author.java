package by.belhard.j18.homeworks.homework5.task2;

public class Author {
    public static final int noAge = 0;
    public static final String noName = "emptyName";
    public static final String noSurname = "emptySurname";

    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        this.setAge(age);
        this.setName(name);
        this.setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }else{
            this.name = noName;
        }
    }

    public void setSurname(String surname) {
        if(surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }else{
            this.surname = noSurname;
        }
    }

    public void setAge(int age) {
        if(age > 2) {
            this.age = age;
        }else{
            this.age = noAge;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        String result = "";
        if(!name.equals(null) && !name.isEmpty() && name != noName)
            result += "Имя автора " + name + ", ";
        if(!surname.equals(null) && !surname.isEmpty() && surname != noSurname)
            result += "фамилия автора " + surname + ", ";
        if(age != noAge && age > 0)
            result += "возраст автора " + age + ", ";
        return result;
    }
}

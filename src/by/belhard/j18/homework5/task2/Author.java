package by.belhard.j18.homework5.task2;

public class Author {
    private String name;
    private String surname;
    private int age;

    public Author(String name, String surname, int age) {
        if(name != null && !name.isEmpty()) {
            this.name = name;
        }else{
            this.name = "empty value";
        }

        if(surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }else{
            this.surname = "empty value";
        }

        if(age > 2) {
            this.age = age;
        }else{
            this.age = 123;
        }
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
            this.name = "empty value";
        }
    }

    public void setSurname(String surname) {
        if(surname != null && !surname.isEmpty()) {
            this.surname = surname;
        }else{
            this.surname = "empty value";
        }
    }

    public void setAge(int age) {
        if(age > 2) {
            this.age = age;
        }else{
            this.age = 123;
        }
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Имя автора " + name + ", " +
                "фамилия автора " + surname + ", " +
                "возраст автора " + age;
    }
}

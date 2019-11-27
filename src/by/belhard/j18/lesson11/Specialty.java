package by.belhard.j18.lesson11;

public class Specialty {
    private int id;

    private String specialty;

    @Override
    public String toString() {
        return "Specialty{" +
                "id=" + id +
                ", specialty='" + specialty + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Specialty(int id, String specialty) {
        this.id = id;
        this.specialty = specialty;
    }
}

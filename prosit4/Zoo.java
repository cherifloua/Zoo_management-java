package tn.esprit.entities;

public class Animal {

    private int age;
    private String family;
    private String name;
    private boolean isMammal;

    public Animal() {
    }

    public Animal(int age, String family, String name, boolean isMammal) {
        setAge(age);
        this.family = family;
        this.name = name;
        this.isMammal = isMammal;
    }

    // Getter & Setter age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0) {
            System.out.println("L'âge ne peut pas être négatif.");
        } else {
            this.age = age;
        }
    }

    // Getters & Setters
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", isMammal=" + isMammal +
                '}';
    }
}
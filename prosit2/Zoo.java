public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo(String name,String city,int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo(){
        System.out.println("zoo nom: "+name);
        System.out.println("cité: "+city);
        System.out.println("nombre de cage "+nbrCages);
    }
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {

        Aquatic aquatic1 = new Aquatic();
        Terrestrial terrestrial1 = new Terrestrial();
        Dolphin dolphin1 = new Dolphin();
        Penguin penguin1 = new Penguin();

        Aquatic aquatic = new Aquatic(
                "Fish",
                "Nemo",
                2,
                false,
                "Ocean"
        );

        Terrestrial terrestrial = new Terrestrial(
                "Lion",
                "Simba",
                5,
                true,
                4
        );

        Dolphin dolphin = new Dolphin(
                "Dolphin",
                "Flipper",
                4,
                true,
                "Sea",
                35.5f
        );

        Penguin penguin = new Penguin(
                "Penguin",
                "Pingu",
                3,
                false,
                "Iceberg",
                120.0f
        );

        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);

        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
public record Person1(String name, int age) {

    public Person1 {
        if (age < 0) {
            System.out.println("Uwaga: Podano ujemny wiek. Ustawiamy na 0.");
            age = 0;
        }
    }


}

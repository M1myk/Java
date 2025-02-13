package healthcare;

public class TestHospital {
    public static void main(String[] args)
    {
        Hospital hospital1 = new Hospital("Szpital Miejski", 83);
        Hospital hospital2 = new Hospital("Szpital Wiejski", -10);
        Clinic clinic1 = new Clinic("Szpital Miejski", 83, 3);
        Clinic clinic2 = new Clinic("Klinika", 40, 6);
        Clinic clinic3 = new Clinic("Szpital Miejski", 83, -2);

        System.out.println(hospital1);
        System.out.println(hospital2);
        System.out.println(clinic1);
        System.out.println(clinic2);
        System.out.println(clinic3);


        System.out.println(hospital1.equals(clinic1));
        System.out.println(hospital1.equals(clinic2));
        System.out.println(clinic1.equals(clinic3));
        System.out.println(hospital1.equals(hospital2));
        System.out.println(clinic2.equals(clinic3));



    }
}

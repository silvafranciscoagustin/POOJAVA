package tp5_1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Sistema s1 = new Sistema("PVZ");
        Planta p1 = new Planta("Yatch Coj","YTC","Malasya", LocalDate.of(2023,06,12));
        Planta p2 = new Planta("Yatch Coj","YTC","Malasya", LocalDate.of(2023,06,12));


        s1.plantas.add(p1);
        s1.plantas.add(p2);

        System.out.println(s1.plantas.get(0).getId());
        System.out.println(s1.plantas.get(1).getId());
    }
}

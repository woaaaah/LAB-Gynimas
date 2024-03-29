import java.util.*;

public class Main {

    public static void main(String[] args) {


        Studentas Tomas = new Studentas(58458754, "Tomas Tomauskas", 1998, "J19", 2);
        Studentas Petras = new Studentas(58954587, "Petras Petraitis", 1995, "J19", 8);
        Studentas Arnoldas = new Studentas(98584856, "Arnoldas Arnoldauskas", 1993, "S19", 1);
        Studentas Justas = new Studentas(652314524, "Justas Justauskas", 1994, "G19", 3);
        Studentas Dovydas = new Studentas(65321456, "Dovydas Dovydauskas", 1998, "T19", 5);
        Studentas Raimondas = new Studentas(98562145, "Raimondas Raimondauskas", 1991, "Y19", 7);
        Studentas Romas = new Studentas(59654125, "Romas Romauskas", 1999, "U19", 4);
        Studentas Migle = new Studentas(58456954, "Migle Migliauskiene", 1994, "P19", 10);
        Studentas Ieva = new Studentas(12354698, "Ieva Ievauskiene", 1996, "L19", 7.3);
        Studentas Akvile = new Studentas(58455854, "Akvile Akviliaukaite", 1992, "J19", 5.5);


        ArrayList<Studentas> studentai = new ArrayList();
        studentai.add(Tomas);
        studentai.add(Petras);
        studentai.add(Arnoldas);
        studentai.add(Justas);
        studentai.add(Dovydas);
        studentai.add(Raimondas);
        studentai.add(Romas);
        studentai.add(Migle);
        studentai.add(Ieva);
        studentai.add(Akvile);


        System.out.println("Visi fakulteto studentai");
        System.out.println(studentai);


        System.out.println("\n Studentai pagal pazanguma nuo geriausio");
        studentai.sort(Comparator.comparing(Studentas::getVidurkis, Collections.reverseOrder()));
        System.out.println(studentai);


        System.out.println("\n Pasalinti studentai kuriu vidurkis maziau nei 4");
        studentai.removeIf(obj -> obj.getVidurkis() < 4);
        System.out.println(studentai);

        Scanner S = new Scanner(System.in);
        System.out.println("\n Studentu kiekvienoi grupei skaicaivimas");
        System.out.println("Iveskite grupe");
        String stugrupe = S.nextLine();
        System.out.println("Studentu skaicius grupeje"+gautiFakultetoStudentus(stugrupe,studentai));
    }

    public static int gautiFakultetoStudentus(String grupe, ArrayList studentai) {
        int studentuskaicius=0;
        for (Studentas fakultetas1 : (Iterable<Studentas>) studentai) {
            if (fakultetas1.getGrupe().equals(grupe)) {
                studentuskaicius++;
            }
        }
        return studentuskaicius;
    }
}





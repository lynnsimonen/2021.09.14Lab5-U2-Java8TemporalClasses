package edu.wctc;
import java.time.*;
import java.time.temporal.ChronoField;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        LocalDate today = LocalDate.now();
        LocalDate theJoshuaTree = LocalDate.of(1987, 3, 9);
        System.out.println("The Joshua Tree Album release: "
                + theJoshuaTree.getMonthValue() + "/" + theJoshuaTree.getDayOfMonth() + "/" + theJoshuaTree.getYear());
        LocalDate rattleAndHum = LocalDate.of(1988, 10, 10);
        System.out.println("Rattle & Hum Album release: "
                + rattleAndHum.getMonthValue() + "/" + rattleAndHum.getDayOfMonth() + "/" + rattleAndHum.getYear());

        Period p1 = Period.between(theJoshuaTree, today);
        System.out.println();
        System.out.println("The period of time from the date of release of The Joshua Tree album to now is: "
                + p1.getYears() + " Years, " + p1.getMonths() + " Months and " + p1.getDays() + " Days.");

        Period p2 = Period.between(theJoshuaTree, rattleAndHum);
        //System.out.println("Time period between %s and %s: %s", LocalDate.of(theJoshuaTree), LocalDate.of(rattleAndHum).get(), p2);
        System.out.println("The period of time from the date of release of The Joshua Tree album to the Rattle and Hum album is: "
                + p2.getYears() + " Years, " + p2.getMonths() + " Months and " + p2.getDays() + " Days.");

        //Date that is p2 after rattleAndHum
        System.out.println();

        LocalDate thirdU2Album = rattleAndHum.plusDays(p2.getDays()).plusMonths(p2.getMonths()).plusYears(p2.getYears());

        Period p3 = Period.between(rattleAndHum, thirdU2Album);

        System.out.println("Hypothetical 3rd U2 Album release: " + thirdU2Album.getMonthValue() + "/" + thirdU2Album.getDayOfMonth() + "/" + thirdU2Album.getYear());

        System.out.println("The period of time from the date of release of Rattle & Hum album to Hypothetical album is: "
                + p3.getYears() + " Years, " + p3.getMonths() + " Months and " + p3.getDays() + " Days.");
    }
}
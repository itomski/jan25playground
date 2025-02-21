package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class DateTest1 {

    public static void main(String[] args) {

        // Alt
        // Deprecated: Sollte nicht mehr verwendet werden
        Date datum = new Date(); // Aktuelles Datum
        System.out.println(datum);
        datum = new Date(125, 10, 15);
        System.out.println(datum);

        System.out.println();

        System.out.println(LocalDate.now()); // now = aktuelles Datum
        LocalDate ld = LocalDate.of(2020, 1, 22);
        System.out.println(ld);
        System.out.println(LocalDate.of(2020, Month.JANUARY, 22));

        System.out.println();

        System.out.println(LocalTime.now()); // now = aktuelle Zeit
        LocalTime lt = LocalTime.of(18, 22);
        System.out.println(lt);
        System.out.println(LocalTime.of(18, 22, 37, 125));

        System.out.println();

        System.out.println(LocalDateTime.now()); // now = aktuelle Zeit und Datum
        System.out.println(LocalDateTime.of(ld, lt));
        System.out.println(LocalDateTime.of(2022, 10, 15, 17, 35));

        // LocalDate, LocalTime, LocalDateTime sind Immutable

        System.out.println();
        // Bei LocalDaten kann nur Jahr, Monat und Tag benutzt werden
        System.out.println(ld.plusDays(7));
        ld = ld.plusDays(7); // Referenz wird geändert - Zeigt auf das neue LocalDate Objekt
        System.out.println(ld.plusMonths(2));
        System.out.println(ld.plusYears(20));
        System.out.println(ld.plus(20, ChronoUnit.DAYS));

        // Bei LocalTime kann nur Stunde, Minute, Sekunde und Nanosekunde benutzt werden

        LocalDate ld2 = LocalDate.now();
        ld2 = ld2.plusDays(20); // Neues Objekt wird auf die alte Referenz abgelegt

        System.out.println();
        LocalDate ld3 = LocalDate.of(2025, 1, 31);
        System.out.println(ld3);
        System.out.println(ld3.plusMonths(1));
        System.out.println(ld3.plusDays(30));
        //ld3 = LocalDate.of(2025, 2, 29);
        System.out.println(ld3);

        System.out.println();
        LocalDate heute = LocalDate.now();
        LocalDate buchung = LocalDate.of(2025, 1, 15);

        if(buchung.isBefore(heute)) {
            System.out.println("Die Buchung MUSS in der Zukunft liegen!");
        }

        // Locale.setDefault(Locale.US);

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(buchung.format(DATE_FMT)); // Formatiert die Ausgabe nach der Vorgabe des Formatters

        Scanner scanner = new Scanner(System.in);
        System.out.print("Datum: ");
        String eingabe = scanner.next();

        // 27.04.2015
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate eingegebenesDatum = LocalDate.parse(eingabe, fmt); // Einlesen nach einem vorgegebenen Muster
        System.out.println(eingegebenesDatum);

        ld = LocalDate.now().minusYears(2500);

        fmt = DateTimeFormatter.ofPattern("yyyy G");
        System.out.println(ld.format(fmt));

        fmt = DateTimeFormatter.ofPattern("uuuu");
        System.out.println(ld.format(fmt));
    }
}

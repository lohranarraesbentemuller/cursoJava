package aplicacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa {

	public static void main(String[] args) {
		DateTimeFormatter fmt1=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDate d01= LocalDate.now();
		LocalDateTime d02=LocalDateTime.now();
		Instant d03=Instant.now();
		
		LocalDate d04=LocalDate.parse("2022-07-20");
		LocalDateTime d05=LocalDateTime.parse("2022-07-20T01:30:30");
		LocalDate d06=LocalDate.parse("25/01/2023",fmt1);
		LocalDateTime d07=LocalDateTime.parse("25/01/2023 07:30:22",fmt2);
		LocalDate d08=LocalDate.of(2023,01, 25);
		LocalDateTime d09=LocalDateTime.of(2023,01, 25,12,12,12);
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d05);
		System.out.println(d06);
		System.out.println(d07);
		System.out.println(d08);
		System.out.println(d09);
		
		LocalDate semanaPassada=LocalDate.parse("2022-01-26").minusDays(7);
		LocalDate semanaQueVem=LocalDate.parse("2022-01-26").plusDays(7);
		System.out.println(semanaPassada);
		System.out.println(semanaQueVem);
		Duration t1=Duration.between(semanaPassada.atStartOfDay(),semanaQueVem.atStartOfDay());
        System.out.println(t1.toDays());
	}

}

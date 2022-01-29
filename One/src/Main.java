import java.util.*;

public class Main {

    public static void main(String[] args) {

        Person kalle = new Person("Kalle", "male", 30000);
        Person stina = new Person("Stina", "female", 40000);
        Person olga = new Person("Olga", "female", 34000);
        Person bobby = new Person("Bobby", "female", 50000);
        Person kim = new Person("Kim", "female", 25000);
        Person olivia = new Person("Olivia", "female", 40400);
        Person mohammad = new Person("Mohammad", "male", 37000);
        Person charlie = new Person("Charlie", "female", 32000);
        Person erik = new Person("Erik", "male", 39000);
        Person klaes = new Person("Klaes", "male", 47000);

        List<Person> people = new ArrayList<>(Arrays.asList(kalle, stina, olga, bobby, kim, olivia, mohammad, charlie, erik, klaes));


        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println("-------------------------UPPGIFT 1----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------------------------------");


        Long nmbOfFemales = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "female"))
                .count();

        double maleSalary = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "male"))
                .map(Person::getSalary).mapToDouble(Double::doubleValue).sum();

        double femaleSalary = people.stream()
                .filter(x -> Objects.equals(x.getGender(), "female"))
                .map(Person::getSalary).mapToDouble(Double::doubleValue).sum();

        System.out.println("1.1");
        System.out.println("Medellönen för kvinnor är " + (femaleSalary / nmbOfFemales) + "kr i månaden");
        System.out.println("Medellönen för män är " + (maleSalary /  (10 - nmbOfFemales)) +"kr i månaden\n");

        System.out.println("1.2");
        Person richest = people.stream()
                .sorted(Comparator.comparing(Person::getSalary).reversed())
                .limit(1).min(Comparator.comparing(Person::getSalary)).get();
        System.out.println(richest.getName() + " tjänar mest med " + (int)richest.getSalary() + "kr i månaden.\n");

        System.out.println("1.3");
        Person poorest = people.stream()
                .sorted(Comparator.comparing(Person::getSalary))
                .limit(1).min(Comparator.comparing(Person::getSalary)).get();
        System.out.println(poorest.getName() + " tjänar minst med " + (int)poorest.getSalary() + "kr i månaden.\n");
    }
}


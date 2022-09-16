import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


     int c =     Stream
                .iterate(1, A -> A + 1)
                .limit(10000)
                .filter( A -> A%3 == 0)
                .filter( A -> A%5 == 0)
                .filter( A -> A%7 != 0)
                .mapToInt(A -> A)
                .sum();

        System.out.println(c);

                 Stream
                .iterate(1, A -> A + 1)
                .filter( A -> A%2 == 0)
                .filter( A -> A%8 != 0)
                .limit(100)
                .forEach(A -> System.out.print(A + " "));


        Stream<Book> list = Stream.of(new Book("java", 99), new Book("python", 50), new Book("varecha", 500));

        System.out.println("\nPrice under 100 and sorted: ");
                list
                .filter( A -> A.getPrice() < 100)
                .map(Book::getName).sorted()
                .forEach(A -> System.out.println( A + " "));


        Stream<Book> list2 = Stream.of(new Book("java", 99), new Book("python", 50), new Book("varecha", 500));

        System.out.println("Count of book with nane shorter than 5 character: " + list2
                .filter( A -> A.getName().length() < 5)
                .count());


        Stream<Book> list3= Stream.of(new Book("java", 99), new Book("python", 50), new Book("varecha", 500));

        System.out.println("Average price is " + list3
                .mapToInt(Book::getPrice)
                .average().getAsDouble());


        Stream<Book> list4= Stream.of(new Book("java", 99), new Book("python", 50), new Book("varecha", 500));

        System.out.println("Cheaper than 500 ? " + list4
                .noneMatch( A -> A.getPrice() >= 500));


    }
}
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> primeNumbers = new ArrayList<>();
        MultiThread a = new MultiThread(1, 1, 250000);
        MultiThread b = new MultiThread(2,250001, 500000);
        a.start();
        b.start();
        a.join();
        b.join();
        primeNumbers.addAll(a.getReturner());
        primeNumbers.addAll(b.getReturner());
        System.out.println("Listan innehåller nu alla primtal mellan 1-500 000, jag besparar dig en uskrift men konstaterar att det finns " + primeNumbers.size() +
                " objekt i listan");

      /*
                    Alternativt sätt

      Predicate<Integer> isPrimeNumber = n -> {
            if(n == 1||n == 0){
                return false;
            }
            for(int i = 2; i < n; i++){
                if(n%i == 0){
                    return false;
                }
            }
            return true;
        };

        List<Integer> optumusPrimerNumber = IntStream.range(1, 500000)
                .parallel()
                .filter(isPrimeNumber::test).boxed()
                .toList();

       );
*/
    }
}


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class MultiThread  extends Thread {

    private Thread t;
    private final int threadName;
    private final int x;
    private final int y;
    private List<Integer> returner;

    MultiThread(int threadName, int x, int y){
        this.threadName = threadName;
        this.x = x;
        this.y = y;
        System.out.println(threadName + " was just created");
    }

    @Override
    public  void run() {
        System.out.println("Running " + threadName);
        returner = primeCalc(x, y);
        System.out.println("Calc done" + threadName);

    }

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

    public List<Integer> primeCalc (Integer x, Integer y){
        System.out.println(this.threadName + " working");
        return IntStream.range(x, y)
                .filter(isPrimeNumber::test).boxed()
                .toList();
    }

   public List<Integer> getReturner() {
        return returner;
    }
}

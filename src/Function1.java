
import java.util.function.Function;

public class Function1 {

    public static void main(String[] args) {

        Integer intg = new Integer(3);
        if (args.length > 0) {
            // Todo impliment
        } else {
            Function<Integer, Integer> twice = new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer integer) {
                    return integer * 2;
                }
            };
            System.out.println(intg + "の2倍は" + twice.apply(intg));
        }
    }
}

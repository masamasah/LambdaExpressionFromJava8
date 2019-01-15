
import java.util.function.Function;

public class Function1 {

    public static void main(String[] args) {

        Integer intg = new Integer(3);
        if (args.length > 0) {
            switch (args[0]) {
                case "f1":
                default:
                    intg = 5;
                    Function<Integer, Integer> twiceLambda = (a) -> (a * 2);
                    System.out.println(intg + "の2倍はLambdaで描いても" + twiceLambda.apply(intg));
            }

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

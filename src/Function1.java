
import java.util.function.Function;
import java.util.function.BiFunction;

public class Function1 {

    public static void main(String[] args) {

        Integer intg = new Integer(3);
        if (args.length > 0) {
            switch (args[0]) {
                case "f1":
                    intg = 5;
                    Function<Integer, Integer> twiceLambda = (a) -> (a * 2);
                    System.out.println(intg + "の2倍はLambdaで描いても" + twiceLambda.apply(intg));
                case "f2":
                    intg = 7;

                    Function<Integer, String> triple = new Function<Integer, String>() {
                        @Override
                        public String apply(Integer integer) {
                            return integer + "の3倍は" + integer * 3;
                        }
                    };

                    System.out.println(triple.apply(intg));
                case "bf1":
                default:
                    intg = 2;

                    BiFunction<Integer, Integer, Integer> add = (a, b) -> (a + b);
                    System.out.println(intg + "と" + "5の和は" + add.apply(intg, 5));


            }

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

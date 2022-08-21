import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //Черты функционального стиля:
        // данные не изменяются и ипользуется детерминированная функция без побочных эффектов
        final String phrase = "тебе тебе уважаемый и человек и и здоровья и побольше а";
        Function<String, List<String>> valueConverter = x -> {
            String[] arr1 = x.split(" ");
            List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
            Stream stream1 = list1.stream();
            List<String> str1 = (List<String>) stream1.sorted(Comparator.naturalOrder()).distinct().collect(Collectors.toList());
            return str1;
        };
        for (String s : valueConverter.apply(phrase)) {
            System.out.println(s);
        }

    }
}
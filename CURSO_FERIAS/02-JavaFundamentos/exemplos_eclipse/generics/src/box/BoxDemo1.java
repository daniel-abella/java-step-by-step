package box;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class BoxDemo1 {
    public static void main(String[] args) {

    		List<String> lista =
    				Arrays.asList("maçã","banana", "melão");


        Box<Integer, List<Pessoa>, Pessoa> integerBox =
        		new Box<Integer, List<Pessoa>,Pessoa>();
        integerBox.add(10);
        Integer someInteger = integerBox.get();
        System.out.println(someInteger);

        System.out.println(integerBox.listToString(lista));

    }
}
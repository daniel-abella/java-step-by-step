package box;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Box<T extends Number,
				 S extends List<? extends Comparable<R>>,
				 R> {

    private T object;

    public void add(T object) {
        this.object = object;
    }

    public T get() { return object; }

    public String listToString(S list){

    		return Arrays.toString(list.toArray());
    }

}
package module8;

import java.util.List;

public class CollectionPrint {

    public static void print(List<? extends Object> list){

        list.stream().forEach(element -> System.out.println(element.toString()));
    }

}
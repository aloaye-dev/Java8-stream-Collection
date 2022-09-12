package com.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamObject {
    //create a stream of array

    public static void main (String [] args){
    Stream<String> stream = Stream.of("a" , "b" , "c");
    stream.forEach(System.out::println);
    //create a stream for sources
        Collection<String> collection = Arrays.asList("JAVA", "J2EE" , "Spring" , "Hibernate");
        Stream<String> stream2 = collection.stream();
        stream2.forEach(System.out::println);
        ///////////////////////////////////////////////////////////

        List<String> list = Arrays.asList("JAVA", "J2EE" , "Spring" , "Hibernate");
        Stream<String> stream3 = collection.stream();
        stream3.forEach(System.out::println);





    }
}

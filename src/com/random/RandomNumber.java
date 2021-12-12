package com.random;

import java.util.*;
import java.util.stream.*;

public class RandomNumber {
    public static void main(String args[])
    {
        List<Integer> numberList=new ArrayList<>();
        Random random=new Random();
        random.ints(100,1,100).forEach(numberList::add);
        List<Integer> streamList=numberList.stream().filter(number->IntStream.rangeClosed(2,number/2).noneMatch(i->number%i==0)).collect(Collectors.toList());
        System.out.println(streamList);

    }
}

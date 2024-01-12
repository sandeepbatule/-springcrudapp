package com.examples.persistent;

import java.util.*;
import java.util.stream.Collectors;

public class ApplicationForToppers {
    public static void main(String[] args) {
       List<Toppers> toppersList = new ArrayList<>();
        toppersList.add(new Toppers("john","Phy",45));
        toppersList.add(new Toppers("Dave","Phy",67));
        toppersList.add(new Toppers("Dave","Maths",82));
        toppersList.add(new Toppers("john","Maths",91));
        toppersList.add(new Toppers("Chris","Eng",70));
        toppersList.add(new Toppers("John","Eng",88));

        Map<String, Toppers> collect = toppersList.stream()
                .collect(Collectors.groupingBy(Toppers :: getSubect, Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(t -> t.getGrade())), Optional :: get)));
        System.out.println(collect);
    }
}

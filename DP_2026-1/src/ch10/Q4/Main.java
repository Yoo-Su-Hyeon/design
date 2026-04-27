package ch10.Q4;

import java.util.*;

class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        // 사전순으로 작은 순서
        list.sort(new Comparator<String>(){
            @Override
            public int compare(String s1, String s2){

            }
        }); // 오름차순을 위한 Comparator를 넣어줌
        System.out.println(list);

        // 사전순으로 큰 순서 (내림차순)
        list.sort( /* 미구현 */ ); //내림차순을 위한 Comparator를 넣어줌
        System.out.println(list);
    }
}

package ch10_5;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LottoStore {
    public static void main(String[] args) {
        Set<Integer> lottoSet = new HashSet<>();

        while (lottoSet.size() < 6){
            int number = (int)(Math.random()*45 + 1);
            if(lottoSet.contains(number) == false) {
                lottoSet.add(number);
            }
        }
        ArrayList<Integer> lottoList = new ArrayList<>(lottoSet);
        System.out.println(lottoList + " ");
        System.out.print("by 2017250035 이종수");
    }
}

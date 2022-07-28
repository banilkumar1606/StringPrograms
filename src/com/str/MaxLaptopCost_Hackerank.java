package com.str;

import java.util.Arrays;
import java.util.List;

public class MaxLaptopCost_Hackerank {
    public static void main(String[] args) {
        System.out.println(maxCost(Arrays.asList(0, 3, 2, 3, 4), Arrays.asList("legal", "legal", "illegal","legal", "legal"), 1));
    }

    public static int maxCost(List<Integer> cost, List<String> labels, int dailyCount) {
        int maxCost = 0;
        //Days
        for (int i = 0; i < labels.size(); i++) {
            int count = 0;
            int dailycost = 0;
            boolean countFound = false;
            //items

            //outloop
            for (int j = i; j < labels.size(); j++) {
                if (dailyCount == count) {
                    countFound = true;
                    break;
                }
                if (labels.get(j).equals("legal")) {
                    dailycost = dailycost + cost.get(j);
                    count++;
                } else {
                    dailycost = dailycost + cost.get(j);
                }
            }
            if (countFound && dailycost > maxCost) {
                maxCost = dailycost;
            }
        }
        return maxCost;
    }

}

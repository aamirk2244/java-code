package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static int solution(int[] A)
    {
        if(A.length == 0) return 0;
        List<Integer> d = new ArrayList<Integer>();
        d.add(A[0]);
        int dist_count = 1;
        boolean found = false;
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0 ; j < d.size(); j++)
            {
                if(A[i] == d.get(j))
                {
                    found = true;
                    break;
                }
                else
                {
                    found = false;

                }

            }
            if(!found)
            {

                d.add(A[i]);
                dist_count +=1 ;
            }
        }
        return dist_count;

    }
    public static void main(String[] args) {
	// write your code here+
        System.out.println("hello world");
//        int[] intArray = new int[]{ 2,1,12,34,123 };

        int[] intArray = new int[]{ 2,1,1,2,3, 1 };
        System.out.println(Main.solution(intArray));


    }
}


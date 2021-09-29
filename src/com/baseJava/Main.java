package com.baseJava;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 遍历字符串 =》 数字数组
        // 从前到后两个比较，如果前面大于后面，sum+=num前;
        //                否则，sum += (num后 - num前）;
        String s = "MDCXCV";
        ArrayList l = new ArrayList<Integer>();
        int sum = 0;

        for(int i=0; i< s.length(); i++){
            if (s.charAt(i) == 'I'){
                l.add(1);
            }else if(s.charAt(i) == 'V'){
                l.add(5);
            }else if(s.charAt(i) == 'X'){
                l.add(10);
            }else if(s.charAt(i) == 'L'){
                l.add(50);
            }else if(s.charAt(i) == 'C'){
                l.add(100);
            }else if(s.charAt(i) == 'D'){
                l.add(500);
            }else if(s.charAt(i) == 'M'){
                l.add(1000);
            }
        }

        System.out.println(l.toString());

        for (int i=0; i<l.size()-1; i++){

            if (Integer.parseInt(l.get(i).toString()) >= Integer.parseInt(l.get(i+1).toString())){
                sum += Integer.parseInt(l.get(i).toString());
                System.out.println("====");
                if (i == l.size()-2){
                    sum += Integer.parseInt(l.get(i+1).toString());
                }
                System.out.println(i);
            }else {
                sum += (Integer.parseInt(l.get(i+1).toString())-Integer.parseInt(l.get(i).toString()));
                i++;
                if (i == l.size()-2){
                    sum += Integer.parseInt(l.get(i+1).toString());
                }
                System.out.println("----");
                System.out.println(i);
            }

        }

        if (l.size()==1){
            sum += l.indexOf(0);
        }

        System.out.println(sum);
    }
}

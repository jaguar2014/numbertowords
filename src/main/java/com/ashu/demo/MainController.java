package com.ashu.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class MainController {

    @RequestMapping("/numbertowords")
    public String showNumberToWords() {

        Map<Integer,String> words = new HashMap<Integer,String>();
        words.put(1, "one");
        words.put(2, "two");
        words.put(3, "three");
        words.put(4, "four");
        words.put(5, "five");
        words.put(6, "six");
        words.put(7, "seven");
        words.put(8, "eight");
        words.put(9, "nine");
        words.put(10, "ten");
        words.put(11, "eleven");
        words.put(12, "twelve");
        words.put(13, "thirteen");
        words.put(14, "fourteen");
        words.put(15, "fifteen");
        words.put(16, "sixteen");
        words.put(17, "seventeen");
        words.put(18, "eighteen");
        words.put(19, "nineteen");
        words.put(20, "twenty");
        words.put(30, "thirty");
        words.put(40, "fourty");
        words.put(50, "fifty");
        words.put(60, "sixty");
        words.put(70, "seventy");
        words.put(80, "eighty");
        words.put(90, "ninety");
        words.put(100, "hundred");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = keyboard.nextInt();

        String results = "";

       if(words.containsKey(number)){
           results+=words.get(number);
       }


        return results;
    }
}
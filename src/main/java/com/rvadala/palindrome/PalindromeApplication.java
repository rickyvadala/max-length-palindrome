package com.rvadala.palindrome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class PalindromeApplication {

    public static void main(String[] args) {

        SpringApplication.run(PalindromeApplication.class, args);

        String param = "neuquen";

        String maxPalindrome = maxPalindrome(param);

        System.out.println(maxPalindrome);
    }

    /**
     * @param param is the String that we are going to search for the max length palindrome.
     * @return the max length palindrome
     * @author Ricardo Vadalá
     */
    public static String maxPalindrome(String param) {
        List<Character> charArray = param.toLowerCase().replaceAll("[^a-z]", "")
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.toList());

        List<Character> palindrome = new ArrayList<>();
        List<Character> deleted = new ArrayList<>();

        for (Character c : charArray) {
            if (palindrome.parallelStream().noneMatch(c::equals)) {
                List<Character> equalChars = charArray.parallelStream().filter(c::equals).collect(Collectors.toList());
                if (equalChars.size() % 2 != 0) {
                    deleted.add(equalChars.remove(0));
                }
                palindrome.addAll(palindrome.size() / 2, equalChars);
            }
        }
        if (deleted.size() > 0) {
            palindrome.add(palindrome.size() / 2, deleted.get(0));
        }
        return palindrome.toString().replaceAll("[^a-z]", "");
    }

    // O(n2)
}
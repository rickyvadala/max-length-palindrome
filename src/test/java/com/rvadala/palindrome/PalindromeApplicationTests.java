package com.rvadala.palindrome;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertEquals;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PalindromeApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void shortPalindrome() {
        String res = PalindromeApplication.maxPalindrome("abcdefghijklmnñopqrstuvwxyz");
        assertEquals(res, "a");
    }

    @Test
    void nonePalindrome() {
        String res = PalindromeApplication.maxPalindrome("?¡0123456789/*-+");
        assertEquals(res, "");
    }

    @Test
    void aPalindrome() {
        String res = PalindromeApplication.maxPalindrome("neuquen");
        assertEquals(res, "neuquen");
    }

    @Test
    void someTextPalindrome() {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Donec vitae lorem ut elit sodales feugiat. Nam et justo a nunc " +
                "posuere commodo quis ut leo. Donec porttitor sagittis nisl, non " +
                "eleifend magna placerat ut. Mauris id consectetur metus.";

        String palindrome ="lllllooooooooorrrrreeeeeeeeeeemmmmmiiiiiiiippsssssssuuuuuuddddtttttttttttaaaaaacccccnnnnnnggf" +
                        "efggnnnnnncccccaaaaaatttttttttttdddduuuuuusssssssppiiiiiiiimmmmmeeeeeeeeeeerrrrrooooooooolllll";
        String res = PalindromeApplication.maxPalindrome(text);
        assertEquals(res, palindrome);
    }


}

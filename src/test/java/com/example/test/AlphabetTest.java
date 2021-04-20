package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AlphabetTest {

  private final String s = "abcde";

  @Test
  void countVowels() throws Exception {
    int vowels = Alphabet.countVowels(s);
    assertEquals(16, vowels);
  }

  @Test
  void isVowel() {
  }
}
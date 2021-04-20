package com.example.test;

public class Alphabet {

  public static int countVowels(String s) {
    return (int) s.toLowerCase().chars().filter(Alphabet::isVowel).count();
  }

  public static boolean isVowel(int c) {
    if (c == 'a') {
      return true;
    }
    if (c == 'e') {
      return true;
    }
    if (c == 'i') {
      return true;
    }
    return false;
  }

}

package com.sintec.ratings.dao.impl;

/**
 * This is the Testclass to find minimum number of deletions and insertions
 *
 * @author jprabhu
 * @date Oct 30, 2020
 *
 */
public class TestChar {

  public static void main(String[] args) {
    String s1 = "jaga";
    String s2 = "jaga";
    System.out.println("Find the minimum operations for strings s1= " + s1 + ", s2= " + s2);
    printMinDelAndInsert(s1, s2);

    System.out.println("");
    System.out.println("#####################################");
    s1 = "Jagaaa";
    s2 = "jaga";
    System.out.println("Find the minimum operations for strings s1= " + s1 + ", s2= " + s2);
    printMinDelAndInsert(s1, s2);

    System.out.println("");
    System.out.println("#####################################");
    s1 = "Jagaaa";
    s2 = "jaga";
    System.out.println("Find the minimum operations for strings s1= " + s1 + ", s2= " + s2);
    printMinDelAndInsert(s1, s2);

    System.out.println("");
    System.out.println("#####################################");
    s1 = "JK";
    s2 = "j$";
    System.out.println("Find the minimum operations for strings s1= " + s1 + ", s2= " + s2);
    printMinDelAndInsert(s1, s2);

  }

  static int coomonSubLenth(String str1, String str2, int m, int n) {
    final int L[][] = new int[m + 1][n + 1];
    int i, j;
    for (i = 0; i <= m; i++) {
      for (j = 0; j <= n; j++) {
        if (i == 0 || j == 0) {
          L[i][j] = 0;
        } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
          L[i][j] = L[i - 1][j - 1] + 1;
        } else {
          L[i][j] = Math.max(L[i - 1][j], L[i][j - 1]);
        }
      }
    }
    return L[m][n];
  }

  static void printMinDelAndInsert(String str1, String str2) {
    final int m = str1.length();
    final int n = str2.length();
    final int len = coomonSubLenth(str1, str2, m, n);
    System.out.println("Minimum number of " + "deletions = " + (m - len));
    System.out.println("Minimum number of " + "insertions = " + (n - len));
  }
}

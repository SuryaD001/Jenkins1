package com.wipro;

import org.apache.commons.lang3.StringUtils;

public class StringUtls {

   public static void main(String[] args) {
       String str = "Hello, world!";
       System.out.println("Original String: " + str);
       System.out.println("Reversed String: " + StringUtils.reverse(str));
   }
}


package com.beta.replyservice;



import java.util.*;

import java.util.Scanner;

public class firstJ

{

               public static void main(String[] args)

               {

                               Scanner sc = new Scanner(System.in);

                               String s = sc.nextLine();

                              

                               //reverse the string

                               StringBuilder sb = new StringBuilder(s);

                               sb.reverse();

                              

                               //MD5 Algo

                               firstJ.displayJSON(String.valueOf(sb.hashCode()));

               }

              

               static void displayJSON(String ans)

               {

                               //I didn't know how to implement JSON in eclipse

               }

}
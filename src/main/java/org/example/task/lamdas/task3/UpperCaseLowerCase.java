package org.example.task.lamdas.task3;

public class UpperCaseLowerCase {
  public   static void  proccess(String input , StringProcess rodiya){
        System.out.println(rodiya.processString(input));

    }


    public static void main(String[] args) {
      proccess("CHISOM" , q-> q.toLowerCase());
        proccess("hello", s -> s.toUpperCase());

    }
}

package com.tut.Stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question_BalancedParenthisisProblem {
    
    public static boolean checkBalance(String expr)
    {
        Deque<Character> stack = new ArrayDeque<>();

        // push the expr
        for(int i=0;i<expr.length();i++)
        {
           if(expr.charAt(i)=='(' || expr.charAt(i)=='{'|| expr.charAt(i)=='[')
           {
               stack.push(expr.charAt(i));
           }

           else{

               char val = stack.peek();

               // exp = {{}}}{}
               // if you look closely above {{}} will be matched with pair, Thus, stack "Empty"
               //but an extra closing parenthesis like } will never be matched
               //so there is no point looking forward

               if(stack.isEmpty()){
                   return false;
               }
               else if(checkPair(stack.peek(),expr.charAt(i)))
               {
                   stack.pop();
                   continue;
               }
              else {
                   // will only come here if stack is not empty
                   // pair wasn't found and it's some closing parenthesis
                   //Example : {{}}(]

                   return false;
               }
           }
        }

        return stack.isEmpty();
    }

    public static boolean checkPair(char val1,char val2){
        return (( val1 == '(' && val2 == ')' ) || ( val1 == '[' && val2 == ']' ) || ( val1 == '{' && val2 == '}' ));
    }


    public static void main(String[] args) {

//        String expression = "{[]}"; // yes
        String expression = "((({})"; // No
        boolean result = checkBalance(expression);
        System.out.println(result?"Balanced":"Not Balanced");
        
    }


}

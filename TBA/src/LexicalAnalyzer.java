import java.util.*;
/**
 *
 * @author Rayhan Rahmanda
 */
public class LexicalAnalyzer {
    public static void main(String[] args) {
//        Stack stack = new Stack(); /* Make a New Stack For Characters*/
//        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input : ");
//        String s = input.nextLine(); /* Input String */
//        char[] arrayChar = s.toCharArray(); /* Every char in String s will be added to Array */
//        
//        /* Push every Char in arrayChar into Stack */
//        for (int i = arrayChar.length - 1; i >= 0; i--) {
//            stack.add(arrayChar[i]);
//        }
//        
//        System.out.print("\nToken : ");
//        /* Checking Process */
//        while(!stack.isEmpty()){
//            /* Token 1 (p,q,r,s) */
//            char pop = (char) stack.pop();
//            if (pop == 'p' || pop == 'q' || pop == 'r' || pop == 's'){
//                System.out.print(" 1 |");
//                
//            }
//            
//            /* Token 2 (not) */
//            if(pop == 'n'){
//                pop = (char) stack.pop();
//                if(pop == 'o'){
//                    pop = pop = (char) stack.pop();;
//                    if(pop == 't'){
//                        System.out.print(" 2 |");
//                        
//                    }
//                }
//            }
//            
//            /* Token 3 (and) */
//            if(pop =='a'){
//                pop = (char) stack.pop();
//                if(pop == 'n'){
//                    pop = (char) stack.pop();
//                    if(pop == 'd'){
//                        System.out.print(" 3 |");
//                    }
//                }
//            }
//            
//            /* Token 4 (or) */
//            if(pop == 'o'){
//                pop = (char) stack.pop();
//                if(pop == 'r'){
//                    System.out.print(" 4 |");
//                }
//            }
//            
//            /* Token 5 (xor) */
//            if(pop == 'x'){
//                pop = (char) stack.pop();
//                if(pop == 'o'){
//                    pop = (char) stack.pop();
//                    if(pop == 'r'){
//                        System.out.print(" 5 |");
//                    }
//                }
//            }
//            
//            /* Token 6 (if) */
//            if(pop == 'i'){
//                pop = (char) stack.pop();
//                if(pop == 'f'){
//                    System.out.print(" 6 |");
//                }
//            }
//            
//            /* Token 7 (then) */
//            if(pop == 't'){
//                pop = (char) stack.pop();
//                if(pop == 'h'){
//                    pop = (char) stack.pop();
//                    if(pop == 'e'){
//                        pop = (char) stack.pop();
//                        if(pop == 'n'){
//                            System.out.print(" 7 |");
//                        }
//                    }
//                }
//            }
//            
//            /* Token 8 (iff) */
//            if(pop == 'i'){
//                pop = (char) stack.pop();
//                if(pop == 'f'){
//                    pop = (char) stack.pop();
//                    if(pop == 'f'){
//                        System.out.print(" 8 |");
//                    }else{
//                        System.out.print("ERROR |");
//                    }
//                }
//            }
//            
//            /* Token 9 ( '(' ) */
//            if(pop == '('){
//                System.out.print(" 9 |");
//                while(pop != ')'){
//                    pop = (char) stack.pop();
//                    if (pop == 'p' || pop == 'q' || pop == 'r' || pop == 's'){
//                    System.out.print(" 1 |");
//                    }
//
//                    /* Token 2 (not) */
//                    if(pop == 'n'){
//                        pop = (char) stack.pop();
//                        if(pop == 'o'){
//                            pop = (char) stack.pop();
//                            if(pop == 't'){
//                                System.out.print(" 2 |");
//                            }
//                        }
//                    }
//
//                    /* Token 3 (and) */
//                    if(pop == 'a'){
//                        pop = (char) stack.pop();
//                        if(pop == 'n'){
//                            pop = (char) stack.pop();
//                            if(pop == 'd'){
//                                System.out.print(" 3 |");
//                            }
//                        }
//                    }
//
//                    /* Token 4 (or) */
//                    if(pop == 'o'){
//                        pop = (char) stack.pop();
//                        if(pop == 'r'){
//                            System.out.print(" 4 |");
//                        }
//                    }
//
//                    /* Token 5 (xor) */
//                    if(pop == 'x'){
//                        pop = (char) stack.pop();
//                        if(pop == 'o'){
//                            pop = (char) stack.pop();
//                            if(pop == 'r'){
//                                System.out.print(" 5 |");
//                            }
//                        }
//                    }
//
//                    /* Token 6 (if) */
//                    if(pop == 'i'){
//                        pop = (char) stack.pop();
//                        if(pop == 'f'){
//                            System.out.print(" 6 |");
//                        }
//                    }
//
//                    /* Token 7 (then) */
//                    if(pop == 't'){
//                        pop = (char) stack.pop();
//                        if(pop == 'h'){
//                            pop = (char) stack.pop();
//                            if(pop == 'e'){
//                                pop = (char) stack.pop();
//                                if(pop == 'n'){
//                                    System.out.print(" 7 |");
//                                }
//                            }
//                        }
//                    }
//
//                    /* Token 8 (iff) */
//                    if(pop == 'i'){
//                        pop = (char) stack.pop();
//                        if(pop == 'f'){
//                            pop = (char) stack.pop();
//                            if(pop == 'f'){
//                                System.out.print(" 8 |");
//                            }
//                        }
//                    }
//                    
//                    if(pop == ')'){
//                        System.out.print(" 10 |");
//                    }
//                }
//            }
//        }
//    }
//}

int i = 0;
        
        Stack stack = new Stack(); /* Make a New Stack For Characters*/
        Stack validasi = new Stack(); /* Make another Stack for Validation */
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String s = input.nextLine(); /* Input String */
        char[] arrayChar = s.toCharArray();
        int length = arrayChar.length;
        
        System.out.print("Token : |");
        while(i<length)
        {
            if(arrayChar[i] == ' '){
                i++;
            }
            /* Token 1 (p,q,r,s) */
            else if(arrayChar[i] == 'p' || arrayChar[i] == 'q' || arrayChar[i] == 'r' || arrayChar[i] == 's')
            {
                stack.push(arrayChar[i]);
                i++;
                System.out.print("1|");
                validasi.push(1);
            }

            /* Token 2 (not) */
            else if(arrayChar[i] == 'n' && arrayChar[i+1] == 'o' && arrayChar[i+2] == 't' && ((char)stack.peek() != 'p' && (char)stack.peek() != 'q' && (char)stack.peek() != 'r' && (char)stack.peek() != 's'))
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                stack.push(arrayChar[i+2]);
                System.out.print("2|");
                i = i+3;
                validasi.push(2);
            }

            /*Token 3 (and) */
            else if(arrayChar[i] == 'a' && arrayChar[i+1] == 'n' && arrayChar[i+2] == 'd' && !stack.empty())
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                stack.push(arrayChar[i+2]);
                System.out.print("3|");
                i = i+3;
                validasi.push(3);
            }
            
            /* Token 4 (or) */
            else if(arrayChar[i] == 'o' && arrayChar[i+1] == 'r' && !stack.empty())
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                System.out.print("4|");
                i = i+2;
                validasi.push(4);
            }
            
            /* Token 5 (xor) */
            else if(arrayChar[i] == 'x' && arrayChar[i+1] == 'o' && arrayChar[i+2] == 'r' && !stack.empty())
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                stack.push(arrayChar[i+2]);
                System.out.print("5|");
                i = i+3;
                validasi.push(5);
            }
            
            /* Token 6 (if) */
            else if(arrayChar[i] == 'i' && arrayChar[i+1] == 'f' && (arrayChar[i+2] == ' ')) // ||arrayChar[i+2] == 'p' || arrayChar[i+2] == 'q' || arrayChar[i+2] == 'r' || arrayChar[i+2] == 's' || arrayChar[i+2] == '(') && ((char)stack.peek() != 'p' && (char)stack.peek() != 'q' && (char)stack.peek() != 'r' && (char)stack.peek() != 's'))
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                System.out.print("6|");
                i = i+2;
                validasi.push(6);
            }

            /* Token 7 (then) */
            else if(arrayChar[i] == 't' && arrayChar[i+1] == 'h' && arrayChar[i+2] == 'e' && arrayChar[i+3] == 'n' && !stack.empty())
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                stack.push(arrayChar[i+2]);
                stack.push(arrayChar[i+3]);
                System.out.print("7|");
                i = i+4;
                validasi.push(7);
            }
            
            /* Token 8 (iff) */
            else if(arrayChar[i] == 'i' && arrayChar[i+1] == 'f' && arrayChar[i+2] == 'f' && !stack.empty())
            {
                stack.push(arrayChar[i]);
                stack.push(arrayChar[i+1]);
                stack.push(arrayChar[i+2]);
                System.out.print("8|");
                i = i+3;
                validasi.push(8);
            }
            
            /* Token 9 ('(') */
            else if(arrayChar[i] == '(')
            {
                stack.push(arrayChar[i]);
                i++;
                System.out.print("9|");
                validasi.push(9);
            }
            
            /* Token 10 (')') */
            else if(arrayChar[i] == ')')
            {
                int j = i-1;
                while(arrayChar[j] != '(')
                {
                    stack.pop();
                    j--;
                }
                stack.pop();
                stack.pop();
                i++;
                System.out.print("10|");
                validasi.push(10);
            }

            /* Error for else */
            else
                {
                    System.out.print("ERROR|");
                    i = length;
                    validasi.push(999);
                }
            }

            System.out.print("\nOutput : ");
            while(!validasi.empty())
            {
                validasi.pop();
                int temp = (int) validasi.peek();
//                if((int) validasi.peek() == 999)
//                {
//                    System.out.print("NOT VALID");
//                }
                if (validasi.empty()) {
                    System.out.print("VALID");
                }
                if ((int) validasi.peek() != 10 && temp == (int)validasi.peek()){
                    System.out.print("NOT VALID");
                }
            }
    }
}
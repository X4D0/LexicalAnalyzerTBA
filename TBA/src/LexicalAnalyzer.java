import java.util.*;
/**
 *
 * @author Rayhan Rahmanda
 */
public class LexicalAnalyzer {
    public static void main(String[] args) {
        int i = 0;
        int temp = 0;
        int k = 0;
        
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
            else if(arrayChar[i] == 'n' && arrayChar[i+1] == 'o' && arrayChar[i+2] == 't')
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
            else if(arrayChar[i] == 'i' && arrayChar[i+1] == 'f' && (arrayChar[i+2] == ' ' ||arrayChar[i+2] == 'p' || arrayChar[i+2] == 'q' || arrayChar[i+2] == 'r' || arrayChar[i+2] == 's' || arrayChar[i+2] == '('))
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
                k++;
            }
            
            /* Token 10 (')') */
            else if(arrayChar[i] == ')')
            {
                int j = i-1;
                while(arrayChar[j] != '(' && k != 0)
                {
                    stack.pop();
                    j--;
                    if (arrayChar[j] == '('){
                        k--;
                    }
                }
                stack.pop();
                //stack.pop();
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
                try{
                    if(validasi.peek().equals(999))
                    {
                        System.out.print("NOT VALID WOY\n");
                        break;
                    }

                    temp = (int)validasi.peek();
                    validasi.pop();

                    if (validasi.empty()) {
                        System.out.print("VALID\n");
                        break;
                    }

                    if(validasi.peek().equals(temp) && (int)validasi.peek() != 10 && k != 0){
                        System.out.print("NOT VALID KUNYUK\n");
                        break;
                    }else if ((temp == 2 || temp == 6 || temp == 9 && validasi.peek().equals(1))){
                        System.out.println("K = "+k);
                        System.out.print("NOT VALID\n");
                        break;
                    }
                }catch(EmptyStackException e){
                    //Nothing to do
                }
            }
    }
}

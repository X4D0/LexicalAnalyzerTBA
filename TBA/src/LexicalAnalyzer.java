import java.util.*;
/**
 *
 * @author Rayhan Rahmanda
 */
public class LexicalAnalyzer {
    public static void main(String[] args) {
        Stack stack = new Stack(); /* Make a New Stack For Characters*/
        
        Scanner input = new Scanner(System.in);
        System.out.print("Input : ");
        String s = input.nextLine(); /* Input String */
        char[] arrayChar = s.toCharArray(); /* Every char in String s will be added to Array */
        
        /* Push every Char in arrayChar into Stack */
        for (int i = arrayChar.length - 1; i >= 0; i--) {
            stack.add(arrayChar[i]);
        }
        
        System.out.print("\nToken : ");
        /* Checking Process */
        while(!stack.isEmpty()){
            /* Token 1 (p,q,r,s) */
            char pop = (char) stack.pop();
            if (pop == 'p' || pop == 'q' || pop == 'r' || pop == 's'){
                System.out.print(" 1 |");
                
            }
            
            /* Token 2 (not) */
            if(pop == 'n'){
                pop = (char) stack.pop();
                if(pop == 'o'){
                    pop = pop = (char) stack.pop();;
                    if(pop == 't'){
                        System.out.print(" 2 |");
                        
                    }
                }
            }
            
            /* Token 3 (and) */
            if(pop =='a'){
                pop = (char) stack.pop();
                if(pop == 'n'){
                    pop = (char) stack.pop();
                    if(pop == 'd'){
                        System.out.print(" 3 |");
                    }
                }
            }
            
            /* Token 4 (or) */
            if(pop == 'o'){
                pop = (char) stack.pop();
                if(pop == 'r'){
                    System.out.print(" 4 |");
                }
            }
            
            /* Token 5 (xor) */
            if(pop == 'x'){
                pop = (char) stack.pop();
                if(pop == 'o'){
                    pop = (char) stack.pop();
                    if(pop == 'r'){
                        System.out.print(" 5 |");
                    }
                }
            }
            
            /* Token 6 (if) */
            if(pop == 'i'){
                pop = (char) stack.pop();
                if(pop == 'f'){
                    System.out.print(" 6 |");
                }
            }
            
            /* Token 7 (then) */
            if(pop == 't'){
                pop = (char) stack.pop();
                if(pop == 'h'){
                    pop = (char) stack.pop();
                    if(pop == 'e'){
                        pop = (char) stack.pop();
                        if(pop == 'n'){
                            System.out.print(" 7 |");
                        }
                    }
                }
            }
            
            /* Token 8 (iff) */
            if(pop == 'i'){
                pop = (char) stack.pop();
                if(pop == 'f'){
                    pop = (char) stack.pop();
                    if(pop == 'f'){
                        System.out.print(" 8 |");
                    }
                }
            }
            
            /* Token 9 ( '(' ) */
            if(pop == '('){
                System.out.print(" 9 |");
                while(pop != ')'){
                    pop = (char) stack.pop();
                    if (pop == 'p' || pop == 'q' || pop == 'r' || pop == 's'){
                    System.out.print(" 1 |");
                    }

                    /* Token 2 (not) */
                    if(pop == 'n'){
                        pop = (char) stack.pop();
                        if(pop == 'o'){
                            pop = (char) stack.pop();
                            if(pop == 't'){
                                System.out.print(" 2 |");
                            }
                        }
                    }

                    /* Token 3 (and) */
                    if(pop == 'a'){
                        pop = (char) stack.pop();
                        if(pop == 'n'){
                            pop = (char) stack.pop();
                            if(pop == 'd'){
                                System.out.print(" 3 |");
                            }
                        }
                    }

                    /* Token 4 (or) */
                    if(pop == 'o'){
                        pop = (char) stack.pop();
                        if(pop == 'r'){
                            System.out.print(" 4 |");
                        }
                    }

                    /* Token 5 (xor) */
                    if(pop == 'x'){
                        pop = (char) stack.pop();
                        if(pop == 'o'){
                            pop = (char) stack.pop();
                            if(pop == 'r'){
                                System.out.print(" 5 |");
                            }
                        }
                    }

                    /* Token 6 (if) */
                    if(pop == 'i'){
                        pop = (char) stack.pop();
                        if(pop == 'f'){
                            System.out.print(" 6 |");
                        }
                    }

                    /* Token 7 (then) */
                    if(pop == 't'){
                        pop = (char) stack.pop();
                        if(pop == 'h'){
                            pop = (char) stack.pop();
                            if(pop == 'e'){
                                pop = (char) stack.pop();
                                if(pop == 'n'){
                                    System.out.print(" 7 |");
                                }
                            }
                        }
                    }

                    /* Token 8 (iff) */
                    if(pop == 'i'){
                        pop = (char) stack.pop();
                        if(pop == 'f'){
                            pop = (char) stack.pop();
                            if(pop == 'f'){
                                System.out.print(" 8 |");
                            }
                        }
                    }
                    
                    if(pop == ')'){
                        System.out.print(" 10 |");
                    }
                }
            }
        }
    }
}

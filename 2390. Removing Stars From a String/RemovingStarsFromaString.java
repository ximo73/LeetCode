import java.util.*;

class RemovingStarsFromaString {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();
        Stack<Character> aux = new Stack<Character>();
        String res = "";
        
        for (int i = s.length()-1; i >= 0; i--) {
            stack.push(s.charAt(i));
        }
        
        while (!stack.isEmpty() ) {
            if (stack.peek() == '*') {
                aux.pop();
            }else{
                aux.push(stack.peek());
            }	
            stack.pop();
        }

        for(int i = 0; i < aux.size(); i++){
            res += aux.get(i);
        }
        return res;
    }

    public static void main(String args[]){  
        RemovingStarsFromaString r = new RemovingStarsFromaString();
        System.out.println("resultado: "+r.removeStars("leet**cod*e"));
    }  
}

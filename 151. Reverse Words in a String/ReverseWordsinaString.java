import java.util.Stack;

class ReverseWordsinaString{

    public String reverseWords(String s) {
        Stack<String> aux = new Stack<String>();
        String stAux = "";
        String res = "";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' ' || i == s.length()-1){
                if(i == s.length()-1 && s.charAt(i) != ' '){
                    stAux += s.charAt(i);
                }
                if(stAux.length() > 0)
                    aux.push(stAux);
                stAux = "";
            }else{
                stAux += s.charAt(i);
            }
        }

        for(int i = aux.size(); i > 0; i--){
            if(i != 1)
                res += aux.pop() + " ";
            else
                res += aux.pop();
        }
        return res;
    }

    public static void main(String args[]){  
        ReverseWordsinaString r = new ReverseWordsinaString();
        System.out.println("." + r.reverseWords("  world hello  ") + ".");
    } 

}
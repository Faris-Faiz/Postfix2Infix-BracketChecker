public class bracketChecker {
    public static void main(String[] args) {
        Stack<Character> a = new Stack<>();

        String st = "(){}";
        System.out.println();
    }

    public boolean checkCorrectBracket(String s){
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            switch (c){
                case '{':
                case '[':
                case '(':
                    st.push(c);
                case '}':
                case ']':
                case ')':
                    if(!st.isEmpty()){
                        char ch = st.pop();
                        if(ch == '{' && c != '}' ||
                            ch == '[' && c != '}' ||
                            ch == '(' && c != ')' ){
                            System.out.println("Not valid bracket: " + c);
                            return false;
                        }
                    } else{
                        System.out.println("Not valid brackets");
                        return false;
                    }
                    break;
            }
        }
        if(!st.isEmpty()){
            System.out.println("Not valid bracket");
            return false;
        }
        return true;
    }
}
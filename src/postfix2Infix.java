public class postfix2Infix {
    public String convert(String expression){
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if(c == '*' || c == '/' || c == '^' || c == '+' || c == '-'){
                String s1 = stack.pop();
                String s2 = stack.pop();
                String temp = "(" + s2 + c + s1 + ")";
                stack.push(temp);
            }else {
                stack.push(c + "");
            }
        }

        String result = stack.pop();
        return result;
    }

    public static void main(String[] args) {
        String expression = "ABC*+";
        System.out.println("Postfix Expression: " + expression);
        System.out.println("Infix Expression: " + new postfix2Infix().convert(expression));
    }
}

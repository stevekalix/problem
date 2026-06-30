import java.util.Stack;

class Paratasis {
    public static void main(String[] args) {
        String s = "{[{()}]}";
        Stack<Character> st = new Stack<>();
        char ch[] = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == '(' || ch[i] == '[' || ch[i] == '{') {
                st.push(ch[i]);
            } else {

                if(st.isEmpty()){
                    System.out.println("false");
                    return ;
                }

                char top = st.peek();
                if (top == '(' && ch[i] == ')'
                        || top == '{' && ch[i] == '}'
                        || top == '[' && ch[i] == ']') {

                    st.pop();
                }
            }
        }
       System.out.println(st.isEmpty());
    }
}
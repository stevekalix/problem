import java.util.Stack;

class para {

    public static void main(String a[]) {

        String str = "()[]{}}";
        Stack<Character> st = new Stack<>();

        for (char ch : str.toCharArray()) {

            if (ch != ')' && st.peek() == ')' && !st.isEmpty() ||
                    ch != '}' && st.peek() == '}' && !st.isEmpty() ||
                    ch != ']' && st.peek() == ']' && !st.isEmpty()) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        while (!st.isEmpty()) {
            System.out.println(st);

        }

    }
}
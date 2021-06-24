package Practice;

public class Pallindrome {
    String str;
    public Pallindrome(String s1){
        str = s1;
    }
    public boolean checkPallindrome(){
        String s = "";
        int c = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                s = s + str.charAt(i);
        }
        Stack stack = new Stack(str.length());
        Queue queue = new Queue(str.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
            queue.enqueue(s.charAt(i));
        }
        for (int i = 0; i < s.length(); i++) {
            if(stack.pop() == queue.dequeue())
                c++;
        }
        if (c == s.length())
            return true;
        else
            return false;
    }

}
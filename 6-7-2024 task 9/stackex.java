import java.util.Stack;

public class stackex {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Adding elements to the stack
        stack.push(101);
        stack.push(201);
        stack.push(301);
        stack.push(401);
        stack.push(501);

//1. Removing elements from the stack
        System.out.println("Popped element: " + stack.pop());  
        System.out.println("Popped element: " + stack.pop());
         // Checking the current stack
         System.out.println("Current stack: " + stack);  


// 2. Peeking the top element without removing it
        System.out.println("Top element: " + stack.peek());  
        // Checking the current stack
        System.out.println("Current stack: " + stack);  




 //3. Check if the stack is empty
        Stack<Integer> s = new Stack<>();
        System.out.println("Is stack empty? " + s.isEmpty());  
        // Adding elements to the stack
        s.push(1);
        s.push(2);
        // Check if the stack is empty
        System.out.println("Is stack empty? " + s.isEmpty()); 

 //4.   Iterating over the stack
        System.out.println("Elements in stack:");
        for (Integer element : stack) {
        System.out.println(element);
    }
//5. Pop each character from the stack to reverse the string
 StringBuilder reversed = new StringBuilder();
 while (!stack.isEmpty()) {
     reversed.append(stack.pop());
 }
    System.out.println("Reversed string: " + reversed.toString());    


    }
}
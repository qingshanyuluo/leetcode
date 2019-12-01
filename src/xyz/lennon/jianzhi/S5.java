package xyz.lennon.jianzhi;

import java.util.Stack;

/**
 * S5
 */
public class S5 {
    
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            stack2.add(stack1.pop());
        }
        int result = stack2.pop();
        size = stack2.size();
        for (int i = 0; i < size; i++) {
            stack1.add(stack2.pop());
        }
        return result;
    }

    public static void main(String[] args) {
        S5 queue = new S5();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.pop();
    }
}
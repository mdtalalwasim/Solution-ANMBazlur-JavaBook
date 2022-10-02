
package javaprogrammingproblem_bazlursbook;

import java.util.Arrays;
import java.util.StringJoiner;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
class CharStack{
private char[] elements; 
private int count;

public CharStack(){
    elements = new char[10];
}

public boolean isEmpty(){
    return count == 0;
}

public void push(char c){
    if (isFull()) {
        grow();
    }
    elements[count] = c;
    count++;
}

private boolean isFull(){
    return elements.length == count;
}

private void grow(){
    int newCapacity = elements.length * 2;
    elements = Arrays.copyOf(elements, newCapacity);
}

public char pop(){
    --count;
    return elements[count];
}

public int size(){
    return count;
}

public void printElements(){
    StringJoiner joiner = new StringJoiner(", ", "[", "]");
    for (int i = 0; i < count; i++) {
        joiner.add(String.valueOf(elements[i]));
    }
    System.out.println(joiner);
}

}



public class StackDemo {
    public static void main(String[] args) {
        CharStack stack = new CharStack();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');
        stack.push('e');
        stack.push('f');
        stack.push('g');
        stack.push('h');
        stack.push('i');
        stack.push('j');
        stack.push('k');
        stack.push('l');
        stack.push('m');
        stack.push('n');
        stack.push('o');
        stack.push('p');
        stack.push('q');
        stack.printElements();
        System.out.println("size is: "+stack.size());
        
       
        
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.printElements();
        System.out.println("size is: "+stack.size());
        
    }
}


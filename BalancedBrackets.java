import java.util.*;

public class BalancedBrackects
{
	public static void main(String[] args)
	{
		String st = "({[]})";
		
		if(isBalanced(st))
			System.out.println("Yes.");
		else
			System.out.println("No");
	}
	
	public static boolean isBalanced(String st)
	{
		//Deque<Character> myDequ = new ArrayDeque<Character>();
		Stack<Character> myStack = new Stack<Character>();
		
		for(int i = 0; i < st.length(); ++i)
		{
			char x = st.charAt(i);
			if(x == '(' || x == '{' || x == '[')
			{
				myStack.push(x);
				continue;
			}
		
		
			if(myStack.isEmpty())
				return false;
			char poppedChar;
		
			switch(x)
			{
			case ')':
				poppedChar = myStack.pop();
				if(poppedChar == '}' || poppedChar == ']')
					return false;
				break;
			case '}':
				poppedChar = myStack.pop();
				if(poppedChar == ')' || poppedChar == ']')
					return false;
				break;
			case ']':
				poppedChar = myStack.pop();
				if(poppedChar == ')' || poppedChar == '}')
					return false;
				break;
			}
			
		
		}
		
		return (myStack.isEmpty());
	
	}
}
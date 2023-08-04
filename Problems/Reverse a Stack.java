class Solution
{ 
    static void reverse(Stack<Integer> s)
    {
        // add your code here
        if(s.isEmpty())
        return;
        int temp=s.pop();
        reverse(s);
        insertAtBot(s,temp);
        
    }
    static void insertAtBot (Stack <Integer>stack,int ele)
    {
        if(stack.isEmpty())
        {
            stack.push(ele);
            return;
        }
        int temp=stack.pop();
        insertAtBot(stack,ele);
        stack.push(temp);
    }
    
    
}


class ReverseLinkedL{
      static Node head;
		public static class Node
		{
		int data;
		Node next;
			Node(int d)
			{
				data=d;
			}
		}
		public  ReverseLinkedL insert(ReverseLinkedL li,int data) 
		{
			Node newNode=new Node(data);
			newNode.next=null;
			
			if(head == null)
			{
				head=newNode;
			}
			else
			{
		      Node temp=head;
		      while(temp.next!=null)
		      {
		    	  temp=temp.next;
		      }
		      temp.next=newNode;
			}
			return li;
		}
        public  void display(ReverseLinkedL li)
        {
        	 Node temp = head; 
             while (temp != null) { 
                 System.out.println(temp.data); 
                 temp = temp.next; 
         } 
		}
        static void reverse()
        {
        	Node prev=null;
        	Node next=null;
        	Node curr=head;
        	while(curr!=null)
        	{
        		next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
        	}
        		head=prev;
        }
   public static void main(String arg[])
   {
	  ReverseLinkedL li=new  ReverseLinkedL();
		   li.insert(li, 10);
		   li.insert(li, 20);
		   li.insert(li, 30);
		   li.insert(li, 40);
		   li.display(li);
		   System.out.println("After Reverse");
		   reverse();
		   li.display(li);
   }
}
package com.cscnu.List;

public interface DoubleLinked {

	public boolean insert (Object data, int position);
	public boolean insertFirst (Object data);
	public boolean insertLast (Object data);

	public int search (Object data);
	
	public Node getFirst ();
	public Node getLast ();
	public Node getNode (int position);

	public int getSize ();
}

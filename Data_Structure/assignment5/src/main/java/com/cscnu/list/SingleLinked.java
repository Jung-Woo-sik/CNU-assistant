package com.cscnu.list;

public interface SingleLinked {

	public boolean insert (Object data, int position);
	public boolean insertFirst (Object data);
	public boolean insertLast (Object data);

	public int search (Object data);

	public boolean remove (int position);
	public boolean removeFirst ();
	public boolean removeLast ();

	public Node getFirst ();
	public Node getNode (int position);

	public int getSize ();

	public void printAll ();
}

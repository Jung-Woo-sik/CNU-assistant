package com.cscnu.DLLQueue;

public interface Queue {
	public void EnqueueFront (Object data);

	public void EnqueueRear (Object data);

	public Object DequeueFront();

	public Object DequeueRear();

	public Object getFront ();

	public Object getRear ();

	public int size ();

	public void printAll ();
}

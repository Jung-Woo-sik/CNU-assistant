package com.cscnu.Map;

public class HashMap implements Map{
	private static final int INITIAL_LENGTH = 1024;
	private Entry[] a = new Entry[INITIAL_LENGTH];
	private int size;

	public String get(String key){
		if(a[Math.abs(key.hashCode()%INITIAL_LENGTH)]!=null){
			return a[Math.abs(key.hashCode()%INITIAL_LENGTH)].value;
		}
		return null;
	}

	public String put(String key, String value){
		for(int i = 0; i <INITIAL_LENGTH; i++){
			if(a[i] != null && a[i].key.hashCode()%INITIAL_LENGTH == Math.abs(key.hashCode()%INITIAL_LENGTH)){
				return a[i].setValue(value);
			}
		}
		if(size == a.length){
			resize();
		}
		a[Math.abs(key.hashCode()%INITIAL_LENGTH)] = new Entry(key,value);
		return null;
	}

	private void resize(){
		Entry[] aa = new Entry[2*a.length];
		System.arraycopy(a,0,aa,0,a.length);
		a = aa;
	}

	public int size(){
		size = 0;
		int i;
		for( i = 0; i < a.length; i++){
			if(a[i] != null){
				size++;
			}
		}
		return size;
	}

	public String toString(){
		int i;
		StringBuffer buf = new StringBuffer();
		for(i = 0; i < INITIAL_LENGTH; i++){
			if(a[i] != null){
				buf.append(a[i]+"\n");
			}
		}
		return buf.toString();
	}
}

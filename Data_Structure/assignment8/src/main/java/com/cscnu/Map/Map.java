package com.cscnu.Map;

public interface Map {
	public String get (String key);

	public String put (String key, String value);

	public int size ();

	public String toString ();
}

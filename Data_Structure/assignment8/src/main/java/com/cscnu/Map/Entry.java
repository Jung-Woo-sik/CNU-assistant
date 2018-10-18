package com.cscnu.Map;

public class Entry {
	public String key, value;

	public Entry (String key, String value) {
		this.key = key;
		this.value = value;
	}

	public String setValue(String value) {
		String oldValue = this.value;
		this.value = value;
		return oldValue;
	}

	public String toString() {
		return key + ": " + value;
	}
}

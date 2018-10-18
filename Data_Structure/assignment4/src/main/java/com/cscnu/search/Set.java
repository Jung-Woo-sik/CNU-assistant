package com.cscnu.search;

public interface Set {
	public void add(Integer target);

	public boolean contains(Integer target);

	public Integer getFirst();

	public Integer getNext();

	public boolean remove(Integer target);

	public int size();

	public void allPrint();

	public void setBi(boolean isBi);

	public boolean getBi();

	public int searchIndex (Integer target);
}

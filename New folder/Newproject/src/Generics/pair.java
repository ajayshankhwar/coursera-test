package Generics;

public class pair<T,V> {
	private T first;
	private V second;

public pair(T first, V second)
{
	this.first = first;
	this.second = second;
}
public T getFirst()
{
	return first;
}
public void setFirst(T first)
{
	this.first = first;
}
public V getSecond()
{
	return second;
}
public void setSecond()
{
	this.second = second;
}
}
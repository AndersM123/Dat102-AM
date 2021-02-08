package main;

public class LinearNode<T> {
	
	private LinearNode<T> neste;
	private T element;
	
	public LinearNode() {
		neste = null;
		element = null;
	}
	/*
	 * Oppretter en tom node
	 */
	
	public LinearNode(T elem) {
		neste = null;
		element = elem;
	}
	/*
	 * Oppretter en node med et element
	 */
	
	public LinearNode<T> getNeste() {
		return neste;
	}
	/*
	 * Returnerer etterfølger
	 */
	public void setNeste(LinearNode<T> node) {
		neste = node;
	}
	/*
	 * Setter neste node
	 */
	
	public T getElement() {
		return element;
	}
	/*
	 * returnerer elementet til denne noden
	 */
	
	public void setElement (T elem) {
		element = elem;
	}
	
	/*
	 * Setter nytt element i denne noden
	 */
	
	

}

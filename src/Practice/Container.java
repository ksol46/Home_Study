package Practice;

public class Container<T, M> {

	private T Key;
	private M Value;
	
	public void set (T Key, M Value) {
		
	}
	
	public T getKey() {
		return Key;
	}
	public void setKey(T key) {
		this.Key = key;
	}
	public M getValue() {
		return Value;
	}
	public void setValue(M value) {
		this.Value = value;
	}	
}

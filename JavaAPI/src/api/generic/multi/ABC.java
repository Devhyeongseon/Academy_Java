package api.generic.multi;

public class ABC<A, B> {
	//멀티제네릭 (A, B를  타입으로 사용)
	private A key;
	private B value;
	
	public void setData(A key, B value) {
		this.key = key;
		this.value = value;
	}
	
	public B getValue(A key) {
		return value;
	}
	
	
	
	
}

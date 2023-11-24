package kr.or.ddit.basic;

class Util {
	/*
	 *제너릭메서드 선언방법
	 *리턴타입 앞에 <>기호를 이용하여 타입글자를 기술한 후 써준다
	 */
	public static <K, V> boolean compare(Pair<K,V> p1, Pair<K,V> p2) {
		boolean keyCompare = p1.getKey().equals(p2.getKey());
		boolean valueCompare = p1.getValue().equals(p2.getValue());
		return keyCompare && valueCompare;
	}
}
/**
 * 멀티타입<k,v>을 가지는 제너릭 클래스
 * @param <k>
 * @param <v>
 */
class Pair<K,V>{
	private K key;
	private V value;
	public Pair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	
	public <K,V>void displayAll(K key, V val) {
		System.out.println(key+":"+val);
	}
	
}
public class T04GenericMethodTest {
	public static void main(String[] args) {
		Pair<Integer,String>p1 = new Pair<Integer,String>(1,"홍길동");
		Pair<Integer,String>p2 = new Pair<Integer,String>(1,"홍길동");
		boolean result = Util.<Integer,String>compare(p1,p2);
		if(result) {
			System.out.println("논리(의미)적으로 동일한 객체임.");
		}else {
			System.out.println("논리(의미)적으로 동일한 객체아님.");
		}
		
		Pair<String,String> p3 =new Pair<String,String>("001","홍길동");
		Pair<String,String> p4 =new Pair<String,String>("002","홍길동");
		result = Util.compare(p3, p4);
		if(result) {
			System.out.println("논리(의미)적으로 동일한 객체임.");
		}else {
			System.out.println("논리(의미)적으로 동일한 객체아님.");
		}
		p1.displayAll(180, "키");
		p1.displayAll("키",170);  //->에러 : 타입이 안맞아서(40줄에 메소드에 <>추가하면 에러 안남)
	}
}

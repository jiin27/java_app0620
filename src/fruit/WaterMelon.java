package fruit;
//패키지에 들어간 클래스는, 공개해놓지 않으면 그 어떤 누구도 접근이 불가능하다.
//따라서 사용할 수 있도록 public으로 접근 제한을 풀어주자
public class WaterMelon{
	String name="수박";
	int price=25000;

	public int getPrice(){
		return price;
	}
}

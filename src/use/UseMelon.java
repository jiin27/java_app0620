package use; //컴파일시 use 패키지에 넣기.
import fruit.WaterMelon;
class UseMelon{
	public static void main(String[] args){
		WaterMelon wm=new WaterMelon();
		int price=wm.getPrice();
		System.out.println("올해 여름 수박은..! "+price);
	}
}

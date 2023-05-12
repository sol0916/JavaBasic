package day08.encap.obj;

public class MainClass {

	public static void main(String[] args) {

		Hotel h = new Hotel();

		Chef c =  h.getChef();
		c.cooking();

		h.getChef();

		//chef를 생성해서 totel한테 전달
		Chef chef = new Chef();
		h.setChef(chef);
		h.setChef(new Chef());
		

	}

}

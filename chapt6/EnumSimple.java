package keywords;

enum Season{Spring,Summer,Fall,Winter,}

class ClassSeason
{
	public static final int Spring=0;
	public static final int Summer=1;
	public static final int Fall=2;
	public static final int Winter=3;
}

public class EnumSimple {
	Season s1=Season.Fall;
	int iNumber=ClassSeason.Fall;
	/*���Է�����������ڲ���
	*enum Season{Fall,Winter,Spring,Summer}
	*/
	
	public static void main(String[] args) {
	
		int intSeason=ClassSeason.Spring;//ʹ���ྲ̬�����ķ�ʽ
		System.out.println("intSeason is "+intSeason);
		intSeason=5;//������ʹ�÷�ʽ���ڱ׶ˣ���������ö��
		System.out.println("intSeason AGAIN is "+intSeason);
		
		Season thisSeason=Season.Fall;
		System.out.println("thisSeason is "+thisSeason);
		System.out.println("thisSeason.name is "+thisSeason.name());
		System.out.println("thisSeason.ordinal is "+thisSeason.ordinal());

	}

}

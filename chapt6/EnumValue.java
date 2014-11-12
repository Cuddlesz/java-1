package keywords;

import java.util.Calendar;

/**
 * ��ʾ���ʹ�� Enum
 */
public class EnumValue {

	/**
	 * һ����ʾ���ڼ��� enum 
	 */
	enum Weekday {
		Monday, Tuesday, Wednesday, Thirsday, Friday, Saturday, Sunday
	}

	/**
	 * һ����ʾ�·ݵ� enum 
	 */
	enum Month {

		// ʮ�����·�
		Jan("January"), Feb("Febrary"), Mar("March"), Apr("April"), May("May"), June(
				"June"), July("July"), Aug("August"), Sept("September"), Oct(
				"October"), Nov("November"), Dec("December");

		// ȫ��
		private String fullName;

		// ���췽��
		Month(String fullName) {
			this.fullName = fullName;
		}

		public String getFullName() {
			return fullName;
		}

		// ��ȡ��ǰ Enum ֵ�ǵڼ����·ݡ�һ�·��򷵻� 1��
		public int getIndex() {
			return ordinal() + 1;
		}

		// ����������� enum ����
		public static Month valueByIndex(int index) {
			for (Month month : Month.values()) {
				if (month.getIndex() == index) {
					return month;
				}
			}
			return null;
		}

		// ����ȫ����� enum ����
		public static Month valueByFullName(String fullName) {
			for (Month month : Month.values()) {
				if (month.getFullName().equals(fullName)) {
					return month;
				}
			}
			return null;
		}

		public static Month thisMonth() {
			// Calendar ���·ݴ� 0 ���𣬶� Month ���·ݴ� 1 ����
			int index = Calendar.getInstance().get(Calendar.MONTH) + 1;
			return valueByIndex(index);
		}

		public static void main(String[] args) {

			// ��ʾ���ʹ�� Weekday
			Weekday w = Weekday.Monday;
			System.out.println("w = " + w.toString());
			System.out.println("Monday compares to Friday = "
					+ Weekday.Monday.compareTo(Weekday.Friday));

			System.out.println("Enum value of \"Sunday\" is "
					+ Weekday.valueOf("Sunday"));

			try {
				System.out.println("Enum value of \"AnotherDay\" is "
						+ Weekday.valueOf("AnotherDay")); // ���ｫ���׳�
				// IllegalArgumentException
			} catch (IllegalArgumentException e) {
				System.out.println("exception: " + e.getMessage());
			}
			System.out.println();

			// --------------------------------
			// ��ʾ���ʹ�� Month
			System.out.println("The first month is " + Month.Jan);
			System.out.println("The full name of the first month is "
					+ Month.Jan.getFullName());
			System.out.println("The fifth month is "
					+ Month.valueByIndex(5).getFullName());
			System.out.println("Index of August is "
					+ Month.valueByFullName("August").getIndex());
			System.out.println("Now is " + Month.thisMonth().getFullName());
		}
	}
}
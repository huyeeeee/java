package leetcode;

public class dayOfYear_1154 {
	public int dayOfYear(String date){
		int year = Integer.valueOf(date.split("-")[0]);
		int month = Integer.valueOf(date.split("-")[1]);
		int day = Integer.valueOf(date.split("-")[2]);
		int[] days = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		int[] days1 = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		int count = 0;
		if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)){
			for (int i = 0;i < month-1;i++){
				count += days1[i];
			}
		}
		else {
			for (int i = 0;i < month - 1;i++){
				count += days[i];
			}
		}
		return count+day;
	}
	public static void main(String[] args){
		String date = "2020-02-29";
		System.out.println(new dayOfYear_1154().dayOfYear(date));
	}
}

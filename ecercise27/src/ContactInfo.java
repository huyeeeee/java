import java.util.ArrayList;

public class ContactInfo {
	private String name;
	private ArrayList<Phone> phoneNums;

	public ContactInfo(){
		this.name = "unknown";
		this.phoneNums = new ArrayList<>();
	}

	public ContactInfo(String name,ArrayList<Phone> phoneNumber){
		this.name = name;
		this.phoneNums = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public ArrayList<Phone> getPhones() {
		return phoneNums;
	}

	public boolean addPhone(Phone p){
		for (int i = 0;i < phoneNums.size();i++){
			if (p.getPhonNum().equals(phoneNums.get(i).getPhonNum())
					|| p.getLabel().equals(phoneNums.get(i).getLabel())){
				return false;
			}
		}
		phoneNums.add(p);
		return true;
	}

	public boolean removePhone(String phonNum){
		if (phoneNums.size() == 0)
			return false;
		for (int i = 0;i < phoneNums.size();i++){
			if (phoneNums.get(i).getPhonNum().equals(phonNum)){
				phoneNums.remove(i);
				return true;
			}
		}
		return false;
	}

//	public static void main(String[] args){
//		ContactInfo pp1 = new ContactInfo();
//		System.out.println(pp1.getName());
//		System.out.println(pp1.getPhones());
//		Phone p1 = new Phone("mobile", "(555)444-4444");
//		ArrayList<Phone> list1 = new ArrayList<Phone>();
//		System.out.println(list1.add(p1));
//		pp1 = new ContactInfo ("Jim Carrey", list1);
//		System.out.println(pp1.getName());
//		System.out.println(pp1.getPhones());
//
//		System.out.println(pp1.addPhone(new Phone("home", "(666)666-6666")));
//		Phone p3 = new Phone("main", "(666)666-6666");
//		System.out.println(pp1.addPhone(p3));
//		System.out.println(pp1.addPhone(new Phone("home", "(123)000-8723")));
//		System.out.println(pp1.removePhone("(000)000-0000"));
//		System.out.println(pp1.removePhone("(555)444-4444"));
//
//		for (Phone p:pp1.getPhones())
//			System.out.println(p.getLabel()+" "+p.getPhonNum());
//	}
}

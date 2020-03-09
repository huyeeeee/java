package leetcode;

public class defangIPaddr_1108 {

	public String defangIPaddr(String address){
		StringBuffer res = new StringBuffer();
		String[] temp = address.split("\\.");
		for (int i = 0;i < temp.length;i++){
			res.append(temp[i]);
			if (i != temp.length-1)
				res.append("[.]");
		}
		return res.toString().trim();
	}
	public static void main(String[] args){
		System.out.println(new defangIPaddr_1108().defangIPaddr("1.0.0.0"));
	}
}

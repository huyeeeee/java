package assignment20200301;

public class Tweet {
	private String name;
	private String content;
	private final int MAX_CHARS = 140;

	public Tweet(String name,String content){
		this.name = name;
		if (content.length() > 140){
			this.content = content.substring(0,MAX_CHARS);
		}
		else {
			this.content = content;
		}
	}

	Tweet(Tweet t){
		this.name = t.name;
		this.content = t.content;
	}
	public String getName() {
		return name;
	}

	public String getContent() {
		return content;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContent(String content) {
		this.content = content;
	}



	@Override
	public String toString() {
		return "@" + name + "\n\"" + content + "\"";
	}

	@Override
	public boolean equals(Object obj) {
		return obj.toString().equals(this.toString());
	}

	public static void main(String[] args){
		Tweet t1 = new Tweet("hu","I am sad");
		Tweet t2 = new Tweet("hu","I am sad");
		Tweet t3 = new Tweet("Li","That is good");
		System.out.println(t1.toString());
		System.out.println(t1.equals(t3));
	}
}

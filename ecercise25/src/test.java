import java.util.Iterator;

public class test {
	public static void main(String[] args){
		SongCollection sc = new SongCollection();
		sc.add(new Song("Baby","Justin"));
		sc.add(new Song("Sugar","Adam"));
		sc.add(new Song("Sweet heart","XX"));
		int count = 0;
//		System.out.println(sc.getHead().getData());
//		System.out.println(sc.getTail().getData());
//		System.out.println(sc.iterator());
		sc.setPlayDirection(false);
		Iterator<Song> playList = sc.iterator();
		while (playList.hasNext())
			System.out.println(playList.next());


//		sc.setPlayDirection(false);
//		System.out.println(sc.iterator().next());
//		while (sc.iterator().hasNext()){
////			sc.setPlayDirection(false);
//
//			System.out.println(sc.iterator().next());
//		}
	}
}

import java.io.File;
import java.util.ArrayDeque;
import java.util.Queue;

public class FindMaxFile {
	private String maxFile; // store the max size file name
	private long maxSize;// store the max size
	private Queue<String> bfsFileName;
	// in method bfs, this variable is used to store the filename

	/**
	 * constructor
	 */
	public FindMaxFile(){
		maxSize = -1;
		bfsFileName = new ArrayDeque<>();
	}

	/**
	 * this method use depth first search to find the file which
	 * has the max size
	 * @param fileName is the start file name;
	 */
	public void DFS(String fileName){
		File f = new File(fileName);
		if (f.isFile()){// if is a file,compare with the maxSize
			if (f.length() > maxSize){
				maxSize = f.length();
				maxFile = f.getAbsolutePath();
			}
			else if (f.length() == maxSize){
				//if has the same size,compare the name size
				if (maxFile.length() <= f.getAbsolutePath().length()){
					maxFile = f.getAbsolutePath();
				}
			}
		}
		if (f.isDirectory()){
			// if is a directory, enter the directory and compare with every file in the directory
			for (File f1 : f.listFiles()){
				DFS(f1.getAbsolutePath());
			}
		}
	}

	/**
	 * this method use depth first search to find the file which
	 * has the max size
	 * @param fileName is the file start
	 */
	public void BFS(String fileName){
		bfsFileName.add(fileName);
		String temp;
		while (bfsFileName.size() != 0){
			temp = bfsFileName.poll();
			File tempF = new File(temp);
			if (tempF.isDirectory()){
				//if is a directory, add all files in the queue
				for (File f1 : tempF.listFiles()){
					bfsFileName.add(f1.getAbsolutePath());
				}
			}
			if (tempF.isFile()){
				//if is a file, compare the file
				if (tempF.length() > maxSize){
					maxFile = tempF.getAbsolutePath();
					maxSize = tempF.length();
				}
				else if (tempF.length() == maxSize){
					if (maxFile.length() <= tempF.getAbsolutePath().length()){
						//if has the same size,compare the name size
						maxFile = tempF.getAbsolutePath();
					}
				}
			}
		}
	}

	/**
	 *
	 * @return the max file's information as a String
	 */
	@Override
	public String toString() {
		return "the largest file was found here: " +
				maxFile + "\nits size is: " + maxSize;
	}

	public static void main(String[] args){
		long start = System.currentTimeMillis();
		FindMaxFile f = new FindMaxFile();
		String fileName = "J:\\QQfiles";
		f.DFS(fileName);
//		f.BFS(fileName);
		long end = System.currentTimeMillis();
		System.out.println("the time is : " + (end - start) + "ms");
		System.out.println("Start at: " + fileName);
		System.out.println(f.toString());
	}
}

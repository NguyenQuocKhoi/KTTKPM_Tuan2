package examples;

import java.io.File;

public class Test {
	public static void main(String[] args) {
		File projectDir = new File("D:\\kttkpm\\tuan2");
		new DirExplorer((level, path, file) -> path.endsWith(".java"), (level, path, file) -> {
			System.out.println(path);
		}).explore(projectDir);
	}
}

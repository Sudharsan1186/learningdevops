package interviewprep.concepts;

import java.io.File;
import java.io.FileFilter;

public class ShowHiddenFiles {

	public static void main(String[] args) {
		File[] hiddenFiles = new File("D://Shift POCs").listFiles(new FileFilter() {

			@Override
			public boolean accept(File pathname) {
				
				return pathname.isHidden();
			}
			
		});
		System.out.println(hiddenFiles.length);
		for(File file : hiddenFiles) {
			System.out.println(file.getName()); 
		}

	}

}

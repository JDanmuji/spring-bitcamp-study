package sample05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOutputter implements Outputter {
	private String filePath, fileName;
	
	public FileOutputter() {
		System.out.println("FileOutPutter 기본 생성자");
	}
	
	
	@Override
	public void output(String message) {
		
		try {
			FileWriter fileWriter = new FileWriter(new File(filePath, fileName));
			fileWriter.write(message);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("outPut");	
	}

	public void setFilePath(String filePath) {
		
		System.out.println("filePath");
		this.filePath = filePath;
	}

	public void setFileName(String fileName) {
		System.out.println("fileName");
		this.fileName = fileName;
	}


}

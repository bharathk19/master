//This Class is used to read a file in Static Block

package com.collectionPractise;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ReadingFile {

	public static void main(String[] args) {
		StringBuilder inj = new StringBuilder();
		try
		{
			InputStream is= Thread.currentThread().getContextClassLoader().getResourceAsStream("Bnc.json");
			BufferedReader bufferRead=new BufferedReader(new InputStreamReader(is));
			String line;
			while ((line=bufferRead.readLine())!=null) {
				inj.append(line);
			}
			System.out.println(inj);
			bufferRead.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}

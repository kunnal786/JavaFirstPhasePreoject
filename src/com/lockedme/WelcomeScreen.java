package com.lockedme;

import java.io.File;
import java.io.IOException;

import javax.naming.ldap.SortControl;

public class WelcomeScreen {

	public void DfAscendingorder(String directorypath) {
		try {
			File f = new File(directorypath);
			File files[] = f.listFiles();
			Sort(files, files.length);
			for (File fileEntry : files)
				System.out.println(fileEntry.getName());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void Sort(File[] files, int n) {
	int x,j,swaps;
	File temp;
	for(x=n-2;x>=0;x--){
		swaps=0;
		for(j=0;j<=x;j++)
		{
			if(files[j].getName().compareTo(files[j+1].getName())>0){
				temp=files[j];
				files[j]=files[j+1];
				files[j+1]=temp;
				swaps++;
			}
							
		}
		if(swaps==0)
			break;
	}
		
	}

	public void AddFiles(String fileName, String directoryPath) {
		try {
			File directroy = new File(directoryPath);
			if (directroy.isDirectory()) {
				File f = new File(directoryPath + "/" + fileName);
				if (!f.exists()) {
					f.createNewFile();
				} else {
					System.out.println("File Already Exist");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void deleteFiles(String fileName, String directoryPath) {
		boolean isDeleted = false;
		boolean isExisted = false;
		try {
			File F = new File(directoryPath);
			File files[] = F.listFiles();
			for (File fileEntry : files) {
				if (fileEntry.getName().equals(fileName)) {
					isExisted = true;
					if (fileEntry.delete())
						isDeleted = true;
				}
			}

			if (isExisted && isDeleted)
				System.out.println("File Deleted Sucessfully");
			else
				System.out.println("file not exist");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void searchFile(String fileName, String directoryPath) {
		boolean isExisted = false;
		try {
			File f = new File(directoryPath);
			File files[] = f.listFiles();
			for (File fileEntry : files) {
				if (fileEntry.isFile()) {
					if (fileEntry.getName().equals(fileName))
						isExisted = true;
				}
			}
			if (isExisted)
				System.out.println("File is existed");
			else
				System.out.println("File is not existed in the directory");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

package com.ext1;

public class MP3Phone extends CellPhone{
	
	private int size;	//���� ����� �뷮
	
	public MP3Phone(String model, String number, int chord, int size){
		this.model = model;
		this.number = number;
		this.chord = chord;
		this.size = size;
	}
	
	public int getSize(){
		return size;
	}

}
package com.liuxuli.util;

public class PageUtil {

	public static int getStart(int index,int size){
		return (index - 1) * size;
	}
}

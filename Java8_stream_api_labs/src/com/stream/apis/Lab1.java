package com.stream.apis;

//1. Simple Runnable Exmaple
public class Lab1 {
	public static void main(String[] args) {
		Runnable r = () -> System.out.println("Hello, Lambda!");
		new Thread(r).start();
	}
}

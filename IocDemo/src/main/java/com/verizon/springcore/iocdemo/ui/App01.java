package com.verizon.springcore.iocdemo.ui;

import java.util.Scanner;

import com.verizon.springcore.iocdemo.service.IUserService;
import com.verizon.springcore.iocdemo.service.UsserServiceSefaultImpl;

public class App01 {
	
	public static void main(String args[]){
		
		Scanner scan = new Scanner(System.in);
		IUserService userService = new UsserServiceSefaultImpl();
		
		System.out.println("Enter");
		String userNmae = scan.next();
		
		System.out.println(userService.welcomeUser(userNmae));
		
		scan.close();
	}
}

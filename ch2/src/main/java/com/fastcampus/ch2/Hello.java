package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
//	2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() {
		System.out.println("Hello - private");
		System.out.println(cv); // ok
	}
	
	
	public static void main2() {
		System.out.println(cv); // ok
//		System.out.println(iv); // error
	}
}

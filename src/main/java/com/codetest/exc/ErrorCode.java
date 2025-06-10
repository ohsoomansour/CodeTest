package com.codetest.exc;

import lombok.Getter;


/**
 * enum(=열거): '상수들의 집합' 
 * enum 클래스 내에서 정의된 상수가 애플리케이션 전체에서 단 하나의 인스턴스만 존재함을 보장
 * enum은 결국 '클래스' BUT 롬복의 @Setter 및 @Data는 사용할 수 없음! 
 * EROR_YES는 ErrorCode enum 상수이다. 
 *  -> public static final ErrorCode ERROR_YES = new ErrorCode("EY") "싱글통 객체"로 동작
 *  -> 사용예시1) ErrorCode.ERROR_YES  'EY' (X)
 *     								 'ERROR_YES' (O)
 *  -> 사용예시2) ERRORCode.ERROR_YES.getMessage(); 'EY' (o) 
 * */

@Getter
public enum ErrorCode {
	
	ERROR_YES("EY"),
	ERROR_NO("EN");
	
	private final String message;
	
	ErrorCode(String message) {
		this.message = message;
	}

	public static enum testTp{
		TEST_ST1, TEST_ST2
	}
}

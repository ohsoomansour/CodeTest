package com.codetest.exc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 *  @SpringApplication.run(CodeTestApplication.class, args);
 *  return the running ApplicationContext
 *  > 1.스프링 컨테이너(ApplicationContext)생성 > @Component, @Repoitory, @Contrroller 등을 찾아서 ***빈 등록***> ***의존성 주입***
 *   예) private final CodeTestService codeTESTSvc; 또는 @Autowired private CodeTestService codeTESTSvc;
 *   
 *  > 2.실행중인 @ApplicationContext+ :Central interface to provide configuration for an application (애플리케이션 설정을 제공하는 핵심 인터페이스)
 *  > 3. 내장 Tomcat 실행 
 *  > 4. CommandLineRunner, ApplicationRunner 등 초기 로직 실행
 *  4567890-=[PYRT	AAN`
 *  @Bean factory methods: 빈(Bean)을 생성하거나 가져오는 팩토리 메서드 
 *    - Spring에서는 개발자가 직접 객체를 new 해서 생성하는 대신, ***스프링 컨테이너가 관리하는 빈(Bean)*** 을 사용합니다.
      - 이 빈들은 애플리케이션의 다양한 컴포넌트(서비스, 리포지토리, 설정 등)를 의미하며, 스프링은 이들을 **팩토리 메서드(factory method)**를 통해 생성하거나 가져옵니다.
 * ==local==
 * */

@Slf4j
@SpringBootApplication
public class CodeTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeTestApplication.class, args); // Main Entry Point 역할 - 애플리케이션 초기화 실행 

		log.info("ErrorCode.ERROR_YES={}", ErrorCode.ERROR_YES); //ERROR_YES
		log.info("ErrorCode.ERROR_NO={}", ErrorCode.ERROR_NO); // ERROR_NO
		log.info("ErrorCode.ERROR_NO.toString()={}", ErrorCode.ERROR_NO.toString()); // ERROR_NO
		log.info("ErrorCode.ERROR_NO.toString()={}", ErrorCode.ERROR_YES.getMessage()); // EY 
	}

}

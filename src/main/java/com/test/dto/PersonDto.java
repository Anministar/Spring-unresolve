package com.test.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Getter
//@Setter
//@ToString

@Data //디폴트 생성자, Getter, Setter, Equal(), toString()이런게 다 나옴.
@NoArgsConstructor //디폴트생성자 만드는것
@AllArgsConstructor //모든 인자를 받는 매개변수 생성자
@Builder
@Component
public class PersonDto {
	private String name;
	private String age;
	private String addr;
	
	
}

package DI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.test.dto.BoardDto;
import com.test.dto.PersonDto;

import lombok.extern.log4j.Log4j;

//SpringJUnit4ClassRunner 라는 클래스를 준비시키는 과정
//Container위치를 등록해서 Container안에있는 객체들을 받아오는 과정
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") 
@Log4j
public class DITests {

	@Autowired // 꺼내올 때 쓰는 것.
	PersonDto personDto;
	
//	@Autowired
//	BoardDto board;
//	
//	@Autowired
//	PersonDto personDto2;
	
	@Test
	public void test() {
		log.info(personDto);
//		log.info(board);
//		log.info(personDto2);
	}

}

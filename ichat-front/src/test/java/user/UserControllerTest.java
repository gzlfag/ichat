package user;

import static org.junit.Assert.assertEquals;

import java.net.URI;

import org.ichat.front.IChatApplication;
import org.ichat.front.vo.UserVo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = IChatApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void testCreateUser() {
		UserVo userVo = UserVo.builder().account("7777").name("7777").password("7777").build();
		ResponseEntity<String> result = testRestTemplate.postForEntity(URI.create("/users"), userVo, String.class);
		assertEquals(result.getStatusCode(), HttpStatus.OK);
	}
}

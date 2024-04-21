package dev.imaretarded.gino;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

// @ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class GinoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	// @Test
	// void contextLoads() {
	// }

	@Test
	void test_hello() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

}

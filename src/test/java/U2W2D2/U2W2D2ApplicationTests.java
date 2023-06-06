package U2W2D2;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
class U5d7ApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Test
	void shouldGetUsersList() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/users")).andExpect(status().is5xxServerError());
	}

}
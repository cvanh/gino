package dev.imaretarded.gino.intergration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import dev.imaretarded.gino.domains.Product;

@SpringBootTest
@AutoConfigureMockMvc
class ProductsIT {
    @Autowired
    private MockMvc mockMvc;

    @Test
    void test_hello() throws Exception {
        this.mockMvc.perform(post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{'name': 'kaas','price': '22'}"))
                .andExpect(status().isCreated());

    }
}

package dev.imaretarded.gino.intergration;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.json.JSONObject;
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
    void test_if_products_are_created() throws Exception {
        String ReqBody = new JSONObject()
                .put("name", "laas")
                .put("price", "1")
                .toString();

        this.mockMvc.perform(post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(ReqBody))
                .andExpect(status().isCreated());
    }

    // TODO write test that covers the format of json output
    @Test
    void test_if_products_are_listed() throws Exception {
        this.mockMvc.perform(get("/products")).andExpect(status().isOk());
    }
}

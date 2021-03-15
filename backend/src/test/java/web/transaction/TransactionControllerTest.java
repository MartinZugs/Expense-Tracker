package web.transaction;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(TransactionController.class)
class TransactionControllerTest {

    /* ----- Unit tests ----- */

    Transaction trans1 = new Transaction();
    Transaction trans2 = new Transaction();

    @Test
    void createTransactionTest() {
        TransactionController controller = new TransactionController();
        Transaction response = controller.createTransaction(trans1, 1);
        assertEquals(response, trans1);
    }

    /* ----- Integration tests ----- */

    @Autowired
    private MockMvc mvc;

    @Test
    void emptyBalance() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/new");
        MvcResult result = mvc.perform(request).andReturn();
        assertTrue(Boolean.getBoolean(result.getResponse().getContentAsString()));
    }
}

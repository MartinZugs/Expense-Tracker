package web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(ExpenseController.class)
class ExpenseControllerTest {

    /* ----- Unit tests ----- */

    Expense exp1 = new Expense();
    Expense exo2 = new Expense();

    @Test
    void createExpenseTest() {
        ExpenseController controller = new ExpenseController();
        boolean response = controller.createExpense();
        assertTrue(response);
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

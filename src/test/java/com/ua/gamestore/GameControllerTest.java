package com.ua.gamestore;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class GameControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void listReturnsCards() throws Exception {
        mockMvc.perform(get("/api/games"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.length()").value(5))
                .andExpect(jsonPath("$[0].title").exists())
                .andExpect(jsonPath("$[0].description").doesNotExist());
    }

    @Test
    void getOneReturnsDetails() throws Exception {
        mockMvc.perform(get("/api/games/1"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.description").exists())
                .andExpect(jsonPath("$.genre").exists());
    }

    @Test
    void getOneUnknownReturns404() throws Exception {
        mockMvc.perform(get("/api/games/999"))
                .andExpect(status().isNotFound());
    }
}

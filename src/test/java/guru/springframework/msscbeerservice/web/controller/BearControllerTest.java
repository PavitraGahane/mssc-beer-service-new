package guru.springframework.msscbeerservice.web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.msscbeerservice.web.model.BearDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BearController.class)
class BearControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;
    @Test
    void getBearByID() throws Exception{

        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/beer/" + UUID.randomUUID().toString())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

    }

    @Test
    void saveNewBear() throws Exception {

        BearDto bearDto = BearDto.builder().build();
        String bearDtoJson = objectMapper.writeValueAsString(bearDto);

        mockMvc.perform(post("/api/v1/bear/")
                .contentType(MediaType.APPLICATION_JSON)
                .content(bearDtoJson))
                .andExpect(status().isCreated());
    }

    @Test
    void updateBearById() throws Exception{
        BearDto bearDto = BearDto.builder().build();
        String bearDtoJson = objectMapper.writeValueAsString(bearDto);

        mockMvc.perform(post("/api/v1/bear/" + UUID.randomUUID().toString())
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(bearDtoJson))
                .andExpect(status().isNoContent());
    }
}
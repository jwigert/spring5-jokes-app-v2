package guru.springframework.spring5jokesappv2.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JokeServiceImplTest {

    private JokeService jokeService;

    @BeforeEach
    void setUp() {
        jokeService = new JokeServiceImpl();
    }

    @Test
    void getRandomJoke() {
        assertNotNull(jokeService.getRandomJoke());
    }
}
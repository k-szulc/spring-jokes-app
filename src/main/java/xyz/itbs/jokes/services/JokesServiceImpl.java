package xyz.itbs.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {
    @Override
    public String getJokes(ChuckNorrisQuotes quotes) {
        return quotes.getRandomQuote();
    }
}

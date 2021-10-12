package xyz.itbs.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();

    @Override
    public String getJokes() {
        return quotes.getRandomQuote();
    }
}

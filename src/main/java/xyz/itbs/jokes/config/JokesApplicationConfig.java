package xyz.itbs.jokes.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xyz.itbs.jokes.services.JokesServiceImpl;

@Configuration
public class JokesApplicationConfig {

    @Bean
    ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

    @Bean
    JokesServiceImpl jokesService(){ return new JokesServiceImpl(); }


}

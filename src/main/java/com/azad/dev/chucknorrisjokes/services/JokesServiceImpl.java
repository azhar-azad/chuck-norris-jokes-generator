package com.azad.dev.chucknorrisjokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public JokesServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    public String getRandomQuotes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

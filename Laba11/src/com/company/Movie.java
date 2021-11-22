package com.company;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

public class Movie {
    private String name;
    
    public Movie(String name) {
        this.name = name;
    }

    private Set<Actor> actors = new TreeSet<>();

    public void addActor(Actor actor) { this.actors.add(actor); }

    public Set<Actor> getActors() { return this.actors; }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", actors=" + actors +
                '}';
    }
}


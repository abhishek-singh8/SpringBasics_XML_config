package com.pluralsight.repository;

import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll(){

        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();
        speaker.setFirstName("Abhi");
        speaker.setLastName("Singh");
        speakers.add(speaker);
        return speakers;
    }
    public void classSpecificMethod(){
        System.out.println("class specific");
    }
}

package com.grn.conferencedemo.services;

import com.grn.conferencedemo.models.Speaker;
import com.grn.conferencedemo.repositories.SpeakerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SpeakerService {

    private final SpeakerRepository speakerRepository;

    public List<Speaker> list() {
        return speakerRepository.findAll();
    }

    public Speaker get(Long id) throws Exception {
        //IsDefined/isPresent
        return speakerRepository.findById(id).orElseThrow(() -> new Exception("Speaker not found"));
    }

    public Speaker create(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public void delete(Long id) throws Exception {
        var speaker = get(id);
        speakerRepository.delete(speaker);
    }

    public Speaker update(Long id, Speaker speaker) throws Exception {
        var speakerToUpdate = get(id);
        speakerToUpdate.setFirst_name(speaker.getFirst_name());
        speakerToUpdate.setLast_name(speaker.getLast_name());
        speakerToUpdate.setTitle(speaker.getTitle());
        speakerToUpdate.setCompany(speaker.getCompany());
        speakerToUpdate.setSpeaker_bio(speaker.getSpeaker_bio());
        speakerToUpdate.setSpeaker_photo(speaker.getSpeaker_photo());
        speakerToUpdate.setSessions(speaker.getSessions());
        return speakerRepository.save(speakerToUpdate);
    }

}

package com.grn.conferencedemo.controllers;

import com.grn.conferencedemo.models.Session;
import com.grn.conferencedemo.models.Speaker;
import com.grn.conferencedemo.repositories.SpeakerRepository;
import com.grn.conferencedemo.services.SpeakerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/speakers")
public class SpeakerController {

    private final SpeakerService speakerService;


    @GetMapping
    public ResponseEntity<List<Speaker>> list() {
        return new ResponseEntity<>(speakerService.list(), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("{id}")
    public ResponseEntity<Speaker> get(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(speakerService.get(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Speaker> create(@RequestBody Speaker speaker) {
        return new ResponseEntity<>(speakerService.create(speaker), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id) throws Exception {
        speakerService.delete(id);
    }


    @PutMapping(value = "{id}")
    public ResponseEntity<Speaker> update(@PathVariable Long id, @RequestBody Speaker speaker) throws Exception {
        return new ResponseEntity<>(speakerService.update(id, speaker), HttpStatus.OK);
    }


}

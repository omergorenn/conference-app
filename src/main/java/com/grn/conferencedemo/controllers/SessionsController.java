package com.grn.conferencedemo.controllers;

import com.grn.conferencedemo.models.Session;
import com.grn.conferencedemo.services.SessionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("api/v1/sessions")
public class SessionsController {

    private final SessionService sessionService;


    @GetMapping
    public ResponseEntity<List<Session>> list() {
        return new ResponseEntity<>(sessionService.list(), HttpStatus.OK);
    }

    @GetMapping
    @RequestMapping("{id}")
    public ResponseEntity<Session> get(@PathVariable Long id) throws Exception {
        return new ResponseEntity<>(sessionService.get(id), HttpStatus.OK);
    }


    @PostMapping
    public ResponseEntity<Session> create(@RequestBody Session session) {
        return new ResponseEntity<>(sessionService.create(session), HttpStatus.OK);
    }

    @DeleteMapping(value = "{id}")
    public void delete(@PathVariable Long id) throws Exception {
        sessionService.delete(id);
    }

    @PutMapping(value = "{id}")
    public ResponseEntity<Session> update(@PathVariable Long id, @RequestBody Session session) throws Exception {
        return new ResponseEntity<>(sessionService.update(id, session), HttpStatus.OK);
    }


}

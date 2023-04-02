package com.grn.conferencedemo.services;


import com.grn.conferencedemo.models.Session;
import com.grn.conferencedemo.repositories.SessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SessionService {


    private final SessionRepository sessionRepository;

    public List<Session> list() {
        return sessionRepository.findAll();
    }

    public Session get(Long id) throws Exception {
        return sessionRepository.findById(id).orElseThrow(() -> new Exception("Session not found"));
    }

    public Session create(Session session) {
        return sessionRepository.save(session);
    }

    public void delete(Long id) throws Exception {
        var session = get(id);
        sessionRepository.delete(session);
    }

    public Session update(Long id, Session session) throws Exception {
        var sessionToUpdate = get(id);
        sessionToUpdate.setSession_name(session.getSession_name());
        sessionToUpdate.setSession_description(session.getSession_description());
        sessionToUpdate.setSession_length(session.getSession_length());
        return sessionRepository.save(sessionToUpdate);
    }


}

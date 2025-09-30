package com.aruiz.infraestructure.controller;

import com.aruiz.infraestructure.service.PersonService;
import com.aruiz.infraestructure.service.dto.LookupRequest;
import com.aruiz.infraestructure.service.dto.LookupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class WsController {
    private final PersonService service;

    @MessageMapping("/person.lookup") // cliente envía a /app/person.lookup
    @SendTo("/topic/person.lookup") // los subscritos reciben en /topic/person.lookup
    public LookupResponse handle(LookupRequest req) {
        var tel = req == null ? null : req.tel();
        if (tel == null || tel.isBlank()) {
            return new LookupResponse(tel, null, null, null, false, "Persona dueña de ese número telefónico no existe");
        }
        return service.lookup(tel.trim());
    }
}

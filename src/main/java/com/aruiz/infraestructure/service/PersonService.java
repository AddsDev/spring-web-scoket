package com.aruiz.infraestructure.service;

import com.aruiz.data.repository.PersonRepository;
import com.aruiz.infraestructure.service.dto.LookupResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository repo;

    public LookupResponse lookup(String tel) {
        var p = repo.findWithCityByTelefono(tel);
        if (p.isPresent()) {
            var result = p.get();
            return new LookupResponse(result.getTelefono(), result.getNombre(), result.getDireccion(),
                    result.getCiudad().getNombre(), true, "OK");
        }

        return new LookupResponse(tel, null, null, null, false, "Persona dueña de ese número telefónico no existe");

    }
}

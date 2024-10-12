package com.example.inicial1.services;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.repositories.BaseRepository;

public class LocalidadServiceImp extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImp(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
}

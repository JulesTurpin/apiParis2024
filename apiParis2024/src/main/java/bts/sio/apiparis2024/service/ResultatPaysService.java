package bts.sio.apiparis2024.service;

import bts.sio.apiparis2024.model.ResultatPays;
import bts.sio.apiparis2024.repository.ResultatPaysRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Data
@Service
public class ResultatPaysService {

    @Autowired
    private ResultatPaysRepository resultatPaysRepository;

    public Optional<ResultatPays> getResultatPays(final Long id){return resultatPaysRepository.findById(id);}

    public Iterable<ResultatPays> getResultatPays(){return resultatPaysRepository.findAll();}

    public void deleteResultatPays(final Long id){resultatPaysRepository.deleteById(id);}

    public ResultatPays saveResultatPays(ResultatPays resultatPays){
        ResultatPays savedResultatPays = resultatPaysRepository.save(resultatPays);
        return savedResultatPays;
    }

}

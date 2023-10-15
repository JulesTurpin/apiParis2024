package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.Epreuve;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EpreuveRepository extends CrudRepository<Epreuve, Long> {

}

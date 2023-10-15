package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.Pays;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends CrudRepository<Pays, Long> {

}

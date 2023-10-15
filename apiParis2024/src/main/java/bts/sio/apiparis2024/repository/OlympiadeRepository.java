package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.Olympiade;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OlympiadeRepository extends CrudRepository<Olympiade, Long> {

}

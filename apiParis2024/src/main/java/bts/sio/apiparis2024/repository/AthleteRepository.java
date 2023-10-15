package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.Athlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteRepository extends CrudRepository<Athlete, Long> {

}

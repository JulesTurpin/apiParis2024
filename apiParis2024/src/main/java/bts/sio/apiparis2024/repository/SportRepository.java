package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.Sport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends CrudRepository<Sport, Long> {

}

package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.ResultatPays;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultatPaysRepository extends CrudRepository<ResultatPays, Long> {

}

package bts.sio.apiparis2024.repository;

import bts.sio.apiparis2024.model.ResultatAthlete;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultatAthleteRepositrory extends CrudRepository<ResultatAthlete, Long> {

    List<ResultatAthlete> findByEpreuve_Id(final Long id);

}

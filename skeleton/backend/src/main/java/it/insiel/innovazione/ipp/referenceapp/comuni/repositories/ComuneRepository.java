package it.insiel.innovazione.ipp.referenceapp.comuni.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.insiel.innovazione.ipp.referenceapp.comuni.repositories.model.Comune;

import java.util.List;

@Repository
public interface ComuneRepository extends JpaRepository<Comune, Long> {

  List<Comune> findByProvinciaIgnoreCaseOrderByNome(String provincia);

  List<Comune> findFirstByNome(String comune);
}

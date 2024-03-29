package br.upe.ecoenergy.repository;

import br.upe.ecoenergy.domain.Eletrodomestico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EletrodomesticoRepository extends JpaRepository<Eletrodomestico, Long> {
    List<Eletrodomestico> findAllByUsuario_Id(String id);
    List<Eletrodomestico> findAllByUsuario_IdAndNome(String id, String nome);
}

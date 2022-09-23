package br.com.vinicius.santos.nifflerlib.repository;

import br.com.vinicius.santos.nifflerlib.model.entity.BlacklistEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BlacklistRepository extends JpaRepository<BlacklistEntity, Long> {

    Optional<BlacklistEntity> findBlacklistEntityByUsername(String username);

    Optional<BlacklistEntity> findBlacklistEntityByUser_Id(Long userId);
}

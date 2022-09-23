package br.com.vinicius.santos.nifflerlib.repository;

import br.com.vinicius.santos.nifflerlib.model.entity.LastUserMessageEntity;
import br.com.vinicius.santos.nifflerlib.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LastUserMessageRepository extends JpaRepository<LastUserMessageEntity, Long> {

    LastUserMessageEntity findLastUserMessageEntityByUser(UserEntity userEntity);

}

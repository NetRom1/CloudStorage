package ru.nrv.cloudstorage.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.nrv.cloudstorage.entities.TokenEntity;

@Repository
public interface TokenRepository extends CrudRepository<TokenEntity, String> {
}
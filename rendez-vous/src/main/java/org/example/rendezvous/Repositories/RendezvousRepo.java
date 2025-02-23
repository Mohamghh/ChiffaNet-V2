package org.example.rendezvous.Repositories;

import org.example.rendezvous.Entities.Rendezvous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface RendezvousRepo extends JpaRepository<Rendezvous, Long> {
}

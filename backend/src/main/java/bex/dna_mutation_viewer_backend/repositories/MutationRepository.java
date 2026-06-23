package bex.dna_mutation_viewer_backend.repositories;

import bex.dna_mutation_viewer_backend.models.Mutation;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutationRepository extends CrudRepository<Mutation, Long> {

}

package bex.dna_mutation_viewer_backend.mutation;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MutationRepository extends CrudRepository<Mutation, Long> {

}

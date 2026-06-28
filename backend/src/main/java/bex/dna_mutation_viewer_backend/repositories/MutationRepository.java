package bex.dna_mutation_viewer_backend.repositories;

import bex.dna_mutation_viewer_backend.models.Mutation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MutationRepository extends JpaRepository<Mutation, Long> {

    List<Mutation> findByChromosome(String chromosome);

}

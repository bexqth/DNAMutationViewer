package bex.dna_mutation_viewer_backend.services;

import bex.dna_mutation_viewer_backend.models.Mutation;

import java.util.List;

public interface MutationService {
    Mutation saveMutation(Mutation mutation);
    List<Mutation> fetchMutationList();
    //Mutation updateMutation(Mutation mutation, Long mutationId);
    //void deleteMutationById(Long mutationId);
}

package bex.dna_mutation_viewer_backend.mutation;

import java.util.List;

public interface MutationService {
    Mutation saveMutation(Mutation mutation);
    List<Mutation> fetchMutationList();
    //Mutation updateMutation(Mutation mutation, Long mutationId);
    //void deleteMutationById(Long mutationId);
}

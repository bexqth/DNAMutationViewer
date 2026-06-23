package bex.dna_mutation_viewer_backend.services;

import bex.dna_mutation_viewer_backend.models.Mutation;
import bex.dna_mutation_viewer_backend.repositories.MutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutationServiceImpl implements MutationService {

    @Autowired
    private MutationRepository mutRepository;

    @Override
    public Mutation saveMutation(Mutation mutation) {
        return null;
    }

    @Override
    public List<Mutation> fetchMutationList() {
        return (List<Mutation>) mutRepository.findAll();
    }

    /*@Override
    public Mutation updateMutation(Mutation mutation, Long mutationId) {
        return null;
    }*/

    /*@Override
    public void deleteMutationById(Long mutationId) {

    }*/
}

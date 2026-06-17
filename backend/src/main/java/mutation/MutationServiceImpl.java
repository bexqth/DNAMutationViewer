package mutation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MutationServiceImpl implements MutationService{

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

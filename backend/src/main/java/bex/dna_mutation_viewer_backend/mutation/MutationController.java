package bex.dna_mutation_viewer_backend.mutation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MutationController {

    @Autowired
    private MutationService mutService;

    @GetMapping("/mutations")
    public List<Mutation> fetchMutationList() {
        return mutService.fetchMutationList();
    }

}

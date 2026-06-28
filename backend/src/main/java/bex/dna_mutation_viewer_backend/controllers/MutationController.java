package bex.dna_mutation_viewer_backend.controllers;

import bex.dna_mutation_viewer_backend.dto.GenomeSettingDto;
import bex.dna_mutation_viewer_backend.models.Mutation;
import bex.dna_mutation_viewer_backend.services.MutationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.List;

@RestController
public class MutationController {

    @Autowired
    private MutationService mutService;

    @GetMapping("/mutations")
    public List<Mutation> fetchMutationList() {
        return mutService.fetchMutationList();
    }

    @PostMapping("/mutations/upload")
    public Mutation uploadGenomeFile(@RequestPart("fastaFile")MultipartFile fastaFile, @RequestPart("inputSettings") GenomeSettingDto genomeSettingDto) {
        MultipartFile file = fastaFile;
        GenomeSettingDto userSettings = genomeSettingDto;

        System.out.println("File: " + fastaFile.getOriginalFilename());
        System.out.println("User settings: " + genomeSettingDto);
        this.mutService.analyzeFastaGenomeFile(fastaFile, userSettings);
        return null;
    };

}

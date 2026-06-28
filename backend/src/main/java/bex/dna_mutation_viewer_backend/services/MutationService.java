package bex.dna_mutation_viewer_backend.services;

import bex.dna_mutation_viewer_backend.dto.GenomeSettingDto;
import bex.dna_mutation_viewer_backend.models.Mutation;
import bex.dna_mutation_viewer_backend.repositories.MutationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.List;

@Service
public class MutationService {

    @Autowired
    private MutationRepository mutRepository;

    public Mutation saveMutation(Mutation mutation) {
        return null;

    }

    public List<Mutation> fetchMutationList() {
        return (List<Mutation>) mutRepository.findAll();
    }

    public void analyzeFastaGenomeFile(MultipartFile fastaFile, GenomeSettingDto userSettings) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(fastaFile.getInputStream()));
            StringBuilder stringBuilder = new StringBuilder();
            String line = null;
            while((line = reader.readLine()) != null ) {
                if(line.startsWith(">")) {
                    continue;
                }
                stringBuilder.append(line.trim());
            }
            reader.close();
            String fastaContent = stringBuilder.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

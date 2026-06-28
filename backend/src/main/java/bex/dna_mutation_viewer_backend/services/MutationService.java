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

    public List<Mutation> fetchMutationsByChromosome(String chromosome) {
        return (List<Mutation>) mutRepository.findByChromosome(chromosome);
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
                stringBuilder.append(line.trim().toUpperCase());
            }
            reader.close();
            String fastaContent = stringBuilder.toString();
            String genomeSubstring = fastaContent.substring(userSettings.startPosition().intValue(), userSettings.endPosition().intValue());
            List<Mutation> possibleMutations = mutRepository.findByChromosome(userSettings.selectedChromosome());

            for (int i = 0; i < possibleMutations.size(); i++) {
                if (userSettings.startPosition() <= possibleMutations.get(i).getPosition() && userSettings.endPosition() >= possibleMutations.get(i).getPosition()) {
                    Long substringPosition = possibleMutations.get(i).getPosition() - userSettings.startPosition();
                    String nucleotide = genomeSubstring.substring(substringPosition.intValue(), substringPosition.intValue() + 1);
                    System.out.println(possibleMutations.get(i).getGeneName());
                    System.out.println(possibleMutations.get(i).getPosition());
                    System.out.println(possibleMutations.get(i).getAltAllele());
                    System.out.println(possibleMutations.get(i).getRefAllele());
                    System.out.println(nucleotide);
                }
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

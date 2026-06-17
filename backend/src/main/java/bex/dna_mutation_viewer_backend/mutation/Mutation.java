package bex.dna_mutation_viewer_backend.mutation;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mutation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    private String geneName;
    private String chromosome;
    private Long position;
    private String refAllele;
    private String altAllele;
    private String impact;

    protected Mutation() {

    }

    public Mutation(String geneName, String chromosome, Long position, String refAllele, String altAllele, String impact) {
        this.geneName = geneName;
        this.chromosome = chromosome;
        this.position = position;
        this.refAllele = refAllele;
        this.altAllele = altAllele;
        this.impact = impact;
    }

    @Override
    public String toString() {
        return String.format(
                "Mutation[id=%d, geneName='%s', chromosome='%s']",
                id, geneName, chromosome);
    }

    public String getGeneName() {
        return geneName;
    }
    public String getChromosome() {
        return chromosome;
    }

    public Long getPosition() {
        return position;
    }

    public String getRefAllele() {
        return refAllele;
    }

    public String getAltAllele() {
        return altAllele;
    }

    public String getImpact() {
        return impact;
    }
}

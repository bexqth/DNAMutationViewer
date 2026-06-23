<script setup>
import { ref } from 'vue';
import Select from 'primevue/select';
import InputNumber from 'primevue/inputnumber';
import Checkbox from 'primevue/checkbox';

const genomeFormData = defineModel();

const chromosomes = ref([
  { name: 'Chromosome 21 (~35 MB)', value: 'chr21' },
  { name: 'Chromosome 22 (~40 MB)', value: 'chr22' },
  { name: 'Chromosome 17 (TP53 gén)', value: 'chr17' },
  { name: 'Chromosome M (Mitochondrial)', value: 'chrM' }
]);
</script>

<template>
  <div class="genome-form-card">
    <div class="form-section-title">Genome Configurations</div>

    <div class="form-grid">
      <div class="form-field">
        <label for="chrom">Chromosome</label>
        <Select
            v-model="genomeFormData.selectedChromosome"
            :options="chromosomes"
            optionLabel="name"
            optionValue="value"
            placeholder="Select Chromosome"
            class="custom-select"
        />
      </div>

      <div class="form-row">
        <div class="form-field">
          <label for="start">Start Position (bp)</label>
          <InputNumber
              id="start"
              v-model="genomeFormData.startPosition"
              placeholder="e.g. 100000"
              class="custom-input"
          />
        </div>
        <div class="form-field">
          <label for="end">End Position (bp)</label>
          <InputNumber
              id="end"
              v-model="genomeFormData.endPosition"
              placeholder="e.g. 500000"
              class="custom-input"
          />
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>

.genome-form-card {
  background: #ffffff;
  border: 1px solid #eef2f5;
  border-radius: 16px;
  padding: 24px;
  margin: 20px;
  box-shadow: 0 4px 20px rgba(0, 0, 0, 0.02);
}

.form-section-title {
  font-family: "Inter var", "Inter", sans-serif;
  font-size: 0.95rem;
  font-weight: 600;
  color: #4a5560;
  text-transform: uppercase;
  letter-spacing: 0.5px;
  margin-bottom: 20px;
}

.form-grid {
  display: flex;
  flex-direction: column;
  gap: 18px;
}

.form-field {
  display: flex;
  flex-direction: column;
  gap: 6px;
}

.form-field label {
  font-family: "Inter var", "Inter", sans-serif;
  font-size: 0.85rem;
  font-weight: 500;
  color: #718096;
}

.form-row {
  display: flex;
  gap: 16px;
}

.form-row .form-field {
  flex: 1;
}

:deep(.custom-select),
:deep(.custom-input .p-inputtext) {
  width: 100%;
  font-family: "Inter var", "Inter", sans-serif !important;
  border-radius: 10px !important;
  border: 1px solid #cbd5e1 !important;
  font-size: 0.9rem;
  transition: all 0.2s;
}

:deep(.custom-select:hover),
:deep(.custom-input .p-inputtext:hover) {
  border-color: #83ade2 !important;
}

:deep(.custom-select:focus-within),
:deep(.custom-input .p-inputtext:focus) {
  border-color: #83ade2 !important;
  box-shadow: 0 0 0 3px rgba(131, 173, 226, 0.2) !important;
}

:deep(.custom-select .p-select-label),
:deep(.custom-select .p-dropdown-label) {
  font-family: "Inter var", "Inter", sans-serif !important;
}

:deep(.p-select-option),
:deep(.p-dropdown-item) {
  font-family: "Inter var", "Inter", sans-serif !important;
  font-size: 0.9rem;
}

</style>
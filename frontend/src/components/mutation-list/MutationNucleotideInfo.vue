<script setup>
import {ref, watch} from "vue";
  import Avatar from "primevue/avatar";

  const props = defineProps(["selectedMutation"]);

  const refBase1 = ref();
  const refBase2 = ref();

  const altBase1 = ref();
  const altBase2 = ref();

  const defineBasicPair = (selectedMutation) => {
    console.log(selectedMutation);
    refBase1.value = selectedMutation.refAllele;
    altBase1.value = selectedMutation.altAllele;
    refBase2.value = assignNucleotide(refBase1.value);
    altBase2.value = assignNucleotide(altBase1.value);
  }

  const assignNucleotide = (nucleotide) => {
    switch (nucleotide) {
      case "A":
        return "T";
      case "T":
          return "A"
      case "C":
        return "G";
      case "G":
        return "C"
    }
  }

  watch(() => props.selectedMutation,
      (newVal) => {
        defineBasicPair(newVal);
      },
      {
        immediate: true
      }
  );

</script>

<template>
  <div class="nucleotide-container ">
    <div class="pair-row">
      <span class="pair-label">REF:</span>
      <Avatar :label="refBase1" class="mr-2" size="xlarge" />
      <Avatar label="--"></Avatar>
      <Avatar :label="refBase2" class="mr-2" size="xlarge" />
    </div>
    <div class="pair-row">
      <span class="pair-label">ALT:</span>
      <Avatar :label="altBase1" class="mr-2" size="xlarge" />
      <Avatar label="--"></Avatar>
      <Avatar :label="altBase2" class="mr-2" size="xlarge" />
    </div>
  </div>
</template>

<style>

  .nucleotide-container {
    display: flex;
    flex-direction: column;
    align-items: center;
    gap: 12px;
    padding: 10px;
    font-family: 'Inter', sans-serif;
  }

  .pair-row {
    display: flex;
    flex-direction: row;
    align-items: center;
    gap: 8px;
  }

</style>
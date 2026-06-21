<script setup>
  import { ref } from 'vue'
  const loadedSequence = ref();

</script>

<template>
  <h3 class="title">Nucleotide sequence information</h3>
  <div class="basic-information">
    <span>Gene name:</span>
    <span>Position:</span>
    <span>Chromosome:</span>
  </div>
  <div class="dna-visual">

  </div>
</template>

<style scoped>

  .basic-information{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    font-family: 'Inter', sans-serif;
    margin: 10px;
  }



</style>
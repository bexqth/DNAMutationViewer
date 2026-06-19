<script setup>
  import {ref} from "vue";
  import Avatar from "primevue/avatar";

  const refBase1 = ref('A');
  const refBase2 = ref('T');

  const altBase1 = ref('C');
  const altBase2 = ref('G');
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
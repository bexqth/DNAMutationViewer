<script setup>

import Avatar from "primevue/avatar";
import MutationNucleotideInfo from "@/components/mutation-list/MutationNucleotideInfo.vue";
import MutationInfo from "@/components/mutation-list/MutationInfo.vue";
</script>

<template>
  <div class="sidebar-container">
    <div class="dna-avatar-container">
      <Avatar image="src/assets/gene-mutation_white.png" class="dna-avatar" shape="circle" />
    </div>

    <div class="dna-nucleotide-container">
      <MutationNucleotideInfo></MutationNucleotideInfo>
    </div>

    <div class="dna-info-container">
      <MutationInfo></MutationInfo>
    </div>

  </div>
</template>

<style>

  .sidebar-container {
    display: flex;
    flex-direction: column;
    width: 100%;
    height: 100%;
    gap: 20px;
  }

  .dna-avatar-container {
    flex: 2;
    flex-shrink: 1;
    display: flex;
    justify-content: center;
    align-items: center;
    min-height: 0;
    height: 120px;
  }

  .dna-avatar {
    margin-top: 20px;
    background-color: #83ade2 !important;
    height: 100% !important;
    width: auto !important;
    aspect-ratio: 1 / 1 !important;
  }

  .dna-avatar img {
    width: 60% !important;
    height: 60% !important;
    object-fit: contain !important;
    margin: auto;
  }

  .dna-nucleotide-container {
    flex: 2;
  }

  .dna-info-container {
    flex: 8;
  }
</style>
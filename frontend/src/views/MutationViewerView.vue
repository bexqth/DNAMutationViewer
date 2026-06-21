<script setup>

import NucleotideSequenceInfo from "@/components/mutation-viewer/NucleotideSequenceInfo.vue";
import GenomeLoader from "@/components/mutation-viewer/GenomeLoader.vue";
</script>
<template>
  <div class="mutation-viewer-page">
    <h2 class="title">Mutation Viewer</h2>

    <div class="viewer-rows">
      <div class="viewer-box genome-loader">
        <GenomeLoader></GenomeLoader>
      </div>
      <div class="viewer-box nucleotide-sequence-container">
        <NucleotideSequenceInfo></NucleotideSequenceInfo>
      </div>
      <div class="viewer-box aminoacid-sequence-container">

      </div>
    </div>
  </div>
</template>

<style scoped>
  .title {
    margin-left: 10px;
    margin-top: 20px;
    margin-bottom: 15px;
    font-family: 'Inter', sans-serif;
    text-transform: uppercase;
    color: #0f191f;
  }

  .mutation-viewer-page {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
    height: 100%;
    box-sizing: border-box;
  }

  .viewer-rows {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
    gap: 20px;
    box-sizing: border-box;
    margin: 0 10px;
    padding-bottom: 20px;
  }

  .viewer-box {
    flex: 1;
    background-color: #fff;
    border-radius: 20px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.03);
    width: 100%;
    box-sizing: border-box;
  }
</style>
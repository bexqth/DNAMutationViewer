<script setup>
  import Button from 'primevue/button'
  import Dialog from 'primevue/dialog'
  import {ref} from "vue";
  import GenomeLoaderDialog from "@/components/mutation-viewer/GenomeLoaderDialog.vue";
  const genomeDialogVisible = ref(false)

</script>

<template>
  <div class="genome-header">
    <h3 class="genome-title">Genome loader</h3>
    <Button class="genome-load-btn" @click="genomeDialogVisible = true">Load Fasta</Button>

    <Dialog v-model:visible="genomeDialogVisible" header="Fasta genome loader" :draggable="false">
      <GenomeLoaderDialog></GenomeLoaderDialog>
    </Dialog>

  </div>

</template>

<style>

  .p-dialog-header {
    padding: 16px 24px 8px 24px !important;
  }

  .p-dialog-title {
    font-family: "Inter var", "Inter", sans-serif !important;
    font-size: 1.2rem;
    color: #0f191f;
  }

  .genome-header{
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    margin-left: 20px;
    margin-right: 20px;
    margin-top: 10px;
  }

  .genome-title{
    margin: 0;
    font-family: "Inter var", "Inter", sans-serif;
    text-transform: uppercase;
  }

  .genome-load-btn{
    padding-left: 20px;
    padding-right: 20px;
    background: #83ade2;
    border: none;
    cursor: pointer;
    border-radius: 20px;
    font-family: "Inter var", "Inter", sans-serif;
    color: white;
    height: 40px;
  }

  .genome-load-btn:hover {
    background: none !important;
    border: 1px solid black !important;
    color: #83ade2 !important;
    transform: scale(1.05);
  }

</style>
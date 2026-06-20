<script setup>
  import DataTable from 'primevue/datatable';
  import Column from 'primevue/column';
  import { ref, onMounted } from 'vue';
  import MutationSideBar from "@/components/mutation-list/MutationSideBar.vue";

  const mutations = ref([
    { geneName: 'BRCA1', chromosome: '17', position: '43044295', refAllele: 'T', altAllele: 'G', impact: 'high' },
    { geneName: 'TP53', chromosome: '17', position: '7673767', refAllele: 'C', altAllele: 'A', impact: 'medium' },
    { geneName: 'EGFR', chromosome: '7', position: '55242465', refAllele: 'A', altAllele: 'T', impact: 'low' }
  ]);

  const selectedMutation = ref(mutations.value[0]);

</script>


<template>
  <div class="mutation-list">
    <h2 class="title">Mutation list</h2>

    <div class="content-container">
      <div class="table-container">
        <DataTable class="data-table" :value="mutations" v-model:selection="selectedMutation" selection-mode="single">
          <Column field="geneName" header="Gene name" sortable style="width: 25%"></Column>
          <Column field="chromosome" header="Chromosome"></Column>
          <Column field="position" header="Position"></Column>
          <Column field="refAllele" header="Ref allele"></Column>
          <Column field="altAllele" header="Alt allele"></Column>
          <Column field="impact" header="Impact"></Column>
        </DataTable>
      </div>

      <div class="dna-container">
        <MutationSideBar :selectedMutation = "selectedMutation"></MutationSideBar>
      </div>
    </div>

  </div>
</template>

<style>

  .title{
    margin-left: 10px;
  }

  .mutation-list {
    display: flex;
    flex-direction: column;
    flex-grow: 1;
    height: 100%;
  }

  .mutation-list .content-container {
    display: flex;
    flex-direction: row;
    flex-grow: 1;
    height: 100%;
    gap: 20px;
    box-sizing: border-box;
    margin-left: 10px;
    margin-right: 10px;
  }

  .table-container {
    background-color: #fff;
    border-radius: 20px;
    flex-grow: 1;
    min-width: 400px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.03);
  }

  .data-table {
    margin: 10px;
    font-family: "Inter var", "Inter", sans-serif !important;
  }

  .data-table tr:hover td {
    background-color: #f8fafc;
  }

  .dna-container {
    background-color: #fff;
    border-radius: 20px;
    box-shadow: 0 4px 12px rgba(0, 0, 0, 0.03);
    display: flex;
    min-width: 300px;
    max-width: 300px;
  }

  .title{
    font-family: 'Inter', sans-serif;
    text-transform: uppercase;
    color: #0f191f;
  }

</style>
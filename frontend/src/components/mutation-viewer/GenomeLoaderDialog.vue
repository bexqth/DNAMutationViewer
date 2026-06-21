<script setup>
  import {ref} from "vue";
  import {FileUpload} from "primevue";

  const loadedFastaFile = ref();

  const onUpload = () => {
    console.log("Upload");
  }

</script>

<template>
  <FileUpload
      name="fastaFile"
      mode="advanced"
      @upload = "onUpload"
      :multiple="false"
      accept="image/*"
      :maxFileSize="5000000000"
  >
    <template #empty>
      <div class="load-container">
        <img src="../../assets/loading.png" alt="Upload FASTA" class="upload-icon"/>
        <div class="text-group">
          <p class="main-text">Drag & drop your <strong>.fasta</strong> file here</p>
        </div>
      </div>
    </template>
  </FileUpload>

</template>

<style scoped>



.load-container {
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: center;
  gap: 15px;

  padding: 40px 20px;
  border: 2px dashed #94a3b8;
  border-radius: 12px;
  background-color: #f8fafc;
  cursor: pointer;
  transition: all 0.2s ease-in-out;
}

.load-container:hover {
  border-color: #83ade2;
  background-color: #f1f5f9;
}

.upload-icon {
  width: 64px;
  height: 64px;
  object-fit: contain;
  opacity: 0.7;
  transition: transform 0.2s ease-in-out;
}

.load-container:hover .upload-icon {
  transform: scale(1.05);
  opacity: 1;
}

.text-group {
  text-align: center;
  font-family: 'Inter', sans-serif;
}

.main-text {
  margin: 0;
  font-size: 1rem;
  color: #334155;
}

.sub-text {
  margin: 4px 0 0 0;
  font-size: 0.85rem;
  color: #64748b;
}
</style>
<!-- src/App.vue -->
<script setup>
  import Button from 'primevue/button'
</script>

<template>
  <div class="full-container flex flex-column">

    <div class="navbar-container">
        <Button @click="$router.push('mutations')" class="navbar-btn" label="Mutation List" />
        <Button @click="$router.push('mutation-viewer')" class="navbar-btn" label="Mutation Viewer" />
        <Button @click="$router.push('new-mutation')" class="navbar-btn" label="Add new" />
    </div>

    <div class="content-container">
      <RouterView />
    </div>

  </div>
</template>

<style>
  html, body {
    background-color: #ebeef3;
  }

  .navbar-container {
    display: flex;
    flex-direction: row;
    align-items: center;
    justify-content: center;
    gap: 1rem;
    margin-top: 1rem;
  }

  .navbar-btn {
    padding-left: 20px !important;
    padding-right: 20px !important;
    background: #83ade2 !important;
    border: none !important;
    cursor: pointer;
    border-radius: 20px !important;
    font-family: "Inter var", "Inter", sans-serif !important;
  }

  .navbar-btn:hover {
    background: none !important;
    border: 1px solid black !important;
    color: #83ade2 !important;
    transform: scale(1.05);
  }


</style>
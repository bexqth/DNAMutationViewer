<script setup>
import { ref } from "vue";

const selectedMutation = ref({
  geneName: 'BRCA1',
  chromosome: '17',
  position: '43044295',
  impact: 'HIGH'
});
</script>

<template>
  <div class="info-container">

    <div class="info-item">
      <span class="info-label">Gene Name:</span>
      <span class="info-text">{{ selectedMutation.geneName }}</span>
    </div>

    <div class="info-item">
      <span class="info-label">Chromosome:</span>
      <span class="info-text">{{ selectedMutation.chromosome }}</span>
    </div>

    <div class="info-item">
      <span class="info-label">Position:</span>
      <span class="info-text">{{ selectedMutation.position }}</span>
    </div>

    <div class="info-item">
      <span class="info-label">Impact:</span>
      <span :class="['impact-badge', selectedMutation.impact.toLowerCase()]">
        {{ selectedMutation.impact }}
      </span>
    </div>

  </div>
</template>

<style>

.info-container {
  display: flex;
  flex-direction: column;
  gap: 12px;
  padding: 10px;
  font-family: 'Inter', sans-serif;
}

.info-item {
  display: flex;
  justify-content: space-between;
  align-items: center;
  border-bottom: 1px solid #f1f5f9;
  padding-bottom: 8px;
}

.info-item:last-child {
  border-bottom: none;
}

.info-label {
  font-size: 13px;
  font-weight: 500;
  color: #64748b;
}

.info-text {
  font-size: 13px;
  font-weight: 600;
  color: #0f191f;
}


.impact-badge {
  padding: 3px 8px;
  border-radius: 4px;
  font-size: 11px;
  font-weight: 700;
  text-transform: uppercase;
}

.impact-badge.high { background-color: #fee2e2; color: #ef4444; }
.impact-badge.medium { background-color: #ffedd5; color: #f59e0b; }
.impact-badge.low { background-color: #e0f2fe; color: #0284c7; }

</style>
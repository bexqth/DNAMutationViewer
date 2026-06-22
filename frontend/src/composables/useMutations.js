import {onMounted, ref} from 'vue';
import mutationService from '../services/mutationService.js';

export function useMutations() {
    const mutations = ref([]);
    const selectedMutation = ref();
    const isLoading = ref(true);
    const error = ref(null);

    const fetchMutations = async () => {
        try {
            const response = await mutationService.getMutations();
            mutations.value = response.data;
            console.log("selected mutation in composable")
            console.log(response.data[0]);
            selectedMutation.value = response.data[0];
        }
        catch (error) {
            error.value = error;
        }
        finally {
            isLoading.value = false;
        }
    }

    const uploadGenomeFasta = async (fastaFile, inputSettings) => {
        try {
            const response = await mutationService.postUploadGenomeFasta(fastaFile, inputSettings);
        }
        catch (e) {
            error.value = e;
        }

    }

    onMounted(fetchMutations);

    return {mutations, isLoading, error, selectedMutation, uploadGenomeFasta};
}
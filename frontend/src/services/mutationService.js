import {apiClient} from "@/api/apiClient.js";

export default {
    getMutations () {
        return apiClient.get('/mutations');
    }
}



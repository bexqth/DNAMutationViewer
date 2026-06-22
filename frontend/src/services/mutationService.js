import {apiClient} from "@/api/apiClient.js";

export default {
    getMutations () {
        return apiClient.get('/mutations');
    },

    postUploadGenomeFasta(fastaFile, inputSettings) {
        let formData = new FormData();
        formData.append('fastaFile', fastaFile);

        const inputSettingBlob = new Blob([JSON.stringify(inputSettings)], {type: 'application/json'});
        formData.append('inputSettings', inputSettingBlob);

        return apiClient.post('/mutations/upload', formData,
            { headers: { 'Content-Type': 'multipart/form-data' }
            });
    }
}



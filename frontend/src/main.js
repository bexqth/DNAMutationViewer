import './assets/main.css'

import { createApp } from 'vue'
import PrimeVue from 'primevue/config'
import Aura from '@primevue/themes/aura';
import Tooltip from 'primevue/tooltip'
import 'primeicons/primeicons.css'


import App from './App.vue'
import router from './router'

const app = createApp(App)
app.use(router)

app.use(PrimeVue, {
    theme: {
        preset: Aura,
        options: {
            prefix: 'p',
            darkModeSelector: 'system',
            cssLayer: {
                name: 'primevue',
                order: 'primevue'
            }
        }
    }
})

app.directive('tooltip', Tooltip)
app.mount('#app')

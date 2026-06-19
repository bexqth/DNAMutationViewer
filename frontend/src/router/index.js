import {createRouter, createWebHistory} from 'vue-router'

import MutationListView from '../views/MutationListView.vue'
import MutationViewerView from '../views/MutationViewerView.vue'
import NewMutationView from '../views/NewMutationView.vue'

const routes = [
    {
        path: '/mutations',
        name: 'mutations',
        component: MutationListView,
    },
    {
        path: '/mutation-viewer',
        name: 'mutation-viewer',
        component: MutationViewerView

    },
    {
        path: '/new-mutation',
        name: 'new-mutation',
        component: NewMutationView
    }
]

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})

export default router


import {createRouter, createWebHistory} from 'vue-router'
import Router from 'vue-router'

import MutationListView from '../views/MutationListView.vue'
import MutationViewerView from '../views/MutationViewerView.vue'
import NewMutationView from '../views/NewMutationView.vue'

const routes = [
    {
        path: '/mutations',
        name: 'Mutations',
        component: MutationListView,
    },
    {
        path: '/mutation-viewer',
        name: 'MutationViewer',
        component: MutationViewerView

    },
    {
        path: '/new-mutation',
        name: 'NewMutation',
        component: NewMutationView
    }
]

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes
})

export default router


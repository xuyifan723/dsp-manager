var menudd = {

    data() {
        return {
            menuchildren: []
        }
    },
    props: ['menudddata'],
    template: '#menuchildren',
    mounted() {
        this.menuchildren = this.menudddata;
    },
}


var menu = new Vue({
    el: "#menu",
    data: {
        menus: [{
            id: 1,
            name: '组管理',
            isParent: 1,
            parent: 0
        }, {
            id: 2,
            name: '组管理2',
            isParent: 0,
            parent: 1
        }, {
            id: 3,
            name: '组管理3',
            isParent: 0,
            parent: 1
        }, {
            id: 4,
            name: '组管理4',
            isParent: 0,
            parent: 0
        }, {
            id: 5,
            name: '组管理5',
            isParent: 0,
            parent: 0
        }]
    },
    methods: {
        getchildren(id) {
            var children=[];
            for (var i = 0; i < this.menus.length; i++) {
                var item = this.menus[i];
                if (item.parent == id) {
                    children.push(item);
                }
            }
            console.log(children)
            return children;
        }
    },

})


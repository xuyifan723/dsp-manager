
var form=new Vue({
    el:"#formid",
    data:{
        userlist:[]
    },
    methods:{
        pushuser:function(){
            var user={id:1,um:'XUYIFAN422',name:'徐益繁'};
           this.userlist.push(user);
        },
        showuser:function(){
            console.log(this.userlist);
            alert(this.userlist);
        },
        getuser:function(){
            this.$http.get('http://localhost:8080/data-manager/getuserList').then(function (data){
                this.userlist=data.data.data;
        },function(){
                alert('请求失败！');
            });
        },
        getpostuser(){
            this.$http.post('http://localhost:8080/data-manager/getuserList',{id:1},{
                emulateJSON: true
            }).then(function (data){
                this.userlist=data.data.data;
            },function(){
                alert('请求失败！');
            });
        }
    }
})

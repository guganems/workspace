var vm = new Vue({
    el: "#vue_det",
    data: {
        firstname: "Guga",
        lastname: "Nemsitsveridze",
        address: "Tbilisi"
    },
    methods: {
        mydetails: function() {
            return 'I am ' + this.firstname + " " + this.lastname;
        }
    }
});

Vue.component('props-demo-simple', {
    props: ['size', 'myMessage']
});

Vue.component('props-demo-advanced', {
    props: {
        height: Number,

        Age: {
            type: Number,
            default: 0,
            required: true,
            validator: function (value){
                return value >= 0
            }
        }
    }
});

var Comp = Vue.extend ({
    props: ['msg'],
    template: '<div>{{msg}}</div>'
});
var vm = new Comp ({
    propsData: {
        msg: 'hello'
    }
});
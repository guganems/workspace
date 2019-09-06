const token = "pk.eyJ1IjoibmVlZGxldGlwc29uIiwiYSI6ImNrMDgxanozNDQ0dHIzbnV0Z2k0Z3lyc3EifQ.Z17FNTmz7YYPCb1iJJ3iYw";

var mymap = L.map('mapid').setView([41.718, 44.778], 16);

L.tileLayer(`https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token=${token}`, {
    attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="https://www.mapbox.com/">Mapbox</a>',
    maxZoom: 18,
    id: 'mapbox.satellite',
    accessToken: token
}).addTo(mymap);

var marker = L.marker([41.718, 44.778]).addTo(mymap);

var circle = L.circle([41.718, 44.775], {
    color: 'red',
    fillColor: '#f03',
    fillOpacity: 0.5,
    radius: 100
}).addTo(mymap);
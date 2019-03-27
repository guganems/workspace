importScripts('https://www.gstatic.com/firebasejs/4.8.1/firebase-app');
importScripts('https://www.gstatic.com/firebasejs/4.8.1/firebase-messaging.js');

firebase.initializeApp({
    'messagingSenderId': '274157856351'
});

const messaging = firebase.messaging();

messaging.setBackgroundMessageHandler(function (payLoad) {
    console.log('[firebase-messaging-sw.js] Received background message ', payLoad);

    var obj = JSON.parse(payLoad.data.notification);
    var notificationTitle = obj.title;
    var notificationOptions = {
        body: obj.body,
        icon: obj.icon
    };

    return self.registration.showNotification(notificationTitle, notificationOptions);
});
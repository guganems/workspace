<<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Send Message</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" type="text/css" media="screen" href="main.css">
    <script src="main.js"></script>
    <style>
        div {
            margin-bottom: 15px;
        }
    </style>
    <link rel="icon" sizes="192x192" href="//www.gstatic.com/mobilesdk/160503_mobilesdk/logo/2x/firebase_96dp.png">
</head>
<body>
<div id="token"></div>
<script src="https://www.gstatic.com/firebasejs/5.9.1/firebase.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.9.1/firebase-app.js"></script>
<script src="https://www.gstatic.com/firebasejs/5.9.1/firebase-messaging.js"></script>
<script>
  // Initialize Firebase
  // TODO: Replace with your project's customized code snippet
  var config = {
    apiKey: "AIzaSyAiTXCI1H9WgDzGGyyLr5tSfLCp1UyELa0",
    authDomain: "web-hermes.firebaseapp.com",
    databaseURL: "https://web-hermes.firebaseio.com",
    projectId: "web-hermes",
    storageBucket: "web-hermes.appspot.com",
    messagingSenderId: "274157856351",
  };
  firebase.initializeApp(config);

    const messaging = firebase.messaging();

    messaging.usePublicVapidKey('BDoEF1UmPU5rmhhF1X-2Q7ura3GgszvuXe0_1bAyIBpQiSnmP4ZEc8Xo3sVhzwSd50BKUYQKIQAikMT9Y_U3ER4');

    messaging.requestPermission().then (function() {
        console.log("Notification permission granted.");

        messaging.getToken().then(function(currentToken) {
            console.log(currentToken);
            document.getElementById('token').innerHTML = currentToken;
        }).catch(function(err) {
            console.log("Error occured while retrieving token.");
            showToken('Error retrieving instance ID token.');
            setTokenSentToServer(false);
        });
    }).catch(function(err) {
        console.log('Unable to get permission to safety.', err);
    });

    messaging.onMessage(function (payLoad) {
        var obj = JSON.parse(payLoad.data.notification);
        var notification = new Notification(obj.title, {
            icon: obj.icon,
            body: obj.body
        });
    });
</script>
</body>
</html>
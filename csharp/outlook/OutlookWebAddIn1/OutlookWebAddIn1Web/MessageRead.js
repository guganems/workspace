'use strict';

(function () {
    Office.onReady(function () {
        $(document).ready(function () {
            loadItemProps(Office.context.mailbox.item);
        });
    });

    function loadItemProps(item) {
        $("#item-id").text(item.itemId);
        $("#item-subject").text(item.subject);
        $("#item-internetMessageId").text(item.internetMessageId);
        $("#item-from").html(item.from.displayName + " &lt; " + item.from.emailAdress + "&gt;");
    }
});
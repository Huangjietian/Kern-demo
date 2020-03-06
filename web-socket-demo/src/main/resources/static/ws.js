var webSocket = null;
var wsEp = null;
function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
    if (connected) {
        $("#conversation").show();
    }
    else {
        $("#conversation").hide();
    }
    $("#greetings").html("");
}

function connect() {
    webSocket = new WebSocket('ws://localhost:8111/ws/refresh');
    webSocket.addEventListener('open',function () {
        webSocket.send("hello websocket!");
    });

    wsEp = new WebSocket("ws://localhost:8111/endpoint/123456");

}


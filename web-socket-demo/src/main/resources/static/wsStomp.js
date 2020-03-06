// 连接stomp ws
var stompClient = null;
function connectStomp() {
    var socket = new SockJS('/gs-guide-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect()
    stompClient.connect({}, function (frame) {
        setConnected(true);
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/greetings', function (greeting) {
            showGreeting(JSON.parse(greeting.body).content);
        });
    });
}

// 断开连接
function disconnectStomp() {
    if (stompClient !== null) {
        stompClient.disconnect();
    }
    if (webSocket != null) {
        webSocket.close();
    }
    setConnected(false);
    console.log("Disconnected");
}


function sendStompMessage() {
    stompClient.send("/app/hello", {}, JSON.stringify({'name': $("#name").val()}));
    if (webSocket.readyState == 1){
        webSocket.send("hello socket. im client. can u hear me ?")
    }

}

function showGreeting(message) {
    $("#greetings").append("<tr><td>" + message + "</td></tr>");
}
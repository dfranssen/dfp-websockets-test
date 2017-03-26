# dfp-websockets-test

This is just a small demo app to test websockets in a [Docker Flow Proxy](http://proxy.dockerflow.com) setup.

## Some notes:
 - application image is built from this source and is available on docker hub: docker.io/dfranssen/test-websocket
 - backend application (html + websockets) is spring boot (tomcat) and is using the STOMP protocol for messaging and the sockjs library
 - websockets have been configured to us an ActiveMQ broker
 - stickiness for websockets doesn't seem to be needed due to broker setup

## In order to test:
 - `docker network create --driver overlay proxy`
 - `docker stack deploy -c docker-compose-stack.yml proxy`
 - generate and inject certificates into proxy as described at http://proxy.dockerflow.com/certs/#adding-certificates-through-http-requests
 - `docker stack deploy -c docker-compose-chat-demo.yml chat`
 - open chrome browser at http://127.0.0.1.xip.io and proceed (ignore self signed certificate warning)
   (Safari will not allow self-signed certificates, use letsencrypt instead)
 - click on 'Chat as...' in top menu. Open a subsequent browser session and click on 'Chat as...' (or change the browser url if your name doesn't fit :smiley: )
 - Note the different *[Routed by host xxx]* for the different users
 - keep on chatting :wink:

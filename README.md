# JMS_Glassfish-3-Server

Implementing JMS in Glassfish 3 server

JMS:
------

It is an API that is used to create, read and send messages. It is a messaging service provider and used to send and receive messages from one application to another.

Generally, user sends message to application. But, if we want to send message from one application to another, we need to use JMS API.

Ex: If one application A is running in India and another application B is running in USA, the for sending message from A to B, we need to use JMS.


Advantage of JMS:
------------------

Asynchronous - to receive the message, client is not required to send the request. Message will arrive automatically to the client.

Reliable - provides assurance that message is delivered.


Messaging domain:-
---------------------

1. Point-to-Point (message devivered to one client only, Queue is used here)
2. Publisher/Subscriber (one message is delivered to all the subscribers, like broadcasting)



JMS Queue Example:-
--------------------

Install glassfish3 server and create two JNDI.

Create connection factory named myQueueConnectionFactory.

Create destination resource names myQueue.

After creating JNDI, create server and receiver application and run them in different console.

Open server admin console by URL http://localhost:4848.

login.

click on JMS Resource -> Connection Factories -> New.

Now, write the pool name and select the Resource type as QueueConnectionFactory.

Initial and minimum pool size = 8

max pool size = 32

idle timeout = 300 sec

max wait time = 60000 sec.

Now, click JMS Resource -> Destination Resources -> New

write the JNDI name and physical destination name.

JNDI name = myQueue

Physical destination name = abc

resource type = javax.jms.Queue



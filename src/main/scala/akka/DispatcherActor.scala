package akka

import akka.actor.{ActorSystem, Actor}
import akka.actor.Actor.Receive

/**
 * Created by Balaji on 30/12/2014.
 */
class DispatcherActor extends Actor{


  def receive = {

    case msg :String => println("Remote app recieved the message ")

    sender ! "Hello, from Dispatcher Actor"

   }
}

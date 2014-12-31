package com.balab.akka

import akka.actor.{Props, ActorSystem}
import akka.DispatcherActor

/**
 * Created by Balaji on 29/12/2014.
 */
object MainApp extends App{

  val system = ActorSystem("HelloRemoteSystem")

  val helloSystemActor = system.actorOf(Props[DispatcherActor], "dispatcherActor")

  helloSystemActor ! "Dispatcher is Alive"
}

package $package$

import com.badlogic.gdx.backends.lwjgl._

object Main extends App {
    val config = new LwjglApplicationConfiguration
    config.title = "$name$"
    config.height = 480
    config.width = 800
    config.forceExit = false
    new LwjglApplication(new $name;format="Camel"$, config)
}

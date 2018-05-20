

fun main(args: Array<String>) {
    Server.start()
}

object Server {

    private final val PORT = 8000


    init {
        println("Server init")
    }

    fun start() {
        println("Server started")
    }

}


class LinkedList {
    data class Node(var next: Node?, var value:Int)

    private var head: Node? = null
    private var tail: Node? = null
    public var length: Int = 0

    constructor() {
        length = 0
    }

    fun add(data: Int) {
        val node = Node(null, data)
        if (length == 0) {
            tail = node
            head = node
        } else {
            tail?.next = node
            tail = node
        }
        length++
    }

    fun isEmpty():Boolean {
        return if(head == null) true else false
    }

    fun get(index: Int): Int {
        if (index >= length)
            return -1;
        var i = 0
        var node = head
        while (i < index) {
            node = node?.next ?: node
            i++
        }
        return node?.value ?: -1
    }
}

// Test
fun main(args: Array<String>) {
    val linkedList = LinkedList()
    println("isEmpty() => " + linkedList.isEmpty())
    linkedList.add(0)
    linkedList.add(1)
    linkedList.add(2)
    linkedList.add(3)
    println("isEmpty() => " + linkedList.isEmpty())
    println("isEmpty() => " + linkedList.length)
    println("get() => " + linkedList.get(0))
    println("get() => " + linkedList.get(1))
    println("get() => " + linkedList.get(2))
    println("get() => " + linkedList.get(3))
    println("get() => " + linkedList.get(3))
}

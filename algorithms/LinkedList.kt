
class LinkedList {
    data class Node(var next: Node?, var value:Any)

    private var head: Node? = null
    private var tail: Node? = null
    private var length: Int = 0

    constructor() {
        length = 0
    }

    fun clear() {
        head = null
        tail = null
        length = 0
    }

    fun add(data: Any) {
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

    fun size(): Int {
        return length
    }

    fun get(index: Int): Any {
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
class Stack {
    data class Node(val value: Any, val bottom: Node?)

    private var length: Int = 0
    private var top: Node? = null

    constructor() {}

    fun push(value: Any) {
       var node = Node(value, top)
       top = node
       length++
    }

    fun pop(): Any {
        if (isEmpty())
            return -1
        
        var node = top
        length --
        top = top?.bottom
        return node?.value ?: -1
    }

    fun front(): Any {
        if (top == null)
            return -1
        return top?.value ?: -1
    }

    fun isEmpty(): Boolean {
        return top == null
    }

    fun size(): Int {
        return length
    }

    fun clear() {
        top = null
    }
    
}
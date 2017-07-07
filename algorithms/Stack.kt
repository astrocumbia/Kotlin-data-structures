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

fun main(args: Array<String>) {
    var stack = Stack()
    println("isEmpty " + stack.isEmpty())
    println("size " + stack.size())
    stack.push(1)
    println("isEmpty " + stack.isEmpty())
    println("size " + stack.size())
    println("pop " + stack.pop())
    println("isEmpty " + stack.isEmpty())
    println("size " + stack.size())

    stack.push(false)
    stack.push("uno")
    stack.push(2.0)
    stack.push(3)
    stack.push(4)
    stack.push(5)
    stack.push(6)
    stack.push(7)
    stack.push(8)

    while (!stack.isEmpty()) {
        println("pop " + stack.pop())
    }

    println("isEmpty " + stack.isEmpty())
    println("size " + stack.size())
}
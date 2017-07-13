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


        val linkedList = LinkedList()
    println("isEmpty() => " + linkedList.isEmpty())
    linkedList.add(0.0)
    linkedList.add("Joa")
    linkedList.add(1)
    linkedList.add(true)
    println("isEmpty() => " + linkedList.isEmpty())
    println("length => " + linkedList.size())
    println("get() => " + linkedList.get(0))
    println("get() => " + linkedList.get(1))
    println("get() => " + linkedList.get(2))
    println("get() => " + linkedList.get(3))
    println("get() => " + linkedList.get(3))

    linkedList.clear()
    println("isEmpty() => " + linkedList.isEmpty())
    println("length => " + linkedList.size())
}
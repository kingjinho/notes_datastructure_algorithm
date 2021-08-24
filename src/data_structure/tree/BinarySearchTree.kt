package data_structure.tree

class BinarySearchTree(private var data: Int?) {

    private var left: BinarySearchTree? = null
    private var right: BinarySearchTree? = null

    fun getData() = data
    fun setData(value: Int?) {
        data = value
    }

    fun add(value: Int) {
        add(this, value)
    }

    private fun add(node: BinarySearchTree, value: Int) {
        when {
            node.data!! > value -> {
                val left = node.left
                if (left == null) {
                    node.left = BinarySearchTree((value))
                } else {
                    add(node.left!!, value)
                }
            }
            node.data!! < value -> {
                val right = node.right
                if (right == null) {
                    node.right = BinarySearchTree(value)
                } else {
                    add(node.right!!, value)
                }
            }
        }
    }

    fun remove(value: Int) {
        val node = BinarySearchTree(value)
        //add(node)
    }

    fun find(value: Int): BinarySearchTree? {
        return find(this, value)
    }

    private fun find(node: BinarySearchTree?, value: Int): BinarySearchTree? {
        if (node?.left == null && node?.right == null) {
            return null
        }
        val left = node.left
        val right = node.right
        return when {
            node.data!! > value -> {
                find(left, value)
            }
            node.data!! < value -> {
                find(right, value)
            }
            else -> {
                node
            }
        }
    }

    fun inOrderTraversal() {
        inOrderTraversal(this)
    }

    private fun inOrderTraversal(node: BinarySearchTree?) {
        if (node != null) {
            inOrderTraversal(node.left)
            println(node.data)
            inOrderTraversal(node.right)
        }
    }

}
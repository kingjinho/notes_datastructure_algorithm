package data_structure.tree

class BinaryTree<T>(private var data: T?) {

    private var left: BinaryTree<T>? = null
    private var right: BinaryTree<T>? = null

    fun getData() = data
    fun setData(value: T?) {
        data = value
    }

    fun getLeft() = left
    fun setLeft(value: BinaryTree<T>?) {
        left = value
    }

    fun setLeft(value: T?) {
        val left = BinaryTree(value)
        this.left = left
    }

    fun getRight() = right
    fun setRight(value: BinaryTree<T>?) {
        right = value
    }

    fun setRight(value: T?) {
        val right = BinaryTree(value)
        this.right = right
    }


    fun preOrderTraversal() {
        preOrderTraversal(this)
    }

    fun inOrderTraversal() {
        inOrderTraversal(this)
    }

    fun postOrderTraversal() {
        postOrderTraversal(this)
    }

    fun levelOrderTraversal() {
        levelOrderTraversal(this)
    }

    private fun preOrderTraversal(node: BinaryTree<T>?) {
        if (node != null) {
            println(node.data)
            preOrderTraversal(node.left)
            preOrderTraversal(node.right)
        }
    }

    private fun inOrderTraversal(node: BinaryTree<T>?) {
        if (node != null) {
            inOrderTraversal(node.left)
            println(node.data)
            inOrderTraversal(node.right)
        }
    }

    private fun postOrderTraversal(node: BinaryTree<T>?) {
        if (node != null) {
            postOrderTraversal(node.left)
            postOrderTraversal(node.right)
            println(node.data)
        }
    }

    private fun levelOrderTraversal(node: BinaryTree<T>?) {
        if(node == this) {
            println(node.data)
        }
        var left = node?.left
        var right = node?.right
        println(left?.data)
        println(right?.data)
        levelOrderTraversal(left)
        levelOrderTraversal(right)
    }

}
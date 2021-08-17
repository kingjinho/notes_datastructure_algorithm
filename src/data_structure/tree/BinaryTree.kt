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

    private fun preOrderTraversal(node: BinaryTree<T>?) {
        if(node != null) {
            println(node.data)
            preOrderTraversal(node.left)
            preOrderTraversal(node.right)
        }
    }
}
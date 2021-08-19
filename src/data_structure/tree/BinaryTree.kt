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


    fun levelOrderTraversal() {
        //maximum height from root to the furthest leaf node
        val height = height(this)

        for (i in 1..height) {
            printCurrentLevel(this, i)
        }
    }

    private fun height(root: BinaryTree<T>?): Int {
        return if (root == null) {
            0
        } else {
            val lHeight = height(root.left)
            val rHeight = height(root.right)

            if (lHeight > rHeight) {
                lHeight + 1
            } else {
                rHeight + 1
            }
        }
    }

    private fun printCurrentLevel(node: BinaryTree<T>?, level: Int) {
        when {
            node == null -> {
                return
            }
            level == 1 -> {
                println(node.data)
            }
            level > 1 -> {
                printCurrentLevel(node.left, level - 1)
                printCurrentLevel(node.right, level - 1)
            }
        }
    }
}
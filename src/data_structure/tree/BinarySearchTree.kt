package data_structure.tree


class BinarySearchTree(private var data: Int) {

    private var left: BinarySearchTree? = null
    private var right: BinarySearchTree? = null

    fun getData() = data
    fun setData(value: Int) {
        data = value
    }

    fun add(value: Int) {
        add(this, value)
    }

    private fun add(node: BinarySearchTree, value: Int) {
        when {
            node.data > value -> {
                val left = node.left
                if (left == null) {
                    node.left = BinarySearchTree((value))
                } else {
                    add(node.left!!, value)
                }
            }
            node.data < value -> {
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
        remove(this, value)
    }

    private fun remove(node: BinarySearchTree?, value: Int): BinarySearchTree? {
        if (node == null) {
            return null
        }

        if (node.data > value) {
            node.left = remove(node.left, value)
            return node
        } else if (node.data < value) {
            node.right = remove(node.right, value)
            return node
        }

        when {
            node.left == null -> {
                return node.right
            }
            node.right == null -> {
                return node.left
            }
            else -> {
                var parent = node

                // Find successor
                var succ = node.right

                while (succ?.left != null) {
                    parent = succ
                    succ = succ.left
                }

                /**
                 * Delete successor.
                 * Since successor is always left child of its parent, we can safely make successor's right
                 * right child as left of its parent.
                 * If there is no succ, then assign succ->right to parent->right
                 */

                if (parent !== node) parent?.left = succ?.right else parent.right = succ?.right

                // Copy Successor Data to root
                node.data = succ!!.data

                return node
            }
        }
    }

    fun find(value: Int): BinarySearchTree? {
        return find(this, value)
    }


    private fun find(node: BinarySearchTree?, value: Int): BinarySearchTree? {
        if (node?.left == null && node?.right == null) {
            return null
        }
        return when {
            node.data!! > value -> {
                find(node.left, value)
            }
            node.data!! < value -> {
                find(node.right, value)
            }
            else -> {
                node
            }
        }
    }

    fun maxValue(): Int {
        if (right == null && left == null) {
            return data!!
        }
        var node: BinarySearchTree? = this
        while (node?.right != null) {
            node = node.right
        }
        return node?.data!!
    }


    fun minValue(): Int {
        if (right == null && left == null) {
            return data!!
        }
        var node: BinarySearchTree? = this
        while (node?.left != null) {
            node = node.left
        }
        return node?.left!!
    }

    fun inOrderTraversal() {
        inOrderTraversal(this)
    }

    private fun inOrderTraversal(node: BinarySearchTree?) {
        if (node == null) {
            return
        }
        inOrderTraversal(node.left)
        println(node.data)
        inOrderTraversal(node.right)
    }

}
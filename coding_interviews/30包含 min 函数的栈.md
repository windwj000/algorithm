[包含 min 函数的栈](https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking&from=cyc_github) 

# 方法一：双栈

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public void push(int node) {
        if (s2.isEmpty() || node <= s2.peek())
            s2.push(node);
        s1.push(node);
    }

    public void pop() {
        if (s1.peek() == s2.peek())
            s2.pop();
        s1.pop();
    }

    public int top() {
        return s1.peek();
    }

    public int min() {
        return s2.peek();
    }

# 方法二：单栈+min

    Stack<Integer> s;
    int min;

    public MinStack() {
        s = new Stack<>();
        min = Integer.MAX_VALUE;
    }

    public void push(int x) {
        if (x <= min) {
            s.push(min);
            min = x;
        }
        s.push(x);
    }

    public void pop() {
        if (s.pop() == min)
            min = s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        return min;
    }

# 方法三：构造 Node 类

    private class Node {
        int val;
        int min;
        Node next;

        private Node(int val, int min) {
            this(val, min, null);
        }

        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    private Node head;

    public MinStack() {
    }

    public void push(int x) {
        if (head == null) {
            head = new Node(x, x);
        } else
            head = new Node(x, Math.min(x, head.min), head);
    }

    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }

# 相关题目

[Min Stack](https://leetcode.com/problems/min-stack/)

[Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/)

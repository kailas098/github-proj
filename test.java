class test {
	public static void main(String args[]) {
		int q = 33;
		System.out.println(q);
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println("hello");

		System.out.println(palindrome("kailas"));

		System.out.println(isNumber("1oo2"));

		printPattern(4);

		Node head = new Node();
		createList(new int[]{1,2,3,4}, head);

		System.out.println(countNum(head));
	}

	public static String palindrome(String s) {
		StringBuffer sb = new StringBuffer();
		int len = s.length();

		for (int i = 0; i < len; i++) {
			sb.append(s.charAt(len - i - 1));
		}

		return sb.toString();
	}

	public static boolean isNumber(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public static void printPattern(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static int countNum(Node head) {
		Node temp = head;
		int c = 0;

		while (temp != null) {
			c += temp.num;
			temp = temp.next;
		}

		return c;
	}

	public static void createList(int[] arr, Node head) {

		for (int a : arr) {
			Node node = new Node();
			node.num = a;
			node.next = null;

			Node last = getLast(head);

			last.next = node;
		}
	}

	public static Node getLast(Node head) {

		Node temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}

		return temp;
	}
}

class Node {
	int num;
	Node next;
}
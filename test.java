class joy {
	public static void main(String args[]) {
		int q = 33;
		System.out.println(q);
		for (int i = 0; i < 5; i++) {
			System.out.print(i);
		}
		System.out.println("hello");

		System.out.println(palindrome("kailas"));
	}

	public static String palindrome(String s) {
		StringBuffer sb =  new StringBuffer();
		int len = s.length();

		for(int i = 0;i<len;i++)
		{
			sb.append(s.charAt(len-i-1));
		}

		return sb.toString();
	}
}

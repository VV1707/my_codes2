class H{
	void show()
	{
		System.out.println("super class");
	}
}
class Hello {
	static H h = new H() { //anonymous
		void show()
		{
			super.show();
			System.out.println("Hello class");
		}
	};
	public static void main(String[] args)
	{
		h.show();
	}
}

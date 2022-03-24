class Child extends Parent {
	// This method overrides show() of Parent
	@Override
	public void show()
	{
		super.show();
		System.out.println("Child's method is printing");
	}
}
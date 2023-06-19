package advanced;

 class Anonymous {
	public void printDetail() {
		System.out.println("am the main method");
	}

}

class Me{
	public static void main(String a[]) {
		
		Anonymous obj = new Anonymous() {
			public void printDetail() {
				System.out.println("am the inner class");
			}
		};
		
		obj.printDetail();
	}
}
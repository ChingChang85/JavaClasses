public class Runner {

	public static void main(String[] args) {
		Parent parent = new Parent("Bob");
		parent.whoAmI();
		Child child = new Child("Ben");
		child.whoAmI();
		Parent anotherChild = new Child("Bill");
		anotherChild.whoAmI();
	}

}
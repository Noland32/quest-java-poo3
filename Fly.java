public interface Fly {


	void takeOff();

	int ascend(int meters);

	int descend(int descend);

	void land(); 

	default void glide() {
		System.out.println("It glides into the air.");
	}

}

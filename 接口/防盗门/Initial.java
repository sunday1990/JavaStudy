
public class Initial{
	public static void main(String[] args) {
		TheftproofDoor door = new TheftproofDoor();
		
		door.unlock();		
		door.openDoor();

		door.lock();
		door.closeDoor();

		door.strongLock();
		door.strongUnlock();

		door.takeAPhotoOfInviter();
	}
}
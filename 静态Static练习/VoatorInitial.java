public class VoatorInitial{
	public static void main(String[] args) {
		while (Voator.totalCount<100) {
			Voator.vote();
		}
		System.out.println("投票截止");
	}
}
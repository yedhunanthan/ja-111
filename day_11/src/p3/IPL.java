package p3;

public class IPL {

	public void homeTeamStadium(Stadium stadium) {
		
		Stadium x = Stadium.M_CHINNASWAMY_STADIUM;
		switch (x) {
        case EDEN_GARDENS_STADIUM:
            System.out.println("This is the home ground of KKR");
            break;
        case WANKHEDE_STADIUM:
            System.out.println("This is the home ground of Mumbai Indians");
            break;
        case CHIDAMBARAM_STADIUM:
            System.out.println("This is the home ground of CSK");
            break;
        case M_CHINNASWAMY_STADIUM:
            System.out.println("This is the home ground of RCB");
            break;
        default:
            System.out.println("error");
        }
	}
	
	public static void main(String[] args) {
		
		IPL i = new IPL();
		i.homeTeamStadium(null);
	}
}

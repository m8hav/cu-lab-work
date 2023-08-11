package annotations.trainersCode.custom.fieldlevel;

public class ElectionCandidate {

	@CandidateName
	public String candidateName;
	
	private int candidateAge;
	
	
	public ElectionCandidate(String candidateName, int candidateAge) {
		System.out.println("Election Candidate");
		this.candidateName = candidateName;
		this.candidateAge = candidateAge;
	}
	
	
	

}

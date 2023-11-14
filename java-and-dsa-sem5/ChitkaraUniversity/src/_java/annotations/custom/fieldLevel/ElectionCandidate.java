package _java.annotations.custom.fieldLevel;

public class ElectionCandidate {
    @CandidateName
    public String candidateName;
    public int candidateAge;
    public ElectionCandidate(String candidateName, int candidateAge) {
        System.out.println("Election Candidate: ");
        this.candidateName = candidateName;
        this.candidateAge = candidateAge;
    }
}

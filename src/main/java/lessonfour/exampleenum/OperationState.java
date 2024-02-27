package lessonfour.exampleenum;

public enum OperationState {
    NEW("This is new operation"),
    TERMINATED("This is was caceled"),
    COMPLETED("This iswas complete");

    private String description;

    OperationState(String description) {
        this.description =description;

    }


}

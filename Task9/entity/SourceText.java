package by.epam_pre_training.task9.entity;

public class SourceText {
    private String sourceText;
    private String path;

    public SourceText() {}

    public SourceText(String sourceText, String path) {
        this.sourceText = sourceText;
        this.path = path;
    }


    public String getSourceText() {
        return sourceText;
    }


    public String getPath() {
        return path;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceText other = (SourceText) obj;
        return (sourceText.equals(other.sourceText) && path.equals(other.path));
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash += hash * 31 + sourceText.hashCode() + path.hashCode();
        return hash;
    }

    @Override
    public String toString() {
        return path;
    }
}

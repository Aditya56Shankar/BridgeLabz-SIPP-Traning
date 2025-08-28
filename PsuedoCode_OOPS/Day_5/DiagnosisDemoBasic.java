import java.util.*;

// ---- Strategy Interface ----
interface DiagnosisStrategy {
    List<String> diagnose(List<String> symptoms);
}

// ---- Concrete Strategies ----
class RuleBasedDiagnosis implements DiagnosisStrategy {
    public List<String> diagnose(List<String> symptoms) {
        List<String> result = new ArrayList<>();
        if (symptoms.contains("fever") && symptoms.contains("cough") && symptoms.contains("fatigue")) {
            result.add("Flu");
            result.add("COVID-19");
        } else if (symptoms.contains("sore throat") && symptoms.contains("cough")) {
            result.add("Common Cold");
        } else {
            result.add("No clear match");
        }
        return result;
    }
}

class AIBasedDiagnosis implements DiagnosisStrategy {
    public List<String> diagnose(List<String> symptoms) {
        List<String> result = new ArrayList<>();
        if (symptoms.contains("headache") && symptoms.contains("dizziness") && symptoms.contains("nausea")) {
            result.add("Migraine");
            result.add("Vertigo");
        } else {
            result.add("Needs more data");
        }
        return result;
    }
}

class ProbabilityBasedDiagnosis implements DiagnosisStrategy {
    public List<String> diagnose(List<String> symptoms) {
        List<String> result = new ArrayList<>();
        for (String s : symptoms) {
            if (s.equals("fever")) result.add("Infection (40%)");
            else if (s.equals("cough")) result.add("Respiratory Infection (30%)");
            else if (s.equals("fatigue")) result.add("Anemia (20%)");
        }
        if (result.isEmpty()) result.add("Unknown");
        return result;
    }
}

// ---- New Algorithm Example ----
class GeneticPatternDiagnosis implements DiagnosisStrategy {
    public List<String> diagnose(List<String> symptoms) {
        List<String> result = new ArrayList<>();
        result.add("Genetic Migraine Variant");
        result.add("Mitochondrial Disorder");
        return result;
    }
}

// ---- Context ----
class DiagnosisContext {
    private DiagnosisStrategy strategy;

    public void setStrategy(DiagnosisStrategy strategy) {
        this.strategy = strategy;
    }

    public List<String> diagnose(List<String> symptoms) {
        return strategy.diagnose(symptoms);
    }
}

// ---- Demo ----
public class DiagnosisDemoBasic {
    public static void main(String[] args) {
        DiagnosisContext ctx = new DiagnosisContext();

        // Scenario 1: General Medicine
        ctx.setStrategy(new RuleBasedDiagnosis());
        System.out.println("General Medicine Result: " + ctx.diagnose(Arrays.asList("fever", "cough", "fatigue")));

        // Scenario 2: Neurology
        ctx.setStrategy(new AIBasedDiagnosis());
        System.out.println("Neurology Result: " + ctx.diagnose(Arrays.asList("headache", "dizziness", "nausea")));

        // Scenario 3: Adding new algorithm
        ctx.setStrategy(new GeneticPatternDiagnosis());
        System.out.println("Genetic Test Result: " + ctx.diagnose(Arrays.asList("headache")));
    }
}

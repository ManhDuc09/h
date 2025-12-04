package familyhealth.model.dto;

import lombok.Data;

@Data
public class MedicalResultDTO {

    private String name; // e.g., "Blood Test", "X-Ray"
    private String note; // Doctor's notes
    private String diagnose; // Diagnosis
    private Long memberId; // Reference to the member (instead of appointment)
}

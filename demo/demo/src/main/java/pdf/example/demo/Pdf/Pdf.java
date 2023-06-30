package pdf.example.demo.Pdf;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Pdf {
    private String massage;

    public Pdf(ContextPdf info){
        this.massage = info.message();
    }
}

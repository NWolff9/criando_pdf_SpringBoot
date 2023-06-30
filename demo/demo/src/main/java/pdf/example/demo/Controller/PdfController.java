package pdf.example.demo.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdf.example.demo.Pdf.ContextPdf;
import pdf.example.demo.Pdf.CreatePdf;

@RestController
@RequestMapping("/pdf")
public class PdfController {
    @PostMapping
    public void createPdf(@RequestBody ContextPdf info){
        System.out.println(info.message());
        CreatePdf createPdf = new CreatePdf(info.message());
    }
}

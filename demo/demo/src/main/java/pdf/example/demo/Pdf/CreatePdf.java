package pdf.example.demo.Pdf;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreatePdf {
    public CreatePdf(String frase){
        Document document = new Document();

        try {
            PdfWriter.getInstance(document, new FileOutputStream("relatorio.pdf"));

            document.open();

            Paragraph paragrafoTeste = new Paragraph(frase);

            document.add(paragrafoTeste);

            document.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


}

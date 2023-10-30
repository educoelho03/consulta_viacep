import com.google.gson.GsonBuilder;
import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void salvaArquivoJson(Endereco endereco) throws IOException { // Corrigido para receber o objeto Endereco
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        FileWriter fileWriter = new FileWriter(endereco.cep() + ".json");
        fileWriter.write(gson.toJson(endereco));
        fileWriter.close();
    }
}



import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {

    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes){
        try {
            FileOutputStream fos = new FileOutputStream(nomeArquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(estudantes);
            oos.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        } catch (IOException e) {
            throw new RuntimeException("Nao foi possivel serializar");
        }
    }

    @SuppressWarnings("unchecked")
    public List<Estudante> desserializar() {
        List<Estudante> estudantes = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(nomeArquivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            estudantes = (List<Estudante>) ois.readObject();
            ois.close();
            return estudantes;

        } catch (Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }
        return estudantes;
    }
}

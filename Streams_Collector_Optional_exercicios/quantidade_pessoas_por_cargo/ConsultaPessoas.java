

import java.util.*;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas){

        TreeMap<String, TreeSet<Pessoa>> lista = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, () -> new TreeMap<>(Comparator.reverseOrder()), Collectors.toCollection(TreeSet<Pessoa>::new)));

        return lista;
    }

    public static Map<String, Long> obterContagemPessoasPorCargo(List<Pessoa> pessoas){

        Map<String, Long> lista = pessoas.stream()
                .collect(Collectors.groupingBy(Pessoa::getCargo, Collectors.counting()));
        return lista;
    }
}

package controller;

import java.io.*;
import biblio.cassio.model.Lista;
import model.Cadastro;

public class ModificacaoCadastroController {
	
	
	
	public ModificacaoCadastroController() {
		super();
	}
	
	private void novoArquivo(Lista<Cadastro> lista, String nomeArquivo) throws IOException {
		File cadastro = new File ("C:\\TEMP\\"+nomeArquivo+".csv");
		int cont = lista.size();
		StringBuffer sb = new StringBuffer();
		FileWriter writer = new FileWriter(cadastro);
		for (int i = 0; i < cont; i++) {
			try {
				sb.append(lista.get(i).getCpf());
				sb.append(";");
				sb.append(lista.get(i).getNome());
				sb.append(";");
				sb.append(lista.get(i).getIdade());
				sb.append(";");
				sb.append(lista.get(i).getLimiteCredito());
				sb.append("\n");
				writer.write(sb.toString());
				System.out.println(sb.toString());
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		writer.close();
	}
	
	public void novoCadastro(int idadeMin, int idadeMax, double limiteCredito) throws IOException {
		Lista<Cadastro> lista = new Lista<>();
		File cadastro = new File ("C:\\TEMP\\cadastro.csv");
		FileInputStream is = new FileInputStream(cadastro);
		InputStreamReader isreader = new InputStreamReader(is);
		BufferedReader bfreader = new BufferedReader(isreader);
		String linha = bfreader.readLine();
		while (linha != null) {
			String[] splitlinha = linha.split(";");
			Cadastro cadastro1 = new Cadastro();
			cadastro1.setCpf(splitlinha[0]);
			cadastro1.setNome(splitlinha[1]);
			cadastro1.setIdade(Integer.parseInt(splitlinha[2]));
			cadastro1.setLimiteCredito(Double.parseDouble(splitlinha[3]));
			if (cadastro1.getIdade() <= idadeMax && cadastro1.getIdade() >= idadeMin && cadastro1.getLimiteCredito() > limiteCredito) {
				lista.addLast(cadastro1);
			}
			linha = bfreader.readLine();
		}	
		String nomearquivo = "Idade"+idadeMin+"a"+idadeMax+"limite"+limiteCredito;
		novoArquivo(lista, nomearquivo);
		is.close();
		bfreader.close();
		isreader.close();
		
		
	}
		
}
	


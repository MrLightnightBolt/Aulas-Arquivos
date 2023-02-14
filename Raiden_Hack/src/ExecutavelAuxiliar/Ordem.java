package ExecutavelAuxiliar;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordem {
	
	SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date momento;
	private OrdemStatus status;
	
	private Cliente cliente;
	private List<OrdemItem> itens = new ArrayList<>();
	
	public Ordem () {
	}

	public Ordem(Date momento, OrdemStatus status, Cliente cliente) {
		super();
		this.momento = momento;
		this.status = status;
		this.cliente = cliente;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public OrdemStatus getStatus() {
		return status;
	}

	public void setStatus(OrdemStatus status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void adicionarItem (OrdemItem item) {
		itens.add(item);
	}
	
	public void removerItem (OrdemItem item) {
		itens.remove(item);
	}
	
	public double total() {
		double sum = 0.0;
		for (OrdemItem it : itens) {
			sum += it.subTotal();
		}
		return sum;
	}
	
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Order moment: ");
		sb.append(data.format(momento) + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(cliente + "\n");
		sb.append("Order items:\n");
		for (OrdemItem item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total price: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}
	
	
}

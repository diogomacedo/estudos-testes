package br.com.curso.matchers;

import java.util.Date;

import org.hamcrest.Description;
import org.hamcrest.TypeSafeMatcher;

import br.com.curso.utils.DateUtils;

public class AdicionarDiasMatcher extends TypeSafeMatcher<Date> {

	private int qtdeDias = 0;

	public AdicionarDiasMatcher(int qtdeDias) {
		this.qtdeDias = qtdeDias;
	}

	@Override
	public void describeTo(Description description) {
		System.out.println(" Xuxuuuuu ");
	}

	@Override
	protected boolean matchesSafely(Date data) {
		Date dataComDiferencaDias = DateUtils.obterDataComDiferencaDias(this.qtdeDias);
		boolean mesmaData = DateUtils.isMesmaData(data, dataComDiferencaDias);
		return mesmaData;
	}

}

/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package br.gov.pr.londrina.test.rest.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;

import br.gov.pr.londrina.test.rest.model.EnumTipoPet;
import br.gov.pr.londrina.test.rest.model.PessoaFisica;
import br.gov.pr.londrina.test.rest.model.Pet;

@ApplicationScoped
public class MemberRepository {

	private List<PessoaFisica> pessoas;

	@PostConstruct
	private void criaBancoEmMemoria() {
		pessoas = new ArrayList<>();
		pessoas.add(new PessoaFisica("Lucas Francisco Delgado Duarte", 696160943));
		pessoas.add(new PessoaFisica("André Luciano Nadal", 123456789));
		pessoas.add(new PessoaFisica("Adriana Cristina Nadal Duarte", 916237812));
		pessoas.add(new PessoaFisica("Camila Nadal de Souza", 2198312));
		pessoas.get(pessoas.size() - 1).getPets().add(new Pet("Zeus", EnumTipoPet.GATO, new Date()));
		pessoas.get(pessoas.size() - 1).getPets().add(new Pet("Dobby", EnumTipoPet.GATO, null));
		pessoas.get(pessoas.size() - 1).getPets().add(new Pet("Peppa", EnumTipoPet.CAVALO, null));
		pessoas.add(new PessoaFisica("Ricardo Schweitzer Junior", 102938));
		pessoas.get(pessoas.size() - 1).getPets().add(new Pet("Bella", EnumTipoPet.CAVALO, new Date()));
	}

	public List<PessoaFisica> obterTodasAsPessoas() {
		return pessoas;
	}

	public PessoaFisica findByCpf(Integer cpf) {
		for (PessoaFisica pf : pessoas) {
			if (pf.getCpf().equals(cpf)) {
				return pf;
			}
		}
		return null;
	}
	//
	// public Member findByEmail(String email) {
	// CriteriaBuilder cb = em.getCriteriaBuilder();
	// CriteriaQuery<Member> criteria = cb.createQuery(Member.class);
	// Root<Member> member = criteria.from(Member.class);
	// // Swap criteria statements if you would like to try out type-safe criteria
	// queries, a new
	// // feature in JPA 2.0
	// // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
	// criteria.select(member).where(cb.equal(member.get("email"), email));
	// return em.createQuery(criteria).getSingleResult();
	// }
	//
	// public List<Member> findAllOrderedByName() {
	// CriteriaBuilder cb = em.getCriteriaBuilder();
	// CriteriaQuery<Member> criteria = cb.createQuery(Member.class);
	// Root<Member> member = criteria.from(Member.class);
	// // Swap criteria statements if you would like to try out type-safe criteria
	// queries, a new
	// // feature in JPA 2.0
	// // criteria.select(member).orderBy(cb.asc(member.get(Member_.name)));
	// criteria.select(member).orderBy(cb.asc(member.get("name")));
	// return em.createQuery(criteria).getResultList();
	// }
}

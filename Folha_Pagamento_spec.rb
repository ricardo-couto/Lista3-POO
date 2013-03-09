require './Folha_Pagamento.rb'
require './Funcionario.rb'

describe 'Folha de Pagamento' do 

	it 'gera a folha de pagamento de uma empresa' do 
		funcionario = Funcionario.new('Ricardo', 1000, 0)
		gerente = Gerente.new('Ricardo', 2000, 4)
		diretor = Diretor.new('Ricardo', 1000, 1)
		folha = Folha_Pagamento.new(funcionario, gerente, diretor)
		folha.folha_pagamento.should == {'Ricardo' => 1180, 'Ricardo' => 3820, 'Ricardo' => 1940}
	end

	it 'calcula o total da folha de pagamento de uma empresa' do 
		funcionario = Funcionario.new('Ricardo', 1000, 0)
		gerente = Gerente.new('Ricardo', 2000, 4)
		diretor = Diretor.new('Ricardo', 1000, 1)
		folha = Folha_Pagamento.new(funcionario, gerente, diretor)
		folha.calcula_total.should == 6940
	end
end
require './Funcionario'

describe 'Funcionario' do 

	it 'calcula valor do salario de um Funcionario' do 
		Funcionario.new("Ricardo", 1000, 0).calcula_salario().should == 1180
		Funcionario.new("Ricardo", 1000, 1).calcula_salario().should == 1580
		Funcionario.new("Ricardo", 1000, 2).calcula_salario().should == 1980
		Funcionario.new("Ricardo", 1000, 3).calcula_salario().should == 2380
		Funcionario.new("Ricardo", 1000, 4).calcula_salario().should == 2380
	end

	it 'calcula valor do salario de um Gerente' do 
		Gerente.new("Ricardo", 1000, 1).calcula_salario().should == 1850
		Gerente.new("Ricardo", 2000, 4).calcula_salario().should == 3820
	end

	it 'calcula valor do salario de um Diretor' do 
		Diretor.new("Ricardo", 1000, 1).calcula_salario().should == 1940
		Diretor.new("Ricardo", 1000, 4).calcula_salario().should == 2740
	end

	it 'nao aceita valor negativo para o numero de filhos de um funcionario' do 
		expect { Funcionario.new("Ricardo", 1000, -1) }.to raise_error
		expect { Gerente.new("Ricardo", 1000, -1) }.to raise_error
		expect { Diretor.new("Ricardo", 1000, -1) }.to raise_error
	end
end
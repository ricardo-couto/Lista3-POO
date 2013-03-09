class Folha_Pagamento

	def initialize(*funcionarios)
		@funcionarios = funcionarios
	end

	def folha_pagamento
		folha = {}
		@funcionarios.each {|f| folha[f.nome] = f.calcula_salario } 
		folha
	end

	def calcula_total
		total = 0
		@funcionarios.each do |f|
			total += f.calcula_salario
		end
		total
	end
end
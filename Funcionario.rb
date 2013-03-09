class Funcionario

	def initialize(nome, salario, numero_filhos)
		@nome = nome
		@salario = salario
		validar_numero_filhos(numero_filhos)
		@numero_filhos = numero_filhos
	end

	attr_reader :salario, :nome

	VALOR_AUXILIO_CRECHE = 400
	VALOR_AUXILIO_ALIMENTAO = 280

	def beneficios
		auxilio_creche(@numero_filhos) + auxilio_alimentacao
	end

	def calcula_salario
		@salario - desconto_previdencia + beneficios
	end

	private

	def desconto_previdencia
		salario * 0.1
	end

	def auxilio_creche(numero_filhos)
		if (numero_filhos < 3)
			VALOR_AUXILIO_CRECHE * numero_filhos
		else
			VALOR_AUXILIO_CRECHE * 3
		end
	end

	def auxilio_alimentacao
		VALOR_AUXILIO_ALIMENTAO
	end

	def validar_numero_filhos(numero_filhos)
		raise if numero_filhos < 0
	end
end

class Gerente < Funcionario

	def adicional
		salario * 0.3
	end

	def desconto_previdencia
		(salario + adicional) * 0.1
	end

	def calcula_salario
		salario + adicional - desconto_previdencia + beneficios
	end
end

class Diretor < Funcionario

	def adicional
		salario * 0.4
	end

	def desconto_previdencia
		(salario + adicional) * 0.1
	end

	def calcula_salario
		salario + adicional - desconto_previdencia + beneficios
	end

end
Os testes foram feito utilizando postman.

POST:
http://localhost:8080/api/cadastro-form/ - Recebe um json com as informacoes e popula tabela de img e usuario
{    
	"nome":"NovoUsuario2114",
    "nascimento":"1998-11-11",
    "foto":"11101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110111011101110"
    
}



GET:
http://localhost:8080/api/cadastro-form/list - Retorna lista de todos usuarios [vo com informacoes de usuario e codigo da img]

http://localhost:8080/api/cadastro-form/1 - Ao passar o valor do id retorna o usuario [ex nesse caso usuario id 1]



DELETE:
http://localhost:8080/api/cadastro-form/1 - Deleta usuario 1 e registro de imagem ligada ao usuario 1.

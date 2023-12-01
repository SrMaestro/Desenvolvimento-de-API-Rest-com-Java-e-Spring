package com.ConfiguracaoDeAmbiente.ConsumindoApiDeNaruto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController: Anotação indicando que a classe é um controlador Spring MVC que trata solicitações HTTP e retorna respostas HTTP, geralmente no formato JSON.
@RestController
//@RequestMapping("/api/characters"): Mapeia as solicitações HTTP que começam com "/api/characters" para este controlador. Todas as solicitações para
@RequestMapping("/api/characters")
public class ApiConsumir {
    //Mapeia solicitações HTTP GET para o método getCharacterById, onde {id} é uma variável de caminho (Path Variable) que representa o ID do personagem.
    @GetMapping("/{id}")
    //Define o método getCharacterById, que recebe o ID do personagem como um parâmetro de caminho.
    public ResponseEntity<CharacterInfo> getCharacterById(@PathVariable long id) {
        // URL da API para obter informações sobre um personagem específico
        String apiUrl = "https://narutodb.xyz/api/character/" + id;

        // Fazer a chamada à API e obter a resposta
        ResponseEntity<CharacterInfo> response = new RestTemplate().getForEntity(apiUrl, CharacterInfo.class);

        // Verificar se a chamada foi bem-sucedida (código 2xx)
        if (response.getStatusCode().is2xxSuccessful()) {
            // Retornar as informações do personagem
            return ResponseEntity.ok(response.getBody());
        } else {
            // Retornar um status de erro caso a chamada falhe
            return ResponseEntity.status(response.getStatusCode()).build();
        }
    }


//ResponseEntity<CharacterInfo>
//ResponseEntity<CharacterInfo> é usado para representar a resposta HTTP retornada por um controlador Spring MVC. Vamos entender o significado de cada parte:

//@PathVariable long id
// em uma assinatura de método em um controlador Spring MVC é usado para extrair o valor de uma variável de caminho (path variable) da URL.

// ResponseEntity<CharacterInfo>
//new RestTemplate(): Cria uma instância de RestTemplate. O RestTemplate é uma classe no Spring que fornece métodos convenientes para interagir com APIs REST.

//.getForEntity(apiUrl, CharacterInfo.class)
//realiza uma chamada HTTP GET para a URL especificada (apiUrl). A resposta da API é convertida em uma entidade (ResponseEntity) onde o corpo da resposta é desserializado para um objeto do tipo CharacterInfo (usando a biblioteca Jackson ou outro mecanismo de desserialização configurado).

//ResponseEntity<CharacterInfo> response
//A resposta da chamada da API é armazenada em uma variável chamada response. Esta variável response contém informações sobre a resposta HTTP, como código de status, cabeçalhos e o corpo da resposta desserializado para um objeto do tipo CharacterInfo.


}

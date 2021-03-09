# Desafio de automação de testes Web, site: demo.cs-cart.com #

Este projeto destina-se a construção de testes automatizados onde foi utilizado o site que está nesse link :[Clique aqui para acessar o link](https://demo.cs-cart.com/) 
e foi baseado no seguinte cenário de teste :

* Comprar dois produtos com sucesso : 

   1) Primeiro produto : VideoGame Playstation3 o jogo é o F.E.A.R.3(PS3)MX . A quantidade a ser contabilizada no teste deve ser informada no arquivo valoresdosJogos.properties que está na camada src>main>resources.

   2) Segundo produto : VideoGame X-Box one o jogo é o Game party . A quantidade a ser contabilizada no teste deve ser informada no arquivo valoresdosJogos.properties que está na camada src>main>resources.


      As tecnologias utilizadas foram :
      * Linguagem de programação Java (versão 1.8.0_121)
      * Maven framework (versão 8)
      * Selenium (versão 3.141.59)
      * junit (versão 5.6.8)
      * Allure (versão 2.13.5)
      

Para geração dos relatórios será necessário instalar o interpretador de linha de comando Allure [Clique aqui para       acessar o link](https://www.swtestacademy.com/allure-report-junit5/)

e após deve ser digitada a seguinte instrução na linha de comando: **allure serve target/allure-results**

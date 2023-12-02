# Furta Cor
<p><b>Um aplicativo mobile do mesmo universo do jogo Monocromo</b></p>

<h3>Desenvolvedor</h3> 

Lucas Barreto Barbosa:
> GitHub [@LuquetaZ](https://github.com/LuquetaZ)

<h3>Equipe Ponto Final</h3> 

André Vitor Pimentel Pedroso:
> GitHub [@jacare68](https://github.com/jacare68)

Gabriel Trindade Dias:
> GitHub [@yGabrielT](https://github.com/yGabrielT) 

Iago Carvalho Santana:
> GitHub [@IagoICS](https://github.com/IagoICS)

Jefferson Bispo da Silva:
> GitHub [@JeffersonXS](https://github.com/JeffersonXS)

Ranier Dalton do Couto:
> GitHub [@RanierDC](https://github.com/RanierDC)

# Explicação do projeto

<p>O aplicativo mobile desenvolvido para Android desempenha um papel crucial na trama, simulando o aparelho celular do pai do protagonista. Com um design futurista e minimalista, esta ferramenta vai além de uma simples interação, sendo um pivô importante na história. Proporcionando uma experiência imersiva, mistura elementos de ficção científica com a funcionalidade de uma Wiki do jogo.

A visão é transformar o jogo mobile em mais do que uma experiência comum, buscando criar uma imersão única e interativa semelhante a um livro digital. Inspirados por títulos como "A Normal Lost Phone", almejamos uma interface original e diferenciada para o celular "futurístico". Esta não é apenas uma ferramenta de jogabilidade, mas uma extensão da narrativa, revelando mistérios e segredos.

Mais do que fornecer senhas e dicas para avançar no jogo, a interface serve como uma janela para o rico mundo de lore que construímos. Acreditamos que os jogadores não apenas interagem com um aplicativo, mas mergulham em uma história envolvente, tornando a experiência única e memorável.</p>

# SPLASH SCREEN

<p>A Splash Screen é a tela que sobrepõe o aplicativo enquanto ele carrega, e o que compõe esta tela é o logo da marca do celular e seu nome. Sendo os componentes dela uma ImageView (espaço definido pela ferramenta de programação para indicar que uma imagem será mostrada neste campo) e um TextView (serve para indicar um espaço onde o texto será exibido na tela do aplicativo) respectivamente.</p>

# MENU PRINCIPAL

<p>O menu principal apresenta um layout (disposição dos elementos visuais em uma página ou aplicativo) futurista e minimalista, oferecendo acesso rápido às funcionalidades essenciais do aplicativo.
  
Falando de forma mais técnica sobre a produção desta activity (componente do Android responsável por mostrar telas ao usuário e permitir a interação as telas através de toques e cliques). As barras superior e inferior foram produzidas no Krita, e importadas por meio de uma ImageView. 

Os restantes dos ícones foram cuidadosamente projetados também no Krita, eles são ImageButton’s (modo de exibição para criar um botão cujo conteúdo é uma imagem) indicam os diferentes aplicativos disponíveis e o símbolo do menu.

Ao clicar em algum botão para mudar de activity, realiza uma Intent Explicita, que é um definem explicitamente o componente que deve ser chamado pelo sistema, que neste caso seriam as activities criadas no projeto, e são normalmente usadas dentro do próprio aplicativo, uma vez que as classes são controladas pelo desenvolvedor.
</p>

# SNAP
<p>Ao clicar botão azul no menu, abre o aplicativo de conversa, intitulado "Snap", o usuário encontra uma série de conversas simuladas com diversos membros do grupo rebelde da história. Essas interações virtuais fornecem insights sobre a trama, detalhes dos personagens e dicas cruciais para a progressão na história.
  
Contém as mesmas barras que existem no menu principal, irão ocupar a maioria das activities junto do botão em forma triangular, ao clicar nela, volta para o menu novamente, por meio de uma Intent Explicita. O título desta activity é o nome do aplicativo e seu elemento é uma TextView. Já o que simularia a lista de contatos se trata de uma ScrollView (layout capaz de rolar seu conteúdo inserido nele) com elementos FrameLayout (gerenciador de layout mais simples do android) contendo ImageView e TextView’s.

Ao clicar em um destes FrameLayout, é direcionado a uma outra atividade onde terá acesso a uma conversa detalhada. Os elementos desta página são bem simples, sendo um ScrollView com TextView’s com diferentes cores backgrounds.
</p>

<h1 align="center">
  <a><img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/0ce249a8-0679-4abc-be64-b24f53f85f80"  height ="550"></a> <img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/52030f78-67e7-4a82-90b2-cfaeadfe5f5f"  height ="550"></a> <a><img src="https://github.com/LuquetaZ/SuperMarioWorldGuide/assets/101645521/f6c2038f-985f-4352-95c8-0dc1dc3fb987"  height ="550" </a>
     <br>
 </h1>


# E-MAIL

<p>O Email proporcionará uma visão profunda dos comunicados e correspondências do pai do protagonista. Com uma interface intuitiva, os usuários podem explorar diversas mensagens sobre compras, assuntos profissionais e até mesmo conversas com alguns membros do grupo revolucionário. A variedade de e-mails oferece uma narrativa rica, fornecendo insights sobre a vida do personagem antes do desaparecimento, adicionando camadas de complexidade à trama.
  
A forma em que este aplicativo foi construído se assemelha muito ao Snap, onde tem uma ImageView e um TextView que informam onde o usuário está, e logo abaixo tem um ScrollView com elementos FrameLayout contendo ImageView e TextView’s.
</p>

<h1 align="center">
  <a><img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/d0fba66d-4eb5-4bd6-b8ea-146828ac1738"  height ="550"></a> <img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/56c85d2e-36cc-4420-aef0-5ba2fd7bd295"  height ="550"></a> <a><img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/5f6f5001-e826-488a-ac29-6613b9e927e7"  height ="550" </a>
     <br>
 </h1>

# PASTA SEGURA

<p>Protegida por senha, a "Pasta Segura" são activities especiais e acessível apenas após inserir a senha correta. Dentro dela, o usuário descobre um bloco de notas alternativo, com uma paleta de cores diferente, revelando informações cruciais sobre o desaparecimento na vida do protagonista, Arthur.
  
Na tela para colocar a senha, os elementos são uma ImageView e um TextView no topo desta tela para instruir o jogador a inserir a senha. No corpo da página tem um PasscodeView (visualização personalizada com teclado e exibição de caracteres ou números para ser usada para autenticação) com um design simples com efeitos de tinta.

Caso o usuário insira a senha correta, ele levará a activity que mais importa deste projeto, tendo a mesma estrutura do Email, com a mudanças de uma paleta de cor mais acinzentada para uma com tonalidades mais escuras, dando um tom de mistério e suspense.
</p>

<h1 align="center">
  <a><img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/d0fba66d-4eb5-4bd6-b8ea-146828ac1738"  height ="550"></a> <img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/56c85d2e-36cc-4420-aef0-5ba2fd7bd295"  height ="550"></a> <a><img src="https://github.com/LuquetaZ/Furta-corApp/assets/101645521/5f6f5001-e826-488a-ac29-6613b9e927e7"  height ="550" </a>
     <br>
 </h1>

# GALERIA

<p>O aplicativo "Galeria" contém imagens da comunidade e de diferentes locais dentro da história. Essas imagens contribuem para a construção do mundo fictício do jogo, oferecendo ao jogador uma visão visual abrangente.
  
Na activity principal desta parte do projeto, tem poucos elementos compondo-a, sendo elas o título da tela um TextView, onde tem duas seções, cada uma delas contém outra TextView para informar o mês das imagens e cada uma das fotos são ImageButton’s, que nos levam para outra activity.

Nesta nova activity, contém uma barra superior onde tem uma ImageButton para voltar a atividade anterior. Como conteúdo, tem uma ImageView apenas para mostrar a imagem cujo fora clicada na tela anterior, além da data exata que a foto foi tirada.
</p>

# CALCULADORA

Esta parte do aplicativo simula uma calculadora convencional com uma interface amigável e funcionalidades padrão. Projetado para oferecer uma experiência de usuário simples e eficiente, este aplicativo permite realizar operações matemáticas básicas (adição, subtração, divisão, multiplicação, potenciação e equações de primeiro grau simples). Sua estética minimalista e design intuitivo tornam-no uma ferramenta prática, porém foi feito para ser um detalhe diferencial no projeto e fazer com que o usuário se sinta utilizando um aparelho celular como outro qualquer.

# BLOCO DE NOTAS

O bloco de notas é um espaço virtual onde o pai do protagonista registra anotações sobre acontecimentos importantes. Este recurso fornece pistas e informações adicionais que ajudam a desvendar mistérios ao longo da narrativa e ainda tem uma pisa sobre a senha da Pasta Segura.

A separação da tela principal do Bloco de Notas são FrameLayout’s, com prévias do texto inseridos em uma TextView em cada nota, dividos em duas fileiras, que estão inseridos em uma ScrollView.

Ao clicar em uma nota, leva para outra tela que terá uma barra verde superior sendo uma ImageView, e inserido nela terá um TextView com o título da nota e um ImageButton para voltar ao menu do Bloco de Notas. O texto inteiro da nota está em somente uma TextView.

# NAVEGADOR

O "Navegador" apresenta uma estética simples, com uma mensagem de mau funcionamento devido à ausência de conexão à rede. Esse detalhe contribui para a imersão na narrativa, indicando a desconexão do personagem com o mundo ao seu redor.

Os elementos desta página são três TextView’s e uma ImageView, sendo os textos sendo sobre a barra de pesquisa na parte superior, o texto alinhado com a imagem perto do centro da tela, mostrando uma mensagem de desconexão do usuário, e por último os tópicos instruindo o usuário.




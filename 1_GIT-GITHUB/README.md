### Curso de GIT/GitHub

**Notas importantes do curso:**  

git init........................Inicializa o diretório atual como um repositório do git (criando a pasta .git com os arquivos de configuração do repositório)

git config --list...............Lista as configuraçoes do git como email e username do usuário

git add arquivo1.txt............Passa os arquivos modificados pro estado staged

git restore arquivo1.txt........Restaura um arquivo modificado pro estado de antes de edição desde o último commit

git commit -m"mensagem".........Cria uma versão do código com todos os arquivos no estado staged

git status......................Mostra branch atual e arquivos para comitar

git log.........................Lista as alterações feitas no repositório

git diff........................ mostra as alterações nos arquivos mesmo antes de commitar

git reset...................... restaura commits feitos, tem três versões

  
  

estados dos arquivos no git: untracked - unmodified - modified - staged

  

merge.....Mescla as branches em uma só. Um novo commit é criado apenas para o fim de mesclar as branches

rebase....Pega todos os commits de uma determinada branch e põe no fim da fila da branch alvo, mesclando as branches sem respeitar a ordem cronológica

stash.....Faz uma 'colinha' das alterações feitas no commit atual e as limpa do código, deixando o commit como se não tivesse tido alterações, você pode restaurar as alterações depois usando 'git stash apply' e as alterações serão aplicadas novamente. Veja 'git stash list' e 'git stash clear'

revert.... Desfaz um commit em uma branch sem apagar ele do histórico, faz com que o código antigo da branch seja restaurado permitindo que você acesse o commit com problemas posteriormente para corrigir o que deu errado
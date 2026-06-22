myList=["Rock","Paper","Scissor"]
player1=input("Enter your choice : ").lower()
player2=input("Enter your choice : ").lower()
if(player1==player2) :
    print("Draw")
if((player1=='rock') and (player2=='scissor' )or(player1=='paper') and (player2=='rock' )or(player1=='scissor') and (player2=='paper' ) ):
    print('player1 You won!!!')
elif((player2=='rock') and (player1=='scissor' )or(player2=='paper') and (player1=='rock' )or(player2=='scissor') and (player1=='paper' ) ):
    print('player2 You won!!!')
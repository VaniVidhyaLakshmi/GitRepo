public class DecimalToBinaryExample2{
public static void toBinary(int decimal){
int binary[] = new int[40];
int index = 0;
while(decimal > 0){
binary[index++] = decimal%2;
decimal = decimal/2;
}
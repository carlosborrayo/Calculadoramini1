import java.util.Scanner;

public class Calculadoramini {

public static void main(String[] args )  {
Scanner entrada=new Scanner(System.in);
String historial[]= new String [6];
double dato0, dato1, total;
int numero, menu, borrar;
       
do {

System.out.println("---------");
System.out.println("Bienvenido al menu MENU");
System.out.println("*-----------------------------------*");        
System.out.println("#1: Suma---de---dos---nuemros");
System.out.println("#2: Resta--- de--- dos--- numeros");
System.out.println("#3: Multiplicacion--- de--- dos--- numeros");
System.out.println("#4: Division--- de-- dos--- numeros");
System.out.println("#5: Ver--- bitacora");
System.out.println("#6: Borrar--- bitacora");
System.out.println("#7: Salir");
System.out.println("*-----------------------------------*");
System.out.println("puede elegir una de las 7 opciones que le pide el menu");
menu=entrada.nextInt();

switch(menu){

case 1:
System.out.println("Usted a elegido la opcion 1. Suma de dos numeros ");
System.out.println("Puende ingrese el primer numero ");
dato0=entrada.nextDouble();
System.out.println("Puede ingrese el segundo numero ");
dato1=entrada.nextDouble();
total=dato0+dato1;
System.out.println("El total es " + total);
System.out.println("\n");
if(historial[0]==null){
historial[0]=(dato0 + " + " + dato1 + " = " + total);
}
else{
if(historial[1]==null){
historial[1]=(dato0 + " + " + dato1 + " = " + total);
}
else {
if(historial[2]==null){
historial[2]=(dato0 + " + " + dato1 + " = " + total);
}
else{
if(historial[3]==null){
historial[3]=(dato0 + " + " + dato1 + " = " + total);
}
else{
if(historial[4]==null){
historial[4]=(dato0 + " + " + dato1 + " = " + total);
}
else{
if(historial[5]==null){
historial[5]=(dato0 + " + " + dato1 + " = " + total);
}
}
}
}
}
}
break;


case 2:
System.out.println("Usted a elegido la opcion 2. Resta de dos numeros ");
System.out.println("Puede ingrese el primer numero ");
dato0=entrada.nextDouble();
System.out.println("Puede ingrese el segundo numero ");
dato1=entrada.nextDouble();
total=dato0-dato1;
System.out.println("El total es " +  total);
System.out.println("\n");
if(historial[0]==null){
historial[0]=(dato0 + " - " + dato1 + " = " + total);
}
else{
if(historial[1]==null){
historial[1]=(dato0 + " - " + dato1 + " = " + total);
}
else {
if(historial[2]==null){
historial[2]=(dato0 + " - " + dato1 + " = " + total);
}
else{
if(historial[3]==null){
historial[3]=(dato0 + " - " + dato1 + " = " + total);
}
else{
if(historial[4]==null){
historial[4]=(dato0 + " - " + dato1 + " = " + total);
}
else{
if(historial[5]==null){
historial[5]=(dato0 + " + " + dato1 + " = " + total);
}
}
}
}
}
}
break;


case 3:
System.out.println("Usted a elegido la opcion 3. Mutiplicacion de dos numeros ");
System.out.println("Puede ingrese el primer numero ");
dato0=entrada.nextDouble();
System.out.println("Puede ingrese el segundo numero ");
dato1=entrada.nextDouble();
total=dato0*dato1;
System.out.println("El total es " + total);
System.out.println("\n");
if(historial[0]==null){
historial[0]=(dato0 + " x " + dato1 + " = " + total);
}
else{
if(historial[1]==null){
historial[1]=(dato0 + " x " + dato1 + " = " + total);
}
else {
if(historial[2]==null){
historial[2]=(dato0 + " x " + dato1 + " = " + total);
}
else{
if(historial[3]==null){
historial[3]=(dato0 + " x " + dato1 + " = " + total);
}
else{
if(historial[4]==null){
historial[4]=(dato0 + " x " + dato1 + " = " + total);
}
else{
if(historial[5]==null){
historial[5]=(dato0 + " + " + dato1 + " = " + total);
}
}
}
}
}
}
break;


case 4:
System.out.println("Usted a elegido la opcion 4. Division de dos numeros ");
System.out.println("Puede ingrese el primer numero ");
dato0=entrada.nextDouble();
System.out.println("Puede ingrese el segundo numero ");
dato1=entrada.nextDouble();
if (dato1==0){
System.out.println("Error. Division entre cero ¡No es Permitida!");
System.out.println("\n");
if(historial[0]==null){
historial[0]=(dato0 + " / " + dato1 + " = " + "Error");
}
else{

if(historial[1]==null){
historial[1]=(dato0 + " / " + dato1 + " = " + "Error");
}
else {

if(historial[2]==null){
historial[2]=(dato0 + " / " + dato1 + " = " + "Error");
}
else{
if(historial[3]==null){
historial[3]=(dato0 + " / " + dato1 + " = " + "Error");
}
else{
if(historial[4]==null){
historial[4]=(dato0 + " / " + dato1 + " = " + "Error");
}
else{
if(historial[5]==null){
historial[5]=(dato0 + " + " + dato1 + " = " + "Error");
}
}
}
}
}
}
}
else {
total=dato0/dato1;
System.out.println("El total es " +  total);
System.out.println("\n");    
if(historial[0]==null){
historial[0]=(dato0 + " / " + dato1 + " = " + total);
}
else{
if(historial[1]==null){
historial[1]=(dato0 + " / " + dato1 + " = " + total);
}
else {
if(historial[2]==null){
historial[2]=(dato0 + " / " + dato1 + " = " + total);
}
else{
if(historial[3]==null){
historial[3]=(dato0 + " / " + dato1 + " = " + total);
}
else{
if(historial[4]==null){
historial[4]=(dato0 + " / " + dato1 + " = " + total);
}
else{
if(historial[5]==null){
historial[5]=(dato0 + " + " + dato1 + " = " + total);
}
}
}
}
}
}
}
break;


case 5:
System.out.println("Usted a elegido la opcion 5. Ver bitacora ");
for (numero=0;numero<=5;numero++){
if(historial[numero]==null){
System.out.println("");
}
else {
System.out.println(historial[numero]);
}
} 
System.out.println("\n");
break;


case 6:
System.out.println("Usted a elegido la opcion 6. Borrar bitacoral ");
System.out.println("Esta seguro de si su desicion");
System.out.println("#1: si#");
System.out.println("#2: no#");
System.out.println("Coloque el numero correspondiente");
borrar=entrada.nextInt();
if (borrar==1){
for (numero=0;numero<=5;numero++){
historial[numero]=null;
}
System.out.println("Espere un momento se esta eliminando su bitacora");
System.out.println("\n");
System.out.println("\n");
System.out.println("\n");
System.out.println("Bitacora---borrada ");
System.out.println("\n");
}
else{
System.out.println("Su bitacora no fue eliminada");
}
break;
default:
if(menu!=7){
System.out.println("Numero fuera de rango establecido");
}
}
}

while(menu!=7);

}
}
/*
Fundamentos de Java
Tercera Edición
Herbert Schildt
Actualizado para J2SE 5
www.mcgraw-hill-educacion.com

Translated from the third English edition of
JAVA A BEGINNER'S GUIDE
bBy: Herbert Schildt
McGrawHill

ISBN 970-10-59301

ISBN 0-07-223189-0
*/
// Empieza a Aprender

/*
javac.exe
compilador de Java.

java.exe
Intérprete Estándar de Java, Lanzador de Aplicaciones.
*/

//Primer Programa de Ejemplo

/*
Éste es un programa simple de Java.
Llame a este archivo Ejemplo.java
*/

class Ejemplo {
	//Un programa de Java empieza con una llamada a main(  )  .
	public static void main(String args[])
	{
		System.out.println("Hola Mundo!");
	}
}

/*
Usted seguirá estos 3 pasos:
1. Ingresar el programa
escribir xxxx.java
2. Compilar el programa
javac xxxx.java
3. Ejecutar el programa
java xxxx
*/

/// ESPECIFICADORES DE ACCESO
public // es posible acceder a dicho miembro mediante un código qe esté fuera de la clase en la qe se encuentre declarado
private // evita qe un miembro sea utilizado por un código definido fuera de su clase
//main( )  debe declararse como public porqe debe ser llamado por el código fuera de su clase cuando el programa se inicie.

static //permite qe main( ) sea llamado por el intérprete de Java antes de qe se cree un objeto de la clase
	//esto resulta necesario porqe main( ) es llamado por el intérprete de Java antes qe se haga cualqier objeto

void //indica al compilador qe main( ) no regresa un valor
	//los métodos también pueden regresar valores
	
// PARÁMETROS
//si no reqiere ingresar parámetros de cualqier modo necesita incluir los paréntesis vacíos
//en main( ) solo hay un parámetro
String args[] //el cual declara un parámetro args de tipo String. Se trata de una amtriz de objetos del tipo String
	//las matrices son colecciones de objetos similares
	//args recibe cualqier argumento de línea de comandos qe esté presente al momento de ejecutar el programa
	//Hola Mundo no usa args, sin embargo otros programas sí la utilizarán

System.out.print("Escribe en línea y deja el puntero cursor a continuación");
System.out.println("Escibe en linea y baja el puntero cursor al inicio de la línea de abajo");

int var1;
//tipo nombre_var;

System.out.println("var1 contiene " + var1);	//con el uso de + puede unir en una cadena todos los elementos qe desee dentro de una sola instrucción println( ) o print( ).

+	Suma
-	Resta
*	Multiplicación
/	División

double x;	//precisión doble
float y;	//precisión sencilla

System.out.println( );	//imprime una línea en blanco

// IF
if (condicion) instruccion;

if(10 < 11) System.out.println("10 es menor qe 11");

if(10 < 9) System.out.println("esto no se muestra");

<	menor qe
<=	menor o igual qe
>	mayor qe
>=	mayor o igual qe
==	igual qe
!=	no igual qe

for (inicialización; condicion; iteracion) instruccion;
//incialización: asigna un valor incial a una variable de control de bucle
//condición: expresión boleana qe prueba la variable de control de bucle
	//si el resultado es true el bucle for sigue repitiendose
	//si es falsa, el bucle se termina
//la expresión iteración determina la manera en la qe la variable de control de bucle cambia cada vez qe el bucle se repite

//ID:  _sun_wj_2751_se6

// JAVA technology
// include tools: compiler, interpreter, documentatio generator (javadoc), class file packing tool
// can run on 2 deployment enviroments:		JRE supplied by Java 2 SDK, 		most web browsers implement java interpreter & JRE
// Java technology uses its:	JVM, Garbage Collection, JRE, JVM Tool Interface
// Eliminates pointer arithmetic & memory managment
// Reduces the compile-link-load-test cycle
// can be run on multiple OSs with JVM
// programs can run multiple threads

/// JVM
// code for JVM is stored in .class files with at most 1 public class
// include implementation of Instruction set, register set, class file format,
// and definitions of: runtime stack, garbage collection heap, memory area, fatal error reporting mechanism, high precision timing support
// [Java App source code] -> [Compiler] -> [Bytecodes](compact & efficient)  -> [JVM]

/// Garbage Collection
// happens automatically during program
// check for and frees any memory that can be freed

// JVM has:
// Class loader: LOAD
// add all classes needed for the program, then determines the memory layout
// add security separating classes from local file from those imported from network sources
// Bytecode verifier: VERIFY
// checks for illegal code, violations of rules, etc.
// Runtime Interpreter: EXECUTE

// Sample "Hello World" application
public class TestGreeting {	// file with the name exactly the same as public class
	public static void main (String[] args) {	// main must be static or it won't be found
		Greeting hello = new Greeting();
		hello.greet();
		}
}

public class Greeting {
	public void greet() {
		System.out.println("hi");
		}
}

///	javac		java		javadoc
// to compile:	javac filename.class
// to run:	java filename

// Software Development
// Requerimient Capture	Analysis	Design	Development	Test		Implementation

// Abstraction : hide private implementation details behind public interfaces
// Encapsulation: hiding certain elements providing public interfaces
// Inheritance: permits a class to extend one other class only
// Polymorphism: a variabel can refer to objects of different forms

// Class: a way to define new types of objects, a blueprint, a model of the object you're describing
// Object: an instance of class with new
// Attribute: a data element of an object, also known as data member, instance variable, data field
// Method: functional element of an object, aka function or procedure
// Constructor: a method-like construct used to initialize or build a new object. it has the same name as the corresponding class
// Package: grouping of classes, subpackages or both

/// Declaring classes
<modifier>* class <class_name> {
	<attribute_declaration>*
	<constructor_declaration>*
	<method_declaration>*
}
public class Vehicle {
	private double maxLoad;
	public void setMaxLoad(double value)
	{
		maxLoad = value;
	}
}

/// Declaring Attributes
<modifier>* <type> <name> [ = <initial_value>];
public class Foo {
	private int x;
	private float y = 10000.0F;
	private String name = "Bates Model";
}

/// Declaring Methods
<modifier>* <return_type> <name> (<argument>*) {
	<statement>*
}
public class Dog {
	private int weight;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int newWeight)
		{
		if (newWeight > 0)
			{
			weight = newWeight;
			}
		}
}
// accesing object members	not-private
public class TestDog {
	public static void main (String[] args)
	{
		Dog d = new Dog();
		System.out.println("Dog d's weight is "+d.getWeight());	// returning 0
		d.setWeight(42);
		System.out.println("Dog d's weight is "+d.getWeight());	// returning 42
		d.setWeight(-42);
		System.out.println("Dog d's weight is "+d.getWeight());	// return 42 'cause no change
	}
}
// hide attributes as private, supply setters and getters	getXyz( ) setXyz( )

/// Declaring Constructors
[<modifier>] <class_name> (<argument>*) {
	<statement>*
}
public class Dog {
	private int weight;
	public Dog()	// constructors aren't methods, they dont have return values & are not inherited
	{
		weight = 42;
	}
}
// Default Constructor : has no args and empty body

/// Source File Layout
[<package_declaration>]
<import_declaration>*
<class_declaration>+

/// Package Statement
package <top_package_name>[.<sub_package_name>]*;
package shipping.domain;

/// Import Statement
import <package_name>[.<sub_package_name>].<class_name>;
|| OR ||
import <package_name>[.<sub_package_name>].*;

//You can separate the source files from the compiling .class files
// Compiling: reroute to another directory the .class file using -d option of javac command
// Work in the directory 1 level above the beginning of hte package to compile files within packages

/// Deploying an Application	Creating .jar file
// Create a temporary file that indicates the class name that contains your main method
// Build the JAR file as normal except that you add an additional option to copy the contents of this temporary file into the METAINF/MANIFEST.MF file
Main-Class: mypackage.MyClass	//temporary file
jar cmf tempfile MyProgram.jar	// cmd
java -jar /path/to/file/MyProgram.jar	// cmd

/// Java Technology API Documentation
http://java.sun.com/j2se/1.5.0/docs/api/

//COMMENTS
// tipo de comment 1: one line
/* tipo de comment 2: one or more lines*/
/** tipo de comment 3: Documentation comments*/

//use of SEMICOLON
total = a + b + c 
	  + d + e + f;	//to end a sentence

//use of BLOCKS
{
	x = y +1;
	y = x +1;
}	//begin and end with braces
public class MyDate{
	private int day;
	private int month;
	private int year;
}	//also used to begin and end classes

//use of IDENTIFIERS
//Identifiers are names given to variables, classes or methods
/* rules:
	can start with:
		Unicode letter
		_ underscore
		$ dollar sign
	CAN'T start with a digit
	case-sensitive
	can't be keyword but can contain one
	can use non-ASCII chars
	a class identifier should only be ASCII chars cause file systems that don't support Unicode
*/

/// use of KEYWORDS
//identify a data type name or program construct name
// true, false, null are LOWERCASE literals
// there's no SIZEOF
//GOTO and CONST keywords no se usan en Java por el inacceso a memoria
abstract assert boolean break byte case catch char class const
continue default do double else enum extends final finally float
for goto if implements import instanceof int interface long native
new package private protected public return short static strictfp super
switch synchronized this throw throws transient try void volatile while

//8 Primitive Data Types
//4 categories: logical, textual, integral, floating point
boolean		char	byte short int long		float double

//logical data type
boolean truth = true;	//it has two different values {true, false}

//textual data type
char a='a', b='\t' /* a tab */, c='\u03A6' /*qe es igual a letra griega phi */
	//it represents single a 16-bit unsigned Unicode character
	//it must be enclosed in single quotes ' '
//class data type String
//it represents sequences of characters
//it must be enclosed in double quotes " "
String greeting = "Hola\nMudo";

/// integral data type
//the literal of integral type are represented by using the DECIMAL, OCTAL or HEXADECIMAL forms
//all numeric types are signed numbers
int x,y;
2		//decimal literal (alone) default
007		//octal literal 0####
0xBAAC	//hexadecimal literal 0x####
2L
007L	//an L at the end means its not int, its long
0xBAACL
8 bits		byte	from -2^7 to (2^7)-1
16 bits		short	from -2^15 to (2^15)-1
32 bits		int		from -2^31 to (2^31)-1
64 bits		long	from -2^63 to (2^63)-1

//floating point data tye
//double by default, to declare a float literal:
float z=3.414F;
double w=3.1415;
3.14F
6.02E23F
123.4E+306F
3.14	//double literal
6.02E23	//large floating point value	E means ^
2.718F	//a simple float size value	F means FLOAT
123.4E+306D	//a large double with redundant D	D means DOUBLE
32 bits		float
64 bits		double

//Constructing Objects: NEW
//when you use NEW, things happen:
//	Memory is allocated for the object and initialized to the form of 0 or null
//	Explicit attribute initialization is performed
//	A constructor is executed
//	The object reference is returned by the new operator
new MyDate(22, 7, 1964)
MyDate my_birth;	//the declaration allocate storage only for the reference
MyDate my_birth = new MyDate(22,7,1964);	//new implies allocation and initialization for the storage	allocate (asigna) space for the parameters/attributes	MyDate and params have space
											//using the parameters implies explicit attribute initialization	month, day,year have the values of their class
											//it calls the constructor that enables you to:	month,day,year have the values assigned
												//you can override(invalida) the default initialization
												//you can perform computation (hace los cálculos)
												//you can pass arguments into the construction process so the object controls the object it created
											//return object reference	my_birth has a value
int x=7;
int y=x;	//they're independent
MyDate s = new MyDate(22,7,1964);
MyDate t = s;	//only MyDate(22,7,1964) exists, s & t are references to it
t = new MyDate(31,12,2000);	//you created a new object and t refers to it, s has it 22,7,1964 object and t has it 31,12,2000

//the ability to change the things passed into a method only applies to objects, not primitive values
//the actual value associated with a variable of object type is the reference to the object, and not the object itself
public class PassTest {   
// Methods to change the current values
    public static void changeInt(int value) {
        value = 55;	//it doesnt change
    }
    public static void changeObjectRef(MyDate ref) {
        ref = new MyDate(1, 1, 2000);	//it does nothing
    }
    public static void changeObjectAttr(MyDate ref) {
        ref.setDay(4);	//it changes the day
    }
    
    public static void main(String args[]) {
        MyDate date;
        int val;
        
// Assign the int
        val = 11;
// Try to change it
        changeInt(val);
// What is the current value?
        System.out.println("Int value is: " + val);	//11
        
// Assign the date
        date = new MyDate(22, 7, 1964);
// Try to change it
        changeObjectRef(date);
// What is the current value?
        System.out.println("MyDate: " + date);	//22-7-1964
        
// Now change the day attribute
// through the object reference
        changeObjectAttr(date);
// What is the current value?
        System.out.println("MyDate: " + date);	//4-7-1964
    }
}

//the THIS reference
//2 porpuses;
	//resolving ambiguity between instance variable and parameters
	//passing the current object as a parameter to another method
public class MyDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    
    public MyDate(int day, int month, int year) {
        this.day = day;		//this refers to variable inside the method, the variables of the class, not the parameter
        this.month = month;
        this.year = year;
    }
    public MyDate(MyDate date) {
        this.day = date.day;	//this refers to variables of the class and date refers to an object in the params
        this.month = date.month;
        this.year = date.year;
    }
    
    public MyDate addDays(int moreDays) {
        MyDate newDate = new MyDate(this);	//it passes this as a param to  another method to refer to the current object
        newDate.day = newDate.day + moreDays;
// Not Yet Implemented: wrap around code...
        return newDate;
    }
    public String toString() {
        return "" + day + "-" + month + "-" + year;
    }
}

//coding conventions
//PACKAGE	noun, lowercase	shipping.objects
//CLASS		noun, initial capitalized		class AccountBank
//INTERFACES	noun, initial capitalized		interface Account
//METHOD		verb, lowercase, inside initial capitalized	balanceAccount()
//VARIABLE	lowercase, insed initial capitalized		currentCustomer	avoid _, superavoid $
//CONSTANT	uppercase, underscore		HEAD_COUNT, MAXIMUM_SIZE

//BRACES	use them on control structures, even with only 1 sentence
//use 1 statement per line
if (condition) {
	statement1;
} else {
	statement2;
}

//repasar THIS
//THIS se refiere a la variable oculta, del qe llama, del objeto, el parámetro
//sin THIS se refiere a si es el mismo nombre, la variable de la clase, de la qe fue llamada, la qe resalta por default

//los métodos de 1 clase pueden referirse de modo global al objeto de esa clase al qe se aplican por medio de la referencia THIS
//es posible declarar una variable dentro de un bloqe con el mismo nombre qe una variable miembro, pero no con el nombre de otra variable local qe ya existiera
//la variable declarada dentro del bloqe oculta a la variable miembro en ese bloqe.
//para acceder a la variable miembro oculta será preciso utilizar el operador THIS, en la forma this.variable

//Declaring Variables
//Primite Type & Reference Type
//inside a method or outside a method but inside a class definition

//Local Variables : inside a method	automatic, temporary or stack variables
public class ScopeExample {
    private int i=1;
    
    public void firstMethod() {
        int i=4, j=5;
        this.i = i + j;	//¿cuál valor es this.i? 4 ó 1
        secondMethod(7);
    }
    public void secondMethod(int i) {
        int j=8;
        this.i = i + j;	//¿cuál valor es this.i? 7 ó 1
    }
}
public class TestScoping {
    public static void main(String[] args) {
        ScopeExample scope = new ScopeExample();
        scope.firstMethod();
    }
}
//Method Parameter Variables
// + They define arguments passed in a method call
// + They create a new variable for each method call and exists until the method ends
// + They are initialized by the calling method and are also local variables

//Variables outside a method : created when the object is constructed using new ___( ) call
// 2 types: class variables & instance variables
// Class Variables
//declared using STATIC keyword, created when the class is loaded and exists as long as the class is loaded
// Instance Variables
// declared without STATIC keyword, exists as long as the object exists, referred to as member variables, 'cause they'r member of objects created from the class

//Variable Initialization
//the THIS and parameters are initialize on the method execution starts
//these are the default values if not specified
byte i=0;
short i=0;
int i=0;
long i=0L;
float i=0.0F;
double i=0.0D;
char i='\u0000';
boolean i=false;
/*all reference types*/ i=null;	//u cant use a  null variable that doesnt refer to a object

/// OPERATORS
//Precedency
++ -- + - ~ ! (<data_type>)
* / %
+ -
<< >> >>>
< > <= >= instanceof	//instaceof is exclusive of Java
== !=
&
^
|
&&
||
<boolean_expr> ? <expr1> :<expr2>
= *= /= %= += -= <<= >>= >>>= &= ^= |=

(i=0) != (i=false);		(j=1)	!=	(j=true);
! = NOT		& = AND		^ = XOR		| = OR		&& = &		|| = |	//operators
~ = NOT		& = AND		^ = XOR		| = OR		//bitwise operations
128>>1=64;	// +10 000 000 >> +1 000 000 =+64	RIGHT SHIFT /2 /2 /2 /2 n veces
256>>4=16;	// +100 000 000 >> +10 000 000 >> +1 000 000 >> +100 000 >> +10 000 =+16
-256>>4=-16; 
16<<2=64	// +10 000 << 100 000 << +1 000 000 = +64	LEFT SHIFT *2 *2 *2 n veces
14>>>2=3;	// +1 110 = 01 110 >>> 00 111 >>> 00 011=+3	//RIGHT SHIFT UNSIGNED
1010... >> 2 return 11 1010
1010... >>> 2 return 00 1010

// Operator +	concatenation with +
Integer noofapples = new Integer("10");
String noofapplesstr = noofapples.toString();
String display = "There are "+noofapples+" apples in the basket";
String display = "There are "+noofapplesstr+" apples in the basket";

//Casting
from int to long automatic;
from long to int :
long bigValue = 99L;
int squashed = (int) bigValue;	// OK casting
int squashed = 99L;	//Wrooooong
int squashed = (int) 99L;
//Promoting	with no loss of information, automatic
long dival=6;	//OK
int smallval=99L;	//Wrooooong
double z=12.414F;	// OK
float zl=12.414;	//Wrooooong
//the result type is determined as the largest type of either operand, or int
short a,b,c;
a=1; b=1;
c=a+b;	//Wrong, it becomes int and then short automaticly
c=(short) a+b;	// OK, it casts from int to short

// Branching Statements

// IF two-way branching
if ( <boolean_expression> )	//boolean, not numeric value, check if (x) and if (x!=0)
	<statement_or_block>

if (x<10)
	System.out.println("Are you finished yet?");
// ELSE
if ( <boolean_expression> )
	<statement_or_block>
	else
		<statement_or_block>
if (x<10)
	System.out.println("Are you finished yet?");
else
	System.out.println("Keep Working...");

if ( <boolean_expression> )
	<statement_or_block>
	else if (boolean_expression)
		<statement_or_block>
int count = getCount();	//a method defined in the class
if (count<0)
	{
	System.out.println("Error: count value is negative");
	}
	else if (count>getMaxCount())
		{
		System.out.println("Eror: count value is too big");
		}
		else 
			{
			System.out.println("There will be "+count+" people for lunch today");
			}
// SWITCH multiple-way branching
switch (expression)	//expression is int, promotion occurs with byte, short or char types. NO float, long, object reference (String)
	{				//an enumerated type can be used in expression
	case <constant1>:
		<statement_or_block>*
		[break;]
	case <constant2>:
		<statement_or_block>*
		[break;]
	default:	//when expression doesnt match any case
		<statement_or_block>*
	[break;]	//instead of break you can use return, without break code continues without comparing (example: finishing case 1 goes to case 2
	}

switch (carModel)
	{
	case DELUXE:
		addAirConditioning();
		addRadio();
		addWheels();
		addEngine();
		break;
	case STANDARD:
		addRadio();
		addWheels();
		addEngine();
		break;
	default:
		addWheels();
		addEngine();
	}

switch (carModel)
	{
	case DELUXE:
		addAirConditioning();
	case STANDARD:
		addRadio();
	default:
		addWheels();
		addEngine();
	}

// looping statements: FOR, WHILE, DO
// FOR & WHILE test the loop condition before execution	DO test the loop condition after execution
// FOR
for ( <initial_expr>; <test_expr>; <alter_expr> )	//( so it begins; compare while to stay; every time it happens)
	<statement or block>							// it happens a determinated number of times

for (int i=0; i<10; i++)
	System.out.println(i+" squared is "+(i*i));
//it is possible and legal
for (i=0, j=0; j<10; i++, j++)
	{}
// WHILE
while ( <test_expression> )
	<statement_or_block>

int i=0;
while (i<10)	//prevent infinite loops
	{
	System.out.println(i+" squared is "+(i*i));
	i++;
	}
// DO - WHILE
do
	<statement_or_block>
while ( <test_expression> );

int i=0;
do	{	// prevent infinite loops	num of times isn't determinated beforehand
	System.out.println(i+" squared is "+(i*i));
	i++;
	}
while (i<10);	//at the end it asks if it can stay

// BREAK statement
// to prematurely exit from switch, loops and labeled blocks
break [ <label> ];

<label>: <statement>

outer:
do	{
	statement1;
		do	{
			statement2;
			if (condition)
				break outer;
			statement3;
			}
		while (test_expr);
	statement4;
	}
while(test_expr);

do	{
	statement;
	if (condition)
		break;
	statement;
	}
while (test_expr);

// CONTINUE	to jump to the end of a loop and return control to loop: for, while, do-while
continue <label>;

do	{
	statement;
	if (condition)
		continue;
	statement;
	}
while (test_expr);

test:
do	{
	statement1;
	do	{
		statement2;
		if (condition)
			continue test;	//rebegin the first do, the one with statement1 and statement4
		statement3;
		}
	while (test_expr);
	statement4;
	}
while (test_expr);

// Creating ARRAYS
// Arrays: used to group objects of the same type using a common name
// in Java arrays are always objects, even when they're made up of primitive types
// declaration of an array creates a reference that u use to refer to it
// Declaring Arrays
char[] s;
point[] p;
char s[];
point p[];
//Creating Arrays of primitive type
s = new char[26];	// initialized to \u0000
//after creation, the array elements are initialized to the default value
public char[] createArray() {
	char[] s;
	s = new char[26];	//to call s[-1] or s[30] causes a runtime exception
	for (int i=0;i<26;i++)
		{
		s[i] = (char)('A'+1);
		}
}
// Creating Reference Arrays
p = new Point[10];	//initialized to null
// above it does not create 10 Point objects, under it creates these points separetely
public Point[] createArray() {
	Point[] p;
	p = new Point[10];
	for (int i=0;i<10;i++)
		{
		p[i] = new Point(i,i+1);
		}
}
// Initializing Arrays
// after the assigment p[0] 0 new Point( )  the first element of the array refers to a real Point object
// creates an array with initial values
String names[] =
	{
	"Georgina",
	"Jen",
	"Simon"
	}
// an eqivalent in another code
String[] names;
names = new String[3];
names[0] = "Georgina";
names[1] = "Jen";
names[2] = "Simon";
// this shorthands can be created for any element type
MyDate[] dates = 
	{
	new MyDate(22,7,1964);
	new MyDate(1,1,2000);
	new MyDate(22,12,1964);
	}

// Multidimensional Arrays
// tedious way, unique for non-rectangular arrays
int[][] twoDim = new int[4][];
twoDim[0] = new int[5];
twoDim[1] = new int[5];
twoDim[2] = new int[6];
twoDim[3] = new int[8];
// its a shorthand of declaring rectangular arrays;
int[][] twoDim = new int[4][5];	// an array of 4 arrays of 5 integers
// square brackets at the left or at the right of the variable name, the identifier: twoDim, names, p, etc.
new int[][4] // its illegal

// length attribute
public void printElements (int[] list)
	{
	for (int i=0; i<list.length; i++)	// it says the number of objects in the array, so consistency
		{
		System.out.println(list[i]);
		}
	}

// enhanced for loop :  added is J2SE ver. 5.0
public void printElements (int[] list)	// this example is the same as the code above
{
	for (int element: list)
	{
		System.out.println(element);
	}
}

// resizing arrays : you can't resize an array once CREATED
// what you can do is to use the same reference variable to refer to a new array
int[] myArray = new int[6];	//once created, it cant be resized
myArray = new int[10];	//it's a new one	the first array is lost unless another reference to it is retained elsewhere

//copying arrays : arraycopy
// a method in System class
// it copies references, not objects, when dealing with arrays of objects. The objects themselves do not change
int[] myArray = {1,2,3,4,5,6};
int[] hold = {10,9,8,7,6,5,4,3,2,1};
System.arraycopy(myArray,0,hold,0,myArray.length);
//copy all of the myArray array to the hold array, starting with the 0th index
// the result is
int[] hold = {1,2,3,4,5,6,4,3,2,1};

// Class Modeling
public class Employee
{
	public String name = "";
	public double salary;
	public Date birthDate;
	
	public String getDetails()
		{
		// All Code
		}
}
// Subclassing : the proces of creating a new class from an existing class
public class Manager extends Employee	// makes Manager a subclass of Employee which inherits its attributes and methods
{
	public String department;
}
// Single Inheritance :  restrict a class to extend from only one other class
extends //using extends is the use of single inheritance
// a superclass can have many subclasses, but a subclass can have only 1 superclass of its own
public class Director extends Manager	// Director inherites all members from Manager and Employee, because Manager inherites from Employee
{
	public double CarAllowance;
	public void increaseAllowance(){}
}

// Access Control	for Variables and Methods
// Classes can be public or default
//			Same Class		Same Package	Subclass	Universe
public		Yes			Yes			Yes		Yes		// Accessible Universally
protected	Yes			Yes			Yes				//Should be used when it's appropiate for a class's subclass, but not unrelated classes
default 	Yes			Yes							// if it doesn't have any access modifier in its declaration	often called package-friendly || package-private
private		Yes										// accessible only to methods inside the class
// protected access is provided to subclasses that reside in a different package from the class that owns  the protected feature

// Overriding Methods	Métodos Primordiales	Invalidando Métodos***
// a child class inherits all methods from its parent class, if you want to override a method:
// the name, return type, and argument list  and its order match exactly those in the method of the parent class, the new method override the existing one
// also the overriding method can't be less accessible than the method it overrides
public class Employee {
    protected String name;
    protected double salary;
    protected Date birthDate;

    public String getDetails() {	// String getDetails( ) 
        return "Name: " + name + "\n"
                + "Salary: " + salary;
    }
}

public class Manager extends Employee {
    protected String department;
    public String getDetails() {	// String getDetails( )
        return "Name: " + name + "\n"
                + "Salary: " + salary + "\n"
                + "Manager of: " + department;
    }
}
// since J2SE ver. 5.0 the return type of the overriding method can now be a subclass of the inherited method
public class Parent {
    public void doSomething() {}	// PUBLIC
}
public class Child extends Parent {
    private void doSomething() {} // illegal PRIVATE
}
public class UseBoth {
    public void doOtherThing() {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        p1.doSomething();
        p2.doSomething();	//it does the child ver. because of the PRIVATE, not because of overriding	language semantic violated
    }
}
// Invoking overriden methods
// a subclass can invoke a superclass method using the super keyword
// super keyword refers to the superclass of the class in which the keyword is used
// used to refer to the member variables or superclass methods
// you can use super to call methods even further up in the hierarchy
public class Employee {
    private String name;
    private double salary;
    private Date birthDate;
    public String getDetails() {
        return "Name: " + name + "\nSalary: " + salary;
    }
}
public class Manager extends Employee {
    private String department;
    public String getDetails() {
// call parent method
        return super.getDetails()	// SUPER
        + "\nDepartment: " + department;
    }
}

// POLYMORPHISM
// objects have one form, variables are polymorphic because they can refer to objects of different forms
Employee e = new Manager();	// legal	referring to an object with a variable that is one of the parent class type
// Employee is the datatype, Manager is for calling the constructor and properties
// Reason to do this:
// an object has only 1 form that is given when constructed. However, a variable is polymorphic because it can refer to the objects of different forms
// qizá para aprovechar las propiedades desde el parent class qe se van perdiendo en los child classes, y por cualqier peqeñez solamente se regresa al child class
// you can access only the parts of the object that are part of Employee, the Manager specific parts are hidden

// illegal attempt to assign Manager attribute
e.department = "Sales";
//  the variable is declared as an Employee type, even though the Manager object hast that attribute
// Illegal example of assigning a Manager attribute to Employee

// Virtual Method Invocation
// Compile-time type and Runtime type invocations with characteristics:
// The method must be a member of  the declared type	getDetails from Employee
// The method implementation used is based on the runtime object's type	getDetails from Manager
Employee e = new Manager();
e.getDetails();	//at RUNTIME means its behavoir is taken from Manager class
/* in C++ you get this polymorphic behavior only if you mark the method as virtual in the source */

// Homogeneous and Heterogeneous Collections
// Homogeneous Collections: of objects with the same class type
MyDate[] dates = new MyDate[2];
dates[0] = new MyDate(22,12,1964);
dates[1] = new MyDate(22,7,1964);
// Heterogeneous Collections: of objects with different class type
// Java has an Object class, so you can make the collections of all kinds of elements because all classes extends the class Object
Employee staff = new Employee[1024];
staff[0] = new Manager();
staff[1] = new Employee();
staff[2] = new Engineer();
// Every class is a subclass of Object, so you can make an array of Object
// the only items that can't be added to an array of Object are primitive variables
// you can create objects from primitive data using wrapper classes

public class TaxService
{
	public TaxRate findTaxRate(Employee e)	// it uses elements that exists in Employee
	{
		// do calculations and return a tax rate for e
	}
	// Menawhile, elsewhere in the application class
	TaxService taxSvc = new TaxService();
	Manager m = new Manager();
	TaxRate t = taxSvc.findTaxRate(m);	// legal	Manager is a Employee
}

// the instanceof operator
instanceof //is used to test an object when you pass objects using references to their parents classes
public class Employee extends Object;
public class Manager extends Employee;
public class Engineer extends Employee;

public void doSomething (Employee e)
{
	if (e instanceof Manager)
		//Process a Manager
	else if (e instanceof Engineer)
			// Process an Engineer
		else
			// Process any other type of Employee
}
/* in C++ the runtime-type information (RTTI) provides the functionality of instanceof */

// Casting Objects
// you can access the full functionality of an object by casting the reference
// if you don't make the cast, an attemp to execute e.getDepartment would fail because the compiler cannot locate getDepartment in Employee class
public void doSomething(Employee e)
{
	if (e instanceof Manager)	// if you dont do the instanceof test you run the risk of the cast failing
	{
		Manager m = (Manager) e;	// casting
		System.out.println("This is the manager of "+m.getDepartment());
	}
	// rest of operation
}
// 1. Casts upward in the class hierarchy are always permitted and do not require the cast operator
// 2. For downward casts, the compiler must be satisfied that the cast is at least possible, i mean, 
// 	the class to which the cast is taking place must be some subclass of the current reference type
// 3. The object type is checked at runtime, if the compiler permits the cast
	// if you dont use instanceof and the cast can't happen, then at runtime occurs runtime errors or exception errors

// Overloading Methods	Sobrecargando Métodos
// to use a method name for more than 1 method only if there's a distinction point: such as number and type of arguments
public void println(int i);
public void println(float f);
public void println(String s);
// when you call one of these methods the appropiate method is chosen based on the argument
// RULES:
// the argument list must differ enought to allow ambiguous determination of the proper method to call
// the return type can be different but can't be the only difference

//Methods using variable arguments
// overloading methods can be used with methods with any number of arguments of the same type
public class Statistics
{
	public float average(int x1, int x2) {}
	public float average(int x1, int x2, int x3) {}
	public float average(int x1, int x2, int x3, int x4) {}
	float gradePointAverage = stats.average(4,3,4);
	float averageAge = stats.average(24,32,27,18);
}
// J2SE ver.5.0 provides the feature: varargs o variable arguments to enable you to write a more generic method
// its is invoced the same way as overloaded methods
public class Statictics
{
	public float average (int... nums)	// nums argument is the array object of type int[ ] 
	{
		int sum=0;
		for (int x: nums)	// this permits the method to iterate over the elements 
		{
			sum += x;
		}
		return ((float) sum / nums.length;	//and to get the number of elements or the length of the array
	}
}

/// Overloading Constructors
// when you call the constructor you can pass different arguments and so on call different constructors
// a constructor can call to other constructor within the same class as the calling constructor
public class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private Date birthDate;
    // the 1st constructor initializes all instance variables: name, salary and date of birth
    public Employee(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }
	// the 2nd constructor initialized name & salary but not date of birth
    public Employee(String name, double salary) {
        this(name, salary, null);	// the this reference is used as a forwarding call to the first constructor
    }
	// the 3rd constructor calls the 1st constructor passing in the class constant BASE_SALARY
    public Employee(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }
	// the 4th constructor calls passing the constant BASE_SALARY to the 2nd constructor which pass null date of birth
    public Employee(String name) {
        this(name, BASE_SALARY);
    }
// more Employee code...
}
/// Constructor Inheritance
// a subclass inherits all variable and methods from its parent class but not constructors
// to include a constructor in a class either you write it explicitly or the class calls the default constructor
// a parent constructor is always called in addition to a child constructor
/// Invoking Parent Class Constructor
// like methods, you can call the non-private constructors of its immediate superclass
// you can call a superclass constructor inside the child constructor
super(/*specific arguments*/)
// if it doesnt find super with those args, it looks for super without args, if there's no super without args a compile error results
// the call to super( ) must be the first statement in the constructor
public class Employee {
    private static final double BASE_SALARY = 15000.00;
    private String name;
    private double salary;
    private Date birthDate;
    
    public Employee(String name, double salary, Date DoB) {
        this.name = name;
        this.salary = salary;
        this.birthDate = DoB;
    }
    public Employee(String name, double salary) {
        this(name, salary, null);
    }
    public Employee(String name, Date DoB) {
        this(name, BASE_SALARY, DoB);
    }
    public Employee(String name) {
        this(name, BASE_SALARY);
    }
// more Employee code...
}

public class Manager extends Employee {
    private String department;
    
    public Manager(String name, double salary, String dept) {
        super(name, salary);	// you must place super or this in the first line of the constructor
        department = dept;
    }
    public Manager(String name, String dept) {
        super(name);
        department = dept;
    }
    public Manager(String dept) { // This code fails: no super()
        department = dept;		//the compiler inserts an implicit call to super( )  and Employee didn't provide a constructor w/o args
    }
}
// you can also write constructors that can also call super(...) or this(...)  to invoque a chain of constructors
// the parent class construct execute before any child  class constructor in the chain

///Constructing and Initializing Objects
// 1st The memory for the complete object is allocated and default values for the instance variables are assigned
// 2nd The top level constructor is called and the instance variable initialization follow 5 steps:
//	2.A.	Bind the constructor parameters
//	2.B.	If explicit this( ), call recursively and then execute the body of the current constructor
//	2.C.	Call recursively the implicit or explicit super(...) except for Object because Object has no parent class
//	2.D.	Execute the explicit instance variable initializers
//	2.E.	Execute the body of the current constructor
// Manager, Employee classes		and steps to construct new Manager, Joe Smith, Sales
public class Object {
    public Object() {}
}
public class Employee extends Object {
    private String name;
    private double salary = 15000.00;
    private Date birthDate;
    
    public Employee(String n, Date DoB) {
// implicit super();
        name = n;
        birthDate = DoB;
    }
    public Employee(String n) {
        this(n, null);
    }
}
public class Manager extends Employee {
    private String department;
    public Manager(String n, String d) {
        super(n);
        department = d;
    }
}

/// The Object class
// is the root of all classes in Java	implicitly a class extends to it
// you can override methods inherited from Object class
public class Employee extends Object {/* code here */}

/// Object methods
/// equals method
// from java.lang package, method public boolean equals
"2nd course, 4th module, 5th Topic: Constructing and Initializing Objects, Page 3 of 9"

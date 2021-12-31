class Test
{
private static final String [] reserved =
{ "and",
"begin",
"define",
"do",
"else",
"end",
"if",
"not",
"or",
"return",
"then",
"while" };
  
private static int hash(String name)
{
int a=name.charAt(0),b=name.charAt(1);
a=(a/3)%8;
b=43*((b-5)%92);
return (a-7)+b;
}
public static void check()
{
for (int index = 0; index < reserved.length ; index += 1)
{
System.out.print("h(\"" + reserved[index] + "\") = ");
System.out.print(hash(reserved[index]));
System.out.println();
}
}
}

/*Output:
h("and") = 552 
h("begin") = 165 
h("define") = 166 
h("do") = 596 
h("else") = 467 
h("end") = 553 
h("if") = 211 
h("not") = 599 
h("or") = 729 
h("return") = 171 
h("then") = 300 
h("while") = 301 */


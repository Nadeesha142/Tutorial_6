object CeasarCiper extends App{

	val alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

	//Encryption
	val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)

	//Depcryption
	val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size)
	
	val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
	val ct=cipher(E,s,5,alphabet)
	val pt=cipher(D,ct,5,alphabet)

}
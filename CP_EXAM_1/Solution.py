d={}
d["a"]=".-"
d["b"]="-..."
d["c"] ="-.-."
d["d"] ="-.."
d["e"] ="."
d["f"] ="..-."
d["g"]="--."
d["h"] ="...."
d["i"] =".."
d["j"]=".---"
d["k"] ="-.-"
d["l"]=".-.."
d["m"] ="--"	
d["n"]="-."
d["o"] ="---"
d["p"] =".--."
d["q"]="--.-"
d["r"]=".-."
d["s"]="..."
d["t"]="-"
d["u"]="..-"
d["v"]="...-"
d["w"]=".--"
d["x"]="-..-"
d["y"]="-.--"
d["z"]="--.."
def fun(n):

	l=[]
	for i in n:
		s=""
		for j in i:
			s=s+d[j]
		l.append(s)
	print(l)

	count=0
	d1={}
	count=0
	for i in l:
		if i not in d1:
			d1[i]=1
			count=count+1
	print(count)


n=["gin","zen","gig","msg"]
fun(n)
n2=["a","z","g","m"]
fun(n2)
n3=["bhi","vsv","sgh","vbi"]
fun(n3)
n4=["a","b","c","d"]
fun(n4)
n5=["hig","sip","pot"]
fun(n5)

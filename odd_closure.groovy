 def oddClosure = {element ->
    Number number = Integer.parseInt(element)
    if (number%2 != 0){
        print number + " "
    }
}

def evenClosure = {element ->
    Number number = Integer.parseInt(element)
    if (number%2 == 0){
        print number + " "
    }
}

def numbers = ["1", "2", "3", "4", "5", "6", "7", "8"]
print ("Odd Numbers-->")
numbers.each(oddClosure)
println ""
print ("Even Numbers-->")
numbers.each(evenClosure)
println ""
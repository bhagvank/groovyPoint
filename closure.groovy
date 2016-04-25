 class ClosureTest{
    public void printClosure(String value){
        println value
    }
}

def obj = new ClosureTest()
Closure closureObj = obj.&printClosure
closureObj.call("Test")
public class CustomException extends Exception{
	public AgeOutOfBoundException(){
		super();
	}
	//方法重载
	public AgeOutOfBoundException(String message){
		super(message);
	}

	public AgeOutOfBoundException(String message,Throwable cause){
		super(message,cause);
	}

	public AgeOutOfBoundException(Throwable cause){
		super(cause);
	}

	//protected访问权限：自己、同包、子类
	protected AgeOutOfBoundException(String message,Throwable cause,boolean enableSuppression,boolean writableStackTrace){
		super(message,cause,enableSuppression,writableStackTrace);
	}
}
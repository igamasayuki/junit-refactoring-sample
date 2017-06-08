package com.example.exception;

/**
 * ‘¬“x‚ªã‚ª‚è‰ß‚¬‚½ó‘Ô‚Å”­¶‚³‚¹‚éŒŸ¸—áŠOB
 * @author igamasayuki
 *
 */
public class OverSpeedException extends Exception{

	private static final long serialVersionUID = 1L;

	public OverSpeedException() {  
        super();  
    }  
  
    public OverSpeedException(String message) {  
        super(message);  
    }  
  
    public OverSpeedException(String message, Throwable throwable) {  
        super(message, throwable);  
    }  
  
    public OverSpeedException(Throwable throwable) {  
        super(throwable);  
    }  
}

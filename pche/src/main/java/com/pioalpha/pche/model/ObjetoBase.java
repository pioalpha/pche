package com.pioalpha.pche.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class ObjetoBase implements Serializable{
	
	public abstract String toString();
    public abstract boolean equals(Object o);
    public abstract int hashCode();
}

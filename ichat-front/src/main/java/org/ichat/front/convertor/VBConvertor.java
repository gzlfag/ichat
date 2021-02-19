package org.ichat.front.convertor;

public interface VBConvertor<V, B> {
	V transToVo(B bo);
	
	B transToBo(V vo);
	
}

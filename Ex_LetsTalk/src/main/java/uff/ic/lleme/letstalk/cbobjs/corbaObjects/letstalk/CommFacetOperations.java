package uff.ic.lleme.letstalk.cbobjs.corbaObjects.letstalk;

/**
 * corbaObjects/letstalk/CommFacetOperations.java . Generated by the IDL-to-Java
 * compiler (portable), version "3.2" from letstalk.idl Sexta-feira, 9 de
 * Dezembro de 2005 18h26min29s BRST
 */

public interface CommFacetOperations {
	void startChatting(String login, String[] users)
			throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidConnection, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalError;

	void sendMessage(String login, String chatId, String[] recipients,
			String message) throws uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InternalError, 
			uff.ic.lleme.letstalk.cbobjs.corbaObjects.scs.InvalidName;
} // interface CommFacetOperations

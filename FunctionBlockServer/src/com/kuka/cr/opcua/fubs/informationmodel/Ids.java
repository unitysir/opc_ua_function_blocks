/**
* Prosys OPC UA Java SDK
*
* Copyright (c) Prosys PMS Ltd., http://www.prosysopc.com.
* All rights reserved.
*/

/**
* DO NOT EDIT THIS FILE DIRECTLY! It is generated and will be overwritten on regeneration.
*/

package com.kuka.cr.opcua.fubs.informationmodel;

import org.opcfoundation.ua.builtintypes.ExpandedNodeId;

public class Ids {
    
	public static final ExpandedNodeId MethodStatusUpdateEvent = init("nsu=http://kuka.com/fubs;i=1004");
	public static final ExpandedNodeId SemanticAnnotationType = init("nsu=http://kuka.com/fubs;i=1001");
	public static final ExpandedNodeId FubProgramStateMachineType = init("nsu=http://kuka.com/fubs;i=1005");
	public static final ExpandedNodeId VariableType = init("nsu=http://kuka.com/fubs;i=1006");
	public static final ExpandedNodeId VarMetadataType = init("nsu=http://kuka.com/fubs;i=1007");
	public static final ExpandedNodeId ViperVarGroup = init("nsu=http://kuka.com/fubs;i=1009");
	public static final ExpandedNodeId SemanticReferenceType = init("nsu=http://kuka.com/fubs;i=2002");
    
	private static ExpandedNodeId init(String id){
		return ExpandedNodeId.parseExpandedNodeId(id);
	}
    
}
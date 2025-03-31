package base_Physics_Objects.particleDynamics.forces.base;

import java.util.HashMap;
import java.util.Map;

public enum ForceType {
	F_NONE, S_SCALAR, S_VECTOR, ATTR, REPL, DAMPSPRING, DSPR_THETABAR;	
	private final String[] _typeExplanation = new String[] {
			"None", 
			"Gravity-type force (scalar particle quantity)", 
			"Air Drag-type force (vector particle quantity)", 
			"Attractor", 
			"Repulsor", 
			"Damped Spring", 
			"Force back to ThetaBar"
	};
	private static final String[] _typeName = new String[]{"None", "Scalar", "Vector", "Attractor", "Repulsor", "Damped Spring", "Force back to ThetaBar"};
	private static Map<Integer, ForceType> map = new HashMap<Integer, ForceType>(); 
	static { for (ForceType enumV : ForceType.values()) { map.put(enumV.ordinal(), enumV);}}
	public int getVal(){return ordinal();} 	
	public static ForceType getEnumByIndex(int idx){return map.get(idx);}
	public static ForceType getEnumFromValue(int idx){return map.get(idx);}
	public static int getNumVals(){return map.size();}						//get # of values in enum	
	public String getName() {return _typeName[ordinal()];}
	public static String getName(int _val) {return _typeName[_val];}
	@Override
    public String toString() { return ""+this.name()+":"+_typeExplanation[ordinal()]; }	
    public String toStrBrf() { return ""+_typeExplanation[ordinal()]; }	
};

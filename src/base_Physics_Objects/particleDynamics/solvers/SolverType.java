package base_Physics_Objects.particleDynamics.solvers;

import java.util.HashMap;
import java.util.Map;


public enum SolverType {
	GROUND, EXP_E, MIDPOINT, RK3, RK4, IMP_E, TRAP, VERLET, RK4_G;
	private static String[] _typeExplanation = new String[]{
			"Ground Truth (Analytic)", 
			"Explicit Euler", 
			"Midpoint", 
			"RK3", "RK4", 
			"Implicit Euler", 
			"Trapezoidal", 
			"Verlet", 
			"Generalized RK4"};
	private static String[] _typeName = new String[]{"Ground_Truth", "Explicit_Euler", "Midpoint", "RK3", "RK4", "Implicit_Euler", "Trapezoidal", "Verlet", "Gen_RK4"};
	private static Map<Integer, SolverType> map = new HashMap<Integer, SolverType>(); 
	static { for (SolverType enumV : SolverType.values()) { map.put(enumV.ordinal(), enumV);}}
	public int getVal(){return ordinal();} 	
	public static SolverType getEnumByIndex(int idx){return map.get(idx);}
	public static SolverType getEnumFromValue(int idx){return map.get(idx);}
	public static int getNumVals(){return map.size();}						//get # of values in enum			
	public String getName() {return _typeName[ordinal()];}
	public static String getName(SolverType _val) {return _typeName[_val.ordinal()];}
	@Override
    public String toString() { return ""+this.name()+":"+_typeExplanation[ordinal()]; }	
    public String toStrBrf() { return ""+_typeExplanation[ordinal()]; }	
};

package base_Physics_Objects.particleDynamics.colliders.base;

import java.util.HashMap;
import java.util.Map;


public enum CollisionType {
	CL_NONE(0), FLAT(1), PARTICLE(2), SPHERE(3), CYLINDER(4), BOX(5);
	private int value; 
	private final String[] _typeExplanation = new String[] {
			"None", "Flat surface", "Particle to particle", "Spherical", "Cylinder", "Bounding Box"
	};
	private static final String[] _typeName = new String[]{"None", "Flat", "Particle", "Spherical", "Cylinder", "BBox"};
	private static Map<Integer, CollisionType> map = new HashMap<Integer, CollisionType>(); 
	static { for (CollisionType enumV : CollisionType.values()) { map.put(enumV.value, enumV);}}
	private CollisionType(int _val){value = _val;} 
	public int getVal(){return value;} 	
	public static CollisionType getVal(int idx){return map.get(idx);}
	public static int getNumVals(){return map.size();}						//get # of values in enum	
	public String getName() {return _typeName[value];}
	public static String getName(int _val) {return _typeName[_val];}
	@Override
    public String toString() { return ""+this.name()+":"+_typeExplanation[value]; }	
    public String toStrBrf() { return ""+_typeExplanation[value]; }	
};
package base_Physics_Objects.particleDynamics.colliders.base;

import java.util.HashMap;
import java.util.Map;


public enum CollisionType {
    CL_NONE, FLAT, PARTICLE, SPHERE, CYLINDER, BOX;
    private final String[] _typeExplanation = new String[]{
            "None", "Flat surface", "Particle to particle", "Spherical", "Cylinder", "Bounding Box"
    };
    private static final String[] _typeName = new String[]{"None", "Flat", "Particle", "Spherical", "Cylinder", "BBox"};
    private static Map<Integer, CollisionType> map = new HashMap<Integer, CollisionType>(); 
    static { for (CollisionType enumV : CollisionType.values()) { map.put(enumV.ordinal(), enumV);}}
    public int getVal() {return ordinal();}     
    public int getOrdinal() {return ordinal();}     
    public static CollisionType getEnumByIndex(int idx){return map.get(idx);}
    public static CollisionType getEnumFromValue(int idx){return map.get(idx);}
    public static int getNumVals(){return map.size();}                        //get # of values in enum    
    public String getName() {return _typeName[ordinal()];}
    public static String getName(CollisionType _val) {return _typeName[_val.ordinal()];}
    @Override
    public String toString() { return ""+this.name()+":"+_typeExplanation[ordinal()]; }    
    public String toStrBrf() { return ""+_typeExplanation[ordinal()]; }    
};
package base_Physics_Objects.particleDynamics.constraints.base;

import java.util.HashMap;
import java.util.Map;

public enum ConstraintType {
    C_NONE, C_Circular;
    private final String[] _typeExplanation = new String[]{
            "None", "Circular/Bar-type constraint"
    };
    private static final String[] _typeName = new String[]{"None", "Circular"};
    private static Map<Integer, ConstraintType> map = new HashMap<Integer, ConstraintType>(); 
    static { for (ConstraintType enumV : ConstraintType.values()) { map.put(enumV.ordinal(), enumV);}}
    public int getVal() {return ordinal();}     
    public int getOrdinal() {return ordinal();}     
    public static ConstraintType getEnumByIndex(int idx){return map.get(idx);}
    public static ConstraintType getEnumFromValue(int idx){return map.get(idx);}
    public static int getNumVals(){return map.size();}
    public String getName() {return _typeName[ordinal()];}
    public static String getName(ConstraintType _val) {return _typeName[_val.ordinal()];}
    @Override
    public String toString() { return ""+this.name()+":"+_typeExplanation[ordinal()]; }    
    public String toStrBrf() { return ""+_typeExplanation[ordinal()]; }    
};
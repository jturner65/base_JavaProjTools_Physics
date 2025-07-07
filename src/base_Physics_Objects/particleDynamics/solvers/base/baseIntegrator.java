package base_Physics_Objects.particleDynamics.solvers.base;

import base_Math_Objects.vectorObjs.floats.myVectorf;
import base_Physics_Objects.particleDynamics.particles.myParticle;

public abstract class baseIntegrator{
    public static myVectorf gravVec = new myVectorf(myParticle.gravVec);
    public baseIntegrator(){}
    /**
     * Many forms have an Explicit Euler Step
     * @param deltaT
     * @param _state
     * @param _stateDot
     * @return
     */
    protected myVectorf[] integrateExpE(double deltaT, myVectorf[] _state, myVectorf[] _stateDot){
        myVectorf[] tmpVec = new myVectorf[2];
        tmpVec[0] = myVectorf._add(_state[0], myVectorf._mult(_stateDot[0],deltaT));
        tmpVec[1] = myVectorf._add(_state[1], myVectorf._mult(_stateDot[1],deltaT));
        return tmpVec;
    }
    public abstract myVectorf[] Integrate(double deltaT, myVectorf[] _state, myVectorf[] _stateDot);
}//class baseIntegrator
package cubelogic;

import java.util.ArrayList;
import java.util.EnumSet;

// Treat cubies like a circular linked list? where for each move, they have a reference to where
// the cubie needs to move its data to.

public class Cubie 
{
	EnumSet<MoveConditions> moveConditionFlags = EnumSet.noneOf(MoveConditions.class);

	ArrayList<ColorTypes> colorData;
	ArrayList<DirectionTypes> DirectionData;

	ArrayList<ArrayList<MoveTypes> > moveData;
}

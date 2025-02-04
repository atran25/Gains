package application;

import java.sql.Date;
import java.time.LocalDate;

public class WeightTraining extends Exercise {
	private int weight;
	private int sets;
	private int reps;
	
	/**
	 * Create a WeightTraining object from user input. 
	 */
	WeightTraining(String username, String workoutName, String difficulty,
			String avgSetDuration, Date date, int weight, int sets, int reps){
		setUsername(username);
		setWorkoutName(workoutName);
		setDifficulty(difficulty);
		setDuration(avgSetDuration);
		setWorkoutDate(date);
		setWeight(weight);
		setSets(sets);
		setReps(reps);
	}
	
	/** Creates WeightTraining objects from the database. The id will allow updating and deleting from database.
	 * @param id the primary key automatically assigned by database
	 */
	WeightTraining(int id, String username, String workoutName, String difficulty, 
			String duration, Date workoutDate, int weight, int sets, int reps){
		setId(id);
		setUsername(username);
		setWorkoutName(workoutName);
		setDifficulty(difficulty);
		setDuration(duration);
		setWorkoutDate(workoutDate);
		setWeight(weight);
		setSets(sets);
		setReps(reps);
	}
	
	@Override
	public String toString() {
		String data = 
				"username: " + getUsername() + 
				", workoutName: " + getWorkoutName() + 
				", difficulty: " + getDifficulty() + 
				", duration: " + getDuration() + 
				", workoutDate: " + getWorkoutDate() + 
				", weight: " + getWeight() + 
				", sets: " + getSets() + 
				", reps: " + getReps();
		// Adds id value if it exists
		if(getId() != 0) {
			return 	"id: " + getId() + ", " + data;
		}
		return data;
	}
	
	/** @return the weight */
	public int getWeight() {
		return weight;
	}
	
	/** @param weight the weight to set */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/** @return the sets */
	public int getSets() {
		return sets;
	}
	
	/** @param sets the sets to set */
	public void setSets(int sets) {
		this.sets = sets;
	}

	/** @return the reps */
	public int getReps() {
		return reps;
	}

	/** @param reps the reps to set */
	public void setReps(int reps) {
		this.reps = reps;
	}

}

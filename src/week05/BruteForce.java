package week05;

/**
 * 
 * @author Christian Gonzalez
 *
 */
public class BruteForce {


	public static String findTopology(boolean[][] input) {
		if(input.length < 3) {
			return "Input of nxn too small";
		}

		int edges = 0;
		int vertices = input.length;
		for(int row = 0; row < input.length; row++) {
			for(int col = 0; col < input.length; col++) {
				if(input[row][col]) {
					edges++;
				}
			}
		}

		if(vertices * 2 == edges) {
			System.out.println("Ring");
			return "Ring";
		}
		else if(vertices + (vertices - 2) == edges) {
			System.out.println("Star");
			return "Star";
		}
		else if(vertices * (vertices - 1) == edges) {
			System.out.println("Mesh");
			return "Mesh";
		}
		else {	
			System.out.println("Unknown topology");
			return "Unknown topology";
		}
	}

	public static void findTopologyLinear(boolean[][] input) {
		if(input.length < 3) {
			System.out.println("Input of nxn too small");
		}

		int edges = 0;
		for(int i = 0; i < input.length; i++) {
			if(input[0][i]) {
				edges++;
			}
		}

		if(edges == 2) {
			System.out.println("Ring");
		}
		else if(edges == 1) {
			System.out.println("Star");
		}
		else if(edges == input.length - 1) {
			edges = 0;
			for(int i = 0; i < input.length; i++) {
				if(input[1][i]) {
					edges++;
				}
			}
			if(edges == input.length - 1) {
				System.out.println("Mesh");
			}
			else if(edges == 1) {
				System.out.println("Star");
			}
			else {
				System.out.println("Unknown Topology");
			}
		}
		else {
			System.out.println("Unknown topology");
		}
	}

	public static void main(String[] args) {
		boolean ring [][] = {
				{false, true, false, false, false, true},
				{true, false, true, false, false, false},
				{false, true, false, true, false, false},
				{false, false, true, false, true, false},
				{false, false, false, true, false, true},
				{true, false, false, false, true, false}
		};

		boolean star [][] = {
				{false, true, true, true, true, true},
				{true, false, false, false, false, false},
				{true, false, false, false, false, false},
				{true, false, false, false, false, false},
				{true, false, false, false, false, false},
				{true, false, false, false, false, false}
		};

		boolean mesh [][] = {
				{false, true, true, true, true, true},
				{true, false, true, true, true, true},
				{true, true, false, true, true, true},
				{true, true, true, false, true, true},
				{true, true, true, true, false, true},
				{true, true, true, true, true, false}
		};

		findTopology(ring);
		findTopology(star);
		findTopology(mesh);
		System.out.println("");
		findTopologyLinear(ring);
		findTopologyLinear(star);
		findTopologyLinear(mesh);
	}
}

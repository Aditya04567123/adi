package adityanathapplication;

class Patient {
	 int id;
	 String name;
	 int priority; // 1 = Emergency, 2 = Normal
	 Patient(int id, String name, int priority) {
	 this.id = id;
	 this.name = name;
	 this.priority = priority;
	 }
	 public String toString() {
	 return name + "(Priority:" + priority + ")";
	 }
	}
	public class HospitalManagement {
	 public static void main(String[] args) {
	 List<Patient> patients = new ArrayList<>();
	 patients.add(new Patient(1, "Ravi", 2));
	 patients.add(new Patient(2, "Ayesha", 1));
	 patients.add(new PSet<String> aadhaar = new HashSet<>();
	 aadhaar.add("1111");
	 aadhaar.add("2222");
	 aadhaar.add("1111"); // duplicate ignored
	 Set<String> recentVisits = new LinkedHashSet<>();
	 recentVisits.add("Ravi");
	 recentVisits.add("Ayesha");
	 Queue<Patient> emergencyQueue =
	 new PriorityQueue<>((p1, p2) -> p1.priority -
	p2.priority);
	 emergencyQueue.addAll(patients);
	 Deque<String> actions = new ArrayDeque<>();
	 actions.push("Registered Ravi");
	 actions.push("Registered Ayesha");
	 actions.pop(); // undo
	 Map<Integer, String>records = new HashMap<>();
	 records.put(1, "Fever");
	 records.put(2, "Accident");
	 Map<String, String> appointments = new
	TreeMap<>();
	 appointments.put("2025-09-02", "Ravi");
	 appointments.put("2025-09-01", "Ayesha");
	 Iterator<Patient> itr = patient.iterator();
	 while (itr.hasNext()) {
		 if (itr.next().name.equals("Imran")) {
		 itr.remove(); // discharged
		 }
		 }
		 ListIterator<Patient> litr = patients.listIterator();
		 while (litr.hasNext()) {
		 if (litr.next().name.equals("Ravi")) {
		 litr.set(new Patient(1, "Ravi Kumar", 2));
		 }
		 }
		 System.out.println("Patients: " + patients);
		 System.out.println("Emergency Case: " +
		emergencyQueue.poll());
		 System.out.println("Recent Visits: " + recentVisits);
		 System.out.println("Records: " + records);
		 System.out.println("Appointments: " +
		appointments);
		 }
		}

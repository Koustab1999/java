
public class Person5 {
	private Job job;  	// composition has a relationship
	public Person5()
	{
		this.job=new Job();
		job.setSalary(1000L);
		job.setId(101);
		job.setRole("Manager");
	}
	public long dispDetails()
	{
		//return job.getSalary();

		System.out.println(job.getId()+" "+job.getRole()+" "+job.getSalary());
		return 0;
	}

}

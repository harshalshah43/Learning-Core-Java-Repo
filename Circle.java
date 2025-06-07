class Circle 
{
	float r,area;
	Circle()  // definition of default constructor
	{	
		System.out.println("Default constructor called");
		r=1;
	}
    
	Circle(int x)  // definition of parameterized constructor 
	{
	System.out.println("Parameterized Int constructor called");
	  r=x;
	}

    Circle(float x)  // definition of parameterized constructor 
	{
	System.out.println("Parameterized float constructor called");
	  r=x;
	}

	Circle(String[] x)  // definition of parameterized constructor 
	{
	System.out.println("Parameterized String constructor called");
	
	for(int i = 0; i < x.length ;i++) 
		{
			System.out.println(x[i]);
		}
	
	// for each
	for(String i: x)
	{
		System.out.println(i);
	}


	}

	void calculate()
	{
	  area=3.14f*r*r;
	}
	void display()
	{
	  System.out.println("Area="+area);
	}
	
};
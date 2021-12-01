class VideoGame
{
//Instance Data
private String name;
private String company;
private int year;
private double price;
private boolean console;

//Main Constructor
public VideoGame(String n, String c, double p, int y, boolean con)
{
  setName(n);
  setCompany(c);
  setYear(y);
  setPrice(p);
  setConsole(con);
}

//Default Constructor
public VideoGame()
{
  this("Super Mario Bros", "Nintendo", 0, 1985, false);
}


//Accessor Methods

public String getName()
{
  return name;
}

public String getCompany()
{
  return company;
}

public int getYear()
{
  return year;
}

public double getPrice()
{
  return price;
}

public boolean getConsole()
{
  return console;
}

//Mutator Methods

public void setName(String n)
{
  name = n;
}

public void setCompany(String c)
{
  company = c;
}

public void setYear(int y)
{
  year = y;
}

public void setPrice(double p )
{
  price = p;
}

public void setConsole(boolean con)
{
  console = con;
}

// First additional Method
/* Disounts the price of a game buy a specefic percent*/
public void discount(int i)
{
  if (i < 100 && i > 0)
  {
    double d = i;
    d  = 1-(d/100);
    d = d*this.getPrice();
    this.setPrice(d);
  }
}

// Second additional Method 
/*Changes the version into a newer version of the game using by adding the int parameter at the end of the title, removes the old version number, changes the year to 2021, and adds 10 dollars to the price because its a newer version*/
public void newVersion(int i)
{
  if ((this.getName().substring(this.getName().length()-1, this.getName().length()).equals("1"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("2"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("3"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("4"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("5"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("6"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("7"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("8"))||(this.getName().substring(this.getName().length()-1, this.getName().length()).equals("9")))
  {
    this.setName(this.getName().substring(0, this.getName().length()-2));
  }
  
  String name2 = this.getName() + " " + i;
  this.setName(name2);
  double price2 = price + (10*2);
  this.setPrice(price2);
  this.setYear(2021);
}

//equals method: Checks to see if two VideoGame classes are equal by checking the name of the two games
public boolean equals(VideoGame v)
{
  if (this.getName() == v.getName())
  {
    return true;
  }
  return false;
}

//toString method to put the class in a string form
public String toString()
{
  return "Name: " + name + "\nCompany: " + company + "\nYear: " + year + "\nPrice: $" + price + "\nOn Console? " + console;
}








}
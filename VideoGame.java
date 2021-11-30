class VideoGame
{
private String name;
private String company;
private int year;
private double price;
private boolean console;

public VideoGame(String n, String c, double p, int y, boolean con)
{
  setName(n);
  setCompany(c);
  setYear(y);
  setPrice(p);
  setConsole(con);
}

public VideoGame()
{
  this("Super Mario Bros", "Nintendo", 0, 1985, true);
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

public String newVersion(int i)
{
  return "Name: " + name + " " + i + "\nCompany: " + company + "\nYear: 2021"  + "\nOn Console? " + console;
}

public boolean equals(VideoGame v)
{
  if (this.getName() == v.getName() && this.getCompany() == v.getCompany())
  {
    return true;
  }
  return false;
}



public String toString()
{
  return "Name: " + name + "\nCompany: " + company + "\nYear: " + year + "\nPrice: $" + price + "\nOn Console? " + console;
}








}
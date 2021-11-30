class VideoGame
{
private String name;
private String company;
private int year;
private boolean console;

public VideoGame(String n, String c, int y, boolean con)
{
  setName(n);
  setCompany(c);
  setYear(y);
  setConsole(con);
}

public VideoGame()
{
  this("Super Mario Bros", "Nintendo", 1985, true);
}

public VideoGame(String s, boolean con)
{
  this(s, "Unknown", 2000, con);
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

public void setConsole(boolean con)
{
  console = con;
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
  return "Name: " + name + "\nCompany: " + company + "\nYear: " + year + "\nOn Console? " + console;
}








}
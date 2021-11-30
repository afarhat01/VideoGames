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

}
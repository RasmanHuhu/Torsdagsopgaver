boolean jobsDone = true;

void setup()
{
    
    println(getRandomNumber(0, 10));
    if (isJobDone())
    {
        println("Job's done!");   
    }
}

boolean isJobDone()
{
    return jobsDone;    
}

float getRandomNumber(float min, float max) 
{
  //Random returnerer ALTID en float. Derfor skal ovenstående ints være floats
    return random(min, max);
}

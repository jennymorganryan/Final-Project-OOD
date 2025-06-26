a. Input Validation Example:

   public void receiveAward(String award) {
   ****if(!award.equals("Razzie"))****
   super.receiveAward(award);
   }
In this example, we validate to determine if our passed in argument of award is equal
to "Razzie"

b. Inheritence Example:

public Actor(Name name, Integer age, List<String> genres, List<String> awards,
   String[] movies, String[] series, String[] otherMultimedia) throws InvalidAgeException {
   ****super(name, age, genres, awards, movies, series, otherMultimedia);****
   }
In this example Actor inherents data from APerformingArtist such as name, age, genres, awards, movies, series 
and otherMultimedia

c. Class Implementing an Interface:

**package problem1;
public interface IArtist {
void receiveAward(String award);
void updateGenres(String genres);
}**

Our class IArtist implements an interface called IArtist (This interface includes the initializations of methods 
receiveAward and updateGenres) which AArtist abstract class then implements, this abstract class also overrides our
initialized methods receiveAward and updateGenres.

d. Method Overriding:

@Override
**public void receiveAward(String award)** {
this.awards.add(award);
}
@Override
**public void updateGenres(String genres)** {
if(this.genres.contains(genres))
return;
else this.genres.add(genres);
}
@Override
**public boolean equals(Object o)** {
if (o == null || getClass() != o.getClass()) {
return false;
}
AArtist aArtist = (AArtist) o;
return Objects.equals(name, aArtist.name) && Objects.equals(age, aArtist.age)
&& Objects.equals(genres, aArtist.genres) && Objects.equals(awards,
aArtist.awards);
}
@Override
**public int hashCode()** {
return Objects.hash(name, age, genres, awards);
}


In this code snippet, we can see the overridden methods which were originally initialized in
the IArtist interface class with their implemented function definitions in the AArtist abstract class.
As best convention we also override our equal and hashcode functions.

e. Method Overloading:

public class Actor extends APerformingArtist {
**public Actor(Name name, Integer age, List<String> genres, List<String> awards,
String[] movies, String[] series, String[] otherMultimedia)** throws InvalidAgeException {
super(name, age, genres, awards, movies, series, otherMultimedia);
}
**public Actor(Name name, Integer age, List<String> genres, List<String> awards,
String[] movies, String[] series)** throws InvalidAgeException {
super(name, age, genres, awards, movies, series, null);
}

Here we can see an example of method overloading in which we have two methods with seemingly the
same signatures at first glance. When we take a closer look we see these methods have the same name but intake
different arguments. This is also known as polymorphism.

f. Casting

private bool ready = false;
return (String) false 

I did not find an example of casting in our code but casting is when you change the type 
of data a variable is to execute a function temporarily.

g. The Use of Generics

if(age >= **MIN_AGE** && age <= **MAX_AGE**)
return true;
else throw new InvalidAgeException("Age has to have a value in range 0 - 128!");
}

Here we can see an example for the use of generics, the constants MIN_AGE ad MAX_AGE have been named samatically
and used as constants to be more readable.

h. Exception Throwing:

if(age >= MIN_AGE && age <= MAX_AGE)
return true;
**else throw new InvalidAgeException("Age has to have a value in range 0 - 128!");**
}
In this code snippet we can see an example of exception throwing in our 3rd line of code.
Where we instruct our program to return an exception if our condition is not met.


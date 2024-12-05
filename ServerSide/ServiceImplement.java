package ServerSide;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import Shared.InterfaceMovie;
import java.util.stream.Collectors;

public class ServiceImplement extends UnicastRemoteObject implements InterfaceMovie {

  private static final List < Movie > movieDatabase = new ArrayList < > ();



  // Constructor: Initializes the movie database
  protected ServiceImplement() throws RemoteException {
      super();
      populateMovieDatabase();
  }





  private void populateMovieDatabase() {

	    movieDatabase.add(new Movie("The Godfather", "Crime", 1972, 9.2, "Marlon Brando", true, "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.", 9.2));
	    movieDatabase.add(new Movie("The Shawshank Redemption", "Drama", 1994, 9.3, "Tim Robbins", true, "Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.", 9.3));
	    movieDatabase.add(new Movie("Schindler's List", "Biography", 1993, 8.9, "Liam Neeson", true, "In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution.", 8.7));
	    movieDatabase.add(new Movie("Raging Bull", "Biography", 1980, 8.5, "Robert De Niro", true, "The life of boxer Jake LaMotta, whose violence and temper led him to the top of his profession, but destroyed his life outside of the ring.", 8.6));
	    movieDatabase.add(new Movie("Casablanca", "Romance", 1942, 8.4, "Humphrey Bogart", true, "In Casablanca in December 1941, a cynical American expatriate encounters a former lover, with unforeseen complications.", 8.5));
	    movieDatabase.add(new Movie("Citizen Kane", "Drama", 1941, 8.8, "Orson Welles", true, "Following the death of a publishing tycoon, news reporters scramble to uncover the meaning of his final utterance.", 8.3));
	    movieDatabase.add(new Movie("Gone with the Wind", "Drama", 1939, 8.1, "Clark Gable", true, "A manipulative woman and a roguish man conduct a turbulent romance during the American Civil War and Reconstruction era.", 8.4));
	    movieDatabase.add(new Movie("The Dark Knight", "Action", 2008, 9.0, "Christian Bale", true, "When the menace known as the Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham.", 9.1));
	    movieDatabase.add(new Movie("12 Angry Men", "Drama", 1957, 8.9, "Henry Fonda", true, "A jury holdout attempts to prevent a miscarriage of justice by forcing his colleagues to reconsider the evidence.", 8.8));
	    movieDatabase.add(new Movie("The Lord of the Rings: The Return of the King", "Action", 2003, 8.9, "Elijah Wood", true, "Gandalf and Aragorn lead the World of Men against Sauron's army to save Middle-earth.", 8.7));
	    movieDatabase.add(new Movie("Pulp Fiction", "Crime", 1994, 8.9, "John Travolta", true, "The lives of two mob hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption.", 8.9));
	    movieDatabase.add(new Movie("The Good, the Bad and the Ugly", "Western", 1966, 8.8, "Clint Eastwood", true, "A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.", 8.8));
	    movieDatabase.add(new Movie("Fight Club", "Drama", 1999, 8.8, "Edward Norton", true, "An insomniac office worker forms an underground fight club with a soap maker.", 8.7));
	    movieDatabase.add(new Movie("Forrest Gump", "Drama", 1994, 8.7, "Tom Hanks", true, "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold through the perspective of an Alabama man.", 8.6));
	    movieDatabase.add(new Movie("Inception", "Sci-Fi", 2010, 8.6, "Leonardo DiCaprio", true, "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a CEO.", 8.5));
	    movieDatabase.add(new Movie("The Matrix", "Sci-Fi", 1999, 8.7, "Keanu Reeves", true, "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers.",  8.8));
	    movieDatabase.add(new Movie("Goodfellas", "Crime", 1990, 8.7, "Ray Liotta", true, "The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito.", 8.6));
	    movieDatabase.add(new Movie("The Silence of the Lambs", "Thriller", 1991, 8.6, "Jodie Foster", true, "A young FBI cadet must confide in an incarcerated and manipulative killer to receive his help on catching another serial killer.", 8.5));
	    movieDatabase.add(new Movie("The Usual Suspects", "Crime", 1995, 8.5, "Kevin Spacey", true, "A sole survivor tells of the twisty events leading up to a horrific gun battle on a boat, which began when five criminals met at a seemingly random police lineup.", 8.4));
	    movieDatabase.add(new Movie("Se7en", "Crime", 1995, 8.6, "Morgan Freeman", true, "Two detectives, a rookie and a veteran, hunt a serial killer who uses the seven deadly sins as his modus operandi.", 8.5));
	    movieDatabase.add(new Movie("The Departed", "Crime", 2006, 8.5, "Leonardo DiCaprio", true, "An undercover cop and a mole in the police attempt to identify each other while infiltrating an Irish gang in South Boston.", 8.4));
	    movieDatabase.add(new Movie("Gladiator", "Action", 2000, 8.5, "Russell Crowe", true, "A former Roman General sets out to exact vengeance against the corrupt emperor who murdered his family and sent him into slavery.", 8.3));
	    movieDatabase.add(new Movie("The Prestige", "Drama", 2006, 8.5, "Hugh Jackman", true, "After a tragic accident, two stage magicians engage in a battle to create the ultimate stage illusion while sacrificing everything they have to outwit each other.", 8.4));
	    movieDatabase.add(new Movie("The Lion King", "Animation", 1994, 8.5, "Matthew Broderick", true, "Lion prince Simba flees his kingdom after the death of his father, but returns as an adult to reclaim his throne.", 8.6));
	    movieDatabase.add(new Movie("Back to the Future", "Adventure", 1985, 8.5, "Michael J. Fox", true, "A teenager is accidentally sent thirty years into the past in a time-traveling DeLorean invented by his close friend, a maverick scientist.", 8.4));
	    movieDatabase.add(new Movie("Jurassic Park", "Adventure", 1993, 8.5, "Sam Neill", true, "During a preview tour, a theme park suffers a major power breakdown that allows its cloned dinosaur exhibits to run amok.", 8.3));
	    movieDatabase.add(new Movie("The Intouchables", "Biography", 2011, 8.5, "François Cluzet", true, "After he becomes a quadriplegic from a paragliding accident, an aristocrat hires a young man from the projects to be his caregiver.", 8.6));
	    movieDatabase.add(new Movie("The Green Mile", "Drama", 1999, 8.6, "Tom Hanks", true, "The lives of guards on Death Row are affected by one of their charges: a convicted murderer who has a mysterious gift.", 8.5));
	    movieDatabase.add(new Movie("The Pianist", "Biography", 2002, 8.5, "Adrien Brody", true, "A Polish Jewish musician struggles to survive the destruction of the Warsaw ghetto of World War II.", 8.4));
	    movieDatabase.add(new Movie("Terminator 2: Judgment Day", "Action", 1991, 8.5, "Arnold Schwarzenegger", true, "A cyborg, identical to the one who failed to kill Sarah Connor, must now protect her teenage son John Connor from a more advanced and powerful cyborg.", 8.6));
	    movieDatabase.add(new Movie("Saving Private Ryan", "Drama", 1998, 8.6, "Tom Hanks", true, "In the midst of World War II, Captain Miller and his squad are assigned to retrieve a paratrooper whose brothers have been killed in action.", 8.5));
	    movieDatabase.add(new Movie("The Social Network", "Biography", 2010, 8.5, "Jesse Eisenberg", true, "As Harvard students create the social networking site, Facebook, they must deal with both personal and legal complications that arise from their success.", 8.4));
	    movieDatabase.add(new Movie("The Shape of Water", "Fantasy", 2017, 8.0, "Sally Hawkins", true, "At a top secret research facility in the 1960s, a lonely janitor forms a unique relationship with an amphibious creature that is being held captive.", 8.1));
	    movieDatabase.add(new Movie("Whiplash", "Drama", 2014, 8.5, "Miles Teller", true, "A promising young drummer enrolls at a cut-throat music conservatory where his dreams of greatness are mentored by an instructor who will stop at nothing to realize a student's potential.", 8.6));
	    movieDatabase.add(new Movie("The Grand Budapest Hotel", "Comedy", 2014, 8.1, "Ralph Fiennes", true, "The adventures of Gustave H, a legendary concierge at a famous hotel from the fictional Republic of Zubrowka, and Zero Moustafa, the lobby boy who becomes his most trusted friend.", 8.2));
	    movieDatabase.add(new Movie("The Wolf of Wall Street", "Biography", 2013, 8.2, "Leonardo DiCaprio", true, "Based on the true story of Jordan Belfort, from his rise to a wealthy stock-broker living the high life to his fall involving crime, corruption and the federal government.", 8.3));
	    movieDatabase.add(new Movie("The Imitation Game", "Biography", 2014, 8.0, "Benedict Cumberbatch", true, "During World War II, mathematician Alan Turing tries to crack the enigma code with help from fellow mathematicians.", 8.1));
	    movieDatabase.add(new Movie("A Beautiful Mind", "Biography", 2001, 8.2, "Russell Crowe", true, "After John Nash, a brilliant but asocial mathematician, accepts secret work in cryptography, his life takes a turn for the nightmarish.", 8.3));
	    movieDatabase.add(new Movie("The King's Speech", "Biography", 2010, 8.0, "Colin Firth", true, "The story of King George VI of Britain, his impromptu ascension to the throne and the speech therapist who helped the unsure monarch become worthy of it.", 8.1));
	    movieDatabase.add(new Movie("The Revenant", "Adventure", 2015, 8.0, "Leonardo DiCaprio", true, "In the 1820s, a frontiersman on a quest for survival battles a bear and treachery while trekking through the wilderness.", 8.2));
	    movieDatabase.add(new Movie("The Hateful Eight", "Western", 2015, 7.8, "Samuel L. Jackson", true, "In post-Civil War Wyoming, a bounty hunter and his prisoner find shelter in a cabin currently inhabited by a collection of nefarious characters.", 7.9));
	    movieDatabase.add(new Movie("Django Unchained", "Western", 2012, 8.4, "Jamie Foxx", true, "With the help of a German bounty hunter, a freed slave sets out to rescue his wife from a brutal Mississippi plantation owner.", 8.5));
	    movieDatabase.add(new Movie("The Big Lebowski", "Comedy", 1998, 8.1, "Jeff Bridges", true, "When an unemployed slacker known as 'The Dude' is mistaken for a millionaire, he seeks restitution for his ruined rug and enlists his bowling buddies for help.", 8.2));
	    movieDatabase.add(new Movie("The Truman Show", "Comedy", 1998, 8.2, "Jim Carrey", true, "An insurance salesman discovers his entire life is actually a reality TV show.", 8.3));
	    movieDatabase.add(new Movie("The Sixth Sense", "Thriller", 1999, 8.1, "Bruce Willis", true, "A boy who communicates with spirits that don't know they're dead seeks the help of a disheartened child psychologist.", 8.2));
	    movieDatabase.add(new Movie("The Others", "Horror", 2001, 7.6, "Nicole Kidman", true, "A woman who lives in a darkened old house with her two agoraphobic children becomes convinced that her family home is haunted.", 7.7));
	    movieDatabase.add(new Movie("Get Out", "Horror", 2017, 7.7, "Daniel Kaluuya", true, "A young African-American man visits his white girlfriend's family estate, where his simmering uneasiness about their reception of him eventually reaches a boiling point.", 7.8));
	     movieDatabase.add(new Movie("The Princess Bride", "Fantasy", 1987, 8.1, "Cary Elwes", true, "While home sick in bed, a young boy's grandfather reads him the story of a farmhand named Westley, who sets out to rescue his true love Princess Buttercup from the evil Prince Humperdinck.", 8.2));
	    movieDatabase.add(new Movie("The Terminator", "Action", 1984, 8.1, "Arnold Schwarzenegger", true, "A cyborg is sent back in time to kill Sarah Connor, the mother of the future leader of the human resistance against machines.", 8.2));
	    movieDatabase.add(new Movie("E.T. the Extra-Terrestrial", "Family", 1982, 8.4, "Henry Thomas", true, "A young boy befriends an alien who is stranded on Earth and tries to help him contact his spaceship and return home.", 8.5));
	    movieDatabase.add(new Movie("Jaws", "Thriller", 1975, 8.1, "Roy Scheider", true, "A giant great white shark terrorizes a beach town, and a police chief, a marine biologist, and a fisherman team up to stop it.", 8.2));
	    movieDatabase.add(new Movie("The Wizard of Oz", "Fantasy", 1939, 8.1, "Judy Garland", true, "Dorothy Gale is swept away to a magical land in a tornado and embarks on a quest to find her way home.", 8.2));
	    movieDatabase.add(new Movie("The Sound of Music", "Musical", 1965, 8.0, "Julie Andrews", true, "A young nun becomes the governess of a large family and teaches them to love and sing.", 8.1));
	    movieDatabase.add(new Movie("Forrest Gump", "Drama", 1994, 8.8, "Tom Hanks", true, "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold through the perspective of an Alabama man.", 8.7));
	    movieDatabase.add(new Movie("The Jungle Book", "Adventure", 2016, 7.9, "Neel Sethi", true, "After a threat from the tiger Shere Khan forces him to flee the jungle, a man-cub named Mowgli embarks on a journey of self-discovery with the help of a bear named Baloo and a panther named Bagheera.", 8.0));
	    movieDatabase.add(new Movie("The Hunger Games", "Action", 2012, 8.1, "Jennifer Lawrence", true, "In a dystopian future, a young girl is forced to participate in a deadly game where contestants must fight to the death in a televised event.", 8.2));
	    movieDatabase.add(new Movie("The Lord of the Rings: The Fellowship of the Ring", "Fantasy", 2001, 8.8, "Elijah Wood", true, "In the first installment of the trilogy, a hobbit named Frodo Baggins inherits the One Ring and sets out on a perilous journey to destroy it in the fires of Mount Doom.", 8.7));
	    movieDatabase.add(new Movie("Pirates of the Caribbean: The Curse of the Black Pearl", "Adventure", 2003, 8.1, "Johnny Depp", true, "Blacksmith Will Turner teams up with eccentric pirate Captain Jack Sparrow to rescue his love, Elizabeth Swann, from the cursed pirate ship, the Black Pearl.", 8.2));
	    movieDatabase.add(new Movie("The Avengers", "Action", 2012, 8.3, "Robert Downey Jr.", true, "Nick Fury, director of the peacekeeping organization S.H.I.E.L.D., recruits Iron Man, Captain America, the Hulk and Thor to form a team to save the world from an alien invasion.", 8.4));
	    movieDatabase.add(new Movie("The Dark Knight Rises", "Action", 2012, 8.6, "Christian Bale", true, "Eight years after the events of The Dark Knight, Batman must come out of retirement to stop the villainous Bane from destroying Gotham City.", 8.7));
	    movieDatabase.add(new Movie("Inglourious Basterds", "War", 2009, 8.3, "Brad Pitt", true, "In Nazi-occupied France during World War II, a group of Jewish-American guerrilla fighters plans to take down the Nazis.", 8.4));
	    movieDatabase.add(new Movie("The Bourne Ultimatum", "Action", 2007, 8.1, "Matt Damon", true, "Jason Bourne continues his search for answers about his past and the conspiracy that created him.", 8.2));
	    movieDatabase.add(new Movie("The 40-Year-Old Virgin", "Comedy", 2005, 8.0, "Steve Carell", true, "Goaded by his buddies, a nerdy guy who's never had sex sets out to lose his virginity.", 8.1));
	    movieDatabase.add(new Movie("Anchorman: The Legend of Ron Burgundy", "Comedy", 2004, 7.6, "Will Ferrell", true, "A charismatic news anchor in 1970s San Diego clashes with a new female anchor and becomes embroiled in a bitter rivalry.", 7.7));
	    movieDatabase.add(new Movie("The Hangover", "Comedy", 2009, 8.0, "Bradley Cooper", true, "A Las Vegas bachelor party goes awry when the groom disappears and the remaining friends must retrace their wild night to find him.", 8.1));
	    movieDatabase.add(new Movie("Superbad", "Comedy", 2007, 8.0, "Jonah Hill", true, "Two high school seniors make a pact to score booze for a party, but their quest is complicated when one of them gets caught up in a series of misadventures.", 8.1));
	    movieDatabase.add(new Movie("The 400 Blows", "Drama", 1959, 8.1, "Jean-Pierre Léaud", true, "A coming-of-age story about a troubled young boy growing up in post-war France.", 8.2));
	    movieDatabase.add(new Movie("Breathless", "Romance", 1960, 8.0, "Jean-Paul Belmondo", true, "A car thief falls in love with an American girl in Paris, but their romance is complicated by his past and his desire to escape the law.", 8.1));
	    movieDatabase.add(new Movie("Jules and Jim", "Romance", 1962, 8.1, "Jeanne Moreau", true, "A romantic drama about two friends who fall in love with the same woman in pre-World War I France.", 8.2));
	    movieDatabase.add(new Movie("The Rules of the Game", "Comedy", 1939, 8.1, "Jean Renoir", true, "A witty and sophisticated comedy of manners about the French aristocracy on the eve of World War II.", 8.2));
	    movieDatabase.add(new Movie("The Mirror", "Drama", 1975,7.2, "Margarita Terekhova", true, "A poetic and introspective film about a woman who reflects on her past and her relationships with her family and lovers.", 8.1));
	    movieDatabase.add(new Movie("Stalker", "Science Fiction", 1979, 8.1, "Oleg Strizhenov", true, "A sci-fi thriller about a group of people who venture into a mysterious zone where the laws of physics do not apply.", 8.2));
	    movieDatabase.add(new Movie("Solaris", "Science Fiction", 1972, 8.0, "Oleg Strizhenov", true, "A psychologist is sent to a space station to investigate strange occurrences, only to discover that the station is haunted by a mysterious presence.", 8.1));
	    movieDatabase.add(new Movie("Andrei Rublev", "Biography", 1966, 8.1, "Anatoliy Solonitsyn", true, "A biographical drama about the life of the famous Russian icon painter Andrei Rublev.", 8.2));
	    movieDatabase.add(new Movie("The Seventh Seal", "Fantasy", 1957, 8.1, "Max von Sydow", true, "A knight returns from the Crusades and challenges Death to a game of chess in order to prolong his life.", 8.2));
	    movieDatabase.add(new Movie("Wild Strawberries", "Drama", 1957, 8.0, "Victor Sjöström", true, "An aging professor reflects on his life and relationships while on a road trip to receive an honorary degree.", 8.1));
	    movieDatabase.add(new Movie("The Virgin Spring", "Drama", 1960, 8.0, "Max von Sydow", true, "A medieval drama about a father's quest for revenge after his daughter is brutally murdered.", 8.1));
	    movieDatabase.add(new Movie("Persona", "Drama", 1966, 8.1, "Liv Ullmann", true, "A nurse takes care of a mute actress at a psychiatric hospital, but their relationship becomes increasingly complex and intimate.", 8.2));
	    movieDatabase.add(new Movie("Cries and Whispers", "Drama", 1972, 8.1, "Harriet Andersson", true, "A drama about two sisters who take care of their terminally ill sister at their family's countryside estate.", 8.2));
	    movieDatabase.add(new Movie("Autumn Sonata", "Drama", 1978, 8.0, "Ingrid Bergman", true, "A drama about a mother-daughter relationship and the secrets and lies that can destroy a family.", 8.1));
	    movieDatabase.add(new Movie("Fanny and Alexander", "Drama", 1982, 8.1, "Bertil Guve", true, "A drama about a young boy's experiences with his family and their struggles with love, loss, and identity.", 8.2));
	    movieDatabase.add(new Movie("The Sacrifice", "Drama", 1986, 8.0, "Erland Josephson", true, "A drama about a man who makes a pact with God to save the world from nuclear destruction.", 8.1));
	    movieDatabase.add(new Movie("The Cook, the Thief, His Wife & Her Lover", "Crime", 1989, 7.9, "Richard Bohringer", true, "A crime drama about a gangster who owns a restaurant and his wife who begins an affair with a bookseller.", 8.0));
	    movieDatabase.add(new Movie("The Piano", "Drama", 1993, 8.1, "Holly Hunter", true, "A period drama about a mute woman who is sent to marry a man in New Zealand and finds solace in her piano playing.", 8.2));
	    movieDatabase.add(new Movie("The English Patient", "Romance", 1996, 8.0, "Ralph Fiennes", true, "A romantic drama about a badly burned man who tells the story of his doomed love affair with a married woman in pre-World War II North Africa.", 8.1));
	    movieDatabase.add(new Movie("The Remains of the Day", "Drama", 1993, 8.0, "Anthony Hopkins", true, "A period drama about a butler who reflects on his decades-long career and the choices he made in his life.", 8.1));
	    movieDatabase.add(new Movie("Howards End", "Drama", 1992, 8.0, "Anthony Hopkins", true, "A period drama about two families from different social classes and their complex relationships with each other.", 8.1));
	    movieDatabase.add(new Movie("The Ice Storm", "Drama", 1997, 7.9, "Sigourney Weaver", true, "A drama about two dysfunctional families and their struggles with relationships and identity in the 1970s.", 8.0));
	    movieDatabase.add(new Movie("American Beauty", "Drama", 1999, 8.1, "Kevin Spacey", true, "A drama about a middle-aged man who has a midlife crisis and begins to question the values of his suburban life.", 8.2));
	    movieDatabase.add(new Movie("Mulholland Drive", "Thriller", 2001, 8.0, "Naomi Watts", true, "A surrealist neo-noir about a young actress who becomes embroiled in a complex mystery involving a woman with amnesia.", 8.1));
	    movieDatabase.add(new Movie("Eternal Sunshine of the Spotless Mind", "Romance", 2004, 8.3, "Jim Carrey", true, "A romantic drama about a couple who undergo a procedure to erase their memories of each other after a painful breakup.", 8.4));
	    movieDatabase.add(new Movie("The Prestige", "Drama", 2006, 8.1, "Hugh Jackman", true, "A mystery drama about the rivalry between two magicians who engage in competitive one-upmanship with tragic consequences.", 8.2));
	    movieDatabase.add(new Movie("The Social Network", "Biography", 2010, 8.6, "Jesse Eisenberg", true, "A biographical drama about the founding of Facebook and the legal battles that followed.", 8.7));
	    movieDatabase.add(new Movie("Inception", "Science Fiction", 2010, 8.8, "Leonardo DiCaprio", true, "A sci-fi action film about a thief who specializes in entering people's dreams and stealing their secrets.", 8.9));
	    movieDatabase.add(new Movie("The Tree of Life", "Drama", 2011, 8.1, "Brad Pitt", true, "A philosophical drama about a family's struggles with faith, life, and the universe, told through the perspective of a young boy growing up in the 1950s.", 8.2));
	    movieDatabase.add(new Movie("Birdman", "Comedy", 2014, 7.7, "Michael Keaton", true, "A washed-up superhero actor attempts to revive his career by directing a Broadway play, while battling his inner demons.", 7.8));
	    movieDatabase.add(new Movie("Mad Max: Fury Road", "Action", 2015, 8.1, "Tom Hardy", true, "In a post-apocalyptic wasteland, Max teams up with Furiosa to escape a tyrant and his army.", 8.2));
	    movieDatabase.add(new Movie("La La Land", "Musical", 2016, 8.0, "Ryan Gosling", true, "A jazz musician and an aspiring actress fall in love while pursuing their dreams in Los Angeles.", 8.1));
	    movieDatabase.add(new Movie("Moonlight", "Drama", 2016, 7.4, "Alex R. Hibbert", true, "A young African-American man grapples with his identity and sexuality while growing up in a rough neighborhood of Miami.", 7.5));
	    movieDatabase.add(new Movie("Get Out", "Horror", 2017, 7.7, "Daniel Kaluuya", true, "A young African-American man visits his white girlfriend's family estate, where his simmering uneasiness about their reception of him eventually reaches a boiling point.", 7.8));
	    movieDatabase.add(new Movie("The Shape of Water", "Fantasy", 2017, 8.0, "Sally Hawkins", true, "At a top secret research facility in the 1960s, a lonely janitor forms a unique relationship with an amphibious creature that is being held captive.", 8.1));
	    movieDatabase.add(new Movie("Parasite", "Thriller", 2019, 8.6, "Kang-ho Song", true, "A poor family schemes to become employed by a wealthy family by infiltrating their household.", 8.7));
	    movieDatabase.add(new Movie("1917", "War", 2019, 8.3, "George MacKay", true, "As an infantry battalion assembles to wage war deep in enemy territory, two soldiers are assigned to race against time and deliver a message that will stop 1,600 men from walking straight into a deadly trap.", 8.4));
	    movieDatabase.add(new Movie("Joker", "Drama", 2019, 8.4, "Joaquin Phoenix", true, "In Gotham City, mentally troubled comedian Arthur Fleck is disregarded and mistreated by society, leading him to a spiral of madness and nihilism.", 8.5));
	    movieDatabase.add(new Movie("Once Upon a Time in Hollywood", "Comedy", 2019, 7.6, "Leonardo DiCaprio", true, "A faded television actor and his stunt double strive to achieve fame and success in the film industry during the final years of Hollywood's Golden Age in 1969 Los Angeles.", 7.7));
	    movieDatabase.add(new Movie("Knives Out", "Mystery", 2019, 7.9, "Daniel Craig", true, "A detective investigates the death of a patriarch of an eccentric, combative family after he dies during his 85th birthday celebration.", 8.0));
	    movieDatabase.add(new Movie("Soul", "Animation", 2020, 8.1, "Jamie Foxx", true, "A musician who has lost his passion for music is transported out of his body and must find his way back with the help of an infant soul learning about herself.", 8.2));
	    movieDatabase.add(new Movie("The Trial of the Chicago 7", "Drama", 2020, 7.8, "Eddie Redmayne", true, "The story of the Chicago Seven, a group of anti-Vietnam War protesters charged with conspiracy and inciting to riot in 1968.", 7.9));
	    movieDatabase.add(new Movie("Promising Young Woman", "Thriller", 2020, 7.5, "Carey Mulligan", true, "A young woman, traumatized by a tragic event in her past, seeks out vengeance against those who cross her path.", 7.6));
	    movieDatabase.add(new Movie("Dune", "Sci-Fi", 2021, 8.2, "Timothée Chalamet", true, "A noble family becomes embroiled in a war for control over the galaxy's most valuable asset while its heir becomes troubled by visions of a dark future.", 8.3));
	    // Add more movies...
  }


  @Override
  public String recommendMovie(String genre, int year, double popularity, String favoriteActor, boolean isAbove18) throws RemoteException {
    // Create an object to hold the result
    final ResultWrapper result = new ResultWrapper();

    Thread ClientRecommendThread = new recommendMovieThread(genre, year, popularity, favoriteActor, isAbove18, result);
    ClientRecommendThread.start();

    try {
      // Wait for the background thread to finish
      ClientRecommendThread.join();

      // Return the result from the background thread after it finishes processing
      return result.recommendation;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return "An error occurred while processing the recommendation";
    }

  }



  @Override
  public synchronized String getRandomMovie() throws RemoteException {
    final ResultWrapper result = new ResultWrapper();

    Thread randomMovieThread = new RandomMovieThread(result);
    randomMovieThread.start();

    try {
      // Wait for the background thread to finish
      randomMovieThread.join();

      // Return the result from the background thread after it finishes processing
      return result.recommendation;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return "An error occurred while processing the random movie picker";
    }
  }

  @Override
  public String searchMovie(String query) throws RemoteException {
    final ResultWrapper result = new ResultWrapper();

    Thread ClientSearchThread = new SearchMoviesThread(query, result);
    ClientSearchThread.start();

    try {
      // Wait for the background thread to finish
      ClientSearchThread.join();

      // Return the result from the background thread after it finishes processing
      return result.recommendation;
    } catch (InterruptedException e) {
      e.printStackTrace();
      return "An error occurred while processing the recommendation";
    }

  }

  private class recommendMovieThread extends Thread {
    private String genre;
    private Integer year;
    private Double popularity;
    private String favoriteActor;
    private Boolean isAbove18;
    private ResultWrapper result;

    public recommendMovieThread(String genre, Integer year, Double popularity, String favoriteActor, Boolean isAbove18, ResultWrapper result) {
      this.genre = genre;
      this.year = year;
      this.popularity = popularity;
      this.favoriteActor = favoriteActor;
      this.isAbove18 = isAbove18;
      this.result = result;

    }

    private String handleRecommendation() {
      System.out.println("Handling movie recommendation...");
      String recommendation = movieDatabase.stream()
        .filter(movie -> movie.getGenre().equalsIgnoreCase(this.genre))
        .filter(movie -> movie.getYear() >= this.year)
        .filter(movie -> movie.getPopularity() >= this.popularity)
        .filter(movie -> movie.getActor().toLowerCase().contains(this.favoriteActor.toLowerCase()))
        .filter(movie -> (this.isAbove18==true && (movie.getisAbove18()==true)||(movie.getisAbove18()==false))||(this.isAbove18==false && movie.getisAbove18()==false))
        .map(Movie::toString) // Map to movie name
        .findFirst()
        .orElse("No recommendations match your preferences!");
      this.result.recommendation = recommendation;

      return "ok";}


    @Override
    public void run() {
      System.out.println("Handle recommentation request for client: " + Thread.currentThread().getName());
      handleRecommendation();
      System.out.println("Finished handling request for client: " + Thread.currentThread().getName()+"\n");
    }
  }

  private class SearchMoviesThread extends Thread {
    private String query;

    private ResultWrapper result;

    public SearchMoviesThread(String query, ResultWrapper result) {
      this.query = query;

      this.result = result;

    }

    private synchronized String handleSearch() {
      System.out.println("Handling movie recommendation...");
      List < String > searchList = movieDatabase.stream()
        .filter(movie -> movie.getTitle().toLowerCase().contains(query.toLowerCase()) ||
          movie.getDescription().toLowerCase().contains(query.toLowerCase()))
        .map(Movie::toString) // Mapping the movie to its string representation
        .collect(Collectors.toList()); // Collecting all matching movies into a List<String>
      // If no matches are found, provide a default message
      if (searchList.isEmpty()) {
        this.result.recommendation = "No recommendations match your preferences!";
      } else {
        // Join the list of recommendations into a single string if you want to display them together
        this.result.recommendation = String.join("\n", searchList); // Concatenate list items with new lines
      }
      return this.result.recommendation;
    }

    @Override
    public void run() {
      System.out.println("Handle Search request for client: " + Thread.currentThread().getName());
      handleSearch();
      System.out.println("Finished handling search request for client: " + Thread.currentThread().getName()+"\n");
    }
  }

  private class RandomMovieThread extends Thread {

    private ResultWrapper result;

    public RandomMovieThread(ResultWrapper result) {

      this.result = result;

    }

    private String handleRandomMovie() {
      // Pick a random movie from the filtered list
      Random random = new Random();
      List < Movie > filteredMovies = movieDatabase.stream()
        .collect(Collectors.toList());
      //             .filter(movie -> matchesAgeRestriction(movie, isAbove18)) // Example filter

      if (!filteredMovies.isEmpty()) {
        Movie randomMovie = filteredMovies.get(random.nextInt(filteredMovies.size()));
        this.result.recommendation = " \n" + randomMovie.toString();
      } else {
        this.result.recommendation = "No recommendations available!";
      }
      return this.result.recommendation;

    }

    @Override
    public void run() {
      System.out.println("Handle Random Movie request for client in: " + Thread.currentThread().getName());
      handleRandomMovie();
      System.out.println("Finished handling Random Movie request for client in: " + Thread.currentThread().getName()+"\n");
    }
  }



  // Wrapper class for thread-safe result sharing
  private static class ResultWrapper {
	    String recommendation;
	  }


  // Movie class
  static class Movie {
    private String title;
    private String genre;
    private int year;
    private double popularity;
    private String leadActor;
    private boolean isAbove18;
    private String description;
    private double rating;

    public Movie(String title, String genre, int year, double popularity, String leadActor, boolean isAbove18, String description, double rating) {
      this.title = title;
      this.genre = genre;
      this.year = year;
      this.popularity = popularity;
      this.leadActor = leadActor;
      this.isAbove18 = isAbove18;
      this.description = description;
      this.rating = rating;
    }

    // Add getter methods
    public String getTitle() {
      return title;
    }

    public String getGenre() {
      return genre;
    }

    public int getYear() {
      return year;
    }

    public double getPopularity() {
      return popularity;
    }

    public String getActor() {
      return leadActor;
    }

    public boolean getisAbove18() {
      return isAbove18;
    }

    public String getDescription() {
      return description;
    }

    public double getRating() {
      return rating;
    }

    // Add getters and override toString to include description and rating
    @Override
    public String toString() {
String url="";
      String searchQuery = title + " Movie Trailer";
                try{  String encodedQuery = URLEncoder.encode(searchQuery, StandardCharsets.UTF_8.toString());
                  url = "https://www.youtube.com/results?search_query=" + encodedQuery;
                } catch (Exception e) {
                           e.printStackTrace();
                       }
      return title + " (" + year + ") - Genre: " + genre +
        "\nPopularity: " + popularity +
        "\nRating: " + rating + "/10" +
        "\nDescription: " + description +
        "\nLead Actor: " + leadActor +
        "\nWatch Trailer : " + url +"\n";
    }
  }

}

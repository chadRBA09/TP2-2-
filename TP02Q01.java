import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class TP02Q01 {
    
    // DECLARAÇÃO DOS ATRIBUTOS DA CLASSE

    class Personagem{
        private String id;
        private String name;
        private List<String>alternate_names;
        private String house;
        private String ancestry;
        private String species;
        private String patronus;
        private boolean hogwartsStaff;
        private String actorName;
        private boolean alive;
        private Date dateOfBirth;
        private int yearOfBirth;
        private String eyeColour;
        private String gender;
        private String hairColour;
        private boolean wizard;

        // CONSTRUTORES

        Personagem()
        {
            setId("");
            setName("");
            setAlternate_names(null);
            setHouse("");
            setAncestry("");
            setSpecies("");
            setPatronos("");
            setHogwartsStaff(false);
            setActorName("");
            setAlive(false);
            setDateOfBirth(null);
            setYearOfBirth(0);
            setEyeColour("");
            setGender("");
            setHairColour("");
            setWizard(false);
        }

        public Personagem(String id, String name, List<String> alternate_names, String house,
                  String ancestry, String species, String patronus, boolean hogwartsStaff,
                  String actorName, boolean alive, Date dateOfBirth, int yearOfBirth,
                  String eyeColour, String gender, String hairColour, boolean wizard) 
        {
            setId(id);
            setName(name);
            setAlternate_names(alternate_names);
            setHouse(house);
            setAncestry(ancestry);
            setSpecies(species);
            setPatronos(patronus);
            setHogwartsStaff(hogwartsStaff);
            setActorName(actorName);
            setAlive(alive);
            setDateOfBirth(dateOfBirth);
            setYearOfBirth(yearOfBirth);
            setEyeColour(eyeColour);
            setGender(gender);
            setHairColour(hairColour);
            setWizard(wizard);
        }
        
        // MÉTODOS SET

        public void setId (String id)
        {
            this.id = id;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public void setAlternate_names (List<String>alternate_names)
        {
            this.alternate_names = alternate_names;
            alternate_names = new ArrayList<>();
        }

        public void setHouse (String house)
        {
            this.house = house;
        }

        public void setAncestry (String ancestry)
        {
            this.ancestry = ancestry;
        }

        public void setSpecies (String species)
        {
            this.species = species;
        }

        public void setPatronos (String patronus)
        {
            this.patronus = patronus;
        }

        public void setHogwartsStaff (boolean hogwartsStaff)
        {
            this.hogwartsStaff = hogwartsStaff;
        }

        public void setActorName (String actorName)
        {
            this.actorName = actorName;
        }

        public void setAlive (boolean alive)
        {
            this.alive = alive;
        }

        public void setDateOfBirth (Date dateOfBirth)
        {
            this.dateOfBirth = dateOfBirth;
        }

        public void setYearOfBirth (int yearOfBirth)
        {
            this.yearOfBirth = yearOfBirth;
        }

        public void setEyeColour (String eyeColour)
        {
            this.eyeColour = eyeColour;
        }

        public void setGender (String gender)
        {
            this.gender = gender;
        }

        public void setHairColour (String hairColour)
        {
            this.hairColour = hairColour;
        }

        public void setWizard (boolean wizard)
        {
            this.wizard = wizard;
        }

        // MÉTODOS GET

        public String getId() 
        {
            return this.id;
        }
        
        public String getName() 
        {
            return this.name;
        }
        
        public List<String> getAlternate_names() 
        {
            return this.alternate_names;
        }
        
        public String getHouse() 
        {
            return this.house;
        }
        
        public String getAncestry() 
        {
            return this.ancestry;
        }
        
        public String getSpecies() 
        {
            return this.species;
        }
        
        public String getPatronus() 
        {
            return this.patronus;
        }
        
        public boolean isHogwartsStaff() 
        {
            return this.hogwartsStaff;
        }
        
        public String getActorName() 
        {
            return this.actorName;
        }
        
        public boolean isAlive() 
        {
            return this.alive;
        }
        
        public Date getDateOfBirth() 
        {
            return this.dateOfBirth;
        }
        
        public int getYearOfBirth() 
        {
            return this.yearOfBirth;
        }
        
        public String getEyeColour() 
        {
            return this.eyeColour;
        }
        
        public String getGender() 
        {
            return this.gender;
        }
        
        public String getHairColour() 
        {
            return this.hairColour;
        }
        
        public boolean isWizard() 
        {
            return this.wizard;
        }
        
        public void Imprimir ()

    }
    public static void main(String[] args) {
        
    } 
}

package scooterise.rpg.story;

public class Choice extends StoryItem{
    public String question;
    public Choice(String Question,ChoiceItem... choiceItems){
         this.setInternalName("Choice");
         this.question = Question;

    }
    public class ChoiceItem {
        private String choice;
        public ChoiceItem(String choice,StoryItem procedingitem){
            setProcedingStoryItem(procedingitem);
        }
        String getChoice(){
            return choice;
        }
    }
}
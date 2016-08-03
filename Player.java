import javax.sound.midi.*;


public class Player {
	public void play(){
		try{
			Sequencer player1 = MidiSystem.getSequencer();
			player1.open();
			System.out.println("play!");
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a,1);
			track.add(noteOn);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 16);
			track.add(noteOff);
			
			player1.setSequence(seq);
			player1.start();
			
			
			
			
		}
		catch(Exception ex){
			ex.printStackTrace();
			
		}
		
	}
	
	public static void main(String[] args){
		
		Player p1 = new Player();
		p1.play();
		
	}
	

}

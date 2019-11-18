import java.util.Iterator;
public class AlbumIterator implements Iterator<Song> {
	private Song[] song;
	private int position = 0;
	
	public AlbumIterator (Song[] songs) {
		this.song = songs;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(song[position] == null || position >= song.length )
		
		return false;
		return true;
	}

	@Override
	public Song next() {
		// TODO Auto-generated method stub
		Song sg = song[position];
		++position;
		return sg;
	}

}

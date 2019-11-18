
public class Album {
private Song[] songs;
private int count;
private String name;
public static final int MAX_SONGS = 20;
public Song[] getSongs() {
	return songs;
}
public void setSongs(Song[] songs) {
	this.songs = songs;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Album(String name) {
	this.name  = name;
}
public void addSong(String name, String artist, double length, String genre) {
	if(songs == null) {
		songs = new Song[MAX_SONGS];
		songs[0] = new Song(name,artist,length,genre);
		++count;
	}
	songs[count] = new Song(name,artist,length,genre);
	++count;
}

public AlbumIterator createIterator() {
	return new AlbumIterator(songs);
}


}

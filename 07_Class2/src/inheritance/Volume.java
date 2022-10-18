package inheritance;

public class Volume {

	//멤버변수
	private int vol = 1;
	
	//멤버메서드
	public int getVol() {				//출력
		return vol;
	}

	public void setVol(int vol) {		//초기값 설정
		this.vol = vol;
	}
	
	void VolumeUp() {
		
		vol++;
		
		if(vol > 15) {
			vol = 15;
		}
	}
	void VolumeDown() {
		
		vol--;
		
		if(vol < 1) {
			vol = 1;
		}
	}
	
}

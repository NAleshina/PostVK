package domain.attachment;

public class PreviewAudioMassage {
    private int duration;
    private Waveform waveforms;
    private String linkOgg;
    private String linkMp3;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLinkOgg() {
        return linkOgg;
    }

    public void setLinkOgg(String linkOgg) {
        this.linkOgg = linkOgg;
    }

    public String getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(String linkMp3) {
        this.linkMp3 = linkMp3;
    }

    public Waveform getWaveforms() {
        return waveforms;
    }

    public void setWaveforms(Waveform waveforms) {
        this.waveforms = waveforms;
    }
}

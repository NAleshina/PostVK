package domain.attachment;

public class Preview {
    private PreviewPhoto previewPhoto;
    private PreviewGraffiti previewGraffiti;
    private PreviewAudioMassage previewAudioMassage;

    public PreviewPhoto getPreviewPhoto() {
        return previewPhoto;
    }

    public void setPreviewPhoto(PreviewPhoto previewPhoto) {
        this.previewPhoto = previewPhoto;
    }

    public PreviewGraffiti getPreviewGraffiti() {
        return previewGraffiti;
    }

    public void setPreviewGraffiti(PreviewGraffiti previewGraffiti) {
        this.previewGraffiti = previewGraffiti;
    }

    public PreviewAudioMassage getPreviewAudioMassage() {
        return previewAudioMassage;
    }

    public void setPreviewAudioMassage(PreviewAudioMassage previewAudioMassage) {
        this.previewAudioMassage = previewAudioMassage;
    }
}

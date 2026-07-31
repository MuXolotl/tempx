package androidx.car.app.media;

import android.util.Log;
import androidx.car.app.subs;
import defpackage.AbstractC12994l;
import defpackage.InterfaceC12208l;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class ProjectedCarAudioRecord extends AbstractC12994l {
    private InputStream mInputStream;

    public ProjectedCarAudioRecord(subs subsVar) {
        super(subsVar);
    }

    @Override // defpackage.AbstractC12994l
    public int readInternal(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.mInputStream;
        if (inputStream == null) {
            return -1;
        }
        try {
            return inputStream.read(bArr, i, i2);
        } catch (IOException unused) {
            stopRecording();
            return -1;
        }
    }

    @Override // defpackage.AbstractC12994l
    public void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse) {
        this.mInputStream = openMicrophoneResponse.getCarMicrophoneInputStream();
    }

    @Override // defpackage.AbstractC12994l
    public void stopRecordingInternal() {
        try {
            InputStream inputStream = this.mInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.mInputStream = null;
            }
        } catch (IOException e) {
            Log.e("CarApp", "Exception closing microphone pipe", e);
        }
    }
}

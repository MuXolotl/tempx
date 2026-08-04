package defpackage;

import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.loadAd;
import androidx.car.app.media.OpenMicrophoneRequest;
import androidx.car.app.media.OpenMicrophoneResponse;
import androidx.car.app.subs;
import androidx.car.app.utils.billing;
import j$.util.Objects;

/* JADX INFO: renamed from: lّۦْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC12994l {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final subs mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public AbstractC12994l(subs subsVar) {
        this.mCarContext = subsVar;
    }

    public static AbstractC12994l create(subs subsVar) {
        Objects.requireNonNull(subsVar);
        try {
            return (AbstractC12994l) Class.forName(subsVar.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? "androidx.car.app.media.AutomotiveCarAudioRecord" : "androidx.car.app.media.ProjectedCarAudioRecord").getConstructor(subs.class).newInstance(subsVar);
        } catch (ReflectiveOperationException unused) {
            C8339l.smaato("CarAudioRecord not configured. Did you forget to add a dependency on app-automotive or app-projected artifacts?");
            return null;
        }
    }

    public static /* synthetic */ void yandex(AbstractC12994l abstractC12994l) {
        synchronized (abstractC12994l.mRecordingStateLock) {
            abstractC12994l.mRecordingState = 2;
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 == 0) {
                throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
            }
            if (i3 != 2) {
                return readInternal(bArr, i, i2);
            }
            return -1;
        }
    }

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        OpenMicrophoneResponse openMicrophoneResponse;
        synchronized (this.mRecordingStateLock) {
            try {
                if (this.mRecordingState != 0) {
                    throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
                }
                loadAd loadad = (loadAd) this.mCarContext.loadAd(loadAd.class);
                OpenMicrophoneRequest openMicrophoneRequest = new OpenMicrophoneRequest(new C0459l(new C2683l(8, this)));
                loadad.getClass();
                try {
                    openMicrophoneResponse = (OpenMicrophoneResponse) billing.purchase("openMicrophone", new C0615l(loadad.crashlytics, "app", "openMicrophone", new C2683l(3, openMicrophoneRequest)));
                } catch (RemoteException e) {
                    Log.e("CarApp", "Error getting microphone bytes from host", e);
                    openMicrophoneResponse = null;
                }
                this.mOpenMicrophoneResponse = openMicrophoneResponse;
                if (openMicrophoneResponse == null) {
                    Log.e("CarApp", "Did not get microphone input from host");
                    this.mOpenMicrophoneResponse = new OpenMicrophoneResponse(new C7739l(new C18353l(20)));
                }
                startRecordingInternal(this.mOpenMicrophoneResponse);
                this.mRecordingState = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void startRecordingInternal(OpenMicrophoneResponse openMicrophoneResponse);

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            try {
                OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
                if (openMicrophoneResponse != null) {
                    if (this.mRecordingState != 2) {
                        openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                    }
                    this.mOpenMicrophoneResponse = null;
                }
                stopRecordingInternal();
                this.mRecordingState = 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void stopRecordingInternal();
}

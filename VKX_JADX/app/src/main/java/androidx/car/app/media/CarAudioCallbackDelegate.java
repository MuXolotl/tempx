package androidx.car.app.media;

import android.annotation.SuppressLint;
import android.os.RemoteException;
import defpackage.C11467l;
import defpackage.InterfaceC11527l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public class CarAudioCallbackDelegate {
    private final ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(InterfaceC11527l interfaceC11527l) {
        this.mCallback = new CarAudioCallbackStub(interfaceC11527l);
    }

    @SuppressLint({"ExecutorRegistration"})
    public static CarAudioCallbackDelegate create(InterfaceC11527l interfaceC11527l) {
        return new CarAudioCallbackDelegate(interfaceC11527l);
    }

    public void onStopRecording() {
        try {
            ICarAudioCallback iCarAudioCallback = this.mCallback;
            Objects.requireNonNull(iCarAudioCallback);
            iCarAudioCallback.onStopRecording();
        } catch (RemoteException e) {
            C11467l.metrica(e);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
    @InterfaceC12208l
    public static class CarAudioCallbackStub extends ICarAudioCallback.Stub {
        private final InterfaceC11527l mCarAudioCallback;

        public CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            InterfaceC11527l interfaceC11527l = this.mCarAudioCallback;
            Objects.requireNonNull(interfaceC11527l);
            interfaceC11527l.onStopRecording();
        }

        public CarAudioCallbackStub(InterfaceC11527l interfaceC11527l) {
            this.mCarAudioCallback = interfaceC11527l;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}

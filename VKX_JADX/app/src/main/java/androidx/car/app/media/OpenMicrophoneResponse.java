package androidx.car.app.media;

import android.os.ParcelFileDescriptor;
import defpackage.C11983l;
import defpackage.C7739l;
import defpackage.InterfaceC12208l;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC12208l
public final class OpenMicrophoneResponse {
    private final CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final ParcelFileDescriptor mCarMicrophoneDescriptor;

    public OpenMicrophoneResponse(C7739l c7739l) {
        this.mCarAudioCallbackDelegate = c7739l.yandex;
        this.mCarMicrophoneDescriptor = null;
    }

    public CarAudioCallbackDelegate getCarAudioCallback() {
        CarAudioCallbackDelegate carAudioCallbackDelegate = this.mCarAudioCallbackDelegate;
        Objects.requireNonNull(carAudioCallbackDelegate);
        return carAudioCallbackDelegate;
    }

    public InputStream getCarMicrophoneInputStream() {
        ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (IOException e) {
                C11983l.ads(e);
                return null;
            }
        }
        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}

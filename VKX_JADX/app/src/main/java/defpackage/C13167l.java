package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: lؘْٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13167l extends C9115l {
    public C13167l(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f18721l.mark(Alert.DURATION_SHOW_INDEFINITELY);
        } else {
            C8339l.metrica("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void billing(long j) throws IOException {
        int i = this.f18720l;
        if (i > j) {
            this.f18720l = 0;
            this.f18721l.reset();
        } else {
            j -= (long) i;
        }
        yandex((int) j);
    }

    public C13167l(byte[] bArr) {
        super(bArr);
        this.f18721l.mark(Alert.DURATION_SHOW_INDEFINITELY);
    }
}

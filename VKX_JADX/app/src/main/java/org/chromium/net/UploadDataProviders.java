package org.chromium.net;

import android.os.ParcelFileDescriptor;
import defpackage.C14032l;
import defpackage.C16543l;
import defpackage.C18675l;
import defpackage.C1871l;
import java.io.File;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(byte[] bArr) {
        return new C1871l(ByteBuffer.wrap(bArr, 0, bArr.length).slice());
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C14032l(new C16543l(29, parcelFileDescriptor));
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C1871l(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C1871l(ByteBuffer.wrap(bArr, i, i2).slice());
    }

    public static UploadDataProvider create(File file) {
        return new C14032l(new C18675l(file));
    }
}

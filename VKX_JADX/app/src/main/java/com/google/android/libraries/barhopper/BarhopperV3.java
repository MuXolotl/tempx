package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import android.util.Log;
import defpackage.AbstractC15560l;
import defpackage.C1302l;
import defpackage.C13503l;
import defpackage.C13940l;
import defpackage.C14545l;
import defpackage.C18073l;
import defpackage.C18299l;
import defpackage.C4875l;
import defpackage.C8339l;
import defpackage.C9747l;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public class BarhopperV3 implements Closeable {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public long f589l;

    public static C13503l adcel(byte[] bArr) {
        bArr.getClass();
        try {
            C14545l c14545l = C14545l.loadAd;
            C13940l c13940l = C13940l.crashlytics;
            return C13503l.vip(bArr, C14545l.loadAd);
        } catch (C18299l e) {
            C4875l.remoteconfig("Received unexpected BarhopperResponse buffer: {0}", e);
            return null;
        }
    }

    private native void closeNative(long j);

    private native long createNativeWithClientOptions(byte[] bArr);

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    public final C13503l billing(int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions) {
        long j = this.f589l;
        if (j != 0) {
            return adcel(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        C8339l.smaato("Native pointer does not exist.");
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.f589l;
        if (j != 0) {
            closeNative(j);
            this.f589l = 0L;
        }
    }

    public final C13503l mopub(int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions) {
        long j = this.f589l;
        if (j != 0) {
            return adcel(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        C8339l.smaato("Native pointer does not exist.");
        return null;
    }

    public final C13503l vip(Bitmap bitmap, RecognitionOptions recognitionOptions) {
        if (this.f589l == 0) {
            C8339l.smaato("Native pointer does not exist.");
            return null;
        }
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config != config2) {
            Log.d("BarhopperV3", "Input bitmap config is not ARGB_8888. Converting it to ARGB_8888 from ".concat(String.valueOf(bitmap.getConfig())));
            bitmap = bitmap.copy(config2, bitmap.isMutable());
        }
        return adcel(recognizeBitmapNative(this.f589l, bitmap, recognitionOptions));
    }

    public final void yandex(C1302l c1302l) {
        if (this.f589l != 0) {
            Log.w("BarhopperV3", "Native pointer already exists.");
            return;
        }
        try {
            int iCrashlytics = c1302l.crashlytics();
            byte[] bArr = new byte[iCrashlytics];
            C9747l c9747l = new C9747l(bArr, iCrashlytics);
            c1302l.smaato(c9747l);
            if (iCrashlytics - c9747l.amazon != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            long jCreateNativeWithClientOptions = createNativeWithClientOptions(bArr);
            this.f589l = jCreateNativeWithClientOptions;
            if (jCreateNativeWithClientOptions != 0) {
                return;
            }
            C8339l.metrica("Failed to create native pointer with client options.");
        } catch (IOException e) {
            C18073l.Signature(AbstractC15560l.Signature("Serializing ", C1302l.class.getName(), " to a byte array threw an IOException (should never happen)."), e);
        }
    }
}

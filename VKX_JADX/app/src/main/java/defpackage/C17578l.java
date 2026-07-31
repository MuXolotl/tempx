package defpackage;

import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٗۨۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17578l implements InterfaceC2002l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public static final ArrayDeque f34207l = new ArrayDeque();

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public static final Object f34208l = new Object();

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public HandlerC8616l f34209l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final HandlerThread f34210l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final MediaCodec f34211l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C5811l f34212l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final AtomicReference f34213l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f34214l;

    public C17578l(MediaCodec mediaCodec, HandlerThread handlerThread) {
        C5811l c5811l = new C5811l();
        this.f34211l = mediaCodec;
        this.f34210l = handlerThread;
        this.f34212l = c5811l;
        this.f34213l = new AtomicReference();
    }

    public static void amazon(C1229l c1229l) {
        ArrayDeque arrayDeque = f34207l;
        synchronized (arrayDeque) {
            arrayDeque.add(c1229l);
        }
    }

    public static C1229l crashlytics() {
        ArrayDeque arrayDeque = f34207l;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new C1229l();
                }
                return (C1229l) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC2002l
    public final void flush() {
        if (this.f34214l) {
            try {
                HandlerC8616l handlerC8616l = this.f34209l;
                handlerC8616l.getClass();
                handlerC8616l.removeCallbacksAndMessages(null);
                C5811l c5811l = this.f34212l;
                synchronized (c5811l) {
                    c5811l.loadAd = false;
                }
                HandlerC8616l handlerC8616l2 = this.f34209l;
                handlerC8616l2.getClass();
                handlerC8616l2.obtainMessage(3).sendToTarget();
                c5811l.yandex();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                C11983l.ads(e);
            }
        }
    }

    @Override // defpackage.InterfaceC2002l
    public final void loadAd(int i, C4276l c4276l, long j, int i2) {
        smaato();
        C1229l c1229lCrashlytics = crashlytics();
        c1229lCrashlytics.yandex = i;
        c1229lCrashlytics.loadAd = 0;
        c1229lCrashlytics.amazon = j;
        c1229lCrashlytics.purchase = i2;
        MediaCodec.CryptoInfo cryptoInfo = c1229lCrashlytics.crashlytics;
        cryptoInfo.numSubSamples = c4276l.billing;
        int[] iArr = c4276l.amazon;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = c4276l.purchase;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = c4276l.loadAd;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = c4276l.yandex;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = c4276l.crashlytics;
        if (Build.VERSION.SDK_INT >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(c4276l.mopub, c4276l.admob));
        }
        HandlerC8616l handlerC8616l = this.f34209l;
        String str = AbstractC15323l.yandex;
        handlerC8616l.obtainMessage(2, c1229lCrashlytics).sendToTarget();
    }

    @Override // defpackage.InterfaceC2002l
    public final void purchase(int i, int i2, int i3, long j) {
        smaato();
        C1229l c1229lCrashlytics = crashlytics();
        c1229lCrashlytics.yandex = i;
        c1229lCrashlytics.loadAd = i2;
        c1229lCrashlytics.amazon = j;
        c1229lCrashlytics.purchase = i3;
        HandlerC8616l handlerC8616l = this.f34209l;
        String str = AbstractC15323l.yandex;
        handlerC8616l.obtainMessage(1, c1229lCrashlytics).sendToTarget();
    }

    @Override // defpackage.InterfaceC2002l
    public final void shutdown() {
        if (this.f34214l) {
            flush();
            this.f34210l.quit();
        }
        this.f34214l = false;
    }

    @Override // defpackage.InterfaceC2002l
    public final void smaato() {
        RuntimeException runtimeException = (RuntimeException) this.f34213l.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.InterfaceC2002l
    public final void start() {
        if (this.f34214l) {
            return;
        }
        HandlerThread handlerThread = this.f34210l;
        handlerThread.start();
        this.f34209l = new HandlerC8616l(this, handlerThread.getLooper(), 0);
        this.f34214l = true;
    }

    @Override // defpackage.InterfaceC2002l
    public final void yandex(Bundle bundle) {
        smaato();
        HandlerC8616l handlerC8616l = this.f34209l;
        String str = AbstractC15323l.yandex;
        handlerC8616l.obtainMessage(4, bundle).sendToTarget();
    }
}

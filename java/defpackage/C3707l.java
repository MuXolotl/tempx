package defpackage;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: lؕۡۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C3707l implements InterfaceC18043l {
    public final /* synthetic */ C2006l admob;
    public float[] amazon;
    public double billing;
    public float[] crashlytics;
    public float[] loadAd;
    public double mopub;
    public double purchase;
    public final float[] yandex;

    public C3707l(C2006l c2006l) {
        this.admob = c2006l;
        int i = c2006l.admob;
        this.yandex = new float[i];
        int i2 = i * c2006l.loadAd;
        this.loadAd = new float[i2];
        this.crashlytics = new float[i2];
        this.amazon = new float[i2];
    }

    @Override // defpackage.InterfaceC18043l
    public final int adcel(int i, int i2) {
        return subscription(0, i, i2, this.yandex);
    }

    @Override // defpackage.InterfaceC18043l
    public final Object admob() {
        return this.loadAd;
    }

    public final float[] ads(int i, int i2, float[] fArr) {
        int length = fArr.length;
        int i3 = this.admob.loadAd;
        int i4 = length / i3;
        return i + i2 <= i4 ? fArr : Arrays.copyOf(fArr, (((i4 * 3) / 2) + i2) * i3);
    }

    @Override // defpackage.InterfaceC18043l
    public final void amazon(int i, int i2) {
        for (int i3 = 0; i3 < this.admob.loadAd * i2; i3++) {
            this.loadAd[i + i3] = 0.0f;
        }
    }

    @Override // defpackage.InterfaceC18043l
    public final int billing(int i, int i2, int i3) {
        return subscription(i, i2, i3, this.loadAd);
    }

    @Override // defpackage.InterfaceC18043l
    public final void crashlytics(int i, long j, long j2) {
        int i2 = 0;
        while (true) {
            C2006l c2006l = this.admob;
            int i3 = c2006l.loadAd;
            if (i2 >= i3) {
                return;
            }
            float[] fArr = this.crashlytics;
            int i4 = (c2006l.firebase * i3) + i2;
            float[] fArr2 = this.amazon;
            int i5 = (i * i3) + i2;
            float f = fArr2[i5];
            float f2 = fArr2[i5 + i3];
            long j3 = ((long) c2006l.vip) * j;
            int i6 = c2006l.remoteconfig;
            long j4 = ((long) (i6 + 1)) * j2;
            long j5 = j4 - j3;
            long j6 = j4 - (((long) i6) * j2);
            fArr[i4] = (((j6 - j5) * f2) + (j5 * f)) / j6;
            i2++;
        }
    }

    @Override // defpackage.InterfaceC18043l
    public final boolean firebase() {
        double d = this.purchase;
        return d != 0.0d && this.admob.startapp != 0 && this.billing <= d * 3.0d && d * 2.0d > this.mopub * 3.0d;
    }

    @Override // defpackage.InterfaceC18043l
    public final void flush() {
        this.mopub = 0.0d;
        this.purchase = 0.0d;
        this.billing = 0.0d;
    }

    @Override // defpackage.InterfaceC18043l
    public final void isPro(int i) {
        this.crashlytics = ads(this.admob.firebase, i, this.crashlytics);
    }

    @Override // defpackage.InterfaceC18043l
    public final void loadAd(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.crashlytics;
        int i2 = this.admob.loadAd;
        floatBufferAsFloatBuffer.put(fArr, 0, i * i2);
        byteBuffer.position((i * 4 * i2) + byteBuffer.position());
    }

    @Override // defpackage.InterfaceC18043l
    public final int metrica() {
        return 4;
    }

    @Override // defpackage.InterfaceC18043l
    public final void mopub() {
        this.mopub = this.purchase;
    }

    @Override // defpackage.InterfaceC18043l
    public final void purchase(int i, int i2) {
        C2006l c2006l = this.admob;
        int i3 = c2006l.admob / i2;
        int i4 = c2006l.loadAd;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            double d = 0.0d;
            for (int i8 = 0; i8 < i5; i8++) {
                d += (double) this.loadAd[(i7 * i5) + i6 + i8];
            }
            this.yandex[i7] = (float) (d / ((double) i5));
        }
    }

    @Override // defpackage.InterfaceC18043l
    public final void remoteconfig(int i, int i2, int i3, int i4, int i5) {
        float[] fArr = this.crashlytics;
        float[] fArr2 = this.loadAd;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                fArr[i7] = ((fArr2[i8] * i10) + (fArr2[i9] * (i - i10))) / i;
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    @Override // defpackage.InterfaceC18043l
    public final Object smaato() {
        return this.amazon;
    }

    @Override // defpackage.InterfaceC18043l
    public final void startapp(int i) {
        this.loadAd = ads(this.admob.isPro, i, this.loadAd);
    }

    @Override // defpackage.InterfaceC18043l
    public final Object subs() {
        return this.crashlytics;
    }

    public final int subscription(int i, int i2, int i3, float[] fArr) {
        int i4 = this.admob.loadAd * i;
        double d = 1.0d;
        int i5 = 0;
        double d2 = 0.0d;
        int i6 = 255;
        int i7 = i2;
        while (i7 <= i3) {
            double dAbs = 0.0d;
            for (int i8 = 0; i8 < i7; i8++) {
                dAbs += (double) Math.abs(fArr[i4 + i8] - fArr[(i4 + i7) + i8]);
            }
            int i9 = i4;
            double d3 = i7;
            if (((double) i5) * dAbs < d * d3) {
                i5 = i7;
                d = dAbs;
            }
            if (((double) i6) * dAbs > d3 * d2) {
                i6 = i7;
                d2 = dAbs;
            }
            i7++;
            i4 = i9;
        }
        this.purchase = d / ((double) i5);
        this.billing = d2 / ((double) i6);
        return i5;
    }

    @Override // defpackage.InterfaceC18043l
    public final void vip(int i) {
        this.amazon = ads(this.admob.smaato, i, this.amazon);
    }

    @Override // defpackage.InterfaceC18043l
    public final void yandex(int i, ByteBuffer byteBuffer) {
        FloatBuffer floatBufferAsFloatBuffer = byteBuffer.asFloatBuffer();
        float[] fArr = this.loadAd;
        C2006l c2006l = this.admob;
        floatBufferAsFloatBuffer.get(fArr, c2006l.isPro * c2006l.loadAd, i / 4);
        byteBuffer.position(byteBuffer.position() + i);
    }
}

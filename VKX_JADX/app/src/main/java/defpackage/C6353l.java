package defpackage;

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: lٌؙۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6353l implements InterfaceC15103l {
    public C6696l admob;
    public float amazon;
    public C6696l billing;
    public float crashlytics;
    public ByteBuffer firebase;
    public C2006l isPro;
    public int loadAd;
    public boolean metrica;
    public C6696l mopub;
    public C6696l purchase;
    public long remoteconfig;
    public ByteBuffer smaato;
    public boolean subs;
    public long vip;

    @Override // defpackage.InterfaceC15103l
    public final boolean admob() {
        if (this.metrica) {
            C2006l c2006l = this.isPro;
            if (c2006l != null) {
                AbstractC12442l.subscription(c2006l.firebase >= 0);
                if (c2006l.subs.metrica() * c2006l.firebase * c2006l.loadAd == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.InterfaceC15103l
    public final void firebase(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            C2006l c2006l = this.isPro;
            c2006l.getClass();
            this.remoteconfig += (long) byteBuffer.remaining();
            int iRemaining = byteBuffer.remaining();
            int i = c2006l.loadAd;
            InterfaceC18043l interfaceC18043l = c2006l.subs;
            int iMetrica = iRemaining / (interfaceC18043l.metrica() * i);
            interfaceC18043l.startapp(iMetrica);
            interfaceC18043l.yandex(iRemaining, byteBuffer);
            c2006l.isPro += iMetrica;
            c2006l.loadAd();
        }
    }

    @Override // defpackage.InterfaceC15103l
    public final void isPro(C4388l c4388l) {
        if (mopub()) {
            C6696l c6696l = this.purchase;
            this.mopub = c6696l;
            C6696l c6696l2 = this.billing;
            this.admob = c6696l2;
            if (this.subs) {
                this.isPro = new C2006l(c6696l.yandex, c6696l.loadAd, this.crashlytics, this.amazon, c6696l2.yandex, c6696l.crashlytics == 4);
            } else {
                C2006l c2006l = this.isPro;
                if (c2006l != null) {
                    c2006l.isPro = 0;
                    c2006l.firebase = 0;
                    c2006l.smaato = 0;
                    c2006l.remoteconfig = 0;
                    c2006l.vip = 0;
                    c2006l.metrica = 0;
                    c2006l.startapp = 0;
                    c2006l.adcel = 0.0d;
                    c2006l.subs.flush();
                }
            }
        }
        this.smaato = InterfaceC15103l.yandex;
        this.remoteconfig = 0L;
        this.vip = 0L;
        this.metrica = false;
    }

    @Override // defpackage.InterfaceC15103l
    public final boolean mopub() {
        if (this.billing.yandex != -1) {
            return Math.abs(this.crashlytics - 1.0f) >= 1.0E-4f || Math.abs(this.amazon - 1.0f) >= 1.0E-4f || this.billing.yandex != this.purchase.yandex;
        }
        return false;
    }

    @Override // defpackage.InterfaceC15103l
    public final void remoteconfig() {
        C2006l c2006l = this.isPro;
        if (c2006l != null) {
            int i = c2006l.isPro;
            float f = c2006l.crashlytics;
            float f2 = c2006l.amazon;
            double d = f / f2;
            double d2 = c2006l.purchase * f2;
            int i2 = c2006l.metrica;
            int i3 = c2006l.firebase + ((int) ((((((((double) (i - i2)) / d) + ((double) i2)) + c2006l.adcel) + ((double) c2006l.smaato)) / d2) + 0.5d));
            c2006l.adcel = 0.0d;
            InterfaceC18043l interfaceC18043l = c2006l.subs;
            int i4 = c2006l.admob * 2;
            interfaceC18043l.startapp(i4 + i);
            interfaceC18043l.amazon(i * c2006l.loadAd, i4);
            c2006l.isPro = i4 + c2006l.isPro;
            c2006l.loadAd();
            if (c2006l.firebase > i3) {
                c2006l.firebase = Math.max(i3, 0);
            }
            c2006l.isPro = 0;
            c2006l.metrica = 0;
            c2006l.smaato = 0;
        }
        this.metrica = true;
    }

    @Override // defpackage.InterfaceC15103l
    public final void reset() {
        this.crashlytics = 1.0f;
        this.amazon = 1.0f;
        C6696l c6696l = C6696l.purchase;
        this.purchase = c6696l;
        this.billing = c6696l;
        this.mopub = c6696l;
        this.admob = c6696l;
        ByteBuffer byteBuffer = InterfaceC15103l.yandex;
        this.firebase = byteBuffer;
        this.smaato = byteBuffer;
        this.loadAd = -1;
        this.subs = false;
        this.isPro = null;
        this.remoteconfig = 0L;
        this.vip = 0L;
        this.metrica = false;
    }

    @Override // defpackage.InterfaceC15103l
    public final C6696l smaato(C6696l c6696l) throws C16758l {
        int i = c6696l.crashlytics;
        if (i != 2 && i != 4) {
            throw new C16758l(c6696l);
        }
        int i2 = this.loadAd;
        if (i2 == -1) {
            i2 = c6696l.yandex;
        }
        this.purchase = c6696l;
        C6696l c6696l2 = new C6696l(i2, c6696l.loadAd, i);
        this.billing = c6696l2;
        this.subs = true;
        return c6696l2;
    }

    @Override // defpackage.InterfaceC15103l
    public final ByteBuffer subs() {
        C2006l c2006l = this.isPro;
        if (c2006l != null) {
            InterfaceC18043l interfaceC18043l = c2006l.subs;
            int i = c2006l.loadAd;
            AbstractC12442l.subscription(c2006l.firebase >= 0);
            int iMetrica = interfaceC18043l.metrica() * c2006l.firebase * i;
            if (iMetrica > 0) {
                if (this.firebase.capacity() < iMetrica) {
                    this.firebase = ByteBuffer.allocateDirect(iMetrica).order(ByteOrder.nativeOrder());
                } else {
                    this.firebase.clear();
                }
                ByteBuffer byteBuffer = this.firebase;
                AbstractC12442l.subscription(c2006l.firebase >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (interfaceC18043l.metrica() * i), c2006l.firebase);
                interfaceC18043l.loadAd(iMin, byteBuffer);
                c2006l.firebase -= iMin;
                System.arraycopy(interfaceC18043l.subs(), iMin * i, interfaceC18043l.subs(), 0, c2006l.firebase * i);
                this.firebase.flip();
                this.vip += (long) iMetrica;
                this.smaato = this.firebase;
            }
        }
        ByteBuffer byteBuffer2 = this.smaato;
        this.smaato = InterfaceC15103l.yandex;
        return byteBuffer2;
    }

    @Override // defpackage.InterfaceC15103l
    public final long vip(long j) {
        if (this.vip < 1024) {
            return (long) (j / ((double) this.crashlytics));
        }
        long j2 = this.remoteconfig;
        C2006l c2006l = this.isPro;
        c2006l.getClass();
        long jMetrica = j2 - ((long) (c2006l.subs.metrica() * (c2006l.isPro * c2006l.loadAd)));
        int i = this.admob.yandex;
        int i2 = this.mopub.yandex;
        long j3 = this.vip;
        return i == i2 ? AbstractC15323l.m3970import(j, j3, jMetrica, RoundingMode.DOWN) : AbstractC15323l.m3970import(j, j3 * ((long) i2), jMetrica * ((long) i), RoundingMode.DOWN);
    }
}

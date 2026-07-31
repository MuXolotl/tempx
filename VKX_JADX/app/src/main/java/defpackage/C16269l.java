package defpackage;

/* JADX INFO: renamed from: lٌٖؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16269l {
    public final int amazon;
    public C14124l crashlytics;
    public final InterfaceC4034l loadAd;
    public final C9071l yandex;

    public C16269l(InterfaceC12101l interfaceC12101l, InterfaceC4034l interfaceC4034l, long j, long j2, long j3, long j4, long j5, int i) {
        this.loadAd = interfaceC4034l;
        this.amazon = i;
        this.yandex = new C9071l(interfaceC12101l, j, j2, j3, j4, j5);
    }

    public static int crashlytics(InterfaceC10430l interfaceC10430l, long j, C1014l c1014l) {
        if (j == interfaceC10430l.getPosition()) {
            return 0;
        }
        c1014l.f2761l = j;
        return 1;
    }

    public static int yandex(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void amazon(long j) {
        C14124l c14124l = this.crashlytics;
        if (c14124l == null || c14124l.yandex != j) {
            C9071l c9071l = this.yandex;
            this.crashlytics = new C14124l(j, c9071l.yandex.applovin(j), c9071l.crashlytics, c9071l.amazon, c9071l.purchase, c9071l.billing);
        }
    }

    public final int loadAd(InterfaceC10430l interfaceC10430l, C1014l c1014l) {
        while (true) {
            C14124l c14124l = this.crashlytics;
            c14124l.getClass();
            long j = c14124l.billing;
            long j2 = c14124l.mopub;
            long j3 = c14124l.admob;
            long j4 = j2 - j;
            long j5 = this.amazon;
            InterfaceC4034l interfaceC4034l = this.loadAd;
            if (j4 <= j5) {
                this.crashlytics = null;
                interfaceC4034l.crashlytics();
                return crashlytics(interfaceC10430l, j, c1014l);
            }
            long position = j3 - interfaceC10430l.getPosition();
            if (position < 0 || position > 262144) {
                return crashlytics(interfaceC10430l, j3, c1014l);
            }
            interfaceC10430l.remoteconfig((int) position);
            interfaceC10430l.smaato();
            C0386l c0386lYandex = interfaceC4034l.yandex(interfaceC10430l, c14124l.loadAd);
            int i = c0386lYandex.amazon;
            long j6 = c0386lYandex.loadAd;
            long j7 = c0386lYandex.crashlytics;
            if (i == -3) {
                this.crashlytics = null;
                interfaceC4034l.crashlytics();
                return crashlytics(interfaceC10430l, j3, c1014l);
            }
            if (i == -2) {
                c14124l.amazon = j6;
                c14124l.billing = j7;
                c14124l.admob = C14124l.yandex(c14124l.loadAd, j6, c14124l.purchase, j7, c14124l.mopub, c14124l.crashlytics);
            } else {
                if (i != -1) {
                    if (i != 0) {
                        C8339l.smaato("Invalid case");
                        return 0;
                    }
                    long position2 = j7 - interfaceC10430l.getPosition();
                    if (position2 >= 0 && position2 <= 262144) {
                        interfaceC10430l.remoteconfig((int) position2);
                    }
                    this.crashlytics = null;
                    interfaceC4034l.crashlytics();
                    return crashlytics(interfaceC10430l, j7, c1014l);
                }
                c14124l.purchase = j6;
                c14124l.mopub = j7;
                c14124l.admob = C14124l.yandex(c14124l.loadAd, c14124l.amazon, j6, c14124l.billing, j7, c14124l.crashlytics);
            }
        }
    }
}

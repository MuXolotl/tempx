package defpackage;

/* JADX INFO: renamed from: lٌّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C12587l {
    public long admob;
    public boolean amazon;
    public boolean billing;
    public final C13143l crashlytics;
    public final C16391l loadAd;
    public long mopub;
    public boolean purchase;
    public long subs;
    public final /* synthetic */ int yandex;

    public C12587l(int i) {
        this.yandex = i;
        switch (i) {
            case 1:
                this.loadAd = new C16391l(0L);
                this.mopub = -9223372036854775807L;
                this.admob = -9223372036854775807L;
                this.subs = -9223372036854775807L;
                this.crashlytics = new C13143l();
                break;
            default:
                this.loadAd = new C16391l(0L);
                this.mopub = -9223372036854775807L;
                this.admob = -9223372036854775807L;
                this.subs = -9223372036854775807L;
                this.crashlytics = new C13143l();
                break;
        }
    }

    public static long crashlytics(C13143l c13143l) {
        int i = c13143l.loadAd;
        if (c13143l.yandex() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        c13143l.firebase(0, 9, bArr);
        c13143l.m3562for(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static int loadAd(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final void yandex(InterfaceC10430l interfaceC10430l) {
        int i = this.yandex;
        C13143l c13143l = this.crashlytics;
        switch (i) {
            case 0:
                byte[] bArr = AbstractC15323l.loadAd;
                c13143l.getClass();
                c13143l.m3565private(bArr.length, bArr);
                this.amazon = true;
                interfaceC10430l.smaato();
                break;
            default:
                byte[] bArr2 = AbstractC15323l.loadAd;
                c13143l.getClass();
                c13143l.m3565private(bArr2.length, bArr2);
                this.amazon = true;
                interfaceC10430l.smaato();
                break;
        }
    }
}

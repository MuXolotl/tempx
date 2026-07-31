package defpackage;

/* JADX INFO: renamed from: lْۣؕ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3734l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public long f7807l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public long f7808l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f7809l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f7813l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f7814l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public long f7816l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f7815l = 0;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f7812l = 0;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f7817l = 0;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int f7811l = 2;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f7810l = 4;

    public C3734l(int i) {
    }

    public static long amazon(int i, long j) {
        return (j >>> (-i)) | (j << i);
    }

    public final void crashlytics() {
        this.f7817l++;
        this.f7809l ^= this.f7815l;
        yandex(this.f7811l);
        this.f7813l ^= this.f7815l;
    }

    @Override // defpackage.InterfaceC2232l
    public int doFinal(byte[] bArr, int i) {
        AbstractC10000l.pro(loadAd(), bArr, 0);
        return 8;
    }

    @Override // defpackage.InterfaceC2232l
    public String getAlgorithmName() {
        return "SipHash-" + this.f7811l + "-" + this.f7810l;
    }

    @Override // defpackage.InterfaceC2232l
    public int getMacSize() {
        return 8;
    }

    @Override // defpackage.InterfaceC2232l
    public final void init(InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica("'params' must be an instance of KeyParameter");
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr.length != 16) {
            C8339l.metrica("'params' must be a 128-bit key");
            return;
        }
        this.f7807l = AbstractC10000l.subscription(0, bArr);
        this.f7814l = AbstractC10000l.subscription(8, bArr);
        reset();
    }

    public long loadAd() {
        long j = this.f7815l;
        int i = this.f7812l;
        this.f7815l = ((j >>> ((7 - i) << 3)) >>> 8) | ((((long) ((this.f7817l << 3) + i)) & 255) << 56);
        crashlytics();
        this.f7808l ^= 255;
        yandex(this.f7810l);
        long j2 = ((this.f7813l ^ this.f7816l) ^ this.f7808l) ^ this.f7809l;
        reset();
        return j2;
    }

    @Override // defpackage.InterfaceC2232l
    public void reset() {
        long j = this.f7807l;
        this.f7813l = 8317987319222330741L ^ j;
        long j2 = this.f7814l;
        this.f7816l = 7237128888997146477L ^ j2;
        this.f7808l = j ^ 7816392313619706465L;
        this.f7809l = 8387220255154660723L ^ j2;
        this.f7815l = 0L;
        this.f7812l = 0;
        this.f7817l = 0;
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = i2 & (-8);
        int i4 = this.f7812l;
        char c = '8';
        long j = 255;
        int i5 = 0;
        if (i4 == 0) {
            while (i5 < i3) {
                this.f7815l = AbstractC10000l.subscription(i + i5, bArr);
                crashlytics();
                i5 += 8;
            }
            while (i5 < i2) {
                long j2 = this.f7815l >>> 8;
                this.f7815l = j2;
                this.f7815l = j2 | ((((long) bArr[i + i5]) & 255) << 56);
                i5++;
            }
            this.f7812l = i2 - i3;
            return;
        }
        int i6 = i4 << 3;
        int i7 = 0;
        while (i7 < i3) {
            long jSubscription = AbstractC10000l.subscription(i + i7, bArr);
            this.f7815l = (this.f7815l >>> (-i6)) | (jSubscription << i6);
            crashlytics();
            this.f7815l = jSubscription;
            i7 += 8;
            c = c;
            j = j;
        }
        char c2 = c;
        long j3 = j;
        while (i7 < i2) {
            long j4 = this.f7815l >>> 8;
            this.f7815l = j4;
            this.f7815l = j4 | ((((long) bArr[i + i7]) & j3) << c2);
            int i8 = this.f7812l + 1;
            this.f7812l = i8;
            if (i8 == 8) {
                crashlytics();
                this.f7812l = 0;
            }
            i7++;
        }
    }

    public final void yandex(int i) {
        long jAmazon = this.f7813l;
        long jAmazon2 = this.f7816l;
        long jAmazon3 = this.f7808l;
        long jAmazon4 = this.f7809l;
        for (int i2 = 0; i2 < i; i2++) {
            long j = jAmazon + jAmazon2;
            long j2 = jAmazon3 + jAmazon4;
            long jAmazon5 = amazon(13, jAmazon2) ^ j;
            long jAmazon6 = amazon(16, jAmazon4) ^ j2;
            long j3 = j2 + jAmazon5;
            jAmazon = amazon(32, j) + jAmazon6;
            jAmazon2 = amazon(17, jAmazon5) ^ j3;
            jAmazon4 = amazon(21, jAmazon6) ^ jAmazon;
            jAmazon3 = amazon(32, j3);
        }
        this.f7813l = jAmazon;
        this.f7816l = jAmazon2;
        this.f7808l = jAmazon3;
        this.f7809l = jAmazon4;
    }

    public C3734l() {
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte b) {
        this.f7815l = (this.f7815l >>> 8) | ((((long) b) & 255) << 56);
        int i = this.f7812l + 1;
        this.f7812l = i;
        if (i == 8) {
            crashlytics();
            this.f7812l = 0;
        }
    }
}

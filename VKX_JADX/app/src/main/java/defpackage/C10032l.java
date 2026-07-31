package defpackage;

/* JADX INFO: renamed from: lَؒۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10032l extends AbstractC1821l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public long f20442l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public long f20443l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public long f20444l;

    /* JADX INFO: renamed from: lُؗٝ, reason: contains not printable characters */
    public long f20445l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public long f20446l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public final int f20447l;

    /* JADX INFO: renamed from: lٌؒٝ, reason: contains not printable characters */
    public long f20448l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f20449l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public long f20450l;

    public C10032l(int i, int i2) {
        super(EnumC2441l.f5219l);
        if (i >= 512) {
            C8339l.metrica("bitLength cannot be >= 512");
            throw null;
        }
        if (i % 8 != 0) {
            C8339l.metrica("bitLength needs to be a multiple of 8");
            throw null;
        }
        if (i == 384) {
            C8339l.metrica("bitLength cannot be 384 use SHA384 instead");
            throw null;
        }
        int i3 = i / 8;
        this.f20447l = i3;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        int i4 = i3 * 8;
        this.f4229l = -3482333909917012819L;
        this.f4219l = 2216346199247487646L;
        this.f4220l = -7364697282686394994L;
        this.f4228l = 65953792586715988L;
        this.f4223l = -816286391624063116L;
        this.f4230l = 4512832404995164602L;
        this.f4227l = -5033199132376557362L;
        this.f4217l = -124578254951840548L;
        update((byte) 83);
        update((byte) 72);
        update((byte) 65);
        update((byte) 45);
        update((byte) 53);
        update((byte) 49);
        update((byte) 50);
        update((byte) 47);
        if (i4 <= 100) {
            if (i4 > 10) {
            }
            update((byte) (i4 + 48));
            subs();
            this.f20449l = this.f4229l;
            this.f20446l = this.f4219l;
            this.f20444l = this.f4220l;
            this.f20443l = this.f4228l;
            this.f20442l = this.f4223l;
            this.f20450l = this.f4230l;
            this.f20445l = this.f4227l;
            this.f20448l = this.f4217l;
            reset();
        }
        update((byte) ((i4 / 100) + 48));
        i4 %= 100;
        update((byte) ((i4 / 10) + 48));
        i4 %= 10;
        update((byte) (i4 + 48));
        subs();
        this.f20449l = this.f4229l;
        this.f20446l = this.f4219l;
        this.f20444l = this.f4220l;
        this.f20443l = this.f4228l;
        this.f20442l = this.f4223l;
        this.f20450l = this.f4230l;
        this.f20445l = this.f4227l;
        this.f20448l = this.f4217l;
        reset();
    }

    public static void firebase(long j, byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return;
        }
        int i3 = (int) (j >>> 32);
        int iMin = Math.min(4, i2);
        while (true) {
            iMin--;
            if (iMin < 0) {
                break;
            } else {
                bArr[i + iMin] = (byte) (i3 >>> ((3 - iMin) * 8));
            }
        }
        if (i2 <= 4) {
            return;
        }
        int i4 = (int) (j & 4294967295L);
        int i5 = i + 4;
        int iMin2 = Math.min(4, i2 - 4);
        while (true) {
            iMin2--;
            if (iMin2 < 0) {
                return;
            } else {
                bArr[i5 + iMin2] = (byte) (i4 >>> ((3 - iMin2) * 8));
            }
        }
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        subs();
        long j = this.f4229l;
        int i2 = this.f20447l;
        firebase(j, bArr, i, i2);
        firebase(this.f4219l, bArr, i + 8, i2 - 8);
        firebase(this.f4220l, bArr, i + 16, i2 - 16);
        firebase(this.f4228l, bArr, i + 24, i2 - 24);
        firebase(this.f4223l, bArr, i + 32, i2 - 32);
        firebase(this.f4230l, bArr, i + 40, i2 - 40);
        firebase(this.f4227l, bArr, i + 48, i2 - 48);
        firebase(this.f4217l, bArr, i + 56, i2 - 56);
        reset();
        return i2;
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        return "SHA-512/" + Integer.toString(this.f20447l * 8);
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f20447l;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        C10032l c10032l = (C10032l) interfaceC11512l;
        if (this.f20447l != c10032l.f20447l) {
            throw new C8617l("digestLength inappropriate in other");
        }
        admob(c10032l);
        this.f20449l = c10032l.f20449l;
        this.f20446l = c10032l.f20446l;
        this.f20444l = c10032l.f20444l;
        this.f20443l = c10032l.f20443l;
        this.f20442l = c10032l.f20442l;
        this.f20450l = c10032l.f20450l;
        this.f20445l = c10032l.f20445l;
        this.f20448l = c10032l.f20448l;
    }

    @Override // defpackage.AbstractC1821l, defpackage.InterfaceC16922l
    public final void reset() {
        super.reset();
        this.f4229l = this.f20449l;
        this.f4219l = this.f20446l;
        this.f4220l = this.f20444l;
        this.f4228l = this.f20443l;
        this.f4223l = this.f20442l;
        this.f4230l = this.f20450l;
        this.f4227l = this.f20445l;
        this.f4217l = this.f20448l;
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C10032l(this);
    }

    public C10032l(C10032l c10032l) {
        super(c10032l);
        this.f20447l = c10032l.f20447l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
        loadAd(c10032l);
    }
}

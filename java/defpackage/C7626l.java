package defpackage;

/* JADX INFO: renamed from: lؚۤۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7626l implements InterfaceC2232l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public int f15703l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public int f15704l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f15705l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public int f15706l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public int f15707l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public int f15708l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public int f15709l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final byte[] f15710l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f15711l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10952l f15712l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public int f15713l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public int f15714l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public int f15715l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f15716l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public int f15717l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f15718l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public int f15719l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public int f15720l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f15721l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f15722l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public int f15723l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public int f15724l;

    public C7626l(InterfaceC10952l interfaceC10952l) {
        this.f15711l = new byte[1];
        this.f15710l = new byte[16];
        this.f15714l = 0;
        if (interfaceC10952l.license() == 16) {
            this.f15712l = interfaceC10952l;
        } else {
            C8339l.metrica("Poly1305 requires a 128 bit block cipher.");
            throw null;
        }
    }

    public static final long yandex(int i, int i2) {
        return (((long) i) & 4294967295L) * ((long) i2);
    }

    @Override // defpackage.InterfaceC2232l
    public final int doFinal(byte[] bArr, int i) {
        if (16 > bArr.length) {
            C18073l.ad("Output buffer is too short.");
            return 0;
        }
        if (this.f15714l > 0) {
            loadAd();
        }
        int i2 = this.f15713l;
        int i3 = this.f15724l;
        int i4 = i2 + (i3 >>> 26);
        int i5 = this.f15708l + (i4 >>> 26);
        int i6 = this.f15707l + (i5 >>> 26);
        int i7 = i5 & 67108863;
        int i8 = this.f15703l + (i6 >>> 26);
        int i9 = i6 & 67108863;
        int i10 = ((i8 >>> 26) * 5) + (i3 & 67108863);
        int i11 = i8 & 67108863;
        int i12 = (i4 & 67108863) + (i10 >>> 26);
        int i13 = i10 & 67108863;
        int i14 = i13 + 5;
        int i15 = (i14 >>> 26) + i12;
        int i16 = (i15 >>> 26) + i7;
        int i17 = (i16 >>> 26) + i9;
        int i18 = 67108863 & i17;
        int i19 = ((i17 >>> 26) + i11) - 67108864;
        int i20 = (i19 >>> 31) - 1;
        int i21 = ~i20;
        int i22 = (i13 & i21) | (i14 & 67108863 & i20);
        this.f15724l = i22;
        int i23 = (i12 & i21) | (i15 & 67108863 & i20);
        this.f15713l = i23;
        int i24 = (i7 & i21) | (i16 & 67108863 & i20);
        this.f15708l = i24;
        int i25 = (i18 & i20) | (i9 & i21);
        this.f15707l = i25;
        int i26 = (i11 & i21) | (i19 & i20);
        this.f15703l = i26;
        long j = (((long) ((i23 << 26) | i22)) & 4294967295L) + (((long) this.f15719l) & 4294967295L);
        long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.f15704l) & 4294967295L);
        long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.f15723l) & 4294967295L);
        long j4 = (((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (((long) this.f15716l) & 4294967295L);
        AbstractC10000l.smaato((int) j, 0, bArr);
        long j5 = j2 + (j >>> 32);
        AbstractC10000l.smaato((int) j5, 4, bArr);
        long j6 = j3 + (j5 >>> 32);
        AbstractC10000l.smaato((int) j6, 8, bArr);
        AbstractC10000l.smaato((int) (j4 + (j6 >>> 32)), 12, bArr);
        reset();
        return 16;
    }

    @Override // defpackage.InterfaceC2232l
    public final String getAlgorithmName() {
        InterfaceC10952l interfaceC10952l = this.f15712l;
        return interfaceC10952l == null ? "Poly1305" : "Poly1305-".concat(interfaceC10952l.getAlgorithmName());
    }

    @Override // defpackage.InterfaceC2232l
    public final int getMacSize() {
        return 16;
    }

    @Override // defpackage.InterfaceC2232l
    public final void init(InterfaceC9719l interfaceC9719l) {
        byte[] bArr;
        InterfaceC10952l interfaceC10952l = this.f15712l;
        if (interfaceC10952l == null) {
            bArr = null;
        } else if (!(interfaceC9719l instanceof C0272l)) {
            C8339l.metrica("Poly1305 requires an IV when used with a block cipher.");
            return;
        } else {
            C0272l c0272l = (C0272l) interfaceC9719l;
            bArr = c0272l.f1273l;
            interfaceC9719l = c0272l.f1272l;
        }
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica("Poly1305 requires a key.");
            return;
        }
        byte[] bArr2 = ((C13886l) interfaceC9719l).f27156l;
        if (bArr2.length != 32) {
            C8339l.metrica("Poly1305 key must be 256 bits.");
            return;
        }
        int i = 16;
        if (interfaceC10952l != null && (bArr == null || bArr.length != 16)) {
            C8339l.metrica("Poly1305 requires a 128 bit IV.");
            return;
        }
        int iMetrica = AbstractC10000l.metrica(0, bArr2);
        int iMetrica2 = AbstractC10000l.metrica(4, bArr2);
        int iMetrica3 = AbstractC10000l.metrica(8, bArr2);
        int iMetrica4 = AbstractC10000l.metrica(12, bArr2);
        this.f15705l = 67108863 & iMetrica;
        int i2 = ((iMetrica >>> 26) | (iMetrica2 << 6)) & 67108611;
        this.f15718l = i2;
        int i3 = ((iMetrica2 >>> 20) | (iMetrica3 << 12)) & 67092735;
        this.f15717l = i3;
        int i4 = ((iMetrica3 >>> 14) | (iMetrica4 << 18)) & 66076671;
        this.f15721l = i4;
        int i5 = (iMetrica4 >>> 8) & 1048575;
        this.f15706l = i5;
        this.f15709l = i2 * 5;
        this.f15720l = i3 * 5;
        this.f15715l = i4 * 5;
        this.f15722l = i5 * 5;
        if (interfaceC10952l != null) {
            byte[] bArr3 = new byte[16];
            interfaceC10952l.init(true, new C13886l(bArr2, 16, 16));
            interfaceC10952l.tapsense(0, 0, bArr, bArr3);
            i = 0;
            bArr2 = bArr3;
        }
        this.f15719l = AbstractC10000l.metrica(i, bArr2);
        this.f15704l = AbstractC10000l.metrica(i + 4, bArr2);
        this.f15723l = AbstractC10000l.metrica(i + 8, bArr2);
        this.f15716l = AbstractC10000l.metrica(i + 12, bArr2);
        reset();
    }

    public final void loadAd() {
        int i = this.f15714l;
        byte[] bArr = this.f15710l;
        if (i < 16) {
            bArr[i] = 1;
            for (int i2 = i + 1; i2 < 16; i2++) {
                bArr[i2] = 0;
            }
        }
        long jMetrica = AbstractC10000l.metrica(0, bArr);
        long j = jMetrica & 4294967295L;
        long jMetrica2 = ((long) AbstractC10000l.metrica(4, bArr)) & 4294967295L;
        long jMetrica3 = ((long) AbstractC10000l.metrica(8, bArr)) & 4294967295L;
        long jMetrica4 = 4294967295L & ((long) AbstractC10000l.metrica(12, bArr));
        int i3 = (int) (((long) this.f15724l) + (jMetrica & 67108863));
        this.f15724l = i3;
        this.f15713l = (int) (((long) this.f15713l) + ((((jMetrica2 << 32) | j) >>> 26) & 67108863));
        this.f15708l = (int) (((long) this.f15708l) + ((((jMetrica3 << 32) | jMetrica2) >>> 20) & 67108863));
        this.f15707l = (int) (((long) this.f15707l) + ((((jMetrica4 << 32) | jMetrica3) >>> 14) & 67108863));
        int i4 = (int) (((long) this.f15703l) + (jMetrica4 >>> 8));
        this.f15703l = i4;
        if (this.f15714l == 16) {
            this.f15703l = i4 + 16777216;
        }
        long jYandex = yandex(this.f15703l, this.f15709l) + yandex(this.f15707l, this.f15720l) + yandex(this.f15708l, this.f15715l) + yandex(this.f15713l, this.f15722l) + yandex(i3, this.f15705l);
        long jYandex2 = yandex(this.f15703l, this.f15720l) + yandex(this.f15707l, this.f15715l) + yandex(this.f15708l, this.f15722l) + yandex(this.f15713l, this.f15705l) + yandex(this.f15724l, this.f15718l);
        long jYandex3 = yandex(this.f15703l, this.f15715l) + yandex(this.f15707l, this.f15722l) + yandex(this.f15708l, this.f15705l) + yandex(this.f15713l, this.f15718l) + yandex(this.f15724l, this.f15717l);
        long jYandex4 = yandex(this.f15703l, this.f15722l) + yandex(this.f15707l, this.f15705l) + yandex(this.f15708l, this.f15718l) + yandex(this.f15713l, this.f15717l) + yandex(this.f15724l, this.f15721l);
        long jYandex5 = yandex(this.f15703l, this.f15705l) + yandex(this.f15707l, this.f15718l) + yandex(this.f15708l, this.f15717l) + yandex(this.f15713l, this.f15721l) + yandex(this.f15724l, this.f15706l);
        long j2 = jYandex2 + (jYandex >>> 26);
        long j3 = jYandex3 + (j2 >>> 26);
        this.f15708l = ((int) j3) & 67108863;
        long j4 = jYandex4 + (j3 >>> 26);
        this.f15707l = ((int) j4) & 67108863;
        long j5 = jYandex5 + (j4 >>> 26);
        this.f15703l = ((int) j5) & 67108863;
        int i5 = (((int) (j5 >>> 26)) * 5) + (((int) jYandex) & 67108863);
        this.f15713l = (((int) j2) & 67108863) + (i5 >>> 26);
        this.f15724l = i5 & 67108863;
    }

    @Override // defpackage.InterfaceC2232l
    public final void reset() {
        this.f15714l = 0;
        this.f15703l = 0;
        this.f15707l = 0;
        this.f15708l = 0;
        this.f15713l = 0;
        this.f15724l = 0;
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            if (this.f15714l == 16) {
                loadAd();
                this.f15714l = 0;
            }
            int iMin = Math.min(i2 - i3, 16 - this.f15714l);
            System.arraycopy(bArr, i3 + i, this.f15710l, this.f15714l, iMin);
            i3 += iMin;
            this.f15714l += iMin;
        }
    }

    public C7626l() {
        this.f15711l = new byte[1];
        this.f15710l = new byte[16];
        this.f15714l = 0;
        this.f15712l = null;
    }

    @Override // defpackage.InterfaceC2232l
    public final void update(byte b) {
        byte[] bArr = this.f15711l;
        bArr[0] = b;
        update(bArr, 0, 1);
    }
}

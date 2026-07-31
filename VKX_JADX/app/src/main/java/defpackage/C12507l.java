package defpackage;

/* JADX INFO: renamed from: lَّؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12507l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int[] f24646l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final int[] f24647l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final byte[] f24643l = {-42, -112, -23, -2, -52, -31, 61, -73, 22, -74, 20, -62, 40, -5, 44, 5, 43, 103, -102, 118, 42, -66, 4, -61, -86, 68, 19, 38, 73, -122, 6, -103, -100, 66, 80, -12, -111, -17, -104, 122, 51, 84, 11, 67, -19, -49, -84, 98, -28, -77, 28, -87, -55, 8, -24, -107, -128, -33, -108, -6, 117, -113, 63, -90, 71, 7, -89, -4, -13, 115, 23, -70, -125, 89, 60, 25, -26, -123, 79, -88, 104, 107, -127, -78, 113, 100, -38, -117, -8, -21, 15, 75, 112, 86, -99, 53, 30, 36, 14, 94, 99, 88, -47, -94, 37, 34, 124, 59, 1, 33, 120, -121, -44, 0, 70, 87, -97, -45, 39, 82, 76, 54, 2, -25, -96, -60, -56, -98, -22, -65, -118, -46, 64, -57, 56, -75, -93, -9, -14, -50, -7, 97, 21, -95, -32, -82, 93, -92, -101, 52, 26, 85, -83, -109, 50, 48, -11, -116, -79, -29, 29, -10, -30, 46, -126, 102, -54, 96, -64, 41, 35, -85, 13, 83, 78, 111, -43, -37, 55, 69, -34, -3, -114, 47, 3, -1, 106, 114, 109, 108, 91, 81, -115, 27, -81, -110, -69, -35, -68, 127, 17, -39, 92, 65, 31, 16, 90, -40, 10, -63, 49, -120, -91, -51, 123, -67, 45, 116, -48, 18, -72, -27, -76, -80, -119, 105, -105, 74, 12, -106, 119, 126, 101, -71, -15, 9, -59, 110, -58, -124, 24, -16, 125, -20, 58, -36, 77, 32, 121, -18, 95, 62, -41, -53, 57, 72};

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public static final int[] f24645l = {462357, 472066609, 943670861, 1415275113, 1886879365, -1936483679, -1464879427, -993275175, -521670923, -66909679, 404694573, 876298825, 1347903077, 1819507329, -2003855715, -1532251463, -1060647211, -589042959, -117504499, 337322537, 808926789, 1280531041, 1752135293, -2071227751, -1599623499, -1128019247, -656414995, -184876535, 269950501, 741554753, 1213159005, 1684763257};

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final int[] f24644l = {-1548633402, 1453994832, 1736282519, -1301273892};

    public C12507l(int i) {
        switch (i) {
            case 1:
                this.f24647l = new int[16];
                this.f24646l = new int[16];
                break;
            default:
                this.f24647l = new int[4];
                break;
        }
    }

    public static int amazon(int i) {
        byte[] bArr = f24643l;
        return (bArr[i & 255] & 255) | ((bArr[(i >> 24) & 255] & 255) << 24) | ((bArr[(i >> 16) & 255] & 255) << 16) | ((bArr[(i >> 8) & 255] & 255) << 8);
    }

    public static int crashlytics(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static int loadAd(int i) {
        int iAmazon = amazon(i);
        return crashlytics(iAmazon, 23) ^ (crashlytics(iAmazon, 13) ^ iAmazon);
    }

    public static int yandex(int i) {
        int iAmazon = amazon(i);
        return crashlytics(iAmazon, 24) ^ (((crashlytics(iAmazon, 2) ^ iAmazon) ^ crashlytics(iAmazon, 10)) ^ crashlytics(iAmazon, 18));
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "SM4";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to SM4 init - ", interfaceC9719l));
            return;
        }
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr.length != 16) {
            C8339l.metrica("SM4 requires a 128 bit key");
            return;
        }
        int[] iArr = new int[32];
        int[] iArr2 = {AbstractC10000l.yandex(0, bArr), AbstractC10000l.yandex(4, bArr), AbstractC10000l.yandex(8, bArr), AbstractC10000l.yandex(12, bArr)};
        int i = iArr2[0];
        int[] iArr3 = f24644l;
        int[] iArr4 = {i ^ iArr3[0], iArr2[1] ^ iArr3[1], iArr2[2] ^ iArr3[2], iArr2[3] ^ iArr3[3]};
        int[] iArr5 = f24645l;
        if (z) {
            int iLoadAd = iArr4[0] ^ loadAd(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[0] = iLoadAd;
            int iLoadAd2 = loadAd((iLoadAd ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[1] = iLoadAd2;
            int iLoadAd3 = loadAd((iLoadAd2 ^ (iArr4[3] ^ iArr[0])) ^ iArr5[2]) ^ iArr4[2];
            iArr[2] = iLoadAd3;
            iArr[3] = loadAd((iLoadAd3 ^ (iArr[0] ^ iArr[1])) ^ iArr5[3]) ^ iArr4[3];
            for (int i2 = 4; i2 < 32; i2++) {
                iArr[i2] = iArr[i2 - 4] ^ loadAd(((iArr[i2 - 3] ^ iArr[i2 - 2]) ^ iArr[i2 - 1]) ^ iArr5[i2]);
            }
        } else {
            int iLoadAd4 = iArr4[0] ^ loadAd(((iArr4[1] ^ iArr4[2]) ^ iArr4[3]) ^ iArr5[0]);
            iArr[31] = iLoadAd4;
            int iLoadAd5 = loadAd((iLoadAd4 ^ (iArr4[2] ^ iArr4[3])) ^ iArr5[1]) ^ iArr4[1];
            iArr[30] = iLoadAd5;
            int iLoadAd6 = loadAd((iLoadAd5 ^ (iArr4[3] ^ iArr[31])) ^ iArr5[2]) ^ iArr4[2];
            iArr[29] = iLoadAd6;
            iArr[28] = loadAd((iLoadAd6 ^ (iArr[31] ^ iArr[30])) ^ iArr5[3]) ^ iArr4[3];
            for (int i3 = 27; i3 >= 0; i3--) {
                iArr[i3] = iArr[i3 + 4] ^ loadAd(((iArr[i3 + 3] ^ iArr[i3 + 2]) ^ iArr[i3 + 1]) ^ iArr5[31 - i3]);
            }
        }
        this.f24646l = iArr;
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 16;
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        if (this.f24646l == null) {
            C8339l.smaato("SM4 not initialised");
            return 0;
        }
        if (i + 16 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 16 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        int iYandex = AbstractC10000l.yandex(i, bArr);
        int[] iArr = this.f24647l;
        iArr[0] = iYandex;
        iArr[1] = AbstractC10000l.yandex(i + 4, bArr);
        iArr[2] = AbstractC10000l.yandex(i + 8, bArr);
        iArr[3] = AbstractC10000l.yandex(i + 12, bArr);
        for (int i3 = 0; i3 < 32; i3 += 4) {
            int iYandex2 = yandex(this.f24646l[i3] ^ ((iArr[1] ^ iArr[2]) ^ iArr[3])) ^ iArr[0];
            iArr[0] = iYandex2;
            int iYandex3 = yandex((iYandex2 ^ (iArr[2] ^ iArr[3])) ^ this.f24646l[i3 + 1]) ^ iArr[1];
            iArr[1] = iYandex3;
            int iYandex4 = yandex((iYandex3 ^ (iArr[3] ^ iArr[0])) ^ this.f24646l[i3 + 2]) ^ iArr[2];
            iArr[2] = iYandex4;
            iArr[3] = yandex((iYandex4 ^ (iArr[0] ^ iArr[1])) ^ this.f24646l[i3 + 3]) ^ iArr[3];
        }
        AbstractC10000l.isPro(iArr[3], i2, bArr2);
        AbstractC10000l.isPro(iArr[2], i2 + 4, bArr2);
        AbstractC10000l.isPro(iArr[1], i2 + 8, bArr2);
        AbstractC10000l.isPro(iArr[0], i2 + 12, bArr2);
        return 16;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }

    public C12507l(int[] iArr, int[] iArr2) {
        this.f24647l = iArr;
        this.f24646l = iArr2;
    }
}

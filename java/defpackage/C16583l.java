package defpackage;

/* JADX INFO: renamed from: lٖۗۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C16583l implements InterfaceC10952l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public int f32547l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public int f32548l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public int f32549l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f32550l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public int f32551l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f32552l;

    public C16583l(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this.f32549l = i;
        this.f32548l = i2;
        this.f32547l = i3;
        this.f32550l = z;
        this.f32552l = z2;
        this.f32551l = i4;
    }

    public static void loadAd(int i, int i2, byte[] bArr) {
        bArr[i2] = (byte) (i >>> 24);
        bArr[i2 + 1] = (byte) (i >>> 16);
        bArr[i2 + 2] = (byte) (i >>> 8);
        bArr[i2 + 3] = (byte) i;
    }

    public static int yandex(int i, byte[] bArr) {
        int i2 = ((bArr[i + 1] & 255) << 16) | (bArr[i] << 24);
        return (bArr[i + 3] & 255) | i2 | ((bArr[i + 2] & 255) << 8);
    }

    @Override // defpackage.InterfaceC10952l
    public String getAlgorithmName() {
        return "TEA";
    }

    @Override // defpackage.InterfaceC10952l
    public void init(boolean z, InterfaceC9719l interfaceC9719l) {
        if (!(interfaceC9719l instanceof C13886l)) {
            C8339l.metrica(AbstractC5020l.subscription("invalid parameter passed to TEA init - ", interfaceC9719l));
            return;
        }
        this.f32552l = z;
        this.f32550l = true;
        byte[] bArr = ((C13886l) interfaceC9719l).f27156l;
        if (bArr.length != 16) {
            C8339l.metrica("Key size must be 128 bits.");
            return;
        }
        this.f32549l = yandex(0, bArr);
        this.f32548l = yandex(4, bArr);
        this.f32547l = yandex(8, bArr);
        this.f32551l = yandex(12, bArr);
        if (interfaceC9719l instanceof EnumC2441l) {
            C8339l.metrica("params should not be CryptoServicePurpose");
        } else {
            ((C5911l) AbstractC8776l.purchase.get()).getClass();
        }
    }

    @Override // defpackage.InterfaceC10952l
    public int license() {
        return 8;
    }

    @Override // defpackage.InterfaceC10952l
    public int tapsense(int i, int i2, byte[] bArr, byte[] bArr2) {
        int i3 = 0;
        if (!this.f32550l) {
            C8339l.smaato("TEA not initialised");
            return 0;
        }
        if (i + 8 > bArr.length) {
            C10754l.ad("input buffer too short");
            return 0;
        }
        if (i2 + 8 > bArr2.length) {
            C18073l.ad("output buffer too short");
            return 0;
        }
        if (this.f32552l) {
            int iYandex = yandex(i, bArr);
            int iYandex2 = yandex(i + 4, bArr);
            int i4 = 0;
            while (i3 != 32) {
                i4 -= 1640531527;
                iYandex += (((iYandex2 << 4) + this.f32549l) ^ (iYandex2 + i4)) ^ ((iYandex2 >>> 5) + this.f32548l);
                iYandex2 += (((iYandex << 4) + this.f32547l) ^ (iYandex + i4)) ^ ((iYandex >>> 5) + this.f32551l);
                i3++;
            }
            loadAd(iYandex, i2, bArr2);
            loadAd(iYandex2, i2 + 4, bArr2);
            return 8;
        }
        int iYandex3 = yandex(i, bArr);
        int iYandex4 = yandex(i + 4, bArr);
        int i5 = -957401312;
        while (i3 != 32) {
            iYandex4 -= (((iYandex3 << 4) + this.f32547l) ^ (iYandex3 + i5)) ^ ((iYandex3 >>> 5) + this.f32551l);
            iYandex3 -= (((iYandex4 << 4) + this.f32549l) ^ (iYandex4 + i5)) ^ ((iYandex4 >>> 5) + this.f32548l);
            i5 += 1640531527;
            i3++;
        }
        loadAd(iYandex3, i2, bArr2);
        loadAd(iYandex4, i2 + 4, bArr2);
        return 8;
    }

    @Override // defpackage.InterfaceC10952l
    public void reset() {
    }
}

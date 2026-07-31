package defpackage;

/* JADX INFO: renamed from: lؓۥٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2230l extends AbstractC11186l {
    public final InterfaceC16922l loadAd;
    public final /* synthetic */ int yandex = 0;

    public C2230l() {
        int i = AbstractC14832l.yandex;
        this.loadAd = new C3077l();
    }

    public void crashlytics(byte[] bArr, byte[] bArr2) {
        super.init(bArr, bArr2, 1);
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedMacParameters(int i) {
        switch (this.yandex) {
            case 0:
                break;
        }
        return generateDerivedParameters(i);
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedParameters(int i, int i2) {
        switch (this.yandex) {
            case 0:
                int i3 = i / 8;
                int i4 = i2 / 8;
                byte[] bArrLoadAd = loadAd(i3 + i4);
                return new C0272l(new C13886l(bArrLoadAd, 0, i3), bArrLoadAd, i3, i4);
            default:
                int i5 = i / 8;
                int i6 = i2 / 8;
                int i7 = i5 + i6;
                if (i7 <= this.loadAd.getDigestSize()) {
                    byte[] bArrYandex = yandex();
                    return new C0272l(new C13886l(bArrYandex, 0, i5), bArrYandex, i5, i6);
                }
                C8339l.metrica(AbstractC15560l.tapsense("Can't generate a derived key ", i7, " bytes long."));
                return null;
        }
    }

    public byte[] loadAd(int i) {
        C3077l c3077l = (C3077l) this.loadAd;
        c3077l.getClass();
        byte[] bArr = new byte[16];
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.password;
            c3077l.update(bArr3, 0, bArr3.length);
            byte[] bArr4 = this.salt;
            c3077l.update(bArr4, 0, bArr4.length);
            c3077l.doFinal(bArr, 0);
            int i3 = i > 16 ? 16 : i;
            System.arraycopy(bArr, 0, bArr2, i2, i3);
            i2 += i3;
            i -= i3;
            if (i == 0) {
                return bArr2;
            }
            c3077l.reset();
            c3077l.update(bArr, 0, 16);
        }
    }

    public byte[] yandex() {
        InterfaceC16922l interfaceC16922l = this.loadAd;
        int digestSize = interfaceC16922l.getDigestSize();
        byte[] bArr = new byte[digestSize];
        byte[] bArr2 = this.password;
        interfaceC16922l.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = this.salt;
        interfaceC16922l.update(bArr3, 0, bArr3.length);
        interfaceC16922l.doFinal(bArr, 0);
        for (int i = 1; i < this.iterationCount; i++) {
            interfaceC16922l.update(bArr, 0, digestSize);
            interfaceC16922l.doFinal(bArr, 0);
        }
        return bArr;
    }

    public C2230l(InterfaceC16922l interfaceC16922l) {
        this.loadAd = interfaceC16922l;
    }

    @Override // defpackage.AbstractC11186l
    public final InterfaceC9719l generateDerivedParameters(int i) {
        switch (this.yandex) {
            case 0:
                int i2 = i / 8;
                return new C13886l(loadAd(i2), 0, i2);
            default:
                int i3 = i / 8;
                if (i3 <= this.loadAd.getDigestSize()) {
                    return new C13886l(yandex(), 0, i3);
                }
                C8339l.metrica(AbstractC15560l.tapsense("Can't generate a derived key ", i3, " bytes long."));
                return null;
        }
    }
}

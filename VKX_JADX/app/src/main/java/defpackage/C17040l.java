package defpackage;

/* JADX INFO: renamed from: lَۣٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C17040l implements InterfaceC9273l, InterfaceC11512l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C3268l f33202l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final EnumC2441l f33203l;

    public C17040l(C17040l c17040l) {
        this.f33202l = new C3268l(c17040l.f33202l);
        this.f33203l = c17040l.f33203l;
        int i = c17040l.f33202l.f6995l;
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }

    @Override // defpackage.InterfaceC16922l
    public final int doFinal(byte[] bArr, int i) {
        return this.f33202l.amazon(bArr, i);
    }

    @Override // defpackage.InterfaceC16922l
    public final String getAlgorithmName() {
        StringBuilder sb = new StringBuilder("Skein-");
        C3268l c3268l = this.f33202l;
        sb.append(c3268l.f6996l.f4012l * 8);
        sb.append("-");
        sb.append(c3268l.f6995l * 8);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC9273l
    public final int getByteLength() {
        return this.f33202l.f6996l.f4012l;
    }

    @Override // defpackage.InterfaceC16922l
    public final int getDigestSize() {
        return this.f33202l.f6995l;
    }

    @Override // defpackage.InterfaceC11512l
    public final void loadAd(InterfaceC11512l interfaceC11512l) {
        this.f33202l.loadAd(((C17040l) interfaceC11512l).f33202l);
    }

    @Override // defpackage.InterfaceC16922l
    public final void reset() {
        C3268l c3268l = this.f33202l;
        long[] jArr = c3268l.f6998l;
        long[] jArr2 = c3268l.f6992l;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        c3268l.subs(48);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte b) {
        C3268l c3268l = this.f33202l;
        byte[] bArr = c3268l.f6999l;
        bArr[0] = b;
        C9598l c9598l = c3268l.f6994l;
        if (c9598l != null) {
            c9598l.m2696catch(bArr, 0, 1, c3268l.f6992l);
        } else {
            C8339l.metrica("Skein engine is not initialised.");
        }
    }

    @Override // defpackage.InterfaceC11512l
    public final InterfaceC11512l yandex() {
        return new C17040l(this);
    }

    @Override // defpackage.InterfaceC16922l
    public final void update(byte[] bArr, int i, int i2) {
        C3268l c3268l = this.f33202l;
        C9598l c9598l = c3268l.f6994l;
        if (c9598l != null) {
            c9598l.m2696catch(bArr, i, i2, c3268l.f6992l);
        } else {
            C8339l.metrica("Skein engine is not initialised.");
        }
    }

    public C17040l(int i, int i2) {
        C3268l c3268l = new C3268l(i, i2);
        this.f33202l = c3268l;
        this.f33203l = EnumC2441l.f5219l;
        c3268l.purchase(null);
        AbstractC3586l.amazon(this);
        AbstractC8776l.yandex();
    }
}

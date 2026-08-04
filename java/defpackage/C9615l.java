package defpackage;

/* JADX INFO: renamed from: lٍٗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9615l extends AbstractC8010l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f19589l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f19590l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final int f19591l;

    public C9615l(byte[] bArr, int i, int i2) {
        AbstractC15619l.tapsense(i, i + i2, bArr.length);
        this.f19589l = bArr;
        this.f19591l = i;
        this.f19590l = i2;
    }

    @Override // defpackage.AbstractC15619l
    public final void admob(int i, byte[] bArr) {
        System.arraycopy(this.f19589l, this.f19591l, bArr, 0, i);
    }

    @Override // defpackage.AbstractC15619l
    public final byte amazon(int i) {
        return this.f19589l[this.f19591l + i];
    }

    @Override // defpackage.AbstractC15619l
    public final int billing() {
        return this.f19590l;
    }

    @Override // defpackage.AbstractC15619l
    public final void firebase(AbstractC10908l abstractC10908l) {
        abstractC10908l.crashlytics(this.f19591l, this.f19590l, this.f19589l);
    }

    @Override // defpackage.AbstractC15619l
    public final AbstractC8010l mopub(int i, int i2) {
        int iTapsense = AbstractC15619l.tapsense(i, i2, this.f19590l);
        if (iTapsense == 0) {
            return AbstractC15619l.f30516l;
        }
        return new C9615l(this.f19589l, this.f19591l + i, iTapsense);
    }

    @Override // defpackage.AbstractC15619l
    public final int remoteconfig(int i, int i2) {
        return AbstractC16728l.yandex(this.f19589l, i, this.f19591l, i2);
    }

    @Override // defpackage.AbstractC15619l
    public final boolean smaato(AbstractC15619l abstractC15619l) {
        boolean z = abstractC15619l instanceof C2530l;
        if (!z && !(abstractC15619l instanceof C9615l)) {
            return abstractC15619l.smaato(this);
        }
        int iBilling = abstractC15619l.billing();
        int i = this.f19590l;
        if (i > iBilling) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > abstractC15619l.billing()) {
            int iBilling2 = abstractC15619l.billing();
            C11586l.crashlytics(String.valueOf(i).length() + 27 + String.valueOf(iBilling2).length(), i, iBilling2);
            return false;
        }
        byte[] bArr = this.f19589l;
        int i2 = this.f19591l;
        if (z) {
            return AbstractC15619l.Signature(bArr, i2, 0, ((C2530l) abstractC15619l).f5512l, i);
        }
        if (!(abstractC15619l instanceof C9615l)) {
            return abstractC15619l.mopub(0, i).equals(mopub(i2, i + i2));
        }
        C9615l c9615l = (C9615l) abstractC15619l;
        return AbstractC15619l.Signature(bArr, i2, c9615l.f19591l, c9615l.f19589l, i);
    }
}

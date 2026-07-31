package defpackage;

import java.util.Arrays;

/* JADX INFO: renamed from: lَؔۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530l extends AbstractC8010l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final byte[] f5512l;

    public C2530l(byte[] bArr) {
        bArr.getClass();
        this.f5512l = bArr;
    }

    @Override // defpackage.AbstractC15619l
    public final void admob(int i, byte[] bArr) {
        System.arraycopy(this.f5512l, 0, bArr, 0, i);
    }

    @Override // defpackage.AbstractC15619l
    public final byte amazon(int i) {
        return this.f5512l[i];
    }

    @Override // defpackage.AbstractC15619l
    public final int billing() {
        return this.f5512l.length;
    }

    @Override // defpackage.AbstractC15619l
    public final void firebase(AbstractC10908l abstractC10908l) {
        byte[] bArr = this.f5512l;
        abstractC10908l.crashlytics(0, bArr.length, bArr);
    }

    @Override // defpackage.AbstractC15619l
    public final AbstractC8010l mopub(int i, int i2) {
        byte[] bArr = this.f5512l;
        int iTapsense = AbstractC15619l.tapsense(0, i2, bArr.length);
        return iTapsense == 0 ? AbstractC15619l.f30516l : new C9615l(bArr, 0, iTapsense);
    }

    @Override // defpackage.AbstractC15619l
    public final int remoteconfig(int i, int i2) {
        return AbstractC16728l.yandex(this.f5512l, i, 0, i2);
    }

    @Override // defpackage.AbstractC15619l
    public final boolean smaato(AbstractC15619l abstractC15619l) {
        boolean z = abstractC15619l instanceof C2530l;
        byte[] bArr = this.f5512l;
        if (z) {
            return Arrays.equals(bArr, ((C2530l) abstractC15619l).f5512l);
        }
        boolean z2 = abstractC15619l instanceof C9615l;
        if (!z2) {
            return abstractC15619l.smaato(this);
        }
        C9615l c9615l = (C9615l) abstractC15619l;
        int i = c9615l.f19590l;
        int length = bArr.length;
        if (length > i) {
            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 18 + String.valueOf(length).length());
            sb.append("Length too large: ");
            sb.append(length);
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        }
        if (length > i) {
            C11586l.crashlytics(String.valueOf(length).length() + 27 + String.valueOf(i).length(), length, i);
            return false;
        }
        if (z) {
            return AbstractC15619l.Signature(bArr, 0, 0, ((C2530l) abstractC15619l).f5512l, length);
        }
        if (!z2) {
            return abstractC15619l.mopub(0, length).equals(mopub(0, length));
        }
        return AbstractC15619l.Signature(bArr, 0, c9615l.f19591l, c9615l.f19589l, length);
    }
}

package defpackage;

/* JADX INFO: renamed from: lَٕ٘, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10361l extends Cnative {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public advert f21158l;

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return this.f21158l;
    }

    public final String toString() {
        StringBuilder sb;
        int i;
        byte[] bArrApplovin = this.f21158l.applovin();
        if (bArrApplovin.length == 1) {
            sb = new StringBuilder("KeyUsage: 0x");
            i = bArrApplovin[0] & 255;
        } else {
            sb = new StringBuilder("KeyUsage: 0x");
            i = (bArrApplovin[0] & 255) | ((bArrApplovin[1] & 255) << 8);
        }
        sb.append(Integer.toHexString(i));
        return sb.toString();
    }
}

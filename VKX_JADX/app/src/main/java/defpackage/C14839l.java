package defpackage;

/* JADX INFO: renamed from: lِٔۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14839l extends Cnative {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Cstrictfp f29051l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public advert f29052l;

    public C14839l(byte[] bArr, int i) {
        if (bArr == null) {
            C8339l.metrica("'seed' cannot be null");
            throw null;
        }
        this.f29052l = new C13353l(bArr, 0);
        this.f29051l = Cstrictfp.m4580private(i);
    }

    @Override // defpackage.Cnative, defpackage.applovin
    public final Ccase billing() {
        return new C11138l(this.f29052l, this.f29051l);
    }
}

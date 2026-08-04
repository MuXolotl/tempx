package defpackage;

/* JADX INFO: renamed from: lًٍِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11702l implements InterfaceC9719l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final byte[] f23446l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC9719l f23447l;

    public C11702l(InterfaceC9719l interfaceC9719l, byte[] bArr) {
        if (bArr == null) {
            C6541l.subs("'context' cannot be null");
            throw null;
        }
        this.f23447l = interfaceC9719l;
        this.f23446l = AbstractC14024l.crashlytics(bArr);
    }
}

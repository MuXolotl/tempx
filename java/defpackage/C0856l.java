package defpackage;

/* JADX INFO: renamed from: lؒؗۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0856l extends AbstractC7940l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C10237l f2509l;

    public C0856l(C18535l c18535l, byte[] bArr) {
        super((Object) c18535l, false);
        int iPro = c18535l.crashlytics.pro();
        int i = iPro * 2;
        if (bArr.length == i) {
            this.f2509l = new C10237l(AbstractC14024l.vip(0, iPro, bArr), AbstractC14024l.vip(iPro, i, bArr));
        } else {
            C8339l.metrica("public key encoding does not match parameters");
            throw null;
        }
    }
}

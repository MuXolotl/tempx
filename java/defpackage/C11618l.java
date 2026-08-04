package defpackage;

import java.security.cert.CertSelector;
import java.security.cert.Certificate;

/* JADX INFO: renamed from: lِؕۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C11618l implements InterfaceC0168l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final CertSelector f23340l;

    public C11618l(CertSelector certSelector) {
        this.f23340l = certSelector;
    }

    public final Object clone() {
        return new C11618l(this.f23340l);
    }

    @Override // defpackage.InterfaceC0168l
    public final boolean mopub(Object obj) {
        return this.f23340l.match((Certificate) obj);
    }
}

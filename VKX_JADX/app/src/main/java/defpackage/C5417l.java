package defpackage;

import java.security.cert.CertPathBuilderException;

/* JADX INFO: renamed from: lؘؔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5417l extends CertPathBuilderException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Throwable f11604l;

    public C5417l(String str, Throwable th) {
        super(str);
        this.f11604l = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f11604l;
    }
}

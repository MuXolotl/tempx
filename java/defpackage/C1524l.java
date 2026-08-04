package defpackage;

import java.security.cert.CertPath;
import java.security.cert.CertPathValidatorException;

/* JADX INFO: renamed from: lؒۨۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1524l extends CertPathValidatorException {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Throwable f3795l;

    public C1524l(String str, Exception exc) {
        super(str);
        this.f3795l = exc;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f3795l;
    }

    public C1524l(String str, Exception exc, CertPath certPath, int i) {
        super(str, exc, certPath, i);
        this.f3795l = exc;
    }
}

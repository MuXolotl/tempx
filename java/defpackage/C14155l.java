package defpackage;

import j$.util.DesugarCollections;
import java.security.cert.CertPathParameters;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: lٓٔٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C14155l implements CertPathParameters {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final int f27678l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Set f27679l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C5384l f27680l;

    public C14155l(C13698l c13698l) {
        this.f27680l = (C5384l) c13698l.f26743l;
        this.f27679l = DesugarCollections.unmodifiableSet((HashSet) c13698l.f26746l);
        this.f27678l = c13698l.f26744l;
    }

    @Override // java.security.cert.CertPathParameters
    public final Object clone() {
        return this;
    }
}

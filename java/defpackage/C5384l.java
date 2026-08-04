package defpackage;

import j$.util.DesugarCollections;
import java.security.cert.CertPathParameters;
import java.security.cert.PKIXParameters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: lؘؒۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5384l implements CertPathParameters {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final Date f11521l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final List f11522l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final Map f11523l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11618l f11524l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final PKIXParameters f11525l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Set f11526l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final List f11527l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Date f11528l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final boolean f11529l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Map f11530l;

    public C5384l(C15855l c15855l) {
        this.f11525l = (PKIXParameters) c15855l.f31108l;
        this.f11521l = (Date) c15855l.f31105l;
        this.f11528l = (Date) c15855l.f31112l;
        this.f11527l = DesugarCollections.unmodifiableList((ArrayList) c15855l.f31114l);
        this.f11530l = DesugarCollections.unmodifiableMap(new HashMap((HashMap) c15855l.f31106l));
        this.f11522l = DesugarCollections.unmodifiableList((ArrayList) c15855l.f31107l);
        this.f11523l = DesugarCollections.unmodifiableMap(new HashMap((HashMap) c15855l.f31113l));
        this.f11524l = (C11618l) c15855l.f31111l;
        this.f11529l = c15855l.f31109l;
        this.f11526l = DesugarCollections.unmodifiableSet((Set) c15855l.f31110l);
    }

    @Override // java.security.cert.CertPathParameters
    public final Object clone() {
        return this;
    }
}

package defpackage;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: renamed from: lْؑٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0429l implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cfor f1560l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Cfor f1561l;

    public C0429l(String str) {
        this(AbstractC11696l.billing(str), str.indexOf("12-512") > 0 ? InterfaceC18410l.loadAd : str.indexOf("12-256") > 0 ? InterfaceC18410l.yandex : InterfaceC11987l.metrica);
    }

    public C0429l(Cfor cfor, Cfor cfor2) {
        this.f1561l = cfor;
        this.f1560l = cfor2;
    }
}

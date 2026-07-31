package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٌْۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C8975l extends AbstractC15940l {

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final InterfaceC1220l f18512l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C4454l f18513l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final InterfaceC1220l f18514l;

    public C8975l(AbstractC0601l abstractC0601l, String str, Object obj, C4454l c4454l) {
        super(abstractC0601l, str, obj);
        this.f18513l = c4454l;
        this.f18512l = AbstractC9968l.crashlytics(2, new C0430l(abstractC0601l, this));
        this.f18514l = AbstractC9968l.crashlytics(2, new C0430l(this, abstractC0601l));
    }

    @Override // defpackage.AbstractC15940l
    /* JADX INFO: renamed from: case, reason: not valid java name */
    public final List mo2439case() {
        return this.f18513l.billing;
    }

    @Override // defpackage.AbstractC15940l
    /* JADX INFO: renamed from: catch, reason: not valid java name */
    public final C1559l mo2440catch() {
        C1559l c1559l = AbstractC10565l.mopub(this.f18513l).yandex;
        if (c1559l != null) {
            return c1559l;
        }
        C11467l.Signature(this, "No signature for function: ");
        return null;
    }

    @Override // defpackage.AbstractC15940l
    /* JADX INFO: renamed from: else, reason: not valid java name */
    public final C12843l mo2441else() {
        return (C12843l) this.f18512l.getValue();
    }

    @Override // defpackage.InterfaceC6902l, defpackage.InterfaceC5059l
    public final boolean firebase() {
        C13698l c13698l = AbstractC15547l.remoteconfig;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[29];
        return c13698l.m3679package(this.f18513l);
    }

    @Override // defpackage.AbstractC15940l
    /* JADX INFO: renamed from: for, reason: not valid java name */
    public final List mo2442for() {
        return this.f18513l.mopub;
    }

    @Override // defpackage.InterfaceC6902l
    public final String getName() {
        return this.f18513l.loadAd;
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean purchase() {
        C13698l c13698l = AbstractC15547l.firebase;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[26];
        return c13698l.m3679package(this.f18513l);
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean signatures() {
        C13698l c13698l = AbstractC15547l.isPro;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[25];
        return c13698l.m3679package(this.f18513l);
    }

    @Override // defpackage.InterfaceC6902l
    public final InterfaceC13012l smaato() {
        return (InterfaceC13012l) this.f18514l.getValue();
    }

    @Override // defpackage.AbstractC6242l
    /* JADX INFO: renamed from: synchronized */
    public final EnumC9790l mo1541synchronized() {
        C10038l c10038l = AbstractC15547l.admob;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[23];
        return (EnumC9790l) c10038l.m2845finally(this.f18513l);
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean tapsense() {
        C13698l c13698l = AbstractC15547l.subs;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[24];
        return c13698l.m3679package(this.f18513l);
    }

    @Override // defpackage.AbstractC15940l
    /* JADX INFO: renamed from: throw, reason: not valid java name */
    public final C4258l mo2443throw() {
        return this.f18513l.amazon;
    }

    @Override // defpackage.InterfaceC5059l
    public final boolean vip() {
        C13698l c13698l = AbstractC15547l.smaato;
        InterfaceC13922l interfaceC13922l = AbstractC15547l.yandex[28];
        return c13698l.m3679package(this.f18513l);
    }
}

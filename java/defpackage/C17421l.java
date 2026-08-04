package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕٗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17421l implements InterfaceC12244l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Function1 f33956l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Function1 f33957l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C9459l f33958l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ C15738l f33959l;

    public C17421l(C15738l c15738l, C9459l c9459l, Function1 function1, Function1 function2) {
        this.f33959l = c15738l;
        this.f33958l = c9459l;
        this.f33957l = function1;
        this.f33956l = function2;
    }

    public final void crashlytics(InterfaceC17460l interfaceC17460l, Object obj, AbstractC2249l abstractC2249l) {
        Object objInvoke = this.f33956l.invoke(interfaceC17460l.amazon());
        boolean zMopub = this.f33959l.crashlytics.mopub();
        C9459l c9459l = this.f33958l;
        if (zMopub) {
            c9459l.mopub(this.f33956l.invoke(interfaceC17460l.loadAd()), objInvoke, (InterfaceC17807l) this.f33957l.invoke(interfaceC17460l));
        } else {
            c9459l.admob(objInvoke, (InterfaceC17807l) this.f33957l.invoke(interfaceC17460l), obj, abstractC2249l);
        }
    }

    @Override // defpackage.InterfaceC12244l
    public final Object getValue() {
        crashlytics(this.f33959l.crashlytics.billing(), null, null);
        return this.f33958l.f19321l.getValue();
    }
}

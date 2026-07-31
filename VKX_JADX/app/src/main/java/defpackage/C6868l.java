package defpackage;

import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lؙۥؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6868l extends AbstractC14971l implements InterfaceC7150l {

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public Function2 f14368l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f14369l;

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(AbstractC7563l.yandex(this.f14369l != 1 ? 0 : C15519l.isPro(j), C15519l.admob(j), this.f14369l == 2 ? C15519l.subs(j) : 0, C15519l.mopub(j)));
        int iPurchase = AbstractC8576l.purchase(abstractC10113lAdcel.f20592l, C15519l.isPro(j), C15519l.admob(j));
        int iPurchase2 = AbstractC8576l.purchase(abstractC10113lAdcel.f20591l, C15519l.subs(j), C15519l.mopub(j));
        return interfaceC7448l.isVip(iPurchase, iPurchase2, C14054l.f27396l, new C1247l(iPurchase, iPurchase2, 3, this, abstractC10113lAdcel, interfaceC7448l));
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.firebase(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.adcel(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.tapsense(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.vip(this, abstractC11754l, interfaceC6357l, i);
    }
}

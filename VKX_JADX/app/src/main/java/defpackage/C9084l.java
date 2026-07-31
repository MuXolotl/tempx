package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌ۟ۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9084l extends AbstractC11340l implements InterfaceC7150l, InterfaceC16388l, InterfaceC3506l, InterfaceC16031l, InterfaceC1905l {

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public C17005l f18668l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C8295l f18669l;

    public C9084l(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, C17005l c17005l) {
        this.f18668l = c17005l;
        C8295l c8295l = new C8295l(c3625l, c11090l, interfaceC16061l, function1, i, z, i2, i3, list, function2, c17005l, null);
        m3069l(c8295l);
        this.f18669l = c8295l;
        if (this.f18668l == null) {
            throw AbstractC1757l.m1043volatile("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }

    @Override // defpackage.InterfaceC7150l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        return this.f18669l.amazon(interfaceC7448l, interfaceC6357l, j);
    }

    @Override // defpackage.InterfaceC7150l
    public final int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f18669l.billing(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC3506l
    /* JADX INFO: renamed from: for */
    public final void mo1346for(InterfaceC18212l interfaceC18212l) {
        C17005l c17005l = this.f18668l;
        if (c17005l != null) {
            c17005l.f33139l = C0554l.signatures(c17005l.f33139l, interfaceC18212l, null, null, 6);
            C11611l c11611l = c17005l.f33136l;
            long j = c17005l.f33137l;
            c11611l.yandex = false;
            C15531l c15531l = c11611l.purchase;
            if (c15531l != null) {
                c15531l.invoke(Long.valueOf(j));
            }
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؘؓؖ */
    public final void mo535l() {
        C17005l c17005l = this.f18668l;
        if (c17005l != null) {
            c17005l.f33139l = C0554l.signatures(c17005l.f33139l, null, null, null, 3);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lّؗؑ */
    public final void mo511l() {
        C17005l c17005l = this.f18668l;
        if (c17005l != null) {
            c17005l.f33139l = C0554l.signatures(c17005l.f33139l, null, null, m2594l(), 3);
        }
    }

    @Override // defpackage.AbstractC14971l
    /* JADX INFO: renamed from: lؙٗۛ */
    public final boolean mo512l() {
        return false;
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: lؚۦ۠ */
    public final void mo536l(C6742l c6742l) throws Throwable {
        this.f18669l.mo536l(c6742l);
    }

    /* JADX INFO: renamed from: l٘ۦۢ, reason: contains not printable characters */
    public final C15920l m2594l() {
        C10700l c10700l = new C10700l();
        AbstractC3700l.admob(this, new C8652l(c10700l, this, 16));
        return (C15920l) c10700l.f21708l;
    }

    @Override // defpackage.InterfaceC7150l
    public final int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f18669l.mopub(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC7150l
    public final int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f18669l.subs(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC1905l
    /* JADX INFO: renamed from: while */
    public final void mo540while() {
        C17005l c17005l = this.f18668l;
        if (c17005l != null) {
            c17005l.f33139l = C0554l.signatures(c17005l.f33139l, null, null, m2594l(), 3);
        }
    }

    @Override // defpackage.InterfaceC7150l
    public final int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return this.f18669l.yandex(abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC16388l
    /* JADX INFO: renamed from: continue */
    public final /* synthetic */ void mo533continue() {
    }
}

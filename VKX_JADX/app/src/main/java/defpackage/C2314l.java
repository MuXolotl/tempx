package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؔؐۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C2314l implements InterfaceC5291l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C2314l f5023l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Function0 f5024l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final AbstractC4946l f5025l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final InterfaceC1220l f5026l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final InterfaceC16902l f5027l;

    public C2314l(AbstractC4946l abstractC4946l, Function0 function0, C2314l c2314l, InterfaceC16902l interfaceC16902l) {
        this.f5025l = abstractC4946l;
        this.f5024l = function0;
        this.f5023l = c2314l;
        this.f5027l = interfaceC16902l;
        this.f5026l = AbstractC9968l.crashlytics(2, new C8467l(7, this));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C2314l.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C2314l c2314l = (C2314l) obj;
        C2314l c2314l2 = this.f5023l;
        if (c2314l2 != null) {
            this = c2314l2;
        }
        C2314l c2314l3 = c2314l.f5023l;
        if (c2314l3 != null) {
            obj = c2314l3;
        }
        return this == obj;
    }

    @Override // defpackage.InterfaceC1925l
    public final List getParameters() {
        return C2580l.f5619l;
    }

    public final int hashCode() {
        C2314l c2314l = this.f5023l;
        return c2314l != null ? c2314l.hashCode() : super.hashCode();
    }

    @Override // defpackage.InterfaceC1925l
    public final boolean premium() {
        return false;
    }

    @Override // defpackage.InterfaceC1925l
    public final InterfaceC15234l pro() {
        return null;
    }

    @Override // defpackage.InterfaceC1925l
    public final AbstractC16860l subs() {
        return AbstractC12300l.billing(this.f5025l.loadAd());
    }

    @Override // defpackage.InterfaceC5291l
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final AbstractC4946l mo1127synchronized() {
        return this.f5025l;
    }

    public final String toString() {
        return "CapturedType(" + this.f5025l + ')';
    }

    @Override // defpackage.InterfaceC1925l
    public final Collection yandex() {
        List list = (List) this.f5026l.getValue();
        return list == null ? C2580l.f5619l : list;
    }

    public /* synthetic */ C2314l(AbstractC4946l abstractC4946l, C12426l c12426l, InterfaceC16902l interfaceC16902l, int i) {
        this(abstractC4946l, (i & 2) != 0 ? null : c12426l, (C2314l) null, (i & 8) != 0 ? null : interfaceC16902l);
    }
}

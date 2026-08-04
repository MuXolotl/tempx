package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍَۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10202l extends AbstractC2775l implements InterfaceC11865l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C8611l f20789l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public C5501l f20790l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final boolean f20791l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final AbstractC16860l f20792l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C16412l f20793l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public final C8688l f20794l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public InterfaceC4182l f20795l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Map f20796l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C0098l f20797l;

    public C10202l(C3498l c3498l, C16412l c16412l, AbstractC16860l abstractC16860l, int i) {
        super(C2782l.f6058l, c3498l);
        this.f20793l = c16412l;
        this.f20792l = abstractC16860l;
        if (!c3498l.f7383l) {
            C1759l.ads(c3498l, "Module name must be special: ");
            throw null;
        }
        this.f20796l = C14054l.f27396l;
        C8611l c8611l = (C8611l) mo2272switch(C18450l.f36049l);
        this.f20789l = c8611l == null ? C8611l.yandex : c8611l;
        this.f20791l = true;
        this.f20797l = c16412l.loadAd(new C6238l(28, this));
        this.f20794l = new C8688l(new C10750l(this, 1));
    }

    @Override // defpackage.InterfaceC8371l
    public final /* bridge */ InterfaceC8371l Signature() {
        return null;
    }

    @Override // defpackage.InterfaceC11865l
    /* JADX INFO: renamed from: catch */
    public final boolean mo2269catch(InterfaceC11865l interfaceC11865l) {
        if (this == interfaceC11865l) {
            return true;
        }
        this.f20790l.getClass();
        if (AbstractC16901l.inmobi(C5746l.f12138l, interfaceC11865l)) {
            return true;
        }
        mo2271l();
        return interfaceC11865l.mo2271l().contains(this);
    }

    @Override // defpackage.InterfaceC8371l
    /* JADX INFO: renamed from: import */
    public final Object mo1008import(InterfaceC15600l interfaceC15600l, Object obj) {
        return interfaceC15600l.startapp(this, obj);
    }

    @Override // defpackage.InterfaceC11865l
    /* JADX INFO: renamed from: lؚۣؒ */
    public final C10486l mo2270l(C2312l c2312l) {
        m2901l();
        return (C10486l) this.f20797l.invoke(c2312l);
    }

    @Override // defpackage.InterfaceC11865l
    /* JADX INFO: renamed from: lْٓؒ */
    public final List mo2271l() {
        if (this.f20790l != null) {
            return C2580l.f5619l;
        }
        C8339l.subs(AbstractC0653l.ads(new StringBuilder("Dependencies of module "), getName().f7384l, " were not set"));
        return null;
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final void m2901l() {
        if (this.f20791l) {
            return;
        }
        if (mo2272switch(AbstractC3953l.yandex) != null) {
            C18725l.loadAd();
        } else {
            throw new C17072l("Accessing invalid module descriptor " + this, 6);
        }
    }

    @Override // defpackage.InterfaceC11865l
    public final Collection remoteconfig(C2312l c2312l, Function1 function1) {
        m2901l();
        m2901l();
        return ((C2518l) this.f20794l.getValue()).remoteconfig(c2312l, function1);
    }

    @Override // defpackage.InterfaceC11865l
    public final AbstractC16860l subs() {
        return this.f20792l;
    }

    @Override // defpackage.InterfaceC11865l
    /* JADX INFO: renamed from: switch */
    public final Object mo2272switch(C10828l c10828l) {
        Object obj = this.f20796l.get(c10828l);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // defpackage.AbstractC2775l, defpackage.Cgoto
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2775l.m1246l(this));
        if (!this.f20791l) {
            sb.append(" !isValid");
        }
        sb.append(" packageFragmentProvider: ");
        InterfaceC4182l interfaceC4182l = this.f20795l;
        sb.append(interfaceC4182l != null ? interfaceC4182l.getClass().getSimpleName() : null);
        return sb.toString();
    }
}

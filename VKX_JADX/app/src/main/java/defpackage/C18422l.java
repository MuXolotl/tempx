package defpackage;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

/* JADX INFO: renamed from: lٚۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٚۥ;", "Llَّؓ;", "Llؒٙۚ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C18422l extends AbstractC12338l {

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public static final C13206l f35964l = new C13206l(7);

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f35965l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final Function3 f35966l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final boolean f35967l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final EnumC7283l f35968l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC6940l f35969l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final boolean f35970l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C2403l f35971l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final Function3 f35972l;

    public C18422l(InterfaceC6940l interfaceC6940l, EnumC7283l enumC7283l, boolean z, C2403l c2403l, boolean z2, C12349l c12349l, Function3 function3, boolean z3) {
        this.f35969l = interfaceC6940l;
        this.f35968l = enumC7283l;
        this.f35965l = z;
        this.f35971l = c2403l;
        this.f35970l = z2;
        this.f35972l = c12349l;
        this.f35966l = function3;
        this.f35967l = z3;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        boolean z;
        boolean z2;
        C1141l c1141l = (C1141l) abstractC14971l;
        InterfaceC6940l interfaceC6940l = c1141l.f3107l;
        InterfaceC6940l interfaceC6940l2 = this.f35969l;
        if (AbstractC8576l.yandex(interfaceC6940l, interfaceC6940l2)) {
            z = false;
        } else {
            c1141l.f3107l = interfaceC6940l2;
            z = true;
        }
        boolean z3 = c1141l.f3105l;
        boolean z4 = this.f35967l;
        if (z3 != z4) {
            c1141l.f3105l = z4;
            z2 = true;
        } else {
            z2 = z;
        }
        c1141l.f3106l = this.f35972l;
        c1141l.f3104l = this.f35966l;
        c1141l.f3108l = this.f35970l;
        c1141l.m3410l(f35964l, this.f35965l, this.f35971l, this.f35968l, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18422l.class != obj.getClass()) {
            return false;
        }
        C18422l c18422l = (C18422l) obj;
        return AbstractC8576l.yandex(this.f35969l, c18422l.f35969l) && this.f35968l == c18422l.f35968l && this.f35965l == c18422l.f35965l && AbstractC8576l.yandex(this.f35971l, c18422l.f35971l) && this.f35970l == c18422l.f35970l && AbstractC8576l.yandex(this.f35972l, c18422l.f35972l) && AbstractC8576l.yandex(this.f35966l, c18422l.f35966l) && this.f35967l == c18422l.f35967l;
    }

    public final int hashCode() {
        int iHashCode = (((this.f35968l.hashCode() + (this.f35969l.hashCode() * 31)) * 31) + (this.f35965l ? 1231 : 1237)) * 31;
        C2403l c2403l = this.f35971l;
        return ((this.f35966l.hashCode() + ((this.f35972l.hashCode() + ((((iHashCode + (c2403l != null ? c2403l.hashCode() : 0)) * 31) + (this.f35970l ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f35967l ? 1231 : 1237);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        C1141l c1141l = new C1141l(f35964l, this.f35965l, this.f35971l, this.f35968l);
        c1141l.f3107l = this.f35969l;
        c1141l.f3108l = this.f35970l;
        c1141l.f3106l = this.f35972l;
        c1141l.f3104l = this.f35966l;
        c1141l.f3105l = this.f35967l;
        return c1141l;
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٍۣۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C9839l implements InterfaceC17242l {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final InterfaceC17242l f20037l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC17242l f20038l;

    public C9839l(InterfaceC17242l interfaceC17242l, InterfaceC17242l interfaceC17242l2) {
        this.f20038l = interfaceC17242l;
        this.f20037l = interfaceC17242l2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C9839l)) {
            return false;
        }
        C9839l c9839l = (C9839l) obj;
        return AbstractC8576l.yandex(this.f20038l, c9839l.f20038l) && AbstractC8576l.yandex(this.f20037l, c9839l.f20037l);
    }

    public final int hashCode() {
        return (this.f20037l.hashCode() * 31) + this.f20038l.hashCode();
    }

    @Override // defpackage.InterfaceC17242l
    public final /* synthetic */ InterfaceC17242l premium(InterfaceC17242l interfaceC17242l) {
        return AbstractC15560l.admob(this, interfaceC17242l);
    }

    @Override // defpackage.InterfaceC17242l
    /* JADX INFO: renamed from: protected */
    public final boolean mo1539protected(Function1 function1) {
        return this.f20038l.mo1539protected(function1) && this.f20037l.mo1539protected(function1);
    }

    @Override // defpackage.InterfaceC17242l
    public final Object purchase(Object obj, Function2 function2) {
        return this.f20037l.purchase(this.f20038l.purchase(obj, function2), function2);
    }

    public final String toString() {
        return "[" + purchase("", C6415l.f13422l) + "]";
    }
}

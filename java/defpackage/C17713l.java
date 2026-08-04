package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: l٘ؗۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17713l implements InterfaceC6263l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4991l f34524l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f34525l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15271l f34526l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function0 f34527l;

    public C17713l(C15271l c15271l, int i, C4991l c4991l, Function0 function0) {
        this.f34526l = c15271l;
        this.f34525l = i;
        this.f34524l = c4991l;
        this.f34527l = function0;
    }

    @Override // defpackage.InterfaceC6263l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        long j2;
        if (interfaceC6357l.metrica(C15519l.mopub(j)) < C15519l.admob(j)) {
            j2 = j;
        } else {
            j2 = j;
            j = C15519l.yandex(0, Alert.DURATION_SHOW_INDEFINITELY, 0, 0, 13, j2);
        }
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(j);
        int iMin = Math.min(abstractC10113lAdcel.f20592l, C15519l.admob(j2));
        return interfaceC7448l.isVip(iMin, abstractC10113lAdcel.f20591l, C14054l.f27396l, new C0237l(this, interfaceC7448l, abstractC10113lAdcel, iMin, 1));
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.isPro(this, abstractC11754l, interfaceC6357l, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C17713l) {
            C17713l c17713l = (C17713l) obj;
            if (this.f34526l == c17713l.f34526l && this.f34525l == c17713l.f34525l && this.f34524l.equals(c17713l.f34524l) && AbstractC8576l.yandex(this.f34527l, c17713l.f34527l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f34527l.hashCode() + ((this.f34524l.hashCode() + (((this.f34526l.hashCode() * 31) + this.f34525l) * 31)) * 31);
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int mopub(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.startapp(this, abstractC11754l, interfaceC6357l, i);
    }

    @Override // defpackage.InterfaceC17242l
    public final /* synthetic */ InterfaceC17242l premium(InterfaceC17242l interfaceC17242l) {
        return AbstractC15560l.admob(this, interfaceC17242l);
    }

    @Override // defpackage.InterfaceC17242l
    /* JADX INFO: renamed from: protected */
    public final boolean mo1539protected(Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    @Override // defpackage.InterfaceC17242l
    public final Object purchase(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int subs(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.subscription(this, abstractC11754l, interfaceC6357l, i);
    }

    public final String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.f34526l + ", cursorOffset=" + this.f34525l + ", transformedText=" + this.f34524l + ", textLayoutResultProvider=" + this.f34527l + ")";
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.remoteconfig(this, abstractC11754l, interfaceC6357l, i);
    }
}

package defpackage;

import androidx.car.app.model.Alert;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًُْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7970l implements InterfaceC6263l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final C4991l f16626l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final int f16627l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C15271l f16628l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function0 f16629l;

    public C7970l(C15271l c15271l, int i, C4991l c4991l, Function0 function0) {
        this.f16628l = c15271l;
        this.f16627l = i;
        this.f16626l = c4991l;
        this.f16629l = function0;
    }

    @Override // defpackage.InterfaceC6263l
    public final InterfaceC17792l amazon(InterfaceC7448l interfaceC7448l, InterfaceC6357l interfaceC6357l, long j) {
        AbstractC10113l abstractC10113lAdcel = interfaceC6357l.adcel(C15519l.yandex(0, 0, 0, Alert.DURATION_SHOW_INDEFINITELY, 7, j));
        int iMin = Math.min(abstractC10113lAdcel.f20591l, C15519l.mopub(j));
        return interfaceC7448l.isVip(abstractC10113lAdcel.f20592l, iMin, C14054l.f27396l, new C8608l(this, abstractC10113lAdcel, iMin, 8));
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int billing(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.isPro(this, abstractC11754l, interfaceC6357l, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7970l) {
            C7970l c7970l = (C7970l) obj;
            if (this.f16628l == c7970l.f16628l && this.f16627l == c7970l.f16627l && this.f16626l.equals(c7970l.f16626l) && AbstractC8576l.yandex(this.f16629l, c7970l.f16629l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16629l.hashCode() + ((this.f16626l.hashCode() + (((this.f16628l.hashCode() * 31) + this.f16627l) * 31)) * 31);
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
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.f16628l + ", cursorOffset=" + this.f16627l + ", transformedText=" + this.f16626l + ", textLayoutResultProvider=" + this.f16629l + ")";
    }

    @Override // defpackage.InterfaceC6263l
    public final /* synthetic */ int yandex(AbstractC11754l abstractC11754l, InterfaceC6357l interfaceC6357l, int i) {
        return AbstractC1757l.remoteconfig(this, abstractC11754l, interfaceC6357l, i);
    }
}

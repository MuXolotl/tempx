package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؔؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llؔؗۗ;", "Llَّؓ;", "Llًؚ۟;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C2423l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC16061l f5182l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f5183l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f5184l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11090l f5185l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3625l f5186l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Function1 f5187l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f5188l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function1 f5189l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f5190l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f5191l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final Function1 f5192l;

    public C2423l(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, Function1 function3) {
        this.f5186l = c3625l;
        this.f5185l = c11090l;
        this.f5182l = interfaceC16061l;
        this.f5189l = function1;
        this.f5188l = i;
        this.f5191l = z;
        this.f5183l = i2;
        this.f5184l = i3;
        this.f5190l = list;
        this.f5187l = function2;
        this.f5192l = function3;
    }

    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        boolean z;
        C8295l c8295l = (C8295l) abstractC14971l;
        C11090l c11090l = c8295l.f17186l;
        C11090l c11090l2 = this.f5185l;
        if (c11090l2 != c11090l) {
            if (!c11090l2.yandex.loadAd(c11090l.yandex)) {
                z = true;
            }
            c8295l.m2294l(z, c8295l.m2297l(this.f5186l), c8295l.m2293l(this.f5185l, this.f5190l, this.f5184l, this.f5183l, this.f5191l, this.f5182l, this.f5188l), c8295l.m2298l(this.f5189l, this.f5187l, null, this.f5192l));
        }
        c11090l2.getClass();
        z = false;
        c8295l.m2294l(z, c8295l.m2297l(this.f5186l), c8295l.m2293l(this.f5185l, this.f5190l, this.f5184l, this.f5183l, this.f5191l, this.f5182l, this.f5188l), c8295l.m2298l(this.f5189l, this.f5187l, null, this.f5192l));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2423l)) {
            return false;
        }
        C2423l c2423l = (C2423l) obj;
        return AbstractC8576l.yandex(this.f5186l, c2423l.f5186l) && AbstractC8576l.yandex(this.f5185l, c2423l.f5185l) && AbstractC8576l.yandex(this.f5190l, c2423l.f5190l) && AbstractC8576l.yandex(this.f5182l, c2423l.f5182l) && this.f5189l == c2423l.f5189l && this.f5192l == c2423l.f5192l && this.f5188l == c2423l.f5188l && this.f5191l == c2423l.f5191l && this.f5183l == c2423l.f5183l && this.f5184l == c2423l.f5184l && this.f5187l == c2423l.f5187l;
    }

    public final int hashCode() {
        int iHashCode = (this.f5182l.hashCode() + AbstractC12589l.isVip(this.f5185l, this.f5186l.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.f5189l;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.f5188l) * 31) + (this.f5191l ? 1231 : 1237)) * 31) + this.f5183l) * 31) + this.f5184l) * 31;
        List list = this.f5190l;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.f5187l;
        int iHashCode4 = (iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 29791;
        Function1 function3 = this.f5192l;
        return iHashCode4 + (function3 != null ? function3.hashCode() : 0);
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C8295l(this.f5186l, this.f5185l, this.f5182l, this.f5189l, this.f5188l, this.f5191l, this.f5183l, this.f5184l, this.f5190l, this.f5187l, null, this.f5192l);
    }
}

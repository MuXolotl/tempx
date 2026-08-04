package defpackage;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٍۧ۟, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Llٍۧ۟;", "Llَّؓ;", "Llٌ۟ۗ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C9972l extends AbstractC12338l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final InterfaceC16061l f20354l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final int f20355l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final int f20356l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C11090l f20357l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final C3625l f20358l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final Function1 f20359l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final int f20360l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final Function1 f20361l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final List f20362l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final boolean f20363l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C17005l f20364l;

    public C9972l(C3625l c3625l, C11090l c11090l, InterfaceC16061l interfaceC16061l, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function2, C17005l c17005l) {
        this.f20358l = c3625l;
        this.f20357l = c11090l;
        this.f20354l = interfaceC16061l;
        this.f20361l = function1;
        this.f20360l = i;
        this.f20363l = z;
        this.f20355l = i2;
        this.f20356l = i3;
        this.f20362l = list;
        this.f20359l = function2;
        this.f20364l = c17005l;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0045  */
    @Override // defpackage.AbstractC12338l
    public final void admob(AbstractC14971l abstractC14971l) {
        boolean z;
        C17005l c17005l;
        C9084l c9084l = (C9084l) abstractC14971l;
        C8295l c8295l = c9084l.f18669l;
        C11090l c11090l = c8295l.f17186l;
        C11090l c11090l2 = this.f20357l;
        if (c11090l2 != c11090l) {
            if (!c11090l2.yandex.loadAd(c11090l.yandex)) {
                z = true;
            }
            boolean zM2297l = c8295l.m2297l(this.f20358l);
            boolean zM2293l = c9084l.f18669l.m2293l(c11090l2, this.f20362l, this.f20356l, this.f20355l, this.f20363l, this.f20354l, this.f20360l);
            Function1 function1 = this.f20361l;
            Function1 function2 = this.f20359l;
            c17005l = this.f20364l;
            c8295l.m2294l(z, zM2297l, zM2293l, c8295l.m2298l(function1, function2, c17005l, null));
            c9084l.f18668l = c17005l;
            if (c17005l != null) {
                c17005l.f33139l = C0554l.signatures(c17005l.f33139l, null, null, c9084l.m2594l(), 3);
            }
            AbstractC4047l.isPro(c9084l);
        }
        c11090l2.getClass();
        z = false;
        boolean zM2297l2 = c8295l.m2297l(this.f20358l);
        boolean zM2293l2 = c9084l.f18669l.m2293l(c11090l2, this.f20362l, this.f20356l, this.f20355l, this.f20363l, this.f20354l, this.f20360l);
        Function1 function3 = this.f20361l;
        Function1 function4 = this.f20359l;
        c17005l = this.f20364l;
        c8295l.m2294l(z, zM2297l2, zM2293l2, c8295l.m2298l(function3, function4, c17005l, null));
        c9084l.f18668l = c17005l;
        if (c17005l != null) {
            c17005l.f33139l = C0554l.signatures(c17005l.f33139l, null, null, c9084l.m2594l(), 3);
        }
        AbstractC4047l.isPro(c9084l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9972l)) {
            return false;
        }
        C9972l c9972l = (C9972l) obj;
        return AbstractC8576l.yandex(this.f20358l, c9972l.f20358l) && AbstractC8576l.yandex(this.f20357l, c9972l.f20357l) && AbstractC8576l.yandex(this.f20362l, c9972l.f20362l) && AbstractC8576l.yandex(this.f20354l, c9972l.f20354l) && this.f20361l == c9972l.f20361l && this.f20360l == c9972l.f20360l && this.f20363l == c9972l.f20363l && this.f20355l == c9972l.f20355l && this.f20356l == c9972l.f20356l && this.f20359l == c9972l.f20359l && AbstractC8576l.yandex(this.f20364l, c9972l.f20364l);
    }

    public final int hashCode() {
        int iHashCode = (this.f20354l.hashCode() + AbstractC12589l.isVip(this.f20357l, this.f20358l.hashCode() * 31, 31)) * 31;
        Function1 function1 = this.f20361l;
        int iHashCode2 = (((((((((iHashCode + (function1 != null ? function1.hashCode() : 0)) * 31) + this.f20360l) * 31) + (this.f20363l ? 1231 : 1237)) * 31) + this.f20355l) * 31) + this.f20356l) * 31;
        List list = this.f20362l;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        Function1 function2 = this.f20359l;
        int iHashCode4 = (iHashCode3 + (function2 != null ? function2.hashCode() : 0)) * 31;
        C17005l c17005l = this.f20364l;
        return (iHashCode4 + (c17005l != null ? c17005l.hashCode() : 0)) * 961;
    }

    @Override // defpackage.AbstractC12338l
    public final AbstractC14971l loadAd() {
        return new C9084l(this.f20358l, this.f20357l, this.f20354l, this.f20361l, this.f20360l, this.f20363l, this.f20355l, this.f20356l, this.f20362l, this.f20359l, this.f20364l);
    }
}

package defpackage;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lؘؘٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C5487l {
    public final InterfaceC17807l loadAd;
    public final Function1 yandex;

    public C5487l(Function1 function1, InterfaceC17807l interfaceC17807l) {
        this.yandex = function1;
        this.loadAd = interfaceC17807l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5487l)) {
            return false;
        }
        C5487l c5487l = (C5487l) obj;
        return this.yandex.equals(c5487l.yandex) && this.loadAd.equals(c5487l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.yandex + ", animationSpec=" + this.loadAd + ")";
    }
}

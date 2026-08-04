package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًّؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7725l extends AbstractC16682l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final C12899l f16217l = new C12899l(7);

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final List f16218l;

    public C7725l() {
        ArrayList arrayList = new ArrayList();
        super(f16217l);
        this.f16218l = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7725l) && AbstractC8576l.yandex(this.f16218l, ((C7725l) obj).f16218l);
    }

    public final int hashCode() {
        return this.f16218l.hashCode();
    }

    public final String toString() {
        return AbstractC2812l.tapsense(new StringBuilder("PluginsTrace("), AbstractC16901l.m4210case(this.f16218l, null, null, null, null, 63), ')');
    }
}

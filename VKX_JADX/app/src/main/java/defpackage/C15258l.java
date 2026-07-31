package defpackage;

import java.util.ArrayList;

/* JADX INFO: renamed from: lٔۢٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C15258l extends AbstractC11904l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public static final C18061l f29849l = new C18061l(3, AbstractC18202l.yandex.loadAd(C15258l.class), 2, null);

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final boolean f29850l;

    public C15258l(boolean z, C3844l c3844l) {
        super(f29849l, c3844l);
        this.f29850l = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C15258l)) {
            return false;
        }
        C15258l c15258l = (C15258l) obj;
        return AbstractC8576l.yandex(yandex(), c15258l.yandex()) && this.f29850l == c15258l.f29850l;
    }

    public final int hashCode() {
        int i = this.f23747l;
        if (i != 0) {
            return i;
        }
        int iHashCode = (yandex().hashCode() * 37) + (this.f29850l ? 1231 : 1237);
        this.f23747l = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        AbstractC9029l.ad(new StringBuilder("ok="), this.f29850l, arrayList);
        return AbstractC16901l.m4210case(arrayList, ", ", "SparkNoResponse{", "}", null, 56);
    }
}

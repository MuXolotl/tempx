package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٓۙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C14378l<C> {
    public static final C9664l Companion = new C9664l();
    public static final C13637l crashlytics;
    public final int loadAd;
    public final List yandex;

    static {
        C13637l c13637l = new C13637l("com.arkivanov.decompose.router.pages.Pages", null, 2);
        c13637l.smaato("items", false);
        c13637l.smaato("selectedIndex", false);
        crashlytics = c13637l;
    }

    public /* synthetic */ C14378l(int i, int i2, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, crashlytics);
            throw null;
        }
        this.yandex = list;
        this.loadAd = i2;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i2 < 0 || i2 >= size) {
            C18073l.vip("The selectedIndex argument must be with the range: ", AbstractC14055l.firebase(list), ". Actual: ", i2, 46);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14378l)) {
            return false;
        }
        C14378l c14378l = (C14378l) obj;
        return AbstractC8576l.yandex(this.yandex, c14378l.yandex) && this.loadAd == c14378l.loadAd;
    }

    public final int hashCode() {
        return (this.yandex.hashCode() * 31) + this.loadAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Pages(items=");
        sb.append(this.yandex);
        sb.append(", selectedIndex=");
        return AbstractC0653l.adcel(sb, this.loadAd, ')');
    }

    public C14378l(int i, List list) {
        this.yandex = list;
        this.loadAd = i;
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        if (i < 0 || i >= size) {
            C18073l.vip("The selectedIndex argument must be with the range: ", AbstractC14055l.firebase(list), ". Actual: ", i, 46);
            throw null;
        }
    }
}

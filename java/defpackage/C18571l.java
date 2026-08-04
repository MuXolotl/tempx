package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC8296l
public final class C18571l {
    public static final C10275l Companion = new C10275l();
    public static final InterfaceC1220l[] crashlytics = {null, AbstractC9968l.crashlytics(2, new C5146l(4))};
    public final List loadAd;
    public final String yandex;

    public /* synthetic */ C18571l(int i, String str, List list) {
        if (3 != (i & 3)) {
            AbstractC11036l.isPro(i, 3, C4924l.yandex.purchase());
            throw null;
        }
        this.yandex = str;
        this.loadAd = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18571l)) {
            return false;
        }
        C18571l c18571l = (C18571l) obj;
        return AbstractC8576l.yandex(this.yandex, c18571l.yandex) && AbstractC8576l.yandex(this.loadAd, c18571l.loadAd);
    }

    public final int hashCode() {
        return this.loadAd.hashCode() + (this.yandex.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RootAccentGroup(nameId=");
        sb.append(this.yandex);
        sb.append(", accents=");
        return AbstractC0653l.subscription(sb, this.loadAd, ')');
    }
}

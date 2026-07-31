package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lِٖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16631l extends AbstractC11393l {
    public final int crashlytics;
    public final List loadAd;

    public C16631l(int i, String str, List list) {
        super(str);
        this.loadAd = list;
        this.crashlytics = i;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!AbstractC10436l.crashlytics.amazon(((C14345l) it.next()).yandex)) {
                throw new C15157l("Parameter name should be a token");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C16631l)) {
            return false;
        }
        C16631l c16631l = (C16631l) obj;
        return c16631l.yandex.equalsIgnoreCase(this.yandex) && AbstractC8576l.yandex(c16631l.loadAd, this.loadAd);
    }

    public final int hashCode() {
        return AbstractC8669l.m2415super(new Object[]{this.yandex.toLowerCase(Locale.ROOT), this.loadAd}).hashCode();
    }

    @Override // defpackage.AbstractC11393l
    public final String yandex() {
        List list = this.loadAd;
        boolean zIsEmpty = list.isEmpty();
        String str = this.yandex;
        return zIsEmpty ? str : AbstractC16901l.m4210case(list, ", ", str.concat(" "), null, new C2221l(this, this.crashlytics, 8), 28);
    }
}

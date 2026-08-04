package defpackage;

import java.util.Locale;

/* JADX INFO: renamed from: lؘٓ۠, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5678l extends AbstractC11393l {
    public final String loadAd;

    public C5678l(String str, String str2) {
        super(str);
        this.loadAd = str2;
        if (!AbstractC10436l.crashlytics.amazon(str2)) {
            throw new C15157l("Invalid blob value: it should be token68");
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5678l)) {
            return false;
        }
        C5678l c5678l = (C5678l) obj;
        return c5678l.yandex.equalsIgnoreCase(this.yandex) && AbstractC16648l.license(c5678l.loadAd, this.loadAd, true);
    }

    public final int hashCode() {
        Locale locale = Locale.ROOT;
        return AbstractC8669l.m2415super(new Object[]{this.yandex.toLowerCase(locale), this.loadAd.toLowerCase(locale)}).hashCode();
    }

    @Override // defpackage.AbstractC11393l
    public final String yandex() {
        return this.yandex + ' ' + this.loadAd;
    }
}

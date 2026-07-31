package defpackage;

import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: renamed from: lؒؖۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0842l extends AbstractC18512l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f2488l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f2489l;

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final String m697l() {
        m4564l();
        return this.f2488l;
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final long m698l() {
        m4564l();
        return this.f2489l;
    }

    @Override // defpackage.AbstractC18512l
    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final boolean mo699l() {
        Calendar calendar = Calendar.getInstance();
        this.f2489l = ((long) (calendar.get(16) + calendar.get(15))) / 60000;
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        this.f2488l = AbstractC9361l.ad(new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length()), lowerCase, "-", lowerCase2);
        return false;
    }
}

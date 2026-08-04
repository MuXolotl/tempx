package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: lؘؕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5435l extends AbstractC10491l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C3071l f11653l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final C3071l f11654l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final C3071l f11655l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final HashMap f11656l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C3071l f11657l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C3071l f11658l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C3071l f11659l;

    public C5435l(C6901l c6901l) {
        super(c6901l);
        this.f11656l = new HashMap();
        C16386l c16386l = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l);
        this.f11658l = new C3071l(c16386l, "last_delete_stale", 0L);
        C16386l c16386l2 = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l2);
        this.f11653l = new C3071l(c16386l2, "last_delete_stale_batch", 0L);
        C16386l c16386l3 = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l3);
        this.f11654l = new C3071l(c16386l3, "backoff", 0L);
        C16386l c16386l4 = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l4);
        this.f11657l = new C3071l(c16386l4, "last_upload", 0L);
        C16386l c16386l5 = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l5);
        this.f11655l = new C3071l(c16386l5, "last_upload_attempt", 0L);
        C16386l c16386l6 = ((C17417l) this.f833l).f33944l;
        C17417l.billing(c16386l6);
        this.f11659l = new C3071l(c16386l6, "midnight_offset", 0L);
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final Pair m1777l(String str) {
        C16188l c16188l;
        C10997l c10997lYandex;
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        C18450l c18450l = c17417l.f33951l;
        C5051l c5051l = c17417l.f33945l;
        c18450l.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.f11656l;
        C16188l c16188l2 = (C16188l) map.get(str);
        if (c16188l2 != null && jElapsedRealtime < c16188l2.crashlytics) {
            return new Pair(c16188l2.yandex, Boolean.valueOf(c16188l2.loadAd));
        }
        long jM1674l = c5051l.m1674l(str, AbstractC5981l.loadAd) + jElapsedRealtime;
        try {
            try {
                c10997lYandex = C7715l.yandex(c17417l.f33936l);
            } catch (PackageManager.NameNotFoundException unused) {
                if (c16188l2 != null && jElapsedRealtime < c16188l2.crashlytics + c5051l.m1674l(str, AbstractC5981l.crashlytics)) {
                    return new Pair(c16188l2.yandex, Boolean.valueOf(c16188l2.loadAd));
                }
                c10997lYandex = null;
            }
            if (c10997lYandex == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String str2 = c10997lYandex.crashlytics;
            c16188l = str2 != null ? new C16188l(jM1674l, str2, c10997lYandex.loadAd) : new C16188l(jM1674l, "", c10997lYandex.loadAd);
            map.put(str, c16188l);
            return new Pair(c16188l.yandex, Boolean.valueOf(c16188l.loadAd));
        } catch (Exception e) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16918l.loadAd(e, "Unable to get advertising id");
            c16188l = new C16188l(jM1674l, "", false);
        }
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final Pair m1778l(C10462l c10462l, C10559l c10559l) {
        String str = c10462l.f21296l;
        AbstractC1051l.billing(str);
        return (c10559l.subs(EnumC3170l.AD_STORAGE) && c10462l.f21313l) ? m1777l(str) : new Pair("", Boolean.FALSE);
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final String m1779l(C10462l c10462l, C10559l c10559l) {
        String str = c10462l.f21296l;
        AbstractC1051l.billing(str);
        if (!c10559l.subs(EnumC3170l.AD_STORAGE) || !c10462l.f21313l) {
            return "";
        }
        mo211l();
        String str2 = (String) m1777l(str).first;
        MessageDigest messageDigestM4330l = C17410l.m4330l();
        if (messageDigestM4330l == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestM4330l.digest(str2.getBytes())));
    }

    @Override // defpackage.AbstractC10491l
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void mo1780l() {
    }
}

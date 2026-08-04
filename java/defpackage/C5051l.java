package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: lؗٞٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C5051l extends Cgoto {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Boolean f10318l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC8112l f10319l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f10320l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public Boolean f10321l;

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final long m1674l(String str, C3032l c3032l) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) c3032l.yandex(null)).longValue();
        }
        String strMo2259implements = this.f10319l.mo2259implements(str, c3032l.yandex);
        if (TextUtils.isEmpty(strMo2259implements)) {
            return ((Long) c3032l.yandex(null)).longValue();
        }
        try {
            return ((Long) c3032l.yandex(Long.valueOf(Long.parseLong(strMo2259implements)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) c3032l.yandex(null)).longValue();
        }
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final int m1675l(String str, boolean z) {
        return Math.max(z ? Math.max(Math.min(m1683l(str, AbstractC5981l.f12706this), 500), 100) : 500, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final String m1676l(String str) {
        C17417l c17417l = (C17417l) this.f833l;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            AbstractC1051l.subs(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            C8118l c8118l3 = c17417l.f33950l;
            C17417l.admob(c8118l3);
            c8118l3.f16908l.loadAd(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            C8118l c8118l4 = c17417l.f33950l;
            C17417l.admob(c8118l4);
            c8118l4.f16908l.loadAd(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final boolean m1677l() {
        Boolean boolM1685l = m1685l("google_analytics_automatic_screen_reporting_enabled");
        return boolM1685l == null || boolM1685l.booleanValue();
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m1678l() {
        ((C17417l) this.f833l).getClass();
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final double m1679l(String str, C3032l c3032l) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) c3032l.yandex(null)).doubleValue();
        }
        String strMo2259implements = this.f10319l.mo2259implements(str, c3032l.yandex);
        if (TextUtils.isEmpty(strMo2259implements)) {
            return ((Double) c3032l.yandex(null)).doubleValue();
        }
        try {
            return ((Double) c3032l.yandex(Double.valueOf(Double.parseDouble(strMo2259implements)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) c3032l.yandex(null)).doubleValue();
        }
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final Bundle m1680l() {
        C17417l c17417l = (C17417l) this.f833l;
        try {
            Context context = c17417l.f33936l;
            Context context2 = c17417l.f33936l;
            C8118l c8118l = c17417l.f33950l;
            if (context.getPackageManager() == null) {
                C17417l.admob(c8118l);
                c8118l.f16908l.yandex("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfoYandex = C16797l.yandex(context2).yandex(128, context2.getPackageName());
            if (applicationInfoYandex != null) {
                return applicationInfoYandex.metaData;
            }
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Failed to load metadata: ApplicationInfo is null");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final String m1681l(String str, C3032l c3032l) {
        return TextUtils.isEmpty(str) ? (String) c3032l.yandex(null) : (String) c3032l.yandex(this.f10319l.mo2259implements(str, c3032l.yandex));
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final boolean m1682l(String str, C3032l c3032l) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) c3032l.yandex(null)).booleanValue();
        }
        String strMo2259implements = this.f10319l.mo2259implements(str, c3032l.yandex);
        return TextUtils.isEmpty(strMo2259implements) ? ((Boolean) c3032l.yandex(null)).booleanValue() : ((Boolean) c3032l.yandex(Boolean.valueOf("1".equals(strMo2259implements)))).booleanValue();
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final int m1683l(String str, C3032l c3032l) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) c3032l.yandex(null)).intValue();
        }
        String strMo2259implements = this.f10319l.mo2259implements(str, c3032l.yandex);
        if (TextUtils.isEmpty(strMo2259implements)) {
            return ((Integer) c3032l.yandex(null)).intValue();
        }
        try {
            return ((Integer) c3032l.yandex(Integer.valueOf(Integer.parseInt(strMo2259implements)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) c3032l.yandex(null)).intValue();
        }
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final boolean m1684l() {
        if (this.f10318l == null) {
            Boolean boolM1685l = m1685l("app_measurement_lite");
            this.f10318l = boolM1685l;
            if (boolM1685l == null) {
                this.f10318l = Boolean.FALSE;
            }
        }
        return this.f10318l.booleanValue() || !((C17417l) this.f833l).f33935l;
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final Boolean m1685l(String str) {
        AbstractC1051l.billing(str);
        Bundle bundleM1680l = m1680l();
        if (bundleM1680l != null) {
            if (bundleM1680l.containsKey(str)) {
                return Boolean.valueOf(bundleM1680l.getBoolean(str));
            }
            return null;
        }
        C8118l c8118l = ((C17417l) this.f833l).f33950l;
        C17417l.admob(c8118l);
        c8118l.f16908l.yandex("Failed to load metadata: Metadata bundle is null");
        return null;
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final boolean m1686l() {
        ((C17417l) this.f833l).getClass();
        Boolean boolM1685l = m1685l("firebase_analytics_collection_deactivated");
        return boolM1685l != null && boolM1685l.booleanValue();
    }

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public final boolean m1687l(String str) {
        return "1".equals(this.f10319l.mo2259implements(str, "measurement.event_sampling_enabled"));
    }

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public final boolean m1688l(String str) {
        C17417l.billing(((C17417l) this.f833l).f33949l);
        if (C17410l.m4331l((String) AbstractC5981l.f12682l.yandex(null), str) || C17410l.m4331l((String) AbstractC5981l.f12665l.yandex(null), str) || C17410l.m4331l((String) AbstractC5981l.f12671l.yandex(null), str)) {
            return true;
        }
        return "1".equals(this.f10319l.mo2259implements(str, "gaia_collection_enabled"));
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final EnumC17672l m1689l(String str, boolean z) {
        Object obj;
        AbstractC1051l.billing(str);
        C17417l c17417l = (C17417l) this.f833l;
        Bundle bundleM1680l = m1680l();
        if (bundleM1680l == null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = bundleM1680l.get(str);
        }
        EnumC17672l enumC17672l = EnumC17672l.UNINITIALIZED;
        if (obj == null) {
            return enumC17672l;
        }
        if (Boolean.TRUE.equals(obj)) {
            return EnumC17672l.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return EnumC17672l.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return EnumC17672l.POLICY;
        }
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.admob(c8118l2);
        c8118l2.f16910l.loadAd(str, "Invalid manifest metadata for");
        return enumC17672l;
    }
}

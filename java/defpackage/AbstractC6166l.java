package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: renamed from: lؙؐٝ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6166l {
    public static final C13708l yandex = AbstractC1186l.premium("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static final String amazon(EnumC5903l enumC5903l, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < enumC5903l.zza()) ? "0" : String.valueOf(str.charAt(enumC5903l.zza() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= enumC5903l.zza()) {
            strValueOf = String.valueOf(str2.charAt(enumC5903l.zza() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean billing(EnumC5903l enumC5903l, char[] cArr, String str, boolean z) {
        char c;
        int iCrashlytics = crashlytics(enumC5903l);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= enumC5903l.zza()) {
                char cCharAt = str.charAt(enumC5903l.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iCrashlytics > 0 && cArr[iCrashlytics] != '2') {
                    cArr[iCrashlytics] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iCrashlytics > 0 && cArr[iCrashlytics] != '2') {
            cArr[iCrashlytics] = c;
        }
        return false;
    }

    public static final int crashlytics(EnumC5903l enumC5903l) {
        if (enumC5903l == EnumC5903l.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (enumC5903l == EnumC5903l.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (enumC5903l == EnumC5903l.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return enumC5903l == EnumC5903l.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final boolean loadAd(EnumC5903l enumC5903l, C15333l c15333l, C15333l c15333l2, C12950l c12950l, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        EnumC11157l enumC11157l;
        char c;
        int iCrashlytics = crashlytics(enumC5903l);
        if (iCrashlytics > 0 && (i2 != 1 || i != 1)) {
            cArr[iCrashlytics] = '2';
        }
        if (mopub(enumC5903l, c15333l2) == EnumC1704l.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (enumC5903l == EnumC5903l.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && c12950l.f25402l.equals(str)) {
                if (iCrashlytics > 0 && cArr[iCrashlytics] != '2') {
                    cArr[iCrashlytics] = '1';
                }
                return true;
            }
            if (c15333l.containsKey(enumC5903l) && (enumC11157l = (EnumC11157l) c15333l.get(enumC5903l)) != null) {
                int iOrdinal = enumC11157l.ordinal();
                EnumC1704l enumC1704l = EnumC1704l.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    EnumC1704l enumC1704l2 = EnumC1704l.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return mopub(enumC5903l, c15333l2) == enumC1704l ? billing(enumC5903l, cArr, str3, z2) : purchase(enumC5903l, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return mopub(enumC5903l, c15333l2) == enumC1704l2 ? purchase(enumC5903l, cArr, str2, z) : billing(enumC5903l, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (mopub(enumC5903l, c15333l2) != enumC1704l2) {
                        return billing(enumC5903l, cArr, str3, z2);
                    }
                } else if (mopub(enumC5903l, c15333l2) != enumC1704l) {
                    return purchase(enumC5903l, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iCrashlytics <= 0 || cArr[iCrashlytics] == '2') {
            return false;
        }
        cArr[iCrashlytics] = c;
        return false;
    }

    public static final EnumC1704l mopub(EnumC5903l enumC5903l, C15333l c15333l) {
        Object obj = c15333l.get(enumC5903l);
        if (obj == null) {
            obj = EnumC1704l.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (EnumC1704l) obj;
    }

    public static final boolean purchase(EnumC5903l enumC5903l, char[] cArr, String str, boolean z) {
        char c;
        int iCrashlytics = crashlytics(enumC5903l);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= enumC5903l.zza()) {
                char cCharAt = str.charAt(enumC5903l.zza() - 1);
                boolean z2 = cCharAt == '1';
                if (iCrashlytics > 0 && cArr[iCrashlytics] != '2') {
                    cArr[iCrashlytics] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iCrashlytics > 0 && cArr[iCrashlytics] != '2') {
            cArr[iCrashlytics] = c;
        }
        return false;
    }

    public static String yandex(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }
}

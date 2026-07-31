package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Comparator;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lؙِؚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11675l extends AbstractC10618l {

    /* JADX INFO: renamed from: lؒٝ, reason: contains not printable characters */
    public C6820l f23405l;

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public C6820l f23406l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f23407l;

    /* JADX INFO: renamed from: lؔۗؑ, reason: contains not printable characters */
    public SharedPreferencesOnSharedPreferenceChangeListenerC10450l f23408l;

    /* JADX INFO: renamed from: lؕؒ, reason: contains not printable characters */
    public C6820l f23409l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final AtomicReference f23410l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public final AtomicLong f23411l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public boolean f23412l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public long f23413l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public boolean f23414l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public C10559l f23415l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public C5633l f23416l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public C14692l f23417l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C6820l f23418l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final Object f23419l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final CopyOnWriteArraySet f23420l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public int f23421l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public PriorityQueue f23422l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public final C10866l f23423l;

    /* JADX INFO: renamed from: l٘ٞؒ, reason: contains not printable characters */
    public final C10866l f23424l;

    public C11675l(C17417l c17417l) {
        super(c17417l);
        this.f23420l = new CopyOnWriteArraySet();
        this.f23419l = new Object();
        this.f23414l = false;
        this.f23421l = 1;
        this.f23412l = true;
        this.f23424l = new C10866l(this);
        this.f23410l = new AtomicReference();
        this.f23415l = C10559l.crashlytics;
        this.f23413l = -1L;
        this.f23411l = new AtomicLong(0L);
        this.f23423l = new C10866l(c17417l);
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final void m3185l() {
        C17417l c17417l = (C17417l) this.f833l;
        if (!(c17417l.f33936l.getApplicationContext() instanceof Application) || this.f23417l == null) {
            return;
        }
        ((Application) c17417l.f33936l.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.f23417l);
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m3186l(long j, long j2, Bundle bundle, String str, String str2) {
        mo211l();
        boolean z = true;
        if (this.f23416l != null && !C17410l.m4345l(str2)) {
            z = false;
        }
        m3198l(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX INFO: renamed from: lؙؖٗ, reason: contains not printable characters */
    public final void m3187l() {
        C2156l.yandex();
        C17417l c17417l = (C17417l) this.f833l;
        C5051l c5051l = c17417l.f33945l;
        C17923l c17923l = c17417l.f33929l;
        C8118l c8118l = c17417l.f33950l;
        if (c5051l.m1682l(null, AbstractC5981l.f12668l)) {
            C17417l.admob(c17923l);
            if (c17923l.m4444l()) {
                C17417l.admob(c8118l);
                c8118l.f16908l.yandex("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (C6162l.tapsense()) {
                C17417l.admob(c8118l);
                c8118l.f16908l.yandex("Cannot get trigger URIs from main thread");
                return;
            }
            m2935l();
            C17417l.admob(c8118l);
            c8118l.f16911l.yandex("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            C17417l.admob(c17923l);
            c17923l.m4445l(atomicReference, 10000L, "get trigger URIs", new RunnableC15832l(this, atomicReference, 5, false));
            final List list = (List) atomicReference.get();
            if (list == null) {
                C17417l.admob(c8118l);
                c8118l.f16915l.yandex("Timed out waiting for get trigger URIs");
            } else {
                C17417l.admob(c17923l);
                c17923l.m4449l(new Runnable() { // from class: lِٙۥ
                    @Override // java.lang.Runnable
                    public final void run() {
                        C11675l c11675l = this.f23782l;
                        c11675l.mo211l();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        C16386l c16386l = ((C17417l) c11675l.f833l).f33944l;
                        C17417l.billing(c16386l);
                        SparseArray sparseArrayM4181l = c16386l.m4181l();
                        for (C11536l c11536l : list) {
                            int i = c11536l.f23202l;
                            if (!sparseArrayM4181l.contains(i) || ((Long) sparseArrayM4181l.get(i)).longValue() < c11536l.f23203l) {
                                c11675l.m3204l().add(c11536l);
                            }
                        }
                        c11675l.m3199l();
                    }
                });
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
    
        if (r3 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a3, code lost:
    
        if (r5 > 500) goto L36;
     */
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m3188l(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11675l.m3188l(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m3189l(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
            c17417l.f33951l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m3188l(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final String m3190l() {
        C17417l c17417l = (C17417l) this.f833l;
        try {
            return AbstractC2632l.vip(c17417l.f33936l, c17417l.f33933l);
        } catch (IllegalStateException e) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.loadAd(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0293  */
    /* JADX WARN: Code duplicated, block: B:102:0x0298  */
    /* JADX WARN: Code duplicated, block: B:105:0x0336  */
    /* JADX WARN: Code duplicated, block: B:106:0x0339  */
    /* JADX WARN: Code duplicated, block: B:109:0x0340  */
    /* JADX WARN: Code duplicated, block: B:111:0x0345  */
    /* JADX WARN: Code duplicated, block: B:114:0x034d  */
    /* JADX WARN: Code duplicated, block: B:116:0x0352  */
    /* JADX WARN: Code duplicated, block: B:119:0x035c  */
    /* JADX WARN: Code duplicated, block: B:120:0x035f  */
    /* JADX WARN: Code duplicated, block: B:124:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:127:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:136:0x040b  */
    /* JADX WARN: Code duplicated, block: B:138:0x042b  */
    /* JADX WARN: Code duplicated, block: B:139:0x043e  */
    /* JADX WARN: Code duplicated, block: B:145:0x0457  */
    /* JADX WARN: Code duplicated, block: B:157:0x049e  */
    /* JADX WARN: Code duplicated, block: B:161:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:165:0x04d1 A[Catch: NumberFormatException -> 0x04d6, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x04d6, blocks: (B:163:0x04c5, B:165:0x04d1), top: B:192:0x04c5 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x04d6  */
    /* JADX WARN: Code duplicated, block: B:173:0x04f3  */
    /* JADX WARN: Code duplicated, block: B:179:0x050a  */
    /* JADX WARN: Code duplicated, block: B:183:0x051d  */
    /* JADX WARN: Code duplicated, block: B:186:0x052c  */
    /* JADX WARN: Code duplicated, block: B:211:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01db  */
    /* JADX WARN: Code duplicated, block: B:67:0x0203  */
    /* JADX WARN: Code duplicated, block: B:69:0x0208  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:74:0x0218  */
    /* JADX WARN: Code duplicated, block: B:77:0x0222  */
    /* JADX WARN: Code duplicated, block: B:78:0x0225  */
    /* JADX WARN: Code duplicated, block: B:81:0x022c  */
    /* JADX WARN: Code duplicated, block: B:82:0x022f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0246  */
    /* JADX WARN: Code duplicated, block: B:86:0x0249  */
    /* JADX WARN: Code duplicated, block: B:89:0x0257  */
    /* JADX WARN: Code duplicated, block: B:90:0x025c  */
    /* JADX WARN: Code duplicated, block: B:93:0x026b  */
    /* JADX WARN: Code duplicated, block: B:94:0x0270  */
    /* JADX WARN: Code duplicated, block: B:97:0x027f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0284  */
    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m3191l() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        C13698l c13698lYandex;
        AbstractC10199l it;
        EnumC1704l enumC1704l;
        int i6;
        C17417l c17417l;
        boolean z;
        C11247l c11247l;
        EnumC1704l enumC1704l2;
        EnumC1704l enumC1704l3;
        EnumC1704l enumC1704l4;
        EnumC1704l enumC1704l5;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        int iZza;
        int iZza2;
        int iZza3;
        int iZza4;
        int i7;
        int i8;
        char c;
        String str;
        String str2;
        int i9;
        int i10;
        Object obj6;
        String str3;
        String str4;
        String str5;
        String str6;
        AbstractC13675l abstractC13675lAdcel;
        String string;
        HashMap map;
        String[] strArrSplit;
        int length;
        int i11;
        C11247l c11247l2;
        String[] strArrSplit2;
        String string2;
        String strYandex;
        Bundle bundleLoadAd;
        C11675l c11675l;
        HashMap map2;
        String str7;
        Bundle bundleLoadAd2;
        Bundle bundleLoadAd3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb;
        int i12;
        int iCrashlytics;
        int i13;
        String str10;
        EnumC1704l enumC1704l6;
        mo211l();
        C17417l c17417l2 = (C17417l) this.f833l;
        C8118l c8118l = c17417l2.f33950l;
        C8118l c8118l2 = c17417l2.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.yandex("Handle tcf update.");
        C16386l c16386l = c17417l2.f33944l;
        C17417l.billing(c16386l);
        SharedPreferences sharedPreferencesM4179l = c16386l.m4179l();
        C13708l c13708l = AbstractC6166l.yandex;
        EnumC5903l enumC5903l = EnumC5903l.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        EnumC11157l enumC11157l = EnumC11157l.f22433l;
        EnumC11157l enumC11157l2 = EnumC11157l.f22432l;
        EnumC5903l enumC5903l2 = EnumC5903l.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        EnumC5903l enumC5903l3 = EnumC5903l.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        int i14 = 0;
        EnumC5903l enumC5903l4 = EnumC5903l.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        C15333l c15333lAdmob = C15333l.admob(7, new Object[]{enumC5903l, enumC11157l, EnumC5903l.IAB_TCF_PURPOSE_SELECT_BASIC_ADS, enumC11157l2, enumC5903l2, enumC11157l, enumC5903l3, enumC11157l, enumC5903l4, enumC11157l2, EnumC5903l.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, enumC11157l2, EnumC5903l.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, enumC11157l2}, null);
        int i15 = AbstractC8481l.f17529l;
        C12950l c12950l = new C12950l("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesM4179l.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesM4179l.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = sharedPreferencesM4179l.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            try {
                try {
                    i3 = sharedPreferencesM4179l.getInt("IABTCF_gdprApplies", -1);
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        enumC1704l = EnumC1704l.PURPOSE_RESTRICTION_UNDEFINED;
                        i6 = i2;
                        if (!zHasNext) {
                            break;
                        }
                        EnumC5903l enumC5903l5 = (EnumC5903l) it.next();
                        int i16 = i;
                        int iZza5 = enumC5903l5.zza();
                        boolean z4 = zContains;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZza5).length() + 28);
                        sb2.append("IABTCF_PublisherRestrictions");
                        sb2.append(iZza5);
                        String strYandex2 = AbstractC6166l.yandex(sharedPreferencesM4179l, sb2.toString());
                        if (TextUtils.isEmpty(strYandex2) || strYandex2.length() < 755) {
                            enumC1704l6 = enumC1704l;
                        } else {
                            int iDigit = Character.digit(strYandex2.charAt(754), 10);
                            enumC1704l6 = EnumC1704l.PURPOSE_RESTRICTION_NOT_ALLOWED;
                            if (iDigit >= 0 && iDigit <= EnumC1704l.values().length && iDigit != 0) {
                                if (iDigit == 1) {
                                    enumC1704l = EnumC1704l.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                                } else if (iDigit == 2) {
                                    enumC1704l = EnumC1704l.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                                }
                                enumC1704l6 = enumC1704l;
                            }
                        }
                        c13698lYandex.mo3668catch(enumC5903l5, enumC1704l6);
                        i = i16;
                        i2 = i6;
                        zContains = z4;
                    }
                } catch (ClassCastException unused3) {
                    i3 = -1;
                }
                i5 = sharedPreferencesM4179l.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
            } catch (ClassCastException unused4) {
                i5 = -1;
            }
            i4 = sharedPreferencesM4179l.getInt("IABTCF_PurposeOneTreatment", -1);
        } catch (ClassCastException unused5) {
            i4 = -1;
        }
        String strYandex3 = AbstractC6166l.yandex(sharedPreferencesM4179l, "IABTCF_PublisherCC");
        c13698lYandex = AbstractC13675l.yandex();
        it = c15333lAdmob.keySet().iterator();
        int i17 = i;
        boolean z5 = zContains;
        C15333l c15333lMetrica = c13698lYandex.metrica(true);
        String strYandex4 = AbstractC6166l.yandex(sharedPreferencesM4179l, "IABTCF_PurposeConsents");
        String strYandex5 = AbstractC6166l.yandex(sharedPreferencesM4179l, "IABTCF_VendorConsents");
        boolean z6 = !TextUtils.isEmpty(strYandex5) && strYandex5.length() >= 755 && strYandex5.charAt(754) == '1';
        String strYandex6 = AbstractC6166l.yandex(sharedPreferencesM4179l, "IABTCF_PurposeLegitimateInterests");
        String strYandex7 = AbstractC6166l.yandex(sharedPreferencesM4179l, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strYandex7)) {
            c17417l = c17417l2;
            if (strYandex7.length() >= 755 && strYandex7.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (z5) {
                enumC1704l2 = (EnumC1704l) c15333lMetrica.get(enumC5903l);
                enumC1704l3 = (EnumC1704l) c15333lMetrica.get(enumC5903l2);
                enumC1704l4 = (EnumC1704l) c15333lMetrica.get(enumC5903l3);
                enumC1704l5 = (EnumC1704l) c15333lMetrica.get(enumC5903l4);
                C13698l c13698lYandex2 = AbstractC13675l.yandex();
                c13698lYandex2.mo3668catch("Version", "2");
                if (true != z6) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z2 = z6;
                c13698lYandex2.mo3668catch("VendorConsent", obj);
                if (true != z) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z3 = z;
                c13698lYandex2.mo3668catch("VendorLegitimateInterest", obj2);
                if (i3 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                c13698lYandex2.mo3668catch("gdprApplies", obj3);
                if (i5 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                c13698lYandex2.mo3668catch("EnableAdvertiserConsentMode", obj4);
                c13698lYandex2.mo3668catch("PolicyVersion", String.valueOf(i6));
                c13698lYandex2.mo3668catch("CmpSdkID", String.valueOf(i17));
                if (i4 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                c13698lYandex2.mo3668catch("PurposeOneTreatment", obj5);
                c13698lYandex2.mo3668catch("PublisherCC", strYandex3);
                if (enumC1704l2 != null) {
                    iZza = enumC1704l2.zza();
                } else {
                    iZza = enumC1704l.zza();
                }
                c13698lYandex2.mo3668catch("PublisherRestrictions1", String.valueOf(iZza));
                if (enumC1704l3 != null) {
                    iZza2 = enumC1704l3.zza();
                } else {
                    iZza2 = enumC1704l.zza();
                }
                c13698lYandex2.mo3668catch("PublisherRestrictions3", String.valueOf(iZza2));
                if (enumC1704l4 != null) {
                    iZza3 = enumC1704l4.zza();
                } else {
                    iZza3 = enumC1704l.zza();
                }
                c13698lYandex2.mo3668catch("PublisherRestrictions4", String.valueOf(iZza3));
                if (enumC1704l5 != null) {
                    iZza4 = enumC1704l5.zza();
                } else {
                    iZza4 = enumC1704l.zza();
                }
                c13698lYandex2.mo3668catch("PublisherRestrictions7", String.valueOf(iZza4));
                i7 = i4;
                c13698lYandex2.mo3671else(C15333l.admob(4, new Object[]{"Purpose1", AbstractC6166l.amazon(enumC5903l, strYandex4, strYandex6), "Purpose3", AbstractC6166l.amazon(enumC5903l2, strYandex4, strYandex6), "Purpose4", AbstractC6166l.amazon(enumC5903l3, strYandex4, strYandex6), "Purpose7", AbstractC6166l.amazon(enumC5903l4, strYandex4, strYandex6)}, null).entrySet());
                i8 = 2;
                c = 1;
                str = "1";
                str2 = "0";
                i9 = i5;
                i10 = i3;
                obj6 = "PurposeDiagnostics";
                if (true != AbstractC6166l.loadAd(enumC5903l, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                    str3 = str2;
                } else {
                    str3 = str;
                }
                if (true != AbstractC6166l.loadAd(enumC5903l2, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                    str4 = str2;
                } else {
                    str4 = str;
                }
                if (true != AbstractC6166l.loadAd(enumC5903l3, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                    str5 = str2;
                } else {
                    str5 = str;
                }
                if (true != AbstractC6166l.loadAd(enumC5903l4, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                    str6 = str2;
                } else {
                    str6 = str;
                }
                abstractC13675lAdcel = c13698lYandex2.mo3667case(C15333l.admob(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, obj6, new String(cArr)}, null)).adcel();
            } else {
                abstractC13675lAdcel = C15333l.f29966l;
                str = "1";
                obj6 = "PurposeDiagnostics";
                str2 = "0";
                c = 1;
                i8 = 2;
            }
            c11247l = new C11247l(abstractC13675lAdcel);
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(c11247l, "Tcf preferences read");
            c16386l.mo211l();
            string = c16386l.m4180l().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                c11247l2 = new C11247l(map);
            } else {
                strArrSplit = string.split(";");
                length = strArrSplit.length;
                i11 = 0;
                while (i11 < length) {
                    strArrSplit2 = strArrSplit[i11].split("=");
                    if (strArrSplit2.length < i8 && AbstractC6166l.yandex.contains(strArrSplit2[0])) {
                        map.put(strArrSplit2[0], strArrSplit2[c]);
                    }
                    i11++;
                    i8 = 2;
                }
                c11247l2 = new C11247l(map);
            }
            c16386l.mo211l();
            string2 = c16386l.m4180l().getString("stored_tcf_param", "");
            strYandex = c11247l.yandex();
            if (strYandex.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = c16386l.m4180l().edit();
            editorEdit.putString("stored_tcf_param", strYandex);
            editorEdit.apply();
            bundleLoadAd = c11247l.loadAd();
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(bundleLoadAd, "Consent generated from Tcf");
            if (bundleLoadAd != Bundle.EMPTY) {
                c17417l.f33951l.getClass();
                c11675l = this;
                c11675l.m3193l(bundleLoadAd, -30, System.currentTimeMillis());
            } else {
                c11675l = this;
            }
            Bundle bundle = new Bundle();
            map2 = c11247l2.yandex;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str;
            } else {
                str7 = str2;
            }
            bundleLoadAd2 = c11247l.loadAd();
            bundleLoadAd3 = c11247l2.loadAd();
            if (bundleLoadAd2.size() != bundleLoadAd3.size() && Objects.equals(bundleLoadAd2.getString("ad_storage"), bundleLoadAd3.getString("ad_storage")) && Objects.equals(bundleLoadAd2.getString("ad_personalization"), bundleLoadAd3.getString("ad_personalization")) && Objects.equals(bundleLoadAd2.getString("ad_user_data"), bundleLoadAd3.getString("ad_user_data"))) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = c11247l.yandex;
            str9 = (String) map3.get(obj6);
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb = new StringBuilder(str);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i12 = -1;
                } else {
                    i12 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i12 >= 0 || i12 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12 & 63));
            }
            iCrashlytics = c11247l.crashlytics();
            if (iCrashlytics >= 0 || iCrashlytics > 63) {
                sb.append(str2);
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iCrashlytics));
            }
            if (c == str.equals(map3.get("gdprApplies"))) {
                i14 = 2;
            }
            i13 = i14 | 4;
            if (str.equals(map3.get("EnableAdvertiserConsentMode"))) {
                i13 = i14 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle.putString("_tcfd", sb.toString());
            c11675l.m3196l("auto", "_tcf", bundle);
        }
        c17417l = c17417l2;
        z = false;
        cArr[0] = '2';
        if (z5) {
            abstractC13675lAdcel = C15333l.f29966l;
            str = "1";
            obj6 = "PurposeDiagnostics";
            str2 = "0";
            c = 1;
            i8 = 2;
        } else {
            enumC1704l2 = (EnumC1704l) c15333lMetrica.get(enumC5903l);
            enumC1704l3 = (EnumC1704l) c15333lMetrica.get(enumC5903l2);
            enumC1704l4 = (EnumC1704l) c15333lMetrica.get(enumC5903l3);
            enumC1704l5 = (EnumC1704l) c15333lMetrica.get(enumC5903l4);
            C13698l c13698lYandex3 = AbstractC13675l.yandex();
            c13698lYandex3.mo3668catch("Version", "2");
            if (true != z6) {
                obj = "0";
            } else {
                obj = "1";
            }
            z2 = z6;
            c13698lYandex3.mo3668catch("VendorConsent", obj);
            if (true != z) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z3 = z;
            c13698lYandex3.mo3668catch("VendorLegitimateInterest", obj2);
            if (i3 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            c13698lYandex3.mo3668catch("gdprApplies", obj3);
            if (i5 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            c13698lYandex3.mo3668catch("EnableAdvertiserConsentMode", obj4);
            c13698lYandex3.mo3668catch("PolicyVersion", String.valueOf(i6));
            c13698lYandex3.mo3668catch("CmpSdkID", String.valueOf(i17));
            if (i4 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            c13698lYandex3.mo3668catch("PurposeOneTreatment", obj5);
            c13698lYandex3.mo3668catch("PublisherCC", strYandex3);
            if (enumC1704l2 != null) {
                iZza = enumC1704l2.zza();
            } else {
                iZza = enumC1704l.zza();
            }
            c13698lYandex3.mo3668catch("PublisherRestrictions1", String.valueOf(iZza));
            if (enumC1704l3 != null) {
                iZza2 = enumC1704l3.zza();
            } else {
                iZza2 = enumC1704l.zza();
            }
            c13698lYandex3.mo3668catch("PublisherRestrictions3", String.valueOf(iZza2));
            if (enumC1704l4 != null) {
                iZza3 = enumC1704l4.zza();
            } else {
                iZza3 = enumC1704l.zza();
            }
            c13698lYandex3.mo3668catch("PublisherRestrictions4", String.valueOf(iZza3));
            if (enumC1704l5 != null) {
                iZza4 = enumC1704l5.zza();
            } else {
                iZza4 = enumC1704l.zza();
            }
            c13698lYandex3.mo3668catch("PublisherRestrictions7", String.valueOf(iZza4));
            i7 = i4;
            c13698lYandex3.mo3671else(C15333l.admob(4, new Object[]{"Purpose1", AbstractC6166l.amazon(enumC5903l, strYandex4, strYandex6), "Purpose3", AbstractC6166l.amazon(enumC5903l2, strYandex4, strYandex6), "Purpose4", AbstractC6166l.amazon(enumC5903l3, strYandex4, strYandex6), "Purpose7", AbstractC6166l.amazon(enumC5903l4, strYandex4, strYandex6)}, null).entrySet());
            i8 = 2;
            c = 1;
            str = "1";
            str2 = "0";
            i9 = i5;
            i10 = i3;
            obj6 = "PurposeDiagnostics";
            if (true != AbstractC6166l.loadAd(enumC5903l, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            if (true != AbstractC6166l.loadAd(enumC5903l2, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                str4 = str2;
            } else {
                str4 = str;
            }
            if (true != AbstractC6166l.loadAd(enumC5903l3, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                str5 = str2;
            } else {
                str5 = str;
            }
            if (true != AbstractC6166l.loadAd(enumC5903l4, c15333lAdmob, c15333lMetrica, c12950l, cArr, i9, i10, i7, strYandex3, strYandex4, strYandex6, z2, z3)) {
                str6 = str2;
            } else {
                str6 = str;
            }
            abstractC13675lAdcel = c13698lYandex3.mo3667case(C15333l.admob(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, obj6, new String(cArr)}, null)).adcel();
        }
        c11247l = new C11247l(abstractC13675lAdcel);
        C17417l.admob(c8118l2);
        c8118l2.f16911l.loadAd(c11247l, "Tcf preferences read");
        c16386l.mo211l();
        string = c16386l.m4180l().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            c11247l2 = new C11247l(map);
        } else {
            strArrSplit = string.split(";");
            length = strArrSplit.length;
            i11 = 0;
            while (i11 < length) {
                strArrSplit2 = strArrSplit[i11].split("=");
                if (strArrSplit2.length < i8) {
                }
                i11++;
                i8 = 2;
            }
            c11247l2 = new C11247l(map);
        }
        c16386l.mo211l();
        string2 = c16386l.m4180l().getString("stored_tcf_param", "");
        strYandex = c11247l.yandex();
        if (strYandex.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = c16386l.m4180l().edit();
            editorEdit2.putString("stored_tcf_param", strYandex);
            editorEdit2.apply();
            bundleLoadAd = c11247l.loadAd();
            C17417l.admob(c8118l2);
            c8118l2.f16911l.loadAd(bundleLoadAd, "Consent generated from Tcf");
            if (bundleLoadAd != Bundle.EMPTY) {
                c17417l.f33951l.getClass();
                c11675l = this;
                c11675l.m3193l(bundleLoadAd, -30, System.currentTimeMillis());
            } else {
                c11675l = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = c11247l2.yandex;
            if (map2.isEmpty()) {
                str7 = str2;
            } else {
                str7 = str2;
            }
            bundleLoadAd2 = c11247l.loadAd();
            bundleLoadAd3 = c11247l2.loadAd();
            if (bundleLoadAd2.size() != bundleLoadAd3.size()) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = c11247l.yandex;
            str9 = (String) map3.get(obj6);
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb = new StringBuilder(str);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i12 = Integer.parseInt(str10);
            } else {
                i12 = -1;
            }
            if (i12 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iCrashlytics = c11247l.crashlytics();
            if (iCrashlytics >= 0) {
                sb.append(str2);
            } else {
                sb.append(str2);
            }
            if (c == str.equals(map3.get("gdprApplies"))) {
                i14 = 2;
            }
            i13 = i14 | 4;
            if (str.equals(map3.get("EnableAdvertiserConsentMode"))) {
                i13 = i14 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle2.putString("_tcfd", sb.toString());
            c11675l.m3196l("auto", "_tcf", bundle2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final void m3192l(String str, String str2, Object obj, boolean z, long j) {
        int iM4371l;
        int length;
        C17417l c17417l = (C17417l) this.f833l;
        if (z) {
            C17410l c17410l = c17417l.f33949l;
            C17417l.billing(c17410l);
            iM4371l = c17410l.m4371l(str2);
        } else {
            C17410l c17410l2 = c17417l.f33949l;
            C17417l.billing(c17410l2);
            if (!c17410l2.m4384l("user property", str2)) {
                iM4371l = 6;
            } else if (c17410l2.m4361l("user property", AbstractC8020l.purchase, null, str2)) {
                ((C17417l) c17410l2.f833l).getClass();
                if (c17410l2.m4379l("user property", 24, str2)) {
                    iM4371l = 0;
                } else {
                    iM4371l = 6;
                }
            } else {
                iM4371l = 15;
            }
        }
        C10866l c10866l = this.f23424l;
        if (iM4371l != 0) {
            C17417l.billing(c17417l.f33949l);
            String strM4336l = C17410l.m4336l(str2, true, 24);
            length = str2 != null ? str2.length() : 0;
            C17417l.billing(c17417l.f33949l);
            C17410l.m4340l(c10866l, null, iM4371l, "_ev", strM4336l, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC17276l(this, str3, str2, null, j, 3));
            return;
        }
        C17410l c17410l3 = c17417l.f33949l;
        C17410l c17410l4 = c17417l.f33949l;
        C17417l.billing(c17410l3);
        int iM4359l = c17410l3.m4359l(obj, str2);
        if (iM4359l != 0) {
            C17417l.billing(c17410l4);
            String strM4336l2 = C17410l.m4336l(str2, true, 24);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            C17417l.billing(c17410l4);
            C17410l.m4340l(c10866l, null, iM4359l, "_ev", strM4336l2, length);
            return;
        }
        C17417l.billing(c17410l4);
        Object objM4389l = c17410l4.m4389l(obj, str2);
        if (objM4389l != null) {
            C17923l c17923l2 = c17417l.f33929l;
            C17417l.admob(c17923l2);
            c17923l2.m4449l(new RunnableC17276l(this, str3, str2, objM4389l, j, 3));
        }
    }

    /* JADX INFO: renamed from: lؙؚؚ, reason: contains not printable characters */
    public final void m3193l(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        EnumC17672l enumC17672l;
        Boolean bool2;
        C17417l c17417l = (C17417l) this.f833l;
        m2935l();
        C10559l c10559l = C10559l.crashlytics;
        EnumC3170l[] enumC3170lArr = EnumC2242l.STORAGE.f4923l;
        int length = enumC3170lArr.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = enumC3170lArr[i2].f6814l;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16914l.loadAd(string, "Ignoring invalid consent setting");
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16914l.yandex("Valid consent values are 'granted', 'denied'");
        }
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        boolean zM4444l = c17923l.m4444l();
        C10559l c10559lLoadAd = C10559l.loadAd(i, bundle);
        Iterator it = c10559lLoadAd.yandex.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            enumC17672l = EnumC17672l.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((EnumC17672l) it.next()) != enumC17672l) {
                m3205l(c10559lLoadAd, zM4444l);
                break;
            }
        }
        C15783l c15783lCrashlytics = C15783l.crashlytics(i, bundle);
        Iterator it2 = c15783lCrashlytics.purchase.values().iterator();
        while (it2.hasNext()) {
            if (((EnumC17672l) it2.next()) != enumC17672l) {
                m3206l(c15783lCrashlytics, zM4444l);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = C10559l.amazon(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zM4444l) {
                m3197l(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                m3192l(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m3194l() {
        mo211l();
        m2935l();
        C17417l c17417l = (C17417l) this.f833l;
        if (c17417l.crashlytics()) {
            C5051l c5051l = c17417l.f33945l;
            ((C17417l) c5051l.f833l).getClass();
            Boolean boolM1685l = c5051l.m1685l("google_analytics_deferred_deep_link_enabled");
            if (boolM1685l != null && boolM1685l.booleanValue()) {
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16918l.yandex("Deferred Deep Link feature enabled.");
                C17923l c17923l = c17417l.f33929l;
                C17417l.admob(c17923l);
                c17923l.m4449l(new RunnableC12967l(this, 2));
            }
            C11860l c11860lFirebase = c17417l.firebase();
            c11860lFirebase.mo211l();
            c11860lFirebase.m2935l();
            C10462l c10462lM3269l = c11860lFirebase.m3269l(true);
            c11860lFirebase.m3261l();
            C17417l c17417l2 = (C17417l) c11860lFirebase.f833l;
            c17417l2.f33945l.m1682l(null, AbstractC5981l.f12688l);
            c17417l2.isPro().m3211l(3, new byte[0]);
            c11860lFirebase.m3267l(new RunnableC4644l(c11860lFirebase, c10462lM3269l, 1));
            this.f23412l = false;
            C16386l c16386l = c17417l.f33944l;
            C17417l.billing(c16386l);
            c16386l.mo211l();
            String string = c16386l.m4180l().getString("previous_os_version", null);
            ((C17417l) c16386l.f833l).smaato().m4564l();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c16386l.m4180l().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            c17417l.smaato().m4564l();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            m3196l("auto", "_ou", bundle);
        }
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final void m3195l(Boolean bool, boolean z) {
        mo211l();
        m2935l();
        C17417l c17417l = (C17417l) this.f833l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        c8118l.f16918l.loadAd(bool, "Setting app measurement enabled (FE)");
        C16386l c16386l = c17417l.f33944l;
        C17417l.billing(c16386l);
        c16386l.mo211l();
        SharedPreferences.Editor editorEdit = c16386l.m4180l().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            c16386l.mo211l();
            SharedPreferences.Editor editorEdit2 = c16386l.m4180l().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        if (c17417l.f33947l || !(bool == null || bool.booleanValue())) {
            m3203l();
        }
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final void m3196l(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12677l)) {
            c17417l.f33951l.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        m3186l(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void m3197l(long j, Object obj, String str, String str2) {
        String str3;
        boolean zM3211l;
        Object objValueOf = obj;
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.billing(str);
        AbstractC1051l.billing(str2);
        mo211l();
        m2935l();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    C16386l c16386l = c17417l.f33944l;
                    C17417l.billing(c16386l);
                    c16386l.f32060l.ad(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    C16386l c16386l2 = c17417l.f33944l;
                    C17417l.billing(c16386l2);
                    c16386l2.f32060l.ad("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                C16386l c16386l3 = c17417l.f33944l;
                C17417l.billing(c16386l3);
                c16386l3.f32060l.ad("unset");
            } else {
                str4 = str2;
            }
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.crashlytics("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!c17417l.yandex()) {
            C8118l c8118l2 = c17417l.f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16911l.yandex("User property not set since app measurement is disabled");
            return;
        }
        if (c17417l.crashlytics()) {
            C6899l c6899l = new C6899l(j, obj2, str3, str);
            C11860l c11860lFirebase = c17417l.firebase();
            c11860lFirebase.mo211l();
            c11860lFirebase.m2935l();
            c11860lFirebase.m3261l();
            C11694l c11694lIsPro = ((C17417l) c11860lFirebase.f833l).isPro();
            c11694lIsPro.getClass();
            Parcel parcelObtain = Parcel.obtain();
            C1800l.yandex(c6899l, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                C8118l c8118l3 = ((C17417l) c11694lIsPro.f833l).f33950l;
                C17417l.admob(c8118l3);
                c8118l3.f16909l.yandex("User property too long for local database. Sending directly to service");
                zM3211l = false;
            } else {
                zM3211l = c11694lIsPro.m3211l(1, bArrMarshall);
            }
            c11860lFirebase.m3267l(new RunnableC6706l(c11860lFirebase, c11860lFirebase.m3269l(true), zM3211l, c6899l, 1));
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x014a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0162  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final void m3198l(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        int length;
        C16386l c16386l;
        C10866l c10866l;
        boolean z4;
        long j3;
        boolean zYandex;
        long j4;
        long j5;
        boolean zM3211l;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i;
        int i2;
        String str3 = str;
        String str4 = str2;
        AbstractC1051l.billing(str3);
        AbstractC1051l.subs(bundle);
        mo211l();
        m2935l();
        C17417l c17417l = (C17417l) this.f833l;
        boolean zYandex2 = c17417l.yandex();
        C11569l c11569l = c17417l.f33932l;
        C5051l c5051l = c17417l.f33945l;
        Context context = c17417l.f33936l;
        C17410l c17410l = c17417l.f33949l;
        C8118l c8118l = c17417l.f33950l;
        if (!zYandex2) {
            C17417l.admob(c8118l);
            c8118l.f16918l.yandex("Event not sent since app measurement is disabled");
            return;
        }
        List list = c17417l.remoteconfig().f20211l;
        if (list != null && !list.contains(str4)) {
            C17417l.admob(c8118l);
            c8118l.f16918l.crashlytics(str4, str3, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (this.f23407l) {
            length = 0;
        } else {
            this.f23407l = true;
            try {
                length = 0;
                try {
                    (!c17417l.f33935l ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    try {
                        C17417l.admob(c8118l);
                        c8118l.f16910l.loadAd(e, "Failed to invoke Tag Manager's initialize() method");
                    } catch (ClassNotFoundException unused) {
                        C17417l.admob(c8118l);
                        c8118l.f16907l.yandex("Tag Manager is not found and thus will not be used");
                    }
                }
            } catch (ClassNotFoundException unused2) {
                length = 0;
            }
        }
        C14135l c14135l = c17417l.f33942l;
        C16386l c16386l2 = c17417l.f33944l;
        C18450l c18450l = c17417l.f33951l;
        if (!c5051l.m1682l(null, AbstractC5981l.f12647l) && "_cmp".equals(str4) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            c18450l.getClass();
            m3197l(System.currentTimeMillis(), string, "auto", "_lgclid");
        }
        if (!z || C17410l.f33917l[length].equals(str4)) {
            c16386l = c16386l2;
        } else {
            C17417l.billing(c17410l);
            C17417l.billing(c16386l2);
            c16386l = c16386l2;
            c17410l.m4375l(bundle, c16386l.f32055l.amazon());
        }
        C10866l c10866l2 = this.f23424l;
        if (z3 || "_iap".equals(str4)) {
            c10866l = c10866l2;
        } else {
            C17417l.billing(c17410l);
            if (c17410l.m4384l("event", str4)) {
                c10866l = c10866l2;
                if (c17410l.m4361l("event", AbstractC7572l.loadAd, ((C17417l) c17410l.f833l).f33945l.m1682l(null, AbstractC5981l.f12648l) ? AbstractC7572l.amazon : AbstractC7572l.crashlytics, str4)) {
                    i = 40;
                    i2 = !c17410l.m4379l("event", 40, str4) ? 2 : length;
                } else {
                    i2 = 13;
                }
                if (i2 != 0) {
                    C17417l.admob(c8118l);
                    c8118l.f16915l.loadAd(c14135l.yandex(str4), "Invalid public event name. Event will not be logged (FE)");
                    C17417l.billing(c17410l);
                    String strM4336l = C17410l.m4336l(str4, true, i);
                    if (str4 != null) {
                        length = str4.length();
                    }
                    C17410l.m4340l(c10866l, null, i2, "_ev", strM4336l, length);
                    return;
                }
            } else {
                c10866l = c10866l2;
                i2 = 2;
            }
            i = 40;
            if (i2 != 0) {
                C17417l.admob(c8118l);
                c8118l.f16915l.loadAd(c14135l.yandex(str4), "Invalid public event name. Event will not be logged (FE)");
                C17417l.billing(c17410l);
                String strM4336l2 = C17410l.m4336l(str4, true, i);
                if (str4 != null) {
                    length = str4.length();
                }
                C17410l.m4340l(c10866l, null, i2, "_ev", strM4336l2, length);
                return;
            }
        }
        C3148l c3148l = c17417l.f33948l;
        C17417l.mopub(c3148l);
        C6373l c6373lM1294l = c3148l.m1294l(length);
        if (c6373lM1294l != null && !bundle.containsKey("_sc")) {
            c6373lM1294l.amazon = true;
        }
        C17410l.m4338l(c6373lM1294l, bundle, z && !z3);
        boolean zEquals = "am".equals(str3);
        boolean zM4345l = C17410l.m4345l(str4);
        if (!z || this.f23416l == null || zM4345l) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                C17417l.admob(c8118l);
                c8118l.f16918l.crashlytics(c14135l.yandex(str4), c14135l.purchase(bundle), "Passing event to registered event handler (FE)");
                AbstractC1051l.subs(this.f23416l);
                C5633l c5633l = this.f23416l;
                c5633l.getClass();
                try {
                    ((InterfaceC11939l) c5633l.f11986l).ads(str3, str4, bundle, j);
                    return;
                } catch (RemoteException e2) {
                    C17417l c17417l2 = ((AppMeasurementDynamiteService) c5633l.f11985l).purchase;
                    if (c17417l2 != null) {
                        C8118l c8118l2 = c17417l2.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16910l.loadAd(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (c17417l.crashlytics()) {
            C17417l.billing(c17410l);
            C17417l c17417l3 = (C17417l) c17410l.f833l;
            int iM4365l = c17410l.m4365l(str4);
            if (iM4365l != 0) {
                C17417l.admob(c8118l);
                c8118l.f16915l.loadAd(c14135l.yandex(str4), "Invalid event name. Event will not be logged (FE)");
                String strM4336l3 = C17410l.m4336l(str4, true, 40);
                int length2 = str4 != null ? str4.length() : 0;
                C17417l.billing(c17410l);
                C17410l.m4340l(c10866l, null, iM4365l, "_ev", strM4336l3, length2);
                return;
            }
            Bundle bundleM4364l = c17410l.m4364l(str4, bundle, AbstractC5309l.mopub("_o", "_sn", "_sc", "_si"), z3);
            AbstractC1051l.subs(bundleM4364l);
            C17417l.mopub(c3148l);
            String str5 = "_o";
            if (c3148l.m1294l(false) == null || !"_ae".equals(str4)) {
                j3 = 0;
            } else {
                C17417l.mopub(c11569l);
                C16528l c16528l = c11569l.f23238l;
                ((C17417l) ((C11569l) c16528l.f32305l).f833l).f33951l.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j6 = jElapsedRealtime - c16528l.f32306l;
                c16528l.f32306l = jElapsedRealtime;
                if (j6 > 0) {
                    c17410l.m4355l(bundleM4364l, j6);
                }
            }
            if (!"auto".equals(str3) && "_ssr".equals(str4)) {
                String string2 = bundleM4364l.getString("_ffr");
                int i3 = AbstractC0875l.yandex;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                C16386l c16386l3 = c17417l3.f33944l;
                C17417l.billing(c16386l3);
                if (Objects.equals(string2, c16386l3.f32062l.pro())) {
                    C8118l c8118l3 = c17417l3.f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16918l.yandex("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    C16386l c16386l4 = c17417l3.f33944l;
                    C17417l.billing(c16386l4);
                    c16386l4.f32062l.ad(string2);
                }
            } else if ("_ae".equals(str4)) {
                C16386l c16386l5 = c17417l3.f33944l;
                C17417l.billing(c16386l5);
                String strPro = c16386l5.f32062l.pro();
                if (!TextUtils.isEmpty(strPro)) {
                    bundleM4364l.putString("_ffr", strPro);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleM4364l);
            if (c5051l.m1682l(null, AbstractC5981l.f12660l)) {
                C17417l.mopub(c11569l);
                c11569l.mo211l();
                zYandex = c11569l.f23240l;
            } else {
                C17417l.billing(c16386l);
                zYandex = c16386l.f32044l.yandex();
            }
            C17417l.billing(c16386l);
            if (c16386l.f32049l.amazon() > j3 && c16386l.m4183l(j) && zYandex) {
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("Current session is expired, remove the session number, ID, and engagement time");
                c18450l.getClass();
                C16386l c16386l6 = c16386l;
                m3197l(System.currentTimeMillis(), null, "auto", "_sid");
                c18450l.getClass();
                m3197l(System.currentTimeMillis(), null, "auto", "_sno");
                c18450l.getClass();
                m3197l(System.currentTimeMillis(), null, "auto", "_se");
                j4 = j3;
                c16386l6.f32061l.purchase(j4);
            } else {
                j4 = j3;
            }
            if (bundleM4364l.getLong("extend_session", j4) == 1) {
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                C17417l.mopub(c11569l);
                j5 = j;
                c11569l.f23242l.crashlytics(j5, j2);
            } else {
                j5 = j;
            }
            ArrayList arrayList3 = new ArrayList(bundleM4364l.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                String str6 = (String) arrayList3.get(i4);
                if (str6 != null) {
                    C17417l.billing(c17410l);
                    arrayList = arrayList3;
                    Object obj = bundleM4364l.get(str6);
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[]{(Bundle) obj};
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleM4364l.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i4++;
                arrayList3 = arrayList;
            }
            int i5 = 0;
            while (i5 < arrayList2.size()) {
                Bundle bundleM4383l = (Bundle) arrayList2.get(i5);
                String str7 = i5 != 0 ? "_ep" : str4;
                String str8 = str5;
                bundleM4383l.putString(str8, str3);
                if (z2) {
                    bundleM4383l = c17410l.m4383l(bundleM4383l);
                }
                ArrayList arrayList5 = arrayList2;
                Bundle bundle2 = bundleM4383l;
                C13236l c13236l = new C13236l(str7, new C16021l(bundleM4383l), str3, j5, j2);
                C11860l c11860lFirebase = c17417l.firebase();
                c11860lFirebase.getClass();
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                c11860lFirebase.m3261l();
                C11694l c11694lIsPro = ((C17417l) c11860lFirebase.f833l).isPro();
                c11694lIsPro.getClass();
                Parcel parcelObtain = Parcel.obtain();
                C13546l.yandex(c13236l, parcelObtain, 0);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    C8118l c8118l4 = ((C17417l) c11694lIsPro.f833l).f33950l;
                    C17417l.admob(c8118l4);
                    c8118l4.f16909l.yandex("Event is too long for local database. Sending event directly to service");
                    zM3211l = false;
                } else {
                    zM3211l = c11694lIsPro.m3211l(0, bArrMarshall);
                }
                c11860lFirebase.m3267l(new RunnableC6706l(c11860lFirebase, c11860lFirebase.m3269l(true), zM3211l, c13236l, 2));
                if (!z4) {
                    Iterator it = this.f23420l.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC16100l) it.next()).yandex(str, str2, new Bundle(bundle2), j);
                    }
                }
                i5++;
                str3 = str;
                j5 = j;
                arrayList2 = arrayList5;
                str4 = str2;
                str5 = str8;
            }
            String str9 = str4;
            C17417l.mopub(c3148l);
            if (c3148l.m1294l(false) == null || !"_ae".equals(str9)) {
                return;
            }
            C17417l.mopub(c11569l);
            c18450l.getClass();
            c11569l.f23238l.subs(SystemClock.elapsedRealtime(), true, true);
        }
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return false;
    }

    /* JADX INFO: renamed from: lُؙٟ, reason: contains not printable characters */
    public final void m3199l() {
        C11536l c11536l;
        mo211l();
        if (m3204l().isEmpty() || this.f23414l || (c11536l = (C11536l) m3204l().poll()) == null) {
            return;
        }
        C17417l c17417l = (C17417l) this.f833l;
        C17410l c17410l = c17417l.f33949l;
        C17417l.billing(c17410l);
        C3237l c3237lM4356l = c17410l.m4356l();
        if (c3237lM4356l != null) {
            this.f23414l = true;
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            C14906l c14906l = c8118l.f16911l;
            String str = c11536l.f23204l;
            c14906l.loadAd(str, "Registering trigger URI");
            ListenableFuture listenableFuturePurchase = c3237lM4356l.purchase(Uri.parse(str));
            boolean z = false;
            if (listenableFuturePurchase != null) {
                listenableFuturePurchase.yandex(new RunnableC9929l(listenableFuturePurchase, new C5633l(this, c11536l, z, 10), 9), new ExecutorC0877l(3, this));
            } else {
                this.f23414l = false;
                m3204l().add(c11536l);
            }
        }
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m3200l(Bundle bundle, long j) {
        C17417l c17417l = (C17417l) this.f833l;
        AbstractC1051l.subs(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16910l.yandex("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        AbstractC12366l.purchase(bundle2, "app_id", String.class, null);
        AbstractC12366l.purchase(bundle2, "origin", String.class, null);
        AbstractC12366l.purchase(bundle2, "name", String.class, null);
        AbstractC12366l.purchase(bundle2, "value", Object.class, null);
        AbstractC12366l.purchase(bundle2, "trigger_event_name", String.class, null);
        AbstractC12366l.purchase(bundle2, "trigger_timeout", Long.class, 0L);
        AbstractC12366l.purchase(bundle2, "timed_out_event_name", String.class, null);
        AbstractC12366l.purchase(bundle2, "timed_out_event_params", Bundle.class, null);
        AbstractC12366l.purchase(bundle2, "triggered_event_name", String.class, null);
        AbstractC12366l.purchase(bundle2, "triggered_event_params", Bundle.class, null);
        AbstractC12366l.purchase(bundle2, "time_to_live", Long.class, 0L);
        AbstractC12366l.purchase(bundle2, "expired_event_name", String.class, null);
        AbstractC12366l.purchase(bundle2, "expired_event_params", Bundle.class, null);
        AbstractC1051l.billing(bundle2.getString("name"));
        AbstractC1051l.billing(bundle2.getString("origin"));
        AbstractC1051l.subs(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        C17410l c17410l = c17417l.f33949l;
        C14135l c14135l = c17417l.f33942l;
        C8118l c8118l2 = c17417l.f33950l;
        C17417l.billing(c17410l);
        if (c17410l.m4371l(string) != 0) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.loadAd(c14135l.crashlytics(string), "Invalid conditional user property name");
            return;
        }
        C17417l.billing(c17410l);
        if (c17410l.m4359l(obj, string) != 0) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(c14135l.crashlytics(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objM4389l = c17410l.m4389l(obj, string);
        if (objM4389l == null) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(c14135l.crashlytics(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        AbstractC12366l.amazon(bundle2, objM4389l);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(c14135l.crashlytics(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            C17417l.admob(c8118l2);
            c8118l2.f16908l.crashlytics(c14135l.crashlytics(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            C17923l c17923l = c17417l.f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(new RunnableC3760l(this, bundle2, 0));
        }
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m3201l(String str, String str2, Bundle bundle) {
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.f33951l.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        AbstractC1051l.billing(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC3760l(this, bundle2, 1));
    }

    /* JADX INFO: renamed from: lْۣۢ, reason: contains not printable characters */
    public final void m3202l(C10559l c10559l) {
        mo211l();
        boolean z = (c10559l.subs(EnumC3170l.ANALYTICS_STORAGE) && c10559l.subs(EnumC3170l.AD_STORAGE)) || ((C17417l) this.f833l).firebase().m3265l();
        C17417l c17417l = (C17417l) this.f833l;
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.mo211l();
        if (z != c17417l.f33947l) {
            C17923l c17923l2 = c17417l.f33929l;
            C17417l.admob(c17923l2);
            c17923l2.mo211l();
            c17417l.f33947l = z;
            C16386l c16386l = ((C17417l) this.f833l).f33944l;
            C17417l.billing(c16386l);
            c16386l.mo211l();
            Boolean boolValueOf = c16386l.m4180l().contains("measurement_enabled_from_api") ? Boolean.valueOf(c16386l.m4180l().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                m3195l(Boolean.valueOf(z), false);
            }
        }
    }

    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public final void m3203l() {
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        C16386l c16386l = c17417l.f33944l;
        C8118l c8118l = c17417l.f33950l;
        C18450l c18450l = c17417l.f33951l;
        C17417l.billing(c16386l);
        String strPro = c16386l.f32060l.pro();
        int i = 1;
        if (strPro != null) {
            if ("unset".equals(strPro)) {
                c18450l.getClass();
                m3197l(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strPro) ? 0L : 1L);
                c18450l.getClass();
                m3197l(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!c17417l.yandex() || !this.f23412l) {
            C17417l.admob(c8118l);
            c8118l.f16918l.yandex("Updating Scion state (FE)");
            C11860l c11860lFirebase = c17417l.firebase();
            c11860lFirebase.mo211l();
            c11860lFirebase.m2935l();
            c11860lFirebase.m3267l(new RunnableC4644l(c11860lFirebase, c11860lFirebase.m3269l(true), 3));
            return;
        }
        C17417l.admob(c8118l);
        c8118l.f16918l.yandex("Recording app launch after enabling measurement for the first time (FE)");
        m3194l();
        C11569l c11569l = c17417l.f33932l;
        C17417l.mopub(c11569l);
        c11569l.f23242l.loadAd();
        C17923l c17923l = c17417l.f33929l;
        C17417l.admob(c17923l);
        c17923l.m4449l(new RunnableC12967l(this, i));
    }

    /* JADX INFO: renamed from: lٕٖؒ, reason: contains not printable characters */
    public final PriorityQueue m3204l() {
        if (this.f23422l == null) {
            this.f23422l = new PriorityQueue(Comparator.CC.comparing(C18256l.yandex, C7943l.f16542l));
        }
        return this.f23422l;
    }

    /* JADX INFO: renamed from: lٖؐۜ, reason: contains not printable characters */
    public final void m3205l(C10559l c10559l, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        C10559l c10559l2;
        m2935l();
        int i = c10559l.loadAd;
        if (i != -10) {
            EnumC17672l enumC17672l = (EnumC17672l) c10559l.yandex.get(EnumC3170l.AD_STORAGE);
            if (enumC17672l == null) {
                enumC17672l = EnumC17672l.UNINITIALIZED;
            }
            EnumC17672l enumC17672l2 = EnumC17672l.UNINITIALIZED;
            if (enumC17672l == enumC17672l2) {
                EnumC17672l enumC17672l3 = (EnumC17672l) c10559l.yandex.get(EnumC3170l.ANALYTICS_STORAGE);
                if (enumC17672l3 == null) {
                    enumC17672l3 = enumC17672l2;
                }
                if (enumC17672l3 == enumC17672l2) {
                    C8118l c8118l = ((C17417l) this.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16914l.yandex("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.f23419l) {
            try {
                z2 = false;
                if (C10559l.smaato(i, this.f23415l.loadAd)) {
                    C10559l c10559l3 = this.f23415l;
                    EnumMap enumMap = c10559l.yandex;
                    EnumC3170l[] enumC3170lArr = (EnumC3170l[]) enumMap.keySet().toArray(new EnumC3170l[0]);
                    int length = enumC3170lArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        EnumC3170l enumC3170l = enumC3170lArr[i2];
                        EnumC17672l enumC17672l4 = (EnumC17672l) enumMap.get(enumC3170l);
                        EnumC17672l enumC17672l5 = (EnumC17672l) c10559l3.yandex.get(enumC3170l);
                        EnumC17672l enumC17672l6 = EnumC17672l.DENIED;
                        if (enumC17672l4 == enumC17672l6 && enumC17672l5 != enumC17672l6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    EnumC3170l enumC3170l2 = EnumC3170l.ANALYTICS_STORAGE;
                    if (c10559l.subs(enumC3170l2) && !this.f23415l.subs(enumC3170l2)) {
                        z2 = true;
                    }
                    c10559l = c10559l.firebase(this.f23415l);
                    this.f23415l = c10559l;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                c10559l2 = c10559l;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            C8118l c8118l2 = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l2);
            c8118l2.f16907l.loadAd(c10559l2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.f23411l.getAndIncrement();
        if (z3) {
            this.f23410l.set(null);
            RunnableC1063l runnableC1063l = new RunnableC1063l(this, c10559l2, andIncrement, z4, 0);
            if (z) {
                mo211l();
                runnableC1063l.run();
                return;
            } else {
                C17923l c17923l = ((C17417l) this.f833l).f33929l;
                C17417l.admob(c17923l);
                c17923l.m4448l(runnableC1063l);
                return;
            }
        }
        RunnableC1063l runnableC1063l2 = new RunnableC1063l(this, c10559l2, andIncrement, z4, 1);
        if (z) {
            mo211l();
            runnableC1063l2.run();
        } else if (i == 30 || i == -10) {
            C17923l c17923l2 = ((C17417l) this.f833l).f33929l;
            C17417l.admob(c17923l2);
            c17923l2.m4448l(runnableC1063l2);
        } else {
            C17923l c17923l3 = ((C17417l) this.f833l).f33929l;
            C17417l.admob(c17923l3);
            c17923l3.m4449l(runnableC1063l2);
        }
    }

    /* JADX INFO: renamed from: l٘ؓۘ, reason: contains not printable characters */
    public final void m3206l(C15783l c15783l, boolean z) {
        RunnableC16301l runnableC16301l = new RunnableC16301l(this, c15783l, 11);
        if (z) {
            mo211l();
            runnableC16301l.run();
        } else {
            C17923l c17923l = ((C17417l) this.f833l).f33929l;
            C17417l.admob(c17923l);
            c17923l.m4449l(runnableC16301l);
        }
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final void m3207l(C10559l c10559l, long j, boolean z) {
        int i = c10559l.loadAd;
        mo211l();
        m2935l();
        C17417l c17417l = (C17417l) this.f833l;
        C16386l c16386l = c17417l.f33944l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.billing(c16386l);
        C10559l c10559lM4182l = c16386l.m4182l();
        if (j <= this.f23413l && C10559l.smaato(c10559lM4182l.loadAd, i)) {
            C17417l.admob(c8118l);
            c8118l.f16907l.loadAd(c10559l, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        C16386l c16386l2 = c17417l.f33944l;
        C17417l.billing(c16386l2);
        c16386l2.mo211l();
        if (!C10559l.smaato(i, c16386l2.m4180l().getInt("consent_source", 100))) {
            C17417l.admob(c8118l);
            c8118l.f16907l.loadAd(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c16386l2.m4180l().edit();
        editorEdit.putString("consent_settings", c10559l.mopub());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        C17417l.admob(c8118l);
        c8118l.f16911l.loadAd(c10559l, "Setting storage consent(FE)");
        this.f23413l = j;
        if (c17417l.firebase().m3260l()) {
            C11860l c11860lFirebase = c17417l.firebase();
            c11860lFirebase.mo211l();
            c11860lFirebase.m2935l();
            c11860lFirebase.m3267l(new RunnableC4507l(c11860lFirebase, 2));
        } else {
            C11860l c11860lFirebase2 = c17417l.firebase();
            c11860lFirebase2.mo211l();
            c11860lFirebase2.m2935l();
            if (c11860lFirebase2.m3265l()) {
                c11860lFirebase2.m3267l(new RunnableC4644l(c11860lFirebase2, c11860lFirebase2.m3269l(false)));
            }
        }
        if (z) {
            c17417l.firebase().m3257l(new AtomicReference());
        }
    }
}

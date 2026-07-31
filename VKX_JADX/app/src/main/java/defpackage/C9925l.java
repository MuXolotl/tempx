package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: lٍۤۙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C9925l extends AbstractC10618l {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public String f20201l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public String f20202l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public String f20203l;

    /* JADX INFO: renamed from: lؖۦؚ, reason: contains not printable characters */
    public String f20204l;

    /* JADX INFO: renamed from: lٌؘ۠, reason: contains not printable characters */
    public String f20205l;

    /* JADX INFO: renamed from: lؙۖٛ, reason: contains not printable characters */
    public String f20206l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final long f20207l;

    /* JADX INFO: renamed from: lٍۢۚ, reason: contains not printable characters */
    public int f20208l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public String f20209l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public String f20210l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public List f20211l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public long f20212l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f20213l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final long f20214l;

    /* JADX INFO: renamed from: lُٗۜ, reason: contains not printable characters */
    public final String f20215l;

    /* JADX INFO: renamed from: l٘ٝؖ, reason: contains not printable characters */
    public long f20216l;

    public C9925l(C17417l c17417l, long j, long j2, String str) {
        super(c17417l);
        this.f20216l = 0L;
        this.f20205l = null;
        this.f20207l = j;
        this.f20214l = j2;
        this.f20215l = str;
    }

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m2819l() {
        String str;
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        C16386l c16386l = c17417l.f33944l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.billing(c16386l);
        if (c16386l.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            C17410l c17410l = c17417l.f33949l;
            C17417l.billing(c17410l);
            c17410l.m4354l().nextBytes(bArr);
            str = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            C17417l.admob(c8118l);
            c8118l.f16918l.yandex("Analytics Storage consent is not granted");
            str = null;
        }
        C17417l.admob(c8118l);
        c8118l.f16918l.yandex("Resetting session stitching token to ".concat(str == null ? "null" : "not null"));
        this.f20206l = str;
        c17417l.f33951l.getClass();
        this.f20216l = System.currentTimeMillis();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0274 A[Catch: NameNotFoundException -> 0x027c, TRY_LEAVE, TryCatch #7 {NameNotFoundException -> 0x027c, blocks: (B:98:0x026e, B:100:0x0274), top: B:137:0x026e }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0277 A[PHI: r3 r37
  0x0277: PHI (r3v21 int) = (r3v20 int), (r3v22 int) binds: [B:104:0x027c, B:99:0x0272] A[DONT_GENERATE, DONT_INLINE]
  0x0277: PHI (r37v2 boolean) = (r37v1 boolean), (r37v4 boolean) binds: [B:104:0x027c, B:99:0x0272] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:109:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:112:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:113:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:116:0x0309  */
    /* JADX WARN: Code duplicated, block: B:122:0x012a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0265 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0108  */
    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x011f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0136  */
    /* JADX WARN: Code duplicated, block: B:44:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0193  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x0202  */
    /* JADX WARN: Code duplicated, block: B:75:0x0206  */
    /* JADX WARN: Code duplicated, block: B:78:0x0212  */
    /* JADX WARN: Code duplicated, block: B:87:0x0237  */
    /* JADX WARN: Code duplicated, block: B:91:0x0244  */
    /* JADX WARN: Code duplicated, block: B:92:0x0246  */
    /* JADX WARN: Code duplicated, block: B:95:0x025f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final C10462l m2820l(String str) {
        String str2;
        long j;
        char c;
        long j2;
        boolean zYandex;
        long j3;
        boolean z;
        String str3;
        Class<?> clsLoadClass;
        Object objInvoke;
        long jAmazon;
        long jMin;
        Boolean boolM1685l;
        char c2;
        boolean z2;
        String str4;
        Boolean boolM1685l2;
        boolean zBooleanValue;
        C17417l c17417l;
        String strM2821l;
        boolean z3;
        int i;
        int i2;
        long j4;
        ApplicationInfo applicationInfoYandex;
        C3032l c3032l;
        int iM4341l;
        long jM4374l;
        mo211l();
        String strM2821l2 = m2821l();
        String strM2822l = m2822l();
        m2935l();
        String str5 = this.f20209l;
        m2935l();
        long j5 = this.f20213l;
        m2935l();
        AbstractC1051l.subs(this.f20202l);
        String str6 = this.f20202l;
        C17417l c17417l2 = (C17417l) this.f833l;
        C5051l c5051l = c17417l2.f33945l;
        C8118l c8118l = c17417l2.f33950l;
        C5051l c5051l2 = c17417l2.f33945l;
        Context context = c17417l2.f33936l;
        C17410l c17410l = c17417l2.f33949l;
        C16386l c16386l = c17417l2.f33944l;
        c5051l.m1678l();
        m2935l();
        mo211l();
        long j6 = this.f20212l;
        if (j6 == 0) {
            C17417l.billing(c17410l);
            C17417l c17417l3 = (C17417l) c17410l.f833l;
            String packageName = context.getPackageName();
            c17410l.mo211l();
            AbstractC1051l.billing(packageName);
            PackageManager packageManager = context.getPackageManager();
            c = 0;
            MessageDigest messageDigestM4330l = C17410l.m4330l();
            long jM4334l = -1;
            if (messageDigestM4330l == null) {
                C8118l c8118l2 = c17417l3.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.yandex("Could not get MD5 instance");
                str2 = str5;
                j = j5;
            } else {
                if (packageManager != null) {
                    try {
                        if (c17410l.m4367l(context, packageName)) {
                            str2 = str5;
                            j = j5;
                            jM4334l = 0;
                        } else {
                            str2 = str5;
                            try {
                                j = j5;
                                try {
                                    Signature[] signatureArr = C16797l.yandex(context).loadAd(64, c17417l3.f33936l.getPackageName()).signatures;
                                    if (signatureArr == null || signatureArr.length <= 0) {
                                        C8118l c8118l3 = c17417l3.f33950l;
                                        C17417l.admob(c8118l3);
                                        c8118l3.f16910l.yandex("Could not get signatures");
                                    } else {
                                        jM4334l = C17410l.m4334l(messageDigestM4330l.digest(signatureArr[0].toByteArray()));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    e = e;
                                    C8118l c8118l4 = c17417l3.f33950l;
                                    C17417l.admob(c8118l4);
                                    c8118l4.f16908l.loadAd(e, "Package name not found");
                                    j2 = 0;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                j = j5;
                                C8118l c8118l5 = c17417l3.f33950l;
                                C17417l.admob(c8118l5);
                                c8118l5.f16908l.loadAd(e, "Package name not found");
                                j2 = 0;
                                this.f20212l = j2;
                                zYandex = c17417l2.yandex();
                                C17417l.billing(c16386l);
                                boolean z4 = !c16386l.f32048l;
                                mo211l();
                                if (c17417l2.yandex()) {
                                    if (c5051l2.m1682l(null, AbstractC5981l.f12678l)) {
                                        C17417l.admob(c8118l);
                                        c8118l.f16911l.yandex("Disabled IID for tests.");
                                        z = zYandex;
                                        j3 = j2;
                                        str3 = null;
                                    } else {
                                        try {
                                            clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                                            if (clsLoadClass == null) {
                                                z = zYandex;
                                                j3 = j2;
                                            } else {
                                                z = zYandex;
                                                j3 = j2;
                                                try {
                                                    Class<?>[] clsArr = new Class[1];
                                                    clsArr[c] = Context.class;
                                                    Method declaredMethod = clsLoadClass.getDeclaredMethod("getInstance", clsArr);
                                                    Object[] objArr = new Object[1];
                                                    objArr[c] = context;
                                                    str3 = null;
                                                    objInvoke = declaredMethod.invoke(null, objArr);
                                                    if (objInvoke != null) {
                                                        try {
                                                            str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                                                        } catch (Exception unused) {
                                                            C17417l.admob(c8118l);
                                                            c8118l.f16914l.yandex("Failed to retrieve Firebase Instance Id");
                                                            str3 = null;
                                                        }
                                                    }
                                                } catch (Exception unused2) {
                                                    C17417l.admob(c8118l);
                                                    c8118l.f16917l.yandex("Failed to obtain Firebase Analytics instance");
                                                }
                                            }
                                        } catch (ClassNotFoundException unused3) {
                                        }
                                        str3 = null;
                                    }
                                } else {
                                    z = zYandex;
                                    j3 = j2;
                                    str3 = null;
                                }
                                C17417l.billing(c16386l);
                                jAmazon = c16386l.f32042l.amazon();
                                jMin = c17417l2.f33953l;
                                if (jAmazon != 0) {
                                    jMin = Math.min(jMin, jAmazon);
                                }
                                m2935l();
                                int i3 = this.f20208l;
                                boolM1685l = c5051l2.m1685l("google_analytics_adid_collection_enabled");
                                if (boolM1685l != null) {
                                    c2 = 1;
                                } else {
                                    c2 = 1;
                                }
                                C17417l.billing(c16386l);
                                c16386l.mo211l();
                                boolean z5 = c16386l.m4180l().getBoolean("deferred_analytics_collection", c);
                                String str7 = str3;
                                if (c5051l2.m1689l("google_analytics_default_allow_ad_personalization_signals", true) != EnumC17672l.GRANTED) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                Boolean boolValueOf = Boolean.valueOf(z2);
                                List list = this.f20211l;
                                String strMopub = c16386l.m4182l().mopub();
                                if (this.f20201l == null) {
                                    C17417l.billing(c17410l);
                                    this.f20201l = c17410l.m4347l();
                                }
                                String str8 = this.f20201l;
                                boolean z6 = c2;
                                if (c16386l.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
                                    mo211l();
                                    if (this.f20216l != 0) {
                                        c17417l2.f33951l.getClass();
                                        long jCurrentTimeMillis = System.currentTimeMillis() - this.f20216l;
                                        if (this.f20206l != null) {
                                            m2819l();
                                        }
                                    }
                                    if (this.f20206l == null) {
                                        m2819l();
                                    }
                                    str4 = this.f20206l;
                                } else {
                                    str4 = null;
                                }
                                boolM1685l2 = c5051l2.m1685l("google_analytics_sgtm_upload_enabled");
                                if (boolM1685l2 == null) {
                                    zBooleanValue = false;
                                } else {
                                    zBooleanValue = boolM1685l2.booleanValue();
                                }
                                C17417l.billing(c17410l);
                                c17417l = (C17417l) c17410l.f833l;
                                strM2821l = m2821l();
                                String str9 = str4;
                                if (c17417l.f33936l.getPackageManager() == null) {
                                    z3 = zBooleanValue;
                                    j4 = 0;
                                } else {
                                    try {
                                        z3 = zBooleanValue;
                                        i = 0;
                                        try {
                                            applicationInfoYandex = C16797l.yandex(c17417l.f33936l).yandex(0, strM2821l);
                                            if (applicationInfoYandex != null) {
                                                i2 = applicationInfoYandex.targetSdkVersion;
                                            } else {
                                                i2 = i;
                                            }
                                        } catch (PackageManager.NameNotFoundException unused4) {
                                            C8118l c8118l6 = c17417l.f33950l;
                                            C17417l.admob(c8118l6);
                                            c8118l6.f16907l.loadAd(strM2821l, "PackageManager failed to find running app: app_id");
                                        }
                                    } catch (PackageManager.NameNotFoundException unused5) {
                                        z3 = zBooleanValue;
                                        i = 0;
                                    }
                                    j4 = i2;
                                }
                                C17417l.billing(c16386l);
                                int i4 = c16386l.m4182l().loadAd;
                                C17417l.billing(c16386l);
                                c16386l.mo211l();
                                String str10 = C15783l.loadAd(c16386l.m4180l().getString("dma_consent_settings", null)).loadAd;
                                C2156l.yandex();
                                c3032l = AbstractC5981l.f12668l;
                                if (c5051l2.m1682l(null, c3032l)) {
                                    C17417l.billing(c17410l);
                                    iM4341l = C17410l.m4341l();
                                } else {
                                    iM4341l = 0;
                                }
                                C2156l.yandex();
                                if (c5051l2.m1682l(null, c3032l)) {
                                    C17417l.billing(c17410l);
                                    jM4374l = c17410l.m4374l();
                                } else {
                                    jM4374l = 0;
                                }
                                String str11 = c5051l2.f10320l;
                                String strValueOf = String.valueOf(C10559l.admob(c5051l2.m1689l("google_analytics_default_allow_ad_personalization_signals", true)));
                                long j7 = c17417l2.f33953l;
                                C17417l.purchase(c17417l2.f33930l);
                                return new C10462l(strM2821l2, strM2822l, str2, j, str6, 161000L, j3, str, z, z4, str7, jMin, i3, z6, z5, boolValueOf, this.f20207l, list, strMopub, str8, str9, z3, j4, i4, str10, iM4341l, jM4374l, str11, strValueOf, j7, AbstractC9029l.billing(c17417l2.f33930l.m1232l()), c5051l2.m1682l(null, AbstractC5981l.f12677l) ? c17417l2.f33939l : 0L);
                            }
                        }
                    } catch (PackageManager.NameNotFoundException e3) {
                        e = e3;
                        str2 = str5;
                    }
                } else {
                    str2 = str5;
                    j = j5;
                }
                j2 = 0;
                this.f20212l = j2;
            }
            j2 = jM4334l;
            this.f20212l = j2;
        } else {
            str2 = str5;
            j = j5;
            c = 0;
            j2 = j6;
        }
        zYandex = c17417l2.yandex();
        C17417l.billing(c16386l);
        boolean z7 = !c16386l.f32048l;
        mo211l();
        if (c17417l2.yandex()) {
            z = zYandex;
            j3 = j2;
            str3 = null;
        } else {
            if (c5051l2.m1682l(null, AbstractC5981l.f12678l)) {
                C17417l.admob(c8118l);
                c8118l.f16911l.yandex("Disabled IID for tests.");
                z = zYandex;
                j3 = j2;
                str3 = null;
            } else {
                clsLoadClass = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (clsLoadClass == null) {
                    z = zYandex;
                    j3 = j2;
                } else {
                    z = zYandex;
                    j3 = j2;
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[c] = Context.class;
                    Method declaredMethod2 = clsLoadClass.getDeclaredMethod("getInstance", clsArr2);
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = context;
                    str3 = null;
                    objInvoke = declaredMethod2.invoke(null, objArr2);
                    if (objInvoke != null) {
                        str3 = (String) clsLoadClass.getDeclaredMethod("getFirebaseInstanceId", null).invoke(objInvoke, null);
                    }
                }
                str3 = null;
            }
        }
        C17417l.billing(c16386l);
        jAmazon = c16386l.f32042l.amazon();
        jMin = c17417l2.f33953l;
        if (jAmazon != 0) {
            jMin = Math.min(jMin, jAmazon);
        }
        m2935l();
        int i5 = this.f20208l;
        boolM1685l = c5051l2.m1685l("google_analytics_adid_collection_enabled");
        if (boolM1685l != null || boolM1685l.booleanValue()) {
            c2 = 1;
        } else {
            c2 = c;
        }
        C17417l.billing(c16386l);
        c16386l.mo211l();
        boolean z8 = c16386l.m4180l().getBoolean("deferred_analytics_collection", c);
        String str12 = str3;
        if (c5051l2.m1689l("google_analytics_default_allow_ad_personalization_signals", true) != EnumC17672l.GRANTED) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        List list2 = this.f20211l;
        String strMopub2 = c16386l.m4182l().mopub();
        if (this.f20201l == null) {
            C17417l.billing(c17410l);
            this.f20201l = c17410l.m4347l();
        }
        String str13 = this.f20201l;
        boolean z9 = c2;
        if (c16386l.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
            str4 = null;
        } else {
            mo211l();
            if (this.f20216l != 0) {
                c17417l2.f33951l.getClass();
                long jCurrentTimeMillis2 = System.currentTimeMillis() - this.f20216l;
                if (this.f20206l != null && jCurrentTimeMillis2 > 86400000 && this.f20205l == null) {
                    m2819l();
                }
            }
            if (this.f20206l == null) {
                m2819l();
            }
            str4 = this.f20206l;
        }
        boolM1685l2 = c5051l2.m1685l("google_analytics_sgtm_upload_enabled");
        if (boolM1685l2 == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = boolM1685l2.booleanValue();
        }
        C17417l.billing(c17410l);
        c17417l = (C17417l) c17410l.f833l;
        strM2821l = m2821l();
        String str14 = str4;
        if (c17417l.f33936l.getPackageManager() == null) {
            z3 = zBooleanValue;
            j4 = 0;
        } else {
            z3 = zBooleanValue;
            i = 0;
            applicationInfoYandex = C16797l.yandex(c17417l.f33936l).yandex(0, strM2821l);
            if (applicationInfoYandex != null) {
                i2 = applicationInfoYandex.targetSdkVersion;
            } else {
                i2 = i;
            }
            j4 = i2;
        }
        C17417l.billing(c16386l);
        int i6 = c16386l.m4182l().loadAd;
        C17417l.billing(c16386l);
        c16386l.mo211l();
        String str15 = C15783l.loadAd(c16386l.m4180l().getString("dma_consent_settings", null)).loadAd;
        C2156l.yandex();
        c3032l = AbstractC5981l.f12668l;
        if (c5051l2.m1682l(null, c3032l)) {
            C17417l.billing(c17410l);
            iM4341l = C17410l.m4341l();
        } else {
            iM4341l = 0;
        }
        C2156l.yandex();
        if (c5051l2.m1682l(null, c3032l)) {
            C17417l.billing(c17410l);
            jM4374l = c17410l.m4374l();
        } else {
            jM4374l = 0;
        }
        String str16 = c5051l2.f10320l;
        String strValueOf2 = String.valueOf(C10559l.admob(c5051l2.m1689l("google_analytics_default_allow_ad_personalization_signals", true)));
        long j8 = c17417l2.f33953l;
        C17417l.purchase(c17417l2.f33930l);
        return new C10462l(strM2821l2, strM2822l, str2, j, str6, 161000L, j3, str, z, z7, str12, jMin, i5, z9, z8, boolValueOf2, this.f20207l, list2, strMopub2, str13, str14, z3, j4, i6, str15, iM4341l, jM4374l, str16, strValueOf2, j8, AbstractC9029l.billing(c17417l2.f33930l.m1232l()), c5051l2.m1682l(null, AbstractC5981l.f12677l) ? c17417l2.f33939l : 0L);
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final String m2821l() {
        m2935l();
        AbstractC1051l.subs(this.f20210l);
        return this.f20210l;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final String m2822l() {
        mo211l();
        m2935l();
        AbstractC1051l.subs(this.f20204l);
        return this.f20204l;
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return true;
    }
}

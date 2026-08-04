package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import j$.util.Objects;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/* JADX INFO: renamed from: lؙۡٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6820l extends AbstractC9654l {
    public final /* synthetic */ C11675l billing;
    public final /* synthetic */ int purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6820l(C11675l c11675l, InterfaceC17182l interfaceC17182l, int i) {
        super(interfaceC17182l);
        this.purchase = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(c11675l);
                this.billing = c11675l;
                super(interfaceC17182l);
                break;
            case 2:
                Objects.requireNonNull(c11675l);
                this.billing = c11675l;
                super(interfaceC17182l);
                break;
            case 3:
                this.billing = c11675l;
                super(interfaceC17182l);
                break;
            default:
                Objects.requireNonNull(c11675l);
                this.billing = c11675l;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:49:0x0145  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x0172  */
    /* JADX WARN: Code duplicated, block: B:58:0x0175  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:66:0x0197  */
    /* JADX WARN: Code duplicated, block: B:67:0x019a  */
    /* JADX WARN: Code duplicated, block: B:69:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:76:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0288 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0299 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x02a1 A[Catch: IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, TryCatch #5 {IllegalArgumentException -> 0x028f, MalformedURLException -> 0x0291, blocks: (B:80:0x0240, B:82:0x0288, B:87:0x0293, B:89:0x0299, B:91:0x02a1, B:92:0x02a7, B:93:0x02ab), top: B:116:0x0240 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02c5  */
    @Override // defpackage.AbstractC9654l
    public final void yandex() {
        Pair pair;
        NetworkInfo activeNetworkInfo;
        C11860l c11860lFirebase;
        C17417l c17417l;
        InterfaceC5496l interfaceC5496l;
        C15927l c15927lStartapp;
        Bundle bundle;
        String str;
        Boolean bool;
        int iOrdinal;
        int i;
        String str2;
        String string;
        C17417l c17417l2;
        URL url;
        String strConcat;
        int i2 = this.purchase;
        int i3 = 0;
        C11675l c11675l = this.billing;
        switch (i2) {
            case 0:
                C11675l c11675l2 = ((C17417l) c11675l.f833l).f33927l;
                C17417l.mopub(c11675l2);
                new Thread(new RunnableC12967l(c11675l2, i3)).start();
                break;
            case 1:
                c11675l.m3199l();
                break;
            case 2:
                c11675l.m3191l();
                break;
            default:
                C17417l c17417l3 = (C17417l) c11675l.f833l;
                C16386l c16386l = c17417l3.f33944l;
                C8118l c8118l = c17417l3.f33950l;
                C17923l c17923l = c17417l3.f33929l;
                C17417l.admob(c17923l);
                c17923l.mo211l();
                C2489l c2489l = c17417l3.f33943l;
                C17417l.admob(c2489l);
                C17417l c17417l4 = (C17417l) c2489l.f833l;
                C17417l.admob(c2489l);
                String strM2821l = c17417l3.remoteconfig().m2821l();
                Boolean boolM1685l = c17417l3.f33945l.m1685l("google_analytics_adid_collection_enabled");
                if (boolM1685l == null || boolM1685l.booleanValue()) {
                    C17417l.billing(c16386l);
                    C17417l c17417l5 = (C17417l) c16386l.f833l;
                    c16386l.mo211l();
                    if (c16386l.m4182l().subs(EnumC3170l.AD_STORAGE)) {
                        c17417l5.f33951l.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        String str3 = c16386l.f32057l;
                        if (str3 == null || jElapsedRealtime >= c16386l.f32059l) {
                            c16386l.f32059l = c17417l5.f33945l.m1674l(strM2821l, AbstractC5981l.loadAd) + jElapsedRealtime;
                            try {
                                C10997l c10997lYandex = C7715l.yandex(c17417l5.f33936l);
                                c16386l.f32057l = "";
                                String str4 = c10997lYandex.crashlytics;
                                if (str4 != null) {
                                    c16386l.f32057l = str4;
                                }
                                c16386l.f32051l = c10997lYandex.loadAd;
                            } catch (Exception e) {
                                C8118l c8118l2 = c17417l5.f33950l;
                                C17417l.admob(c8118l2);
                                c8118l2.f16918l.loadAd(e, "Unable to get advertising id");
                                c16386l.f32057l = "";
                            }
                            pair = new Pair(c16386l.f32057l, Boolean.valueOf(c16386l.f32051l));
                        } else {
                            pair = new Pair(str3, Boolean.valueOf(c16386l.f32051l));
                        }
                    } else {
                        pair = new Pair("", Boolean.FALSE);
                    }
                    if (!((Boolean) pair.second).booleanValue() && !TextUtils.isEmpty((CharSequence) pair.first)) {
                        C17417l.admob(c2489l);
                        c2489l.m4564l();
                        ConnectivityManager connectivityManager = (ConnectivityManager) c17417l4.f33936l.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            try {
                                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            } catch (SecurityException unused) {
                                activeNetworkInfo = null;
                            }
                        } else {
                            activeNetworkInfo = null;
                        }
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            StringBuilder sb = new StringBuilder();
                            C11860l c11860lFirebase2 = c17417l3.firebase();
                            c11860lFirebase2.mo211l();
                            c11860lFirebase2.m2935l();
                            if (!c11860lFirebase2.m3263l()) {
                                C11675l c11675l3 = c17417l3.f33927l;
                                C17417l.mopub(c11675l3);
                                C17417l c17417l6 = (C17417l) c11675l3.f833l;
                                c11675l3.mo211l();
                                c11860lFirebase = c17417l6.firebase();
                                c17417l = (C17417l) c11860lFirebase.f833l;
                                c11860lFirebase.mo211l();
                                c11860lFirebase.m2935l();
                                interfaceC5496l = c11860lFirebase.f23690l;
                                if (interfaceC5496l == null) {
                                    c11860lFirebase.m3259l();
                                    C8118l c8118l3 = c17417l.f33950l;
                                    C17417l.admob(c8118l3);
                                    c8118l3.f16918l.yandex("Failed to get consents; not connected to service yet.");
                                } else {
                                    try {
                                        c15927lStartapp = interfaceC5496l.startapp(c11860lFirebase.m3269l(false));
                                        c11860lFirebase.m3266l();
                                    } catch (RemoteException e2) {
                                        C8118l c8118l4 = c17417l.f33950l;
                                        C17417l.admob(c8118l4);
                                        c8118l4.f16908l.loadAd(e2, "Failed to get consents; remote exception");
                                        c15927lStartapp = null;
                                    }
                                    if (c15927lStartapp != null) {
                                        bundle = c15927lStartapp.f31264l;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = c17417l3.f33940l;
                                        c17417l3.f33940l = i + 1;
                                        i3 = i < 10 ? 1 : 0;
                                        C17417l.admob(c8118l);
                                        C14906l c14906l = c8118l.f16918l;
                                        StringBuilder sb2 = new StringBuilder(69);
                                        sb2.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        c14906l.loadAd(Integer.valueOf(c17417l3.f33940l), AbstractC0653l.ads(sb2, str2, " retryCount"));
                                    } else {
                                        C10559l c10559lLoadAd = C10559l.loadAd(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c10559lLoadAd.billing());
                                        C15783l c15783lCrashlytics = C15783l.crashlytics(100, bundle);
                                        str = c15783lCrashlytics.amazon;
                                        sb.append("&dma=");
                                        Boolean bool2 = c15783lCrashlytics.crashlytics;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool2, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = C10559l.amazon(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i4 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i4);
                                        C17417l.admob(c8118l);
                                        c8118l.f16911l.loadAd(sb, "Consent query parameters to Bow");
                                        C17410l c17410l = c17417l3.f33949l;
                                        C17417l.billing(c17410l);
                                        ((C17417l) c17417l3.remoteconfig().f833l).f33945l.m1678l();
                                        String str5 = (String) pair.first;
                                        long jAmazon = c16386l.f32040l.amazon() - 1;
                                        string = sb.toString();
                                        c17417l2 = (C17417l) c17410l.f833l;
                                        try {
                                            AbstractC1051l.billing(str5);
                                            AbstractC1051l.billing(strM2821l);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c17410l.m4348l()) + "&rdid=" + str5 + "&bundleid=" + strM2821l + "&retry=" + jAmazon;
                                            if (strM2821l.equals(c17417l2.f33945l.m1676l("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                        } catch (IllegalArgumentException e3) {
                                            e = e3;
                                            C8118l c8118l5 = c17417l2.f33950l;
                                            C17417l.admob(c8118l5);
                                            c8118l5.f16908l.loadAd(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        } catch (MalformedURLException e4) {
                                            e = e4;
                                            C8118l c8118l6 = c17417l2.f33950l;
                                            C17417l.admob(c8118l6);
                                            c8118l6.f16908l.loadAd(e.getMessage(), "Failed to create BOW URL for Deferred Deep Link. exception");
                                            url = null;
                                        }
                                        if (url != null) {
                                            C17417l.admob(c2489l);
                                            C15714l c15714l = new C15714l(c17417l3);
                                            c2489l.m4564l();
                                            C17923l c17923l2 = c17417l4.f33929l;
                                            C17417l.admob(c17923l2);
                                            c17923l2.m4446l(new RunnableC17907l(c2489l, strM2821l, url, (byte[]) null, (HashMap) null, c15714l));
                                        }
                                    }
                                }
                                c15927lStartapp = null;
                                if (c15927lStartapp != null) {
                                    bundle = c15927lStartapp.f31264l;
                                } else {
                                    bundle = null;
                                }
                                if (bundle == null) {
                                    i = c17417l3.f33940l;
                                    c17417l3.f33940l = i + 1;
                                    if (i < 10) {
                                    }
                                    C17417l.admob(c8118l);
                                    C14906l c14906l2 = c8118l.f16918l;
                                    StringBuilder sb3 = new StringBuilder(69);
                                    sb3.append("Failed to retrieve DMA consent from the service, ");
                                    if (i < 10) {
                                        str2 = "Retrying.";
                                    } else {
                                        str2 = "Skipping.";
                                    }
                                    c14906l2.loadAd(Integer.valueOf(c17417l3.f33940l), AbstractC0653l.ads(sb3, str2, " retryCount"));
                                } else {
                                    C10559l c10559lLoadAd2 = C10559l.loadAd(100, bundle);
                                    sb.append("&gcs=");
                                    sb.append(c10559lLoadAd2.billing());
                                    C15783l c15783lCrashlytics2 = C15783l.crashlytics(100, bundle);
                                    str = c15783lCrashlytics2.amazon;
                                    sb.append("&dma=");
                                    Boolean bool3 = c15783lCrashlytics2.crashlytics;
                                    bool = Boolean.FALSE;
                                    sb.append(!Objects.equals(bool3, bool) ? 1 : 0);
                                    if (!TextUtils.isEmpty(str)) {
                                        sb.append("&dma_cps=");
                                        sb.append(str);
                                    }
                                    iOrdinal = C10559l.amazon(bundle.getString("ad_personalization")).ordinal();
                                    if (iOrdinal != 2) {
                                        if (iOrdinal != 3) {
                                            bool = null;
                                        } else {
                                            bool = Boolean.TRUE;
                                        }
                                    }
                                    int i5 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                    sb.append("&npa=");
                                    sb.append(i5);
                                    C17417l.admob(c8118l);
                                    c8118l.f16911l.loadAd(sb, "Consent query parameters to Bow");
                                    C17410l c17410l2 = c17417l3.f33949l;
                                    C17417l.billing(c17410l2);
                                    ((C17417l) c17417l3.remoteconfig().f833l).f33945l.m1678l();
                                    String str6 = (String) pair.first;
                                    long jAmazon2 = c16386l.f32040l.amazon() - 1;
                                    string = sb.toString();
                                    c17417l2 = (C17417l) c17410l2.f833l;
                                    AbstractC1051l.billing(str6);
                                    AbstractC1051l.billing(strM2821l);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c17410l2.m4348l()) + "&rdid=" + str6 + "&bundleid=" + strM2821l + "&retry=" + jAmazon2;
                                    if (strM2821l.equals(c17417l2.f33945l.m1676l("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C17417l.admob(c2489l);
                                        C15714l c15714l2 = new C15714l(c17417l3);
                                        c2489l.m4564l();
                                        C17923l c17923l3 = c17417l4.f33929l;
                                        C17417l.admob(c17923l3);
                                        c17923l3.m4446l(new RunnableC17907l(c2489l, strM2821l, url, (byte[]) null, (HashMap) null, c15714l2));
                                    }
                                }
                                break;
                            } else {
                                C17410l c17410l3 = ((C17417l) c11860lFirebase2.f833l).f33949l;
                                C17417l.billing(c17410l3);
                                if (c17410l3.m4348l() >= 234200) {
                                    C11675l c11675l4 = c17417l3.f33927l;
                                    C17417l.mopub(c11675l4);
                                    C17417l c17417l7 = (C17417l) c11675l4.f833l;
                                    c11675l4.mo211l();
                                    c11860lFirebase = c17417l7.firebase();
                                    c17417l = (C17417l) c11860lFirebase.f833l;
                                    c11860lFirebase.mo211l();
                                    c11860lFirebase.m2935l();
                                    interfaceC5496l = c11860lFirebase.f23690l;
                                    if (interfaceC5496l == null) {
                                        c11860lFirebase.m3259l();
                                        C8118l c8118l7 = c17417l.f33950l;
                                        C17417l.admob(c8118l7);
                                        c8118l7.f16918l.yandex("Failed to get consents; not connected to service yet.");
                                    } else {
                                        c15927lStartapp = interfaceC5496l.startapp(c11860lFirebase.m3269l(false));
                                        c11860lFirebase.m3266l();
                                        if (c15927lStartapp != null) {
                                            bundle = c15927lStartapp.f31264l;
                                        } else {
                                            bundle = null;
                                        }
                                        if (bundle == null) {
                                            i = c17417l3.f33940l;
                                            c17417l3.f33940l = i + 1;
                                            if (i < 10) {
                                            }
                                            C17417l.admob(c8118l);
                                            C14906l c14906l3 = c8118l.f16918l;
                                            StringBuilder sb4 = new StringBuilder(69);
                                            sb4.append("Failed to retrieve DMA consent from the service, ");
                                            if (i < 10) {
                                                str2 = "Retrying.";
                                            } else {
                                                str2 = "Skipping.";
                                            }
                                            c14906l3.loadAd(Integer.valueOf(c17417l3.f33940l), AbstractC0653l.ads(sb4, str2, " retryCount"));
                                        } else {
                                            C10559l c10559lLoadAd3 = C10559l.loadAd(100, bundle);
                                            sb.append("&gcs=");
                                            sb.append(c10559lLoadAd3.billing());
                                            C15783l c15783lCrashlytics3 = C15783l.crashlytics(100, bundle);
                                            str = c15783lCrashlytics3.amazon;
                                            sb.append("&dma=");
                                            Boolean bool4 = c15783lCrashlytics3.crashlytics;
                                            bool = Boolean.FALSE;
                                            sb.append(!Objects.equals(bool4, bool) ? 1 : 0);
                                            if (!TextUtils.isEmpty(str)) {
                                                sb.append("&dma_cps=");
                                                sb.append(str);
                                            }
                                            iOrdinal = C10559l.amazon(bundle.getString("ad_personalization")).ordinal();
                                            if (iOrdinal != 2) {
                                                if (iOrdinal != 3) {
                                                    bool = null;
                                                } else {
                                                    bool = Boolean.TRUE;
                                                }
                                            }
                                            int i6 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                            sb.append("&npa=");
                                            sb.append(i6);
                                            C17417l.admob(c8118l);
                                            c8118l.f16911l.loadAd(sb, "Consent query parameters to Bow");
                                            C17410l c17410l4 = c17417l3.f33949l;
                                            C17417l.billing(c17410l4);
                                            ((C17417l) c17417l3.remoteconfig().f833l).f33945l.m1678l();
                                            String str7 = (String) pair.first;
                                            long jAmazon3 = c16386l.f32040l.amazon() - 1;
                                            string = sb.toString();
                                            c17417l2 = (C17417l) c17410l4.f833l;
                                            AbstractC1051l.billing(str7);
                                            AbstractC1051l.billing(strM2821l);
                                            strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c17410l4.m4348l()) + "&rdid=" + str7 + "&bundleid=" + strM2821l + "&retry=" + jAmazon3;
                                            if (strM2821l.equals(c17417l2.f33945l.m1676l("debug.deferred.deeplink"))) {
                                                strConcat = strConcat.concat("&ddl_test=1");
                                            }
                                            if (!string.isEmpty()) {
                                                if (string.charAt(0) != '&') {
                                                    strConcat = strConcat.concat("&");
                                                }
                                                strConcat = strConcat.concat(string);
                                            }
                                            url = new URL(strConcat);
                                            if (url != null) {
                                                C17417l.admob(c2489l);
                                                C15714l c15714l3 = new C15714l(c17417l3);
                                                c2489l.m4564l();
                                                C17923l c17923l4 = c17417l4.f33929l;
                                                C17417l.admob(c17923l4);
                                                c17923l4.m4446l(new RunnableC17907l(c2489l, strM2821l, url, (byte[]) null, (HashMap) null, c15714l3));
                                            }
                                        }
                                    }
                                    c15927lStartapp = null;
                                    if (c15927lStartapp != null) {
                                        bundle = c15927lStartapp.f31264l;
                                    } else {
                                        bundle = null;
                                    }
                                    if (bundle == null) {
                                        i = c17417l3.f33940l;
                                        c17417l3.f33940l = i + 1;
                                        if (i < 10) {
                                        }
                                        C17417l.admob(c8118l);
                                        C14906l c14906l4 = c8118l.f16918l;
                                        StringBuilder sb5 = new StringBuilder(69);
                                        sb5.append("Failed to retrieve DMA consent from the service, ");
                                        if (i < 10) {
                                            str2 = "Retrying.";
                                        } else {
                                            str2 = "Skipping.";
                                        }
                                        c14906l4.loadAd(Integer.valueOf(c17417l3.f33940l), AbstractC0653l.ads(sb5, str2, " retryCount"));
                                    } else {
                                        C10559l c10559lLoadAd4 = C10559l.loadAd(100, bundle);
                                        sb.append("&gcs=");
                                        sb.append(c10559lLoadAd4.billing());
                                        C15783l c15783lCrashlytics4 = C15783l.crashlytics(100, bundle);
                                        str = c15783lCrashlytics4.amazon;
                                        sb.append("&dma=");
                                        Boolean bool5 = c15783lCrashlytics4.crashlytics;
                                        bool = Boolean.FALSE;
                                        sb.append(!Objects.equals(bool5, bool) ? 1 : 0);
                                        if (!TextUtils.isEmpty(str)) {
                                            sb.append("&dma_cps=");
                                            sb.append(str);
                                        }
                                        iOrdinal = C10559l.amazon(bundle.getString("ad_personalization")).ordinal();
                                        if (iOrdinal != 2) {
                                            if (iOrdinal != 3) {
                                                bool = null;
                                            } else {
                                                bool = Boolean.TRUE;
                                            }
                                        }
                                        int i7 = !Objects.equals(bool, Boolean.TRUE) ? 1 : 0;
                                        sb.append("&npa=");
                                        sb.append(i7);
                                        C17417l.admob(c8118l);
                                        c8118l.f16911l.loadAd(sb, "Consent query parameters to Bow");
                                        C17410l c17410l5 = c17417l3.f33949l;
                                        C17417l.billing(c17410l5);
                                        ((C17417l) c17417l3.remoteconfig().f833l).f33945l.m1678l();
                                        String str8 = (String) pair.first;
                                        long jAmazon4 = c16386l.f32040l.amazon() - 1;
                                        string = sb.toString();
                                        c17417l2 = (C17417l) c17410l5.f833l;
                                        AbstractC1051l.billing(str8);
                                        AbstractC1051l.billing(strM2821l);
                                        strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c17410l5.m4348l()) + "&rdid=" + str8 + "&bundleid=" + strM2821l + "&retry=" + jAmazon4;
                                        if (strM2821l.equals(c17417l2.f33945l.m1676l("debug.deferred.deeplink"))) {
                                            strConcat = strConcat.concat("&ddl_test=1");
                                        }
                                        if (!string.isEmpty()) {
                                            if (string.charAt(0) != '&') {
                                                strConcat = strConcat.concat("&");
                                            }
                                            strConcat = strConcat.concat(string);
                                        }
                                        url = new URL(strConcat);
                                        if (url != null) {
                                            C17417l.admob(c2489l);
                                            C15714l c15714l4 = new C15714l(c17417l3);
                                            c2489l.m4564l();
                                            C17923l c17923l5 = c17417l4.f33929l;
                                            C17417l.admob(c17923l5);
                                            c17923l5.m4446l(new RunnableC17907l(c2489l, strM2821l, url, (byte[]) null, (HashMap) null, c15714l4));
                                        }
                                    }
                                } else {
                                    C17410l c17410l6 = c17417l3.f33949l;
                                    C17417l.billing(c17410l6);
                                    ((C17417l) c17417l3.remoteconfig().f833l).f33945l.m1678l();
                                    String str9 = (String) pair.first;
                                    long jAmazon5 = c16386l.f32040l.amazon() - 1;
                                    string = sb.toString();
                                    c17417l2 = (C17417l) c17410l6.f833l;
                                    AbstractC1051l.billing(str9);
                                    AbstractC1051l.billing(strM2821l);
                                    strConcat = "https://www.googleadservices.com/pagead/conversion/app/deeplink?id_type=adid&sdk_version=" + ("v161000." + c17410l6.m4348l()) + "&rdid=" + str9 + "&bundleid=" + strM2821l + "&retry=" + jAmazon5;
                                    if (strM2821l.equals(c17417l2.f33945l.m1676l("debug.deferred.deeplink"))) {
                                        strConcat = strConcat.concat("&ddl_test=1");
                                    }
                                    if (!string.isEmpty()) {
                                        if (string.charAt(0) != '&') {
                                            strConcat = strConcat.concat("&");
                                        }
                                        strConcat = strConcat.concat(string);
                                    }
                                    url = new URL(strConcat);
                                    if (url != null) {
                                        C17417l.admob(c2489l);
                                        C15714l c15714l5 = new C15714l(c17417l3);
                                        c2489l.m4564l();
                                        C17923l c17923l6 = c17417l4.f33929l;
                                        C17417l.admob(c17923l6);
                                        c17923l6.m4446l(new RunnableC17907l(c2489l, strM2821l, url, (byte[]) null, (HashMap) null, c15714l5));
                                    }
                                }
                            }
                        } else {
                            C17417l.admob(c8118l);
                            c8118l.f16910l.yandex("Network is not available for Deferred Deep Link request. Skipping");
                        }
                    } else {
                        C17417l.admob(c8118l);
                        c8118l.f16911l.yandex("ADID unavailable to retrieve Deferred Deep Link. Skipping");
                    }
                } else {
                    C17417l.admob(c8118l);
                    c8118l.f16911l.yandex("ADID collection is disabled from Manifest. Skipping");
                }
                if (i3 != 0) {
                    c11675l.f23409l.loadAd(2000L);
                }
                break;
        }
    }
}

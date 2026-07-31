package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lُؙٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10887l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f22002l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f22003l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22004l = 0;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f22005l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ boolean f22006l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final /* synthetic */ Object f22007l;

    public RunnableC10887l(C11675l c11675l, AtomicReference atomicReference, String str, String str2, boolean z) {
        this.f22005l = atomicReference;
        this.f22003l = str;
        this.f22002l = str2;
        this.f22006l = z;
        Objects.requireNonNull(c11675l);
        this.f22007l = c11675l;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX WARN: Code duplicated, block: B:56:0x0111 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:62:0x013c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0148  */
    /* JADX WARN: Code duplicated, block: B:68:0x0151 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0166 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0168 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x016f A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x018d A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0193 A[Catch: RuntimeException -> 0x00e2, TryCatch #1 {RuntimeException -> 0x00e2, blocks: (B:54:0x0106, B:56:0x0111, B:59:0x011e, B:61:0x0124, B:63:0x013e, B:66:0x014b, B:68:0x0151, B:71:0x0168, B:73:0x0177, B:72:0x016f, B:74:0x018d, B:76:0x0193, B:78:0x0199, B:80:0x019f, B:82:0x01a7, B:84:0x01af, B:86:0x01b7, B:88:0x01bd, B:89:0x01cf, B:28:0x0099, B:30:0x00a1, B:32:0x00a7, B:34:0x00ad, B:36:0x00b3, B:38:0x00bb, B:40:0x00c3, B:42:0x00cb, B:44:0x00d3, B:48:0x00e9, B:50:0x00f7), top: B:103:0x0099 }] */
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
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bundle bundleM4381l;
        String str;
        String str2;
        C14906l c14906l;
        Bundle bundleM4381l2;
        int i = this.f22004l;
        boolean z = this.f22006l;
        Object obj = this.f22002l;
        Object obj2 = this.f22003l;
        Object obj3 = this.f22005l;
        Object obj4 = this.f22007l;
        switch (i) {
            case 0:
                C11860l c11860lFirebase = ((AppMeasurementDynamiteService) obj4).purchase.firebase();
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                c11860lFirebase.m3267l(new RunnableC6034l(c11860lFirebase, (String) obj2, (String) obj, c11860lFirebase.m3269l(false), this.f22006l, (InterfaceC6989l) obj3));
                break;
            case 1:
                C11860l c11860lFirebase2 = ((C17417l) ((C11675l) obj4).f833l).firebase();
                c11860lFirebase2.mo211l();
                c11860lFirebase2.m2935l();
                c11860lFirebase2.m3267l(new RunnableC6034l(c11860lFirebase2, (AtomicReference) obj3, (String) obj2, (String) obj, c11860lFirebase2.m3269l(false), this.f22006l));
                break;
            case 2:
                C14692l c14692l = (C14692l) obj4;
                C11675l c11675l = (C11675l) c14692l.f28756l;
                c11675l.mo211l();
                C17417l c17417l = (C17417l) c11675l.f833l;
                C10866l c10866l = c11675l.f23423l;
                String str3 = (String) obj;
                Uri uri = (Uri) obj3;
                try {
                    C17410l c17410l = c17417l.f33949l;
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.billing(c17410l);
                    try {
                        String str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            if (!str3.contains("gclid")) {
                                try {
                                    if (!str3.contains("gbraid") && !str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains("utm_medium") && !str3.contains("utm_id") && !str3.contains("dclid") && !str3.contains("srsltid") && !str3.contains("sfmc_id")) {
                                        C8118l c8118l2 = ((C17417l) c17410l.f833l).f33950l;
                                        C17417l.admob(c8118l2);
                                        c8118l2.f16918l.yandex("Activity created with data 'referrer' without required params");
                                    }
                                    str = (String) obj2;
                                    if (z) {
                                        str2 = "Activity created with data 'referrer' without required params";
                                        C17410l c17410l2 = c17417l.f33949l;
                                        C17417l.billing(c17410l2);
                                        bundleM4381l2 = c17410l2.m4381l(uri);
                                        if (bundleM4381l2 != null) {
                                            bundleM4381l2.putString("_cis", "intent");
                                            if (bundleM4381l2.containsKey("gclid") && bundleM4381l != null && bundleM4381l.containsKey("gclid")) {
                                                bundleM4381l2.putString("_cer", "gclid=" + bundleM4381l.getString("gclid"));
                                            }
                                            c11675l.m3196l(str, "_cmp", bundleM4381l2);
                                            c10866l.loadAd(str, bundleM4381l2);
                                        }
                                        if (!TextUtils.isEmpty(str3)) {
                                            C17417l.admob(c8118l);
                                            c14906l = c8118l.f16918l;
                                            c14906l.loadAd(str3, "Activity created with referrer");
                                            if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                                if (bundleM4381l != null) {
                                                    c11675l.m3196l(str, "_cmp", bundleM4381l);
                                                    c10866l.loadAd(str, bundleM4381l);
                                                } else {
                                                    C17417l.admob(c8118l);
                                                    c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                                }
                                                c17417l.f33951l.getClass();
                                                c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                                            } else if (str3.contains("gclid") || (!str3.contains("utm_campaign") && !str3.contains("utm_source") && !str3.contains(str4) && !str3.contains("utm_term") && !str3.contains("utm_content"))) {
                                                C17417l.admob(c8118l);
                                                c14906l.yandex(str2);
                                            } else if (!TextUtils.isEmpty(str3)) {
                                                c17417l.f33951l.getClass();
                                                c11675l.m3192l("auto", "_ldl", str3, true, System.currentTimeMillis());
                                            }
                                        }
                                    } else {
                                        str2 = "Activity created with data 'referrer' without required params";
                                    }
                                    str4 = "utm_medium";
                                    if (!TextUtils.isEmpty(str3)) {
                                        C17417l.admob(c8118l);
                                        c14906l = c8118l.f16918l;
                                        c14906l.loadAd(str3, "Activity created with referrer");
                                        if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                            if (str3.contains("gclid")) {
                                            }
                                            C17417l.admob(c8118l);
                                            c14906l.yandex(str2);
                                        } else {
                                            if (bundleM4381l != null) {
                                                c11675l.m3196l(str, "_cmp", bundleM4381l);
                                                c10866l.loadAd(str, bundleM4381l);
                                            } else {
                                                C17417l.admob(c8118l);
                                                c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                            }
                                            c17417l.f33951l.getClass();
                                            c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                                        }
                                    }
                                } catch (RuntimeException e) {
                                    e = e;
                                    c14692l = c14692l;
                                    C8118l c8118l3 = ((C17417l) ((C11675l) c14692l.f28756l).f833l).f33950l;
                                    C17417l.admob(c8118l3);
                                    c8118l3.f16908l.loadAd(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                    return;
                                }
                                break;
                            }
                            bundleM4381l = c17410l.m4381l(Uri.parse("https://google.com/search?".concat(str3)));
                            if (bundleM4381l != null) {
                                bundleM4381l.putString("_cis", "referrer");
                            }
                            str = (String) obj2;
                            if (z) {
                                str2 = "Activity created with data 'referrer' without required params";
                                C17410l c17410l3 = c17417l.f33949l;
                                C17417l.billing(c17410l3);
                                bundleM4381l2 = c17410l3.m4381l(uri);
                                if (bundleM4381l2 != null) {
                                    bundleM4381l2.putString("_cis", "intent");
                                    if (bundleM4381l2.containsKey("gclid")) {
                                    }
                                    c11675l.m3196l(str, "_cmp", bundleM4381l2);
                                    c10866l.loadAd(str, bundleM4381l2);
                                }
                                if (!TextUtils.isEmpty(str3)) {
                                    C17417l.admob(c8118l);
                                    c14906l = c8118l.f16918l;
                                    c14906l.loadAd(str3, "Activity created with referrer");
                                    if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                        if (str3.contains("gclid")) {
                                        }
                                        C17417l.admob(c8118l);
                                        c14906l.yandex(str2);
                                    } else {
                                        if (bundleM4381l != null) {
                                            c11675l.m3196l(str, "_cmp", bundleM4381l);
                                            c10866l.loadAd(str, bundleM4381l);
                                        } else {
                                            C17417l.admob(c8118l);
                                            c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                        }
                                        c17417l.f33951l.getClass();
                                        c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                                    }
                                }
                            } else {
                                str2 = "Activity created with data 'referrer' without required params";
                            }
                            str4 = "utm_medium";
                            if (!TextUtils.isEmpty(str3)) {
                                C17417l.admob(c8118l);
                                c14906l = c8118l.f16918l;
                                c14906l.loadAd(str3, "Activity created with referrer");
                                if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    C17417l.admob(c8118l);
                                    c14906l.yandex(str2);
                                } else {
                                    if (bundleM4381l != null) {
                                        c11675l.m3196l(str, "_cmp", bundleM4381l);
                                        c10866l.loadAd(str, bundleM4381l);
                                    } else {
                                        C17417l.admob(c8118l);
                                        c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                    }
                                    c17417l.f33951l.getClass();
                                    c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                            break;
                        }
                        bundleM4381l = null;
                        str = (String) obj2;
                        if (z) {
                            str2 = "Activity created with data 'referrer' without required params";
                            C17410l c17410l4 = c17417l.f33949l;
                            C17417l.billing(c17410l4);
                            bundleM4381l2 = c17410l4.m4381l(uri);
                            if (bundleM4381l2 != null) {
                                bundleM4381l2.putString("_cis", "intent");
                                if (bundleM4381l2.containsKey("gclid")) {
                                }
                                c11675l.m3196l(str, "_cmp", bundleM4381l2);
                                c10866l.loadAd(str, bundleM4381l2);
                            }
                            if (!TextUtils.isEmpty(str3)) {
                                C17417l.admob(c8118l);
                                c14906l = c8118l.f16918l;
                                c14906l.loadAd(str3, "Activity created with referrer");
                                if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                    if (str3.contains("gclid")) {
                                    }
                                    C17417l.admob(c8118l);
                                    c14906l.yandex(str2);
                                } else {
                                    if (bundleM4381l != null) {
                                        c11675l.m3196l(str, "_cmp", bundleM4381l);
                                        c10866l.loadAd(str, bundleM4381l);
                                    } else {
                                        C17417l.admob(c8118l);
                                        c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                    }
                                    c17417l.f33951l.getClass();
                                    c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                                }
                            }
                        } else {
                            str2 = "Activity created with data 'referrer' without required params";
                        }
                        str4 = "utm_medium";
                        if (!TextUtils.isEmpty(str3)) {
                            C17417l.admob(c8118l);
                            c14906l = c8118l.f16918l;
                            c14906l.loadAd(str3, "Activity created with referrer");
                            if (!c17417l.f33945l.m1682l(null, AbstractC5981l.f12676l)) {
                                if (str3.contains("gclid")) {
                                }
                                C17417l.admob(c8118l);
                                c14906l.yandex(str2);
                            } else {
                                if (bundleM4381l != null) {
                                    c11675l.m3196l(str, "_cmp", bundleM4381l);
                                    c10866l.loadAd(str, bundleM4381l);
                                } else {
                                    C17417l.admob(c8118l);
                                    c14906l.loadAd(str3, "Referrer does not contain valid parameters");
                                }
                                c17417l.f33951l.getClass();
                                c11675l.m3192l("auto", "_ldl", null, true, System.currentTimeMillis());
                            }
                        }
                    } catch (RuntimeException e2) {
                        e = e2;
                        C8118l c8118l4 = ((C17417l) ((C11675l) c14692l.f28756l).f833l).f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16908l.loadAd(e, "Throwable caught in handleReferrerForOnActivityCreated");
                        return;
                    }
                } catch (RuntimeException e3) {
                    e = e3;
                }
                break;
            default:
                C11860l c11860l = (C11860l) obj4;
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                C17417l c17417l2 = (C17417l) c11860l.f833l;
                if (interfaceC5496l == null) {
                    C8118l c8118l5 = c17417l2.f33950l;
                    C17417l.admob(c8118l5);
                    c8118l5.f16908l.yandex("Failed to send default event parameters to service");
                } else {
                    C10462l c10462l = (C10462l) obj3;
                    if (c17417l2.f33945l.m1682l(null, AbstractC5981l.f12688l)) {
                        c11860l.m3268l(interfaceC5496l, z ? null : (C16021l) obj2, c10462l);
                    } else {
                        try {
                            interfaceC5496l.isVip((Bundle) obj, c10462l);
                            c11860l.m3266l();
                        } catch (RemoteException e4) {
                            C8118l c8118l6 = c17417l2.f33950l;
                            C17417l.admob(c8118l6);
                            c8118l6.f16908l.loadAd(e4, "Failed to send default event parameters to service");
                        }
                    }
                }
                break;
        }
    }

    public RunnableC10887l(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC6989l interfaceC6989l, String str, String str2, boolean z) {
        this.f22005l = interfaceC6989l;
        this.f22003l = str;
        this.f22002l = str2;
        this.f22006l = z;
        this.f22007l = appMeasurementDynamiteService;
    }

    public RunnableC10887l(C14692l c14692l, boolean z, Uri uri, String str, String str2) {
        this.f22006l = z;
        this.f22005l = uri;
        this.f22003l = str;
        this.f22002l = str2;
        this.f22007l = c14692l;
    }

    public RunnableC10887l(C11860l c11860l, C10462l c10462l, boolean z, C16021l c16021l, Bundle bundle) {
        this.f22005l = c10462l;
        this.f22006l = z;
        this.f22003l = c16021l;
        this.f22002l = bundle;
        Objects.requireNonNull(c11860l);
        this.f22007l = c11860l;
    }
}

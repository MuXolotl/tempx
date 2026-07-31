package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcel;
import android.os.UserManager;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lَؓۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2290l implements InterfaceC11545l, InterfaceC10377l, InterfaceC12202l, InterfaceC9526l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final Object f4983l;

    public C2290l(Context context) {
        AbstractC1051l.subs(context);
        Context applicationContext = context.getApplicationContext();
        AbstractC1051l.subs(applicationContext);
        this.f4983l = applicationContext;
    }

    @Override // defpackage.InterfaceC11545l
    public void accept(Object obj, Object obj2) {
        C2350l c2350l = (C2350l) obj2;
        C15567l c15567l = (C15567l) ((C16961l) obj).metrica();
        C12798l c12798l = (C12798l) this.f4983l;
        Parcel parcelCrashlytics = c15567l.crashlytics();
        AbstractC1763l.loadAd(parcelCrashlytics, c12798l);
        try {
            c15567l.billing.transact(1, parcelCrashlytics, null, 1);
            parcelCrashlytics.recycle();
            c2350l.loadAd(null);
        } catch (Throwable th) {
            parcelCrashlytics.recycle();
            throw th;
        }
    }

    @Override // defpackage.InterfaceC10377l
    public /* synthetic */ void adcel(Exception exc) {
        C2350l c2350l = (C2350l) this.f4983l;
        C8930l.amazon.yandex(exc, "get checkbox consent failed", new Object[0]);
        c2350l.amazon(Boolean.FALSE);
    }

    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r6v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 ??, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v2 android.content.SharedPreferences, new type: android.content.SharedPreferences
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    @Override // defpackage.InterfaceC12202l
    public void amazon(Object obj) {
        int i;
        SharedPreferences sharedPreferences;
        C17987l c17987l;
        EnumC10345l enumC10345lCrashlytics;
        C15504l c15504l = (C15504l) this.f4983l;
        Bundle bundle = (Bundle) obj;
        if (C4039l.firebase) {
            Context context = c15504l.yandex;
            C7560l c7560l = c15504l.purchase;
            C4039l c4039l = new C4039l(context, c7560l, c15504l.loadAd, c15504l.admob, c15504l.billing);
            int i2 = 0;
            int i3 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_ANALYTICS_ENABLED", false);
            C4039l.firebase = z2;
            if (i3 != 0) {
                i = i3;
            } else if (!z && !z2) {
                return;
            } else {
                i = 0;
            }
            c4039l.admob = new C8930l(context, bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_CONSENT_TIMEOUT_SECONDS", 5L));
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String strFirebase = AbstractC12900l.firebase(packageName, ".client_cast_analytics_data");
            c4039l.subs = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            C4225l.loadAd(context);
            c4039l.mopub = C4225l.yandex().crashlytics(C16529l.purchase).yandex("CAST_SENDER_SDK", new C7017l("proto"), C14529l.f28436l);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                c4039l.purchase = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences2 = context.getApplicationContext().getSharedPreferences(strFirebase, 0);
            if (i != 0) {
                C10147l c10147lYandex = C8662l.yandex();
                c10147lYandex.yandex = new C6391l(c7560l, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, i2);
                c10147lYandex.amazon = new C9138l[]{AbstractC13106l.amazon};
                c10147lYandex.crashlytics = true;
                c10147lYandex.loadAd = false;
                c10147lYandex.purchase = 8426;
                sharedPreferences = sharedPreferences2;
                c7560l.purchase(0, c10147lYandex.yandex()).purchase(new C17219l(c4039l, packageName, i, sharedPreferences, 17));
            } else {
                sharedPreferences = sharedPreferences2;
            }
            if (z) {
                AbstractC1051l.subs(sharedPreferences);
                C0022l c0022l = C17987l.subs;
                synchronized (C17987l.class) {
                    try {
                        if (C17987l.firebase == null) {
                            C17987l.firebase = new C17987l(sharedPreferences, c4039l, packageName);
                        }
                        c17987l = C17987l.firebase;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = c17987l.crashlytics;
                SharedPreferences sharedPreferences3 = c17987l.loadAd;
                HashSet hashSet = c17987l.billing;
                String string = sharedPreferences3.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences3.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = c17987l.mopub;
                hashSet2.clear();
                c17987l.admob = r13;
                String str2 = C17987l.isPro;
                if (str2.equals(string) && str.equals(string2)) {
                    c17987l.admob = sharedPreferences3.getLong("feature_usage_last_report_time", r13);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences3.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j = sharedPreferences3.getLong(str3, r13);
                            if (j != 0 && jCurrentTimeMillis - j > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                EnumC10345l enumC10345lCrashlytics2 = C17987l.crashlytics(str3.substring(41));
                                if (enumC10345lCrashlytics2 != null) {
                                    hashSet2.add(enumC10345lCrashlytics2);
                                    hashSet.add(enumC10345lCrashlytics2);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (enumC10345lCrashlytics = C17987l.crashlytics(str3.substring(41))) != null) {
                                hashSet.add(enumC10345lCrashlytics);
                            }
                        }
                    }
                    c17987l.loadAd(hashSet3);
                    AbstractC1051l.subs(c17987l.purchase);
                    AbstractC1051l.subs(c17987l.amazon);
                    c17987l.purchase.post(c17987l.amazon);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences3.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    c17987l.loadAd(hashSet4);
                    sharedPreferences3.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                C17987l.yandex(EnumC10345l.CAST_CONTEXT);
            }
            if (C4039l.firebase) {
                C11485l.pro();
            }
        }
    }

    @Override // defpackage.InterfaceC9526l
    public ListenableFuture call() {
        UserManager userManager = AbstractC18452l.yandex;
        RunnableFutureC13286l runnableFutureC13286l = new RunnableFutureC13286l((Callable) this.f4983l);
        EnumC1535l.f3808l.execute(runnableFutureC13286l);
        return runnableFutureC13286l;
    }

    public void yandex(int i, Object obj, InterfaceC0101l interfaceC0101l) throws C8413l {
        C9720l c9720l = (C9720l) this.f4983l;
        AbstractC6909l abstractC6909l = (AbstractC6909l) obj;
        c9720l.remoteconfig(i, 2);
        c9720l.Signature(abstractC6909l.yandex(interfaceC0101l));
        interfaceC0101l.crashlytics(abstractC6909l, this);
    }

    public /* synthetic */ C2290l(Object obj) {
        this.f4983l = obj;
    }

    public C2290l(C9720l c9720l) {
        Charset charset = AbstractC11966l.yandex;
        this.f4983l = c9720l;
        c9720l.crashlytics = this;
    }
}

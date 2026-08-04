package defpackage;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: lُؙؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC10799l implements Runnable {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Object f21828l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f21829l;

    public RunnableC10799l(AbstractDialogInterfaceOnCancelListenerC6965l abstractDialogInterfaceOnCancelListenerC6965l, C14785l c14785l) {
        this.f21829l = 2;
        Objects.requireNonNull(abstractDialogInterfaceOnCancelListenerC6965l);
        this.f21828l = c14785l;
    }

    private final void crashlytics() {
        C13005l c13005l = (C13005l) this.f21828l;
        synchronized (c13005l.f25480l) {
            try {
                InterfaceC16369l interfaceC16369l = (InterfaceC16369l) c13005l.f25483l;
                if (interfaceC16369l != null) {
                    interfaceC16369l.mopub();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void loadAd() {
        boolean zIsEmpty;
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        C7558l c7558l = (C7558l) this.f21828l;
        synchronized (c7558l.admob) {
            zIsEmpty = c7558l.purchase.isEmpty();
        }
        if (!zIsEmpty && !c7558l.subs && (connectivityManager = c7558l.crashlytics) != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
            activeNetworkInfo.isConnected();
        }
        throw null;
    }

    private final /* synthetic */ void yandex() {
        C3723l c3723l = (C3723l) this.f21828l;
        synchronized (C3723l.subs) {
            try {
                if (c3723l.loadAd()) {
                    c3723l.purchase(15);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:87:0x035f  */
    @Override // java.lang.Runnable
    public final void run() {
        int i = 3;
        int i2 = 1;
        int i3 = 0;
        switch (this.f21829l) {
            case 0:
                C3714l c3714l = (C3714l) ((C14965l) this.f21828l).f29441l;
                ((AbstractC4620l) c3714l.billing).mopub(c3714l.billing.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 1:
                ((BinderC17532l) this.f21828l).smaato.amazon(new C10602l(4, null, null));
                return;
            case 2:
                throw null;
            case 3:
                C4986l c4986l = (C4986l) this.f21828l;
                synchronized (c4986l.yandex) {
                    try {
                        if (c4986l.loadAd()) {
                            Log.e("WakeLock", String.valueOf(c4986l.isPro).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            c4986l.amazon();
                            if (c4986l.loadAd()) {
                                c4986l.crashlytics = 1;
                                c4986l.purchase();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 4:
                C8648l c8648l = (C8648l) this.f21828l;
                try {
                    SQLiteDatabase sQLiteDatabaseM2395l = c8648l.m2395l();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseM2395l.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e) {
                    C8118l c8118l = ((C17417l) c8648l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.loadAd(e, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 5:
                yandex();
                return;
            case 6:
                loadAd();
                return;
            case 7:
                crashlytics();
                return;
            case 8:
                ((C10784l) this.f21828l).yandex.m2114volatile();
                return;
            case 9:
                C9670l c9670l = (C9670l) this.f21828l;
                C14514l c14514l = c9670l.mopub;
                if (c14514l != null) {
                    c9670l.yandex.yandex((C18278l) c9670l.crashlytics.loadAd(c14514l).loadAd(), 223);
                }
                c9670l.crashlytics();
                return;
            case 10:
                C11860l c11860l = ((ServiceConnectionC14909l) this.f21828l).f29351l;
                c11860l.m3264l(new ComponentName(((C17417l) c11860l.f833l).f33936l, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 11:
                C11860l c11860l2 = ((ServiceConnectionC14909l) ((RunnableC16301l) this.f21828l).f31892l).f29351l;
                C17923l c17923l = ((C17417l) c11860l2.f833l).f33929l;
                C17417l.admob(c17923l);
                c17923l.m4449l(new RunnableC4507l(c11860l2, i3));
                return;
            case 12:
                RunnableC10273l runnableC10273l = (RunnableC10273l) this.f21828l;
                C11569l c11569l = (C11569l) runnableC10273l.f20914l.f2498l;
                c11569l.mo211l();
                C17417l c17417l = (C17417l) c11569l.f833l;
                C8118l c8118l2 = c17417l.f33950l;
                Context context = c17417l.f33936l;
                C17417l.admob(c8118l2);
                c8118l2.f16918l.yandex("Application going to the background");
                C16386l c16386l = c17417l.f33944l;
                C17417l.billing(c16386l);
                c16386l.f32044l.loadAd(true);
                c11569l.mo211l();
                c11569l.f23240l = true;
                C5051l c5051l = c17417l.f33945l;
                if (!c5051l.m1677l()) {
                    long j = runnableC10273l.f20915l;
                    C16528l c16528l = c11569l.f23238l;
                    c16528l.subs(j, false, false);
                    ((C1576l) c16528l.f32302l).crashlytics();
                }
                long j2 = runnableC10273l.f20916l;
                C17417l.admob(c8118l2);
                c8118l2.f16907l.loadAd(Long.valueOf(j2), "Application backgrounded at: timestamp_millis");
                C11675l c11675l = c17417l.f33927l;
                C17417l.mopub(c11675l);
                c11675l.mo211l();
                C17417l c17417l2 = (C17417l) c11675l.f833l;
                c11675l.m2935l();
                C11860l c11860lFirebase = c17417l2.firebase();
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                if (c11860lFirebase.m3263l()) {
                    C17410l c17410l = ((C17417l) c11860lFirebase.f833l).f33949l;
                    C17417l.billing(c17410l);
                    if (c17410l.m4348l() >= 242600) {
                        C11860l c11860lFirebase2 = c17417l2.firebase();
                        c11860lFirebase2.mo211l();
                        c11860lFirebase2.m2935l();
                        c11860lFirebase2.m3267l(new RunnableC4644l(c11860lFirebase2, c11860lFirebase2.m3269l(true), 2));
                    }
                } else {
                    C11860l c11860lFirebase3 = c17417l2.firebase();
                    c11860lFirebase3.mo211l();
                    c11860lFirebase3.m2935l();
                    c11860lFirebase3.m3267l(new RunnableC4644l(c11860lFirebase3, c11860lFirebase3.m3269l(true), 2));
                }
                if (c5051l.m1682l(null, AbstractC5981l.f12652l)) {
                    C17410l c17410l2 = c17417l.f33949l;
                    C17417l.billing(c17410l2);
                    long jM1674l = c17410l2.m4372l(context.getPackageName(), c5051l.f10320l) ? 1000L : c5051l.m1674l(context.getPackageName(), AbstractC5981l.inmobi);
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.loadAd(Long.valueOf(jM1674l), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    C17417l.purchase(c17417l.f33930l);
                    c17417l.f33930l.m1233l(jM1674l);
                    return;
                }
                return;
            case 13:
                C6901l c6901l = (C6901l) this.f21828l;
                c6901l.mo224l().mo211l();
                c6901l.f14477l = new C11262l(c6901l);
                C8648l c8648l2 = new C8648l(c6901l);
                c8648l2.m2926l();
                c6901l.f14451l = c8648l2;
                C8315l c8315l = c6901l.f14460l;
                C5051l c5051lM2097import = c6901l.m2097import();
                AbstractC1051l.subs(c8315l);
                c5051lM2097import.f10319l = c8315l;
                C5435l c5435l = new C5435l(c6901l);
                c5435l.m2926l();
                c6901l.f14475l = c5435l;
                C13370l c13370l = new C13370l(c6901l);
                c13370l.m2926l();
                c6901l.f14476l = c13370l;
                C11079l c11079l = new C11079l(c6901l, i2);
                c11079l.m2926l();
                c6901l.f14455l = c11079l;
                C6448l c6448l = new C6448l(c6901l);
                c6448l.m2926l();
                c6901l.f14469l = c6448l;
                c6901l.f14470l = new C10784l(c6901l);
                if (c6901l.f14481l != c6901l.f14461l) {
                    c6901l.mo200else().f16908l.crashlytics(Integer.valueOf(c6901l.f14481l), Integer.valueOf(c6901l.f14461l), "Not all upload components initialized");
                }
                c6901l.f14450l.set(true);
                c6901l.mo200else().f16911l.yandex("UploadController is now fully initialized");
                c6901l.mo224l().mo211l();
                C8648l c8648l3 = c6901l.f14451l;
                C6901l.m2082case(c8648l3);
                c8648l3.m2360l();
                C8648l c8648l4 = c6901l.f14451l;
                C6901l.m2082case(c8648l4);
                c8648l4.mo211l();
                c8648l4.m2927l();
                if (c8648l4.m2364l()) {
                    C3032l c3032l = AbstractC5981l.f12653l;
                    if (((Long) c3032l.yandex(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseM2395l2 = c8648l4.m2395l();
                        C17417l c17417l3 = (C17417l) c8648l4.f833l;
                        c17417l3.f33951l.getClass();
                        int iDelete = sQLiteDatabaseM2395l2.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(c3032l.yandex(null))});
                        if (iDelete > 0) {
                            C8118l c8118l3 = c17417l3.f33950l;
                            C17417l.admob(c8118l3);
                            c8118l3.f16911l.loadAd(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (c6901l.f14475l.f11657l.amazon() == 0) {
                    C3071l c3071l = c6901l.f14475l.f11657l;
                    c6901l.mo198abstract().getClass();
                    c3071l.purchase(System.currentTimeMillis());
                }
                c6901l.m2114volatile();
                return;
            case 14:
                throw new RuntimeException(((ExecutionException) this.f21828l).getCause());
            case 15:
                try {
                    AbstractC7151l.crashlytics((AbstractC12138l) this.f21828l);
                    return;
                } catch (Exception e2) {
                    Log.w("PhFlagUpdateRegistry", "Failed to register flag update listener which may lead to stale flags.", e2);
                    return;
                }
            case 16:
                ((C9937l) this.f21828l).isPro(false);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17987l c17987l = (C17987l) this.f21828l;
                SharedPreferences sharedPreferences = c17987l.loadAd;
                HashSet hashSet = c17987l.billing;
                if (hashSet.isEmpty()) {
                    return;
                }
                HashSet hashSet2 = c17987l.mopub;
                long j3 = true != hashSet2.equals(hashSet) ? 86400000L : 172800000L;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j4 = c17987l.admob;
                if (j4 == 0 || jCurrentTimeMillis - j4 >= j3) {
                    C17987l.subs.loadAd("Upload the feature usage report.", new Object[0]);
                    C11314l c11314lSmaato = C15809l.smaato();
                    String str = C17987l.isPro;
                    c11314lSmaato.yandex();
                    ((C15809l) c11314lSmaato.f3757l).vip(str);
                    String str2 = c17987l.crashlytics;
                    c11314lSmaato.yandex();
                    ((C15809l) c11314lSmaato.f3757l).remoteconfig(str2);
                    C15809l c15809l = (C15809l) c11314lSmaato.loadAd();
                    ArrayList arrayList = new ArrayList();
                    arrayList.addAll(hashSet);
                    C6138l c6138lSmaato = C9306l.smaato();
                    c6138lSmaato.yandex();
                    ((C9306l) c6138lSmaato.f3757l).vip(arrayList);
                    c6138lSmaato.yandex();
                    ((C9306l) c6138lSmaato.f3757l).remoteconfig(c15809l);
                    C9306l c9306l = (C9306l) c6138lSmaato.loadAd();
                    C15010l c15010lRemoteconfig = C18278l.remoteconfig();
                    c15010lRemoteconfig.yandex();
                    ((C18278l) c15010lRemoteconfig.f3757l).advert(c9306l);
                    c17987l.yandex.yandex((C18278l) c15010lRemoteconfig.loadAd(), 243);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    if (!hashSet2.equals(hashSet)) {
                        hashSet2.clear();
                        hashSet2.addAll(hashSet);
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            String string = Integer.toString(((EnumC10345l) it.next()).f21131l);
                            String strStartapp = AbstractC14814l.startapp("feature_usage_timestamp_reported_feature_", string);
                            if (!sharedPreferences.contains(strStartapp)) {
                                strStartapp = AbstractC14814l.startapp("feature_usage_timestamp_detected_feature_", string);
                            }
                            String strStartapp2 = AbstractC14814l.startapp("feature_usage_timestamp_reported_feature_", string);
                            if (!TextUtils.equals(strStartapp, strStartapp2)) {
                                long j5 = sharedPreferences.getLong(strStartapp, 0L);
                                editorEdit.remove(strStartapp);
                                if (j5 != 0) {
                                    editorEdit.putLong(strStartapp2, j5);
                                }
                            }
                        }
                    }
                    c17987l.admob = jCurrentTimeMillis;
                    editorEdit.putLong("feature_usage_last_report_time", jCurrentTimeMillis).apply();
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                if (((Boolean) ((C6305l) this.f21828l).crashlytics.get()).booleanValue()) {
                    Log.i("PhenotypeProcessReaper", "Killing process to refresh experiment configuration");
                    Process.killProcess(Process.myPid());
                    System.exit(0);
                    return;
                }
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                try {
                    AbstractC7151l.crashlytics((AbstractC11257l) this.f21828l);
                    return;
                } catch (Exception e3) {
                    if (Log.isLoggable("StorageInfoHandler", 3)) {
                        Log.d("StorageInfoHandler", "Failed to get storage info from GMS", e3);
                        return;
                    }
                    return;
                }
            case 20:
                C17417l c17417l4 = (C17417l) ((C13773l) this.f21828l).loadAd;
                C17417l.purchase(c17417l4.f33930l);
                c17417l4.f33930l.m1233l(((Long) AbstractC5981l.appmetrica.yandex(null)).longValue());
                return;
            default:
                C17417l c17417l5 = (C17417l) this.f21828l;
                C17410l c17410l3 = c17417l5.f33949l;
                C11675l c11675l2 = c17417l5.f33927l;
                C17417l.billing(c17410l3);
                c17410l3.mo211l();
                if (c17410l3.m4374l() != 1) {
                    C8118l c8118l4 = c17417l5.f33950l;
                    C17417l.admob(c8118l4);
                    c8118l4.f16910l.yandex("registerTrigger called but app not eligible");
                    return;
                }
                C17417l.mopub(c11675l2);
                c11675l2.mo211l();
                C6820l c6820l = c11675l2.f23406l;
                if (c6820l != null) {
                    c6820l.crashlytics();
                }
                C17417l.mopub(c11675l2);
                new Thread(new RunnableC12967l(c11675l2, i)).start();
                return;
        }
    }

    public /* synthetic */ RunnableC10799l(int i, Object obj) {
        this.f21829l = i;
        this.f21828l = obj;
    }

    public RunnableC10799l(BinderC17532l binderC17532l) {
        this.f21829l = 1;
        Objects.requireNonNull(binderC17532l);
        this.f21828l = binderC17532l;
    }

    public RunnableC10799l(C10784l c10784l, boolean z) {
        this.f21829l = 8;
        this.f21828l = c10784l;
    }

    public RunnableC10799l(C6901l c6901l, C2290l c2290l) {
        this.f21829l = 13;
        this.f21828l = c6901l;
    }
}

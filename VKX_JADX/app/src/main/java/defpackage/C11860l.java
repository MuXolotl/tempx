package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lِٕٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C11860l extends AbstractC10618l {

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public final C18691l f23687l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public ScheduledExecutorService f23688l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public final ArrayList f23689l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public InterfaceC5496l f23690l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ServiceConnectionC14909l f23691l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public final C3253l f23692l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public volatile Boolean f23693l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C18691l f23694l;

    public C11860l(C17417l c17417l) {
        super(c17417l);
        this.f23689l = new ArrayList();
        this.f23692l = new C3253l(c17417l.f33951l);
        this.f23691l = new ServiceConnectionC14909l(this);
        this.f23687l = new C18691l(this, c17417l, 0);
        this.f23694l = new C18691l(this, c17417l, 1);
    }

    /* JADX INFO: renamed from: lؒۡۦ, reason: contains not printable characters */
    public final void m3254l(C17509l c17509l) {
        boolean zM3211l;
        mo211l();
        m2935l();
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.getClass();
        C11694l c11694lIsPro = c17417l.isPro();
        C17417l c17417l2 = (C17417l) c11694lIsPro.f833l;
        C17417l.billing(c17417l2.f33949l);
        byte[] bArrM4335l = C17410l.m4335l(c17509l);
        if (bArrM4335l.length > 131072) {
            C8118l c8118l = c17417l2.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16909l.yandex("Conditional user property too long for local database. Sending directly to service");
            zM3211l = false;
        } else {
            zM3211l = c11694lIsPro.m3211l(2, bArrM4335l);
        }
        m3267l(new RunnableC6706l(this, m3269l(true), zM3211l, new C17509l(c17509l)));
    }

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public final void m3255l() {
        mo211l();
        m2935l();
        ServiceConnectionC14909l serviceConnectionC14909l = this.f23691l;
        if (serviceConnectionC14909l.f29352l != null && (serviceConnectionC14909l.f29352l.subscription() || serviceConnectionC14909l.f29352l.tapsense())) {
            serviceConnectionC14909l.f29352l.billing();
        }
        serviceConnectionC14909l.f29352l = null;
        try {
            C8394l.loadAd().crashlytics(((C17417l) this.f833l).f33936l, serviceConnectionC14909l);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f23690l = null;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public final void m3256l(Bundle bundle) {
        boolean z;
        boolean zM3211l;
        mo211l();
        m2935l();
        C16021l c16021l = new C16021l(bundle);
        m3261l();
        C17417l c17417l = (C17417l) this.f833l;
        if (c17417l.f33945l.m1682l(null, AbstractC5981l.f12688l)) {
            C11694l c11694lIsPro = c17417l.isPro();
            C17417l c17417l2 = (C17417l) c11694lIsPro.f833l;
            C17410l c17410l = c17417l2.f33949l;
            C8118l c8118l = c17417l2.f33950l;
            C17417l.billing(c17410l);
            byte[] bArrM4335l = C17410l.m4335l(c16021l);
            if (bArrM4335l == null) {
                C17417l.admob(c8118l);
                c8118l.f16909l.yandex("Null default event parameters; not writing to database");
            } else {
                if (bArrM4335l.length > 131072) {
                    C17417l.admob(c8118l);
                    c8118l.f16909l.yandex("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zM3211l = c11694lIsPro.m3211l(4, bArrM4335l);
                }
                if (zM3211l) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM3211l = false;
            if (zM3211l) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        m3267l(new RunnableC10887l(this, m3269l(false), z, c16021l, bundle));
    }

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public final void m3257l(AtomicReference atomicReference) {
        mo211l();
        m2935l();
        m3267l(new RunnableC7706l(this, atomicReference, m3269l(false)));
    }

    /* JADX INFO: renamed from: lٍؖۜ, reason: contains not printable characters */
    public final void m3258l() {
        mo211l();
        C17417l c17417l = (C17417l) this.f833l;
        C8118l c8118l = c17417l.f33950l;
        C17417l.admob(c8118l);
        C14906l c14906l = c8118l.f16911l;
        ArrayList arrayList = this.f23689l;
        c14906l.loadAd(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                C8118l c8118l2 = c17417l.f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f23694l.crashlytics();
    }

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public final void m3259l() {
        mo211l();
        m2935l();
        if (m3262l()) {
            return;
        }
        if (m3263l()) {
            this.f23691l.yandex();
            return;
        }
        C17417l c17417l = (C17417l) this.f833l;
        if (c17417l.f33945l.m1684l()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = c17417l.f33936l.getPackageManager().queryIntentServices(new Intent().setClassName(c17417l.f33936l, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c17417l.f33936l, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC14909l serviceConnectionC14909l = this.f23691l;
        C11860l c11860l = serviceConnectionC14909l.f29351l;
        c11860l.mo211l();
        Context context = ((C17417l) c11860l.f833l).f33936l;
        C8394l c8394lLoadAd = C8394l.loadAd();
        synchronized (serviceConnectionC14909l) {
            try {
                boolean z = serviceConnectionC14909l.f29353l;
                C11860l c11860l2 = serviceConnectionC14909l.f29351l;
                if (z) {
                    C8118l c8118l2 = ((C17417l) c11860l2.f833l).f33950l;
                    C17417l.admob(c8118l2);
                    c8118l2.f16911l.yandex("Connection attempt already in progress");
                } else {
                    C8118l c8118l3 = ((C17417l) c11860l2.f833l).f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16911l.yandex("Using local app measurement service");
                    serviceConnectionC14909l.f29353l = true;
                    c8394lLoadAd.yandex(context, intent, c11860l2.f23691l, 129);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public final boolean m3260l() {
        mo211l();
        m2935l();
        if (!m3263l()) {
            return true;
        }
        C17410l c17410l = ((C17417l) this.f833l).f33949l;
        C17417l.billing(c17410l);
        return c17410l.m4348l() >= 241200;
    }

    /* JADX INFO: renamed from: lؚۥۚ, reason: contains not printable characters */
    public final void m3261l() {
        ((C17417l) this.f833l).getClass();
    }

    /* JADX INFO: renamed from: lًٖۘ, reason: contains not printable characters */
    public final boolean m3262l() {
        mo211l();
        m2935l();
        return this.f23690l != null;
    }

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public final boolean m3263l() {
        mo211l();
        m2935l();
        if (this.f23693l == null) {
            mo211l();
            m2935l();
            C17417l c17417l = (C17417l) this.f833l;
            C16386l c16386l = c17417l.f33944l;
            C17417l.billing(c16386l);
            c16386l.mo211l();
            boolean z = false;
            Boolean boolValueOf = !c16386l.m4180l().contains("use_service") ? null : Boolean.valueOf(c16386l.m4180l().getBoolean("use_service", false));
            boolean z2 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                C9925l c9925lRemoteconfig = ((C17417l) this.f833l).remoteconfig();
                c9925lRemoteconfig.m2935l();
                if (c9925lRemoteconfig.f20208l == 1) {
                    z = true;
                } else {
                    C8118l c8118l = c17417l.f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16911l.yandex("Checking service availability");
                    C17410l c17410l = c17417l.f33949l;
                    C17417l.billing(c17410l);
                    int iCrashlytics = C13268l.loadAd.crashlytics(((C17417l) c17410l.f833l).f33936l, 12451000);
                    if (iCrashlytics == 0) {
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16911l.yandex("Service available");
                    } else if (iCrashlytics == 1) {
                        C8118l c8118l3 = c17417l.f33950l;
                        C17417l.admob(c8118l3);
                        c8118l3.f16911l.yandex("Service missing");
                    } else if (iCrashlytics != 2) {
                        if (iCrashlytics != 3) {
                            C8118l c8118l4 = c17417l.f33950l;
                            if (iCrashlytics == 9) {
                                C17417l.admob(c8118l4);
                                c8118l4.f16910l.yandex("Service invalid");
                            } else if (iCrashlytics != 18) {
                                C17417l.admob(c8118l4);
                                c8118l4.f16910l.loadAd(Integer.valueOf(iCrashlytics), "Unexpected service status");
                            } else {
                                C17417l.admob(c8118l4);
                                c8118l4.f16910l.yandex("Service updating");
                            }
                        } else {
                            C8118l c8118l5 = c17417l.f33950l;
                            C17417l.admob(c8118l5);
                            c8118l5.f16910l.yandex("Service disabled");
                        }
                        z2 = false;
                    } else {
                        C8118l c8118l6 = c17417l.f33950l;
                        C17417l.admob(c8118l6);
                        c8118l6.f16918l.yandex("Service container out of date");
                        C17410l c17410l2 = c17417l.f33949l;
                        C17417l.billing(c17410l2);
                        if (c17410l2.m4348l() >= 17443) {
                            z = boolValueOf == null;
                            z2 = false;
                        }
                    }
                    z = true;
                }
                if (!z && c17417l.f33945l.m1684l()) {
                    C8118l c8118l7 = c17417l.f33950l;
                    C17417l.admob(c8118l7);
                    c8118l7.f16908l.yandex("No way to upload. Consider using the full version of Analytics");
                } else if (z2) {
                    C16386l c16386l2 = c17417l.f33944l;
                    C17417l.billing(c16386l2);
                    c16386l2.mo211l();
                    SharedPreferences.Editor editorEdit = c16386l2.m4180l().edit();
                    editorEdit.putBoolean("use_service", z);
                    editorEdit.apply();
                }
                z2 = z;
            }
            this.f23693l = Boolean.valueOf(z2);
        }
        return this.f23693l.booleanValue();
    }

    /* JADX INFO: renamed from: lًٍّ, reason: contains not printable characters */
    public final void m3264l(ComponentName componentName) {
        mo211l();
        if (this.f23690l != null) {
            this.f23690l = null;
            C8118l c8118l = ((C17417l) this.f833l).f33950l;
            C17417l.admob(c8118l);
            c8118l.f16911l.loadAd(componentName, "Disconnected from device MeasurementService");
            mo211l();
            m3259l();
        }
    }

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public final boolean m3265l() {
        mo211l();
        m2935l();
        if (!m3263l()) {
            return true;
        }
        C17410l c17410l = ((C17417l) this.f833l).f33949l;
        C17417l.billing(c17410l);
        return c17410l.m4348l() >= ((Integer) AbstractC5981l.f12664l.yandex(null)).intValue();
    }

    @Override // defpackage.AbstractC10618l
    /* JADX INFO: renamed from: lَؙ۠ */
    public final boolean mo1234l() {
        return false;
    }

    /* JADX INFO: renamed from: lٍُۙ, reason: contains not printable characters */
    public final void m3266l() {
        mo211l();
        C3253l c3253l = this.f23692l;
        ((C18450l) c3253l.f6947l).getClass();
        c3253l.f6948l = SystemClock.elapsedRealtime();
        ((C17417l) this.f833l).getClass();
        this.f23687l.loadAd(((Long) AbstractC5981l.f12695new.yandex(null)).longValue());
    }

    /* JADX INFO: renamed from: lُٕۙ, reason: contains not printable characters */
    public final void m3267l(Runnable runnable) {
        mo211l();
        if (m3262l()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f23689l;
        long size = arrayList.size();
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.getClass();
        if (size >= 1000) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            c8118l.f16908l.yandex("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f23694l.loadAd(60000L);
            m3259l();
        }
    }

    /* JADX WARN: Code duplicated, block: B:258:0x043a A[Catch: all -> 0x0476, TRY_ENTER, TryCatch #49 {all -> 0x0476, blocks: (B:268:0x0466, B:258:0x043a, B:260:0x0440, B:261:0x0443, B:278:0x0487, B:207:0x0371, B:209:0x037b, B:214:0x038c), top: B:395:0x0466 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0452  */
    /* JADX WARN: Code duplicated, block: B:271:0x046d  */
    /* JADX WARN: Code duplicated, block: B:273:0x0472 A[PHI: r4 r6 r23 r24 r26 r36 r37
  0x0472: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]
  0x0472: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0455, B:281:0x0499, B:272:0x0470] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0496  */
    /* JADX WARN: Code duplicated, block: B:285:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:287:0x04af  */
    /* JADX WARN: Code duplicated, block: B:292:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:304:0x0505  */
    /* JADX WARN: Code duplicated, block: B:305:0x058f  */
    /* JADX WARN: Code duplicated, block: B:316:0x05bc A[Catch: RemoteException -> 0x05ea, TRY_LEAVE, TryCatch #40 {RemoteException -> 0x05ea, blocks: (B:314:0x05b1, B:316:0x05bc), top: B:387:0x05b1 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:337:0x0626  */
    /* JADX WARN: Code duplicated, block: B:339:0x062a  */
    /* JADX WARN: Code duplicated, block: B:341:0x064b  */
    /* JADX WARN: Code duplicated, block: B:347:0x066a  */
    /* JADX WARN: Code duplicated, block: B:353:0x0682  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0657 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x066e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049c A[SYNTHETIC] */
    /* JADX INFO: renamed from: lٖٓۧ, reason: contains not printable characters */
    public final void m3268l(InterfaceC5496l interfaceC5496l, AbstractC9453l abstractC9453l, C10462l c10462l) throws Throwable {
        ArrayList arrayList;
        C17417l c17417l;
        Context context;
        C8118l c8118l;
        int i;
        SQLiteDatabase sQLiteDatabaseM3210l;
        int i2;
        int i3;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        int i4;
        long j2;
        String string;
        C16021l c16021lCreateFromParcel;
        int i5;
        C17509l c17509lCreateFromParcel;
        C6899l c6899lCreateFromParcel;
        int size;
        int size2;
        int i6;
        C12816l c12816l;
        AbstractC9453l abstractC9453l2;
        C3032l c3032l;
        C17417l c17417l2;
        Context context2;
        C8118l c8118l2;
        long jElapsedRealtime;
        long j3;
        long jCurrentTimeMillis;
        String str2;
        mo211l();
        m2935l();
        m3261l();
        C17417l c17417l3 = (C17417l) this.f833l;
        c17417l3.getClass();
        Context context3 = c17417l3.f33936l;
        C5051l c5051l = c17417l3.f33945l;
        C8118l c8118l3 = c17417l3.f33950l;
        C18450l c18450l = c17417l3.f33951l;
        int i7 = 100;
        C10462l c10462l2 = c10462l;
        int i8 = 0;
        for (int i9 = 100; i8 < 1001 && i9 == i7; i9 = size) {
            ArrayList arrayList2 = new ArrayList();
            C11694l c11694lIsPro = c17417l3.isPro();
            String str3 = "entry";
            int i10 = i7;
            String str4 = "type";
            String str5 = "rowid";
            C18450l c18450l2 = c18450l;
            C17417l c17417l4 = (C17417l) c11694lIsPro.f833l;
            c11694lIsPro.mo211l();
            int i11 = i8;
            if (c11694lIsPro.f23443l) {
                c17417l = c17417l3;
                context = context3;
                c8118l = c8118l3;
            } else {
                arrayList = new ArrayList();
                c17417l = c17417l3;
                if (((C17417l) c11694lIsPro.f833l).f33936l.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i12 = 5;
                    context = context3;
                    c8118l = c8118l3;
                    int i13 = 0;
                    int i14 = 5;
                    while (true) {
                        if (i13 < i12) {
                            try {
                                sQLiteDatabaseM3210l = c11694lIsPro.m3210l();
                                if (sQLiteDatabaseM3210l == null) {
                                    try {
                                        try {
                                            c11694lIsPro.f23443l = true;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i14);
                                                i14 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseM3210l != null) {
                                                    sQLiteDatabaseM3210l.close();
                                                }
                                                i13 = i2 + 1;
                                                i12 = i3;
                                                str4 = str4;
                                                str3 = str3;
                                                str5 = str5;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseM3210l != null) {
                                                    sQLiteDatabaseM3210l.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e) {
                                            e = e;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            C8118l c8118l4 = c17417l4.f33950l;
                                            C17417l.admob(c8118l4);
                                            c8118l4.f16908l.loadAd(e, "Error reading entries from local database");
                                            c11694lIsPro.f23443l = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM3210l != null) {
                                                sQLiteDatabaseM3210l.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (SQLiteException e2) {
                                            e = e2;
                                            i2 = i13;
                                            str5 = str5;
                                            i3 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseM3210l != null) {
                                                sQLiteDatabaseM3210l.endTransaction();
                                            }
                                            C8118l c8118l5 = c17417l4.f33950l;
                                            C17417l.admob(c8118l5);
                                            c8118l5.f16908l.loadAd(e, "Error reading entries from local database");
                                            c11694lIsPro.f23443l = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM3210l != null) {
                                                sQLiteDatabaseM3210l.close();
                                            }
                                            i13 = i2 + 1;
                                            i12 = i3;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM3210l != null) {
                                            sQLiteDatabaseM3210l.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseM3210l.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM3210l.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j4 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i2 = i13;
                                                try {
                                                    j = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i14);
                                                        i14 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e3) {
                                                        e = e3;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        C8118l c8118l6 = c17417l4.f33950l;
                                                        C17417l.admob(c8118l6);
                                                        c8118l6.f16908l.loadAd(e, "Error reading entries from local database");
                                                        c11694lIsPro.f23443l = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e4) {
                                                        e = e4;
                                                        str5 = str5;
                                                        i3 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM3210l != null && sQLiteDatabaseM3210l.inTransaction()) {
                                                            sQLiteDatabaseM3210l.endTransaction();
                                                        }
                                                        C8118l c8118l7 = c17417l4.f33950l;
                                                        C17417l.admob(c8118l7);
                                                        c8118l7.f16908l.loadAd(e, "Error reading entries from local database");
                                                        c11694lIsPro.f23443l = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    i3 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e5) {
                                                            e = e5;
                                                            cursorQuery = null;
                                                            C8118l c8118l8 = c17417l4.f33950l;
                                                            C17417l.admob(c8118l8);
                                                            c8118l8.f16908l.loadAd(e, "Error reading entries from local database");
                                                            c11694lIsPro.f23443l = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e6) {
                                                            e = e6;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.endTransaction();
                                                            }
                                                            C8118l c8118l9 = c17417l4.f33950l;
                                                            C17417l.admob(c8118l9);
                                                            c8118l9.f16908l.loadAd(e, "Error reading entries from local database");
                                                            c11694lIsPro.f23443l = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i2 = i13;
                                                cursorQuery2.close();
                                                j = -1;
                                            }
                                            if (j != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                C5051l c5051l2 = c17417l4.f33945l;
                                                C3032l c3032l2 = AbstractC5981l.f12688l;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i15 = 4;
                                                        int i16 = 3;
                                                        if (c5051l2.m1682l(null, c3032l2)) {
                                                            i4 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e7) {
                                                                e = e7;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                C8118l c8118l10 = c17417l4.f33950l;
                                                                C17417l.admob(c8118l10);
                                                                c8118l10.f16908l.loadAd(e, "Error reading entries from local database");
                                                                c11694lIsPro.f23443l = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e8) {
                                                                e = e8;
                                                                i3 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.endTransaction();
                                                                }
                                                                C8118l c8118l11 = c17417l4.f33950l;
                                                                C17417l.admob(c8118l11);
                                                                c8118l11.f16908l.loadAd(e, "Error reading entries from local database");
                                                                c11694lIsPro.f23443l = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i4 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM3210l.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i10));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j4 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i17 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (c17417l4.f33945l.m1682l(null, c3032l2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i16);
                                                                                                j2 = cursorQuery.getLong(i15);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                i3 = 5;
                                                                                                SystemClock.sleep(i14);
                                                                                                i14 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM3210l != null) {
                                                                                                    sQLiteDatabaseM3210l.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e9) {
                                                                                                e = e9;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                i3 = 5;
                                                                                                C8118l c8118l12 = c17417l4.f33950l;
                                                                                                C17417l.admob(c8118l12);
                                                                                                c8118l12.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                c11694lIsPro.f23443l = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM3210l != null) {
                                                                                                    sQLiteDatabaseM3210l.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e10) {
                                                                                                e = e10;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                i3 = 5;
                                                                                                if (sQLiteDatabaseM3210l != null) {
                                                                                                    sQLiteDatabaseM3210l.endTransaction();
                                                                                                }
                                                                                                C8118l c8118l13 = c17417l4.f33950l;
                                                                                                C17417l.admob(c8118l13);
                                                                                                c8118l13.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                c11694lIsPro.f23443l = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM3210l != null) {
                                                                                                    sQLiteDatabaseM3210l.close();
                                                                                                }
                                                                                                i13 = i2 + 1;
                                                                                                i12 = i3;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j2 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i17 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            C13236l c13236lCreateFromParcel = C13236l.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (c13236lCreateFromParcel != null) {
                                                                                                                arrayList.add(new C12816l(c13236lCreateFromParcel, string, j2));
                                                                                                            }
                                                                                                        } catch (Throwable th5) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th5;
                                                                                                        }
                                                                                                    } catch (C8325l unused6) {
                                                                                                        C8118l c8118l14 = c17417l4.f33950l;
                                                                                                        C17417l.admob(c8118l14);
                                                                                                        c8118l14.f16908l.yandex("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                    i3 = 5;
                                                                                                    SystemClock.sleep(i14);
                                                                                                    i14 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                                        sQLiteDatabaseM3210l.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e11) {
                                                                                                    e = e11;
                                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                    i3 = 5;
                                                                                                    C8118l c8118l15 = c17417l4.f33950l;
                                                                                                    C17417l.admob(c8118l15);
                                                                                                    c8118l15.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                    c11694lIsPro.f23443l = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                                        sQLiteDatabaseM3210l.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e12) {
                                                                                                    e = e12;
                                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                    i3 = 5;
                                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                                        sQLiteDatabaseM3210l.endTransaction();
                                                                                                    }
                                                                                                    C8118l c8118l16 = c17417l4.f33950l;
                                                                                                    C17417l.admob(c8118l16);
                                                                                                    c8118l16.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                    c11694lIsPro.f23443l = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                                        sQLiteDatabaseM3210l.close();
                                                                                                    }
                                                                                                    i13 = i2 + 1;
                                                                                                    i12 = i3;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th6) {
                                                                                                th = th6;
                                                                                                sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM3210l != null) {
                                                                                                    sQLiteDatabaseM3210l.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i17 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        c6899lCreateFromParcel = C6899l.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (C8325l unused8) {
                                                                                                        C8118l c8118l17 = c17417l4.f33950l;
                                                                                                        C17417l.admob(c8118l17);
                                                                                                        c8118l17.f16908l.yandex("Failed to load user property from local database");
                                                                                                        parcelObtain2.recycle();
                                                                                                        c6899lCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (c6899lCreateFromParcel != null) {
                                                                                                        arrayList.add(new C12816l(c6899lCreateFromParcel, string, j2));
                                                                                                    }
                                                                                                } catch (Throwable th7) {
                                                                                                    parcelObtain2.recycle();
                                                                                                    throw th7;
                                                                                                }
                                                                                            } else {
                                                                                                if (i17 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            c17509lCreateFromParcel = C17509l.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (C8325l unused9) {
                                                                                                            C8118l c8118l18 = c17417l4.f33950l;
                                                                                                            C17417l.admob(c8118l18);
                                                                                                            c8118l18.f16908l.yandex("Failed to load conditional user property from local database");
                                                                                                            parcelObtain3.recycle();
                                                                                                            c17509lCreateFromParcel = null;
                                                                                                        }
                                                                                                        if (c17509lCreateFromParcel != null) {
                                                                                                            arrayList.add(new C12816l(c17509lCreateFromParcel, string, j2));
                                                                                                        }
                                                                                                    } catch (Throwable th8) {
                                                                                                        parcelObtain3.recycle();
                                                                                                        throw th8;
                                                                                                    }
                                                                                                } else if (i17 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    c16021lCreateFromParcel = C16021l.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                                        i3 = 5;
                                                                                                                        SystemClock.sleep(i14);
                                                                                                                        i14 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e13) {
                                                                                                                        e = e13;
                                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                                        i3 = 5;
                                                                                                                        C8118l c8118l19 = c17417l4.f33950l;
                                                                                                                        C17417l.admob(c8118l19);
                                                                                                                        c8118l19.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                                        c11694lIsPro.f23443l = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e14) {
                                                                                                                        e = e14;
                                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                                        i3 = 5;
                                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                                            sQLiteDatabaseM3210l.endTransaction();
                                                                                                                        }
                                                                                                                        C8118l c8118l110 = c17417l4.f33950l;
                                                                                                                        C17417l.admob(c8118l110);
                                                                                                                        c8118l110.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                                        c11694lIsPro.f23443l = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                                        }
                                                                                                                        i13 = i2 + 1;
                                                                                                                        i12 = i3;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (C8325l unused11) {
                                                                                                                    C8118l c8118l20 = c17417l4.f33950l;
                                                                                                                    C17417l.admob(c8118l20);
                                                                                                                    c8118l20.f16908l.yandex("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    c16021lCreateFromParcel = null;
                                                                                                                }
                                                                                                                if (c16021lCreateFromParcel != null) {
                                                                                                                    arrayList.add(new C12816l(c16021lCreateFromParcel, string, j2));
                                                                                                                }
                                                                                                                i5 = 3;
                                                                                                            } catch (Throwable th9) {
                                                                                                                th = th9;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (C8325l unused12) {
                                                                                                        } catch (Throwable th10) {
                                                                                                            th = th10;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                        i3 = 5;
                                                                                                        SystemClock.sleep(i14);
                                                                                                        i14 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e15) {
                                                                                                        e = e15;
                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                        i3 = 5;
                                                                                                        C8118l c8118l111 = c17417l4.f33950l;
                                                                                                        C17417l.admob(c8118l111);
                                                                                                        c8118l111.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                        c11694lIsPro.f23443l = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e16) {
                                                                                                        e = e16;
                                                                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                                        i3 = 5;
                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                            sQLiteDatabaseM3210l.endTransaction();
                                                                                                        }
                                                                                                        C8118l c8118l112 = c17417l4.f33950l;
                                                                                                        C17417l.admob(c8118l112);
                                                                                                        c8118l112.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                                        c11694lIsPro.f23443l = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM3210l != null) {
                                                                                                            sQLiteDatabaseM3210l.close();
                                                                                                        }
                                                                                                        i13 = i2 + 1;
                                                                                                        i12 = i3;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    C8118l c8118l21 = c17417l4.f33950l;
                                                                                                    i5 = 3;
                                                                                                    if (i17 == 3) {
                                                                                                        C17417l.admob(c8118l21);
                                                                                                        c8118l21.f16911l.yandex("Skipping app launch break");
                                                                                                    } else {
                                                                                                        C17417l.admob(c8118l21);
                                                                                                        c8118l21.f16908l.yandex("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i16 = i5;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                c3032l2 = c3032l2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i15 = 4;
                                                                                            }
                                                                                        }
                                                                                        i5 = 3;
                                                                                        i16 = i5;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        c3032l2 = c3032l2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i15 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e17) {
                                                                                        e = e17;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e18) {
                                                                                        e = e18;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                    i3 = 5;
                                                                                    SystemClock.sleep(i14);
                                                                                    i14 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                        sQLiteDatabaseM3210l.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e19) {
                                                                                    e = e19;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                    i3 = 5;
                                                                                    C8118l c8118l113 = c17417l4.f33950l;
                                                                                    C17417l.admob(c8118l113);
                                                                                    c8118l113.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                    c11694lIsPro.f23443l = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                        sQLiteDatabaseM3210l.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e20) {
                                                                                    e = e20;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                                                    i3 = 5;
                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                        sQLiteDatabaseM3210l.endTransaction();
                                                                                    }
                                                                                    C8118l c8118l114 = c17417l4.f33950l;
                                                                                    C17417l.admob(c8118l114);
                                                                                    c8118l114.f16908l.loadAd(e, "Error reading entries from local database");
                                                                                    c11694lIsPro.f23443l = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM3210l != null) {
                                                                                        sQLiteDatabaseM3210l.close();
                                                                                    }
                                                                                    i13 = i2 + 1;
                                                                                    i12 = i3;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e21) {
                                                                                e = e21;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e22) {
                                                                                e = e22;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e23) {
                                                                            e = e23;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e24) {
                                                                            e = e24;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e25) {
                                                                        e = e25;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e26) {
                                                                        e = e26;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th11) {
                                                                    th = th11;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i = 0;
                                                            sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                            try {
                                                                if (sQLiteDatabaseM3210l.delete("messages", "rowid <= ?", new String[]{Long.toString(j4)}) < arrayList.size()) {
                                                                    C8118l c8118l22 = c17417l4.f33950l;
                                                                    C17417l.admob(c8118l22);
                                                                    c8118l22.f16908l.yandex("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM3210l.setTransactionSuccessful();
                                                                sQLiteDatabaseM3210l.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM3210l.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i3 = 5;
                                                                SystemClock.sleep(i14);
                                                                i14 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e27) {
                                                                e = e27;
                                                                i3 = 5;
                                                                C8118l c8118l115 = c17417l4.f33950l;
                                                                C17417l.admob(c8118l115);
                                                                c8118l115.f16908l.loadAd(e, "Error reading entries from local database");
                                                                c11694lIsPro.f23443l = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e28) {
                                                                e = e28;
                                                                i3 = 5;
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.endTransaction();
                                                                }
                                                                C8118l c8118l116 = c17417l4.f33950l;
                                                                C17417l.admob(c8118l116);
                                                                c8118l116.f16908l.loadAd(e, "Error reading entries from local database");
                                                                c11694lIsPro.f23443l = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM3210l != null) {
                                                                    sQLiteDatabaseM3210l.close();
                                                                }
                                                                i13 = i2 + 1;
                                                                i12 = i3;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                            str4 = str4;
                                                            i3 = i4;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i14);
                                                            i14 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM3210l != null) {
                                                                sQLiteDatabaseM3210l.close();
                                                            }
                                                            i13 = i2 + 1;
                                                            i12 = i3;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e29) {
                                                        e = e29;
                                                        str3 = str3;
                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        C8118l c8118l117 = c17417l4.f33950l;
                                                        C17417l.admob(c8118l117);
                                                        c8118l117.f16908l.loadAd(e, "Error reading entries from local database");
                                                        c11694lIsPro.f23443l = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e30) {
                                                        e = e30;
                                                        str3 = str3;
                                                        sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                        str4 = str4;
                                                        i3 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.endTransaction();
                                                        }
                                                        C8118l c8118l118 = c17417l4.f33950l;
                                                        C17417l.admob(c8118l118);
                                                        c8118l118.f16908l.loadAd(e, "Error reading entries from local database");
                                                        c11694lIsPro.f23443l = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM3210l != null) {
                                                            sQLiteDatabaseM3210l.close();
                                                        }
                                                        i13 = i2 + 1;
                                                        i12 = i3;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseM3210l = sQLiteDatabaseM3210l;
                                                    str4 = str4;
                                                    i3 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i14);
                                                    i14 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM3210l != null) {
                                                        sQLiteDatabaseM3210l.close();
                                                    }
                                                    i13 = i2 + 1;
                                                    i12 = i3;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e31) {
                                                e = e31;
                                                str5 = str5;
                                            } catch (SQLiteException e32) {
                                                e = e32;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i2 = i13;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i2 = i13;
                                        i3 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM3210l = null;
                            } catch (SQLiteFullException e33) {
                                e = e33;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM3210l = null;
                            } catch (SQLiteException e34) {
                                e = e34;
                                i2 = i13;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i3 = 5;
                                sQLiteDatabaseM3210l = null;
                            } catch (Throwable th14) {
                                th = th14;
                                sQLiteDatabaseM3210l = null;
                            }
                        } else {
                            i = 0;
                            C8118l c8118l23 = c17417l4.f33950l;
                            C17417l.admob(c8118l23);
                            c8118l23.f16910l.yandex("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i13 = i2 + 1;
                        i12 = i3;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    c8118l = c8118l3;
                    i = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i;
                }
                if (abstractC9453l != null && size < i10) {
                    arrayList2.add(new C12816l(abstractC9453l, c10462l2.f21288l, c10462l2.f21302l));
                }
                size2 = arrayList2.size();
                i6 = i;
                while (i6 < size2) {
                    c12816l = (C12816l) arrayList2.get(i6);
                    abstractC9453l2 = c12816l.yandex;
                    c3032l = AbstractC5981l.f12688l;
                    if (c5051l.m1682l(null, c3032l)) {
                        str2 = c12816l.loadAd;
                        if (!TextUtils.isEmpty(str2)) {
                            c10462l2 = new C10462l(c10462l2.f21296l, c10462l2.f21295l, str2, c12816l.crashlytics, c10462l2.f21305l, c10462l2.f21304l, c10462l2.f21311l, c10462l2.f21289l, c10462l2.f21292l, c10462l2.f21310l, c10462l2.f21312l, c10462l2.f21308l, c10462l2.f21287l, c10462l2.f21313l, c10462l2.f21303l, c10462l2.f21293l, c10462l2.f21298l, c10462l2.f21315l, c10462l2.f21297l, c10462l2.f21291l, c10462l2.f21290l, c10462l2.f21286l, c10462l2.f21316l, c10462l2.f21294l, c10462l2.f21301l, c10462l2.f21307l, c10462l2.f21285l, c10462l2.f21300l, c10462l2.f21306l, c10462l2.f21314l, c10462l2.f21299l, c10462l2.f21309l);
                        }
                    }
                    if (abstractC9453l2 instanceof C13236l) {
                        try {
                            c18450l2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                c18450l2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        interfaceC5496l.mo1794break((C13236l) abstractC9453l2, c10462l2);
                                        C17417l.admob(c8118l);
                                        c8118l2 = c8118l;
                                        try {
                                            c8118l2.f16911l.yandex("Logging telemetry for logEvent from database");
                                            if (C12418l.f24517l == null) {
                                                c17417l2 = c17417l;
                                                context2 = context;
                                                try {
                                                    C12418l.f24517l = new C12418l(context2, c17417l2);
                                                } catch (RemoteException e35) {
                                                    e = e35;
                                                    j3 = jCurrentTimeMillis;
                                                    C17417l.admob(c8118l2);
                                                    c8118l2.f16908l.loadAd(e, "Failed to send event to the service");
                                                    if (j3 != 0) {
                                                        if (C12418l.f24517l == null) {
                                                            C12418l.f24517l = new C12418l(context2, c17417l2);
                                                        }
                                                        C12418l c12418l = C12418l.f24517l;
                                                        c18450l2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        c18450l2.getClass();
                                                        c12418l.signatures(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                c17417l2 = c17417l;
                                                context2 = context;
                                            }
                                            C12418l c12418l2 = C12418l.f24517l;
                                            c18450l2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            c18450l2.getClass();
                                            c12418l2.signatures(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e36) {
                                            e = e36;
                                            c17417l2 = c17417l;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e37) {
                                        e = e37;
                                        c17417l2 = c17417l;
                                        context2 = context;
                                        c8118l2 = c8118l;
                                        j3 = jCurrentTimeMillis;
                                        C17417l.admob(c8118l2);
                                        c8118l2.f16908l.loadAd(e, "Failed to send event to the service");
                                        if (j3 != 0) {
                                            if (C12418l.f24517l == null) {
                                                C12418l.f24517l = new C12418l(context2, c17417l2);
                                            }
                                            C12418l c12418l3 = C12418l.f24517l;
                                            c18450l2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            c18450l2.getClass();
                                            c12418l3.signatures(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j3, jCurrentTimeMillis4);
                                        }
                                        i6++;
                                        c8118l = c8118l2;
                                        c17417l = c17417l2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e38) {
                                    e = e38;
                                }
                            } catch (RemoteException e39) {
                                e = e39;
                                c17417l2 = c17417l;
                                context2 = context;
                                c8118l2 = c8118l;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e40) {
                            e = e40;
                            c17417l2 = c17417l;
                            context2 = context;
                            c8118l2 = c8118l;
                            jElapsedRealtime = 0;
                            j3 = 0;
                        }
                    } else {
                        c17417l2 = c17417l;
                        context2 = context;
                        c8118l2 = c8118l;
                        if (abstractC9453l2 instanceof C6899l) {
                            try {
                                interfaceC5496l.mo1796const((C6899l) abstractC9453l2, c10462l2);
                            } catch (RemoteException e41) {
                                C17417l.admob(c8118l2);
                                c8118l2.f16908l.loadAd(e41, "Failed to send user property to the service");
                            }
                        } else {
                            if (abstractC9453l2 instanceof C17509l) {
                                try {
                                    interfaceC5496l.mo1798import((C17509l) abstractC9453l2, c10462l2);
                                } catch (RemoteException e42) {
                                    C17417l.admob(c8118l2);
                                    c8118l2.f16908l.loadAd(e42, "Failed to send conditional user property to the service");
                                }
                            } else if (c5051l.m1682l(null, c3032l) || !(abstractC9453l2 instanceof C16021l)) {
                                C17417l.admob(c8118l2);
                                c8118l2.f16908l.yandex("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    interfaceC5496l.isVip(((C16021l) abstractC9453l2).firebase(), c10462l2);
                                } catch (RemoteException e43) {
                                    C17417l.admob(c8118l2);
                                    c8118l2.f16908l.loadAd(e43, "Failed to send default event parameters to the service");
                                }
                            }
                            i6++;
                            c8118l = c8118l2;
                            c17417l = c17417l2;
                            context = context2;
                            size = size;
                        }
                    }
                    i6++;
                    c8118l = c8118l2;
                    c17417l = c17417l2;
                    context = context2;
                    size = size;
                }
                c8118l3 = c8118l;
                c17417l3 = c17417l;
                context3 = context;
                c18450l = c18450l2;
                i7 = 100;
                i8 = i11 + 1;
            }
            i = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i;
            }
            if (abstractC9453l != null) {
                arrayList2.add(new C12816l(abstractC9453l, c10462l2.f21288l, c10462l2.f21302l));
            }
            size2 = arrayList2.size();
            i6 = i;
            while (i6 < size2) {
                c12816l = (C12816l) arrayList2.get(i6);
                abstractC9453l2 = c12816l.yandex;
                c3032l = AbstractC5981l.f12688l;
                if (c5051l.m1682l(null, c3032l)) {
                    str2 = c12816l.loadAd;
                    if (!TextUtils.isEmpty(str2)) {
                        c10462l2 = new C10462l(c10462l2.f21296l, c10462l2.f21295l, str2, c12816l.crashlytics, c10462l2.f21305l, c10462l2.f21304l, c10462l2.f21311l, c10462l2.f21289l, c10462l2.f21292l, c10462l2.f21310l, c10462l2.f21312l, c10462l2.f21308l, c10462l2.f21287l, c10462l2.f21313l, c10462l2.f21303l, c10462l2.f21293l, c10462l2.f21298l, c10462l2.f21315l, c10462l2.f21297l, c10462l2.f21291l, c10462l2.f21290l, c10462l2.f21286l, c10462l2.f21316l, c10462l2.f21294l, c10462l2.f21301l, c10462l2.f21307l, c10462l2.f21285l, c10462l2.f21300l, c10462l2.f21306l, c10462l2.f21314l, c10462l2.f21299l, c10462l2.f21309l);
                    }
                }
                if (abstractC9453l2 instanceof C13236l) {
                    c18450l2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    c18450l2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    interfaceC5496l.mo1794break((C13236l) abstractC9453l2, c10462l2);
                    C17417l.admob(c8118l);
                    c8118l2 = c8118l;
                    c8118l2.f16911l.yandex("Logging telemetry for logEvent from database");
                    if (C12418l.f24517l == null) {
                        c17417l2 = c17417l;
                        context2 = context;
                        C12418l.f24517l = new C12418l(context2, c17417l2);
                    } else {
                        c17417l2 = c17417l;
                        context2 = context;
                    }
                    C12418l c12418l4 = C12418l.f24517l;
                    c18450l2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    c18450l2.getClass();
                    c12418l4.signatures(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    c17417l2 = c17417l;
                    context2 = context;
                    c8118l2 = c8118l;
                    if (abstractC9453l2 instanceof C6899l) {
                        interfaceC5496l.mo1796const((C6899l) abstractC9453l2, c10462l2);
                    } else {
                        if (abstractC9453l2 instanceof C17509l) {
                            interfaceC5496l.mo1798import((C17509l) abstractC9453l2, c10462l2);
                        } else if (c5051l.m1682l(null, c3032l)) {
                            C17417l.admob(c8118l2);
                            c8118l2.f16908l.yandex("Discarding data. Unrecognized parcel type.");
                        } else {
                            C17417l.admob(c8118l2);
                            c8118l2.f16908l.yandex("Discarding data. Unrecognized parcel type.");
                        }
                        i6++;
                        c8118l = c8118l2;
                        c17417l = c17417l2;
                        context = context2;
                        size = size;
                    }
                }
                i6++;
                c8118l = c8118l2;
                c17417l = c17417l2;
                context = context2;
                size = size;
            }
            c8118l3 = c8118l;
            c17417l3 = c17417l;
            context3 = context;
            c18450l = c18450l2;
            i7 = 100;
            i8 = i11 + 1;
        }
    }

    /* JADX INFO: renamed from: l٘ٛؒ, reason: contains not printable characters */
    public final C10462l m3269l(boolean z) {
        long jAbs;
        Pair pair;
        C17417l c17417l = (C17417l) this.f833l;
        c17417l.getClass();
        C9925l c9925lRemoteconfig = c17417l.remoteconfig();
        String strAd = null;
        if (z) {
            C8118l c8118l = c17417l.f33950l;
            C17417l.admob(c8118l);
            C17417l c17417l2 = (C17417l) c8118l.f833l;
            C16386l c16386l = c17417l2.f33944l;
            C17417l.billing(c16386l);
            if (c16386l.f32058l != null) {
                C16386l c16386l2 = c17417l2.f33944l;
                C17417l.billing(c16386l2);
                C18338l c18338l = c16386l2.f32058l;
                C16386l c16386l3 = (C16386l) c18338l.f35849l;
                c16386l3.mo211l();
                c16386l3.mo211l();
                long j = ((C16386l) c18338l.f35849l).m4180l().getLong((String) c18338l.f35847l, 0L);
                if (j == 0) {
                    c18338l.m4523throws();
                    jAbs = 0;
                } else {
                    ((C17417l) c16386l3.f833l).f33951l.getClass();
                    jAbs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = c18338l.f35848l;
                if (jAbs < j2) {
                    pair = null;
                } else if (jAbs > j2 + j2) {
                    c18338l.m4523throws();
                    pair = null;
                } else {
                    String string = c16386l3.m4180l().getString((String) c18338l.f35850l, null);
                    long j3 = c16386l3.m4180l().getLong((String) c18338l.f35846l, 0L);
                    c18338l.m4523throws();
                    pair = (string == null || j3 <= 0) ? C16386l.f32039l : new Pair(string, Long.valueOf(j3));
                }
                if (pair != null && pair != C16386l.f32039l) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strAd = AbstractC9361l.ad(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return c9925lRemoteconfig.m2820l(strAd);
    }
}

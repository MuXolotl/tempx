package defpackage;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* JADX INFO: renamed from: lٗؒؓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC16843l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f32872l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f32873l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f32874l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f32875l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f32876l;

    public RunnableC16843l(C11675l c11675l, AtomicReference atomicReference, String str, String str2) {
        this.f32874l = 8;
        this.f32873l = atomicReference;
        this.f32872l = str;
        this.f32876l = str2;
        Objects.requireNonNull(c11675l);
        this.f32875l = c11675l;
    }

    private final void loadAd() {
        C11860l c11860l = (C11860l) this.f32873l;
        AtomicReference atomicReference = (AtomicReference) this.f32872l;
        C10462l c10462l = (C10462l) this.f32876l;
        C18032l c18032l = (C18032l) this.f32875l;
        synchronized (atomicReference) {
            try {
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                if (interfaceC5496l != null) {
                    interfaceC5496l.signatures(c10462l, c18032l, new BinderC8615l(c11860l, atomicReference));
                    c11860l.m3266l();
                } else {
                    C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.yandex("[sgtm] Failed to get upload batches; not connected to service");
                }
            } catch (RemoteException e) {
                C8118l c8118l2 = ((C17417l) c11860l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
        }
    }

    private final void yandex() {
        C11860l c11860l = (C11860l) this.f32873l;
        AtomicReference atomicReference = (AtomicReference) this.f32872l;
        C10462l c10462l = (C10462l) this.f32876l;
        Bundle bundle = (Bundle) this.f32875l;
        synchronized (atomicReference) {
            try {
                InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                if (interfaceC5496l != null) {
                    interfaceC5496l.mo1805l(c10462l, bundle, new BinderC2813l(c11860l, atomicReference));
                    c11860l.m3266l();
                } else {
                    C8118l c8118l = ((C17417l) c11860l.f833l).f33950l;
                    C17417l.admob(c8118l);
                    c8118l.f16908l.yandex("Failed to request trigger URIs; not connected to service");
                }
            } catch (RemoteException e) {
                C8118l c8118l2 = ((C17417l) c11860l.f833l).f33950l;
                C17417l.admob(c8118l2);
                c8118l2.f16908l.loadAd(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x046a  */
    /* JADX WARN: Code duplicated, block: B:126:0x047f A[LOOP:2: B:124:0x0479->B:126:0x047f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:131:0x04cf A[Catch: lٍۢٛ -> 0x0538, LOOP:3: B:129:0x04c5->B:131:0x04cf, LOOP_END, TryCatch #4 {lٍۢٛ -> 0x0538, blocks: (B:128:0x04b8, B:129:0x04c5, B:131:0x04cf, B:132:0x0505, B:134:0x0520), top: B:235:0x04b8 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x0520 A[Catch: lٍۢٛ -> 0x0538, TRY_LEAVE, TryCatch #4 {lٍۢٛ -> 0x0538, blocks: (B:128:0x04b8, B:129:0x04c5, B:131:0x04cf, B:132:0x0505, B:134:0x0520), top: B:235:0x04b8 }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Bundle bundle;
        C8736l c8736l;
        C8208l c8208l;
        int i5;
        long jElapsedRealtime;
        String str;
        C2673l c2673lM165final;
        byte[] bArrMo1802l = null;
        switch (this.f32874l) {
            case 0:
                ViewOnKeyListenerC8334l viewOnKeyListenerC8334l = (ViewOnKeyListenerC8334l) ((C5008l) this.f32875l).f10245l;
                C17858l c17858l = (C17858l) this.f32872l;
                C11095l c11095l = (C11095l) this.f32873l;
                if (c11095l != null) {
                    viewOnKeyListenerC8334l.f17254l = true;
                    c11095l.loadAd.crashlytics(false);
                    viewOnKeyListenerC8334l.f17254l = false;
                }
                if (c17858l.isEnabled() && c17858l.hasSubMenu()) {
                    ((MenuC4984l) this.f32876l).adcel(c17858l, null, 4);
                    return;
                }
                return;
            case 1:
                C12014l c12014l = (C12014l) this.f32875l;
                int i6 = 0;
                while (true) {
                    C11154l c11154l = ((ServiceC16415l) c12014l.f23943l).f32110l;
                    if (i6 >= c11154l.f11161l) {
                        return;
                    }
                    C7996l c7996l = (C7996l) c11154l.subs(i6);
                    if (c7996l.amazon.equals((C16701l) this.f32873l)) {
                        String str2 = (String) this.f32872l;
                        Bundle bundle2 = (Bundle) this.f32876l;
                        List<C17879l> list = (List) c7996l.billing.get(str2);
                        if (list != null) {
                            for (C17879l c17879l : list) {
                                Bundle bundle3 = (Bundle) c17879l.loadAd;
                                int i7 = bundle2.getInt("android.media.browse.extra.PAGE", -1);
                                int i8 = bundle3 == null ? -1 : bundle3.getInt("android.media.browse.extra.PAGE", -1);
                                int i9 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                                int i10 = bundle3 == null ? -1 : bundle3.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                                if (i7 == -1 || i9 == -1) {
                                    i = Integer.MAX_VALUE;
                                    i2 = 0;
                                } else {
                                    i2 = i7 * i9;
                                    i = (i9 + i2) - 1;
                                }
                                if (i8 == -1 || i10 == -1) {
                                    i3 = Integer.MAX_VALUE;
                                    i4 = 0;
                                } else {
                                    i4 = i10 * i8;
                                    i3 = (i10 + i4) - 1;
                                }
                                if (i >= i4 && i3 >= i2) {
                                    ((ServiceC16415l) c12014l.f23943l).mopub(str2, c7996l, (Bundle) c17879l.loadAd, bundle2);
                                }
                            }
                        }
                    }
                    i6++;
                }
                break;
            case 2:
                String str3 = (String) this.f32872l;
                IBinder binder = ((Messenger) ((C15053l) this.f32873l).f29576l).getBinder();
                C5008l c5008l = (C5008l) this.f32875l;
                C7996l c7996l2 = (C7996l) ((ServiceC16415l) c5008l.f10245l).f32110l.get(binder);
                if (c7996l2 == null) {
                    AbstractC11043l.remoteconfig("removeSubscription for callback that isn't registered id=", str3, "MBServiceCompat");
                    return;
                }
                HashMap map = c7996l2.billing;
                ServiceC16415l serviceC16415l = (ServiceC16415l) c5008l.f10245l;
                IBinder iBinder = (IBinder) this.f32876l;
                try {
                    if (iBinder == null) {
                        z2 = map.remove(str3) != null;
                        serviceC16415l.f32114l = c7996l2;
                        serviceC16415l.billing(str3);
                        serviceC16415l.f32114l = null;
                    } else {
                        List list2 = (List) map.get(str3);
                        if (list2 != null) {
                            Iterator it = list2.iterator();
                            boolean z3 = false;
                            while (it.hasNext()) {
                                if (iBinder == ((C17879l) it.next()).yandex) {
                                    it.remove();
                                    z3 = true;
                                }
                            }
                            if (list2.isEmpty()) {
                                map.remove(str3);
                            }
                            z = z3;
                        } else {
                            z = false;
                        }
                        serviceC16415l.f32114l = c7996l2;
                        serviceC16415l.billing(str3);
                        serviceC16415l.f32114l = null;
                        z2 = z;
                    }
                    if (z2) {
                        return;
                    }
                    AbstractC6427l.vip("MBServiceCompat", "removeSubscription called for " + str3 + " which is not subscribed");
                    return;
                } catch (Throwable th) {
                    serviceC16415l.f32114l = c7996l2;
                    serviceC16415l.billing(str3);
                    serviceC16415l.f32114l = null;
                    throw th;
                }
            case 3:
                String str4 = (String) this.f32872l;
                IBinder binder2 = ((Messenger) ((C15053l) this.f32873l).f29576l).getBinder();
                C5008l c5008l2 = (C5008l) this.f32875l;
                C7996l c7996l3 = (C7996l) ((ServiceC16415l) c5008l2.f10245l).f32110l.get(binder2);
                if (c7996l3 == null) {
                    AbstractC11043l.remoteconfig("getMediaItem for callback that isn't registered id=", str4, "MBServiceCompat");
                    return;
                }
                ServiceC16415l serviceC16415l2 = (ServiceC16415l) c5008l2.f10245l;
                C18689l c18689l = new C18689l(str4, (C1102l) this.f32876l, 0);
                serviceC16415l2.f32114l = c7996l3;
                serviceC16415l2.purchase(str4, c18689l);
                serviceC16415l2.f32114l = null;
                if (c18689l.loadAd()) {
                    return;
                }
                C8339l.smaato(AbstractC14814l.startapp("onLoadItem must call detach() or sendResult() before returning for id=", str4));
                return;
            case 4:
                C12441l.admob((View) this.f32873l, (C12902l) this.f32872l, (C13645l) this.f32876l);
                ((ValueAnimator) this.f32875l).start();
                return;
            case 5:
                BinderC15526l binderC15526l = (BinderC15526l) this.f32873l;
                String str5 = (String) this.f32872l;
                C18032l c18032l = (C18032l) this.f32876l;
                InterfaceC14655l interfaceC14655l = (InterfaceC14655l) this.f32875l;
                C6901l c6901l = binderC15526l.purchase;
                c6901l.m2089continue();
                c6901l.mo224l().mo211l();
                c6901l.m2112transient();
                C8648l c8648l = c6901l.f14451l;
                C6901l.m2082case(c8648l);
                List<C18253l> listM2351l = c8648l.m2351l(str5, c18032l, ((Integer) AbstractC5981l.premium.yandex(null)).intValue());
                ArrayList arrayList = new ArrayList();
                for (C18253l c18253l : listM2351l) {
                    String str6 = c18253l.crashlytics;
                    long j = c18253l.admob;
                    long j2 = c18253l.yandex;
                    if (c6901l.vip(str5, str6)) {
                        int i11 = c18253l.subs;
                        if (i11 > 0) {
                            if (i11 <= ((Integer) AbstractC5981l.isVip.yandex(bArrMo1802l)).intValue()) {
                                long jMin = Math.min(((Long) AbstractC5981l.ad.yandex(bArrMo1802l)).longValue() * (1 << (i11 - 1)), ((Long) AbstractC5981l.advert.yandex(bArrMo1802l)).longValue());
                                c6901l.mo198abstract().getClass();
                                if (System.currentTimeMillis() >= jMin + j) {
                                    bundle = new Bundle();
                                    for (Map.Entry entry : c18253l.amazon.entrySet()) {
                                        bundle.putString((String) entry.getKey(), (String) entry.getValue());
                                    }
                                    c8736l = new C8736l(c18253l.yandex, c18253l.loadAd.yandex(), c18253l.crashlytics, bundle, c18253l.purchase.f11334l, c18253l.mopub, "");
                                    try {
                                        c8208l = (C8208l) C13718l.m3698l(C6194l.signatures(), c8736l.f17985l);
                                        for (i5 = 0; i5 < ((C6194l) c8208l.f20498l).Signature(); i5++) {
                                            C9134l c9134l = (C9134l) ((C6194l) c8208l.f20498l).license(i5).firebase();
                                            c6901l.mo198abstract().getClass();
                                            long jCurrentTimeMillis = System.currentTimeMillis();
                                            c9134l.loadAd();
                                            ((C9030l) c9134l.f20498l).m2447break(jCurrentTimeMillis);
                                            c8208l.loadAd();
                                            ((C6194l) c8208l.f20498l).applovin(i5, (C9030l) c9134l.amazon());
                                        }
                                        c8736l.f17985l = ((C6194l) c8208l.amazon()).yandex();
                                        if (Log.isLoggable(c6901l.mo200else().m2266l(), 2)) {
                                            C13718l c13718l = c6901l.f14452l;
                                            C6901l.m2082case(c13718l);
                                            c8736l.f17984l = c13718l.m3720l((C6194l) c8208l.amazon());
                                        }
                                        arrayList.add(c8736l);
                                    } catch (C9893l unused) {
                                        c6901l.mo200else().f16910l.loadAd(str5, "Failed to parse queued batch. appId");
                                    }
                                }
                            }
                            c6901l.mo200else().f16911l.amazon("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str5, Long.valueOf(j2), Long.valueOf(j));
                        } else {
                            bundle = new Bundle();
                            while (r6.hasNext()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            c8736l = new C8736l(c18253l.yandex, c18253l.loadAd.yandex(), c18253l.crashlytics, bundle, c18253l.purchase.f11334l, c18253l.mopub, "");
                            c8208l = (C8208l) C13718l.m3698l(C6194l.signatures(), c8736l.f17985l);
                            while (i5 < ((C6194l) c8208l.f20498l).Signature()) {
                                C9134l c9134l2 = (C9134l) ((C6194l) c8208l.f20498l).license(i5).firebase();
                                c6901l.mo198abstract().getClass();
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                c9134l2.loadAd();
                                ((C9030l) c9134l2.f20498l).m2447break(jCurrentTimeMillis2);
                                c8208l.loadAd();
                                ((C6194l) c8208l.f20498l).applovin(i5, (C9030l) c9134l2.amazon());
                            }
                            c8736l.f17985l = ((C6194l) c8208l.amazon()).yandex();
                            if (Log.isLoggable(c6901l.mo200else().m2266l(), 2)) {
                                C13718l c13718l2 = c6901l.f14452l;
                                C6901l.m2082case(c13718l2);
                                c8736l.f17984l = c13718l2.m3720l((C6194l) c8208l.amazon());
                            }
                            arrayList.add(c8736l);
                        }
                        bArrMo1802l = null;
                    } else {
                        c6901l.mo200else().f16911l.amazon("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str5, Long.valueOf(j2), c18253l.crashlytics);
                    }
                }
                try {
                    interfaceC14655l.mo2274l(new C18090l(arrayList));
                    c6901l.mo200else().f16911l.crashlytics(str5, Integer.valueOf(arrayList.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    c6901l.mo200else().f16908l.crashlytics(str5, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 6:
                C11860l c11860lFirebase = ((AppMeasurementDynamiteService) this.f32875l).purchase.firebase();
                InterfaceC6989l interfaceC6989l = (InterfaceC6989l) this.f32873l;
                C13236l c13236l = (C13236l) this.f32872l;
                String str7 = (String) this.f32876l;
                c11860lFirebase.mo211l();
                c11860lFirebase.m2935l();
                C17417l c17417l = (C17417l) c11860lFirebase.f833l;
                C17410l c17410l = c17417l.f33949l;
                C17417l.billing(c17410l);
                if (C13268l.loadAd.crashlytics(((C17417l) c17410l.f833l).f33936l, 12451000) == 0) {
                    c11860lFirebase.m3267l(new RunnableC16843l(c11860lFirebase, c13236l, str7, interfaceC6989l, 12));
                    return;
                }
                C8118l c8118l = c17417l.f33950l;
                C17417l.admob(c8118l);
                c8118l.f16910l.yandex("Not bundling data. Service unavailable or out of date");
                C17410l c17410l2 = c17417l.f33949l;
                C17417l.billing(c17410l2);
                c17410l2.m4377l(interfaceC6989l, new byte[0]);
                return;
            case 7:
                BinderC15526l binderC15526l2 = (BinderC15526l) this.f32873l;
                Bundle bundle4 = (Bundle) this.f32872l;
                String str8 = (String) this.f32876l;
                C10462l c10462l = (C10462l) this.f32875l;
                boolean zIsEmpty = bundle4.isEmpty();
                C6901l c6901l2 = binderC15526l2.purchase;
                if (zIsEmpty) {
                    C8648l c8648l2 = c6901l2.f14451l;
                    C6901l.m2082case(c8648l2);
                    c8648l2.mo211l();
                    c8648l2.m2927l();
                    try {
                        c8648l2.m2395l().execSQL("delete from default_event_params where app_id=?", new String[]{str8});
                        return;
                    } catch (SQLiteException e2) {
                        C8118l c8118l2 = ((C17417l) c8648l2.f833l).f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.loadAd(e2, "Error clearing default event params");
                        return;
                    }
                }
                C8648l c8648l3 = c6901l2.f14451l;
                C6901l.m2082case(c8648l3);
                C17417l c17417l2 = (C17417l) c8648l3.f833l;
                c8648l3.mo211l();
                c8648l3.m2927l();
                C6911l c6911l = new C6911l((C17417l) c8648l3.f833l, "", str8, "dep", 0L, 0L, 0L, bundle4);
                C13718l c13718l3 = c8648l3.f13233l.f14452l;
                C6901l.m2082case(c13718l3);
                byte[] bArrYandex = c13718l3.m3717l(c6911l).yandex();
                C8118l c8118l3 = c17417l2.f33950l;
                C17417l.admob(c8118l3);
                c8118l3.f16911l.crashlytics(str8, Integer.valueOf(bArrYandex.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str8);
                contentValues.put("parameters", bArrYandex);
                try {
                    if (c8648l3.m2395l().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        C17417l.admob(c8118l3);
                        c8118l3.f16908l.loadAd(C8118l.m2260l(str8), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e3) {
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.crashlytics(C8118l.m2260l(str8), e3, "Error storing default event parameters. appId");
                }
                C8648l c8648l4 = c6901l2.f14451l;
                C6901l.m2082case(c8648l4);
                long j3 = c10462l.f21314l;
                try {
                    if (c8648l4.m2350l("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str8, String.valueOf(j3)}, 0L) <= 0 && c8648l4.m2350l("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str8, String.valueOf(j3)}, 0L) > 0) {
                        C8648l c8648l5 = c6901l2.f14451l;
                        C6901l.m2082case(c8648l5);
                        c8648l5.m2343l(str8, Long.valueOf(j3), null, bundle4);
                        return;
                    }
                    return;
                } catch (SQLiteException e4) {
                    C8118l c8118l4 = ((C17417l) c8648l4.f833l).f33950l;
                    C17417l.admob(c8118l4);
                    c8118l4.f16908l.loadAd(e4, "Error checking backfill conditions");
                    return;
                }
            case 8:
                String str9 = (String) this.f32872l;
                String str10 = (String) this.f32876l;
                C11860l c11860lFirebase2 = ((C17417l) ((C11675l) this.f32875l).f833l).firebase();
                AtomicReference atomicReference = (AtomicReference) this.f32873l;
                c11860lFirebase2.mo211l();
                c11860lFirebase2.m2935l();
                c11860lFirebase2.m3267l(new RunnableC7698l(c11860lFirebase2, atomicReference, str9, str10, c11860lFirebase2.m3269l(false), 2));
                return;
            case 9:
                C1090l c1090l = (C1090l) this.f32873l;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f32872l;
                Context context = (Context) this.f32876l;
                C16775l c16775l = (C16775l) this.f32875l;
                if ((c1090l.f5919l instanceof C17783l) && atomicBoolean.compareAndSet(false, true)) {
                    try {
                        context.unregisterReceiver(c16775l);
                        return;
                    } catch (IllegalArgumentException e5) {
                        Log.w("DirectBootUtils", "Failed to unregister receiver", e5);
                        return;
                    }
                }
                return;
            case 10:
                C13161l c13161l = AbstractC17028l.yandex;
                Level level = (Level) this.f32873l;
                AbstractC12990l abstractC12990l = (AbstractC12990l) c13161l.f25776l;
                boolean zYandex = abstractC12990l.yandex(level);
                String str11 = abstractC12990l.yandex;
                ((C11673l) AbstractC4609l.yandex).getClass();
                C9712l.loadAd.yandex(str11, level, zYandex);
                ((InterfaceC2405l) ((InterfaceC2405l) (!zYandex ? C13161l.f25774l : new C4299l(c13161l, level)).crashlytics((Throwable) this.f32872l)).yandex()).loadAd((String) this.f32876l, (Object[]) this.f32875l);
                return;
            case 11:
                C11860l c11860lFirebase3 = ((AppMeasurementDynamiteService) this.f32875l).purchase.firebase();
                InterfaceC6989l interfaceC6989l2 = (InterfaceC6989l) this.f32873l;
                String str12 = (String) this.f32872l;
                String str13 = (String) this.f32876l;
                c11860lFirebase3.mo211l();
                c11860lFirebase3.m2935l();
                c11860lFirebase3.m3267l(new RunnableC7698l(c11860lFirebase3, str12, str13, c11860lFirebase3.m3269l(false), interfaceC6989l2));
                return;
            case 12:
                InterfaceC6989l interfaceC6989l3 = (InterfaceC6989l) this.f32876l;
                C11860l c11860l = (C11860l) this.f32875l;
                try {
                    try {
                        InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                        if (interfaceC5496l != null) {
                            bArrMo1802l = interfaceC5496l.mo1802l((String) this.f32872l, (C13236l) this.f32873l);
                            c11860l.m3266l();
                            C17410l c17410l3 = ((C17417l) c11860l.f833l).f33949l;
                            C17417l.billing(c17410l3);
                            c17410l3.m4377l(interfaceC6989l3, bArrMo1802l);
                            return;
                        }
                        C17417l c17417l3 = (C17417l) c11860l.f833l;
                        C8118l c8118l5 = c17417l3.f33950l;
                        C17417l.admob(c8118l5);
                        c8118l5.f16908l.yandex("Discarding data. Failed to send event to service to bundle");
                        C17410l c17410l4 = c17417l3.f33949l;
                        C17417l.billing(c17410l4);
                        c17410l4.m4377l(interfaceC6989l3, null);
                        return;
                    } catch (RemoteException e6) {
                        C8118l c8118l6 = ((C17417l) c11860l.f833l).f33950l;
                        C17417l.admob(c8118l6);
                        c8118l6.f16908l.loadAd(e6, "Failed to send event to the service to bundle");
                    }
                } catch (Throwable th2) {
                    C17410l c17410l5 = ((C17417l) c11860l.f833l).f33949l;
                    C17417l.billing(c17410l5);
                    c17410l5.m4377l(interfaceC6989l3, null);
                    throw th2;
                }
                break;
            case 13:
                yandex();
                return;
            case 14:
                loadAd();
                return;
            case 15:
                C6901l c6901l3 = (C6901l) ((C15848l) this.f32875l).f31100l;
                C17410l c17410lM2086break = c6901l3.m2086break();
                c6901l3.mo198abstract().getClass();
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                if (c6901l3.m2097import().m1682l(null, AbstractC5981l.f12677l)) {
                    c6901l3.mo198abstract().getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                } else {
                    jElapsedRealtime = 0;
                }
                Bundle bundle5 = (Bundle) this.f32876l;
                String str14 = (String) this.f32872l;
                String str15 = (String) this.f32873l;
                C13236l c13236lM4346l = c17410lM2086break.m4346l(str14, bundle5, "auto", jCurrentTimeMillis3, jElapsedRealtime, false);
                AbstractC1051l.subs(c13236lM4346l);
                c6901l3.crashlytics(str15, c13236lM4346l);
                return;
            default:
                C17781l c17781l = (C17781l) this.f32873l;
                C2888l c2888l = (C2888l) this.f32872l;
                EnumC7663l enumC7663l = (EnumC7663l) this.f32876l;
                String str16 = (String) this.f32875l;
                ((C1424l) c2888l.f6290l).f3602l = enumC7663l;
                C14867l c14867l = (C14867l) ((C1424l) c2888l.f6290l).f3603l;
                if (c14867l == null || (str = c14867l.amazon) == null || str.isEmpty()) {
                    str = "NA";
                } else {
                    AbstractC1051l.subs(str);
                }
                C15389l c15389l = new C15389l();
                c15389l.yandex = c17781l.yandex;
                c15389l.loadAd = c17781l.loadAd;
                synchronized (C17781l.class) {
                    try {
                        c2673lM165final = C17781l.firebase;
                        if (c2673lM165final == null) {
                            C2462l c2462lAdmob = AbstractC4047l.admob(Resources.getSystem().getConfiguration());
                            appmetrica appmetricaVar = new appmetrica((byte) 0, 12);
                            for (int i12 = 0; i12 < c2462lAdmob.yandex.size(); i12++) {
                                Locale locale = c2462lAdmob.yandex.get(i12);
                                C3797l c3797l = AbstractC8109l.yandex;
                                appmetricaVar.m166static(locale.toLanguageTag());
                            }
                            c2673lM165final = appmetricaVar.m165final();
                            C17781l.firebase = c2673lM165final;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                c15389l.purchase = c2673lM165final;
                c15389l.admob = Boolean.TRUE;
                c15389l.amazon = str;
                c15389l.crashlytics = str16;
                c15389l.billing = c17781l.billing.smaato() ? (String) c17781l.billing.isPro() : c17781l.amazon.yandex();
                c15389l.isPro = 10;
                c15389l.firebase = Integer.valueOf(c17781l.admob);
                c2888l.f6289l = c15389l;
                c17781l.crashlytics.yandex(c2888l);
                return;
        }
    }

    public /* synthetic */ RunnableC16843l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f32874l = i;
        this.f32875l = obj;
        this.f32873l = obj2;
        this.f32872l = obj3;
        this.f32876l = obj4;
    }

    public /* synthetic */ RunnableC16843l(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f32874l = i;
        this.f32873l = obj;
        this.f32872l = obj2;
        this.f32876l = obj3;
        this.f32875l = obj4;
    }
}

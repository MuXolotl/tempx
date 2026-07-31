package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.cast.CastDevice;
import com.google.android.material.appbar.AppBarLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: renamed from: lًؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7706l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f16180l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f16181l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f16182l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public Object f16183l;

    public RunnableC7706l(C11860l c11860l, AtomicReference atomicReference, C10462l c10462l) {
        this.f16182l = 12;
        this.f16181l = atomicReference;
        this.f16180l = c10462l;
        Objects.requireNonNull(c11860l);
        this.f16183l = c11860l;
    }

    private final void amazon() {
        AtomicReference atomicReference;
        AtomicReference atomicReference2 = (AtomicReference) this.f16181l;
        synchronized (atomicReference2) {
            try {
                try {
                    C11860l c11860l = (C11860l) this.f16183l;
                    C17417l c17417l = (C17417l) c11860l.f833l;
                    C16386l c16386l = c17417l.f33944l;
                    C17417l.billing(c16386l);
                    if (c16386l.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
                        InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                        if (interfaceC5496l != null) {
                            atomicReference2.set(interfaceC5496l.mo1801l((C10462l) this.f16180l));
                            String str = (String) atomicReference2.get();
                            if (str != null) {
                                C11675l c11675l = ((C17417l) c11860l.f833l).f33927l;
                                C17417l.mopub(c11675l);
                                c11675l.f23410l.set(str);
                                C16386l c16386l2 = c17417l.f33944l;
                                C17417l.billing(c16386l2);
                                c16386l2.f32045l.ad(str);
                            }
                            c11860l.m3266l();
                            atomicReference = (AtomicReference) this.f16181l;
                            atomicReference.notify();
                            return;
                        }
                        C8118l c8118l = c17417l.f33950l;
                        C17417l.admob(c8118l);
                        c8118l.f16908l.yandex("Failed to get app instance id");
                    } else {
                        C8118l c8118l2 = c17417l.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16914l.yandex("Analytics storage consent denied; will not get app instance id");
                        C11675l c11675l2 = ((C17417l) c11860l.f833l).f33927l;
                        C17417l.mopub(c11675l2);
                        c11675l2.f23410l.set(null);
                        C16386l c16386l3 = c17417l.f33944l;
                        C17417l.billing(c16386l3);
                        c16386l3.f32045l.ad(null);
                        atomicReference2.set(null);
                    }
                    atomicReference2.notify();
                } catch (Throwable th) {
                    ((AtomicReference) this.f16181l).notify();
                    throw th;
                }
            } catch (RemoteException e) {
                C8118l c8118l3 = ((C17417l) ((C11860l) this.f16183l).f833l).f33950l;
                C17417l.admob(c8118l3);
                c8118l3.f16908l.loadAd(e, "Failed to get app instance id");
                atomicReference = (AtomicReference) this.f16181l;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0026  */
    private final void crashlytics() {
        String str;
        C2016l c2016l;
        C4845l c4845l = (C4845l) this.f16181l;
        C7847l c7847l = (C7847l) this.f16180l;
        EnumC13682l enumC13682l = EnumC13682l.INPUT_IMAGE_CONSTRUCTION;
        String str2 = (String) this.f16183l;
        C4816l c4816l = (C4816l) c7847l.f16370l;
        c4816l.f9859l = enumC13682l;
        C2681l c2681l = (C2681l) c4816l.f9860l;
        if (c2681l != null) {
            str = c2681l.amazon;
            int i = AbstractC5439l.yandex;
            if (str == null || str.isEmpty()) {
                str = "NA";
            }
        } else {
            str = "NA";
        }
        C15389l c15389l = new C15389l();
        c15389l.yandex = c4845l.yandex;
        c15389l.loadAd = c4845l.loadAd;
        synchronized (C4845l.class) {
            c2016l = C4845l.isPro;
            if (c2016l == null) {
                C2462l c2462lAdmob = AbstractC4047l.admob(Resources.getSystem().getConfiguration());
                Object[] objArrCopyOf = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < c2462lAdmob.yandex.size()) {
                    Locale locale = c2462lAdmob.yandex.get(i2);
                    C3797l c3797l = AbstractC8109l.yandex;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArrCopyOf.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            int iHighestOneBit = Integer.highestOneBit(i3);
                            i5 = iHighestOneBit + iHighestOneBit;
                        }
                        if (i5 < 0) {
                            i5 = Alert.DURATION_SHOW_INDEFINITELY;
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i5);
                    }
                    objArrCopyOf[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                C2770l c2770l = AbstractC13582l.f26598l;
                c2016l = i3 == 0 ? C2016l.f4539l : new C2016l(i3, objArrCopyOf);
                C4845l.isPro = c2016l;
            }
        }
        c15389l.purchase = c2016l;
        c15389l.admob = Boolean.TRUE;
        c15389l.amazon = str;
        c15389l.crashlytics = str2;
        c15389l.billing = c4845l.billing.smaato() ? (String) c4845l.billing.isPro() : c4845l.amazon.yandex();
        c15389l.isPro = 10;
        c15389l.firebase = Integer.valueOf(c4845l.admob);
        c7847l.f16369l = c15389l;
        c4845l.crashlytics.yandex(c7847l);
    }

    private final void loadAd() {
        int i;
        C3823l c3823lM4287goto;
        C2220l c2220l = (C2220l) this.f16180l;
        Intent intent = c2220l.f4901l;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        if (TextUtils.isEmpty(stringExtra)) {
            c3823lM4287goto = AbstractC4311l.mopub(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = c2220l.f4901l;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = c2220l.f4901l;
            Integer numValueOf = intent3.hasExtra("google.product_id") ? Integer.valueOf(intent3.getIntExtra("google.product_id", 0)) : null;
            if (numValueOf != null) {
                bundle.putInt("google.product_id", numValueOf.intValue());
            }
            Context context = (Context) this.f16181l;
            bundle.putBoolean("supports_message_handled", true);
            C17219l c17219lM4278new = C17219l.m4278new(context);
            synchronized (c17219lM4278new) {
                i = c17219lM4278new.f33424l;
                c17219lM4278new.f33424l = i + 1;
            }
            c3823lM4287goto = c17219lM4278new.m4287goto(new C7075l(i, 2, bundle, 0));
        }
        c3823lM4287goto.loadAd(ExecutorC10149l.f20665l, new C7026l(27, (CountDownLatch) this.f16183l));
    }

    private final void purchase() {
        C17186l c17186l;
        C16533l c16533l = (C16533l) this.f16181l;
        synchronized (c16533l.f32323throws) {
            c17186l = (C17186l) c16533l.f32323throws.get((String) this.f16180l);
        }
        if (c17186l != null) {
            c17186l.firebase((String) this.f16183l);
        } else {
            C16533l.f32307class.loadAd("Discarded message for unknown namespace '%s'", (String) this.f16180l);
        }
    }

    private final /* synthetic */ void yandex() {
        C17186l c17186l;
        BinderC3747l binderC3747l = (BinderC3747l) this.f16181l;
        HashMap map = binderC3747l.mopub.applovin;
        String str = (String) this.f16180l;
        synchronized (map) {
            c17186l = (C17186l) map.get(str);
        }
        if (c17186l == null) {
            C16014l.f31391package.loadAd("Discarded message for unknown namespace '%s'", str);
            return;
        }
        String str2 = (String) this.f16183l;
        CastDevice castDevice = binderC3747l.mopub.signatures;
        c17186l.firebase(str2);
    }

    /* JADX WARN: Code duplicated, block: B:129:0x0379  */
    /* JADX WARN: Code duplicated, block: B:96:0x0256  */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Object objCall;
        OverScroller overScroller;
        C16021l c16021l;
        Cursor cursor;
        int i;
        long j;
        Cursor cursorQuery;
        C18253l c18253lM2389l;
        Cursor cursor2;
        C17410l c17410l;
        boolean z = false;
        String strMo1801l = null;
        switch (this.f16182l) {
            case 0:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f16181l;
                AbstractC7347l abstractC7347l = (AbstractC7347l) this.f16183l;
                View view = (View) this.f16180l;
                if (view == null || (overScroller = abstractC7347l.amazon) == null) {
                    return;
                }
                if (overScroller.computeScrollOffset()) {
                    abstractC7347l.pro(coordinatorLayout, view, abstractC7347l.amazon.getCurrY());
                    view.postOnAnimation(this);
                    return;
                }
                AppBarLayout appBarLayout = (AppBarLayout) view;
                ((AppBarLayout.BaseBehavior) abstractC7347l).applovin(coordinatorLayout, appBarLayout);
                if (appBarLayout.f611l) {
                    appBarLayout.purchase(appBarLayout.billing(AppBarLayout.BaseBehavior.isVip(coordinatorLayout)));
                    return;
                }
                return;
            case 1:
                ((C18574l) this.f16181l).yandex.registerContentObserver(Settings.System.getUriFor("show_password"), false, (ContentObserver) this.f16180l);
                C11239l c11239l = new C11239l((C18574l) this.f16181l, (ContentObserver) this.f16180l, 22);
                synchronized (((C0660l) this.f16183l)) {
                    C0660l c0660l = (C0660l) this.f16183l;
                    if (c0660l.crashlytics) {
                        z = true;
                    } else {
                        c0660l.loadAd = c11239l;
                    }
                    Unit unit = Unit.INSTANCE;
                }
                if (z) {
                    c11239l.invoke();
                    return;
                }
                return;
            case 2:
                C9516l c9516l = (C9516l) this.f16183l;
                C4635l c4635l = (C4635l) this.f16181l;
                c9516l.loadAd(c4635l, (C2350l) this.f16180l);
                ((AtomicInteger) c9516l.subs.f5290l).set(0);
                double dMin = Math.min(3600000.0d, Math.pow(c9516l.loadAd, c9516l.yandex()) * (60000.0d / c9516l.yandex));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + c4635l.loadAd;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) dMin);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 3:
                try {
                    objCall = ((CallableC6529l) this.f16181l).call();
                    break;
                } catch (Exception unused2) {
                    objCall = null;
                }
                ((Handler) this.f16183l).post(new RunnableC9929l((C3789l) this.f16180l, objCall, 14));
                return;
            case 4:
                yandex();
                return;
            case 5:
                loadAd();
                return;
            case 6:
                C6901l c6901l = ((BinderC15526l) this.f16183l).purchase;
                c6901l.m2089continue();
                C17509l c17509l = (C17509l) this.f16181l;
                Object objBilling = c17509l.f34112l.billing();
                C10462l c10462l = (C10462l) this.f16180l;
                if (objBilling == null) {
                    c6901l.m2092final(c17509l, c10462l);
                    return;
                } else {
                    c6901l.m2090default(c17509l, c10462l);
                    return;
                }
            case 7:
                C13236l c13236l = (C13236l) this.f16181l;
                C10462l c10462l2 = (C10462l) this.f16180l;
                BinderC15526l binderC15526l = (BinderC15526l) this.f16183l;
                binderC15526l.getClass();
                C6901l c6901l2 = binderC15526l.purchase;
                if ("_cmp".equals(c13236l.f26010l) && (c16021l = c13236l.f26009l) != null) {
                    Bundle bundle = c16021l.f31403l;
                    if (bundle.size() != 0) {
                        String string = bundle.getString("_cis");
                        if ("referrer broadcast".equals(string) || "referrer API".equals(string)) {
                            c6901l2.mo200else().f16907l.loadAd(c13236l.toString(), "Event has been filtered ");
                            c13236l = new C13236l("_cmpx", c16021l, c13236l.f26008l, c13236l.f26012l, c13236l.f26011l);
                        }
                    }
                }
                String str2 = c13236l.f26010l;
                C8315l c8315l = c6901l2.f14460l;
                C13718l c13718l = c6901l2.f14452l;
                C6901l.m2082case(c8315l);
                String str3 = c10462l2.f21296l;
                C15973l c15973l = TextUtils.isEmpty(str3) ? null : (C15973l) c8315l.f17212l.loadAd(str3);
                if (c15973l == null) {
                    c6901l2.mo200else().f16911l.loadAd(c10462l2.f21296l, "EES not loaded for");
                    c6901l2.m2089continue();
                    c6901l2.purchase(c13236l, c10462l2);
                    return;
                }
                try {
                    C12418l c12418l = c15973l.crashlytics;
                    C6901l.m2082case(c13718l);
                    HashMap mapM3691l = C13718l.m3691l(c13236l.f26009l.firebase(), true);
                    String strMetrica = AbstractC2632l.metrica(str2, AbstractC7572l.mopub, AbstractC7572l.loadAd);
                    if (strMetrica == null) {
                        strMetrica = str2;
                    }
                    if (c15973l.yandex(new C17235l(strMetrica, c13236l.f26012l, mapM3691l))) {
                        if (((C17235l) c12418l.f24518l).equals((C17235l) c12418l.f24519l)) {
                            c6901l2.m2089continue();
                            c6901l2.purchase(c13236l, c10462l2);
                        } else {
                            c6901l2.mo200else().f16911l.loadAd(str2, "EES edited event");
                            C6901l.m2082case(c13718l);
                            C13236l c13236lM3693l = C13718l.m3693l((C17235l) c12418l.f24518l);
                            c6901l2.m2089continue();
                            c6901l2.purchase(c13236lM3693l, c10462l2);
                        }
                        if (((ArrayList) c12418l.f24521l).isEmpty()) {
                            return;
                        }
                        for (C17235l c17235l : (ArrayList) c12418l.f24521l) {
                            c6901l2.mo200else().f16911l.loadAd(c17235l.yandex, "EES logging created event");
                            C6901l.m2082case(c13718l);
                            C13236l c13236lM3693l2 = C13718l.m3693l(c17235l);
                            c6901l2.m2089continue();
                            c6901l2.purchase(c13236lM3693l2, c10462l2);
                        }
                        return;
                    }
                } catch (C17540l unused3) {
                    c6901l2.mo200else().f16908l.crashlytics(c10462l2.f21295l, str2, "EES error. appId, eventName");
                }
                c6901l2.mo200else().f16911l.loadAd(str2, "EES was not applied to event");
                c6901l2.m2089continue();
                c6901l2.purchase(c13236l, c10462l2);
                return;
            case 8:
                BinderC15526l binderC15526l2 = (BinderC15526l) this.f16183l;
                binderC15526l2.purchase.m2089continue();
                binderC15526l2.purchase.crashlytics((String) this.f16180l, (C13236l) this.f16181l);
                return;
            case 9:
                C6901l c6901l3 = ((BinderC15526l) this.f16183l).purchase;
                c6901l3.m2089continue();
                C6899l c6899l = (C6899l) this.f16181l;
                Object objBilling2 = c6899l.billing();
                C10462l c10462l3 = (C10462l) this.f16180l;
                if (objBilling2 == null) {
                    c6901l3.m2099interface(c6899l.f14441l, c10462l3);
                    return;
                } else {
                    c6901l3.m2087class(c6899l, c10462l3);
                    return;
                }
            case 10:
                BinderC15526l binderC15526l3 = (BinderC15526l) this.f16181l;
                C10462l c10462l4 = (C10462l) this.f16180l;
                C17261l c17261l = (C17261l) this.f16183l;
                C6901l c6901l4 = binderC15526l3.purchase;
                c6901l4.m2089continue();
                String str4 = c10462l4.f21296l;
                AbstractC1051l.subs(str4);
                HashMap map = c6901l4.f14463l;
                c6901l4.mo224l().mo211l();
                c6901l4.m2112transient();
                C8648l c8648l = c6901l4.f14451l;
                C6901l.m2082case(c8648l);
                long j2 = c17261l.f33491l;
                long j3 = c17261l.f33489l;
                c8648l.mo211l();
                c8648l.m2927l();
                try {
                    cursorQuery = c8648l.m2395l().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "rowId=?", new String[]{String.valueOf(j2)}, null, null, null, "1");
                    try {
                        try {
                            if (cursorQuery.moveToFirst()) {
                                String string2 = cursorQuery.getString(1);
                                AbstractC1051l.subs(string2);
                                try {
                                    try {
                                        j = j3;
                                        cursor2 = cursorQuery;
                                        i = 4;
                                        try {
                                            c18253lM2389l = c8648l.m2389l(string2, j2, cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                                            cursor2.close();
                                        } catch (SQLiteException e) {
                                            e = e;
                                            cursorQuery = cursor2;
                                            try {
                                                C8118l c8118l = ((C17417l) c8648l.f833l).f33950l;
                                                C17417l.admob(c8118l);
                                                c8118l.f16908l.crashlytics(Long.valueOf(j2), e, "Error to querying MeasurementBatch from upload_queue. rowId");
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                c18253lM2389l = null;
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            cursor = cursor2;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        cursor2 = cursorQuery;
                                        j = j3;
                                        i = 4;
                                    }
                                } catch (SQLiteException e3) {
                                    e = e3;
                                    i = 4;
                                    cursor2 = cursorQuery;
                                    j = j3;
                                }
                            } else {
                                i = 4;
                                j = j3;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                c18253lM2389l = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            cursor2 = cursorQuery;
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        i = 4;
                        j = j3;
                        cursor2 = cursorQuery;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    i = 4;
                    j = j3;
                    cursorQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
                if (c18253lM2389l == null) {
                    c6901l4.mo200else().f16910l.crashlytics(str4, Long.valueOf(j2), "[sgtm] Queued batch doesn't exist. appId, rowId");
                    return;
                }
                String str5 = c18253lM2389l.crashlytics;
                int i2 = c17261l.f33490l;
                if (i2 != 1) {
                    if (i2 == 3) {
                        C1064l c1064l = (C1064l) map.get(str5);
                        if (c1064l == null) {
                            c1064l = new C1064l(c6901l4);
                            map.put(str5, c1064l);
                        } else {
                            c1064l.loadAd++;
                            c1064l.crashlytics = c1064l.yandex();
                        }
                        c6901l4.mo198abstract().getClass();
                        c6901l4.mo200else().f16911l.amazon("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str4, str5, Long.valueOf((c1064l.crashlytics - System.currentTimeMillis()) / 1000));
                    }
                    C8648l c8648l2 = c6901l4.f14451l;
                    C6901l.m2082case(c8648l2);
                    Long lValueOf = Long.valueOf(c17261l.f33491l);
                    c8648l2.m2363l(lValueOf);
                    c6901l4.mo200else().f16911l.crashlytics(str4, lValueOf, "[sgtm] increased batch retry count after failed client upload. appId, rowId");
                    return;
                }
                if (map.containsKey(str5)) {
                    map.remove(str5);
                }
                C8648l c8648l3 = c6901l4.f14451l;
                C6901l.m2082case(c8648l3);
                Long lValueOf2 = Long.valueOf(j2);
                c8648l3.m2368l(lValueOf2);
                c6901l4.mo200else().f16911l.crashlytics(str4, lValueOf2, "[sgtm] queued batch deleted after successful client upload. appId, rowId");
                if (j > 0) {
                    C8648l c8648l4 = c6901l4.f14451l;
                    C6901l.m2082case(c8648l4);
                    C17417l c17417l = (C17417l) c8648l4.f833l;
                    c8648l4.mo211l();
                    c8648l4.m2927l();
                    Long lValueOf3 = Long.valueOf(j);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("upload_type", (Integer) 1);
                    C18450l c18450l = c17417l.f33951l;
                    C8118l c8118l2 = c17417l.f33950l;
                    c18450l.getClass();
                    contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
                    try {
                        if (c8648l4.m2395l().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j), str4, String.valueOf(i)}) != 1) {
                            C17417l.admob(c8118l2);
                            c8118l2.f16910l.crashlytics(str4, lValueOf3, "Google Signal pending batch not updated. appId, rowId");
                            break;
                        }
                        c6901l4.mo200else().f16911l.crashlytics(str4, Long.valueOf(j), "[sgtm] queued Google Signal batch updated. appId, signalRowId");
                        c6901l4.metrica(str4);
                        return;
                    } catch (SQLiteException e6) {
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.amazon("Failed to update google Signal pending batch. appid, rowId", str4, Long.valueOf(j), e6);
                        throw e6;
                    }
                }
                return;
            case 11:
                crashlytics();
                return;
            case 12:
                amazon();
                return;
            case 13:
                InterfaceC6989l interfaceC6989l = (InterfaceC6989l) this.f16180l;
                C11860l c11860l = (C11860l) this.f16183l;
                try {
                    try {
                        C17417l c17417l2 = (C17417l) c11860l.f833l;
                        C16386l c16386l = c17417l2.f33944l;
                        C8118l c8118l3 = c17417l2.f33950l;
                        C17417l.billing(c16386l);
                        if (c16386l.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
                            InterfaceC5496l interfaceC5496l = c11860l.f23690l;
                            if (interfaceC5496l != null) {
                                strMo1801l = interfaceC5496l.mo1801l((C10462l) this.f16181l);
                                if (strMo1801l != null) {
                                    C11675l c11675l = c17417l2.f33927l;
                                    C17417l.mopub(c11675l);
                                    c11675l.f23410l.set(strMo1801l);
                                    C17417l.billing(c16386l);
                                    c16386l.f32045l.ad(strMo1801l);
                                }
                                c11860l.m3266l();
                                c17410l = ((C17417l) c11860l.f833l).f33949l;
                                C17417l.billing(c17410l);
                                c17410l.m4360l(strMo1801l, interfaceC6989l);
                                return;
                            }
                            C17417l.admob(c8118l3);
                            c8118l3.f16908l.yandex("Failed to get app instance id");
                        } else {
                            C17417l.admob(c8118l3);
                            c8118l3.f16914l.yandex("Analytics storage consent denied; will not get app instance id");
                            C11675l c11675l2 = c17417l2.f33927l;
                            C17417l.mopub(c11675l2);
                            c11675l2.f23410l.set(null);
                            C17417l.billing(c16386l);
                            c16386l.f32045l.ad(null);
                        }
                        c17410l = c17417l2.f33949l;
                    } catch (RemoteException e7) {
                        C8118l c8118l4 = ((C17417l) c11860l.f833l).f33950l;
                        C17417l.admob(c8118l4);
                        c8118l4.f16908l.loadAd(e7, "Failed to get app instance id");
                    }
                    C17417l.billing(c17410l);
                    c17410l.m4360l(strMo1801l, interfaceC6989l);
                    return;
                } catch (Throwable th5) {
                    C17410l c17410l2 = ((C17417l) c11860l.f833l).f33949l;
                    C17417l.billing(c17410l2);
                    c17410l2.m4360l(null, interfaceC6989l);
                    throw th5;
                }
            case 14:
                C11860l c11860l2 = (C11860l) this.f16181l;
                C10462l c10462l5 = (C10462l) this.f16180l;
                C17261l c17261l2 = (C17261l) this.f16183l;
                C17417l c17417l3 = (C17417l) c11860l2.f833l;
                InterfaceC5496l interfaceC5496l2 = c11860l2.f23690l;
                if (interfaceC5496l2 == null) {
                    C8118l c8118l5 = c17417l3.f33950l;
                    C17417l.admob(c8118l5);
                    c8118l5.f16908l.yandex("[sgtm] Discarding data. Failed to update batch upload status.");
                    return;
                }
                try {
                    interfaceC5496l2.mo1806public(c10462l5, c17261l2);
                    c11860l2.m3266l();
                    return;
                } catch (RemoteException e8) {
                    C8118l c8118l6 = c17417l3.f33950l;
                    C17417l.admob(c8118l6);
                    c8118l6.f16908l.crashlytics(Long.valueOf(c17261l2.f33491l), e8, "[sgtm] Failed to update batch upload status, rowId, exception");
                    return;
                }
            case 15:
                C10846l c10846l = (C10846l) this.f16181l;
                C8118l c8118l7 = (C8118l) this.f16180l;
                JobParameters jobParameters = (JobParameters) this.f16183l;
                c8118l7.f16911l.yandex("AppMeasurementJobService processed last upload request.");
                ((InterfaceC5193l) ((Service) c10846l.f21908l)).crashlytics(jobParameters);
                return;
            case 16:
                purchase();
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C1424l c1424l = (C1424l) this.f16181l;
                C1090l c1090l = (C1090l) this.f16180l;
                C9096l c9096l = (C9096l) this.f16183l;
                try {
                    Object objCrashlytics = AbstractC7151l.crashlytics(c1090l);
                    C1090l c1090l2 = (C1090l) c1424l.f3606l;
                    c1090l2.smaato(objCrashlytics);
                    c9096l.vip(c1090l2);
                    return;
                } catch (Throwable unused4) {
                    c9096l.vip(c1090l);
                    return;
                }
            default:
                if (((C10700l) this.f16181l).f21708l != null) {
                    C18725l.loadAd();
                    return;
                }
                InterfaceC14094l interfaceC14094l = (InterfaceC14094l) this.f16180l;
                RunnableC16843l runnableC16843l = (RunnableC16843l) this.f16183l;
                C9226l c9226lLoadAd = AbstractC10540l.loadAd();
                InterfaceC14094l interfaceC14094lYandex = AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094l);
                try {
                    runnableC16843l.run();
                    Unit unit2 = Unit.INSTANCE;
                    AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
                    return;
                } catch (Throwable th6) {
                    try {
                        AbstractC18239l.yandex(th6);
                        throw th6;
                    } catch (Throwable th7) {
                        AbstractC10540l.yandex(c9226lLoadAd, interfaceC14094lYandex);
                        throw th7;
                    }
                }
        }
    }

    public String toString() {
        switch (this.f16182l) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                RunnableC16843l runnableC16843l = (RunnableC16843l) this.f16183l;
                StringBuilder sb = new StringBuilder(runnableC16843l.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(runnableC16843l);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ RunnableC7706l(Object obj, Object obj2, Object obj3, int i) {
        this.f16182l = i;
        this.f16183l = obj;
        this.f16181l = obj2;
        this.f16180l = obj3;
    }

    public /* synthetic */ RunnableC7706l(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.f16182l = i;
        this.f16181l = obj;
        this.f16180l = obj2;
        this.f16183l = obj3;
    }

    public /* synthetic */ RunnableC7706l(C4845l c4845l, C7847l c7847l, String str) {
        this.f16182l = 11;
        this.f16181l = c4845l;
        this.f16180l = c7847l;
        this.f16183l = str;
    }

    public /* synthetic */ RunnableC7706l() {
        this.f16182l = 3;
    }

    public RunnableC7706l(BinderC2788l binderC2788l, C16533l c16533l, String str, String str2) {
        this.f16182l = 16;
        this.f16181l = c16533l;
        this.f16180l = str;
        this.f16183l = str2;
    }
}

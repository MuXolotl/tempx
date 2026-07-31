package defpackage;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import androidx.car.app.IOnDoneCallback;
import androidx.car.app.navigation.model.Maneuver;
import androidx.car.app.utils.billing;
import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lِؖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4063l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final /* synthetic */ Object f8359l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f8360l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8361l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final /* synthetic */ Object f8362l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final /* synthetic */ Object f8363l;

    public /* synthetic */ RunnableC4063l(ServiceC16415l serviceC16415l, AtomicInteger atomicInteger, AbstractC1186l abstractC1186l, ArrayList arrayList, C1090l c1090l) {
        this.f8361l = 4;
        this.f8360l = atomicInteger;
        this.f8359l = abstractC1186l;
        this.f8363l = arrayList;
        this.f8362l = c1090l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v26 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Bitmap bitmap;
        Bitmap bitmap2;
        InterfaceC1087l interfaceC1087l;
        Bundle bundleLoadAd;
        BufferedWriter bufferedWriter;
        int i = 0;
        ?? r4 = 0;
        bufferedWriter = null;
        BufferedWriter bufferedWriter2 = null;
        switch (this.f8361l) {
            case 0:
                ((C18505l) this.f8360l).yandex.onCaptureCompleted((CameraCaptureSession) this.f8359l, (CaptureRequest) this.f8363l, (TotalCaptureResult) this.f8362l);
                return;
            case 1:
                ((C18505l) this.f8360l).yandex.onCaptureFailed((CameraCaptureSession) this.f8359l, (CaptureRequest) this.f8363l, (CaptureFailure) this.f8362l);
                return;
            case 2:
                C12014l c12014l = (C12014l) this.f8360l;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f8359l;
                C6694l c6694l = (C6694l) this.f8363l;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.f8362l;
                synchronized (c12014l.f23941l) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            c12014l.vip(c6694l);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            case 3:
                C5379l c5379l = (C5379l) this.f8360l;
                C4330l c4330l = (C4330l) this.f8359l;
                String str = c4330l.yandex;
                InterfaceC5127l interfaceC5127l = (InterfaceC5127l) this.f8363l;
                C10555l c10555l = (C10555l) this.f8362l;
                c5379l.getClass();
                Logger logger = C5379l.billing;
                try {
                    InterfaceC9691l interfaceC9691lYandex = c5379l.crashlytics.yandex(str);
                    if (interfaceC9691lYandex == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        interfaceC5127l.purchase(new IllegalArgumentException(str2));
                    } else {
                        c5379l.purchase.ads(new C17706l(c5379l, c4330l, ((C16171l) interfaceC9691lYandex).yandex(c10555l), 2));
                        interfaceC5127l.purchase(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    interfaceC5127l.purchase(e);
                    return;
                }
            case 4:
                AtomicInteger atomicInteger = (AtomicInteger) this.f8360l;
                AbstractC1186l abstractC1186l = (AbstractC1186l) this.f8359l;
                ArrayList arrayList = (ArrayList) this.f8363l;
                C1090l c1090l = (C1090l) this.f8362l;
                if (atomicInteger.incrementAndGet() == abstractC1186l.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i < arrayList.size()) {
                        ListenableFuture listenableFuture = (ListenableFuture) arrayList.get(i);
                        if (listenableFuture != null) {
                            try {
                                bitmap = (Bitmap) AbstractC7151l.crashlytics(listenableFuture);
                            } catch (CancellationException | ExecutionException e2) {
                                AbstractC6427l.mopub("MLSLegacyStub", "Failed to get bitmap", e2);
                                bitmap = null;
                            }
                        } else {
                            bitmap = null;
                        }
                        arrayList2.add(AbstractC18585l.yandex((C2427l) abstractC1186l.get(i), bitmap));
                        i++;
                    }
                    c1090l.smaato(arrayList2);
                    return;
                }
                return;
            case 5:
                ServiceC16415l serviceC16415l = (ServiceC16415l) this.f8360l;
                C6499l c6499l = (C6499l) this.f8359l;
                Bundle bundle = (Bundle) this.f8363l;
                String str3 = (String) this.f8362l;
                C3726l c3726l = serviceC16415l.f32112l;
                if (serviceC16415l.f32115l.m3301extends(c6499l, 50001)) {
                    c3726l.m1420throws(c6499l, str3, AbstractC18585l.admob(c3726l.billing, bundle));
                    return;
                }
                return;
            case 6:
                C3726l c3726l2 = (C3726l) this.f8360l;
                C5113l c5113l = (C5113l) this.f8359l;
                C6499l c6499l2 = (C6499l) this.f8363l;
                String str4 = (String) this.f8362l;
                C9201l c9201l = (C9201l) C3726l.m1414private(c5113l);
                if (c9201l == null || c9201l.yandex != 0) {
                    c3726l2.m1418strictfp(c6499l2, str4);
                    return;
                }
                return;
            case 7:
                C9716l c9716l = (C9716l) this.f8360l;
                String str5 = (String) this.f8359l;
                Bundle bundle2 = (Bundle) this.f8363l;
                C16811l c16811l = (C16811l) this.f8362l;
                c9716l.f19811l.crashlytics();
                c9716l.f19808l.execute(new RunnableC10613l(c9716l, c16811l, str5, bundle2));
                return;
            case 8:
                C9716l c9716l2 = (C9716l) this.f8360l;
                C6845l c6845l = (C6845l) this.f8359l;
                C10243l c10243l = (C10243l) this.f8363l;
                C13572l c13572l = (C13572l) this.f8362l;
                try {
                    C16811l c16811l2 = (C16811l) c6845l.get(0L, TimeUnit.MILLISECONDS);
                    if (c9716l2.amazon(c13572l)) {
                        c10243l.f20868l.firebase(c10243l.f20867l, false);
                    }
                    c16811l2.Signature(c10243l);
                    return;
                } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException unused) {
                    c9716l2.f19805l.remoteconfig(c13572l);
                    return;
                }
            case 9:
                ((C15053l) this.f8359l).ads((AbstractC11653l) this.f8360l, (C13187l) this.f8363l, (ArrayList) this.f8362l);
                return;
            case 10:
                ((C15053l) this.f8359l).ads((AbstractC11653l) this.f8360l, (C13187l) this.f8363l, (Collection) this.f8362l);
                return;
            case 11:
                C18338l c18338l = (C18338l) this.f8360l;
                AtomicInteger atomicInteger2 = (AtomicInteger) this.f8359l;
                ArrayList arrayList3 = (ArrayList) this.f8363l;
                ArrayList arrayList4 = (ArrayList) this.f8362l;
                if (atomicInteger2.incrementAndGet() == arrayList3.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    while (i < arrayList4.size()) {
                        ListenableFuture listenableFuture2 = (ListenableFuture) arrayList4.get(i);
                        if (listenableFuture2 != null) {
                            try {
                                bitmap2 = (Bitmap) AbstractC7151l.crashlytics(listenableFuture2);
                            } catch (CancellationException | ExecutionException e3) {
                                AbstractC6427l.mopub("MediaSessionLegacyStub", "Failed to get bitmap", e3);
                                bitmap2 = null;
                            }
                        } else {
                            bitmap2 = null;
                        }
                        arrayList5.add(new C10517l(null, AbstractC18585l.subs((C2427l) arrayList3.get(i), bitmap2), i == -1 ? -1L : i));
                        i++;
                        break;
                    }
                    C13350l.m3629continue(((C13350l) c18338l.f35849l).vip, arrayList5);
                    return;
                }
                return;
            case 12:
                ServiceC16415l serviceC16415l2 = (ServiceC16415l) this.f8360l;
                AtomicReference atomicReference = (AtomicReference) this.f8359l;
                C6499l c6499l3 = (C6499l) this.f8363l;
                C5811l c5811l = (C5811l) this.f8362l;
                atomicReference.set(serviceC16415l2.f32109l.subscription(c6499l3));
                c5811l.amazon();
                return;
            case 13:
                BinderC4841l binderC4841l = (BinderC4841l) this.f8360l;
                C6499l c6499l4 = (C6499l) this.f8359l;
                C3726l c3726l3 = (C3726l) this.f8363l;
                InterfaceC1087l interfaceC1087l2 = (InterfaceC1087l) this.f8362l;
                C12014l c12014l2 = binderC4841l.billing;
                try {
                    binderC4841l.mopub.remove(c6499l4);
                    if (!c3726l3.metrica()) {
                        C1300l c1300l = (C1300l) c6499l4.amazon;
                        c1300l.getClass();
                        IBinder iBinderAsBinder = c1300l.f3379l.asBinder();
                        C3764l c3764lSubscription = c3726l3.subscription(c6499l4);
                        if (c12014l2.m3307strictfp(c6499l4)) {
                            AbstractC6427l.vip("MediaSessionStub", "Controller " + c6499l4 + " has sent connection request multiple times");
                        }
                        c12014l2.mopub(iBinderAsBinder, c6499l4, c3764lSubscription.yandex, c3764lSubscription.loadAd);
                        C13904l c13904lPremium = c12014l2.premium(c6499l4);
                        if (c13904lPremium != null) {
                            C18602l c18602l = c3726l3.tapsense;
                            C1908l c1908l = c3726l3.subscription;
                            C16616l c16616l = c3764lSubscription.loadAd;
                            C1908l c1908lM1624l = binderC4841l.m1624l(c1908l);
                            MediaSession.Token token = ((C1139l) c3726l3.admob.vip.f1691l).crashlytics.f10328l;
                            PendingIntent pendingIntent = c3726l3.Signature;
                            AbstractC1186l abstractC1186l2 = c3764lSubscription.crashlytics;
                            if (abstractC1186l2 == null) {
                                abstractC1186l2 = c3726l3.premium;
                            }
                            AbstractC1186l abstractC1186l3 = c3764lSubscription.amazon;
                            if (abstractC1186l3 == null) {
                                abstractC1186l3 = c3726l3.applovin;
                            }
                            interfaceC1087l = interfaceC1087l2;
                            try {
                                C5728l c5728l = new C5728l(1010001300, 9, binderC4841l, pendingIntent, abstractC1186l2, abstractC1186l3, c3726l3.ads, c3764lSubscription.yandex, c16616l, c18602l.vip(), c3726l3.isPro.yandex.getExtras(), c3726l3.appmetrica, c1908lM1624l, token);
                                if (!c3726l3.metrica()) {
                                    try {
                                        int iBilling = c13904lPremium.billing();
                                        if (interfaceC1087l instanceof BinderC11857l) {
                                            bundleLoadAd = new Bundle();
                                            bundleLoadAd.putBinder(C5728l.premium, new BinderC17702l(c5728l));
                                        } else {
                                            bundleLoadAd = c5728l.loadAd(c6499l4.crashlytics);
                                        }
                                        interfaceC1087l.mo815throws(iBilling, bundleLoadAd);
                                        i = 1;
                                    } catch (RemoteException unused2) {
                                    }
                                    if (i != 0) {
                                        c3726l3.premium(c6499l4);
                                    }
                                    if (i != 0) {
                                        return;
                                    }
                                    break;
                                }
                                AbstractC2632l.purchase(interfaceC1087l);
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i == 0) {
                                    AbstractC2632l.purchase(interfaceC1087l);
                                }
                                throw th;
                            }
                        }
                        AbstractC6427l.vip("MediaSessionStub", "Ignoring connection request from unknown controller info");
                    }
                    AbstractC2632l.purchase(interfaceC1087l2);
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    interfaceC1087l = interfaceC1087l2;
                }
                break;
            case 14:
                C3726l c3726l4 = (C3726l) this.f8360l;
                C1090l c1090l2 = (C1090l) this.f8359l;
                InterfaceC18679l interfaceC18679l = (InterfaceC18679l) this.f8363l;
                ListenableFuture listenableFuture3 = (ListenableFuture) this.f8362l;
                if (c3726l4.metrica()) {
                    c1090l2.smaato(null);
                    return;
                }
                try {
                    interfaceC18679l.accept(listenableFuture3);
                    c1090l2.smaato(null);
                    return;
                } catch (Throwable th4) {
                    c1090l2.remoteconfig(th4);
                    return;
                }
            case 15:
                C3726l c3726l5 = (C3726l) this.f8360l;
                InterfaceC13934l interfaceC13934l = (InterfaceC13934l) this.f8359l;
                C6499l c6499l5 = (C6499l) this.f8363l;
                List list = (List) this.f8362l;
                if (c3726l5.metrica()) {
                    return;
                }
                interfaceC13934l.yandex(c3726l5.tapsense, c6499l5, list);
                return;
            case 16:
                C2773l c2773l = (C2773l) this.f8360l;
                HashMap map = (HashMap) this.f8359l;
                C15607l c15607l = (C15607l) this.f8363l;
                HashMap map2 = (HashMap) this.f8362l;
                C4143l c4143l = c2773l.f6024l;
                c15607l.f30461l.crashlytics();
                Function1 function1 = (Function1) c4143l.loadAd;
                C0671l c0671l = (C0671l) c4143l.crashlytics;
                AbstractC1051l.crashlytics(map.containsKey(c0671l) || map2.containsKey(c0671l), "The detector does not exist");
                List list2 = (List) map.get(c0671l);
                function1.invoke(list2 != null ? (C8130l) AbstractC16901l.m4217extends(list2) : null);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                AbstractC6475l abstractC6475l = (AbstractC6475l) this.f8360l;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.f8359l;
                String str6 = (String) this.f8363l;
                InterfaceC11652l interfaceC11652l = (InterfaceC11652l) this.f8362l;
                if (abstractC6475l != null && ((C5268l) abstractC6475l).subs.yandex(EnumC8981l.f18520l)) {
                    billing.crashlytics(iOnDoneCallback, str6, interfaceC11652l);
                    return;
                }
                billing.billing(iOnDoneCallback, str6, new IllegalStateException("Lifecycle is not at least created when dispatching " + interfaceC11652l));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list3 = (List) this.f8360l;
                C0350l c0350l = (C0350l) this.f8359l;
                C12211l c12211l = (C12211l) this.f8363l;
                WorkDatabase workDatabase = (WorkDatabase) this.f8362l;
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    ((InterfaceC15402l) it.next()).amazon(c0350l.yandex);
                }
                AbstractC3387l.loadAd(c12211l, workDatabase, list3);
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C3608l c3608l = (C3608l) this.f8360l;
                Surface surface = (Surface) this.f8359l;
                C16565l c16565l = (C16565l) this.f8363l;
                C15691l c15691l = (C15691l) this.f8362l;
                AbstractC5088l.yandex("TextureViewImpl", "Safe to release surface.");
                C17706l c17706l = c3608l.smaato;
                if (c17706l != null) {
                    c17706l.yandex();
                    c3608l.smaato = null;
                }
                surface.release();
                if (c3608l.mopub == c16565l) {
                    c3608l.mopub = null;
                }
                if (c3608l.admob == c15691l) {
                    c3608l.admob = null;
                    return;
                }
                return;
            default:
                C6472l c6472l = (C6472l) this.f8360l;
                String str7 = (String) this.f8359l;
                Map map3 = (Map) this.f8363l;
                List list4 = (List) this.f8362l;
                C16532l c16532l = (C16532l) c6472l.f13512l;
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) c6472l.f13511l;
                if (((String) atomicMarkableReference.getReference()) != null) {
                    String str8 = (String) atomicMarkableReference.getReference();
                    ?? r10 = "user-data";
                    File fileAdmob = c16532l.yandex.admob(str7, "user-data");
                    try {
                        try {
                            C11162l c11162l = new C11162l();
                            c11162l.put("userId", str8);
                            String string = c11162l.toString();
                            bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAdmob), C16532l.loadAd));
                            try {
                                bufferedWriter.write(string);
                                bufferedWriter.flush();
                                r10 = bufferedWriter;
                            } catch (Exception e4) {
                                e = e4;
                                Log.w("FirebaseCrashlytics", "Error serializing user metadata.", e);
                                r10 = bufferedWriter;
                            }
                        } catch (Exception e5) {
                            e = e5;
                            bufferedWriter = null;
                        } catch (Throwable th5) {
                            th = th5;
                            AbstractC2632l.crashlytics(r4, "Failed to close user metadata file.");
                            throw th;
                        }
                        AbstractC2632l.crashlytics(r10, "Failed to close user metadata file.");
                    } catch (Throwable th6) {
                        th = th6;
                        r4 = r10;
                        AbstractC2632l.crashlytics(r4, "Failed to close user metadata file.");
                        throw th;
                    }
                }
                if (!map3.isEmpty()) {
                    c16532l.admob(str7, map3, false);
                }
                if (list4.isEmpty()) {
                    return;
                }
                File fileAdmob2 = c16532l.yandex.admob(str7, "rollouts-state");
                if (list4.isEmpty()) {
                    C16532l.mopub(fileAdmob2, "Rollout state is empty for session: " + str7);
                    return;
                }
                try {
                    try {
                        String strPurchase = C16532l.purchase(list4);
                        BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(fileAdmob2), C16532l.loadAd));
                        try {
                            bufferedWriter3.write(strPurchase);
                            bufferedWriter3.flush();
                            AbstractC2632l.crashlytics(bufferedWriter3, "Failed to close rollouts state file.");
                            return;
                        } catch (Exception e6) {
                            e = e6;
                            bufferedWriter2 = bufferedWriter3;
                            Log.w("FirebaseCrashlytics", "Error serializing rollouts state.", e);
                            C16532l.billing(fileAdmob2);
                            AbstractC2632l.crashlytics(bufferedWriter2, "Failed to close rollouts state file.");
                            return;
                        } catch (Throwable th7) {
                            th = th7;
                            bufferedWriter2 = bufferedWriter3;
                            AbstractC2632l.crashlytics(bufferedWriter2, "Failed to close rollouts state file.");
                            throw th;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } catch (Exception e7) {
                    e = e7;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC4063l(C9716l c9716l, C13572l c13572l, String str, Bundle bundle, C16811l c16811l) {
        this.f8361l = 7;
        this.f8360l = c9716l;
        this.f8359l = str;
        this.f8363l = bundle;
        this.f8362l = c16811l;
    }

    public /* synthetic */ RunnableC4063l(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f8361l = i;
        this.f8360l = obj;
        this.f8359l = obj2;
        this.f8363l = obj3;
        this.f8362l = obj4;
    }
}

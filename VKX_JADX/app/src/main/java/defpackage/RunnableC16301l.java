package defpackage;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.model.Alert;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.RandomAccess;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lٍٖۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC16301l implements Runnable {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public Object f31892l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public Object f31893l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f31894l;

    public RunnableC16301l(C11675l c11675l, InterfaceC6989l interfaceC6989l) {
        this.f31894l = 9;
        this.f31893l = interfaceC6989l;
        Objects.requireNonNull(c11675l);
        this.f31892l = c11675l;
    }

    private final void admob() {
        C13005l c13005l = (C13005l) this.f31892l;
        try {
            C3823l c3823lVip = ((InterfaceC9746l) c13005l.f25480l).vip(((C3823l) this.f31893l).isPro());
            ExecutorC10149l executorC10149l = AbstractC8333l.loadAd;
            c3823lVip.billing(executorC10149l, c13005l);
            c3823lVip.amazon(executorC10149l, c13005l);
            c3823lVip.loadAd.appmetrica(new C13005l((Executor) executorC10149l, (InterfaceC16369l) c13005l));
            c3823lVip.subscription();
        } catch (CancellationException unused) {
            c13005l.mopub();
        } catch (C17056l e) {
            if (e.getCause() instanceof Exception) {
                c13005l.adcel((Exception) e.getCause());
            } else {
                ((C3823l) c13005l.f25483l).startapp(e);
            }
        } catch (Exception e2) {
            ((C3823l) c13005l.f25483l).startapp(e2);
        }
    }

    private final void amazon() {
        C13005l c13005l = (C13005l) this.f31892l;
        synchronized (c13005l.f25480l) {
            try {
                InterfaceC12202l interfaceC12202l = (InterfaceC12202l) c13005l.f25483l;
                if (interfaceC12202l != null) {
                    interfaceC12202l.amazon(((C3823l) this.f31893l).isPro());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void billing() {
        C6901l c6901l = (C6901l) this.f31893l;
        c6901l.m2089continue();
        Runnable runnable = (Runnable) this.f31892l;
        c6901l.mo224l().mo211l();
        if (c6901l.f14456l == null) {
            c6901l.f14456l = new ArrayList();
        }
        c6901l.f14456l.add(runnable);
        c6901l.smaato();
    }

    private final void crashlytics() {
        C1976l c1976l = (C1976l) this.f31893l;
        C2350l c2350l = (C2350l) this.f31892l;
        int iDecrementAndGet = c1976l.loadAd.decrementAndGet();
        AbstractC1051l.smaato(iDecrementAndGet >= 0);
        if (iDecrementAndGet == 0) {
            synchronized (c1976l) {
                try {
                    c1976l.purchase.zzb();
                    C1976l.isPro = true;
                    C1424l c1424l = new C1424l();
                    EnumC14285l enumC14285l = c1976l.subs ? EnumC14285l.TYPE_THICK : EnumC14285l.TYPE_THIN;
                    C17781l c17781l = c1976l.billing;
                    c1424l.f3601l = enumC14285l;
                    C3557l c3557l = new C3557l();
                    c3557l.f7479l = AbstractC14693l.yandex(c1976l.amazon);
                    c1424l.f3605l = new C3246l(c3557l);
                    EnumC1150l.f3126l.execute(new RunnableC16843l(16, c17781l, new C2888l(c1424l, 0), EnumC7663l.ON_DEVICE_BARCODE_CLOSE, c17781l.crashlytics(), false));
                } catch (Throwable th) {
                    throw th;
                }
            }
            c1976l.crashlytics.set(false);
        }
        AbstractC4883l.f9956l.clear();
        AbstractC9042l.yandex.clear();
        c2350l.loadAd(null);
    }

    private final void firebase() {
        boolean z;
        boolean z2;
        boolean z3;
        C16533l c16533l = (C16533l) this.f31893l;
        C3882l c3882l = (C3882l) this.f31892l;
        C1021l c1021l = c16533l.inmobi;
        C5040l c5040l = c3882l.f8019l;
        C10121l c10121l = c3882l.f8020l;
        if (!AbstractC15091l.crashlytics(c5040l, c16533l.applovin)) {
            c16533l.applovin = c5040l;
            c1021l.crashlytics();
        }
        double d = c3882l.f8017l;
        if (Double.isNaN(d) || Math.abs(d - c16533l.f32314extends) <= 1.0E-7d) {
            z = false;
        } else {
            c16533l.f32314extends = d;
            z = true;
        }
        boolean z4 = c3882l.f8016l;
        if (z4 != c16533l.f32324volatile) {
            c16533l.f32324volatile = z4;
            z = true;
        }
        Double.isNaN(c3882l.f8015l);
        C0022l c0022l = C16533l.f32307class;
        c0022l.loadAd("hasVolumeChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c16533l.f32318private));
        if (c1021l != null && (z || c16533l.f32318private)) {
            c1021l.billing();
        }
        int i = c3882l.f8014l;
        if (i != c16533l.f32322throw) {
            c16533l.f32322throw = i;
            z2 = true;
        } else {
            z2 = false;
        }
        c0022l.loadAd("hasActiveInputChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z2), Boolean.valueOf(c16533l.f32318private));
        if (c1021l != null && (z2 || c16533l.f32318private)) {
            c1021l.yandex();
        }
        int i2 = c3882l.f8018l;
        if (i2 != c16533l.f32311catch) {
            c16533l.f32311catch = i2;
            z3 = true;
        } else {
            z3 = false;
        }
        c0022l.loadAd("hasStandbyStateChanged=%b, mFirstDeviceStatusUpdate=%b", Boolean.valueOf(z3), Boolean.valueOf(c16533l.f32318private));
        if (c1021l != null && (z3 || c16533l.f32318private)) {
            c1021l.purchase();
        }
        if (!AbstractC15091l.crashlytics(c16533l.f32315for, c10121l)) {
            c16533l.f32315for = c10121l;
        }
        c16533l.f32318private = false;
    }

    private final void isPro() {
        C11919l c11919l = (C11919l) this.f31893l;
        AtomicReference atomicReference = (AtomicReference) c11919l.f23766l;
        AbstractC1051l.smaato(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
        try {
            ((Runnable) this.f31892l).run();
            atomicReference.set(null);
            c11919l.advert();
        } catch (Throwable th) {
            try {
                atomicReference.set(null);
                c11919l.advert();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    private final void loadAd() {
        C13005l c13005l = (C13005l) this.f31892l;
        synchronized (c13005l.f25480l) {
            try {
                InterfaceC10377l interfaceC10377l = (InterfaceC10377l) c13005l.f25483l;
                if (interfaceC10377l != null) {
                    Exception excSubs = ((C3823l) this.f31893l).subs();
                    AbstractC1051l.subs(excSubs);
                    interfaceC10377l.adcel(excSubs);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final /* synthetic */ void mopub() {
        C10846l c10846l = (C10846l) this.f31893l;
        JobParameters jobParameters = (JobParameters) this.f31892l;
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC5193l) ((Service) c10846l.f21908l)).crashlytics(jobParameters);
    }

    private final void purchase() {
        ServiceConnectionC16475l serviceConnectionC16475l = (ServiceConnectionC16475l) this.f31893l;
        int i = ((C7075l) this.f31892l).yandex;
        synchronized (serviceConnectionC16475l) {
            C7075l c7075l = (C7075l) serviceConnectionC16475l.f32203l.get(i);
            if (c7075l != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                serviceConnectionC16475l.f32203l.remove(i);
                c7075l.loadAd(new C10756l(16, "Timed out waiting for response", null));
                serviceConnectionC16475l.crashlytics();
            }
        }
    }

    private final void remoteconfig() {
        C17781l c17781l = (C17781l) this.f31893l;
        EnumC7663l enumC7663l = EnumC7663l.AGGREGATED_ON_DEVICE_BARCODE_DETECTION;
        C15053l c15053l = (C15053l) this.f31892l;
        HashMap map = c17781l.isPro;
        C14164l c14164l = (C14164l) map.get(enumC7663l);
        if (c14164l != null) {
            C14164l c14164l2 = c14164l;
            C14679l c14679l = c14164l2.f26937l;
            if (c14679l == null) {
                C14164l c14164l3 = c14164l2;
                C14679l c14679l2 = new C14679l(c14164l3, c14164l3.f27696l);
                c14164l2.f26937l = c14679l2;
                c14679l = c14679l2;
            }
            for (Object obj : c14679l) {
                Object arrayList = (Collection) c14164l.f27696l.get(obj);
                if (arrayList == null) {
                    arrayList = new ArrayList(3);
                }
                List list = (List) arrayList;
                ArrayList arrayList2 = new ArrayList(list instanceof RandomAccess ? new C9209l(c14164l, obj, list, null) : new C0819l(c14164l, obj, list, null));
                Collections.sort(arrayList2);
                C1424l c1424l = new C1424l();
                Iterator it = arrayList2.iterator();
                long jLongValue = 0;
                while (it.hasNext()) {
                    jLongValue += ((Long) it.next()).longValue();
                }
                c1424l.f3601l = Long.valueOf((jLongValue / ((long) arrayList2.size())) & Long.MAX_VALUE);
                c1424l.f3603l = Long.valueOf(C17781l.yandex(arrayList2, 100.0d) & Long.MAX_VALUE);
                c1424l.f3606l = Long.valueOf(C17781l.yandex(arrayList2, 75.0d) & Long.MAX_VALUE);
                c1424l.f3604l = Long.valueOf(C17781l.yandex(arrayList2, 50.0d) & Long.MAX_VALUE);
                c1424l.f3605l = Long.valueOf(C17781l.yandex(arrayList2, 25.0d) & Long.MAX_VALUE);
                c1424l.f3602l = Long.valueOf(Long.MAX_VALUE & C17781l.yandex(arrayList2, 0.0d));
                C6859l c6859l = new C6859l(c1424l);
                int size = arrayList2.size();
                C1976l c1976l = (C1976l) c15053l.f29576l;
                C15131l c15131l = (C15131l) obj;
                C1424l c1424l2 = new C1424l();
                c1424l2.f3601l = c1976l.subs ? EnumC14285l.TYPE_THICK : EnumC14285l.TYPE_THIN;
                C5991l c5991l = new C5991l((byte) 0, 17);
                c5991l.f12715l = Integer.valueOf(size & Alert.DURATION_SHOW_INDEFINITELY);
                c5991l.f12716l = c15131l;
                c5991l.f12718l = c6859l;
                c1424l2.f3606l = new C17342l(c5991l);
                EnumC1150l.f3126l.execute(new RunnableC16843l(16, c17781l, new C2888l(c1424l2, 0), enumC7663l, c17781l.crashlytics(), false));
            }
            map.remove(enumC7663l);
        }
    }

    private final void smaato() {
        boolean z;
        C16533l c16533l = (C16533l) this.f31893l;
        String str = ((C13853l) this.f31892l).f27090l;
        if (AbstractC15091l.crashlytics(str, c16533l.f32319strictfp)) {
            z = false;
        } else {
            c16533l.f32319strictfp = str;
            z = true;
        }
        C16533l.f32307class.loadAd("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(c16533l.f32316native));
        C1021l c1021l = c16533l.inmobi;
        if (c1021l != null && (z || c16533l.f32316native)) {
            c1021l.amazon();
        }
        c16533l.f32316native = false;
    }

    private final void subs() {
        Context context = ((C7447l) this.f31893l).loadAd;
        C15333l c15333l = C6932l.remoteconfig;
        if (c15333l == null) {
            synchronized (C6932l.smaato) {
                c15333l = C6932l.remoteconfig;
                if (c15333l == null) {
                    C13698l c13698lYandex = AbstractC13675l.yandex();
                    try {
                        String[] list = context.getAssets().list("phenotype");
                        if (list != null) {
                            for (String str : list) {
                                if (str.endsWith("_package_metadata.binarypb")) {
                                    try {
                                        AssetManager assets = context.getAssets();
                                        StringBuilder sb = new StringBuilder(str.length() + 10);
                                        sb.append("phenotype/");
                                        sb.append(str);
                                        InputStream inputStreamOpen = assets.open(sb.toString());
                                        try {
                                            C11337l c11337l = C11337l.yandex;
                                            int i = AbstractC5004l.yandex;
                                            C6932l c6932l = new C6932l(context, C0871l.license(inputStreamOpen, C11337l.loadAd));
                                            c13698lYandex.mo3668catch(c6932l.loadAd, c6932l);
                                            if (inputStreamOpen != null) {
                                                inputStreamOpen.close();
                                            }
                                        } catch (Throwable th) {
                                            if (inputStreamOpen != null) {
                                                try {
                                                    inputStreamOpen.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (C9893l e) {
                                        StringBuilder sb2 = new StringBuilder(str.length() + 45);
                                        sb2.append("Unable to read Phenotype PackageMetadata for ");
                                        sb2.append(str);
                                        Log.e("PackageInfo", sb2.toString(), e);
                                    }
                                }
                            }
                        }
                    } catch (IOException e2) {
                        Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e2);
                    }
                    C15333l c15333lMetrica = c13698lYandex.metrica(true);
                    C6932l.remoteconfig = c15333lMetrica;
                    c15333l = c15333lMetrica;
                }
            }
        }
        String str2 = (String) this.f31892l;
        if (c15333l.containsKey(str2)) {
            return;
        }
        StringBuilder sb3 = new StringBuilder(str2.length() + 173);
        sb3.append("Config package ");
        sb3.append(str2);
        sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
        Log.e("FilePhenotypeFlags", sb3.toString());
    }

    private final void yandex() {
        ServiceConnectionC16475l serviceConnectionC16475l = (ServiceConnectionC16475l) this.f31893l;
        IBinder iBinder = (IBinder) this.f31892l;
        synchronized (serviceConnectionC16475l) {
            if (iBinder == null) {
                serviceConnectionC16475l.yandex("Null service connection");
                return;
            }
            try {
                serviceConnectionC16475l.f32200l = new C7847l(iBinder);
                serviceConnectionC16475l.f32202l = 2;
                ((ScheduledExecutorService) serviceConnectionC16475l.f32205l.f33427l).execute(new RunnableC13358l(serviceConnectionC16475l, 0));
            } catch (RemoteException e) {
                serviceConnectionC16475l.yandex(e.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x024a  */
    /* JADX WARN: Code duplicated, block: B:219:0x05a7  */
    /* JADX WARN: Code duplicated, block: B:220:0x05a9 A[Catch: NotFoundException -> 0x05ae, TRY_LEAVE, TryCatch #14 {NotFoundException -> 0x05ae, blocks: (B:217:0x0597, B:220:0x05a9), top: B:481:0x0597 }] */
    /* JADX WARN: Code duplicated, block: B:226:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:228:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:229:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:232:0x05da  */
    /* JADX WARN: Code duplicated, block: B:235:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:237:0x05f2  */
    /* JADX WARN: Code duplicated, block: B:238:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:241:0x0616  */
    /* JADX WARN: Code duplicated, block: B:243:0x0660  */
    /* JADX WARN: Code duplicated, block: B:244:0x0669  */
    /* JADX WARN: Code duplicated, block: B:247:0x068b  */
    /* JADX WARN: Code duplicated, block: B:250:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x06d6  */
    /* JADX WARN: Code duplicated, block: B:254:0x06db  */
    /* JADX WARN: Code duplicated, block: B:257:0x06e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:259:0x06ea A[PHI: r1
  0x06ea: PHI (r1v60 boolean) = (r1v43 boolean), (r1v42 boolean) binds: [B:258:0x06e9, B:255:0x06e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:261:0x070f  */
    /* JADX WARN: Code duplicated, block: B:262:0x0713  */
    /* JADX WARN: Code duplicated, block: B:264:0x0717  */
    /* JADX WARN: Code duplicated, block: B:265:0x071b  */
    /* JADX WARN: Code duplicated, block: B:268:0x072d  */
    /* JADX WARN: Code duplicated, block: B:269:0x0745  */
    /* JADX WARN: Code duplicated, block: B:275:0x076e  */
    /* JADX WARN: Code duplicated, block: B:277:0x0786  */
    /* JADX WARN: Code duplicated, block: B:278:0x0799 A[PHI: r29 r30
  0x0799: PHI (r29v2 lِ٘ۢ) = (r29v0 lِ٘ۢ), (r29v3 lِ٘ۢ) binds: [B:276:0x0784, B:274:0x0769] A[DONT_GENERATE, DONT_INLINE]
  0x0799: PHI (r30v2 lًٗۜ) = (r30v0 lًٗۜ), (r30v3 lًٗۜ) binds: [B:276:0x0784, B:274:0x0769] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x07a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:291:0x07c9  */
    /* JADX WARN: Code duplicated, block: B:292:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:295:0x07fa  */
    /* JADX WARN: Code duplicated, block: B:298:0x080a  */
    /* JADX WARN: Code duplicated, block: B:301:0x0829  */
    /* JADX WARN: Code duplicated, block: B:303:0x0837 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:309:0x0854  */
    /* JADX WARN: Code duplicated, block: B:311:0x085a  */
    /* JADX WARN: Code duplicated, block: B:313:0x0878  */
    /* JADX WARN: Code duplicated, block: B:317:0x08a7  */
    /* JADX WARN: Code duplicated, block: B:320:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:325:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:327:0x08e2  */
    /* JADX WARN: Code duplicated, block: B:329:0x08ec  */
    /* JADX WARN: Code duplicated, block: B:330:0x08f7  */
    /* JADX WARN: Code duplicated, block: B:333:0x0901  */
    /* JADX WARN: Code duplicated, block: B:336:0x0917  */
    /* JADX WARN: Code duplicated, block: B:340:0x0923  */
    /* JADX WARN: Code duplicated, block: B:343:0x0931  */
    /* JADX WARN: Code duplicated, block: B:346:0x0945  */
    /* JADX WARN: Code duplicated, block: B:347:0x094a  */
    /* JADX WARN: Code duplicated, block: B:349:0x095c  */
    /* JADX WARN: Code duplicated, block: B:351:0x097c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:362:0x09f2  */
    /* JADX WARN: Code duplicated, block: B:364:0x0a0e  */
    /* JADX WARN: Code duplicated, block: B:367:0x0a1a  */
    /* JADX WARN: Code duplicated, block: B:376:0x0a64  */
    /* JADX WARN: Code duplicated, block: B:378:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:379:0x0a6e  */
    /* JADX WARN: Code duplicated, block: B:381:0x0a76  */
    /* JADX WARN: Code duplicated, block: B:385:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:389:0x0ab8  */
    /* JADX WARN: Code duplicated, block: B:391:0x0ac3  */
    /* JADX WARN: Code duplicated, block: B:392:0x0ac5  */
    /* JADX WARN: Code duplicated, block: B:394:0x0ac8  */
    /* JADX WARN: Code duplicated, block: B:396:0x0af9  */
    /* JADX WARN: Code duplicated, block: B:399:0x0b0f  */
    /* JADX WARN: Code duplicated, block: B:402:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:481:0x0597 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x0257 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x05ee A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v84, types: [lَٞؗ] */
    @Override // java.lang.Runnable
    public final void run() {
        C9925l c9925l;
        String installerPackageName;
        PackageManager packageManager;
        String string;
        String str;
        int i;
        String str2;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        C2626l c2626l;
        C14906l c14906l;
        C14906l c14906l2;
        C14906l c14906l3;
        C14906l c14906l4;
        String strM2821l;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        EnumC3170l enumC3170l;
        final C11675l c11675l;
        int iM1232l;
        boolean zM1682l;
        boolean z;
        C17410l c17410l;
        C14906l c14906l5;
        C11919l c11919l;
        C10559l c10559lM4182l;
        EnumC17672l enumC17672lM1689l;
        EnumC17672l enumC17672lM1689l2;
        EnumC17672l enumC17672l;
        C11919l c11919l2;
        C17417l c17417l;
        C10559l c10559l;
        C17417l c17417l2;
        EnumC17672l enumC17672lM1689l3;
        EnumC17672l enumC17672lM1689l4;
        Boolean boolM1685l;
        C3071l c3071l;
        C10866l c10866l;
        C17410l c17410l2;
        C17417l c17417l3;
        C11919l c11919l3;
        C8118l c8118l;
        boolean zYandex;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        boolean z2;
        long jMax;
        C14906l c14906l6;
        Context context;
        IntentFilter intentFilter;
        C13773l c13773l;
        boolean z3;
        Context context2;
        int i3;
        Iterator it;
        String str3;
        C17410l c17410l3;
        Bundle bundle;
        Long lValueOf;
        long j2 = 0;
        boolean z4 = false;
        int i4 = 1;
        switch (this.f31894l) {
            case 0:
                C3823l c3823l = (C3823l) this.f31893l;
                boolean z5 = c3823l.amazon;
                C17888l c17888l = (C17888l) this.f31892l;
                if (z5) {
                    c17888l.f34845l.adcel();
                    return;
                }
                try {
                    ((C17888l) this.f31892l).f34845l.vip(c17888l.f34842l.smaato(c3823l));
                    return;
                } catch (C17056l e) {
                    boolean z6 = e.getCause() instanceof Exception;
                    C17888l c17888l2 = (C17888l) this.f31892l;
                    if (z6) {
                        c17888l2.f34845l.startapp((Exception) e.getCause());
                        return;
                    } else {
                        c17888l2.f34845l.startapp(e);
                        return;
                    }
                } catch (Exception e2) {
                    ((C17888l) this.f31892l).f34845l.startapp(e2);
                    return;
                }
            case 1:
                C17888l c17888l3 = (C17888l) this.f31892l;
                try {
                    C3823l c3823l2 = (C3823l) c17888l3.f34842l.smaato((C3823l) this.f31893l);
                    if (c3823l2 == null) {
                        c17888l3.adcel(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    ExecutorC10149l executorC10149l = AbstractC8333l.loadAd;
                    c3823l2.billing(executorC10149l, c17888l3);
                    c3823l2.amazon(executorC10149l, c17888l3);
                    c3823l2.loadAd.appmetrica(new C13005l((Executor) executorC10149l, (InterfaceC16369l) c17888l3));
                    c3823l2.subscription();
                    return;
                } catch (C17056l e3) {
                    if (e3.getCause() instanceof Exception) {
                        c17888l3.f34845l.startapp((Exception) e3.getCause());
                        return;
                    } else {
                        c17888l3.f34845l.startapp(e3);
                        return;
                    }
                } catch (Exception e4) {
                    c17888l3.f34845l.startapp(e4);
                    return;
                }
            case 2:
                Callable callable = (Callable) this.f31893l;
                C2350l c2350l = (C2350l) this.f31892l;
                try {
                    c2350l.loadAd(callable.call());
                    return;
                } catch (C12397l e5) {
                    c2350l.yandex(e5);
                    return;
                } catch (Exception e6) {
                    c2350l.yandex(new C12397l("Internal error has occurred when executing ML Kit tasks", e6));
                    return;
                }
            case 3:
                ServiceConnectionC3885l serviceConnectionC3885l = (ServiceConnectionC3885l) this.f31892l;
                C17417l c17417l4 = (C17417l) serviceConnectionC3885l.f8025l.f22693l;
                C17923l c17923l = c17417l4.f33929l;
                C17417l.admob(c17923l);
                c17923l.mo211l();
                Bundle bundle2 = new Bundle();
                bundle2.putString("package_name", serviceConnectionC3885l.f8026l);
                try {
                    C11508l c11508l = (C11508l) ((InterfaceC6486l) this.f31893l);
                    Parcel parcelM743l = c11508l.m743l();
                    AbstractC15425l.loadAd(parcelM743l, bundle2);
                    Parcel parcelM745l = c11508l.m745l(parcelM743l, 1);
                    Bundle bundle3 = (Bundle) AbstractC15425l.yandex(parcelM745l, Bundle.CREATOR);
                    parcelM745l.recycle();
                    if (bundle3 == null) {
                        C8118l c8118l2 = c17417l4.f33950l;
                        C17417l.admob(c8118l2);
                        c8118l2.f16908l.yandex("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e7) {
                    C8118l c8118l3 = c17417l4.f33950l;
                    C17417l.admob(c8118l3);
                    c8118l3.f16908l.loadAd(e7.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                C17923l c17923l2 = c17417l4.f33929l;
                C17417l.admob(c17923l2);
                c17923l2.mo211l();
                throw new IllegalStateException("Unexpected call on client side");
            case 4:
                C13005l c13005l = (C13005l) this.f31892l;
                synchronized (c13005l.f25480l) {
                    ((InterfaceC10162l) c13005l.f25483l).metrica((C3823l) this.f31893l);
                    break;
                }
                return;
            case 5:
                yandex();
                return;
            case 6:
                C17417l c17417l5 = (C17417l) this.f31892l;
                C17120l c17120l = (C17120l) this.f31893l;
                String string2 = "";
                C17923l c17923l3 = c17417l5.f33929l;
                C8118l c8118l4 = c17417l5.f33950l;
                C16386l c16386l = c17417l5.f33944l;
                C17410l c17410l4 = c17417l5.f33949l;
                C17417l.admob(c17923l3);
                c17923l3.mo211l();
                C5051l c5051l = c17417l5.f33945l;
                ((C17417l) c5051l.f833l).getClass();
                C0842l c0842l = new C0842l(c17417l5);
                c0842l.m4563l();
                c17417l5.f33937l = c0842l;
                C16351l c16351l = (C16351l) c17120l.purchase;
                if (c16351l != null) {
                    j2 = c16351l.f31977l;
                }
                if (c16351l != null && (bundle = c16351l.f31979l) != null) {
                    string2 = bundle.getString("runtime_google_app_id", "");
                }
                C9925l c9925l2 = new C9925l(c17417l5, c17120l.yandex, j2, string2);
                c9925l2.m2934l();
                c17417l5.f33931l = c9925l2;
                C11694l c11694l = new C11694l(c17417l5);
                c11694l.m2934l();
                c17417l5.f33938l = c11694l;
                C11860l c11860l = new C11860l(c17417l5);
                c11860l.m2934l();
                c17417l5.f33954l = c11860l;
                boolean z7 = c17410l4.f36144l;
                C17417l c17417l6 = (C17417l) c17410l4.f833l;
                if (z7) {
                    C8339l.smaato("Can't initialize twice");
                    return;
                }
                c17410l4.mo211l();
                SecureRandom secureRandom = new SecureRandom();
                long jNextLong = secureRandom.nextLong();
                if (jNextLong == j2) {
                    jNextLong = secureRandom.nextLong();
                    if (jNextLong == j2) {
                        C8118l c8118l5 = ((C17417l) c17410l4.f833l).f33950l;
                        C17417l.admob(c8118l5);
                        c8118l5.f16910l.yandex("Utils falling back to Random for random id");
                    }
                }
                c17410l4.f33920l.set(jNextLong);
                c17417l6.f33946l.incrementAndGet();
                c17410l4.f36144l = true;
                if (c16386l.f36144l) {
                    C8339l.smaato("Can't initialize twice");
                    return;
                }
                SharedPreferences sharedPreferences2 = ((C17417l) c16386l.f833l).f33936l.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
                c16386l.f32054l = sharedPreferences2;
                boolean z8 = sharedPreferences2.getBoolean("has_been_opened", false);
                c16386l.f32048l = z8;
                if (!z8) {
                    SharedPreferences.Editor editorEdit = c16386l.f32054l.edit();
                    editorEdit.putBoolean("has_been_opened", true);
                    editorEdit.apply();
                }
                long jMax2 = Math.max(0L, ((Long) AbstractC5981l.amazon.yandex(null)).longValue());
                C18338l c18338l = new C18338l();
                c18338l.f35849l = c16386l;
                AbstractC1051l.billing("health_monitor");
                AbstractC1051l.loadAd(jMax2 > 0);
                c18338l.f35847l = "health_monitor:start";
                c18338l.f35846l = "health_monitor:count";
                c18338l.f35850l = "health_monitor:value";
                c18338l.f35848l = jMax2;
                c16386l.f32058l = c18338l;
                ((C17417l) c16386l.f833l).f33946l.incrementAndGet();
                c16386l.f36144l = true;
                C9925l c9925l3 = c17417l5.f33931l;
                if (c9925l3.f21561l) {
                    C8339l.smaato("Can't initialize twice");
                    return;
                }
                String str4 = "";
                C17417l c17417l7 = (C17417l) c9925l3.f833l;
                C8118l c8118l6 = c17417l7.f33950l;
                C8118l c8118l7 = c17417l7.f33950l;
                C17417l.admob(c8118l6);
                c8118l6.f16911l.crashlytics(Long.valueOf(c9925l3.f20214l), Long.valueOf(c9925l3.f20207l), "sdkVersion bundled with app, dynamiteVersion");
                Context context3 = c17417l7.f33936l;
                String packageName = context3.getPackageName();
                PackageManager packageManager2 = context3.getPackageManager();
                if (packageManager2 != null) {
                    c9925l = c9925l2;
                    String str5 = "Unknown";
                    try {
                        installerPackageName = packageManager2.getInstallerPackageName(packageName);
                    } catch (IllegalArgumentException unused) {
                        C17417l.admob(c8118l7);
                        c8118l7.f16908l.loadAd(C8118l.m2260l(packageName), "Error retrieving app installer package name. appId");
                        installerPackageName = "unknown";
                    }
                    if (installerPackageName == null) {
                        installerPackageName = "manual_install";
                    } else if ("com.android.vending".equals(installerPackageName)) {
                        installerPackageName = "";
                    }
                    try {
                        PackageInfo packageInfo = packageManager2.getPackageInfo(context3.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager2.getApplicationLabel(packageInfo.applicationInfo);
                            string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : str5;
                            packageManager = packageManager2;
                            try {
                                String str6 = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    String str7 = string;
                                    str2 = str6;
                                    str = str7;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str6;
                                    C17417l.admob(c8118l7);
                                    c8118l7.f16908l.crashlytics(C8118l.m2260l(packageName), string, "Error retrieving package info. appId, appName");
                                    str = string;
                                    i = Integer.MIN_VALUE;
                                    str2 = str5;
                                    installerPackageName = installerPackageName;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        } else {
                            packageManager = packageManager2;
                            i = Integer.MIN_VALUE;
                            str = str5;
                            str2 = str;
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                        packageManager = packageManager2;
                        string = str5;
                    }
                    break;
                } else {
                    C17417l.admob(c8118l7);
                    c9925l = c9925l2;
                    c8118l7.f16908l.loadAd(C8118l.m2260l(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
                    i = Integer.MIN_VALUE;
                    str2 = "Unknown";
                    installerPackageName = "unknown";
                    packageManager = packageManager2;
                    str = str2;
                }
                c9925l3.f20210l = packageName;
                c9925l3.f20202l = installerPackageName;
                c9925l3.f20209l = str2;
                c9925l3.f20213l = i;
                c9925l3.f20203l = str;
                c9925l3.f20212l = 0L;
                int iLoadAd = c17417l7.loadAd();
                if (iLoadAd == 0) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16911l.yandex("App measurement collection enabled");
                } else if (iLoadAd == 1) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement deactivated via the manifest");
                } else if (iLoadAd == 3) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iLoadAd == 4) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement disabled via the manifest");
                } else if (iLoadAd == 6) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16914l.yandex("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iLoadAd == 7) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement disabled via the global data collection setting");
                } else if (iLoadAd != 8) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement disabled");
                    C17417l.admob(c8118l7);
                    c8118l7.f16909l.yandex("Invalid scion state in identity");
                } else {
                    C17417l.admob(c8118l7);
                    c8118l7.f16907l.yandex("App measurement disabled due to denied storage consent");
                }
                c9925l3.f20204l = "";
                try {
                    String strVip = c9925l3.f20215l;
                    if (TextUtils.isEmpty(strVip)) {
                        strVip = AbstractC2632l.vip(context3, c17417l7.f33933l);
                    }
                    if (!TextUtils.isEmpty(strVip)) {
                        str4 = strVip;
                    }
                    c9925l3.f20204l = str4;
                    if (iLoadAd == 0) {
                        C17417l.admob(c8118l7);
                        c8118l7.f16911l.crashlytics(c9925l3.f20210l, c9925l3.f20204l, "App measurement enabled for app package, google app id");
                    }
                    break;
                } catch (IllegalStateException e8) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16908l.crashlytics(C8118l.m2260l(packageName), e8, "Fetching Google App Id failed with exception. appId");
                }
                c9925l3.f20211l = null;
                C5051l c5051l2 = c17417l7.f33945l;
                C17417l c17417l8 = (C17417l) c5051l2.f833l;
                AbstractC1051l.billing("analytics.safelisted_events");
                Bundle bundleM1680l = c5051l2.m1680l();
                if (bundleM1680l != null) {
                    if (bundleM1680l.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM1680l.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        try {
                            stringArray = c17417l8.f33936l.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = Arrays.asList(stringArray);
                            } else {
                                listAsList = null;
                            }
                        } catch (Resources.NotFoundException e9) {
                            C8118l c8118l8 = c17417l8.f33950l;
                            C17417l.admob(c8118l8);
                            c8118l8.f16908l.loadAd(e9, "Failed to load string array from metadata: resource not found");
                        }
                        break;
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        c9925l3.f20211l = listAsList;
                    } else if (listAsList.isEmpty()) {
                        C17417l.admob(c8118l7);
                        c8118l7.f16914l.yandex("Safelisted event list is empty. Ignoring");
                    } else {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                str3 = (String) it.next();
                                c17410l3 = c17417l7.f33949l;
                                C17417l.billing(c17410l3);
                            } else {
                                c9925l3.f20211l = listAsList;
                            }
                        } while (c17410l3.m4363l("safelisted event", str3));
                    }
                    if (packageManager != null) {
                        c9925l3.f20208l = AbstractC5941l.m1899package(context3) ? 1 : 0;
                    } else {
                        c9925l3.f20208l = 0;
                    }
                    ((C17417l) c9925l3.f833l).f33946l.incrementAndGet();
                    c9925l3.f21561l = true;
                    c2626l = new C2626l(c17417l5);
                    c2626l.m2934l();
                    c17417l5.f33930l = c2626l;
                    if (!c2626l.f21561l) {
                        C8339l.smaato("Can't initialize twice");
                        return;
                    }
                    c2626l.f5726l = (JobScheduler) ((C17417l) c2626l.f833l).f33936l.getSystemService("jobscheduler");
                    ((C17417l) c2626l.f833l).f33946l.incrementAndGet();
                    c2626l.f21561l = true;
                    C17417l.admob(c8118l4);
                    c14906l = c8118l4.f16918l;
                    c14906l2 = c8118l4.f16907l;
                    c14906l3 = c8118l4.f16911l;
                    c14906l4 = c8118l4.f16908l;
                    c5051l.m1678l();
                    c14906l2.loadAd(161000L, "App measurement initialized, version");
                    C17417l.admob(c8118l4);
                    c14906l2.yandex("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM2821l = c9925l.m2821l();
                    if (c17410l4.m4372l(strM2821l, c5051l.f10320l)) {
                        C17417l.admob(c8118l4);
                        c14906l2.yandex("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        C17417l.admob(c8118l4);
                        c14906l2.yandex("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM2821l)));
                    }
                    C17417l.admob(c8118l4);
                    c14906l.yandex("Debug-level message logging enabled");
                    i2 = c17417l5.f33925l;
                    atomicInteger = c17417l5.f33946l;
                    if (i2 != atomicInteger.get()) {
                        C17417l.admob(c8118l4);
                        c14906l4.crashlytics(Integer.valueOf(c17417l5.f33925l), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    c17417l5.f33926l = true;
                    j = c17417l5.f33953l;
                    enumC3170l = EnumC3170l.ANALYTICS_STORAGE;
                    c11675l = c17417l5.f33927l;
                    C17923l c17923l4 = c17417l5.f33929l;
                    C17417l.admob(c17923l4);
                    c17923l4.mo211l();
                    C17417l.purchase(c17417l5.f33930l);
                    iM1232l = c17417l5.f33930l.m1232l();
                    C2156l.yandex();
                    zM1682l = c5051l.m1682l(null, AbstractC5981l.f12668l);
                    if (iM1232l == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zM1682l) {
                        c17410l4.mo211l();
                        if (c17410l4.m4374l() == 1) {
                            c17410l4.mo211l();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            c13773l = new C13773l(c17417l6);
                            z3 = z;
                            context2 = c17417l6.f33936l;
                            c14906l5 = c14906l4;
                            i3 = Build.VERSION.SDK_INT;
                            c17410l = c17410l4;
                            if (i3 >= 33) {
                                AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                            } else if (i3 >= 26) {
                                AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                            } else {
                                context2.registerReceiver(c13773l, intentFilter, null, null);
                            }
                            C8118l c8118l9 = c17417l6.f33950l;
                            C17417l.admob(c8118l9);
                            c8118l9.f16918l.yandex("Registered app receiver");
                            if (z3) {
                                C17417l.purchase(c17417l5.f33930l);
                                c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            c17410l4.mo211l();
                            intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            c13773l = new C13773l(c17417l6);
                            z3 = z;
                            context2 = c17417l6.f33936l;
                            c14906l5 = c14906l4;
                            i3 = Build.VERSION.SDK_INT;
                            c17410l = c17410l4;
                            if (i3 >= 33) {
                                AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                            } else if (i3 >= 26) {
                                AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                            } else {
                                context2.registerReceiver(c13773l, intentFilter, null, null);
                            }
                            C8118l c8118l10 = c17417l6.f33950l;
                            C17417l.admob(c8118l10);
                            c8118l10.f16918l.yandex("Registered app receiver");
                            if (z3) {
                                C17417l.purchase(c17417l5.f33930l);
                                c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                            }
                        } else {
                            c17410l = c17410l4;
                            c14906l5 = c14906l4;
                        }
                    } else if (z) {
                        z = true;
                        c17410l4.mo211l();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c13773l = new C13773l(c17417l6);
                        z3 = z;
                        context2 = c17417l6.f33936l;
                        c14906l5 = c14906l4;
                        i3 = Build.VERSION.SDK_INT;
                        c17410l = c17410l4;
                        if (i3 >= 33) {
                            AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                        } else if (i3 >= 26) {
                            AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                        } else {
                            context2.registerReceiver(c13773l, intentFilter, null, null);
                        }
                        C8118l c8118l11 = c17417l6.f33950l;
                        C17417l.admob(c8118l11);
                        c8118l11.f16918l.yandex("Registered app receiver");
                        if (z3) {
                            C17417l.purchase(c17417l5.f33930l);
                            c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                        }
                    } else {
                        c17410l = c17410l4;
                        c14906l5 = c14906l4;
                    }
                    c11919l = c16386l.f32045l;
                    c10559lM4182l = c16386l.m4182l();
                    int i5 = c10559lM4182l.loadAd;
                    enumC17672lM1689l = c5051l.m1689l("google_analytics_default_allow_ad_storage", false);
                    enumC17672lM1689l2 = c5051l.m1689l("google_analytics_default_allow_analytics_storage", false);
                    enumC17672l = EnumC17672l.UNINITIALIZED;
                    if (enumC17672lM1689l == enumC17672l || enumC17672lM1689l2 != enumC17672l) {
                        c11919l2 = c11919l;
                        c17417l = c17417l5;
                        if (C10559l.smaato(-10, c16386l.m4180l().getInt("consent_source", 100))) {
                            EnumMap enumMap = new EnumMap(EnumC3170l.class);
                            enumMap.put(EnumC3170l.AD_STORAGE, enumC17672lM1689l);
                            enumMap.put(enumC3170l, enumC17672lM1689l2);
                            c10559l = new C10559l(enumMap, -10);
                        }
                        if (c10559l != null) {
                            C17417l.mopub(c11675l);
                            c11675l.m3205l(c10559l, true);
                        } else {
                            c10559l = c10559lM4182l;
                        }
                        C17417l.mopub(c11675l);
                        c17417l2 = (C17417l) c11675l.f833l;
                        c11675l.m3202l(c10559l);
                        c16386l.mo211l();
                        int i6 = C15783l.loadAd(c16386l.m4180l().getString("dma_consent_settings", null)).yandex;
                        enumC17672lM1689l3 = c5051l.m1689l("google_analytics_default_allow_ad_personalization_signals", true);
                        if (enumC17672lM1689l3 != enumC17672l) {
                            C17417l.admob(c8118l4);
                            c14906l3.loadAd(enumC17672lM1689l3, "Default ad personalization consent from Manifest");
                        }
                        enumC17672lM1689l4 = c5051l.m1689l("google_analytics_default_allow_ad_user_data", true);
                        if (enumC17672lM1689l4 == enumC17672l && C10559l.smaato(-10, i6)) {
                            C17417l.mopub(c11675l);
                            EnumMap enumMap2 = new EnumMap(EnumC3170l.class);
                            enumMap2.put(EnumC3170l.AD_USER_DATA, enumC17672lM1689l4);
                            c11675l.m3206l(new C15783l(enumMap2, -10, (Boolean) null, (String) null), true);
                        } else if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l()) && (i6 == 0 || i6 == 30)) {
                            C17417l.mopub(c11675l);
                            c11675l.m3206l(new C15783l((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolM1685l = c5051l.m1685l("google_analytics_tcf_data_enabled");
                        if (boolM1685l != null || boolM1685l.booleanValue()) {
                            C17417l.admob(c8118l4);
                            c14906l.yandex("TCF client enabled.");
                            C17417l.mopub(c11675l);
                            c11675l.mo211l();
                            C8118l c8118l12 = c17417l2.f33950l;
                            C17417l.admob(c8118l12);
                            c8118l12.f16918l.yandex("Register tcfPrefChangeListener.");
                            if (c11675l.f23408l == null) {
                                c11675l.f23405l = new C6820l(c11675l, c17417l2, 2);
                                c11675l.f23408l = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lَٞؗ
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        C11675l c11675l2 = c11675l;
                                        c11675l2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            C8118l c8118l13 = ((C17417l) c11675l2.f833l).f33950l;
                                            C17417l.admob(c8118l13);
                                            c8118l13.f16911l.yandex("IABTCF_TCString change picked up in listener.");
                                            C6820l c6820l = c11675l2.f23405l;
                                            AbstractC1051l.subs(c6820l);
                                            c6820l.loadAd(500L);
                                        }
                                    }
                                };
                            }
                            C16386l c16386l2 = c17417l2.f33944l;
                            C17417l.billing(c16386l2);
                            c16386l2.m4179l().registerOnSharedPreferenceChangeListener(c11675l.f23408l);
                            C17417l.mopub(c11675l);
                            c11675l.m3191l();
                        }
                        c3071l = c16386l.f32042l;
                        if (c3071l.amazon() == 0) {
                            C17417l.admob(c8118l4);
                            c14906l3.loadAd(Long.valueOf(j), "Persisting first open");
                            c3071l.purchase(j);
                        }
                        C17417l.mopub(c11675l);
                        c10866l = c11675l.f23423l;
                        if (c10866l.metrica() && c10866l.crashlytics()) {
                            C16386l c16386l3 = ((C17417l) c10866l.f21968l).f33944l;
                            C17417l.billing(c16386l3);
                            c16386l3.f32047l.ad(null);
                        }
                        if (c17417l.crashlytics()) {
                            c17410l2 = c17410l;
                            c17417l3 = c17417l;
                            if (TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                                c11919l3 = c11919l2;
                            } else {
                                String strM2822l = c17417l3.remoteconfig().m2822l();
                                c16386l.mo211l();
                                String string3 = c16386l.m4180l().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strM2822l);
                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                if (!zIsEmpty || zIsEmpty2) {
                                    c11919l3 = c11919l2;
                                } else {
                                    AbstractC1051l.subs(strM2822l);
                                    if (strM2822l.equals(string3)) {
                                        c11919l3 = c11919l2;
                                    } else {
                                        C17417l.admob(c8118l4);
                                        c14906l2.yandex("Rechecking which service to use due to a GMP App Id change");
                                        c16386l.mo211l();
                                        c16386l.mo211l();
                                        Boolean boolValueOf = c16386l.m4180l().contains("measurement_enabled") ? Boolean.valueOf(c16386l.m4180l().getBoolean("measurement_enabled", true)) : null;
                                        SharedPreferences.Editor editorEdit2 = c16386l.m4180l().edit();
                                        editorEdit2.clear();
                                        editorEdit2.apply();
                                        if (boolValueOf != null) {
                                            c16386l.mo211l();
                                            SharedPreferences.Editor editorEdit3 = c16386l.m4180l().edit();
                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit3.apply();
                                        }
                                        c17417l3.isPro().m3209l();
                                        c17417l3.f33954l.m3255l();
                                        c17417l3.f33954l.m3259l();
                                        c3071l.purchase(j);
                                        c11919l3 = c11919l2;
                                        c11919l3.ad(null);
                                    }
                                }
                                String strM2822l2 = c17417l3.remoteconfig().m2822l();
                                c16386l.mo211l();
                                SharedPreferences.Editor editorEdit4 = c16386l.m4180l().edit();
                                editorEdit4.putString("gmp_app_id", strM2822l2);
                                editorEdit4.apply();
                            }
                            if (!c16386l.m4182l().subs(enumC3170l)) {
                                c11919l3.ad(null);
                            }
                            C17417l.mopub(c11675l);
                            c11675l.f23410l.set(c11919l3.pro());
                            try {
                                c17417l6.f33936l.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            } catch (ClassNotFoundException unused5) {
                                C11919l c11919l4 = c16386l.f32062l;
                                if (!TextUtils.isEmpty(c11919l4.pro())) {
                                    C17417l.admob(c8118l4);
                                    c8118l = c8118l4;
                                    c8118l.f16910l.yandex("Remote config removed with active feature rollouts");
                                    c11919l4.ad(null);
                                }
                                if (!TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                                    zYandex = c17417l3.yandex();
                                    sharedPreferences = c16386l.f32054l;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c16386l.m4178l(!zYandex);
                                    }
                                    if (zYandex) {
                                        C17417l.mopub(c11675l);
                                        c11675l.m3194l();
                                    }
                                    C11569l c11569l = c17417l3.f33932l;
                                    C17417l.mopub(c11569l);
                                    c11569l.f23242l.loadAd();
                                    c17417l3.firebase().m3257l(new AtomicReference());
                                    c17417l3.firebase().m3256l(c16386l.f32055l.amazon());
                                }
                                C2156l.yandex();
                                if (c5051l.m1682l(null, AbstractC5981l.f12668l)) {
                                    c17410l2.mo211l();
                                    if (c17410l2.m4374l() == 1) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        long jIntValue = ((Integer) AbstractC5981l.f12674l.yandex(null)).intValue();
                                        long jNextInt = new Random().nextInt(5000);
                                        c17417l3.f33951l.getClass();
                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            C17417l.admob(c8118l);
                                            c14906l3.loadAd(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        C17417l.mopub(c11675l);
                                        c11675l.mo211l();
                                        if (c11675l.f23406l == null) {
                                            c11675l.f23406l = new C6820l(c11675l, c17417l2, 0);
                                        }
                                        c11675l.f23406l.loadAd(jMax);
                                    }
                                }
                                c16386l.f32046l.loadAd(true);
                                return;
                            }
                            c8118l = c8118l4;
                            if (!TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                                zYandex = c17417l3.yandex();
                                sharedPreferences = c16386l.f32054l;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains && !c5051l.m1686l()) {
                                    c16386l.m4178l(!zYandex);
                                }
                                if (zYandex) {
                                    C17417l.mopub(c11675l);
                                    c11675l.m3194l();
                                }
                                C11569l c11569l2 = c17417l3.f33932l;
                                C17417l.mopub(c11569l2);
                                c11569l2.f23242l.loadAd();
                                c17417l3.firebase().m3257l(new AtomicReference());
                                c17417l3.firebase().m3256l(c16386l.f32055l.amazon());
                            }
                            break;
                        } else {
                            if (c17417l.yandex()) {
                                c17410l2 = c17410l;
                                if (c17410l2.m4351l("android.permission.INTERNET")) {
                                    c14906l6 = c14906l5;
                                } else {
                                    C17417l.admob(c8118l4);
                                    c14906l6 = c14906l5;
                                    c14906l6.yandex("App is missing INTERNET permission");
                                }
                                if (!c17410l2.m4351l("android.permission.ACCESS_NETWORK_STATE")) {
                                    C17417l.admob(c8118l4);
                                    c14906l6.yandex("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                c17417l3 = c17417l;
                                context = c17417l3.f33936l;
                                if (!C16797l.yandex(context).crashlytics() && !c5051l.m1684l()) {
                                    if (!C17410l.m4337l(context)) {
                                        C17417l.admob(c8118l4);
                                        c14906l6.yandex("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!C17410l.m4344l(context)) {
                                        C17417l.admob(c8118l4);
                                        c14906l6.yandex("AppMeasurementService not registered/enabled");
                                    }
                                }
                                C17417l.admob(c8118l4);
                                c14906l6.yandex("Uploading is not possible. App measurement disabled");
                            } else {
                                c17410l2 = c17410l;
                                c17417l3 = c17417l;
                            }
                            c8118l = c8118l4;
                        }
                        C2156l.yandex();
                        if (c5051l.m1682l(null, AbstractC5981l.f12668l)) {
                            c17410l2.mo211l();
                            if (c17410l2.m4374l() == 1) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                long jIntValue2 = ((Integer) AbstractC5981l.f12674l.yandex(null)).intValue();
                                long jNextInt2 = new Random().nextInt(5000);
                                c17417l3.f33951l.getClass();
                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    C17417l.admob(c8118l);
                                    c14906l3.loadAd(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                C17417l.mopub(c11675l);
                                c11675l.mo211l();
                                if (c11675l.f23406l == null) {
                                    c11675l.f23406l = new C6820l(c11675l, c17417l2, 0);
                                }
                                c11675l.f23406l.loadAd(jMax);
                            }
                        }
                        c16386l.f32046l.loadAd(true);
                        return;
                    }
                    c11919l2 = c11919l;
                    c17417l = c17417l5;
                    if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l()) && (i5 == 0 || i5 == 30 || i5 == 10 || i5 == 40)) {
                        C17417l.mopub(c11675l);
                        c11675l.m3205l(new C10559l(-10), false);
                    }
                    c10559l = null;
                    if (c10559l != null) {
                        C17417l.mopub(c11675l);
                        c11675l.m3205l(c10559l, true);
                    } else {
                        c10559l = c10559lM4182l;
                    }
                    C17417l.mopub(c11675l);
                    c17417l2 = (C17417l) c11675l.f833l;
                    c11675l.m3202l(c10559l);
                    c16386l.mo211l();
                    int i7 = C15783l.loadAd(c16386l.m4180l().getString("dma_consent_settings", null)).yandex;
                    enumC17672lM1689l3 = c5051l.m1689l("google_analytics_default_allow_ad_personalization_signals", true);
                    if (enumC17672lM1689l3 != enumC17672l) {
                        C17417l.admob(c8118l4);
                        c14906l3.loadAd(enumC17672lM1689l3, "Default ad personalization consent from Manifest");
                    }
                    enumC17672lM1689l4 = c5051l.m1689l("google_analytics_default_allow_ad_user_data", true);
                    if (enumC17672lM1689l4 == enumC17672l) {
                        if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                            C17417l.mopub(c11675l);
                            c11675l.m3206l(new C15783l((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                        C17417l.mopub(c11675l);
                        c11675l.m3206l(new C15783l((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolM1685l = c5051l.m1685l("google_analytics_tcf_data_enabled");
                    if (boolM1685l != null) {
                        C17417l.admob(c8118l4);
                        c14906l.yandex("TCF client enabled.");
                        C17417l.mopub(c11675l);
                        c11675l.mo211l();
                        C8118l c8118l13 = c17417l2.f33950l;
                        C17417l.admob(c8118l13);
                        c8118l13.f16918l.yandex("Register tcfPrefChangeListener.");
                        if (c11675l.f23408l == null) {
                            c11675l.f23405l = new C6820l(c11675l, c17417l2, 2);
                            c11675l.f23408l = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lَٞؗ
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    C11675l c11675l2 = c11675l;
                                    c11675l2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C8118l c8118l14 = ((C17417l) c11675l2.f833l).f33950l;
                                        C17417l.admob(c8118l14);
                                        c8118l14.f16911l.yandex("IABTCF_TCString change picked up in listener.");
                                        C6820l c6820l = c11675l2.f23405l;
                                        AbstractC1051l.subs(c6820l);
                                        c6820l.loadAd(500L);
                                    }
                                }
                            };
                        }
                        C16386l c16386l4 = c17417l2.f33944l;
                        C17417l.billing(c16386l4);
                        c16386l4.m4179l().registerOnSharedPreferenceChangeListener(c11675l.f23408l);
                        C17417l.mopub(c11675l);
                        c11675l.m3191l();
                    } else {
                        C17417l.admob(c8118l4);
                        c14906l.yandex("TCF client enabled.");
                        C17417l.mopub(c11675l);
                        c11675l.mo211l();
                        C8118l c8118l14 = c17417l2.f33950l;
                        C17417l.admob(c8118l14);
                        c8118l14.f16918l.yandex("Register tcfPrefChangeListener.");
                        if (c11675l.f23408l == null) {
                            c11675l.f23405l = new C6820l(c11675l, c17417l2, 2);
                            c11675l.f23408l = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lَٞؗ
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    C11675l c11675l2 = c11675l;
                                    c11675l2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        C8118l c8118l15 = ((C17417l) c11675l2.f833l).f33950l;
                                        C17417l.admob(c8118l15);
                                        c8118l15.f16911l.yandex("IABTCF_TCString change picked up in listener.");
                                        C6820l c6820l = c11675l2.f23405l;
                                        AbstractC1051l.subs(c6820l);
                                        c6820l.loadAd(500L);
                                    }
                                }
                            };
                        }
                        C16386l c16386l5 = c17417l2.f33944l;
                        C17417l.billing(c16386l5);
                        c16386l5.m4179l().registerOnSharedPreferenceChangeListener(c11675l.f23408l);
                        C17417l.mopub(c11675l);
                        c11675l.m3191l();
                    }
                    c3071l = c16386l.f32042l;
                    if (c3071l.amazon() == 0) {
                        C17417l.admob(c8118l4);
                        c14906l3.loadAd(Long.valueOf(j), "Persisting first open");
                        c3071l.purchase(j);
                    }
                    C17417l.mopub(c11675l);
                    c10866l = c11675l.f23423l;
                    if (c10866l.metrica()) {
                        C16386l c16386l6 = ((C17417l) c10866l.f21968l).f33944l;
                        C17417l.billing(c16386l6);
                        c16386l6.f32047l.ad(null);
                    }
                    if (c17417l.crashlytics()) {
                        if (c17417l.yandex()) {
                            c17410l2 = c17410l;
                            if (c17410l2.m4351l("android.permission.INTERNET")) {
                                C17417l.admob(c8118l4);
                                c14906l6 = c14906l5;
                                c14906l6.yandex("App is missing INTERNET permission");
                            } else {
                                c14906l6 = c14906l5;
                            }
                            if (!c17410l2.m4351l("android.permission.ACCESS_NETWORK_STATE")) {
                                C17417l.admob(c8118l4);
                                c14906l6.yandex("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            c17417l3 = c17417l;
                            context = c17417l3.f33936l;
                            if (!C16797l.yandex(context).crashlytics()) {
                                if (!C17410l.m4337l(context)) {
                                    C17417l.admob(c8118l4);
                                    c14906l6.yandex("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!C17410l.m4344l(context)) {
                                    C17417l.admob(c8118l4);
                                    c14906l6.yandex("AppMeasurementService not registered/enabled");
                                }
                            }
                            C17417l.admob(c8118l4);
                            c14906l6.yandex("Uploading is not possible. App measurement disabled");
                        } else {
                            c17410l2 = c17410l;
                            c17417l3 = c17417l;
                        }
                        c8118l = c8118l4;
                    } else {
                        c17410l2 = c17410l;
                        c17417l3 = c17417l;
                        if (TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                            String strM2822l3 = c17417l3.remoteconfig().m2822l();
                            c16386l.mo211l();
                            String string4 = c16386l.m4180l().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strM2822l3);
                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                            if (zIsEmpty) {
                                c11919l3 = c11919l2;
                            } else {
                                c11919l3 = c11919l2;
                            }
                            String strM2822l4 = c17417l3.remoteconfig().m2822l();
                            c16386l.mo211l();
                            SharedPreferences.Editor editorEdit5 = c16386l.m4180l().edit();
                            editorEdit5.putString("gmp_app_id", strM2822l4);
                            editorEdit5.apply();
                        } else {
                            c11919l3 = c11919l2;
                        }
                        if (!c16386l.m4182l().subs(enumC3170l)) {
                            c11919l3.ad(null);
                        }
                        C17417l.mopub(c11675l);
                        c11675l.f23410l.set(c11919l3.pro());
                        c17417l6.f33936l.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        c8118l = c8118l4;
                        if (!TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                            zYandex = c17417l3.yandex();
                            sharedPreferences = c16386l.f32054l;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                c16386l.m4178l(!zYandex);
                            }
                            if (zYandex) {
                                C17417l.mopub(c11675l);
                                c11675l.m3194l();
                            }
                            C11569l c11569l3 = c17417l3.f33932l;
                            C17417l.mopub(c11569l3);
                            c11569l3.f23242l.loadAd();
                            c17417l3.firebase().m3257l(new AtomicReference());
                            c17417l3.firebase().m3256l(c16386l.f32055l.amazon());
                        }
                    }
                    C2156l.yandex();
                    if (c5051l.m1682l(null, AbstractC5981l.f12668l)) {
                        c17410l2.mo211l();
                        if (c17410l2.m4374l() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            long jIntValue3 = ((Integer) AbstractC5981l.f12674l.yandex(null)).intValue();
                            long jNextInt3 = new Random().nextInt(5000);
                            c17417l3.f33951l.getClass();
                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                C17417l.admob(c8118l);
                                c14906l3.loadAd(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            C17417l.mopub(c11675l);
                            c11675l.mo211l();
                            if (c11675l.f23406l == null) {
                                c11675l.f23406l = new C6820l(c11675l, c17417l2, 0);
                            }
                            c11675l.f23406l.loadAd(jMax);
                        }
                    }
                    c16386l.f32046l.loadAd(true);
                    return;
                }
                C8118l c8118l15 = c17417l8.f33950l;
                C17417l.admob(c8118l15);
                c8118l15.f16908l.yandex("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = c17417l8.f33936l.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = Arrays.asList(stringArray);
                    } else {
                        listAsList = null;
                    }
                    break;
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    c9925l3.f20211l = listAsList;
                } else if (listAsList.isEmpty()) {
                    C17417l.admob(c8118l7);
                    c8118l7.f16914l.yandex("Safelisted event list is empty. Ignoring");
                } else {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            str3 = (String) it.next();
                            c17410l3 = c17417l7.f33949l;
                            C17417l.billing(c17410l3);
                        } else {
                            c9925l3.f20211l = listAsList;
                        }
                    } while (c17410l3.m4363l("safelisted event", str3));
                }
                if (packageManager != null) {
                    c9925l3.f20208l = AbstractC5941l.m1899package(context3) ? 1 : 0;
                } else {
                    c9925l3.f20208l = 0;
                }
                ((C17417l) c9925l3.f833l).f33946l.incrementAndGet();
                c9925l3.f21561l = true;
                c2626l = new C2626l(c17417l5);
                c2626l.m2934l();
                c17417l5.f33930l = c2626l;
                if (!c2626l.f21561l) {
                    C8339l.smaato("Can't initialize twice");
                    return;
                }
                c2626l.f5726l = (JobScheduler) ((C17417l) c2626l.f833l).f33936l.getSystemService("jobscheduler");
                ((C17417l) c2626l.f833l).f33946l.incrementAndGet();
                c2626l.f21561l = true;
                C17417l.admob(c8118l4);
                c14906l = c8118l4.f16918l;
                c14906l2 = c8118l4.f16907l;
                c14906l3 = c8118l4.f16911l;
                c14906l4 = c8118l4.f16908l;
                c5051l.m1678l();
                c14906l2.loadAd(161000L, "App measurement initialized, version");
                C17417l.admob(c8118l4);
                c14906l2.yandex("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM2821l = c9925l.m2821l();
                if (c17410l4.m4372l(strM2821l, c5051l.f10320l)) {
                    C17417l.admob(c8118l4);
                    c14906l2.yandex("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    C17417l.admob(c8118l4);
                    c14906l2.yandex("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM2821l)));
                }
                C17417l.admob(c8118l4);
                c14906l.yandex("Debug-level message logging enabled");
                i2 = c17417l5.f33925l;
                atomicInteger = c17417l5.f33946l;
                if (i2 != atomicInteger.get()) {
                    C17417l.admob(c8118l4);
                    c14906l4.crashlytics(Integer.valueOf(c17417l5.f33925l), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                c17417l5.f33926l = true;
                j = c17417l5.f33953l;
                enumC3170l = EnumC3170l.ANALYTICS_STORAGE;
                c11675l = c17417l5.f33927l;
                C17923l c17923l5 = c17417l5.f33929l;
                C17417l.admob(c17923l5);
                c17923l5.mo211l();
                C17417l.purchase(c17417l5.f33930l);
                iM1232l = c17417l5.f33930l.m1232l();
                C2156l.yandex();
                zM1682l = c5051l.m1682l(null, AbstractC5981l.f12668l);
                if (iM1232l == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zM1682l) {
                    c17410l4.mo211l();
                    if (c17410l4.m4374l() == 1) {
                        c17410l4.mo211l();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c13773l = new C13773l(c17417l6);
                        z3 = z;
                        context2 = c17417l6.f33936l;
                        c14906l5 = c14906l4;
                        i3 = Build.VERSION.SDK_INT;
                        c17410l = c17410l4;
                        if (i3 >= 33) {
                            AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                        } else if (i3 >= 26) {
                            AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                        } else {
                            context2.registerReceiver(c13773l, intentFilter, null, null);
                        }
                        C8118l c8118l16 = c17417l6.f33950l;
                        C17417l.admob(c8118l16);
                        c8118l16.f16918l.yandex("Registered app receiver");
                        if (z3) {
                            C17417l.purchase(c17417l5.f33930l);
                            c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        c17410l4.mo211l();
                        intentFilter = new IntentFilter();
                        intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        c13773l = new C13773l(c17417l6);
                        z3 = z;
                        context2 = c17417l6.f33936l;
                        c14906l5 = c14906l4;
                        i3 = Build.VERSION.SDK_INT;
                        c17410l = c17410l4;
                        if (i3 >= 33) {
                            AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                        } else if (i3 >= 26) {
                            AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                        } else {
                            context2.registerReceiver(c13773l, intentFilter, null, null);
                        }
                        C8118l c8118l17 = c17417l6.f33950l;
                        C17417l.admob(c8118l17);
                        c8118l17.f16918l.yandex("Registered app receiver");
                        if (z3) {
                            C17417l.purchase(c17417l5.f33930l);
                            c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                        }
                    } else {
                        c17410l = c17410l4;
                        c14906l5 = c14906l4;
                    }
                } else if (z) {
                    z = true;
                    c17410l4.mo211l();
                    intentFilter = new IntentFilter();
                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    c13773l = new C13773l(c17417l6);
                    z3 = z;
                    context2 = c17417l6.f33936l;
                    c14906l5 = c14906l4;
                    i3 = Build.VERSION.SDK_INT;
                    c17410l = c17410l4;
                    if (i3 >= 33) {
                        AbstractC5941l.m1886extends(context2, c13773l, intentFilter);
                    } else if (i3 >= 26) {
                        AbstractC5941l.m1900private(context2, c13773l, intentFilter);
                    } else {
                        context2.registerReceiver(c13773l, intentFilter, null, null);
                    }
                    C8118l c8118l18 = c17417l6.f33950l;
                    C17417l.admob(c8118l18);
                    c8118l18.f16918l.yandex("Registered app receiver");
                    if (z3) {
                        C17417l.purchase(c17417l5.f33930l);
                        c17417l5.f33930l.m1233l(((Long) AbstractC5981l.applovin.yandex(null)).longValue());
                    }
                } else {
                    c17410l = c17410l4;
                    c14906l5 = c14906l4;
                }
                c11919l = c16386l.f32045l;
                c10559lM4182l = c16386l.m4182l();
                int i8 = c10559lM4182l.loadAd;
                enumC17672lM1689l = c5051l.m1689l("google_analytics_default_allow_ad_storage", false);
                enumC17672lM1689l2 = c5051l.m1689l("google_analytics_default_allow_analytics_storage", false);
                enumC17672l = EnumC17672l.UNINITIALIZED;
                if (enumC17672lM1689l == enumC17672l) {
                    c11919l2 = c11919l;
                    c17417l = c17417l5;
                    if (C10559l.smaato(-10, c16386l.m4180l().getInt("consent_source", 100))) {
                        EnumMap enumMap3 = new EnumMap(EnumC3170l.class);
                        enumMap3.put(EnumC3170l.AD_STORAGE, enumC17672lM1689l);
                        enumMap3.put(enumC3170l, enumC17672lM1689l2);
                        c10559l = new C10559l(enumMap3, -10);
                    } else {
                        if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                            C17417l.mopub(c11675l);
                            c11675l.m3205l(new C10559l(-10), false);
                        }
                        c10559l = null;
                    }
                } else {
                    c11919l2 = c11919l;
                    c17417l = c17417l5;
                    if (C10559l.smaato(-10, c16386l.m4180l().getInt("consent_source", 100))) {
                        EnumMap enumMap4 = new EnumMap(EnumC3170l.class);
                        enumMap4.put(EnumC3170l.AD_STORAGE, enumC17672lM1689l);
                        enumMap4.put(enumC3170l, enumC17672lM1689l2);
                        c10559l = new C10559l(enumMap4, -10);
                    } else {
                        if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                            C17417l.mopub(c11675l);
                            c11675l.m3205l(new C10559l(-10), false);
                        }
                        c10559l = null;
                    }
                }
                if (c10559l != null) {
                    C17417l.mopub(c11675l);
                    c11675l.m3205l(c10559l, true);
                } else {
                    c10559l = c10559lM4182l;
                }
                C17417l.mopub(c11675l);
                c17417l2 = (C17417l) c11675l.f833l;
                c11675l.m3202l(c10559l);
                c16386l.mo211l();
                int i9 = C15783l.loadAd(c16386l.m4180l().getString("dma_consent_settings", null)).yandex;
                enumC17672lM1689l3 = c5051l.m1689l("google_analytics_default_allow_ad_personalization_signals", true);
                if (enumC17672lM1689l3 != enumC17672l) {
                    C17417l.admob(c8118l4);
                    c14906l3.loadAd(enumC17672lM1689l3, "Default ad personalization consent from Manifest");
                }
                enumC17672lM1689l4 = c5051l.m1689l("google_analytics_default_allow_ad_user_data", true);
                if (enumC17672lM1689l4 == enumC17672l) {
                    if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                        C17417l.mopub(c11675l);
                        c11675l.m3206l(new C15783l((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(c17417l.remoteconfig().m2822l())) {
                    C17417l.mopub(c11675l);
                    c11675l.m3206l(new C15783l((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolM1685l = c5051l.m1685l("google_analytics_tcf_data_enabled");
                if (boolM1685l != null) {
                    C17417l.admob(c8118l4);
                    c14906l.yandex("TCF client enabled.");
                    C17417l.mopub(c11675l);
                    c11675l.mo211l();
                    C8118l c8118l19 = c17417l2.f33950l;
                    C17417l.admob(c8118l19);
                    c8118l19.f16918l.yandex("Register tcfPrefChangeListener.");
                    if (c11675l.f23408l == null) {
                        c11675l.f23405l = new C6820l(c11675l, c17417l2, 2);
                        c11675l.f23408l = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lَٞؗ
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                C11675l c11675l2 = c11675l;
                                c11675l2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C8118l c8118l110 = ((C17417l) c11675l2.f833l).f33950l;
                                    C17417l.admob(c8118l110);
                                    c8118l110.f16911l.yandex("IABTCF_TCString change picked up in listener.");
                                    C6820l c6820l = c11675l2.f23405l;
                                    AbstractC1051l.subs(c6820l);
                                    c6820l.loadAd(500L);
                                }
                            }
                        };
                    }
                    C16386l c16386l7 = c17417l2.f33944l;
                    C17417l.billing(c16386l7);
                    c16386l7.m4179l().registerOnSharedPreferenceChangeListener(c11675l.f23408l);
                    C17417l.mopub(c11675l);
                    c11675l.m3191l();
                } else {
                    C17417l.admob(c8118l4);
                    c14906l.yandex("TCF client enabled.");
                    C17417l.mopub(c11675l);
                    c11675l.mo211l();
                    C8118l c8118l110 = c17417l2.f33950l;
                    C17417l.admob(c8118l110);
                    c8118l110.f16918l.yandex("Register tcfPrefChangeListener.");
                    if (c11675l.f23408l == null) {
                        c11675l.f23405l = new C6820l(c11675l, c17417l2, 2);
                        c11675l.f23408l = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: lَٞؗ
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                C11675l c11675l2 = c11675l;
                                c11675l2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    C8118l c8118l111 = ((C17417l) c11675l2.f833l).f33950l;
                                    C17417l.admob(c8118l111);
                                    c8118l111.f16911l.yandex("IABTCF_TCString change picked up in listener.");
                                    C6820l c6820l = c11675l2.f23405l;
                                    AbstractC1051l.subs(c6820l);
                                    c6820l.loadAd(500L);
                                }
                            }
                        };
                    }
                    C16386l c16386l8 = c17417l2.f33944l;
                    C17417l.billing(c16386l8);
                    c16386l8.m4179l().registerOnSharedPreferenceChangeListener(c11675l.f23408l);
                    C17417l.mopub(c11675l);
                    c11675l.m3191l();
                }
                c3071l = c16386l.f32042l;
                if (c3071l.amazon() == 0) {
                    C17417l.admob(c8118l4);
                    c14906l3.loadAd(Long.valueOf(j), "Persisting first open");
                    c3071l.purchase(j);
                }
                C17417l.mopub(c11675l);
                c10866l = c11675l.f23423l;
                if (c10866l.metrica()) {
                    C16386l c16386l9 = ((C17417l) c10866l.f21968l).f33944l;
                    C17417l.billing(c16386l9);
                    c16386l9.f32047l.ad(null);
                }
                if (c17417l.crashlytics()) {
                    if (c17417l.yandex()) {
                        c17410l2 = c17410l;
                        if (c17410l2.m4351l("android.permission.INTERNET")) {
                            C17417l.admob(c8118l4);
                            c14906l6 = c14906l5;
                            c14906l6.yandex("App is missing INTERNET permission");
                        } else {
                            c14906l6 = c14906l5;
                        }
                        if (!c17410l2.m4351l("android.permission.ACCESS_NETWORK_STATE")) {
                            C17417l.admob(c8118l4);
                            c14906l6.yandex("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        c17417l3 = c17417l;
                        context = c17417l3.f33936l;
                        if (!C16797l.yandex(context).crashlytics()) {
                            if (!C17410l.m4337l(context)) {
                                C17417l.admob(c8118l4);
                                c14906l6.yandex("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!C17410l.m4344l(context)) {
                                C17417l.admob(c8118l4);
                                c14906l6.yandex("AppMeasurementService not registered/enabled");
                            }
                        }
                        C17417l.admob(c8118l4);
                        c14906l6.yandex("Uploading is not possible. App measurement disabled");
                    } else {
                        c17410l2 = c17410l;
                        c17417l3 = c17417l;
                    }
                    c8118l = c8118l4;
                } else {
                    c17410l2 = c17410l;
                    c17417l3 = c17417l;
                    if (TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                        String strM2822l5 = c17417l3.remoteconfig().m2822l();
                        c16386l.mo211l();
                        String string5 = c16386l.m4180l().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strM2822l5);
                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                        if (zIsEmpty) {
                            c11919l3 = c11919l2;
                        } else {
                            c11919l3 = c11919l2;
                        }
                        String strM2822l6 = c17417l3.remoteconfig().m2822l();
                        c16386l.mo211l();
                        SharedPreferences.Editor editorEdit6 = c16386l.m4180l().edit();
                        editorEdit6.putString("gmp_app_id", strM2822l6);
                        editorEdit6.apply();
                    } else {
                        c11919l3 = c11919l2;
                    }
                    if (!c16386l.m4182l().subs(enumC3170l)) {
                        c11919l3.ad(null);
                    }
                    C17417l.mopub(c11675l);
                    c11675l.f23410l.set(c11919l3.pro());
                    c17417l6.f33936l.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    c8118l = c8118l4;
                    if (!TextUtils.isEmpty(c17417l3.remoteconfig().m2822l())) {
                        zYandex = c17417l3.yandex();
                        sharedPreferences = c16386l.f32054l;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            c16386l.m4178l(!zYandex);
                        }
                        if (zYandex) {
                            C17417l.mopub(c11675l);
                            c11675l.m3194l();
                        }
                        C11569l c11569l4 = c17417l3.f33932l;
                        C17417l.mopub(c11569l4);
                        c11569l4.f23242l.loadAd();
                        c17417l3.firebase().m3257l(new AtomicReference());
                        c17417l3.firebase().m3256l(c16386l.f32055l.amazon());
                    }
                }
                C2156l.yandex();
                if (c5051l.m1682l(null, AbstractC5981l.f12668l)) {
                    c17410l2.mo211l();
                    if (c17410l2.m4374l() == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        long jIntValue4 = ((Integer) AbstractC5981l.f12674l.yandex(null)).intValue();
                        long jNextInt4 = new Random().nextInt(5000);
                        c17417l3.f33951l.getClass();
                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            C17417l.admob(c8118l);
                            c14906l3.loadAd(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        C17417l.mopub(c11675l);
                        c11675l.mo211l();
                        if (c11675l.f23406l == null) {
                            c11675l.f23406l = new C6820l(c11675l, c17417l2, 0);
                        }
                        c11675l.f23406l.loadAd(jMax);
                    }
                }
                c16386l.f32046l.loadAd(true);
                return;
            case 7:
                BinderC15526l binderC15526l = (BinderC15526l) this.f31892l;
                binderC15526l.purchase.m2089continue();
                C17509l c17509l = (C17509l) this.f31893l;
                Object objBilling = c17509l.f34112l.billing();
                C6901l c6901l = binderC15526l.purchase;
                if (objBilling == null) {
                    c6901l.getClass();
                    String str8 = c17509l.f34116l;
                    AbstractC1051l.subs(str8);
                    C10462l c10462lM2091extends = c6901l.m2091extends(str8);
                    if (c10462lM2091extends != null) {
                        c6901l.m2092final(c17509l, c10462lM2091extends);
                        return;
                    }
                    return;
                }
                c6901l.getClass();
                String str9 = c17509l.f34116l;
                AbstractC1051l.subs(str9);
                C10462l c10462lM2091extends2 = c6901l.m2091extends(str9);
                if (c10462lM2091extends2 != null) {
                    c6901l.m2090default(c17509l, c10462lM2091extends2);
                    return;
                }
                return;
            case 8:
                loadAd();
                return;
            case 9:
                InterfaceC6989l interfaceC6989l = (InterfaceC6989l) this.f31893l;
                C11675l c11675l2 = (C11675l) this.f31892l;
                C17417l c17417l9 = (C17417l) c11675l2.f833l;
                C17417l c17417l10 = (C17417l) c11675l2.f833l;
                C11569l c11569l5 = c17417l9.f33932l;
                C17417l.mopub(c11569l5);
                C17417l c17417l11 = (C17417l) c11569l5.f833l;
                C16386l c16386l10 = c17417l11.f33944l;
                C17417l.billing(c16386l10);
                if (c16386l10.m4182l().subs(EnumC3170l.ANALYTICS_STORAGE)) {
                    C17417l.billing(c16386l10);
                    C3071l c3071l2 = c16386l10.f32061l;
                    c17417l11.f33951l.getClass();
                    if (!c16386l10.m4183l(System.currentTimeMillis()) && c3071l2.amazon() != 0) {
                        lValueOf = Long.valueOf(c3071l2.amazon());
                    }
                    if (lValueOf == null) {
                        C17410l c17410l5 = c17417l10.f33949l;
                        C17417l.billing(c17410l5);
                        c17410l5.m4369l(interfaceC6989l, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            interfaceC6989l.mo785return(null);
                            return;
                        } catch (RemoteException e10) {
                            C8118l c8118l20 = c17417l10.f33950l;
                            C17417l.admob(c8118l20);
                            c8118l20.f16908l.loadAd(e10, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                C8118l c8118l21 = c17417l11.f33950l;
                C17417l.admob(c8118l21);
                c8118l21.f16914l.yandex("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    interfaceC6989l.mo785return(null);
                    return;
                }
                C17410l c17410l6 = c17417l10.f33949l;
                C17417l.billing(c17410l6);
                c17410l6.m4369l(interfaceC6989l, lValueOf.longValue());
                return;
            case 10:
                ((C11675l) this.f31892l).m3195l((Boolean) this.f31893l, true);
                return;
            case 11:
                C11675l c11675l3 = (C11675l) this.f31892l;
                C17417l c17417l12 = (C17417l) c11675l3.f833l;
                C16386l c16386l11 = c17417l12.f33944l;
                C8118l c8118l22 = c17417l12.f33950l;
                C17417l.billing(c16386l11);
                c16386l11.mo211l();
                c16386l11.mo211l();
                C15783l c15783lLoadAd = C15783l.loadAd(c16386l11.m4180l().getString("dma_consent_settings", null));
                C15783l c15783l = (C15783l) this.f31893l;
                int i10 = c15783l.yandex;
                if (!C10559l.smaato(i10, c15783lLoadAd.yandex)) {
                    C17417l.admob(c8118l22);
                    c8118l22.f16907l.loadAd(Integer.valueOf(i10), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit7 = c16386l11.m4180l().edit();
                editorEdit7.putString("dma_consent_settings", c15783l.loadAd);
                editorEdit7.apply();
                C17417l.admob(c8118l22);
                c8118l22.f16911l.loadAd(c15783l, "Setting DMA consent(FE)");
                C17417l c17417l13 = (C17417l) c11675l3.f833l;
                if (c17417l13.firebase().m3260l()) {
                    C11860l c11860lFirebase = c17417l13.firebase();
                    c11860lFirebase.mo211l();
                    c11860lFirebase.m2935l();
                    c11860lFirebase.m3267l(new RunnableC4507l(c11860lFirebase, i4));
                    return;
                }
                C11860l c11860lFirebase2 = c17417l13.firebase();
                c11860lFirebase2.mo211l();
                c11860lFirebase2.m2935l();
                if (c11860lFirebase2.m3265l()) {
                    c11860lFirebase2.m3267l(new RunnableC4644l(c11860lFirebase2, c11860lFirebase2.m3269l(false)));
                    return;
                }
                return;
            case 12:
                C11675l c11675l4 = ((AppMeasurementDynamiteService) this.f31892l).purchase.f33927l;
                C17417l.mopub(c11675l4);
                C5633l c5633l = (C5633l) this.f31893l;
                c11675l4.mo211l();
                c11675l4.m2935l();
                C5633l c5633l2 = c11675l4.f23416l;
                if (c5633l != c5633l2) {
                    AbstractC1051l.firebase("EventInterceptor already set.", c5633l2 == null);
                }
                c11675l4.f23416l = c5633l;
                return;
            case 13:
                crashlytics();
                return;
            case 14:
                C17417l c17417l14 = (C17417l) ((C11675l) this.f31893l).f833l;
                C9925l c9925lRemoteconfig = c17417l14.remoteconfig();
                String str10 = (String) this.f31892l;
                String str11 = c9925lRemoteconfig.f20205l;
                if (str11 != null && !str11.equals(str10)) {
                    z4 = true;
                }
                c9925lRemoteconfig.f20205l = str10;
                if (z4) {
                    c17417l14.remoteconfig().m2819l();
                    return;
                }
                return;
            case 15:
                amazon();
                return;
            case 16:
                C11860l c11860l2 = (C11860l) this.f31892l;
                InterfaceC5496l interfaceC5496l = c11860l2.f23690l;
                C17417l c17417l15 = (C17417l) c11860l2.f833l;
                if (interfaceC5496l == null) {
                    C8118l c8118l23 = c17417l15.f33950l;
                    C17417l.admob(c8118l23);
                    c8118l23.f16908l.yandex("Failed to send current screen to service");
                    return;
                }
                try {
                    C6373l c6373l = (C6373l) this.f31893l;
                    if (c6373l == null) {
                        interfaceC5496l.ad(0L, null, null, c17417l15.f33936l.getPackageName());
                    } else {
                        interfaceC5496l.ad(c6373l.crashlytics, c6373l.yandex, c6373l.loadAd, c17417l15.f33936l.getPackageName());
                    }
                    c11860l2.m3266l();
                    return;
                } catch (RemoteException e11) {
                    C8118l c8118l24 = ((C17417l) c11860l2.f833l).f33950l;
                    C17417l.admob(c8118l24);
                    c8118l24.f16908l.loadAd(e11, "Failed to send current screen to the service");
                    return;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((ServiceConnectionC14909l) this.f31892l).f29351l.m3264l((ComponentName) this.f31893l);
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                purchase();
                return;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C11860l c11860l3 = ((ServiceConnectionC14909l) this.f31892l).f29351l;
                c11860l3.f23690l = null;
                if (((C10602l) this.f31893l).f21520l != 7777) {
                    c11860l3.m3258l();
                    return;
                }
                if (c11860l3.f23688l == null) {
                    c11860l3.f23688l = Executors.newScheduledThreadPool(1);
                }
                c11860l3.f23688l.schedule(new RunnableC10799l(11, this), ((Long) AbstractC5981l.f12642goto.yandex(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 20:
                billing();
                return;
            case 21:
                mopub();
                return;
            case 22:
                admob();
                return;
            case 23:
                subs();
                return;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                isPro();
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                firebase();
                return;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                smaato();
                return;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f31893l = null;
                this.f31892l = null;
                return;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                remoteconfig();
                return;
            default:
                C3823l c3823l3 = (C3823l) this.f31893l;
                try {
                    c3823l3.vip(((Callable) this.f31892l).call());
                    return;
                } catch (Exception e12) {
                    c3823l3.startapp(e12);
                    return;
                } catch (Throwable th) {
                    c3823l3.startapp(new RuntimeException(th));
                    return;
                }
        }
    }

    public /* synthetic */ RunnableC16301l(Object obj, Object obj2, int i) {
        this.f31894l = i;
        this.f31893l = obj2;
        this.f31892l = obj;
    }

    public /* synthetic */ RunnableC16301l(Object obj, Object obj2, Object obj3, int i) {
        this.f31894l = i;
        this.f31893l = obj2;
        this.f31892l = obj3;
    }

    public /* synthetic */ RunnableC16301l(Object obj, Object obj2, boolean z, int i) {
        this.f31894l = i;
        this.f31893l = obj;
        this.f31892l = obj2;
    }

    public /* synthetic */ RunnableC16301l(C17781l c17781l, C15053l c15053l) {
        this.f31894l = 28;
        EnumC7663l enumC7663l = EnumC7663l.UNKNOWN_EVENT;
        this.f31893l = c17781l;
        this.f31892l = c15053l;
    }

    public RunnableC16301l(ServiceConnectionC3885l serviceConnectionC3885l, InterfaceC6486l interfaceC6486l, ServiceConnectionC3885l serviceConnectionC3885l2) {
        this.f31894l = 3;
        this.f31893l = interfaceC6486l;
        this.f31892l = serviceConnectionC3885l;
    }

    public /* synthetic */ RunnableC16301l() {
        this.f31894l = 27;
    }

    public RunnableC16301l(C11860l c11860l, C6373l c6373l) {
        this.f31894l = 16;
        this.f31893l = c6373l;
        Objects.requireNonNull(c11860l);
        this.f31892l = c11860l;
    }
}

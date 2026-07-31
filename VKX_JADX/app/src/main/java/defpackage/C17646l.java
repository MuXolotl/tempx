package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: l٘ؓۚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C17646l {
    public static final /* synthetic */ int inmobi = 0;
    public C9868l Signature;
    public C12736l ad;
    public final boolean adcel;
    public C3288l ads;
    public AbstractC11653l advert;
    public C12736l amazon;
    public C0554l applovin;
    public final C15053l appmetrica;
    public C15014l billing;
    public final C8961l crashlytics;
    public C4658l isVip;
    public C12736l license;
    public final C14965l metrica;
    public final Context mopub;
    public int premium;
    public C12736l pro;
    public AbstractC16531l purchase;
    public C4658l signatures;
    public final boolean startapp;
    public final C14633l subscription;
    public final C3071l tapsense;
    public final C7221l vip;
    public final HandlerC3504l yandex = new HandlerC3504l(this);
    public final HashMap loadAd = new HashMap();
    public final ArrayList admob = new ArrayList();
    public final ArrayList subs = new ArrayList();
    public final HashMap isPro = new HashMap();
    public final HashMap firebase = new HashMap();
    public final ArrayList smaato = new ArrayList();
    public final ArrayList remoteconfig = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x008e  */
    public C17646l(Context context) {
        boolean z;
        C7221l c7221l = new C7221l(4);
        c7221l.f15052l = 0;
        c7221l.f15051l = 3;
        this.vip = c7221l;
        this.metrica = new C14965l(this);
        this.appmetrica = new C15053l(this);
        this.mopub = context;
        this.startapp = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            int i2 = AbstractC7639l.loadAd;
            Intent intent = new Intent(context, (Class<?>) AbstractC7639l.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        this.adcel = z;
        int i3 = AbstractC9222l.yandex;
        Intent intent2 = new Intent(context, (Class<?>) AbstractC9222l.class);
        intent2.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
        int i4 = 9;
        this.ads = (i < 30 || !z) ? null : new C3288l(context, new C7026l(i4, this));
        C14633l c14550l = i >= 24 ? new C14550l(context, this) : new C14633l(context, this);
        this.subscription = c14550l;
        this.tapsense = new C3071l(new RunnableC11297l(i4, this));
        yandex(c14550l, true);
        AbstractC3621l abstractC3621l = this.ads;
        if (abstractC3621l != null) {
            yandex(abstractC3621l, true);
        }
        C8961l c8961l = new C8961l(context, this);
        this.crashlytics = c8961l;
        Handler handler = (Handler) c8961l.purchase;
        if (c8961l.loadAd) {
            return;
        }
        c8961l.loadAd = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) c8961l.crashlytics).registerReceiver((C13773l) c8961l.admob, intentFilter, null, handler);
        handler.post((RunnableC5360l) c8961l.subs);
    }

    public final boolean admob() {
        if (!this.adcel) {
            return false;
        }
        C9868l c9868l = this.Signature;
        return c9868l == null || c9868l.yandex;
    }

    public final C12545l amazon(AbstractC3621l abstractC3621l) {
        for (C12545l c12545l : this.smaato) {
            if (c12545l.yandex == abstractC3621l) {
                return c12545l;
            }
        }
        return null;
    }

    public final AbstractC16531l billing(C12736l c12736l) {
        AbstractC16531l abstractC16531l;
        if (c12736l == this.amazon && (abstractC16531l = this.purchase) != null) {
            return abstractC16531l;
        }
        boolean z = c12736l instanceof C12037l;
        HashMap map = this.isPro;
        if (z) {
            C9961l.loadAd();
            if (C9961l.crashlytics().purchase().contains((C12037l) c12736l)) {
                Iterator it = map.values().iterator();
                if (it.hasNext()) {
                    throw AbstractC15560l.adcel(it);
                }
                return null;
            }
        }
        AbstractC16531l abstractC16531l2 = (AbstractC16531l) this.loadAd.get(c12736l.crashlytics);
        if (abstractC16531l2 != null) {
            return abstractC16531l2;
        }
        Iterator it2 = map.values().iterator();
        if (it2.hasNext()) {
            throw AbstractC15560l.adcel(it2);
        }
        return abstractC16531l2;
    }

    public final C12736l crashlytics() {
        for (C12736l c12736l : this.subs) {
            if (c12736l != this.license && c12736l.yandex() == this.subscription && c12736l.admob("android.media.intent.category.LIVE_AUDIO") && !c12736l.admob("android.media.intent.category.LIVE_VIDEO") && c12736l.amazon()) {
                return c12736l;
            }
        }
        return this.license;
    }

    public final void firebase(C12736l c12736l, int i, boolean z) {
        C4300l c4300l;
        String str;
        if (this.amazon == c12736l) {
            return;
        }
        boolean z2 = c12736l == this.license;
        if (this.pro != null && z2) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb = new StringBuilder("- Stacktrace: [");
            int i2 = 3;
            while (i2 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i2];
                sb.append(stackTraceElement.getClassName());
                sb.append(".");
                sb.append(stackTraceElement.getMethodName());
                sb.append(":");
                sb.append(stackTraceElement.getLineNumber());
                i2++;
                if (i2 < stackTrace.length) {
                    sb.append(", ");
                }
            }
            sb.append("]");
            C12736l c12736l2 = this.amazon;
            if (c12736l2 != null) {
                Locale locale = Locale.US;
                String str2 = c12736l2.amazon;
                C9961l.loadAd();
                str = str2 + "(BT=" + (C9961l.crashlytics().pro == c12736l2) + ", syncMediaRoute1Provider=" + z + ")";
            } else {
                str = null;
            }
            StringBuilder sbIsVip = AbstractC5020l.isVip("Changing selection(", str, ") to default while BT is available: pkgName=");
            sbIsVip.append(this.mopub.getPackageName());
            sbIsVip.append((Object) sb);
            Log.w("AxMediaRouter", sbIsVip.toString());
        }
        if (this.ad != null) {
            this.ad = null;
            AbstractC11653l abstractC11653l = this.advert;
            if (abstractC11653l != null) {
                abstractC11653l.admob(3);
                this.advert.amazon();
                this.advert = null;
            }
        }
        if (admob() && (c4300l = c12736l.yandex.purchase) != null && c4300l.crashlytics) {
            AbstractC3621l abstractC3621lYandex = c12736l.yandex();
            String str3 = c12736l.loadAd;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.mopub.getPackageName());
            AbstractC11653l abstractC11653lYandex = abstractC3621lYandex.yandex(str3, new C15536l(bundle));
            if (abstractC11653lYandex != null) {
                Executor executorAmazon = AbstractC7720l.amazon(this.mopub);
                C15053l c15053l = this.appmetrica;
                synchronized (abstractC11653lYandex.yandex) {
                    try {
                        if (executorAmazon == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (c15053l == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        abstractC11653lYandex.loadAd = executorAmazon;
                        abstractC11653lYandex.crashlytics = c15053l;
                        ArrayList arrayList = abstractC11653lYandex.purchase;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            C13187l c13187l = abstractC11653lYandex.amazon;
                            ArrayList arrayList2 = abstractC11653lYandex.purchase;
                            abstractC11653lYandex.amazon = null;
                            abstractC11653lYandex.purchase = null;
                            abstractC11653lYandex.loadAd.execute(new RunnableC4063l(abstractC11653lYandex, c15053l, c13187l, arrayList2, 10));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.ad = c12736l;
                this.advert = abstractC11653lYandex;
                abstractC11653lYandex.purchase();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + c12736l);
        }
        AbstractC3621l abstractC3621lYandex2 = c12736l.yandex();
        String str4 = c12736l.loadAd;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.mopub.getPackageName());
        AbstractC16531l abstractC16531lCrashlytics = abstractC3621lYandex2.crashlytics(str4, new C15536l(bundle2));
        if (abstractC16531lCrashlytics != null) {
            abstractC16531lCrashlytics.purchase();
        }
        if (this.amazon == null) {
            this.amazon = c12736l;
            this.purchase = abstractC16531lCrashlytics;
            HandlerC3504l handlerC3504l = this.yandex;
            handlerC3504l.getClass();
            Message messageObtainMessage = handlerC3504l.obtainMessage(262, new C16197l(null, c12736l, z));
            messageObtainMessage.arg1 = i;
            messageObtainMessage.sendToTarget();
            return;
        }
        C15014l c15014l = this.billing;
        if (c15014l != null) {
            c15014l.yandex();
            this.billing = null;
        }
        C15014l c15014l2 = new C15014l(this, c12736l, abstractC16531lCrashlytics, i, z, null, null);
        this.billing = c15014l2;
        c15014l2.loadAd();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        if (r0 != 2) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void isPro(defpackage.C12736l r5, int r6, boolean r7) {
        /*
            r4 = this;
            java.util.ArrayList r0 = r4.subs
            boolean r0 = r0.contains(r5)
            java.lang.String r1 = "AxMediaRouter"
            if (r0 != 0) goto L1c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Ignoring attempt to select removed route: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r1, r4)
            return
        L1c:
            boolean r0 = r5.mopub
            if (r0 != 0) goto L32
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Ignoring attempt to select disabled route: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r1, r4)
            return
        L32:
            lّٝۘ r0 = r4.amazon
            if (r0 != r5) goto L37
            goto L66
        L37:
            r2 = 0
            if (r0 == 0) goto L41
            boolean r3 = r0 instanceof defpackage.C12037l
            if (r3 == 0) goto L41
            r2 = r0
            lِۖٓ r2 = (defpackage.C12037l) r2
        L41:
            if (r2 == 0) goto L78
            java.util.ArrayList r0 = r2.license
            java.util.List r0 = j$.util.DesugarCollections.unmodifiableList(r0)
            int r0 = r0.size()
            r3 = 1
            if (r0 != r3) goto L78
            lُٛ٘ r0 = r2.ad
            java.lang.String r2 = r5.crashlytics
            java.lang.Object r0 = r0.get(r2)
            lٍؘٖ r0 = (defpackage.C5717l) r0
            if (r0 == 0) goto L5f
            int r0 = r0.loadAd
            goto L60
        L5f:
            r0 = 4
        L60:
            r2 = 3
            if (r0 == r2) goto L66
            r2 = 2
            if (r0 != r2) goto L78
        L66:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "Ignoring attempt to select selected route: "
            r4.<init>(r6)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.w(r1, r4)
            return
        L78:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L90
            lؕۚٚ r0 = r5.yandex()
            lٍؕؐ r1 = r4.ads
            if (r0 != r1) goto L90
            lّٝۘ r0 = r4.amazon
            if (r0 == r5) goto L90
            java.lang.String r4 = r5.loadAd
            r1.smaato(r4)
            return
        L90:
            r4.firebase(r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17646l.isPro(lّٝۘ, int, boolean):void");
    }

    public final String loadAd(C12545l c12545l, String str) {
        String strFlattenToShortString = ((ComponentName) c12545l.amazon.f10245l).flattenToShortString();
        boolean z = c12545l.crashlytics;
        String strPro = z ? str : AbstractC9361l.pro(strFlattenToShortString, ":", str);
        HashMap map = this.firebase;
        if (!z) {
            ArrayList arrayList = this.subs;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                }
                if (((C12736l) arrayList.get(i)).crashlytics.equals(strPro)) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                Log.w("AxMediaRouter", AbstractC14814l.ads("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strPro + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            i3 = -1;
                            break;
                        }
                        if (((C12736l) arrayList.get(i3)).crashlytics.equals(str2)) {
                            break;
                        }
                        i3++;
                    }
                    if (i3 < 0) {
                        map.put(new C17879l(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        map.put(new C17879l(strFlattenToShortString, str), strPro);
        return strPro;
    }

    public final int metrica(C12736l c12736l, C13187l c13187l) {
        int iBilling = c12736l.billing(c13187l);
        if (iBilling != 0) {
            int i = iBilling & 1;
            HandlerC3504l handlerC3504l = this.yandex;
            if (i != 0) {
                handlerC3504l.loadAd(259, c12736l);
            }
            if ((iBilling & 2) != 0) {
                handlerC3504l.loadAd(260, c12736l);
            }
            if ((iBilling & 4) != 0) {
                handlerC3504l.loadAd(261, c12736l);
            }
        }
        return iBilling;
    }

    public final C12736l mopub() {
        C12736l c12736l = this.amazon;
        if (c12736l != null) {
            return c12736l;
        }
        C8339l.smaato("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final ArrayList purchase() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.isPro.values().iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        return arrayList;
    }

    public final void remoteconfig() {
        C12736l c12736l = this.amazon;
        if (c12736l == null) {
            C0554l c0554l = this.applovin;
            if (c0554l != null) {
                c0554l.advert();
                return;
            }
            return;
        }
        int i = c12736l.startapp;
        C7221l c7221l = this.vip;
        c7221l.f15049l = i;
        c7221l.f15048l = c12736l.adcel;
        c7221l.f15052l = c12736l.loadAd();
        c7221l.f15051l = this.amazon.remoteconfig;
        if (admob() && this.amazon.yandex() == this.ads) {
            c7221l.f15053l = C3288l.subs(this.purchase);
        } else {
            c7221l.f15053l = null;
        }
        Iterator it = this.remoteconfig.iterator();
        if (it.hasNext()) {
            throw AbstractC15560l.adcel(it);
        }
        C0554l c0554l2 = this.applovin;
        if (c0554l2 != null) {
            C12736l c12736l2 = this.amazon;
            C12736l c12736l3 = this.license;
            if (c12736l3 == null) {
                C8339l.smaato("There is no default route.  The media router has not yet been fully initialized.");
                return;
            }
            if (c12736l2 == c12736l3 || c12736l2 == this.pro) {
                c0554l2.advert();
                return;
            }
            int i2 = c7221l.f15052l == 1 ? 2 : 0;
            int i3 = c7221l.f15048l;
            int i4 = c7221l.f15049l;
            String str = (String) c7221l.f15053l;
            C0554l c0554l3 = (C0554l) c0554l2.f1958l;
            if (c0554l3 != null) {
                C2934l c2934l = (C2934l) c0554l2.f1957l;
                if (c2934l != null && i2 == 0 && i3 == 0) {
                    c2934l.f6389l = i4;
                    AbstractC11234l.yandex(c2934l.crashlytics(), i4);
                } else {
                    C2934l c2934l2 = new C2934l(c0554l2, i2, i3, i4, str);
                    c0554l2.f1957l = c2934l2;
                    ((C7272l) c0554l3.f1958l).yandex.setPlaybackToRemote(c2934l2.crashlytics());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:113:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:49:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x014a  */
    /* JADX WARN: Code duplicated, block: B:80:0x015f  */
    public final void smaato() {
        long j;
        int i;
        boolean z;
        int i2;
        C15053l c15053l = new C15053l();
        C3071l c3071l = this.tapsense;
        long j2 = 0;
        c3071l.f6603l = 0L;
        int i3 = 0;
        c3071l.f6604l = false;
        c3071l.f6602l = SystemClock.elapsedRealtime();
        ((Handler) c3071l.f6606l).removeCallbacks((RunnableC11297l) c3071l.f6605l);
        ArrayList arrayList = this.admob;
        int size = arrayList.size();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            size--;
            boolean z3 = this.startapp;
            if (size < 0) {
                long j3 = j2;
                if (c3071l.f6604l) {
                    long j4 = c3071l.f6603l;
                    if (j4 > j3) {
                        ((Handler) c3071l.f6606l).postDelayed((RunnableC11297l) c3071l.f6605l, j4);
                    }
                }
                boolean z4 = c3071l.f6604l;
                this.premium = i4;
                C16710l c16710lFirebase = z2 ? c15053l.firebase() : C16710l.crashlytics;
                C16710l c16710lFirebase2 = c15053l.firebase();
                if (admob()) {
                    C4658l c4658l = this.signatures;
                    if (c4658l != null) {
                        c4658l.yandex();
                        if (!c4658l.loadAd.equals(c16710lFirebase2) || this.signatures.loadAd() != z4) {
                            c16710lFirebase2.yandex();
                            if (c16710lFirebase2.loadAd.isEmpty() || z4) {
                                this.signatures = new C4658l(c16710lFirebase2, z4);
                            } else if (this.signatures != null) {
                                this.signatures = null;
                            }
                            this.ads.mopub(this.signatures);
                        }
                    } else {
                        c16710lFirebase2.yandex();
                        if (c16710lFirebase2.loadAd.isEmpty()) {
                            this.signatures = new C4658l(c16710lFirebase2, z4);
                            this.ads.mopub(this.signatures);
                        } else {
                            this.signatures = new C4658l(c16710lFirebase2, z4);
                            this.ads.mopub(this.signatures);
                        }
                    }
                }
                C4658l c4658l2 = this.isVip;
                if (c4658l2 != null) {
                    c4658l2.yandex();
                    if (c4658l2.loadAd.equals(c16710lFirebase) && this.isVip.loadAd() == z4) {
                        return;
                    }
                }
                c16710lFirebase.yandex();
                if (!c16710lFirebase.loadAd.isEmpty() || z4) {
                    this.isVip = new C4658l(c16710lFirebase, z4);
                } else if (this.isVip == null) {
                    return;
                } else {
                    this.isVip = null;
                }
                if (z2 && !z4 && z3) {
                    Log.i("AxMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                Iterator it = this.smaato.iterator();
                while (it.hasNext()) {
                    AbstractC3621l abstractC3621l = ((C12545l) it.next()).yandex;
                    if (abstractC3621l != this.ads) {
                        abstractC3621l.mopub(this.isVip);
                    }
                }
                return;
            }
            C9961l c9961l = (C9961l) ((WeakReference) arrayList.get(size)).get();
            if (c9961l == null) {
                arrayList.remove(size);
            } else {
                ArrayList arrayList2 = c9961l.loadAd;
                int size2 = arrayList2.size();
                i4 += size2;
                int i5 = i3;
                while (i5 < size2) {
                    C11179l c11179l = (C11179l) arrayList2.get(i5);
                    C16710l c16710l = c11179l.crashlytics;
                    if (c16710l == null) {
                        C8339l.metrica("selector must not be null");
                        return;
                    }
                    ArrayList arrayListLoadAd = c16710l.loadAd();
                    if (!arrayListLoadAd.isEmpty()) {
                        Iterator it2 = arrayListLoadAd.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                j = j2;
                                break;
                            }
                            j = j2;
                            String str = (String) it2.next();
                            if (str == null) {
                                C8339l.metrica("category must not be null");
                                break;
                            }
                            if (((ArrayList) c15053l.f29576l) == null) {
                                c15053l.f29576l = new ArrayList();
                            }
                            if (!((ArrayList) c15053l.f29576l).contains(str)) {
                                ((ArrayList) c15053l.f29576l).add(str);
                            }
                            j2 = j;
                        }
                    } else {
                        j = j2;
                        break;
                    }
                    int i6 = (c11179l.amazon & 1) != 0 ? 1 : i3;
                    ArrayList arrayList3 = arrayList;
                    long j5 = c11179l.purchase;
                    if (i6 == 0) {
                        c3071l.getClass();
                    } else {
                        long j6 = c3071l.f6602l;
                        if (j6 - j5 < 30000) {
                            i = i6;
                            c3071l.f6603l = Math.max(c3071l.f6603l, (j5 + 30000) - j6);
                            z = true;
                            c3071l.f6604l = true;
                        }
                        if (i != 0) {
                            z2 = z;
                        }
                        i2 = c11179l.amazon;
                        if ((i2 & 4) != 0 && !z3) {
                            z2 = z;
                        }
                        if ((i2 & 8) != 0) {
                            z2 = z;
                        }
                        i5++;
                        arrayList = arrayList3;
                        j2 = j;
                        i3 = 0;
                    }
                    i = i6;
                    z = true;
                    if (i != 0) {
                        z2 = z;
                    }
                    i2 = c11179l.amazon;
                    if ((i2 & 4) != 0) {
                        z2 = z;
                    }
                    if ((i2 & 8) != 0) {
                        z2 = z;
                    }
                    i5++;
                    arrayList = arrayList3;
                    j2 = j;
                    i3 = 0;
                }
            }
            arrayList = arrayList;
            j2 = j2;
            i3 = 0;
        }
    }

    public final void startapp(boolean z) {
        C12736l c12736l = this.license;
        if (c12736l != null && !c12736l.amazon()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.license);
            this.license = null;
        }
        C12736l c12736l2 = this.license;
        C14633l c14633l = this.subscription;
        ArrayList<C12736l> arrayList = this.subs;
        if (c12736l2 == null) {
            for (C12736l c12736l3 : arrayList) {
                if (c12736l3.yandex() == c14633l && c12736l3.loadAd.equals("DEFAULT_ROUTE") && c12736l3.amazon()) {
                    this.license = c12736l3;
                    Log.i("AxMediaRouter", "Found default route: " + this.license);
                    break;
                }
            }
        }
        C12736l c12736l4 = this.pro;
        if (c12736l4 != null && !c12736l4.amazon()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.pro);
            this.pro = null;
        }
        if (this.pro == null) {
            for (C12736l c12736l5 : arrayList) {
                if (c12736l5.yandex() == c14633l && c12736l5.admob("android.media.intent.category.LIVE_AUDIO") && !c12736l5.admob("android.media.intent.category.LIVE_VIDEO") && c12736l5.amazon()) {
                    this.pro = c12736l5;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.pro);
                    break;
                }
            }
        }
        C12736l c12736l6 = this.amazon;
        if (c12736l6 == null || !c12736l6.mopub) {
            Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.amazon);
            firebase(crashlytics(), 0, true);
            return;
        }
        if (z) {
            subs();
            remoteconfig();
        }
    }

    public final void subs() {
        AbstractC16531l abstractC16531lAmazon;
        if (this.amazon.license.isEmpty()) {
            return;
        }
        List<C12736l> listUnmodifiableList = DesugarCollections.unmodifiableList(this.amazon.license);
        HashSet hashSet = new HashSet();
        Iterator it = listUnmodifiableList.iterator();
        while (it.hasNext()) {
            hashSet.add(((C12736l) it.next()).crashlytics);
        }
        HashMap map = this.loadAd;
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains(entry.getKey())) {
                AbstractC16531l abstractC16531l = (AbstractC16531l) entry.getValue();
                abstractC16531l.admob(0);
                abstractC16531l.amazon();
                it2.remove();
            }
        }
        for (C12736l c12736l : listUnmodifiableList) {
            if (!map.containsKey(c12736l.crashlytics) && (abstractC16531lAmazon = c12736l.yandex().amazon(c12736l.loadAd, this.amazon.loadAd)) != null) {
                abstractC16531lAmazon.purchase();
                map.put(c12736l.crashlytics, abstractC16531lAmazon);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0038  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:68:0x0187  */
    /* JADX WARN: Instruction removed from duplicated block: B:67:0x0178, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:68:0x0187, please report this as an issue */
    public final void vip(C12545l c12545l, C4300l c4300l) {
        boolean z;
        String str;
        int i;
        Iterator it;
        boolean z2;
        C4300l c4300l2 = c12545l.purchase;
        ArrayList arrayList = c12545l.loadAd;
        if (c4300l2 != c4300l) {
            c12545l.purchase = c4300l;
            ArrayList arrayList2 = this.subs;
            HandlerC3504l handlerC3504l = this.yandex;
            if (c4300l != null) {
                List list = c4300l.loadAd;
                int size = list.size();
                int i2 = 0;
                while (true) {
                    if (i2 < size) {
                        C13187l c13187l = (C13187l) list.get(i2);
                        if (c13187l != null && c13187l.purchase()) {
                            i2++;
                        } else if (c4300l != this.subscription.f7554l) {
                            z = false;
                            if (c4300l != null) {
                                str = "Ignoring invalid provider descriptor: " + c4300l;
                            } else {
                                str = "Ignoring null provider descriptor from " + ((ComponentName) c12545l.amazon.f10245l);
                            }
                            Log.w("AxMediaRouter", str);
                            i = 0;
                        }
                    }
                    ArrayList<C17879l> arrayList3 = new ArrayList();
                    ArrayList<C17879l> arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    int i3 = 0;
                    boolean z3 = false;
                    while (it2.hasNext()) {
                        C13187l c13187l2 = (C13187l) it2.next();
                        if (c13187l2 == null || !c13187l2.purchase()) {
                            it = it2;
                            z2 = z3;
                            Log.w("AxMediaRouter", "Ignoring invalid route descriptor: " + c13187l2);
                        } else {
                            String strAmazon = c13187l2.amazon();
                            int size2 = arrayList.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size2) {
                                    i4 = -1;
                                    break;
                                } else if (((C12736l) arrayList.get(i4)).loadAd.equals(strAmazon)) {
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                            if (i4 < 0) {
                                it = it2;
                                z2 = z3;
                                C12736l c12736l = new C12736l(c12545l, strAmazon, loadAd(c12545l, strAmazon), c13187l2.yandex.getBoolean("isSystemRoute", false));
                                int i5 = i3 + 1;
                                arrayList.add(i3, c12736l);
                                arrayList2.add(c12736l);
                                if (c13187l2.crashlytics().isEmpty()) {
                                    c12736l.billing(c13187l2);
                                    handlerC3504l.loadAd(257, c12736l);
                                } else {
                                    arrayList3.add(new C17879l(c12736l, c13187l2));
                                }
                                i3 = i5;
                            } else {
                                it = it2;
                                z2 = z3;
                                if (i4 < i3) {
                                    Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: " + c13187l2);
                                } else {
                                    C12736l c12736l2 = (C12736l) arrayList.get(i4);
                                    int i6 = i3 + 1;
                                    Collections.swap(arrayList, i4, i3);
                                    if (!c13187l2.crashlytics().isEmpty()) {
                                        arrayList4.add(new C17879l(c12736l2, c13187l2));
                                    } else if (metrica(c12736l2, c13187l2) != 0 && c12736l2 == this.amazon) {
                                        i3 = i6;
                                        z2 = true;
                                    }
                                    i3 = i6;
                                }
                            }
                        }
                        it2 = it;
                        z3 = z2;
                    }
                    boolean z4 = z3;
                    for (C17879l c17879l : arrayList3) {
                        C12736l c12736l3 = (C12736l) c17879l.yandex;
                        c12736l3.billing((C13187l) c17879l.loadAd);
                        handlerC3504l.loadAd(257, c12736l3);
                    }
                    boolean z5 = z4;
                    for (C17879l c17879l2 : arrayList4) {
                        C12736l c12736l4 = (C12736l) c17879l2.yandex;
                        if (metrica(c12736l4, (C13187l) c17879l2.loadAd) != 0 && c12736l4 == this.amazon) {
                            z5 = true;
                        }
                    }
                    z = z5;
                    i = i3;
                }
            } else {
                z = false;
                if (c4300l != null) {
                    str = "Ignoring invalid provider descriptor: " + c4300l;
                } else {
                    str = "Ignoring null provider descriptor from " + ((ComponentName) c12545l.amazon.f10245l);
                }
                Log.w("AxMediaRouter", str);
                i = 0;
            }
            for (int size3 = arrayList.size() - 1; size3 >= i; size3--) {
                C12736l c12736l5 = (C12736l) arrayList.get(size3);
                c12736l5.billing(null);
                arrayList2.remove(c12736l5);
            }
            startapp(z);
            for (int size4 = arrayList.size() - 1; size4 >= i; size4--) {
                handlerC3504l.loadAd(258, (C12736l) arrayList.remove(size4));
            }
            handlerC3504l.loadAd(515, c12545l);
        }
    }

    public final void yandex(AbstractC3621l abstractC3621l, boolean z) {
        if (amazon(abstractC3621l) == null) {
            C12545l c12545l = new C12545l(abstractC3621l, z);
            this.smaato.add(c12545l);
            this.yandex.loadAd(513, c12545l);
            vip(c12545l, abstractC3621l.f7554l);
            C9961l.loadAd();
            abstractC3621l.f7559l = this.metrica;
            abstractC3621l.mopub(this.isVip);
        }
    }
}

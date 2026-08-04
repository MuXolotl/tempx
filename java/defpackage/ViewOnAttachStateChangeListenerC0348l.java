package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٕؑۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0348l implements InterfaceC18325l, View.OnAttachStateChangeListener, Runnable {

    /* JADX INFO: renamed from: lؒٝؖ, reason: contains not printable characters */
    public boolean f1401l;

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public InterfaceC4500l f1402l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public long f1404l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final Cconst f1405l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final ViewTreeObserverOnGlobalLayoutListenerC13840l f1406l;

    /* JADX INFO: renamed from: lٍَؑ, reason: contains not printable characters */
    public long f1407l;

    /* JADX INFO: renamed from: lُٓٚ, reason: contains not printable characters */
    public C11873l f1410l;

    /* JADX INFO: renamed from: lٜٓٓ, reason: contains not printable characters */
    public C16977l f1411l;

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final C16977l f1413l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final C12463l f1409l = new C12463l();

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final long f1408l = 100;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public int f1412l = 1;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f1403l = true;

    public ViewOnAttachStateChangeListenerC0348l(ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l, Cconst cconst) {
        this.f1406l = viewTreeObserverOnGlobalLayoutListenerC13840l;
        this.f1405l = cconst;
        new Handler(Looper.getMainLooper());
        C16977l c16977l = AbstractC6903l.yandex;
        this.f1411l = c16977l;
        this.f1413l = new C16977l();
        this.f1410l = new C11873l(viewTreeObserverOnGlobalLayoutListenerC13840l.getSemanticsOwner().yandex(), c16977l);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0183  */
    /* JADX WARN: Code duplicated, block: B:33:0x0070  */
    public final void admob(int i, C18666l c18666l) {
        Function1 function1;
        C3865l c3865lAmazon;
        AutofillId autofillIdAmazon;
        C8896l c8896lYandex;
        C14099l c14099l;
        String strAdmob;
        Function1 function2;
        if (this.f1402l != null) {
            C13660l c13660l = c18666l.amazon.f13225l;
            Object objMopub = c13660l.mopub(AbstractC0424l.inmobi);
            if (objMopub == null) {
                objMopub = null;
            }
            Boolean bool = (Boolean) objMopub;
            if (this.f1412l == 1 && AbstractC8576l.yandex(bool, Boolean.TRUE)) {
                Object objMopub2 = c13660l.mopub(AbstractC16601l.remoteconfig);
                if (objMopub2 == null) {
                    objMopub2 = null;
                }
                C7629l c7629l = (C7629l) objMopub2;
                if (c7629l != null && (function2 = (Function1) c7629l.loadAd) != null) {
                }
            } else if (this.f1412l == 2 && AbstractC8576l.yandex(bool, Boolean.FALSE)) {
                Object objMopub3 = c13660l.mopub(AbstractC16601l.remoteconfig);
                if (objMopub3 == null) {
                    objMopub3 = null;
                }
                C7629l c7629l2 = (C7629l) objMopub3;
                if (c7629l2 != null && (function1 = (Function1) c7629l2.loadAd) != null) {
                }
            }
            int i2 = c18666l.billing;
            InterfaceC4500l interfaceC4500l = this.f1402l;
            if (interfaceC4500l == null || Build.VERSION.SDK_INT < 29 || (c3865lAmazon = AbstractC17082l.amazon(this.f1406l)) == null) {
                c14099l = null;
            } else {
                C18666l c18666lSmaato = c18666l.smaato();
                int i3 = c18666l.billing;
                if (c18666lSmaato != null) {
                    autofillIdAmazon = ((C6498l) interfaceC4500l).loadAd(c18666lSmaato.billing);
                    if (autofillIdAmazon == null) {
                        c14099l = null;
                    }
                } else {
                    autofillIdAmazon = c3865lAmazon.amazon();
                }
                C14099l c14099lCrashlytics = ((C6498l) interfaceC4500l).crashlytics(autofillIdAmazon, i3);
                if (c14099lCrashlytics == null) {
                    c14099l = null;
                } else {
                    ViewStructure viewStructure = (ViewStructure) c14099lCrashlytics.f27460l;
                    C6264l c6264l = c18666l.amazon;
                    C4707l c4707l = AbstractC0424l.f1543for;
                    C13660l c13660l2 = c6264l.f13225l;
                    if (c13660l2.crashlytics(c4707l)) {
                        c14099l = null;
                    } else {
                        Bundle extras = viewStructure.getExtras();
                        if (extras != null) {
                            extras.putLong("android.view.contentcapture.EventTimestamp", this.f1407l);
                            extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
                        }
                        Object objMopub4 = c13660l2.mopub(AbstractC0424l.signatures);
                        if (objMopub4 == null) {
                            objMopub4 = null;
                        }
                        String str = (String) objMopub4;
                        if (str != null) {
                            viewStructure.setId(i3, null, null, str);
                        }
                        Object objMopub5 = c13660l2.mopub(AbstractC0424l.vip);
                        if (objMopub5 == null) {
                            objMopub5 = null;
                        }
                        if (((Boolean) objMopub5) != null) {
                            viewStructure.setClassName("android.widget.ViewGroup");
                        }
                        Object objMopub6 = c13660l2.mopub(AbstractC0424l.applovin);
                        if (objMopub6 == null) {
                            objMopub6 = null;
                        }
                        List list = (List) objMopub6;
                        if (list != null) {
                            viewStructure.setClassName("android.widget.TextView");
                            viewStructure.setText(AbstractC2066l.yandex(list, "\n", null, 62));
                        }
                        Object objMopub7 = c13660l2.mopub(AbstractC0424l.f1545package);
                        if (objMopub7 == null) {
                            objMopub7 = null;
                        }
                        C3625l c3625l = (C3625l) objMopub7;
                        if (c3625l != null) {
                            viewStructure.setClassName("android.widget.EditText");
                            viewStructure.setText(c3625l);
                        }
                        Object objMopub8 = c13660l2.mopub(AbstractC0424l.yandex);
                        if (objMopub8 == null) {
                            objMopub8 = null;
                        }
                        List list2 = (List) objMopub8;
                        if (list2 != null) {
                            viewStructure.setContentDescription(AbstractC2066l.yandex(list2, "\n", null, 62));
                        }
                        Object objMopub9 = c13660l2.mopub(AbstractC0424l.isVip);
                        if (objMopub9 == null) {
                            objMopub9 = null;
                        }
                        C6402l c6402l = (C6402l) objMopub9;
                        if (c6402l != null && (strAdmob = AbstractC4603l.admob(c6402l.yandex)) != null) {
                            viewStructure.setClassName(strAdmob);
                        }
                        C0327l c0327lBilling = AbstractC4603l.billing(c6264l);
                        if (c0327lBilling != null) {
                            C17555l c17555l = c0327lBilling.yandex;
                            C11090l c11090l = c17555l.loadAd;
                            InterfaceC13490l interfaceC13490l = c17555l.mopub;
                            viewStructure.setTextStyle(interfaceC13490l.mo873super() * interfaceC13490l.loadAd() * C1794l.crashlytics(c11090l.yandex.loadAd), 0, 0, 0);
                        }
                        AbstractC18026l abstractC18026lAmazon = c18666l.amazon();
                        if (abstractC18026lAmazon == null) {
                            c8896lYandex = C8896l.purchase;
                        } else {
                            AbstractC18026l abstractC18026l = abstractC18026lAmazon.mo2643l().f29462l ? abstractC18026lAmazon : null;
                            if (abstractC18026l != null) {
                                c8896lYandex = c18666l.yandex(abstractC18026l);
                            } else {
                                c8896lYandex = C8896l.purchase;
                            }
                        }
                        float f = c8896lYandex.yandex;
                        float f2 = c8896lYandex.loadAd;
                        viewStructure.setDimens((int) f, (int) f2, 0, 0, (int) (c8896lYandex.crashlytics - f), (int) (c8896lYandex.amazon - f2));
                        c14099l = c14099lCrashlytics;
                    }
                }
            }
            if (c14099l != null) {
                this.f1409l.yandex(new C4054l(i2, this.f1407l, 1, c14099l));
            }
            List listIsPro = C18666l.isPro(4, c18666l);
            int size = listIsPro.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = listIsPro.get(i5);
                if (loadAd().yandex(((C18666l) obj).billing)) {
                    admob(i4, (C18666l) obj);
                    Unit unit = Unit.INSTANCE;
                    i4++;
                }
            }
        }
    }

    public final void amazon() {
        Handler handler = this.f1406l.getHandler();
        if (handler == null || this.f1402l == null || this.f1401l) {
            return;
        }
        this.f1401l = true;
        long jUptimeMillis = (this.f1404l + this.f1408l) - SystemClock.uptimeMillis();
        if (jUptimeMillis <= 0) {
            handler.post(this);
        } else {
            handler.postDelayed(this, jUptimeMillis);
        }
    }

    public final void billing(int i, String str) {
        InterfaceC4500l interfaceC4500l;
        if (Build.VERSION.SDK_INT >= 29 && (interfaceC4500l = this.f1402l) != null) {
            C6498l c6498l = (C6498l) interfaceC4500l;
            AutofillId autofillIdLoadAd = c6498l.loadAd(i);
            if (autofillIdLoadAd == null) {
                throw AbstractC5020l.metrica("Invalid content capture ID");
            }
            c6498l.billing(autofillIdLoadAd, str);
        }
    }

    public final void crashlytics() {
        InterfaceC4500l interfaceC4500l = this.f1402l;
        if (interfaceC4500l != null && Build.VERSION.SDK_INT >= 29) {
            C12463l c12463l = this.f1409l;
            if (c12463l.firebase()) {
                Object[] objArr = c12463l.yandex;
                int i = c12463l.loadAd;
                for (int i2 = 0; i2 < i; i2++) {
                    C4054l c4054l = (C4054l) objArr[i2];
                    int iInmobi = AbstractC5020l.inmobi(c4054l.crashlytics);
                    if (iInmobi == 0) {
                        C14099l c14099l = c4054l.amazon;
                        if (c14099l != null) {
                            ((C6498l) interfaceC4500l).amazon((ViewStructure) c14099l.f27460l);
                        }
                    } else {
                        if (iInmobi != 1) {
                            C18725l.billing();
                            return;
                        }
                        C6498l c6498l = (C6498l) interfaceC4500l;
                        AutofillId autofillIdLoadAd = c6498l.loadAd(c4054l.yandex);
                        if (autofillIdLoadAd != null) {
                            c6498l.purchase(autofillIdLoadAd);
                        }
                    }
                }
                ((C6498l) interfaceC4500l).yandex();
                c12463l.billing();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005b A[LOOP:0: B:5:0x0017->B:15:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[EDGE_INSN: B:19:0x005e->B:16:0x005e BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005b], SYNTHETIC] */
    public final void isPro() {
        C16977l c16977l = this.f1413l;
        c16977l.crashlytics();
        AbstractC14183l abstractC14183lLoadAd = loadAd();
        int[] iArr = abstractC14183lLoadAd.loadAd;
        Object[] objArr = abstractC14183lLoadAd.crashlytics;
        long[] jArr = abstractC14183lLoadAd.yandex;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            c16977l.subs(iArr[i4], new C11873l(((C13874l) objArr[i4]).yandex, loadAd()));
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        this.f1410l = new C11873l(this.f1406l.getSemanticsOwner().yandex(), loadAd());
    }

    public final AbstractC14183l loadAd() {
        if (this.f1403l) {
            this.f1403l = false;
            this.f1411l = AbstractC14425l.amazon(this.f1406l.getSemanticsOwner(), C11192l.f22539l);
            this.f1407l = System.currentTimeMillis();
        }
        return this.f1411l;
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStart(InterfaceC3177l interfaceC3177l) {
        this.f1402l = (InterfaceC4500l) this.f1405l.invoke();
        admob(-1, this.f1406l.getSemanticsOwner().yandex());
        crashlytics();
    }

    @Override // defpackage.InterfaceC18325l
    public final void onStop(InterfaceC3177l interfaceC3177l) {
        subs(this.f1406l.getSemanticsOwner().yandex());
        crashlytics();
        this.f1402l = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Handler handler = this.f1406l.getHandler();
        if (handler != null) {
            handler.removeCallbacks(this);
        }
        this.f1402l = null;
    }

    public final void purchase(C18666l c18666l, C11873l c11873l) {
        int i = 0;
        C17671l c17671l = new C17671l(c11873l, this, i);
        c18666l.getClass();
        List listIsPro = C18666l.isPro(4, c18666l);
        int size = listIsPro.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = listIsPro.get(i3);
            if (loadAd().yandex(((C18666l) obj).billing)) {
                c17671l.invoke(Integer.valueOf(i2), obj);
                i2++;
            }
        }
        List listIsPro2 = C18666l.isPro(4, c18666l);
        int size2 = listIsPro2.size();
        while (i < size2) {
            C18666l c18666l2 = (C18666l) listIsPro2.get(i);
            AbstractC14183l abstractC14183lLoadAd = loadAd();
            int i4 = c18666l2.billing;
            if (abstractC14183lLoadAd.yandex(i4)) {
                C16977l c16977l = this.f1413l;
                if (c16977l.yandex(i4)) {
                    Object objLoadAd = c16977l.loadAd(i4);
                    if (objLoadAd == null) {
                        throw AbstractC5020l.metrica("node not present in pruned tree before this change");
                    }
                    purchase(c18666l2, (C11873l) objLoadAd);
                } else {
                    continue;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0074  */
    @Override // java.lang.Runnable
    public final void run() {
        long[] jArr;
        ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = this.f1406l;
        this.f1404l = SystemClock.uptimeMillis();
        int i = 0;
        this.f1401l = false;
        if (this.f1402l != null) {
            crashlytics();
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                viewTreeObserverOnGlobalLayoutListenerC13840l.tapsense(true);
                C16977l c16977l = this.f1413l;
                int[] iArr = c16977l.loadAd;
                long[] jArr2 = c16977l.yandex;
                int length = jArr2.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr2[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            int i4 = i;
                            while (i4 < i3) {
                                if ((255 & j) < 128) {
                                    int i5 = iArr[(i2 << 3) + i4];
                                    if (!loadAd().yandex(i5)) {
                                        this.f1409l.yandex(new C4054l(i5, this.f1407l, 2, null));
                                        amazon();
                                    }
                                }
                                j >>= 8;
                                i4++;
                                jArr2 = jArr2;
                            }
                            jArr = jArr2;
                            if (i3 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr2;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                        jArr2 = jArr;
                        i = 0;
                    }
                }
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    purchase(viewTreeObserverOnGlobalLayoutListenerC13840l.getSemanticsOwner().yandex(), this.f1410l);
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                    yandex(loadAd());
                    isPro();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    public final void subs(C18666l c18666l) {
        if (this.f1402l != null) {
            this.f1409l.yandex(new C4054l(c18666l.billing, this.f1407l, 2, null));
            List listIsPro = C18666l.isPro(4, c18666l);
            int size = listIsPro.size();
            for (int i = 0; i < size; i++) {
                subs((C18666l) listIsPro.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0173 A[EDGE_INSN: B:105:0x0173->B:80:0x0173 BREAK  A[LOOP:4: B:48:0x00e9->B:79:0x016c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00cb A[LOOP:2: B:21:0x006f->B:42:0x00cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x016c A[LOOP:4: B:48:0x00e9->B:79:0x016c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x00d4 A[EDGE_INSN: B:99:0x00d4->B:44:0x00d4 BREAK  A[LOOP:2: B:21:0x006f->B:42:0x00cb], SYNTHETIC] */
    public final void yandex(AbstractC14183l abstractC14183l) {
        int[] iArr;
        int[] iArr2;
        long j;
        char c;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        AbstractC14183l abstractC14183l2 = abstractC14183l;
        int[] iArr3 = abstractC14183l2.loadAd;
        long[] jArr = abstractC14183l2.yandex;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            long j5 = jArr[i3];
            char c2 = 7;
            long j6 = -9187201950435737472L;
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i4 = 8;
                int i5 = 8 - ((~(i3 - length)) >>> 31);
                int i6 = 0;
                while (i6 < i5) {
                    if ((j5 & 255) < 128) {
                        int i7 = iArr3[(i3 << 3) + i6];
                        c = c2;
                        C11873l c11873l = (C11873l) this.f1413l.loadAd(i7);
                        C13874l c13874l = (C13874l) abstractC14183l2.loadAd(i7);
                        C18666l c18666l = c13874l != null ? c13874l.yandex : null;
                        if (c18666l == null) {
                            throw AbstractC5020l.metrica("no value for specified key");
                        }
                        j2 = j6;
                        int i8 = c18666l.billing;
                        C13660l c13660l = c18666l.amazon.f13225l;
                        if (c11873l == null) {
                            Object[] objArr = c13660l.loadAd;
                            long[] jArr2 = c13660l.yandex;
                            int length2 = jArr2.length - 2;
                            iArr2 = iArr3;
                            if (length2 >= 0) {
                                int i9 = i4;
                                int i10 = 0;
                                while (true) {
                                    long j7 = jArr2[i10];
                                    j = j5;
                                    if ((((~j7) << c) & j7 & j2) != j2) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        for (int i12 = 0; i12 < i11; i12++) {
                                            if ((j7 & 255) < 128) {
                                                j4 = j7;
                                                C4707l c4707l = (C4707l) objArr[(i10 << 3) + i12];
                                                C4707l c4707l2 = AbstractC0424l.applovin;
                                                if (AbstractC8576l.yandex(c4707l, c4707l2)) {
                                                    Object objMopub = c13660l.mopub(c4707l2);
                                                    if (objMopub == null) {
                                                        objMopub = null;
                                                    }
                                                    List list = (List) objMopub;
                                                    billing(i8, String.valueOf(list != null ? (C3625l) AbstractC16901l.m4217extends(list) : null));
                                                }
                                            } else {
                                                j4 = j7;
                                            }
                                            j7 = j4 >> i9;
                                        }
                                        if (i11 != i9) {
                                            break;
                                        }
                                        if (i10 != length2) {
                                            break;
                                        }
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    } else if (i10 != length2) {
                                        break;
                                        break;
                                    } else {
                                        i10++;
                                        j5 = j;
                                        i9 = 8;
                                    }
                                }
                            } else {
                                j = j5;
                            }
                        } else {
                            iArr2 = iArr3;
                            j = j5;
                            Object[] objArr2 = c13660l.loadAd;
                            long[] jArr3 = c13660l.yandex;
                            int length3 = jArr3.length - 2;
                            if (length3 >= 0) {
                                long[] jArr4 = jArr3;
                                int i13 = 0;
                                while (true) {
                                    long j8 = jArr4[i13];
                                    long[] jArr5 = jArr4;
                                    i = i6;
                                    if ((((~j8) << c) & j8 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j8 & 255) < 128) {
                                                j3 = j8;
                                                C4707l c4707l3 = (C4707l) objArr2[(i13 << 3) + i15];
                                                C4707l c4707l4 = AbstractC0424l.applovin;
                                                if (AbstractC8576l.yandex(c4707l3, c4707l4)) {
                                                    Object objMopub2 = c11873l.yandex.f13225l.mopub(c4707l4);
                                                    if (objMopub2 == null) {
                                                        objMopub2 = null;
                                                    }
                                                    List list2 = (List) objMopub2;
                                                    C3625l c3625l = list2 != null ? (C3625l) AbstractC16901l.m4217extends(list2) : null;
                                                    Object objMopub3 = c13660l.mopub(c4707l4);
                                                    if (objMopub3 == null) {
                                                        objMopub3 = null;
                                                    }
                                                    List list3 = (List) objMopub3;
                                                    C3625l c3625l2 = list3 != null ? (C3625l) AbstractC16901l.m4217extends(list3) : null;
                                                    if (!AbstractC8576l.yandex(c3625l, c3625l2)) {
                                                        billing(i8, String.valueOf(c3625l2));
                                                    }
                                                }
                                            } else {
                                                j3 = j8;
                                            }
                                            i15++;
                                            j8 = j3 >> 8;
                                        }
                                        if (i14 != 8) {
                                            break;
                                        }
                                        if (i13 != length3) {
                                            break;
                                        }
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    } else if (i13 != length3) {
                                        break;
                                        break;
                                    } else {
                                        i13++;
                                        i6 = i;
                                        jArr4 = jArr5;
                                    }
                                }
                            }
                            i2 = 8;
                        }
                        i = i6;
                        i2 = 8;
                    } else {
                        iArr2 = iArr3;
                        j = j5;
                        c = c2;
                        j2 = j6;
                        i = i6;
                        i2 = i4;
                    }
                    j5 = j >> i2;
                    i6 = i + 1;
                    i4 = i2;
                    c2 = c;
                    j6 = j2;
                    iArr3 = iArr2;
                    abstractC14183l2 = abstractC14183l;
                }
                iArr = iArr3;
                if (i5 != i4) {
                    return;
                }
            } else {
                iArr = iArr3;
            }
            if (i3 == length) {
                return;
            }
            i3++;
            abstractC14183l2 = abstractC14183l;
            iArr3 = iArr;
        }
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void mopub() {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onDestroy(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onPause(InterfaceC3177l interfaceC3177l) {
    }

    @Override // defpackage.InterfaceC18325l
    public final /* synthetic */ void onResume(InterfaceC3177l interfaceC3177l) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}

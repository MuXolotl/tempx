package defpackage;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OverwritingInputMerger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: lُٙؔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C11120l {
    public final WorkDatabase admob;
    public final C3307l amazon;
    public final C6565l billing;
    public final String crashlytics;
    public final ArrayList firebase;
    public final C13664l isPro;
    public final Context loadAd;
    public final C5648l mopub;
    public final C12211l purchase;
    public final C0462l remoteconfig;
    public final String smaato;
    public final C9280l subs;
    public final C7718l yandex;

    public C11120l(C12714l c12714l) {
        C7718l c7718l = (C7718l) c12714l.f25076l;
        this.yandex = c7718l;
        this.loadAd = (Context) c12714l.f25073l;
        String str = c7718l.yandex;
        this.crashlytics = str;
        this.amazon = (C3307l) c12714l.f25074l;
        C12211l c12211l = (C12211l) c12714l.f25075l;
        this.purchase = c12211l;
        this.billing = c12211l.amazon;
        this.mopub = (C5648l) c12714l.f25072l;
        WorkDatabase workDatabase = (WorkDatabase) c12714l.f25077l;
        this.admob = workDatabase;
        this.subs = workDatabase.Signature();
        this.isPro = workDatabase.startapp();
        ArrayList arrayList = (ArrayList) c12714l.f25078l;
        this.firebase = arrayList;
        this.smaato = AbstractC0653l.ads(AbstractC5020l.isVip("Work [ id=", str, ", tags={ "), AbstractC16901l.m4210case(arrayList, ",", null, null, null, 62), " } ]");
        this.remoteconfig = AbstractC11174l.yandex();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    public static final Object yandex(final C11120l c11120l, AbstractC0283l abstractC0283l) throws Throwable {
        C17952l c17952l;
        OverwritingInputMerger overwritingInputMerger;
        C4279l c4279lYandex;
        Object c12075l;
        String str = c11120l.smaato;
        String str2 = c11120l.crashlytics;
        C3307l c3307l = c11120l.amazon;
        WorkDatabase workDatabase = c11120l.admob;
        C12211l c12211l = c11120l.purchase;
        C15617l c15617l = c12211l.remoteconfig;
        C7718l c7718l = c11120l.yandex;
        if (abstractC0283l instanceof C17952l) {
            c17952l = (C17952l) abstractC0283l;
            int i = c17952l.f34941l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c17952l.f34941l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c17952l = new C17952l(c11120l, abstractC0283l);
            }
        } else {
            c17952l = new C17952l(c11120l, abstractC0283l);
        }
        Object objFirebase = c17952l.f34940l;
        int i2 = c17952l.f34941l;
        try {
            if (i2 == 0) {
                AbstractC2829l.crashlytics(objFirebase);
                C2782l c2782l = c12211l.purchase;
                c15617l.getClass();
                boolean zAdmob = AbstractC15011l.admob();
                String str3 = c7718l.ad;
                String str4 = c7718l.crashlytics;
                String str5 = c7718l.amazon;
                if (zAdmob && str3 != null) {
                    AbstractC15011l.loadAd(c7718l.hashCode(), str3);
                }
                final int i3 = 0;
                if (((Boolean) workDatabase.remoteconfig(new Callable(c11120l) { // from class: lْۖؖ
                    public final /* synthetic */ C11120l loadAd;

                    {
                        this.loadAd = c11120l;
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        int i4 = i3;
                        EnumC9176l enumC9176l = EnumC9176l.f18878l;
                        C11120l c11120l2 = this.loadAd;
                        switch (i4) {
                            case 0:
                                C7718l c7718l2 = c11120l2.yandex;
                                EnumC9176l enumC9176l2 = c7718l2.loadAd;
                                String str6 = c7718l2.crashlytics;
                                if (enumC9176l2 != enumC9176l) {
                                    String str7 = AbstractC6037l.yandex;
                                    C14513l.tapsense().vip(str7, str6 + " is not in ENQUEUED state. Nothing more to do");
                                    return Boolean.TRUE;
                                }
                                if (c7718l2.crashlytics() || (c7718l2.loadAd == enumC9176l && c7718l2.firebase > 0)) {
                                    c11120l2.billing.getClass();
                                    if (System.currentTimeMillis() < c7718l2.yandex()) {
                                        C14513l.tapsense().vip(AbstractC6037l.yandex, "Delaying execution for " + str6 + " because it is being executed before schedule.");
                                        return Boolean.TRUE;
                                    }
                                }
                                return Boolean.FALSE;
                            default:
                                C9280l c9280l = c11120l2.subs;
                                String str8 = c11120l2.crashlytics;
                                boolean z = false;
                                if (c9280l.crashlytics(str8) == enumC9176l) {
                                    c9280l.billing(EnumC9176l.f18877l, str8);
                                    ((Number) AbstractC2021l.purchase(c9280l.yandex, false, true, new C6789l(str8, 2))).intValue();
                                    c9280l.mopub(-256, str8);
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                        }
                    }
                })).booleanValue()) {
                    return new C8557l();
                }
                if (c7718l.crashlytics()) {
                    c4279lYandex = c7718l.purchase;
                    zAdmob = zAdmob;
                } else {
                    c12211l.billing.getClass();
                    String str6 = AbstractC9048l.yandex;
                    try {
                        overwritingInputMerger = (OverwritingInputMerger) Class.forName(str5).getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception e) {
                        C14513l.tapsense().ads(AbstractC9048l.yandex, "Trouble instantiating ".concat(str5), e);
                        overwritingInputMerger = null;
                    }
                    if (overwritingInputMerger == null) {
                        C14513l.tapsense().startapp(AbstractC6037l.yandex, "Could not create Input Merger ".concat(str5));
                        return new C5512l();
                    }
                    ArrayList arrayListM4232new = AbstractC16901l.m4232new(Collections.singletonList(c7718l.purchase), (List) AbstractC2021l.purchase(c11120l.subs.yandex, true, false, new C6789l(str2, 1)));
                    C5183l c5183l = new C5183l(0);
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Iterator it = arrayListM4232new.iterator();
                    while (it.hasNext()) {
                        linkedHashMap.putAll(DesugarCollections.unmodifiableMap(((C4279l) it.next()).yandex));
                    }
                    c5183l.amazon(linkedHashMap);
                    c4279lYandex = c5183l.yandex();
                }
                UUID uuidFromString = UUID.fromString(str2);
                ArrayList arrayList = c11120l.firebase;
                int i4 = c7718l.firebase;
                ExecutorService executorService = c12211l.yandex;
                C16552l c16552l = c12211l.loadAd;
                C8742l c8742l = new C8742l(workDatabase, c11120l.mopub, c3307l);
                WorkerParameters workerParameters = new WorkerParameters();
                workerParameters.yandex = uuidFromString;
                workerParameters.loadAd = c4279lYandex;
                new HashSet(arrayList);
                workerParameters.crashlytics = i4;
                workerParameters.amazon = executorService;
                workerParameters.purchase = c16552l;
                workerParameters.billing = c3307l;
                workerParameters.mopub = c2782l;
                try {
                    AbstractC16137l abstractC16137lMetrica = c2782l.metrica(c11120l.loadAd, str4, workerParameters);
                    final int i5 = 1;
                    abstractC16137lMetrica.amazon = true;
                    InterfaceC7042l interfaceC7042l = (InterfaceC7042l) c17952l.f1295l.mo245l(C1083l.f2996l);
                    interfaceC7042l.mo2154l(new C5449l(abstractC16137lMetrica, zAdmob, str3, c11120l, 2));
                    if (!((Boolean) workDatabase.remoteconfig(new Callable(c11120l) { // from class: lْۖؖ
                        public final /* synthetic */ C11120l loadAd;

                        {
                            this.loadAd = c11120l;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i6 = i5;
                            EnumC9176l enumC9176l = EnumC9176l.f18878l;
                            C11120l c11120l2 = this.loadAd;
                            switch (i6) {
                                case 0:
                                    C7718l c7718l2 = c11120l2.yandex;
                                    EnumC9176l enumC9176l2 = c7718l2.loadAd;
                                    String str7 = c7718l2.crashlytics;
                                    if (enumC9176l2 != enumC9176l) {
                                        String str8 = AbstractC6037l.yandex;
                                        C14513l.tapsense().vip(str8, str7 + " is not in ENQUEUED state. Nothing more to do");
                                        return Boolean.TRUE;
                                    }
                                    if (c7718l2.crashlytics() || (c7718l2.loadAd == enumC9176l && c7718l2.firebase > 0)) {
                                        c11120l2.billing.getClass();
                                        if (System.currentTimeMillis() < c7718l2.yandex()) {
                                            C14513l.tapsense().vip(AbstractC6037l.yandex, "Delaying execution for " + str7 + " because it is being executed before schedule.");
                                            return Boolean.TRUE;
                                        }
                                    }
                                    return Boolean.FALSE;
                                default:
                                    C9280l c9280l = c11120l2.subs;
                                    String str9 = c11120l2.crashlytics;
                                    boolean z = false;
                                    if (c9280l.crashlytics(str9) == enumC9176l) {
                                        c9280l.billing(EnumC9176l.f18877l, str9);
                                        ((Number) AbstractC2021l.purchase(c9280l.yandex, false, true, new C6789l(str9, 2))).intValue();
                                        c9280l.mopub(-256, str9);
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                            }
                        }
                    })).booleanValue()) {
                        return new C8557l();
                    }
                    if (interfaceC7042l.isCancelled()) {
                        return new C8557l();
                    }
                    AbstractC1872l abstractC1872lBilling = AbstractC5103l.billing(c3307l.amazon);
                    C0932l c0932l = new C0932l(c11120l, abstractC16137lMetrica, c8742l, (InterfaceC14029l) null, 17);
                    c17952l.f34941l = 1;
                    objFirebase = AbstractC10999l.firebase(abstractC1872lBilling, c0932l, c17952l);
                    c12075l = EnumC9342l.f19165l;
                    if (objFirebase != c12075l) {
                    }
                    return c12075l;
                } catch (Throwable unused) {
                    String str7 = AbstractC6037l.yandex;
                    C14513l.tapsense().startapp(str7, "Could not create Worker " + str4);
                    return new C5512l();
                }
            }
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC2829l.crashlytics(objFirebase);
            c12075l = new C12075l((AbstractC17496l) objFirebase);
            return c12075l;
        } catch (CancellationException e2) {
            String str8 = AbstractC6037l.yandex;
            C14513l c14513lTapsense = C14513l.tapsense();
            String strFirebase = AbstractC12900l.firebase(str, " was cancelled");
            if (c14513lTapsense.f28392l <= 4) {
                Log.i(str8, strFirebase, e2);
            }
            throw e2;
        } catch (Throwable th) {
            String str9 = AbstractC6037l.yandex;
            C14513l.tapsense().ads(str9, str + " failed because it threw an exception/error", th);
            return new C5512l();
        }
    }

    public final void amazon(AbstractC17496l abstractC17496l) {
        String str = this.crashlytics;
        ArrayList arrayListMetrica = AbstractC14055l.metrica(str);
        while (true) {
            boolean zIsEmpty = arrayListMetrica.isEmpty();
            C9280l c9280l = this.subs;
            if (zIsEmpty) {
                C4279l c4279l = ((C18702l) abstractC17496l).yandex;
                AbstractC2021l.purchase(c9280l.yandex, false, true, new C5568l(str, this.yandex.license, 2));
                AbstractC2021l.purchase(c9280l.yandex, false, true, new C15575l(c4279l, str, 17));
                return;
            }
            String str2 = (String) AbstractC3984l.isVip(arrayListMetrica);
            if (c9280l.crashlytics(str2) != EnumC9176l.f18881l) {
                c9280l.billing(EnumC9176l.f18880l, str2);
            }
            arrayListMetrica.addAll(this.isPro.yandex(str2));
        }
    }

    public final void crashlytics() {
        this.billing.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        C9280l c9280l = this.subs;
        AbstractC15781l abstractC15781l = c9280l.yandex;
        String str = this.crashlytics;
        AbstractC2021l.purchase(abstractC15781l, false, true, new C16143l(jCurrentTimeMillis, str, 1));
        c9280l.billing(EnumC9176l.f18878l, str);
        ((Number) AbstractC2021l.purchase(c9280l.yandex, false, true, new C6908l(str, 29))).intValue();
        AbstractC2021l.purchase(c9280l.yandex, false, true, new C5568l(str, this.yandex.license, 2));
        AbstractC2021l.purchase(c9280l.yandex, false, true, new C6789l(str, 0));
        c9280l.purchase(-1L, str);
    }

    public final void loadAd(int i) {
        C9280l c9280l = this.subs;
        EnumC9176l enumC9176l = EnumC9176l.f18878l;
        String str = this.crashlytics;
        c9280l.billing(enumC9176l, str);
        this.billing.getClass();
        AbstractC2021l.purchase(c9280l.yandex, false, true, new C16143l(System.currentTimeMillis(), str, 1));
        AbstractC2021l.purchase(c9280l.yandex, false, true, new C5568l(str, this.yandex.license, 2));
        c9280l.purchase(-1L, str);
        c9280l.mopub(i, str);
    }
}

package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: lٌؙؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C6267l implements InterfaceC16983l {
    public static final C9426l remoteconfig;
    public static final C9426l smaato = AbstractC15929l.yandex(new C6346l(4, null));
    public final C8688l admob;
    public final InterfaceC15897l amazon;
    public final C1276l billing;
    public final C16047l crashlytics;
    public final LinkedHashMap firebase;
    public final C8688l isPro;
    public final InterfaceC15897l loadAd;
    public volatile boolean mopub;
    public final C14338l purchase;
    public final C8688l subs;
    public final InterfaceC15897l yandex;

    static {
        C9426l c9426l = new C9426l();
        c9426l.ads(null);
        remoteconfig = c9426l;
    }

    public C6267l(InterfaceC15897l interfaceC15897l, InterfaceC15897l interfaceC15897l2, C16047l c16047l, InterfaceC15897l interfaceC15897l3, C14338l c14338l, C1276l c1276l) {
        this.yandex = interfaceC15897l;
        this.loadAd = interfaceC15897l2;
        this.crashlytics = c16047l;
        this.amazon = interfaceC15897l3;
        this.purchase = c14338l;
        this.billing = c1276l;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Configured " + this);
        }
        final int i = 0;
        this.admob = new C8688l(new Function0(this) { // from class: lِٟؔ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C6267l f5562l;

            {
                this.f5562l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                C6267l c6267l = this.f5562l;
                switch (i2) {
                    case 0:
                        return (InterfaceC17552l) c6267l.yandex.get();
                    case 1:
                        return (C4271l) c6267l.amazon.get();
                    default:
                        return (C2748l) c6267l.loadAd.get();
                }
            }
        });
        final int i2 = 1;
        this.subs = new C8688l(new Function0(this) { // from class: lِٟؔ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C6267l f5562l;

            {
                this.f5562l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                C6267l c6267l = this.f5562l;
                switch (i3) {
                    case 0:
                        return (InterfaceC17552l) c6267l.yandex.get();
                    case 1:
                        return (C4271l) c6267l.amazon.get();
                    default:
                        return (C2748l) c6267l.loadAd.get();
                }
            }
        });
        final int i3 = 2;
        this.isPro = new C8688l(new Function0(this) { // from class: lِٟؔ

            /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
            public final /* synthetic */ C6267l f5562l;

            {
                this.f5562l = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i4 = i3;
                C6267l c6267l = this.f5562l;
                switch (i4) {
                    case 0:
                        return (InterfaceC17552l) c6267l.yandex.get();
                    case 1:
                        return (C4271l) c6267l.amazon.get();
                    default:
                        return (C2748l) c6267l.loadAd.get();
                }
            }
        });
        this.firebase = new LinkedHashMap();
    }

    public static C13467l remoteconfig(LinkedHashMap linkedHashMap) {
        C13467l c13467l = new C13467l((C10685l) null, (LinkedHashMap) null, new C18221l(1), 7);
        C11521l c11521l = new C11521l(0, EnumC17911l.f34871l);
        while (c11521l.hasNext()) {
            C13467l c13467l2 = (C13467l) linkedHashMap.get((EnumC17911l) c11521l.next());
            if (c13467l2 != null) {
                c13467l.yandex.m2950default((C5104l) c13467l2.yandex.f21690l);
                c13467l.loadAd.putAll(c13467l2.loadAd);
                c13467l.crashlytics.addAll(c13467l2.crashlytics);
                C18221l c18221l = c13467l2.amazon;
                if (c18221l != null) {
                    c13467l.amazon = new C18221l(c18221l.yandex);
                }
            }
        }
        return c13467l;
    }

    public static final Object smaato(C6267l c6267l, EnumC17911l enumC17911l, Map map, EnumC10534l enumC10534l, AbstractC5563l abstractC5563l) {
        LinkedHashMap linkedHashMap = c6267l.firebase;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControlImpl#setParametersAsync: [" + enumC17911l + "] values = " + map + ", optionPriority = " + enumC10534l);
        }
        Object c13467l = linkedHashMap.get(enumC17911l);
        if (c13467l == null) {
            c13467l = new C13467l((C10685l) null, (LinkedHashMap) null, (C18221l) null, 15);
            linkedHashMap.put(enumC17911l, c13467l);
        }
        C13467l c13467l2 = (C13467l) c13467l;
        C10685l c10685l = new C10685l(3);
        c10685l.m2950default((C5104l) c13467l2.yandex.f21690l);
        for (Map.Entry entry : map.entrySet()) {
            CaptureRequest.Key key = (CaptureRequest.Key) entry.getKey();
            ((C5104l) c10685l.f21690l).purchase(AbstractC5641l.billing(key), enumC10534l, entry.getValue());
        }
        linkedHashMap.put(enumC17911l, new C13467l(c10685l, new LinkedHashMap(c13467l2.loadAd), AbstractC16901l.m4227l(c13467l2.crashlytics), c13467l2.amazon));
        return c6267l.metrica(remoteconfig(linkedHashMap), null, abstractC5563l);
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l admob(LinkedHashSet linkedHashSet, boolean z) {
        C9426l c9426lVip = this.mopub ? null : vip(new C14897l(linkedHashSet, z, this, null));
        return c9426lVip == null ? remoteconfig : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final Object amazon(AbstractC5563l abstractC5563l) {
        C4271l c4271l = (C4271l) this.subs.getValue();
        c4271l.getClass();
        return C4271l.crashlytics(c4271l, abstractC5563l);
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l billing(int i) {
        C9426l c9426lVip = this.mopub ? null : vip(new C0813l(this, i, null));
        return c9426lVip == null ? smaato : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final void close() {
        this.mopub = true;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "UseCaseCameraRequestControl: closed");
        }
        C2748l c2748l = (C2748l) this.isPro.getValue();
        synchronized (c2748l.crashlytics) {
            try {
                if (c2748l.mopub) {
                    c2748l.mopub = false;
                    C9426l c9426l = c2748l.amazon;
                    if (c9426l != null) {
                        c9426l.m2649l(new CancellationException("UseCaseCameraState closed"));
                    }
                    c2748l.amazon = null;
                }
                while (!c2748l.billing.isEmpty()) {
                    ((C18405l) c2748l.billing.removeFirst()).loadAd.m2649l(new CancellationException("UseCaseCameraState closed"));
                    c2748l.adcel.yandex();
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l crashlytics(List list, List list2, List list3) {
        C9426l c9426lVip = !this.mopub ? vip(new C10469l(this, list, list2, list3, null)) : null;
        return c9426lVip == null ? smaato : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l firebase() {
        C9426l c9426lVip = null;
        byte b = 0;
        if (!this.mopub) {
            c9426lVip = vip(new C6208l(this, b == true ? 1 : 0, 10));
        }
        return c9426lVip == null ? smaato : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l isPro(Map map, EnumC10534l enumC10534l) {
        C9426l c9426lVip = null;
        byte b = 0;
        if (!this.mopub) {
            c9426lVip = vip(new C10928l((Object) this, (Object) map, (Object) enumC10534l, (InterfaceC14029l) (b == true ? 1 : 0), 7));
        }
        return c9426lVip == null ? remoteconfig : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l loadAd() {
        C9426l c9426lVip = null;
        byte b = 0;
        if (!this.mopub) {
            c9426lVip = vip(new C13954l(this, b == true ? 1 : 0, 9));
        }
        return c9426lVip == null ? smaato : c9426lVip;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object metrica(C13467l c13467l, LinkedHashSet linkedHashSet, AbstractC0283l abstractC0283l) {
        C6907l c6907l;
        if (abstractC0283l instanceof C6907l) {
            c6907l = (C6907l) abstractC0283l;
            int i = c6907l.f14486l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c6907l.f14486l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c6907l = new C6907l(this, abstractC0283l);
            }
        } else {
            c6907l = new C6907l(this, abstractC0283l);
        }
        C6907l c6907l2 = c6907l;
        Object objCrashlytics = c6907l2.f14485l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c6907l2.f14486l;
        InterfaceC1142l interfaceC1142l = null;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objCrashlytics);
            if (!this.mopub) {
                if (this.billing.f3327l.smaato(AbstractC16999l.yandex, null) != null) {
                    C18725l.loadAd();
                    return null;
                }
                InterfaceC17552l interfaceC17552l = (InterfaceC17552l) this.admob.getValue();
                int i3 = c13467l.amazon.yandex;
                if (i3 == -1) {
                    i3 = 1;
                }
                interfaceC17552l.yandex(i3);
                C2748l c2748l = (C2748l) this.isPro.getValue();
                LinkedHashMap linkedHashMapIsPro = AbstractC5641l.isPro(c13467l.yandex.m2952for());
                C5192l c5192l = AbstractC14471l.yandex;
                C12815l c12815lYandex = C12815l.yandex();
                for (Map.Entry entry : c13467l.loadAd.entrySet()) {
                    c12815lYandex.yandex.put((String) entry.getKey(), entry.getValue());
                }
                Map mapSingletonMap = Collections.singletonMap(c5192l, c12815lYandex);
                C18221l c18221l = c13467l.amazon;
                Set set = c13467l.crashlytics;
                c6907l2.f14486l = 1;
                objCrashlytics = c2748l.crashlytics(linkedHashMapIsPro, mapSingletonMap, linkedHashSet, c18221l, set, c6907l2);
                if (objCrashlytics == enumC9342l) {
                    return enumC9342l;
                }
            }
            if (interfaceC1142l == null) {
                return remoteconfig;
            }
            return interfaceC1142l;
        }
        if (i2 != 1) {
            C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC2829l.crashlytics(objCrashlytics);
        interfaceC1142l = (InterfaceC1142l) objCrashlytics;
        if (interfaceC1142l == null) {
            return remoteconfig;
        }
        return interfaceC1142l;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l mopub(List list) {
        C9426l c9426lVip = null;
        byte b = 0;
        if (!this.mopub) {
            c9426lVip = vip(new C6208l(this, list, b == true ? 1 : 0, 11));
        }
        return c9426lVip == null ? remoteconfig : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l purchase(C16443l c16443l, Map map) {
        C9426l c9426lVip = null;
        byte b = 0;
        if (!this.mopub) {
            c9426lVip = vip(new C10928l((Object) this, (Object) c16443l, (Object) map, (InterfaceC14029l) (b == true ? 1 : 0), 8));
        }
        return c9426lVip == null ? remoteconfig : c9426lVip;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l subs(Map map, EnumC17911l enumC17911l, EnumC10534l enumC10534l) {
        if (this.mopub) {
            return remoteconfig;
        }
        if (AbstractC8576l.yandex(this.purchase.crashlytics.get(), Boolean.TRUE)) {
            return AbstractC10999l.crashlytics(1, null, this.purchase.purchase, new C8036l(this, enumC17911l, map, enumC10534l, null, 13));
        }
        C18073l.firebase(Thread.currentThread().getName(), "Thread check failed: This method must be called from the UseCaseThreads sequential scope. Current thread: ");
        return null;
    }

    public final C9426l vip(Function1 function1) {
        C14338l c14338l = this.purchase;
        int i = AbstractC8576l.yandex(c14338l.crashlytics.get(), Boolean.TRUE) ? 4 : 1;
        C9426l c9426l = new C9426l();
        AbstractC10999l.mopub(c14338l.purchase, null, i, new C15352l(function1, c9426l, null, 27), 1);
        return c9426l;
    }

    @Override // defpackage.InterfaceC16983l
    public final InterfaceC1142l yandex(List list, List list2, List list3, C6953l c6953l, C6558l c6558l, long j) {
        C9426l c9426lVip = !this.mopub ? vip(new C15939l(this, list, list2, list3, c6953l, c6558l, j, null)) : null;
        return c9426lVip == null ? smaato : c9426lVip;
    }
}

package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;

/* JADX INFO: renamed from: lؔٛۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C2748l {
    public C9426l amazon;
    public final InterfaceC18560l loadAd;
    public C1799l metrica;
    public boolean mopub;
    public C6558l remoteconfig;
    public C18221l smaato;
    public C7514l vip;
    public final C16047l yandex;
    public final Object crashlytics = new Object();
    public final C11879l purchase = AbstractC1805l.loadAd(0);
    public final C11315l billing = new C11315l();
    public final LinkedHashMap admob = new LinkedHashMap();
    public final LinkedHashMap subs = new LinkedHashMap();
    public final LinkedHashSet isPro = new LinkedHashSet();
    public final LinkedHashSet firebase = new LinkedHashSet();
    public final C15083l startapp = new C15083l(1, this);
    public final C11879l adcel = AbstractC1805l.loadAd(0);

    public C2748l(C16047l c16047l, InterfaceC18560l interfaceC18560l) {
        this.yandex = c16047l;
        this.loadAd = interfaceC18560l;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object crashlytics(LinkedHashMap linkedHashMap, Map map, Set set, C18221l c18221l, Set set2, AbstractC0283l abstractC0283l) {
        C2331l c2331l;
        C10700l c10700l;
        if (abstractC0283l instanceof C2331l) {
            c2331l = (C2331l) abstractC0283l;
            int i = c2331l.f5054l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c2331l.f5054l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c2331l = new C2331l(this, abstractC0283l);
            }
        } else {
            c2331l = new C2331l(this, abstractC0283l);
        }
        Object obj = c2331l.f5055l;
        Object obj2 = EnumC9342l.f19165l;
        int i2 = c2331l.f5054l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            C10700l c10700l2 = new C10700l();
            synchronized (this.crashlytics) {
                try {
                    if (AbstractC5088l.firebase("CXCP")) {
                        Log.d("CXCP", "UseCaseCameraState#updateState: parameters = " + linkedHashMap + ", internalParameters = " + map + ", streams = " + set + ", template = " + c18221l);
                    }
                    if (linkedHashMap != null) {
                        this.admob.clear();
                        this.admob.putAll(linkedHashMap);
                    }
                    if (map != null) {
                        this.subs.clear();
                        this.subs.putAll(map);
                    }
                    if (set != null) {
                        this.isPro.clear();
                        this.isPro.addAll(set);
                    }
                    if (c18221l != null) {
                        this.smaato = c18221l;
                    }
                    if (set2 != null) {
                        this.firebase.clear();
                        this.firebase.addAll(set2);
                    }
                    if (this.amazon == null) {
                        this.amazon = new C9426l();
                    }
                    if (this.mopub) {
                        return this.amazon;
                    }
                    this.mopub = true;
                    c10700l2.f21708l = this.amazon;
                    Unit unit = Unit.INSTANCE;
                    c2331l.f5056l = c10700l2;
                    c2331l.f5054l = 1;
                    if (yandex(c2331l) == obj2) {
                        return obj2;
                    }
                    c10700l = c10700l2;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l = c2331l.f5056l;
            AbstractC2829l.crashlytics(obj);
        }
        return c10700l.f21708l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void loadAd(C10069l c10069l, Map map) {
        C6558l c6558lLoadAd;
        C7514l c7514l;
        Object next;
        Object obj = null;
        Object obj2 = map != null ? map.get(CaptureRequest.CONTROL_AE_MODE) : null;
        Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
        if (num != null) {
            int iIntValue = num.intValue();
            List list = C6558l.loadAd;
            c6558lLoadAd = AbstractC6725l.loadAd(iIntValue);
        } else {
            c6558lLoadAd = null;
        }
        Object obj3 = map != null ? map.get(CaptureRequest.CONTROL_AF_MODE) : null;
        Integer num2 = obj3 instanceof Integer ? (Integer) obj3 : null;
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            Iterator it = C7514l.loadAd.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((C7514l) next).yandex != iIntValue2);
            c7514l = (C7514l) next;
        } else {
            c7514l = null;
        }
        Object obj4 = map != null ? map.get(CaptureRequest.CONTROL_AWB_MODE) : null;
        Integer num3 = obj4 instanceof Integer ? (Integer) obj4 : null;
        if (num3 != null) {
            int iIntValue3 = num3.intValue();
            for (Object obj5 : C1799l.loadAd) {
                if (((C1799l) obj5).yandex == iIntValue3) {
                    obj = obj5;
                    break;
                }
            }
            obj = (C1799l) obj;
        }
        C1799l c1799l = obj;
        boolean z = false;
        boolean z2 = (c6558lLoadAd == null || c6558lLoadAd.equals(this.remoteconfig)) ? false : true;
        boolean z3 = (c7514l == null || c7514l.equals(this.vip)) ? false : true;
        if (c1799l != 0 && !c1799l.equals(this.metrica)) {
            z = true;
        }
        if (z2 || z3 || z) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "UseCaseCameraState: Updating 3A modes: AE(" + c6558lLoadAd + ", changed=" + z2 + "), AF(" + c7514l + ", changed=" + z3 + "), AWB(" + c1799l + ", changed=" + z + ')');
            }
            AbstractC14814l.m3895throws(c10069l, c6558lLoadAd, c7514l, c1799l, null, null, null, 56);
            if (c6558lLoadAd != null) {
                this.remoteconfig = c6558lLoadAd;
            }
            if (c7514l != null) {
                this.vip = c7514l;
            }
            if (c1799l != 0) {
                this.metrica = c1799l;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0146  */
    /* JADX WARN: Code duplicated, block: B:75:0x0160 A[Catch: all -> 0x0169, TryCatch #5 {all -> 0x0169, blocks: (B:73:0x015c, B:75:0x0160, B:78:0x016b), top: B:95:0x015c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:95:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0146, please report this as an issue */
    public final Object yandex(AbstractC0283l abstractC0283l) {
        C11588l c11588l;
        C10700l c10700l;
        C15390l c15390l;
        C9426l c9426l;
        int iIncrementAndGet;
        if (abstractC0283l instanceof C11588l) {
            c11588l = (C11588l) abstractC0283l;
            int i = c11588l.f23284l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c11588l.f23284l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c11588l = new C11588l(this, abstractC0283l);
            }
        } else {
            c11588l = new C11588l(this, abstractC0283l);
        }
        Object objYandex = c11588l.f23285l;
        EnumC9342l enumC9342l = EnumC9342l.f19165l;
        int i2 = c11588l.f23284l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(objYandex);
            C10700l c10700l2 = new C10700l();
            try {
                C2667l c2667lYandex = this.yandex.yandex();
                c11588l.f23286l = c10700l2;
                c11588l.f23284l = 1;
                objYandex = c2667lYandex.yandex(c11588l);
                if (objYandex == enumC9342l) {
                    return enumC9342l;
                }
                c10700l = c10700l2;
            } catch (CancellationException e) {
                e = e;
                c10700l = c10700l2;
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.crashlytics) {
                    if (this.mopub) {
                        this.mopub = false;
                        c10700l.f21708l = this.amazon;
                        this.amazon = null;
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c10700l = c11588l.f23286l;
            try {
                AbstractC2829l.crashlytics(objYandex);
            } catch (CancellationException e2) {
                e = e2;
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Cannot acquire session at " + this, e);
                }
                synchronized (this.crashlytics) {
                    try {
                        if (this.mopub) {
                            this.mopub = false;
                            c10700l.f21708l = this.amazon;
                            this.amazon = null;
                        }
                        Unit unit2 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        AutoCloseable autoCloseable = (AutoCloseable) objYandex;
        try {
            C10069l c10069l = (C10069l) autoCloseable;
            synchronized (this.crashlytics) {
                if (this.isPro.isEmpty()) {
                    c15390l = null;
                } else {
                    C18221l c18221l = this.smaato;
                    List listM4213const = AbstractC16901l.m4213const(this.isPro);
                    LinkedHashMap linkedHashMapMetrica = AbstractC8676l.metrica(this.loadAd.crashlytics(this.smaato), AbstractC8676l.tapsense(this.admob));
                    LinkedHashMap linkedHashMap = new LinkedHashMap(this.subs);
                    C5192l c5192l = AbstractC14471l.loadAd;
                    C11879l c11879l = this.purchase;
                    c11879l.getClass();
                    linkedHashMap.put(c5192l, new Integer(C11879l.loadAd.incrementAndGet(c11879l)));
                    ArrayList arrayList = new ArrayList(this.firebase);
                    arrayList.add(this.startapp);
                    c15390l = new C15390l(listM4213const, linkedHashMapMetrica, linkedHashMap, arrayList, c18221l, 32);
                }
                c9426l = this.amazon;
                this.mopub = false;
                this.amazon = null;
                Unit unit3 = Unit.INSTANCE;
            }
            if (c15390l == null) {
                if (c10069l.f20544l.yandex()) {
                    C8936l.firebase(c10069l, " after close.", "Cannot call stopRepeating on ");
                } else {
                    c10069l.f20543l.amazon(null);
                }
                c10700l.f21708l = c9426l;
            } else {
                if (c9426l != null) {
                    synchronized (this.crashlytics) {
                        this.billing.addLast(new C18405l(this.purchase.yandex, c9426l));
                        C11879l c11879l2 = this.adcel;
                        c11879l2.getClass();
                        iIncrementAndGet = C11879l.loadAd.incrementAndGet(c11879l2);
                    }
                    AbstractC15300l.loadAd(iIncrementAndGet);
                }
                if (AbstractC5088l.firebase("CXCP")) {
                    Log.d("CXCP", "Update RepeatingRequest: " + c15390l);
                }
                if (c10069l.f20544l.yandex()) {
                    C8936l.firebase(c10069l, " after close.", "Cannot call startRepeating on ");
                } else {
                    c10069l.f20543l.amazon(c15390l);
                }
                loadAd(c10069l, c15390l.loadAd);
            }
            AbstractC1214l.yandex(autoCloseable, null);
            C9426l c9426l2 = (C9426l) c10700l.f21708l;
            if (c9426l2 != null) {
                c9426l2.m3885new(Unit.INSTANCE);
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC1214l.yandex(autoCloseable, th2);
                throw th3;
            }
        }
    }
}

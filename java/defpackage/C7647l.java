package defpackage;

import android.os.Looper;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* JADX INFO: renamed from: lؚۦؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7647l {
    public final LinkedHashMap admob;
    public C2667l amazon;
    public C4812l billing;
    public boolean mopub;
    public EnumC10062l purchase;
    public final Object yandex = new Object();
    public final C18449l loadAd = new C18449l(22);
    public final C13716l crashlytics = new C13716l();

    public C7647l() {
        EnumC10062l enumC10062l = EnumC10062l.f20529l;
        this.purchase = enumC10062l;
        this.admob = new LinkedHashMap();
        crashlytics(enumC10062l, null);
    }

    public final void crashlytics(EnumC10062l enumC10062l, C4812l c4812l) {
        List<Map.Entry> listM4213const;
        ((C13716l) this.loadAd.f36010l).isPro(new C9337l(enumC10062l));
        int iOrdinal = enumC10062l.ordinal();
        int i = 5;
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                i = 1;
            } else if (iOrdinal == 4) {
                i = 4;
            } else if (iOrdinal == 5) {
                i = 2;
            } else {
                if (iOrdinal != 6) {
                    C1759l.ads(enumC10062l, "Unexpected CameraInternal state: ");
                    return;
                }
                i = 3;
            }
        }
        C6738l c6738l = new C6738l(i, c4812l);
        C13716l c13716l = this.crashlytics;
        if (AbstractC8576l.yandex(Looper.myLooper(), Looper.getMainLooper())) {
            c13716l.subs(c6738l);
        } else {
            c13716l.isPro(c6738l);
        }
        synchronized (this.yandex) {
            listM4213const = AbstractC16901l.m4213const(this.admob.entrySet());
        }
        for (Map.Entry entry : listM4213const) {
            ((Executor) entry.getValue()).execute(new RunnableC7762l((InterfaceC13241l) entry.getKey(), c6738l, 18));
        }
    }

    public final void loadAd(C2667l c2667l, AbstractC12724l abstractC12724l) {
        synchronized (this.yandex) {
            if (this.mopub) {
                if (AbstractC5088l.metrica()) {
                    Log.w("CXCP", "Ignoring graph state update " + abstractC12724l + " on removed camera.");
                }
                return;
            }
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", c2667l + " state updated to " + abstractC12724l);
            }
            yandex(c2667l, abstractC12724l);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void yandex(C2667l c2667l, AbstractC12724l abstractC12724l) {
        C10016l c10016l;
        if (!AbstractC8576l.yandex(c2667l, this.amazon)) {
            if (AbstractC5088l.firebase("CXCP")) {
                Log.d("CXCP", "Ignored stale transition " + abstractC12724l + " for " + c2667l);
                return;
            }
            return;
        }
        EnumC10062l enumC10062l = this.purchase;
        C13339l c13339l = C13339l.loadAd;
        C13339l c13339l2 = C13339l.crashlytics;
        int iOrdinal = enumC10062l.ordinal();
        C10016l c10016l2 = null;
        EnumC10062l enumC10062l2 = EnumC10062l.f20530l;
        EnumC10062l enumC10062l3 = EnumC10062l.f20536l;
        if (iOrdinal != 2) {
            EnumC10062l enumC10062l4 = EnumC10062l.f20535l;
            EnumC10062l enumC10062l5 = EnumC10062l.f20529l;
            if (iOrdinal != 3) {
                C17874l c17874l = C17874l.loadAd;
                EnumC10062l enumC10062l6 = EnumC10062l.f20534l;
                if (iOrdinal != 4) {
                    C11913l c11913l = C11913l.loadAd;
                    if (iOrdinal == 5) {
                        if (abstractC12724l.equals(c13339l)) {
                            c10016l = new C10016l(enumC10062l2, null);
                        } else if (abstractC12724l instanceof C11769l) {
                            C11769l c11769l = (C11769l) abstractC12724l;
                            int i = c11769l.loadAd;
                            if (c11769l.crashlytics) {
                                c10016l2 = new C10016l(enumC10062l3, AbstractC16947l.billing(i));
                            } else {
                                c10016l2 = AbstractC16947l.purchase(i) ? new C10016l(enumC10062l4, AbstractC16947l.billing(i)) : new C10016l(enumC10062l6, AbstractC16947l.billing(i));
                            }
                        } else if (abstractC12724l.equals(c11913l)) {
                            c10016l = new C10016l(enumC10062l6, null);
                        } else if (abstractC12724l.equals(c17874l)) {
                            c10016l = new C10016l(enumC10062l5, null);
                        }
                        c10016l2 = c10016l;
                    } else if (iOrdinal == 6) {
                        if (abstractC12724l.equals(c11913l)) {
                            c10016l = new C10016l(enumC10062l6, null);
                        } else if (abstractC12724l.equals(c17874l)) {
                            c10016l = new C10016l(enumC10062l5, null);
                        } else if (abstractC12724l instanceof C11769l) {
                            int i2 = ((C11769l) abstractC12724l).loadAd;
                            c10016l2 = AbstractC16947l.purchase(i2) ? new C10016l(enumC10062l4, AbstractC16947l.billing(i2)) : new C10016l(enumC10062l5, AbstractC16947l.billing(i2));
                        }
                        c10016l2 = c10016l;
                    }
                } else {
                    if (abstractC12724l.equals(c17874l)) {
                        c10016l = new C10016l(enumC10062l5, null);
                    } else if (abstractC12724l.equals(c13339l2)) {
                        c10016l = new C10016l(enumC10062l3, null);
                    } else if (abstractC12724l instanceof C11769l) {
                        c10016l2 = new C10016l(enumC10062l6, AbstractC16947l.billing(((C11769l) abstractC12724l).loadAd));
                    }
                    c10016l2 = c10016l;
                }
            } else {
                if (abstractC12724l.equals(c13339l2)) {
                    c10016l = new C10016l(enumC10062l3, null);
                } else if (abstractC12724l.equals(c13339l)) {
                    c10016l = new C10016l(enumC10062l2, null);
                } else if (abstractC12724l instanceof C11769l) {
                    int i3 = ((C11769l) abstractC12724l).loadAd;
                    c10016l2 = AbstractC16947l.purchase(i3) ? new C10016l(enumC10062l4, AbstractC16947l.billing(i3)) : new C10016l(enumC10062l5, AbstractC16947l.billing(i3));
                }
                c10016l2 = c10016l;
            }
        } else {
            if (abstractC12724l.equals(c13339l2)) {
                c10016l = new C10016l(enumC10062l3, null);
            } else if (abstractC12724l.equals(c13339l)) {
                c10016l = new C10016l(enumC10062l2, null);
            }
            c10016l2 = c10016l;
        }
        if (c10016l2 == null) {
            if (AbstractC5088l.metrica()) {
                Log.w("CXCP", "Impermissible state transition: current camera internal state: " + this.purchase + ", received graph state: " + abstractC12724l);
                return;
            }
            return;
        }
        this.purchase = c10016l2.yandex;
        this.billing = c10016l2.loadAd;
        if (AbstractC5088l.firebase("CXCP")) {
            Log.d("CXCP", "Updated current camera internal state to " + c10016l2);
        }
        crashlytics(this.purchase, this.billing);
    }
}

package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* JADX INFO: renamed from: lًًْ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C13218l {
    public final C7819l amazon;
    public final C5346l billing;
    public final int crashlytics;
    public final List loadAd;
    public final boolean mopub;
    public final C9192l purchase;
    public final C7819l yandex;

    public C13218l(C7819l c7819l, List list, int i, C7819l c7819l2, C9192l c9192l, C5346l c5346l, boolean z) {
        this.yandex = c7819l;
        this.loadAd = list;
        this.crashlytics = i;
        this.amazon = c7819l2;
        this.purchase = c9192l;
        this.billing = c5346l;
        this.mopub = z;
    }

    public static C13218l loadAd(C13218l c13218l, int i, C7819l c7819l, int i2) {
        if ((i2 & 1) != 0) {
            i = c13218l.crashlytics;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c7819l = c13218l.amazon;
        }
        C9192l c9192l = c13218l.purchase;
        return new C13218l(c13218l.yandex, c13218l.loadAd, i3, c7819l, c9192l, c13218l.billing, c13218l.mopub);
    }

    public final C13218l amazon(C7819l c7819l) {
        int i = this.crashlytics;
        if (i > 0) {
            yandex(c7819l, (InterfaceC8308l) this.loadAd.get(i - 1));
        }
        return loadAd(this, 0, c7819l, 5);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object crashlytics(AbstractC0283l abstractC0283l) {
        C7322l c7322l;
        InterfaceC8308l interfaceC8308l;
        if (abstractC0283l instanceof C7322l) {
            c7322l = (C7322l) abstractC0283l;
            int i = c7322l.f15183l;
            if ((i & RecyclerView.UNDEFINED_DURATION) != 0) {
                c7322l.f15183l = i - RecyclerView.UNDEFINED_DURATION;
            } else {
                c7322l = new C7322l(this, abstractC0283l);
            }
        } else {
            c7322l = new C7322l(this, abstractC0283l);
        }
        Object obj = c7322l.f15184l;
        int i2 = c7322l.f15183l;
        if (i2 == 0) {
            AbstractC2829l.crashlytics(obj);
            List list = this.loadAd;
            int i3 = this.crashlytics;
            InterfaceC8308l interfaceC8308l2 = (InterfaceC8308l) list.get(i3);
            C13218l c13218lLoadAd = loadAd(this, i3 + 1, null, 6);
            c7322l.f15185l = interfaceC8308l2;
            c7322l.f15183l = 1;
            Object objYandex = interfaceC8308l2.yandex(c13218lLoadAd, c7322l);
            Object obj2 = EnumC9342l.f19165l;
            if (objYandex == obj2) {
                return obj2;
            }
            interfaceC8308l = interfaceC8308l2;
            obj = objYandex;
        } else {
            if (i2 != 1) {
                C8339l.smaato("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC8308l = c7322l.f15185l;
            AbstractC2829l.crashlytics(obj);
        }
        InterfaceC11509l interfaceC11509l = (InterfaceC11509l) obj;
        yandex(interfaceC11509l.billing(), interfaceC8308l);
        return interfaceC11509l;
    }

    public final void yandex(C7819l c7819l, InterfaceC8308l interfaceC8308l) {
        Context context = c7819l.yandex;
        C7819l c7819l2 = this.yandex;
        if (context != c7819l2.yandex) {
            C8936l.firebase(interfaceC8308l, "' cannot modify the request's context.", "Interceptor '");
            return;
        }
        if (c7819l.loadAd == C17126l.yandex) {
            C8936l.firebase(interfaceC8308l, "' cannot set the request's data to null.", "Interceptor '");
        } else if (c7819l.crashlytics != c7819l2.crashlytics) {
            C8936l.firebase(interfaceC8308l, "' cannot modify the request's target.", "Interceptor '");
        } else {
            if (c7819l.ads == c7819l2.ads) {
                return;
            }
            C8936l.firebase(interfaceC8308l, "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.", "Interceptor '");
        }
    }
}

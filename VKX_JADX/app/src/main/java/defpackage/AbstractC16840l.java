package defpackage;

import androidx.car.app.model.Alert;
import java.util.concurrent.ExecutionException;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lٗؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC16840l {
    public static final C5562l yandex = new C5562l(0);

    public static final Object crashlytics(AbstractC2722l abstractC2722l, AbstractC5563l abstractC5563l) throws Throwable {
        try {
            if (abstractC2722l.isDone()) {
                return AbstractC11342l.billing(abstractC2722l);
            }
            C2397l c2397l = new C2397l(1, AbstractC17082l.billing(abstractC5563l));
            c2397l.license();
            abstractC2722l.yandex(new RunnableC9929l(abstractC2722l, c2397l, 21), EnumC1535l.f3808l);
            c2397l.ad(new C6238l(26, abstractC2722l));
            return c2397l.Signature();
        } catch (ExecutionException e) {
            throw e.getCause();
        }
    }

    public static int mopub(int i, int i2) {
        if (i2 < 0) {
            C8339l.metrica("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i2 <= i) {
            return i;
        }
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        return i3 < 0 ? Alert.DURATION_SHOW_INDEFINITELY : i3;
    }

    public static C8149l purchase(int i, InterfaceC12932l interfaceC12932l, InterfaceC2262l interfaceC2262l, Function2 function2) {
        if ((i & 1) != 0) {
            interfaceC12932l = C17218l.f33421l;
        }
        C8421l c8421l = new C8421l(AbstractC14425l.smaato(interfaceC2262l, interfaceC12932l));
        c8421l.m3751l(1, c8421l, function2);
        return c8421l.f17431l;
    }

    public static final C7695l yandex(InterfaceC16588l interfaceC16588l, Object obj) {
        C7695l c7695l = new C7695l(null);
        c7695l.loadAd = new C2494l(obj, interfaceC16588l, 19);
        c7695l.yandex = null;
        return c7695l;
    }

    public abstract boolean amazon(Object obj);

    public abstract Object billing();

    public void loadAd(Object obj) {
    }
}

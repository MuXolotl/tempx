package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: lَِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11738l {
    public static SharedPreferences loadAd;
    public static final long[] yandex = new long[0];

    public static SharedPreferences crashlytics(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (loadAd == null) {
                    loadAd = (SharedPreferences) AbstractC10774l.isVip(new CallableC15551l(2, context));
                }
                sharedPreferences = loadAd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static final void loadAd(InterfaceC12932l interfaceC12932l, Throwable th) {
        if (th instanceof C1049l) {
            th = ((C1049l) th).f2913l;
        }
        try {
            InterfaceC0805l interfaceC0805l = (InterfaceC0805l) interfaceC12932l.mo245l(C13772l.f26879l);
            if (interfaceC0805l != null) {
                interfaceC0805l.mo685continue(interfaceC12932l, th);
            } else {
                AbstractC17122l.billing(interfaceC12932l, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                AbstractC11718l.yandex(runtimeException, th);
                th = runtimeException;
            }
            AbstractC17122l.billing(interfaceC12932l, th);
        }
    }

    public static final C18351l yandex(AbstractC6475l abstractC6475l) {
        C3585l c3585l = abstractC6475l.yandex;
        while (true) {
            C18351l c18351l = (C18351l) ((AtomicReference) c3585l.f7511l).get();
            if (c18351l != null) {
                return c18351l;
            }
            C2993l c2993lCrashlytics = AbstractC1295l.crashlytics();
            C16552l c16552l = AbstractC11463l.yandex;
            C18351l c18351l2 = new C18351l(abstractC6475l, AbstractC10586l.billing(c2993lCrashlytics, AbstractC17278l.yandex.f6462l));
            AtomicReference atomicReference = (AtomicReference) c3585l.f7511l;
            do {
                InterfaceC14029l interfaceC14029l = null;
                if (atomicReference.compareAndSet(null, c18351l2)) {
                    C16552l c16552l2 = AbstractC11463l.yandex;
                    AbstractC10999l.mopub(c18351l2, AbstractC17278l.yandex.f6462l, 0, new C13624l(c18351l2, interfaceC14029l, 29), 2);
                    return c18351l2;
                }
            } while (atomicReference.get() == null);
        }
    }
}

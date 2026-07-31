package defpackage;

import android.content.Context;
import j$.util.DesugarCollections;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: lؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C4225l {
    public static volatile C16208l purchase;
    public final C7644l amazon;
    public final C5379l crashlytics;
    public final InterfaceC4701l loadAd;
    public final InterfaceC4701l yandex;

    public C4225l(InterfaceC4701l interfaceC4701l, InterfaceC4701l interfaceC4701l2, C5379l c5379l, C7644l c7644l, C1381l c1381l) {
        this.yandex = interfaceC4701l;
        this.loadAd = interfaceC4701l2;
        this.crashlytics = c5379l;
        this.amazon = c7644l;
        ((Executor) c1381l.f3513l).execute(new RunnableC6665l(19, c1381l));
    }

    public static void loadAd(Context context) {
        if (purchase == null) {
            synchronized (C4225l.class) {
                try {
                    if (purchase == null) {
                        C7026l c7026l = new C7026l(5, false);
                        context.getClass();
                        c7026l.f14720l = context;
                        purchase = c7026l.adcel();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static C4225l yandex() {
        C16208l c16208l = purchase;
        if (c16208l != null) {
            return (C4225l) c16208l.f31715l.get();
        }
        C8339l.smaato("Not initialized!");
        return null;
    }

    public final C16930l crashlytics(C16529l c16529l) {
        byte[] bytes;
        Set setUnmodifiableSet = c16529l instanceof C16529l ? DesugarCollections.unmodifiableSet(C16529l.amazon) : Collections.singleton(new C7017l("proto"));
        C10111l c10111lYandex = C4330l.yandex();
        c16529l.getClass();
        c10111lYandex.f20587l = "cct";
        String str = c16529l.yandex;
        String str2 = c16529l.loadAd;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC14814l.adcel("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        c10111lYandex.f20586l = bytes;
        return new C16930l(setUnmodifiableSet, c10111lYandex.amazon(), this);
    }
}

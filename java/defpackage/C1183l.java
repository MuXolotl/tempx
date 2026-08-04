package defpackage;

import android.content.Context;
import j$.util.function.IntConsumer$CC;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: lِٜؒ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C1183l {
    public final /* synthetic */ C17804l crashlytics;
    public final C4874l loadAd;
    public final WeakReference yandex;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, lؗٓۤ] */
    public C1183l(C17804l c17804l, Context context) {
        this.crashlytics = c17804l;
        this.yandex = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: lؗٓۤ
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                C17804l c17804l2 = this.yandex.crashlytics;
                if (c17804l2.f34688l) {
                    return;
                }
                c17804l2.m4417l(1, 19, Integer.valueOf(i));
            }

            public /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
                return IntConsumer$CC.$default$andThen(this, intConsumer);
            }
        };
        this.loadAd = r0;
        context.registerDeviceIdChangeListener(new ExecutorC12010l(1, c17804l.f34676l.yandex(c17804l.f34685l, null)), r0);
    }

    public static void yandex(C1183l c1183l) {
        Context context = (Context) c1183l.yandex.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(c1183l.loadAd);
    }
}

package defpackage;

import android.app.Activity;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lؘٜٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5823l implements Function0 {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final /* synthetic */ C14262l f12264l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f12265l;

    public /* synthetic */ C5823l(C14262l c14262l, int i) {
        this.f12265l = i;
        this.f12264l = c14262l;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f12265l;
        C14262l c14262l = this.f12264l;
        switch (i) {
            case 0:
                return new RunnableC6970l(c14262l);
            case 1:
                C14823l c14823l = C7535l.yandex;
                Activity activity = c14262l.f27864l;
                C7535l c7535l = C7535l.loadAd;
                if (c7535l == null) {
                    synchronized (c14823l) {
                        c7535l = C7535l.loadAd;
                        if (c7535l == null) {
                            c7535l = new C7535l();
                            C7535l.loadAd = c7535l;
                            activity.getSharedPreferences("com.skydoves.balloon", 0);
                        }
                        break;
                    }
                }
                return c7535l;
            default:
                c14262l.f27861l = false;
                c14262l.f27866l.dismiss();
                c14262l.f27869l.dismiss();
                ((Handler) c14262l.f27868l.getValue()).removeCallbacks((RunnableC6970l) c14262l.f27865l.getValue());
                return Unit.INSTANCE;
        }
    }
}

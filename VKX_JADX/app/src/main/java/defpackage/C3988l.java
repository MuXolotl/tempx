package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: lًؖۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3988l {
    public final /* synthetic */ C13985l loadAd;
    public final /* synthetic */ int yandex;

    public /* synthetic */ C3988l(C13985l c13985l, int i) {
        this.yandex = i;
        this.loadAd = c13985l;
    }

    public final void yandex(InterfaceC3736l interfaceC3736l) {
        int i = this.yandex;
        C13985l c13985l = this.loadAd;
        C7983l c7983l = (C7983l) interfaceC3736l;
        switch (i) {
            case 0:
                c13985l.getClass();
                Status statusAmazon = c7983l.amazon();
                int i2 = statusAmazon.f584l;
                if (i2 != 0) {
                    C0022l c0022l = c13985l.yandex;
                    Log.w(c0022l.yandex, c0022l.amazon("Error fetching queue items, statusCode=" + i2 + ", statusMessage=" + statusAmazon.f583l, new Object[0]));
                }
                c13985l.firebase = null;
                if (!c13985l.admob.isEmpty()) {
                    HandlerC4052l handlerC4052l = c13985l.subs;
                    C0446l c0446l = c13985l.isPro;
                    handlerC4052l.removeCallbacks(c0446l);
                    handlerC4052l.postDelayed(c0446l, 500L);
                }
                break;
            default:
                Status statusAmazon2 = c7983l.amazon();
                int i3 = statusAmazon2.f584l;
                if (i3 != 0) {
                    C0022l c0022l2 = c13985l.yandex;
                    Log.w(c0022l2.yandex, c0022l2.amazon("Error fetching queue item ids, statusCode=" + i3 + ", statusMessage=" + statusAmazon2.f583l, new Object[0]));
                }
                c13985l.smaato = null;
                if (!c13985l.admob.isEmpty()) {
                    HandlerC4052l handlerC4052l2 = c13985l.subs;
                    C0446l c0446l2 = c13985l.isPro;
                    handlerC4052l2.removeCallbacks(c0446l2);
                    handlerC4052l2.postDelayed(c0446l2, 500L);
                }
                break;
        }
    }
}

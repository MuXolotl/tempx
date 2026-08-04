package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: lًِ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC11698l {
    public static final C14727l amazon;
    public static final C14727l crashlytics;
    public static final C9138l loadAd;
    public static final C9138l[] yandex = new C9138l[0];

    static {
        C9138l c9138l = new C9138l(1L, "vision.barcode");
        loadAd = c9138l;
        C9138l c9138l2 = new C9138l(1L, "vision.custom.ica");
        C9138l c9138l3 = new C9138l(1L, "vision.face");
        C9138l c9138l4 = new C9138l(1L, "vision.ica");
        C9138l c9138l5 = new C9138l(1L, "vision.ocr");
        C9138l c9138l6 = new C9138l(1L, "mlkit.langid");
        C9138l c9138l7 = new C9138l(1L, "mlkit.nlclassifier");
        C9138l c9138l8 = new C9138l(1L, "tflite_dynamite");
        C9138l c9138l9 = new C9138l(1L, "mlkit.barcode.ui");
        C9138l c9138l10 = new C9138l(1L, "mlkit.smartreply");
        C13698l c13698l = new C13698l((byte) 0, 28);
        c13698l.m3675goto("barcode", c9138l);
        c13698l.m3675goto("custom_ica", c9138l2);
        c13698l.m3675goto("face", c9138l3);
        c13698l.m3675goto("ica", c9138l4);
        c13698l.m3675goto("ocr", c9138l5);
        c13698l.m3675goto("langid", c9138l6);
        c13698l.m3675goto("nlclassifier", c9138l7);
        c13698l.m3675goto("tflite_dynamite", c9138l8);
        c13698l.m3675goto("barcode_ui", c9138l9);
        c13698l.m3675goto("smart_reply", c9138l10);
        C6055l c6055l = (C6055l) c13698l.f26746l;
        if (c6055l != null) {
            throw c6055l.yandex();
        }
        C14727l c14727lLoadAd = C14727l.loadAd(c13698l.f26744l, (Object[]) c13698l.f26743l, c13698l);
        C6055l c6055l2 = (C6055l) c13698l.f26746l;
        if (c6055l2 != null) {
            throw c6055l2.yandex();
        }
        crashlytics = c14727lLoadAd;
        C13698l c13698l2 = new C13698l((byte) 0, 28);
        c13698l2.m3675goto("com.google.android.gms.vision.barcode", c9138l);
        c13698l2.m3675goto("com.google.android.gms.vision.custom.ica", c9138l2);
        c13698l2.m3675goto("com.google.android.gms.vision.face", c9138l3);
        c13698l2.m3675goto("com.google.android.gms.vision.ica", c9138l4);
        c13698l2.m3675goto("com.google.android.gms.vision.ocr", c9138l5);
        c13698l2.m3675goto("com.google.android.gms.mlkit.langid", c9138l6);
        c13698l2.m3675goto("com.google.android.gms.mlkit.nlclassifier", c9138l7);
        c13698l2.m3675goto("com.google.android.gms.tflite_dynamite", c9138l8);
        c13698l2.m3675goto("com.google.android.gms.mlkit_smartreply", c9138l10);
        C6055l c6055l3 = (C6055l) c13698l2.f26746l;
        if (c6055l3 != null) {
            throw c6055l3.yandex();
        }
        C14727l c14727lLoadAd2 = C14727l.loadAd(c13698l2.f26744l, (Object[]) c13698l2.f26743l, c13698l2);
        C6055l c6055l4 = (C6055l) c13698l2.f26746l;
        if (c6055l4 != null) {
            throw c6055l4.yandex();
        }
        amazon = c14727lLoadAd2;
    }

    public static C9138l[] loadAd(C14727l c14727l, List list) {
        C9138l[] c9138lArr = new C9138l[list.size()];
        for (int i = 0; i < list.size(); i++) {
            C9138l c9138l = (C9138l) c14727l.get(list.get(i));
            AbstractC1051l.subs(c9138l);
            c9138lArr[i] = c9138l;
        }
        return c9138lArr;
    }

    public static void yandex(Context context, List list) {
        C3823l c3823lPurchase;
        C13268l.loadAd.getClass();
        if (C13268l.yandex(context) < 221500000) {
            Intent intent = new Intent();
            intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
            intent.setAction("com.google.android.gms.vision.DEPENDENCY");
            intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", list));
            intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
            context.sendBroadcast(intent);
            return;
        }
        C9138l[] c9138lArrLoadAd = loadAd(crashlytics, list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C13060l(c9138lArrLoadAd, 0));
        AbstractC1051l.crashlytics(!arrayList.isEmpty(), "APIs must not be empty.");
        C7560l c7560l = new C7560l(context, C7560l.remoteconfig, InterfaceC13945l.yandex, C1308l.crashlytics);
        C7794l c7794lBilling = C7794l.billing(arrayList, true);
        if (c7794lBilling.f16319l.isEmpty()) {
            c3823lPurchase = AbstractC4311l.mopub(new C0925l(0, false));
        } else {
            C10147l c10147lYandex = C8662l.yandex();
            c10147lYandex.amazon = new C9138l[]{AbstractC4927l.yandex};
            c10147lYandex.crashlytics = true;
            c10147lYandex.loadAd = true;
            c10147lYandex.purchase = 27304;
            c10147lYandex.yandex = new C5633l(c7560l, c7794lBilling, 5);
            c3823lPurchase = c7560l.purchase(0, c10147lYandex.yandex());
        }
        c3823lPurchase.crashlytics(new C16222l(25));
    }
}

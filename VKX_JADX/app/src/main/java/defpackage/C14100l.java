package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;

/* JADX INFO: renamed from: lؚّٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C14100l {
    public static void loadAd(Context context, String str, String str2) {
        if ((!AbstractC8576l.yandex(str, "group") && !AbstractC8576l.yandex(str, "user")) || AbstractC16648l.isVip(str2, "https://vk.com/audios", false) || AbstractC16648l.isVip(str2, "https://vk.com/podcasts", false) || AbstractC16648l.isVip(str2, "https://vk.ru/audios", false) || AbstractC16648l.isVip(str2, "https://vk.ru/podcasts", false)) {
            C8183l.crashlytics(C8183l.yandex, Uri.parse(str2), false, 6);
        } else {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str2)));
        }
    }

    public static void yandex(Context context, Catalog2Button catalog2Button) {
        C8688l c8688l = C10328l.purchase;
        String strAds = AbstractC10409l.crashlytics().amazon.ads();
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button.yandex;
        int i = 0;
        if ((catalog2ButtonAction instanceof C2173l) || (catalog2ButtonAction instanceof C15196l)) {
            String str = catalog2Button.loadAd;
            if (str == null) {
                return;
            }
            AbstractC1213l.billing(context, new C15191l(str, new C9810l(str, strAds, i)));
            return;
        }
        if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
            C8183l.crashlytics(C8183l.yandex, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).yandex), false, 6);
        } else if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
            ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).amazon.invoke(context);
        }
    }
}

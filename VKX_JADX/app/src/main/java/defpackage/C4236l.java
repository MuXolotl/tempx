package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* JADX INFO: renamed from: lٕؖٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4236l extends C1538l implements Function3 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f8671l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4236l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f8671l = i4;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8671l;
        boolean z = false;
        Object obj4 = this.f26698l;
        switch (i) {
            case 0:
                if (obj != null) {
                    C18725l.loadAd();
                    return null;
                }
                ViewTreeObserverOnGlobalLayoutListenerC13840l viewTreeObserverOnGlobalLayoutListenerC13840l = (ViewTreeObserverOnGlobalLayoutListenerC13840l) obj4;
                Resources resources = viewTreeObserverOnGlobalLayoutListenerC13840l.getContext().getResources();
                C9833l c9833l = new C9833l(new C15294l(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((C14174l) obj2).yandex, (Function1) obj3);
                if (Build.VERSION.SDK_INT >= 24) {
                    return Boolean.valueOf(C18267l.yandex.yandex(viewTreeObserverOnGlobalLayoutListenerC13840l, null, c9833l));
                }
                throw null;
            case 1:
                AbstractC16829l.loadAd(((C7119l) obj4).f14924l, obj2, (InterfaceC12932l) obj3);
                return Unit.INSTANCE;
            case 2:
                AbstractC16829l.loadAd(((C7119l) obj4).f14924l, C0381l.yandex(((C0381l) obj2).yandex), (InterfaceC12932l) obj3);
                return Unit.INSTANCE;
            case 3:
                ((C15285l) obj4).getClass();
                C15285l.yandex((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 4:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                ((C15285l) obj4).getClass();
                if (C8183l.loadAd != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append('_');
                    sb.append(str2);
                    sb.append(str3 != null ? "_".concat(str3) : "");
                    AbstractC8189l.billing(new C16534l(new String[]{sb.toString()}), new C18334l(3));
                }
                return Unit.INSTANCE;
            case 5:
                ((C15285l) obj4).getClass();
                C15285l.yandex((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 6:
                ((C15285l) obj4).getClass();
                C15285l.yandex((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 7:
                ((C15285l) obj4).getClass();
                C15285l.yandex((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 8:
                ((C15285l) obj4).getClass();
                C15285l.loadAd((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 9:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = (String) obj3;
                ((C15285l) obj4).getClass();
                AppActivity appActivity = C8183l.loadAd;
                if (appActivity != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str4);
                    sb2.append('_');
                    sb2.append(str5);
                    sb2.append(str6 != null ? "_".concat(str6) : "");
                    AbstractC9092l.amazon(appActivity, new C14004l(Collections.singletonList(sb2.toString()), ""));
                }
                return Unit.INSTANCE;
            case 10:
                ((C15285l) obj4).getClass();
                C15285l.loadAd((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 11:
                ((C15285l) obj4).getClass();
                C15285l.loadAd((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 12:
                ((C15285l) obj4).getClass();
                C15285l.loadAd((String) obj, (String) obj2, (String) obj3);
                return Unit.INSTANCE;
            case 13:
                InterfaceC14029l interfaceC14029l = (InterfaceC14029l) obj3;
                PlaybackService playbackService = (PlaybackService) obj4;
                int i2 = PlaybackService.f36828l;
                playbackService.getClass();
                C5159l c5159l = new C5159l(0, new Bundle());
                C5159l c5159l2 = new C5159l(-6, new Bundle());
                String str7 = ((C12417l) obj).loadAd;
                if (AbstractC8576l.yandex(str7, AbstractC9079l.yandex.loadAd)) {
                    C16076l c16076lLicense = PlaybackService.license();
                    C16811l c16811l = c16076lLicense.f31499l;
                    if (c16811l != null) {
                        c16811l.release();
                    }
                    c16076lLicense.f31499l = null;
                    playbackService.smaato();
                    return c5159l;
                }
                if (!AbstractC8576l.yandex(str7, AbstractC9079l.loadAd.loadAd)) {
                    return c5159l2;
                }
                C15035l c15035l = playbackService.f36829l;
                C13572l c13572l = playbackService.f36844l;
                if (c13572l == null) {
                    c13572l = null;
                }
                C2427l c2427lMo2778l = c13572l.yandex().mo2778l();
                return c15035l.loadAd(c2427lMo2778l != null ? c2427lMo2778l.yandex : null, null, interfaceC14029l);
            default:
                long jLongValue = ((Number) obj).longValue();
                ((C12450l) obj4).getClass();
                if (!AbstractC8576l.yandex((String) obj2, "vk")) {
                    return Boolean.FALSE;
                }
                ArrayList arrayListSubs = AbstractC16584l.loadAd().subs();
                if (!arrayListSubs.isEmpty()) {
                    Iterator it = arrayListSubs.iterator();
                    while (it.hasNext()) {
                        if (((C15050l) it.next()).yandex == jLongValue) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}

package defpackage;

import android.os.Bundle;
import android.os.Looper;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.VKXApplication;

/* JADX INFO: renamed from: lُؙٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C11200l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22555l;

    public /* synthetic */ C11200l(int i) {
        this.f22555l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 2;
        switch (this.f22555l) {
            case 0:
                return new C15191l((String) null, new C1329l("radiostations", i));
            case 1:
                return Unit.INSTANCE;
            case 2:
                return Unit.INSTANCE;
            case 3:
                return new C5301l("ready", C8709l.INSTANCE, new Annotation[0]);
            case 4:
                return EnumC0780l.Companion.serializer();
            case 5:
                return AbstractC0079l.subs("ua.itaysonlab.vkxreborn.nearby.inter_device_migration.CdcmToSenderMessage.TransferFinished.Result", EnumC0780l.values(), new String[]{"ok", "io", "unknown"}, new Annotation[][]{null, null, null});
            case 6:
                try {
                    return Long.valueOf(Looper.getMainLooper().getThread().getId());
                } catch (Exception unused) {
                    return null;
                }
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                long j = AbstractC16098l.tapsense;
                return new C10936l(j, AbstractC16098l.isPro, AbstractC16098l.Signature, AbstractC16098l.firebase, AbstractC16098l.purchase, AbstractC16098l.pro, AbstractC16098l.smaato, AbstractC16098l.ad, AbstractC16098l.remoteconfig, AbstractC16098l.signatures, AbstractC16098l.startapp, AbstractC16098l.premium, AbstractC16098l.adcel, AbstractC16098l.yandex, AbstractC16098l.mopub, AbstractC16098l.advert, AbstractC16098l.vip, AbstractC16098l.isVip, AbstractC16098l.metrica, j, AbstractC16098l.billing, AbstractC16098l.amazon, AbstractC16098l.loadAd, AbstractC16098l.admob, AbstractC16098l.crashlytics, AbstractC16098l.subs, AbstractC16098l.ads, AbstractC16098l.subscription, AbstractC16098l.license);
            case 10:
                C10707l c10707l = AbstractC15038l.yandex;
                return Boolean.TRUE;
            case 11:
                long jAmazon = AbstractC12953l.amazon(4284612846L);
                long jAmazon2 = AbstractC12953l.amazon(4281794739L);
                long jAmazon3 = AbstractC12953l.amazon(4278442694L);
                long jAmazon4 = AbstractC12953l.amazon(4278290310L);
                long j2 = C9735l.purchase;
                long jAmazon5 = AbstractC12953l.amazon(4289724448L);
                long j3 = C9735l.loadAd;
                return new C10236l(jAmazon, jAmazon2, jAmazon3, jAmazon4, j2, j2, jAmazon5, j2, j3, j3, j3, j2);
            case 12:
                return Unit.INSTANCE;
            case 13:
                C0554l c0554l = C16076l.f31498l;
                if (c0554l == null) {
                    c0554l = null;
                }
                C16076l c16076l = (C16076l) ((C3342l) c0554l.f1958l).invoke();
                C0554l c0554l2 = C16076l.f31498l;
                c16076l.remoteconfig(!((C16076l) ((C3342l) (c0554l2 != null ? c0554l2 : null).f1958l).invoke()).amazon());
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                C7282l c7282l = new C7282l(8);
                C5374l c5374lYandex = AbstractC16584l.yandex();
                VKXApplication vKXApplication = VKXApplication.f36631l;
                AbstractC4072l.pro(c5374lYandex, vKXApplication != null ? vKXApplication : null, new C0464l(EnumC0442l.Rc, c7282l, 7));
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C10707l c10707l2 = AbstractC12874l.yandex;
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new Bundle();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                throw new IllegalStateException("No default size");
            case 20:
                throw new IllegalStateException("No default context");
            case 21:
                C10707l c10707l3 = AbstractC9404l.yandex;
                return null;
            case 22:
                throw new IllegalStateException("No default glance id");
            case 23:
                C10707l c10707l4 = AbstractC9404l.yandex;
                return C16592l.premium;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC2032l.loadAd("Unexpected call to default provider");
                throw new C6451l(10);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C5301l("io.ktor.http.CookieEncoding", EnumC3116l.values());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C0194l c0194l = C0194l.yandex;
                return new C0185l(c0194l, AbstractC7303l.crashlytics(c0194l), 1);
            default:
                return AbstractC14055l.metrica(C6910l.yandex, C12956l.yandex, C16064l.yandex, C11225l.yandex);
        }
    }
}

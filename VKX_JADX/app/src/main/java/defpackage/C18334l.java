package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libexternal.realm.XTrackLyrics;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* JADX INFO: renamed from: l٘ۥٓ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C18334l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f35845l;

    public /* synthetic */ C18334l(int i) {
        this.f35845l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 13;
        int i2 = 4;
        int i3 = 0;
        switch (this.f35845l) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                ((C14593l) obj).amazon.invoke();
                return Unit.INSTANCE;
            case 2:
                C8183l.yandex.loadAd(((CustomCatalogBlockItem) obj).mopub);
                return Unit.INSTANCE;
            case 3:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    int i4 = C4456l.f9065l;
                    AbstractC4115l.amazon((AudioTrack) list.get(0), new C1990l(i)).Signature(C8183l.loadAd);
                    return Unit.INSTANCE;
                }
                AppActivity appActivity = C8183l.loadAd;
                if (appActivity == null) {
                    return Unit.INSTANCE;
                }
                AbstractC11708l.yandex(new C15245l(i3, appActivity, "Трек недоступен из-за его отсуствия или настроек приватности владельца."));
                return Unit.INSTANCE;
            case 4:
                AudioTrack audioTrack = (AudioTrack) obj;
                AppActivity appActivity2 = C8183l.loadAd;
                if (appActivity2 != null) {
                    AbstractC9092l.amazon(appActivity2, new C1416l(audioTrack));
                }
                return Unit.INSTANCE;
            case 5:
                return ((MainArtist) obj).crashlytics;
            case 6:
                return Unit.INSTANCE;
            case 7:
                Context baseContext = (Context) ((InterfaceC4191l) obj).mo539this(AbstractC1242l.loadAd);
                while (baseContext instanceof ContextWrapper) {
                    if (baseContext instanceof Activity) {
                        return (Activity) baseContext;
                    }
                    baseContext = ((ContextWrapper) baseContext).getBaseContext();
                }
                baseContext = null;
                return (Activity) baseContext;
            case 8:
                return Unit.INSTANCE;
            case 9:
                AbstractC2991l.admob((C15773l) obj, 't');
                return Unit.INSTANCE;
            case 10:
                AbstractC2991l.admob((C15773l) obj, 'T');
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                InterfaceC7669l interfaceC7669l = (InterfaceC7669l) obj;
                AbstractC2991l.admob(interfaceC7669l, ':');
                interfaceC7669l.isPro(2);
                AbstractC2991l.vip(interfaceC7669l, "", new C18334l(i));
                return Unit.INSTANCE;
            case 13:
                InterfaceC7669l interfaceC7669l2 = (InterfaceC7669l) obj;
                AbstractC2991l.admob(interfaceC7669l2, '.');
                interfaceC7669l2.mopub();
                return Unit.INSTANCE;
            case 14:
                C4105l c4105l = (C4105l) obj;
                c4105l.yandex = true;
                c4105l.crashlytics = true;
                c4105l.loadAd = true;
                c4105l.amazon = true;
                return Unit.INSTANCE;
            case 15:
                C6116l c6116l = (C6116l) obj;
                C13047l c13047lYandex = AbstractC9549l.yandex(new C18334l(17));
                int i5 = AbstractC3658l.yandex;
                C5254l c5254l = AbstractC14192l.yandex;
                C13809l c13809l = new C13809l(c13047lYandex);
                InterfaceC12387l c7026l = c5254l.m1754l(AbstractC14192l.yandex) ? C11485l.f23089l : new C7026l(i2, c5254l);
                Unit unit = Unit.INSTANCE;
                c6116l.loadAd.add(new C3531l(c13809l, c5254l, c7026l));
                return Unit.INSTANCE;
            case 16:
                return ((C11054l) obj).crashlytics;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C4105l c4105l2 = (C4105l) obj;
                c4105l2.yandex = true;
                c4105l2.crashlytics = true;
                c4105l2.loadAd = true;
                c4105l2.amazon = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C18233l) obj).f35744l.name();
            case 20:
                ((C3918l) obj).m1448l(AbstractC18202l.yandex.loadAd(XTrackLyrics.class));
                return Unit.INSTANCE;
            case 21:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 22:
                C1521l c1521l = (C1521l) obj;
                List listRemoteconfig = AbstractC14055l.remoteconfig(AbstractC7551l.yandex, AbstractC7551l.loadAd, ((int) (c1521l.yandex.yandex() >> 32)) < ((int) (c1521l.loadAd >> 32)) / 2 ? AbstractC7551l.crashlytics : AbstractC7551l.amazon);
                C16918l c16918l = c1521l.yandex;
                long j = c1521l.loadAd;
                int i6 = (int) (c1521l.crashlytics >> 32);
                EnumC9931l enumC9931l = c1521l.amazon;
                C16761l c16761l = new C16761l(listRemoteconfig.size());
                int size = listRemoteconfig.size();
                while (i3 < size) {
                    c16761l.yandex(((InterfaceC0796l) listRemoteconfig.get(i3)).yandex(c16918l, j, i6, enumC9931l));
                    i3++;
                }
                return c16761l;
            case 23:
                C1521l c1521l2 = (C1521l) obj;
                int iYandex = (int) (c1521l2.yandex.yandex() & 4294967295L);
                long j2 = c1521l2.loadAd;
                List listRemoteconfig2 = AbstractC14055l.remoteconfig(AbstractC7551l.purchase, AbstractC7551l.billing, AbstractC7551l.mopub, iYandex < ((int) (j2 & 4294967295L)) / 2 ? AbstractC7551l.admob : AbstractC7551l.subs);
                C16918l c16918l2 = c1521l2.yandex;
                int i7 = (int) (c1521l2.crashlytics & 4294967295L);
                C16761l c16761l2 = new C16761l(listRemoteconfig2.size());
                int size2 = listRemoteconfig2.size();
                while (i3 < size2) {
                    c16761l2.yandex(((InterfaceC4436l) listRemoteconfig2.get(i3)).yandex(c16918l2, j2, i7));
                    i3++;
                }
                return c16761l2;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC3668l.adcel((InterfaceC17593l) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC13922l[] interfaceC13922lArr = AbstractC3668l.yandex;
                C4707l c4707l = AbstractC0424l.advert;
                Unit unit2 = Unit.INSTANCE;
                ((InterfaceC17593l) obj).amazon(c4707l, unit2);
                return unit2;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C5048l c5048l = (C5048l) obj;
                return AbstractC12589l.applovin(c5048l.loadAd, c5048l.crashlytics, "[", ", ", ")");
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return Long.valueOf(((C3737l) obj).yandex);
            default:
                C4105l c4105l3 = (C4105l) obj;
                c4105l3.yandex = true;
                c4105l3.crashlytics = true;
                c4105l3.loadAd = true;
                c4105l3.amazon = true;
                return Unit.INSTANCE;
        }
    }
}

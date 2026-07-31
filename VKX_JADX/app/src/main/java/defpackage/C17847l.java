package defpackage;

import android.net.Uri;
import android.os.RemoteException;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* JADX INFO: renamed from: lُ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C17847l extends C1538l implements Function1 {

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ int f34778l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17847l(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f34778l = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r3v8 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C7644l c7644l;
        AppActivity appActivity;
        int i = this.f34778l;
        int i2 = 1;
        AppActivity appActivity2 = 0;
        Object obj2 = this.f26698l;
        switch (i) {
            case 0:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 1:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 2:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 3:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 4:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 5:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 6:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 7:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 8:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 9:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 10:
                return ((C6167l) obj2).firebase((C0187l) obj);
            case 11:
                ((C3464l) obj2).mopub((C15830l) obj);
                return Unit.INSTANCE;
            case 12:
                return ((C10822l) obj2).metrica((String) obj);
            case 13:
                return new C15859l((C11296l) obj2, (C14945l) obj);
            case 14:
                ((C0311l) obj2).m423import(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 15:
                C14517l c14517l = (C14517l) obj2;
                c14517l.getClass();
                for (InterfaceC12641l interfaceC12641l : (List) obj) {
                    if (interfaceC12641l instanceof AbstractC2137l) {
                        c14517l.yandex(null);
                    } else if (interfaceC12641l instanceof C10916l) {
                        AbstractC10999l.mopub(c14517l.f28413l, null, 4, new C8912l((C10916l) interfaceC12641l, appActivity2, 5), 1);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                C10244l c10244l = (C10244l) obj2;
                c10244l.getClass();
                c10244l.loadAd(new C9808l((AudioTrack) obj));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Set set = (Set) obj;
                C15813l c15813l = (C15813l) obj2;
                ReentrantLock reentrantLock = c15813l.purchase;
                reentrantLock.lock();
                try {
                    List<C18340l> listM4213const = AbstractC16901l.m4213const(c15813l.amazon.values());
                    reentrantLock.unlock();
                    for (C18340l c18340l : listM4213const) {
                        int[] iArr = c18340l.loadAd;
                        int length = iArr.length;
                        Collection collectionYandex = C5746l.f12138l;
                        if (length != 0) {
                            if (length != 1) {
                                C4344l c4344l = new C4344l();
                                int length2 = iArr.length;
                                int i3 = 0;
                                int i4 = 0;
                                while (i3 < length2) {
                                    int i5 = i4 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i3]))) {
                                        c4344l.add(c18340l.crashlytics[i4]);
                                    }
                                    i3++;
                                    i4 = i5;
                                }
                                collectionYandex = AbstractC9905l.yandex(c4344l);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                collectionYandex = c18340l.amazon;
                            }
                        }
                        if (!collectionYandex.isEmpty()) {
                            C12158l c12158l = (C12158l) c18340l.yandex.f35933l;
                            if (!((AtomicBoolean) c12158l.mopub).get()) {
                                try {
                                    InterfaceC3669l interfaceC3669l = (InterfaceC3669l) c12158l.admob;
                                    if (interfaceC3669l != null) {
                                        interfaceC3669l.mo1408l(c12158l.loadAd, (String[]) collectionYandex.toArray(new String[0]));
                                    }
                                } catch (RemoteException e) {
                                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                                }
                            }
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((AbstractC7581l) obj2).isPro((Throwable) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C15284l) obj2).m3955private((C3498l) obj);
            case 20:
                return ((C15284l) obj2).m3952extends((C3498l) obj);
            case 21:
                String str = (String) obj;
                ((C15285l) obj2).getClass();
                AppActivity appActivity3 = C8183l.loadAd;
                if (appActivity3 != null) {
                    appActivity3.license(new C13379l(str));
                }
                return Unit.INSTANCE;
            case 22:
                String str2 = (String) obj;
                ((C15285l) obj2).getClass();
                C16287l.yandex.getClass();
                if (str2.equals(String.valueOf(C16287l.crashlytics()))) {
                    AppActivity appActivity4 = C8183l.loadAd;
                    appActivity2 = AbstractC2812l.advert(appActivity4) ? appActivity4 : 0;
                    if (appActivity2 != 0 && (c7644l = appActivity2.f36640l) != null) {
                        ((NextDockView) c7644l.f15742l).loadAd(String.valueOf(3), (6 & 2) != 0, true);
                    }
                } else {
                    AppActivity appActivity5 = C8183l.loadAd;
                    if (appActivity5 != null) {
                        appActivity5.license(new C15191l((String) null, new C1329l("https://vk.com/audios".concat(str2), i2)));
                    }
                }
                return Unit.INSTANCE;
            case 23:
                String str3 = (String) obj;
                ((C15285l) obj2).getClass();
                AppActivity appActivity6 = C8183l.loadAd;
                if (appActivity6 != null) {
                    appActivity6.license(new C0471l(Long.parseLong(str3)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String str4 = (String) obj;
                ((C15285l) obj2).getClass();
                AppActivity appActivity7 = C8183l.loadAd;
                if (appActivity7 != null) {
                    appActivity7.license(new C13849l(Integer.parseInt(str4)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                String str5 = (String) obj;
                ((C15285l) obj2).getClass();
                AppActivity appActivity8 = C8183l.loadAd;
                if (appActivity8 != null) {
                    new C11749l(str5).Signature(appActivity8);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C15285l) obj2).getClass();
                AppActivity appActivity9 = C8183l.loadAd;
                if (appActivity9 != null) {
                    new C11749l(null).Signature(appActivity9);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Uri uri = (Uri) obj;
                ((C15285l) obj2).getClass();
                if (uri.getQueryParameter("section") != null) {
                    String string = uri.toString();
                    AppActivity appActivity10 = C8183l.loadAd;
                    if (appActivity10 != null) {
                        appActivity10.license(new C15191l((String) null, new C1329l(string, i2)));
                    }
                } else if (uri.getQueryParameter("q") != null) {
                    uri.getQueryParameter("q");
                } else if (AbstractC8576l.yandex(uri.getQueryParameter("popup"), "recoms_onboarding")) {
                    AppActivity appActivity11 = C8183l.loadAd;
                    if (appActivity11 != null) {
                        appActivity11.license(new C1253l());
                    }
                } else {
                    VKXApplication vKXApplication = VKXApplication.f36631l;
                    AbstractC12832l.mopub(C4537l.yandex, vKXApplication != null ? vKXApplication : null);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C15285l) obj2).getClass();
                String queryParameter = ((Uri) obj).getQueryParameter("category");
                if (queryParameter != null && (appActivity = C8183l.loadAd) != null) {
                    appActivity.license(new C15191l(queryParameter, 3));
                }
                return Unit.INSTANCE;
            default:
                Uri uri2 = (Uri) obj;
                ((C15285l) obj2).getClass();
                AppActivity appActivity12 = C8183l.loadAd;
                if (appActivity12 != null) {
                    String queryParameter2 = uri2.getQueryParameter("genre");
                    appActivity12.license(new C15191l((String) null, new C7730l(20, queryParameter2 != null ? Integer.valueOf(Integer.parseInt(queryParameter2)) : null)));
                }
                return Unit.INSTANCE;
        }
    }
}

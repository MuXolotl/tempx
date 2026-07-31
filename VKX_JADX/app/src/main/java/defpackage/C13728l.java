package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: lًْۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C13728l implements InterfaceC3189l {
    public final /* synthetic */ int yandex;

    @Override // defpackage.InterfaceC3189l
    public final boolean loadAd(Object obj) {
        switch (this.yandex) {
            case 0:
                return ((C9221l) obj).isPro != null;
            case 1:
                return !((C9221l) obj).firebase.isEmpty();
            case 2:
                return true;
            case 3:
                String str = ((C9221l) obj).loadAd;
                return (str == null || str.isEmpty()) ? false : true;
            case 4:
                return true;
            case 5:
                return ((C9221l) obj).amazon != null;
            case 6:
                return ((C9221l) obj).purchase != null;
            case 7:
                return true;
            case 8:
                return true;
            case 9:
                return true;
            case 10:
                return true;
            case 11:
                return true;
            case 12:
                return ((C12431l) obj).billing != null;
            case 13:
                return ((C12431l) obj).admob != null;
            case 14:
                return ((C12431l) obj).subs != null;
            case 15:
                return true;
            case 16:
                return ((InterfaceC0838l) obj).yandex();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((InterfaceC0838l) obj).billing();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((InterfaceC0838l) obj).loadAd();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return false;
            case 20:
                return true;
            case 21:
                return true;
            case 22:
                return true;
            case 23:
                return true;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C4273l) obj).crashlytics != null;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return true;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return true;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return true;
            default:
                return ((C1790l) obj).loadAd != null;
        }
    }

    @Override // defpackage.InterfaceC3189l
    public final String yandex(Object obj) {
        String strValueOf;
        switch (this.yandex) {
            case 0:
                return AbstractC13402l.purchase(((C9221l) obj).isPro, "EXT-X-MEDIA", false);
            case 1:
                return AbstractC13402l.purchase(AbstractC13402l.crashlytics(AbstractC6052l.yandex, ((C9221l) obj).firebase), "EXT-X-MEDIA", false);
            case 2:
                return ((C9221l) obj).yandex.f14703l;
            case 3:
                return AbstractC13402l.purchase(((C9221l) obj).loadAd, "EXT-X-MEDIA", false);
            case 4:
                return AbstractC13402l.purchase(((C9221l) obj).crashlytics, "EXT-X-MEDIA", false);
            case 5:
                return AbstractC13402l.purchase(((C9221l) obj).amazon, "EXT-X-MEDIA", false);
            case 6:
                return AbstractC13402l.purchase(((C9221l) obj).purchase, "EXT-X-MEDIA", false);
            case 7:
                return AbstractC13402l.purchase(((C9221l) obj).billing, "EXT-X-MEDIA", false);
            case 8:
                return ((C9221l) obj).mopub ? "YES" : "NO";
            case 9:
                return ((C9221l) obj).admob ? "YES" : "NO";
            case 10:
                return ((C9221l) obj).subs ? "YES" : "NO";
            case 11:
                return AbstractC13402l.purchase(((C8205l) obj).mopub, "EXT-X-I-FRAME-STREAM-INF", false);
            case 12:
                return AbstractC13402l.purchase(((C12431l) obj).billing, "EXT-X-STREAM-INF", false);
            case 13:
                return AbstractC13402l.purchase(((C12431l) obj).admob, "EXT-X-STREAM-INF", false);
            case 14:
                return AbstractC13402l.purchase(((C12431l) obj).subs, "EXT-X-STREAM-INF", false);
            case 15:
                return Integer.toString(((InterfaceC0838l) obj).purchase());
            case 16:
                return Integer.toString(((InterfaceC0838l) obj).amazon());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C14179l c14179lIsPro = ((InterfaceC0838l) obj).isPro();
                return c14179lIsPro.yandex + "x" + c14179lIsPro.loadAd;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return String.valueOf(((InterfaceC0838l) obj).subs());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "";
            case 20:
                return Float.toString(((C2421l) obj).yandex);
            case 21:
                return ((C2421l) obj).loadAd ? "YES" : "NO";
            case 22:
                return ((C4273l) obj).yandex.f33500l;
            case 23:
                return AbstractC13402l.purchase(((C4273l) obj).loadAd, "EXT-X-KEY", false);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                List list = ((C4273l) obj).crashlytics;
                if (list == null || list.size() == 0) {
                    C8339l.metrica("hex might not be null or empty!");
                    return null;
                }
                StringBuilder sb = new StringBuilder(list.size() + 2);
                sb.append("0x");
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    sb.append(String.format("%02x", (Byte) it.next()));
                }
                return sb.toString();
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC13402l.purchase(((C4273l) obj).amazon, "EXT-X-KEY", true);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return AbstractC13402l.purchase(AbstractC13402l.crashlytics("/", ((C4273l) obj).purchase), "EXT-X-KEY", true);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC13402l.purchase(((C1790l) obj).yandex, "EXT-X-MAP", false);
            default:
                C8379l c8379l = ((C1790l) obj).loadAd;
                boolean z = c8379l.loadAd != null;
                long j = c8379l.yandex;
                if (z) {
                    strValueOf = String.valueOf(j) + '@' + String.valueOf(c8379l.loadAd);
                } else {
                    strValueOf = String.valueOf(j);
                }
                return AbstractC13402l.purchase(strValueOf, "EXT-X-MAP", false);
        }
    }
}

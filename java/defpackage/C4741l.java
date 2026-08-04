package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* JADX INFO: renamed from: lؚؗۤ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C4741l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f9764l;

    public /* synthetic */ C4741l(C16990l c16990l) {
        this.f9764l = 8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [lٌؚٓ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z = true;
        ?? r3 = 0;
        int i = 0;
        switch (this.f9764l) {
            case 0:
                C7067l c7067l = ((C0711l) obj).crashlytics;
                C1204l c1204lAd = c7067l.ad(2);
                String str = c1204lAd != null ? c1204lAd.yandex : "";
                C1204l c1204lAd2 = c7067l.ad(4);
                return new C8195l(str, c1204lAd2 != null ? c1204lAd2.yandex : "");
            case 1:
                return Unit.INSTANCE;
            case 2:
                InterfaceC5763l interfaceC5763l = (InterfaceC5763l) obj;
                if (interfaceC5763l instanceof AbstractC1872l) {
                    return (AbstractC1872l) interfaceC5763l;
                }
                return null;
            case 3:
                Map.Entry entry = (Map.Entry) obj;
                String str2 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sbAdvert = AbstractC5020l.advert(str2, " : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                }
                sbAdvert.append(value);
                return sbAdvert.toString();
            case 4:
                return C2580l.f5619l;
            case 5:
                return obj instanceof Object[] ? AbstractC8669l.m2416switch((Object[]) obj, null, "[", "]", new C4741l(5), 25) : String.valueOf(obj);
            case 6:
                AudioTrack audioTrack = (AudioTrack) obj;
                int i2 = DedicatedCacheService.f36826l;
                if (!AbstractC16676l.purchase(audioTrack) && audioTrack.isPro.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                List list = (List) obj;
                return new C2887l(((Integer) list.get(0)).intValue(), ((Float) list.get(1)).floatValue(), new C13627l(i, list));
            case 8:
                C0394l c0394l = (C0394l) obj;
                c0394l.crashlytics = false;
                c0394l.yandex.add(new C11329l(2, null));
                return Unit.INSTANCE;
            case 9:
                AbstractC3668l.adcel((InterfaceC17593l) obj);
                return Unit.INSTANCE;
            case 10:
                AbstractC3668l.adcel((InterfaceC17593l) obj);
                return Unit.INSTANCE;
            case 11:
                int i3 = 3;
                ((C12825l) obj).yandex.f32921l.firebase(C8403l.f17402l, new C14082l(i3, (InterfaceC14029l) r3, i3));
                return Unit.INSTANCE;
            case 12:
                AudioTrack audioTrack2 = (AudioTrack) obj;
                int i4 = DownloaderService.f36647l;
                if (!AbstractC16676l.purchase(audioTrack2) && audioTrack2.isPro.length() != 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 13:
                int i5 = DownloaderService.f36647l;
                String str3 = ((C1358l) obj).amazon;
                return str3 == null ? "" : str3;
            case 14:
                int i6 = DownloaderService.f36647l;
                return ((MainArtist) obj).crashlytics;
            case 15:
                return Double.valueOf(50.0d);
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                InterfaceC17593l interfaceC17593l = (InterfaceC17593l) obj;
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob(interfaceC17593l, C2056l.billing);
                AbstractC3668l.billing(interfaceC17593l, C11485l.f23085l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                InterfaceC17593l interfaceC17593l2 = (InterfaceC17593l) obj;
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob(interfaceC17593l2, C2056l.crashlytics);
                AbstractC3668l.billing(interfaceC17593l2, C11485l.f23085l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC17593l interfaceC17593l3 = (InterfaceC17593l) obj;
                InterfaceC6348l.yandex.getClass();
                AbstractC3668l.admob(interfaceC17593l3, C2056l.loadAd);
                AbstractC3668l.billing(interfaceC17593l3, C11485l.f23085l);
                return Unit.INSTANCE;
            case 20:
                return 1;
            case 21:
                return Float.valueOf(((C2882l) obj).f6280l);
            case 22:
                return 2;
            case 23:
                return new C8029l();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "[" + ((C17841l) obj) + ']';
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((File) obj).getCanonicalFile().getAbsolutePath();
                return new C6840l();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Boolean.valueOf(((C2757l) obj).f5966extends != null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return ((C7652l) obj).crashlytics;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C4645l c4645l = (C4645l) obj;
                SharedPreferences sharedPreferences = AbstractC3957l.purchase;
                SharedPreferences sharedPreferences2 = sharedPreferences != null ? sharedPreferences : null;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                long j = sharedPreferences2.getLong("user_id_v2", sharedPreferences.getInt("user_id", 0));
                SharedPreferences sharedPreferences3 = AbstractC3957l.purchase;
                if (sharedPreferences3 == null) {
                    sharedPreferences3 = null;
                }
                String string = sharedPreferences3.getString("user_token", "");
                if (string == null) {
                    string = "";
                }
                C2106l c2106l = C2106l.f4733l;
                C2106l c2106lLicense = C16367l.license(Long.MAX_VALUE, 0L);
                StringBuilder sb = new StringBuilder();
                SharedPreferences sharedPreferences4 = AbstractC3957l.purchase;
                if (sharedPreferences4 == null) {
                    sharedPreferences4 = null;
                }
                sb.append(sharedPreferences4.getString("user_first_name", ""));
                sb.append(' ');
                SharedPreferences sharedPreferences5 = AbstractC3957l.purchase;
                if (sharedPreferences5 == null) {
                    sharedPreferences5 = null;
                }
                sb.append(sharedPreferences5.getString("user_last_name", ""));
                String string2 = sb.toString();
                SharedPreferences sharedPreferences6 = AbstractC3957l.purchase;
                String string3 = (sharedPreferences6 != null ? sharedPreferences6 : 0).getString("user_avatar", "");
                return C4645l.yandex(c4645l, j, string, c2106lLicense, null, null, null, string2, null, null, string3 == null ? "" : string3, false, 440);
            default:
                C4708l c4708l = (C4708l) obj;
                C11610l c11610l = AbstractC3629l.yandex;
                c4708l.loadAd = c11610l != null ? c11610l : null;
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C4741l(int i) {
        this.f9764l = i;
    }
}

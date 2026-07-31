package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.dynamic.DynamicMutableRealmObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: lًٕٞ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8163l implements Function2 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17048l;

    public /* synthetic */ C8163l(int i) {
        this.f17048l = i;
    }

    /* JADX WARN: Code duplicated, block: B:126:0x01af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x01ac A[LOOP:1: B:31:0x0165->B:44:0x01ac, LOOP_END] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String string;
        switch (this.f17048l) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                if (((InterfaceC0084l) obj2) instanceof C10847l) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 1:
                C17494l c17494l = (C17494l) obj;
                InterfaceC0084l interfaceC0084l = (InterfaceC0084l) obj2;
                return ((interfaceC0084l instanceof C8079l) || (interfaceC0084l instanceof C4538l) || (interfaceC0084l instanceof C14646l) || (interfaceC0084l instanceof C8479l)) ? new C17494l(c17494l.yandex.billing(interfaceC0084l), c17494l.loadAd) : new C17494l(c17494l.yandex, c17494l.loadAd.billing(interfaceC0084l));
            case 2:
                C6162l.adcel(((C14025l) obj).f27331l.tapsense(), true).f27331l.tapsense();
                return new C6840l();
            case 3:
                ((Integer) obj).getClass();
                return ((InterfaceC7270l) obj2).getId();
            case 4:
                return Integer.valueOf(((InterfaceC6357l) obj).remoteconfig(((Integer) obj2).intValue()));
            case 5:
                return Integer.valueOf(((InterfaceC6357l) obj).metrica(((Integer) obj2).intValue()));
            case 6:
                return Integer.valueOf(((InterfaceC6357l) obj).mo1460for(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((InterfaceC6357l) obj).crashlytics(((Integer) obj2).intValue()));
            case 8:
                return Unit.INSTANCE;
            case 9:
                return (Float) ((C7806l) obj2).yandex.amazon();
            case 10:
                return ((InterfaceC2652l) obj2).loadAd();
            case 11:
                C11793l c11793l = (C11793l) obj;
                InterfaceC2652l interfaceC2652l = (InterfaceC2652l) obj2;
                return interfaceC2652l instanceof C18411l ? ((C18411l) interfaceC2652l).crashlytics(c11793l) : interfaceC2652l.yandex().crashlytics(c11793l);
            case 12:
                InterfaceC11343l interfaceC11343l = (InterfaceC11343l) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject = (DynamicMutableRealmObject) obj2;
                if (dynamicMutableRealmObject != null) {
                    C2336l c2336l = AbstractC18202l.yandex;
                    long jLongValue = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "id")).longValue();
                    long jLongValue2 = ((Number) interfaceC11343l.smaato(c2336l.loadAd(Long.class), "ownerId")).longValue();
                    StringBuilder sb = new StringBuilder();
                    sb.append(jLongValue2);
                    sb.append('_');
                    sb.append(jLongValue);
                    String string2 = sb.toString();
                    String str = (String) interfaceC11343l.tapsense(c2336l.loadAd(String.class), "title");
                    if (str == null) {
                        str = "";
                    }
                    String str2 = (String) interfaceC11343l.tapsense(c2336l.loadAd(String.class), "artist");
                    if (str2 == null) {
                        str2 = "";
                    }
                    InterfaceC11343l interfaceC11343lMopub = interfaceC11343l.mopub("album");
                    if (interfaceC11343lMopub != null) {
                        long jLongValue3 = ((Number) interfaceC11343lMopub.smaato(c2336l.loadAd(Long.class), "id")).longValue();
                        long jLongValue4 = ((Number) interfaceC11343lMopub.smaato(c2336l.loadAd(Long.class), "ownerId")).longValue();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(jLongValue4);
                        sb2.append('_');
                        sb2.append(jLongValue3);
                        string = sb2.toString();
                    } else {
                        string = null;
                    }
                    if (string == null) {
                        string = "";
                    }
                    dynamicMutableRealmObject.admob(string2, "uid");
                    dynamicMutableRealmObject.admob(Long.valueOf(jLongValue), "id");
                    dynamicMutableRealmObject.admob(Long.valueOf(jLongValue2), "ownerId");
                    dynamicMutableRealmObject.admob(interfaceC11343l.tapsense(c2336l.loadAd(String.class), "accessKey"), "accessKey");
                    dynamicMutableRealmObject.admob(str, "title");
                    Locale locale = Locale.ROOT;
                    dynamicMutableRealmObject.admob(str.toLowerCase(locale), "localizedSearchTitle");
                    dynamicMutableRealmObject.admob(str2, "artist");
                    dynamicMutableRealmObject.admob(str2.toLowerCase(locale), "localizedSearchArtist");
                    dynamicMutableRealmObject.admob(string, "albumFullId");
                    Boolean bool = Boolean.TRUE;
                    dynamicMutableRealmObject.admob(bool, "isAvailableOffline");
                    dynamicMutableRealmObject.admob(bool, "isLegacyCachedArtwork");
                    dynamicMutableRealmObject.admob(bool, "isCachedAsMP3");
                    dynamicMutableRealmObject.admob(Boolean.FALSE, "isArtworkSeparateFromAlbum");
                }
                return Unit.INSTANCE;
            case 13:
                InterfaceC11343l interfaceC11343l2 = (InterfaceC11343l) obj;
                DynamicMutableRealmObject dynamicMutableRealmObject2 = (DynamicMutableRealmObject) obj2;
                if (dynamicMutableRealmObject2 != null) {
                    String str3 = (String) interfaceC11343l2.tapsense(AbstractC18202l.yandex.loadAd(String.class), "name");
                    dynamicMutableRealmObject2.admob(str3 != null ? str3 : "", "name");
                }
                return Unit.INSTANCE;
            case 14:
                ((C10761l) obj).crashlytics = (InterfaceC12001l) obj2;
                return Unit.INSTANCE;
            case 15:
                ((C10761l) obj).purchase = ((C15667l) obj2).yandex;
                return Unit.INSTANCE;
            case 16:
                ((C10761l) obj).amazon = ((C12347l) obj2).yandex;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8874l c8874l = (C8874l) obj2;
                Map map = c8874l.f18242l;
                C13660l c13660l = c8874l.f18241l;
                Object[] objArr = c13660l.loadAd;
                Object[] objArr2 = c13660l.crashlytics;
                long[] jArr = c13660l.yandex;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapAmazon = ((InterfaceC2449l) objArr2[i4]).amazon();
                                    if (mapAmazon.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapAmazon);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return obj2;
            case 20:
                C3625l c3625l = (C3625l) obj2;
                return AbstractC14055l.crashlytics(c3625l.f7563l, AbstractC2896l.yandex(c3625l.f7564l, AbstractC2896l.loadAd, (C15543l) obj));
            case 21:
                return Integer.valueOf(((C9867l) obj2).yandex);
            case 22:
                C16810l c16810l = (C16810l) obj2;
                return AbstractC14055l.crashlytics(Float.valueOf(c16810l.yandex), Float.valueOf(c16810l.loadAd));
            case 23:
                C15543l c15543l = (C15543l) obj;
                C13299l c13299l = (C13299l) obj2;
                C1794l c1794l = new C1794l(c13299l.yandex);
                C11165l c11165l = AbstractC2896l.pro;
                return AbstractC14055l.crashlytics(AbstractC2896l.yandex(c1794l, c11165l, c15543l), AbstractC2896l.yandex(new C1794l(c13299l.loadAd), c11165l, c15543l));
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Integer.valueOf(((C6886l) obj2).f14426l);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14754l c14754l = (C14754l) obj2;
                return AbstractC14055l.crashlytics(c14754l.yandex, AbstractC2896l.yandex(c14754l.loadAd, AbstractC2896l.isPro, (C15543l) obj));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Float.valueOf(((C10524l) obj2).yandex);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C15543l c15543l2 = (C15543l) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i5 = 0; i5 < size; i5++) {
                    arrayList.add(AbstractC2896l.yandex((C15012l) list.get(i5), AbstractC2896l.crashlytics, c15543l2));
                }
                return arrayList;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C12814l c12814l = (C12814l) obj2;
                return AbstractC14055l.crashlytics(Integer.valueOf((int) (c12814l.yandex >> 32)), Integer.valueOf((int) (c12814l.yandex & 4294967295L)));
            default:
                C15543l c15543l3 = (C15543l) obj;
                C0387l c0387l = (C0387l) obj2;
                return AbstractC14055l.crashlytics(AbstractC2896l.yandex(new C9735l(c0387l.yandex), AbstractC2896l.adcel, c15543l3), AbstractC2896l.yandex(new C1187l(c0387l.loadAd), AbstractC2896l.advert, c15543l3), Float.valueOf(c0387l.crashlytics));
        }
    }
}

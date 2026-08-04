package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;
import ua.itaysonlab.vkapi2.objects.music.Genre;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lَُؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C10949l implements Function1 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f22081l;

    public /* synthetic */ C10949l(int i) {
        this.f22081l = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.f22081l;
        EnumC16462l enumC16462l = EnumC16462l.f32179l;
        EnumC16462l enumC16462l2 = EnumC16462l.f32183l;
        switch (i) {
            case 0:
                C1187l c1187l = (C1187l) obj;
                return new C15709l(Float.intBitsToFloat((int) (c1187l.yandex >> 32)), Float.intBitsToFloat((int) (c1187l.yandex & 4294967295L)));
            case 1:
                C15709l c15709l = (C15709l) obj;
                return new C1187l((((long) Float.floatToRawIntBits(c15709l.loadAd)) & 4294967295L) | (((long) Float.floatToRawIntBits(c15709l.yandex)) << 32));
            case 2:
                long j = ((C5177l) obj).yandex;
                return new C15709l((int) (j >> 32), (int) (j & 4294967295L));
            case 3:
                C15709l c15709l2 = (C15709l) obj;
                return new C5177l((((long) Math.round(c15709l2.loadAd)) & 4294967295L) | (((long) Math.round(c15709l2.yandex)) << 32));
            case 4:
                long j2 = ((C4999l) obj).yandex;
                return new C15709l((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 5:
                C15709l c15709l3 = (C15709l) obj;
                int iRound = Math.round(c15709l3.yandex);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(c15709l3.loadAd);
                return new C4999l((((long) iRound) << 32) | (((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L));
            case 6:
                C8896l c8896l = (C8896l) obj;
                return new C10369l(c8896l.yandex, c8896l.loadAd, c8896l.crashlytics, c8896l.amazon);
            case 7:
                C10369l c10369l = (C10369l) obj;
                return new C8896l(c10369l.yandex, c10369l.loadAd, c10369l.crashlytics, c10369l.amazon);
            case 8:
                return Float.valueOf(((C11951l) obj).yandex);
            case 9:
                return ((AudioBook.Link) obj).loadAd;
            case 10:
                return ((MainArtist) obj).crashlytics;
            case 11:
                return ((MainArtist) obj).crashlytics;
            case 12:
                ((C12847l) obj).yandex = true;
                return Unit.INSTANCE;
            case 13:
                C4105l c4105l = (C4105l) obj;
                c4105l.yandex = true;
                c4105l.crashlytics = true;
                c4105l.loadAd = true;
                c4105l.amazon = true;
                return Unit.INSTANCE;
            case 14:
                AbstractC3658l.yandex((C6116l) obj, AbstractC9549l.yandex(new C10949l(17)));
                return Unit.INSTANCE;
            case 15:
                AbstractC3658l.yandex((C6116l) obj, AbstractC9549l.yandex(new C10949l(13)));
                return Unit.INSTANCE;
            case 16:
                C6375l c6375l = (C6375l) obj;
                c6375l.yandex(new C5155l());
                c6375l.yandex(C2707l.f5857l);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C4105l c4105l2 = (C4105l) obj;
                c4105l2.yandex = true;
                c4105l2.crashlytics = true;
                c4105l2.loadAd = true;
                c4105l2.amazon = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C4456l) obj).m1549synchronized(enumC16462l2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                ((C4456l) obj).m1549synchronized(enumC16462l);
                return Unit.INSTANCE;
            case 21:
                ((C4456l) obj).m1549synchronized(enumC16462l2);
                return Unit.INSTANCE;
            case 22:
                ((C4456l) obj).m1549synchronized(enumC16462l);
                return Unit.INSTANCE;
            case 23:
                ((C4456l) obj).m1549synchronized(enumC16462l2);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                Map.Entry entry = (Map.Entry) obj;
                return AbstractC1833l.firebase("\n                    \"" + ((String) entry.getKey()) + "\": " + entry.getValue() + "\n                ");
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C4105l) obj).loadAd = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + ':' + ((String) entry2.getValue());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Map.Entry entry3 = (Map.Entry) obj;
                return ((String) entry3.getKey()) + ':' + ((String) entry3.getValue());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Map.Entry entry4 = (Map.Entry) obj;
                return ((String) entry4.getKey()) + ':' + ((String) entry4.getValue());
            default:
                return ((Genre) obj).loadAd;
        }
    }
}

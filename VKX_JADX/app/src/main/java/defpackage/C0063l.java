package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioChartInfo;

/* JADX INFO: renamed from: lؑؓۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0063l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f962l;

    public /* synthetic */ C0063l(int i) {
        this.f962l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f962l) {
            case 0:
                return EnumC17046l.Companion.serializer();
            case 1:
                return EnumC2939l.Companion.serializer();
            case 2:
                return EnumC0836l.Companion.serializer();
            case 3:
                return EnumC16114l.Companion.serializer();
            case 4:
                return new C0087l(C5816l.yandex, 0);
            case 5:
                return new C0087l(C5816l.yandex, 0);
            case 6:
                return new C0087l(new C0087l(C0654l.yandex, 0), 0);
            case 7:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.GenreIdDto", EnumC13459l.values(), new String[]{"1", "2", "3", "4", "5", "6", "7", "21", "8", "1001", "10", "11", "12", "13", "14", "15", "16", "17", "19", "22", "18"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 8:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.MstcpTypeDto", EnumC2939l.values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null});
            case 9:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioAudioDto.TrackGenreIdDto", EnumC0836l.values(), new String[]{"1", "2", "3", "5", "6", "4", "7", "8", "10", "11", "13", "14", "15", "16", "17", "21", "22", "1001"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 10:
                return EnumC7595l.Companion.serializer();
            case 11:
                return new C0087l(C2038l.yandex, 0);
            case 12:
                return new C0087l(C4131l.yandex, 0);
            case 13:
                return new C0087l(C15867l.yandex, 0);
            case 14:
                return new C0087l(C14977l.yandex, 0);
            case 15:
                return new C0087l(C2038l.yandex, 0);
            case 16:
                return new C0087l(C2038l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksAccessStatusDto", EnumC7595l.values(), new String[]{"free", "paid", "started"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return EnumC11113l.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audiobook.AudioBooksChapterProgressStatusDto", EnumC11113l.values(), new String[]{"done", "in_progress", "unread"}, new Annotation[][]{null, null, null});
            case 20:
                return new C0087l(C9803l.yandex, 0);
            case 21:
                return new C0087l(C8227l.yandex, 0);
            case 22:
                C14865l c14865l = AudioChartInfo.Companion;
                return new C5301l("ua.itaysonlab.vkapi2.objects.music.AudioChartInfo.ChartState", EnumC12758l.values());
            case 23:
                return EnumC5608l.Companion.serializer();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioChartInfoDto.StateDto", EnumC5608l.values(), new String[]{"0", "1", "2", "3"}, new Annotation[][]{null, null, null, null});
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0087l(C2459l.yandex, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C0087l(C2459l.yandex, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0087l(C2459l.yandex, 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0087l(C0194l.yandex, 0);
            default:
                return new C0087l(C0194l.yandex, 0);
        }
    }
}

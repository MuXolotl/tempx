package defpackage;

import android.os.StatFs;
import androidx.car.app.navigation.model.Maneuver;
import j$.time.format.DateTimeFormatterBuilder;
import java.io.File;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkxnative.VKXNative;

/* JADX INFO: renamed from: lٌٌٖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C8810l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f18092l;

    public /* synthetic */ C8810l(int i) {
        this.f18092l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18092l) {
            case 0:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffsetId().toFormatter();
            case 1:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHmmss", "Z").toFormatter();
            case 2:
                return new DateTimeFormatterBuilder().parseCaseInsensitive().appendOffset("+HHMM", "+0000").toFormatter();
            case 3:
                C12382l c12382l = AbstractC5921l.f12465l;
                C14025l c14025lPurchase = AbstractC5921l.f12464l.purchase("coil3_disk_cache");
                long jMopub = 10485760;
                try {
                    File file = c14025lPurchase.toFile();
                    file.mkdir();
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    jMopub = AbstractC8576l.mopub((long) (0.02d * statFs.getBlockSizeLong() * statFs.getBlockCountLong()), 10485760L, 262144000L);
                    break;
                } catch (Exception unused) {
                }
                return new C6109l(jMopub, c12382l, c14025lPurchase);
            case 4:
                return EnumC1318l.Companion.serializer();
            case 5:
                return EnumC1318l.Companion.serializer();
            case 6:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkshared.ValidationType", EnumC9763l.values(), new String[]{"2fa_sms", "2fa_push", "2fa_email", "2fa_app", "2fa_libverify", "2fa_callreset", null}, new Annotation[][]{null, null, null, null, null, null, null});
            case 7:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkshared.ValidationTypeConfirmation", EnumC1318l.values(), new String[]{"sms", "push", "email", "callreset"}, new Annotation[][]{null, null, null, null});
            case 8:
                return new C0087l(C15385l.yandex, 0);
            case 9:
                C10328l c10328l = new C10328l();
                c10328l.yandex = VKXNative.x00().yandex;
                return c10328l;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return new C0087l(C9538l.yandex, 0);
            case 13:
                return new C0087l(C0194l.yandex, 0);
            case 14:
                return new C0087l(C0194l.yandex, 0);
            case 15:
                return new C0087l(C0194l.yandex, 0);
            case 16:
                return new C0087l(C3966l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case 20:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case 21:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case 22:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case 23:
                C0194l c0194l = C0194l.yandex;
                return new C0185l(c0194l, c0194l, 1);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C0194l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C0194l c0194l2 = C0194l.yandex;
                return new C0185l(c0194l2, c0194l2, 1);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C5301l("bruhcollective.itaysonlab.vkapi.objects.audio.AudioGetAudioIdsBySourceSourceDto", EnumC9331l.values());
            default:
                C18225l c18225l = new C18225l(AbstractC18202l.yandex.loadAd(AbstractC13065l.class));
                c18225l.loadAd = Arrays.asList(new Annotation[0]);
                return c18225l;
        }
    }
}

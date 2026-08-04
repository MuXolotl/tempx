package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;

/* JADX INFO: renamed from: lٌؚٗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8631l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f17788l;

    public /* synthetic */ C8631l(int i) {
        this.f17788l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17788l) {
            case 0:
                return EnumC17988l.Companion.serializer();
            case 1:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistViewDto", EnumC17988l.values(), new String[]{"compact"}, new Annotation[][]{null});
            case 2:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioRestrictionDto", EnumC16114l.values(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "21", "22", "23"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case 3:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioSearchFilterDto", EnumC17226l.values(), new String[]{"all", "global", "owned"}, new Annotation[][]{null, null, null});
            case 4:
                return C11979l.Companion.serializer(C10301l.yandex);
            case 5:
                return C11979l.Companion.serializer(C13612l.yandex);
            case 6:
                return C11979l.Companion.serializer(C5816l.yandex);
            case 7:
                return C11979l.Companion.serializer(C10301l.yandex);
            case 8:
                return C11979l.Companion.serializer(C13612l.yandex);
            case 9:
                return C11979l.Companion.serializer(C10301l.yandex);
            case 10:
                return C11979l.Companion.serializer(C10301l.yandex);
            case 11:
                return new C0087l(C13612l.yandex, 0);
            case 12:
                return new C0087l(C8167l.yandex, 0);
            case 13:
                return new C0087l(C7717l.yandex, 0);
            case 14:
                C9678l c9678l = AudioTrack.Companion;
                return new C0087l(C15367l.yandex, 0);
            case 15:
                C9678l c9678l2 = AudioTrack.Companion;
                return new C0087l(C15367l.yandex, 0);
            case 16:
                return new C0087l(C0697l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C0087l(C15072l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C0087l(C10496l.yandex, 0);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return new C2309l();
            case 20:
                return new LinkedHashMap();
            case 21:
                return new C2309l();
            case 22:
                return new LinkedHashMap();
            case 23:
                return new C0087l(C5338l.yandex, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C12988l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0087l(C4125l.yandex, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.auth.AuthSignupFieldsValuesDto.GenderDto", EnumC8967l.values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.user.UsersUserProfileTypeDto", EnumC8858l.values(), new String[]{"0", "2"}, new Annotation[][]{null, null});
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C0087l(C12449l.yandex, 0);
            default:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.auth.AuthValidateAccountSupportedWaysDto", EnumC11781l.values(), new String[]{"callreset", "call_in", "codegen", "email", "libverify", "max_code", "max_messenger", "official_messenger", "passkey", "password", "push", "qr_code", "reserve_code", "sms"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null});
        }
    }
}

package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* JADX INFO: renamed from: lؙٛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6573l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f13727l;

    public /* synthetic */ C6573l(int i) {
        this.f13727l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 12;
        int i2 = 11;
        switch (this.f13727l) {
            case 0:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 1:
                C11843l c11843l = new C11843l(new C4384l());
                c11843l.firebase(2);
                AbstractC2991l.admob(c11843l, ':');
                c11843l.admob(2);
                AbstractC2991l.mopub(c11843l, new Function1[]{new C18334l(i2)}, new C18334l(i));
                Unit unit = Unit.INSTANCE;
                return new C5990l(AbstractC5020l.crashlytics(c11843l));
            case 2:
                long j = C9735l.purchase;
                return new C18718l(j, j);
            case 3:
                throw new IllegalStateException("");
            case 4:
                return new C5301l("err_network_issue", C10760l.INSTANCE, new Annotation[0]);
            case 5:
                return new C5301l("err_not_found", C6884l.INSTANCE, new Annotation[0]);
            case 6:
                return new C0087l(InterfaceC9265l.Companion.serializer(), 0);
            case 7:
                C16513l c16513l = MainArtist.Companion;
                return new C0087l(C10174l.yandex, 0);
            case 8:
                C10707l c10707l = AbstractC16964l.yandex;
                return Boolean.FALSE;
            case 9:
                return new C14370l(AbstractC15038l.billing(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new C13494l(null, null, null, null, null, null, null, null, null, 32767), new C1919l(null, 31), C16408l.yandex);
            case 10:
                return new C0087l(C10250l.yandex, 0);
            case 11:
                return new C0087l(C9803l.yandex, 0);
            case 12:
                return EnumC6811l.Companion.serializer();
            case 13:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.media.MediaPopupDto.ImageModeDto", EnumC6811l.values(), new String[]{"round", "small", "big", "emoji"}, new Annotation[][]{null, null, null, null});
            case 14:
                return UUID.randomUUID();
            case 15:
                InterfaceC18035l[] interfaceC18035lArr = new InterfaceC18035l[0];
                if (AbstractC12024l.m3315catch("kotlinx.datetime.MonthBased")) {
                    C8339l.metrica("Blank serial names are prohibited");
                    return null;
                }
                C14416l c14416l = new C14416l("kotlinx.datetime.MonthBased");
                c14416l.yandex(C1313l.loadAd, "months");
                Unit unit2 = Unit.INSTANCE;
                return new C16413l("kotlinx.datetime.MonthBased", C16015l.amazon, c14416l.crashlytics.size(), AbstractC8669l.m2415super(interfaceC18035lArr), c14416l);
            case 16:
                return InterfaceC1830l.yandex;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return C9147l.yandex;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC8020l.smaato(Boolean.FALSE);
            case 20:
                return Unit.INSTANCE;
            case 21:
                return new C11610l(new C10094l());
            case 22:
                return new C11376l(new C11610l(new C10094l()));
            case 23:
                C16786l c16786l = AbstractC7532l.startapp;
                return new C16735l(c16786l, c16786l);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return Boolean.valueOf(!AbstractC3629l.crashlytics.amazon);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C9344l();
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return EnumC16632l.Companion.serializer();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.photos.PhotosPhotoSizesTypeDto", EnumC16632l.values(), new String[]{"t", "s", "m", "x", "o", "p", "q", "r", "k", "l", "y", "z", "c", "w", "a", "b", "e", "i", "d", "j", "temp", "h", "g", "n", "f", "max", "base", "u", "v"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            default:
                int i3 = C8583l.f17696l;
                return Boolean.FALSE;
        }
    }
}

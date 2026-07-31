package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: lۣٓۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C14499l implements Function0 {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final /* synthetic */ int f28378l;

    public /* synthetic */ C14499l(int i) {
        this.f28378l = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 5;
        int i2 = 2;
        int i3 = 1;
        byte b = 0;
        switch (this.f28378l) {
            case 0:
                return new C0087l(C0194l.yandex, 0);
            case 1:
                return new C0087l(C9400l.yandex, 0);
            case 2:
                return new C0087l(C7101l.yandex, 0);
            case 3:
                return new C0087l(C10301l.yandex, 0);
            case 4:
                return new C0087l(C14610l.yandex, 0);
            case 5:
                return new C0087l(C14610l.yandex, 0);
            case 6:
                return new C0087l(C5816l.yandex, 0);
            case 7:
                return new C0087l(C13612l.yandex, 0);
            case 8:
                return new C0087l(C14610l.yandex, 0);
            case 9:
                return new C0087l(C14610l.yandex, 0);
            case 10:
                ArrayList arrayList = new ArrayList();
                C0099l c0099l = new C0099l(1);
                c0099l.amazon("playlist_id", new C3179l("playlist_id", i2));
                c0099l.amazon("owner_id", new C3179l("owner_id", i2));
                c0099l.amazon("access_key", new C3179l("access_key", i2));
                c0099l.amazon("count", new C3179l("count", i2));
                c0099l.amazon("offset", new C3179l("offset", i2));
                c0099l.amazon("shuffle_seed", new C3179l("shuffle_seed", i2));
                Unit unit = Unit.INSTANCE;
                String str = "tracks";
                int i4 = 25;
                arrayList.add(new C13568l(str, new C8634l("audio.get", c0099l, 12), i4));
                C1693l c1693lCrashlytics = new C1693l(str, i).crashlytics("items");
                String str2 = "response";
                int i5 = 23;
                arrayList.add(new C13645l(str2, C17334l.f33653l, i5));
                C1693l c1693l = new C1693l(str2, i);
                arrayList.add(new C5633l(c1693l.crashlytics("items"), C1461l.f3649l, b));
                int i6 = 22;
                String str3 = "index";
                arrayList.add(new C13645l(str3, new C14513l(b, i6, b), i5));
                C1693l c1693l2 = new C1693l(str3, i);
                String str4 = "counter";
                arrayList.add(new C13645l(str4, c1693lCrashlytics.crashlytics("length"), i5));
                C1693l c1693l3 = new C1693l(str4, i);
                C0848l c0848l = new C0848l(c1693l3, new C14513l(b, i6, b), i3);
                C7692l c7692l = new C7692l(c1693lCrashlytics, c1693l2, c1693l3, c1693l);
                C10238l c10238l = new C10238l();
                c7692l.invoke(c10238l);
                arrayList.add(new C13645l(c0848l, c10238l.yandex, i4));
                arrayList.add(new C3316l(26, c1693l));
                return AbstractC16901l.m4210case(arrayList, "\n\n", null, null, null, 62);
            case 11:
                return new C0087l(C8015l.yandex, 0);
            case 12:
                return EnumC11498l.Companion.serializer();
            case 13:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPhotoSizesDto.TypeDto", EnumC11498l.values(), new String[]{"s", "m", "x", "y", "z", "w", "o", "p", "q", "r", "base"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 14:
                return new C0087l(C9803l.yandex, 0);
            case 15:
                return EnumC2709l.Companion.serializer();
            case 16:
                return EnumC11773l.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto.LocationDto", EnumC11773l.values(), new String[]{"more_menu", "button", "banner"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto.TypeDto", EnumC2709l.values(), new String[]{"add", "shareBanner"}, new Annotation[][]{null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return EnumC11706l.Companion.serializer();
            case 20:
                return new C0087l(C4144l.yandex, 0);
            case 21:
                return new C0087l(C13612l.yandex, 0);
            case 22:
                return new C0087l(C13631l.yandex, 0);
            case 23:
                return new C0087l(C5816l.yandex, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0087l(C5816l.yandex, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C0087l(C5816l.yandex, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return EnumC3262l.Companion.serializer();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return new C0087l(C10886l.yandex, 0);
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto.AlbumTypeDto", EnumC3262l.values(), new String[]{"playlist", "main_only", "main_feat", "collection"}, new Annotation[][]{null, null, null, null});
            default:
                final String[] strArr = {"album"};
                Annotation[] annotationArr = {new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr), ')');
                    }
                }};
                final String[] strArr2 = {"ep"};
                Annotation[] annotationArr2 = {new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr2, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr2) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr2;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr2), ')');
                    }
                }};
                final String[] strArr3 = {"collection"};
                Annotation[] annotationArr3 = {new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr3, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr3) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr3;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr3), ')');
                    }
                }};
                final String[] strArr4 = {"single"};
                Annotation[] annotationArr4 = {new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr4, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr4) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr4;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr4), ')');
                    }
                }};
                final String[] strArr5 = {"chat"};
                Annotation[] annotationArr5 = {new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr5, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr5) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr5;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr5), ')');
                    }
                }};
                final String[] strArr6 = {"ugc"};
                final String[] strArr7 = {"generated"};
                return AbstractC0079l.subs("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto.PlaylistTypeDto", EnumC11706l.values(), new String[]{"0", "1", "2", "3", "4", "5", "6", "7"}, new Annotation[][]{null, annotationArr, annotationArr2, annotationArr3, annotationArr4, annotationArr5, new Annotation[]{new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr6, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr6) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr6;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr6), ')');
                    }
                }}, new Annotation[]{new InterfaceC3816l() { // from class: lٓٞۙ
                    @Override // java.lang.annotation.Annotation
                    public final /* synthetic */ Class annotationType() {
                        return InterfaceC3816l.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final boolean equals(Object obj) {
                        return (obj instanceof InterfaceC3816l) && Arrays.equals(strArr7, ((InterfaceC3816l) obj).names());
                    }

                    @Override // java.lang.annotation.Annotation
                    public final int hashCode() {
                        return Arrays.hashCode(strArr7) ^ 397397176;
                    }

                    @Override // defpackage.InterfaceC3816l
                    public final /* synthetic */ String[] names() {
                        return strArr7;
                    }

                    @Override // java.lang.annotation.Annotation
                    public final String toString() {
                        return AbstractC2812l.tapsense(new StringBuilder("@kotlinx.serialization.json.JsonNames(names="), Arrays.toString(strArr7), ')');
                    }
                }}});
        }
    }
}

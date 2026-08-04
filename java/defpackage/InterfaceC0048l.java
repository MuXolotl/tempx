package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;

/* JADX INFO: renamed from: lؑؒۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0048l extends InterfaceC15273l, InterfaceC16352l {

    /* JADX INFO: renamed from: lؒۨٓ, reason: contains not printable characters */
    public static final C6916l f916l;

    /* JADX INFO: renamed from: lؖٔؓ, reason: contains not printable characters */
    public static final C6916l f918l;

    /* JADX INFO: renamed from: lؖٙؖ, reason: contains not printable characters */
    public static final C6916l f919l;

    /* JADX INFO: renamed from: lؘٞۨ, reason: contains not printable characters */
    public static final C6916l f920l;

    /* JADX INFO: renamed from: lؘۦۧ, reason: contains not printable characters */
    public static final C6916l f921l;

    /* JADX INFO: renamed from: lؙؕؕ, reason: contains not printable characters */
    public static final C6916l f922l;

    /* JADX INFO: renamed from: lٌٔٞ, reason: contains not printable characters */
    public static final C6916l f923l;

    /* JADX INFO: renamed from: lٍ۟ۨ, reason: contains not printable characters */
    public static final C6916l f924l;

    /* JADX INFO: renamed from: lَٜؑ, reason: contains not printable characters */
    public static final C6916l f925l;

    /* JADX INFO: renamed from: lًَۙ, reason: contains not printable characters */
    public static final C6916l f926l;

    /* JADX INFO: renamed from: lَؙ۠, reason: contains not printable characters */
    public static final C6916l f927l;

    /* JADX INFO: renamed from: lًٔۘ, reason: contains not printable characters */
    public static final C6916l f929l;

    /* JADX INFO: renamed from: lٕؖؔ, reason: contains not printable characters */
    public static final C6916l f930l;

    /* JADX INFO: renamed from: lؒۜۡ, reason: contains not printable characters */
    public static final C6916l f915l = new C6916l("camerax.core.useCase.defaultSessionConfig", C10814l.class, null);

    /* JADX INFO: renamed from: lْۣٔ, reason: contains not printable characters */
    public static final C6916l f928l = new C6916l("camerax.core.useCase.defaultCaptureConfig", C0665l.class, null);

    /* JADX INFO: renamed from: lؑٞۘ, reason: contains not printable characters */
    public static final C6916l f914l = new C6916l("camerax.core.useCase.sessionConfigUnpacker", C17511l.class, null);

    /* JADX INFO: renamed from: lؔۥ٘, reason: contains not printable characters */
    public static final C6916l f917l = new C6916l("camerax.core.useCase.captureConfigUnpacker", C13069l.class, null);

    static {
        Class cls = Integer.TYPE;
        f920l = new C6916l("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        f925l = new C6916l("camerax.core.useCase.sessionType", cls, null);
        f924l = new C6916l("camerax.core.useCase.targetFrameRate", Range.class, null);
        f922l = new C6916l("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        f930l = new C6916l("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        f929l = new C6916l("camerax.core.useCase.zslDisabled", cls2, null);
        f927l = new C6916l("camerax.core.useCase.highResolutionDisabled", cls2, null);
        f919l = new C6916l("camerax.core.useCase.captureType", EnumC11949l.class, null);
        f918l = new C6916l("camerax.core.useCase.previewStabilizationMode", cls, null);
        f921l = new C6916l("camerax.core.useCase.videoStabilizationMode", cls, null);
        f923l = new C6916l("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        f916l = new C6916l("camerax.core.useCase.takePictureManagerProvider", C3693l.class, null);
        f926l = new C6916l("camerax.core.useCase.streamUseCase", EnumC18632l.class, null);
    }

    C10814l ads();

    /* JADX INFO: renamed from: case, reason: not valid java name */
    C0665l mo250case();

    /* JADX INFO: renamed from: catch, reason: not valid java name */
    Range mo251catch(Range range);

    /* JADX INFO: renamed from: extends, reason: not valid java name */
    int mo252extends(Size size);

    /* JADX INFO: renamed from: final, reason: not valid java name */
    boolean mo253final();

    /* JADX INFO: renamed from: for, reason: not valid java name */
    int mo254for();

    /* JADX INFO: renamed from: instanceof, reason: not valid java name */
    boolean mo255instanceof();

    boolean license();

    /* JADX INFO: renamed from: native, reason: not valid java name */
    EnumC11949l mo256native();

    /* JADX INFO: renamed from: package, reason: not valid java name */
    EnumC18632l mo257package();

    /* JADX INFO: renamed from: private, reason: not valid java name */
    int mo258private();

    C10814l signatures();

    /* JADX INFO: renamed from: static, reason: not valid java name */
    int mo259static();

    int subscription();

    /* JADX INFO: renamed from: super, reason: not valid java name */
    boolean mo260super();

    C17511l tapsense();

    C3693l vip();
}

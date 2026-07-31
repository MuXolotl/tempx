package androidx.camera.camera2.compat.quirk;

import defpackage.AbstractC2812l;
import defpackage.AbstractC8669l;
import defpackage.C13476l;
import defpackage.C2483l;
import defpackage.C2582l;
import defpackage.EnumC13290l;
import defpackage.EnumC18632l;
import defpackage.EnumC7005l;
import defpackage.InterfaceC4212l;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraSupportedSurfaceCombinationsQuirk;", "Llؖٚؑ;", "lّٖ٘", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ExtraSupportedSurfaceCombinationsQuirk implements InterfaceC4212l {
    public static final Set amazon;
    public static final Set crashlytics;
    public static final C13476l loadAd;
    public static final C13476l yandex;

    static {
        C13476l c13476l = new C13476l();
        EnumC18632l enumC18632l = C2483l.purchase;
        EnumC7005l enumC7005l = EnumC7005l.VGA;
        EnumC13290l enumC13290l = EnumC13290l.f26073l;
        c13476l.yandex(C2582l.tapsense(enumC13290l, enumC7005l));
        EnumC7005l enumC7005l2 = EnumC7005l.PREVIEW;
        EnumC13290l enumC13290l2 = EnumC13290l.f26074l;
        c13476l.yandex(C2582l.tapsense(enumC13290l2, enumC7005l2));
        EnumC7005l enumC7005l3 = EnumC7005l.MAXIMUM;
        c13476l.yandex(C2582l.tapsense(enumC13290l, enumC7005l3));
        yandex = c13476l;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C2582l.tapsense(enumC13290l, enumC7005l));
        arrayList.add(C2582l.tapsense(enumC13290l, enumC7005l2));
        arrayList.add(C2582l.tapsense(enumC13290l, enumC7005l3));
        C13476l c13476l2 = new C13476l();
        AbstractC2812l.ad(enumC13290l2, enumC7005l2, c13476l2, enumC13290l2, enumC7005l);
        c13476l2.yandex(C2582l.tapsense(enumC13290l, enumC7005l3));
        loadAd = c13476l2;
        crashlytics = AbstractC8669l.m2407import(new String[]{"PIXEL 6", "PIXEL 6 PRO", "PIXEL 7", "PIXEL 7 PRO", "PIXEL 8", "PIXEL 8 PRO", "PIXEL 9", "PIXEL 9 PRO", "PIXEL 9 PRO XL", "PIXEL 9 PRO FOLD"});
        amazon = AbstractC8669l.m2407import(new String[]{"SM-S921", "SC-51E", "SCG25", "SM-S926", "SM-S928", "SC-52E", "SCG26", "SM-S931", "SM-S936", "SM-S937", "SM-S938", "SCG31", "SCG32", "SC-51F", "SC-52F"});
    }
}

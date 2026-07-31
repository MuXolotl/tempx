package defpackage;

import java.util.List;

/* JADX INFO: renamed from: lٖۡۦ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC16703l {
    public static final List yandex;

    static {
        Float fValueOf = Float.valueOf(0.0f);
        C8195l c8195l = new C8195l(fValueOf, fValueOf);
        Float fValueOf2 = Float.valueOf(0.5f);
        yandex = AbstractC14055l.remoteconfig(c8195l, new C8195l(fValueOf2, fValueOf2));
    }

    public static final long yandex(AbstractC9278l abstractC9278l) {
        List list = abstractC9278l.yandex;
        return C9699l.yandex((((C17841l) AbstractC16901l.m4214continue(list)).yandex() + ((C17841l) AbstractC16901l.m4231native(list)).yandex[0]) / 2.0f, (((C17841l) AbstractC16901l.m4214continue(list)).loadAd() + ((C17841l) AbstractC16901l.m4231native(list)).yandex[1]) / 2.0f);
    }
}

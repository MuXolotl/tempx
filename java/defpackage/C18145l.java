package defpackage;

/* JADX INFO: renamed from: lؚ٘ۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C18145l {
    public float amazon;
    public int crashlytics;
    public boolean loadAd;
    public Object purchase;
    public int yandex;

    public static int crashlytics(C13217l c13217l, boolean z) {
        EnumC7283l enumC7283l = EnumC7283l.f15126l;
        if (z) {
            C9696l c9696l = (C9696l) AbstractC16901l.m4214continue(c13217l.remoteconfig);
            return (c13217l.adcel == enumC7283l ? c9696l.advert : c9696l.isVip) + 1;
        }
        C9696l c9696l2 = (C9696l) AbstractC16901l.m4231native(c13217l.remoteconfig);
        return (c13217l.adcel == enumC7283l ? c9696l2.advert : c9696l2.isVip) - 1;
    }

    public static int loadAd(C1644l c1644l, boolean z) {
        return z ? ((C15237l) AbstractC16901l.m4214continue(c1644l.firebase)).yandex + 1 : ((C15237l) AbstractC16901l.m4231native(c1644l.firebase)).yandex - 1;
    }

    public static int yandex(C13217l c13217l, boolean z) {
        return z ? ((C9696l) AbstractC16901l.m4214continue(c13217l.remoteconfig)).yandex + 1 : ((C9696l) AbstractC16901l.m4231native(c13217l.remoteconfig)).yandex - 1;
    }
}

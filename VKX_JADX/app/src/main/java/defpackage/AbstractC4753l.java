package defpackage;

/* JADX INFO: renamed from: lًؗۗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4753l {
    public static final C12543l amazon;
    public static final C18396l crashlytics;
    public static final C2312l[] loadAd;
    public static final C2312l yandex;

    static {
        C2312l c2312l = new C2312l("org.jspecify.nullness");
        C2312l c2312l2 = new C2312l("org.jspecify.annotations");
        yandex = c2312l2;
        C2312l c2312l3 = new C2312l("io.reactivex.rxjava3.annotations");
        C2312l c2312l4 = new C2312l("org.checkerframework.checker.nullness.compatqual");
        String str = c2312l3.yandex.yandex;
        loadAd = new C2312l[]{new C2312l(AbstractC12900l.firebase(str, ".Nullable")), new C2312l(AbstractC12900l.firebase(str, ".NonNull"))};
        C2312l c2312l5 = new C2312l("org.jetbrains.annotations");
        C12543l c12543l = C12543l.amazon;
        C8195l c8195l = new C8195l(c2312l5, c12543l);
        C8195l c8195l2 = new C8195l(new C2312l("kotlin.annotations.jvm"), c12543l);
        C8195l c8195l3 = new C8195l(new C2312l("androidx.annotation"), c12543l);
        C8195l c8195l4 = new C8195l(new C2312l("android.support.annotation"), c12543l);
        C8195l c8195l5 = new C8195l(new C2312l("android.annotation"), c12543l);
        C8195l c8195l6 = new C8195l(new C2312l("com.android.annotations"), c12543l);
        C8195l c8195l7 = new C8195l(new C2312l("org.eclipse.jdt.annotation"), c12543l);
        C8195l c8195l8 = new C8195l(new C2312l("org.checkerframework.checker.nullness.qual"), c12543l);
        C8195l c8195l9 = new C8195l(c2312l4, c12543l);
        C8195l c8195l10 = new C8195l(new C2312l("javax.annotation"), c12543l);
        C8195l c8195l11 = new C8195l(new C2312l("edu.umd.cs.findbugs.annotations"), c12543l);
        C8195l c8195l12 = new C8195l(new C2312l("io.reactivex.annotations"), c12543l);
        C2312l c2312l6 = new C2312l("androidx.annotation.RecentlyNullable");
        EnumC5244l enumC5244l = EnumC5244l.f11321l;
        C8195l c8195l13 = new C8195l(c2312l6, new C12543l(enumC5244l, 4));
        C8195l c8195l14 = new C8195l(new C2312l("androidx.annotation.RecentlyNonNull"), new C12543l(enumC5244l, 4));
        C8195l c8195l15 = new C8195l(new C2312l("lombok"), c12543l);
        C8855l c8855l = new C8855l(2, 1, 0);
        EnumC5244l enumC5244l2 = EnumC5244l.f11320l;
        crashlytics = new C18396l(AbstractC8676l.remoteconfig(c8195l, c8195l2, c8195l3, c8195l4, c8195l5, c8195l6, c8195l7, c8195l8, c8195l9, c8195l10, c8195l11, c8195l12, c8195l13, c8195l14, c8195l15, new C8195l(c2312l, new C12543l(enumC5244l, c8855l, enumC5244l2)), new C8195l(c2312l2, new C12543l(enumC5244l, new C8855l(2, 1, 0), enumC5244l2)), new C8195l(c2312l3, new C12543l(enumC5244l, new C8855l(1, 8, 0), enumC5244l2)), new C8195l(new C2312l("jakarta.annotation"), new C12543l(enumC5244l, new C8855l(2, 4, 0), enumC5244l2)), new C8195l(AbstractC6830l.smaato, new C12543l(enumC5244l, new C8855l(2, 5, 0), enumC5244l2)), new C8195l(AbstractC6830l.remoteconfig, new C12543l(enumC5244l, new C8855l(2, 5, 0), enumC5244l2)), new C8195l(new C2312l("io.vertx.codegen.annotations"), new C12543l(enumC5244l, new C8855l(2, 5, 0), enumC5244l2))));
        amazon = new C12543l(enumC5244l, 4);
    }
}

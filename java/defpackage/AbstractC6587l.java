package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: lؙٛۜ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6587l {
    public static final C2312l admob;
    public static final C2312l amazon;
    public static final C2312l billing;
    public static final C2312l crashlytics;
    public static final Set firebase;
    public static final Set isPro;
    public static final C2312l loadAd;
    public static final Set metrica;
    public static final C2312l mopub;
    public static final C2312l purchase;
    public static final Set remoteconfig;
    public static final Set smaato;
    public static final C2312l startapp;
    public static final C2312l subs;
    public static final Set vip;
    public static final C2312l yandex;

    static {
        C2312l c2312l = new C2312l("org.jspecify.nullness.Nullable");
        C2312l c2312l2 = new C2312l("org.jspecify.nullness.NullMarked");
        yandex = c2312l2;
        C2312l c2312l3 = new C2312l("org.jspecify.nullness.NullnessUnspecified");
        C2312l c2312l4 = new C2312l("org.jspecify.annotations.NonNull");
        C2312l c2312l5 = new C2312l("org.jspecify.annotations.Nullable");
        C2312l c2312l6 = new C2312l("org.jspecify.annotations.NullMarked");
        loadAd = c2312l6;
        C2312l c2312l7 = new C2312l("org.jspecify.annotations.NullnessUnspecified");
        C2312l c2312l8 = new C2312l("org.jspecify.annotations.NullUnmarked");
        crashlytics = c2312l8;
        amazon = new C2312l("javax.annotation.meta.TypeQualifier");
        purchase = new C2312l("javax.annotation.meta.TypeQualifierNickname");
        billing = new C2312l("javax.annotation.meta.TypeQualifierDefault");
        C2312l c2312l9 = new C2312l("javax.annotation.Nonnull");
        mopub = c2312l9;
        C2312l c2312l10 = new C2312l("javax.annotation.Nullable");
        C2312l c2312l11 = new C2312l("javax.annotation.CheckForNull");
        admob = new C2312l("javax.annotation.ParametersAreNonnullByDefault");
        subs = new C2312l("javax.annotation.ParametersAreNullableByDefault");
        isPro = AbstractC8669l.m2407import(new C2312l[]{c2312l9, c2312l11});
        Set setM2407import = AbstractC8669l.m2407import(new C2312l[]{AbstractC6830l.admob, c2312l4, new C2312l("android.annotation.NonNull"), new C2312l("androidx.annotation.NonNull"), new C2312l("androidx.annotation.RecentlyNonNull"), new C2312l("android.support.annotation.NonNull"), new C2312l("com.android.annotations.NonNull"), new C2312l("org.checkerframework.checker.nullness.compatqual.NonNullDecl"), new C2312l("org.checkerframework.checker.nullness.qual.NonNull"), new C2312l("edu.umd.cs.findbugs.annotations.NonNull"), new C2312l("io.reactivex.annotations.NonNull"), new C2312l("io.reactivex.rxjava3.annotations.NonNull"), new C2312l("org.eclipse.jdt.annotation.NonNull"), new C2312l("lombok.NonNull"), new C2312l("jakarta.annotation.Nonnull")});
        firebase = setM2407import;
        Set setM2407import2 = AbstractC8669l.m2407import(new C2312l[]{AbstractC6830l.subs, c2312l, c2312l5, c2312l10, c2312l11, new C2312l("android.annotation.Nullable"), new C2312l("androidx.annotation.Nullable"), new C2312l("androidx.annotation.RecentlyNullable"), new C2312l("android.support.annotation.Nullable"), new C2312l("com.android.annotations.Nullable"), new C2312l("org.checkerframework.checker.nullness.compatqual.NullableDecl"), new C2312l("org.checkerframework.checker.nullness.qual.Nullable"), new C2312l("edu.umd.cs.findbugs.annotations.Nullable"), new C2312l("edu.umd.cs.findbugs.annotations.PossiblyNull"), new C2312l("edu.umd.cs.findbugs.annotations.CheckForNull"), new C2312l("io.reactivex.annotations.Nullable"), new C2312l("io.reactivex.rxjava3.annotations.Nullable"), new C2312l("org.eclipse.jdt.annotation.Nullable"), new C2312l("jakarta.annotation.Nullable"), new C2312l("io.vertx.codegen.annotations.Nullable")});
        smaato = setM2407import2;
        remoteconfig = AbstractC8669l.m2407import(new C2312l[]{c2312l3, c2312l7});
        AbstractC9905l.admob(AbstractC9905l.admob(AbstractC9905l.admob(AbstractC9905l.admob(AbstractC9905l.mopub(AbstractC9905l.mopub(new LinkedHashSet(), setM2407import), setM2407import2), c2312l9), c2312l2), c2312l6), c2312l8);
        vip = AbstractC8669l.m2407import(new C2312l[]{AbstractC6830l.firebase, AbstractC6830l.vip, AbstractC6830l.smaato, AbstractC6830l.remoteconfig});
        metrica = AbstractC8669l.m2407import(new C2312l[]{AbstractC6830l.isPro, AbstractC6830l.metrica});
        AbstractC8676l.remoteconfig(new C8195l(AbstractC6830l.crashlytics, AbstractC3333l.tapsense), new C8195l(AbstractC6830l.amazon, AbstractC3333l.pro), new C8195l(AbstractC6830l.purchase, AbstractC3333l.remoteconfig), new C8195l(AbstractC6830l.billing, AbstractC3333l.ad));
        startapp = new C2312l("kotlin.annotations.jvm.UnderMigration");
    }
}

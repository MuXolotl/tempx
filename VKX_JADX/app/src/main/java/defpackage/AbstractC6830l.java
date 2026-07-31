package defpackage;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: renamed from: lٌؙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6830l {
    public static final C2312l adcel;
    public static final C2312l admob;
    public static final C2312l ads;
    public static final C2312l amazon;
    public static final C2312l billing;
    public static final C2312l crashlytics;
    public static final C2312l firebase;
    public static final C2312l isPro;
    public static final C3498l loadAd;
    public static final C2312l metrica;
    public static final C2312l mopub;
    public static final C2312l purchase;
    public static final C2312l remoteconfig;
    public static final C2312l smaato;
    public static final C2312l startapp;
    public static final C2312l subs;
    public static final C2312l subscription;
    public static final C2312l vip;
    public static final C2312l yandex;

    static {
        C2312l c2312l = new C2312l("kotlin.Metadata");
        yandex = c2312l;
        C8353l.loadAd(c2312l).amazon();
        loadAd = C3498l.purchase("value");
        crashlytics = new C2312l(Target.class.getName());
        new C2312l(ElementType.class.getName());
        amazon = new C2312l(Retention.class.getName());
        new C2312l(RetentionPolicy.class.getName());
        purchase = new C2312l(Deprecated.class.getName());
        billing = new C2312l(Documented.class.getName());
        mopub = new C2312l("java.lang.annotation.Repeatable");
        new C2312l("java.lang.annotation.Inherited");
        new C2312l(Override.class.getName());
        admob = new C2312l("org.jetbrains.annotations.NotNull");
        subs = new C2312l("org.jetbrains.annotations.Nullable");
        isPro = new C2312l("org.jetbrains.annotations.Mutable");
        firebase = new C2312l("org.jetbrains.annotations.ReadOnly");
        smaato = new C2312l("org.jetbrains.annotations.Unmodifiable");
        remoteconfig = new C2312l("org.jetbrains.annotations.UnmodifiableView");
        vip = new C2312l("kotlin.annotations.jvm.ReadOnly");
        metrica = new C2312l("kotlin.annotations.jvm.Mutable");
        startapp = new C2312l("kotlin.jvm.PurelyImplements");
        new C2312l("kotlin.jvm.internal");
        C2312l c2312l2 = new C2312l("kotlin.jvm.internal.SerializedIr");
        adcel = c2312l2;
        C8353l.loadAd(c2312l2).amazon();
        ads = new C2312l("kotlin.jvm.internal.EnhancedNullability");
        subscription = new C2312l("kotlin.jvm.internal.EnhancedMutability");
    }
}

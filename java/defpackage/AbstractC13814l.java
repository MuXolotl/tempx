package defpackage;

/* JADX INFO: renamed from: lؚْۧ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC13814l {
    public static final C2466l admob;
    public static final C2466l billing;
    public static final C11421l yandex = new C11421l("cause", Throwable.class, false, false);
    public static final C11421l loadAd = new C11421l("ratelimit_count", Integer.class, false, false);
    public static final C11421l crashlytics = new C11421l("sampling_count", Integer.class, false, false);
    public static final C11421l amazon = new C11421l("ratelimit_period", AbstractC8960l.class, false, false);
    public static final C11421l purchase = new C11421l("skipped", Integer.class, false, false);
    public static final C11421l mopub = new C11421l("forced", Boolean.class, false, false);
    public static final C11421l subs = new C11421l("stack_size", EnumC14097l.class, false, false);

    static {
        boolean z = true;
        billing = new C2466l("group_by", Object.class, z, z, 0);
        admob = new C2466l("tags", C13059l.class, false, z, 1);
    }
}

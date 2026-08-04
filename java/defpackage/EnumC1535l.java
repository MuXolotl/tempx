package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٟؓؐ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1535l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1535l[] f3807l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC1535l f3808l;

    static {
        EnumC1535l enumC1535l = new EnumC1535l("INSTANCE", 0);
        f3808l = enumC1535l;
        f3807l = new EnumC1535l[]{enumC1535l};
    }

    public static EnumC1535l valueOf(String str) {
        return (EnumC1535l) Enum.valueOf(EnumC1535l.class, str);
    }

    public static EnumC1535l[] values() {
        return (EnumC1535l[]) f3807l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}

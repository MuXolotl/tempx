package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍؗؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC9343l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9343l[] f19167l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC9343l f19168l;

    static {
        EnumC9343l enumC9343l = new EnumC9343l("INSTANCE", 0);
        f19168l = enumC9343l;
        f19167l = new EnumC9343l[]{enumC9343l};
    }

    public static EnumC9343l valueOf(String str) {
        return (EnumC9343l) Enum.valueOf(EnumC9343l.class, str);
    }

    public static EnumC9343l[] values() {
        return (EnumC9343l[]) f19167l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}

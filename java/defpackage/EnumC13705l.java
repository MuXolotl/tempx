package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lْ۟ۡ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC13705l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13705l[] f26758l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC13705l f26759l;

    static {
        EnumC13705l enumC13705l = new EnumC13705l("INSTANCE", 0);
        f26759l = enumC13705l;
        f26758l = new EnumC13705l[]{enumC13705l};
    }

    public static EnumC13705l valueOf(String str) {
        return (EnumC13705l) Enum.valueOf(EnumC13705l.class, str);
    }

    public static EnumC13705l[] values() {
        return (EnumC13705l[]) f26758l.clone();
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

package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lٍؒٚ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1150l implements Executor {

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1150l[] f3125l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC1150l f3126l;

    static {
        EnumC1150l enumC1150l = new EnumC1150l("INSTANCE", 0);
        f3126l = enumC1150l;
        f3125l = new EnumC1150l[]{enumC1150l};
    }

    public static EnumC1150l[] values() {
        return (EnumC1150l[]) f3125l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((HandlerC4052l) C5138l.m1704new().f11181l).post(runnable);
    }
}

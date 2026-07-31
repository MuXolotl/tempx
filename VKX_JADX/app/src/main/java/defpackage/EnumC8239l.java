package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: lًۙۥ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8239l implements Executor {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8239l[] f17126l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public static final Handler f17127l;

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public static final EnumC8239l f17128l;

    static {
        EnumC8239l enumC8239l = new EnumC8239l("INSTANCE", 0);
        f17128l = enumC8239l;
        f17126l = new EnumC8239l[]{enumC8239l};
        f17127l = new Handler(Looper.getMainLooper());
    }

    public static EnumC8239l valueOf(String str) {
        return (EnumC8239l) Enum.valueOf(EnumC8239l.class, str);
    }

    public static EnumC8239l[] values() {
        return (EnumC8239l[]) f17126l.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f17127l.post(runnable);
    }
}

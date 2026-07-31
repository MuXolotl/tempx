package defpackage;

import android.os.Trace;

/* JADX INFO: renamed from: lؚۤؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes.dex */
public final class C7615l {
    public final C10523l yandex;

    public C7615l(C10523l c10523l) {
        this.yandex = c10523l;
    }

    public final InterfaceC11220l yandex() {
        C10523l c10523l = this.yandex;
        try {
            Trace.beginSection("getCameraBackend");
            c10523l.amazon.getClass();
            InterfaceC11220l interfaceC11220lYandex = c10523l.yandex("CXCP-Camera2");
            if (interfaceC11220lYandex != null) {
                Trace.endSection();
                return interfaceC11220lYandex;
            }
            throw new IllegalStateException(("Failed to load CameraBackend " + ((Object) C1594l.yandex("CXCP-Camera2"))).toString());
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}

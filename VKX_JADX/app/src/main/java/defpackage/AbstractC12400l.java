package defpackage;

import java.nio.channels.ServerSocketChannel;

/* JADX INFO: renamed from: lّْؗ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12400l {
    public static final boolean yandex;

    static {
        boolean z;
        try {
            Class.forName("java.net.StandardSocketOptions");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        yandex = z;
    }

    public static final void yandex(ServerSocketChannel serverSocketChannel, C17740l c17740l) {
    }
}

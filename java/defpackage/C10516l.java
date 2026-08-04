package defpackage;

import java.net.SocketAddress;

/* JADX INFO: renamed from: lٍَۘ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10516l extends AbstractC9151l {
    public final SocketAddress amazon;

    static {
        try {
            Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
    }

    public C10516l(SocketAddress socketAddress) {
        this.amazon = socketAddress;
        if (socketAddress.getClass().getName().equals("java.net.UnixDomainSocketAddress")) {
            return;
        }
        C8339l.smaato("address should be java.net.UnixDomainSocketAddress");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C10516l.class.equals(obj != null ? obj.getClass() : null)) {
            return AbstractC8576l.yandex(this.amazon, ((C10516l) obj).amazon);
        }
        return false;
    }

    public final int hashCode() {
        return this.amazon.hashCode();
    }

    @Override // defpackage.AbstractC9151l
    public final SocketAddress mopub() {
        return this.amazon;
    }

    public final String toString() {
        return this.amazon.toString();
    }
}

package defpackage;

import java.net.SocketAddress;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: lَٗۨ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C10354l extends AbstractC0823l implements InterfaceC17799l {

    /* JADX INFO: renamed from: lٕۛۨ, reason: contains not printable characters */
    public final SocketChannel f21145l;

    public C10354l(SocketChannel socketChannel, C9268l c9268l) {
        super(c9268l);
        this.f21145l = socketChannel;
        if (socketChannel.isBlocking()) {
            C8339l.metrica("Channel need to be configured as non-blocking.");
            throw null;
        }
    }

    /* JADX INFO: renamed from: default, reason: not valid java name */
    public final AbstractC9151l m2912default() {
        boolean z = AbstractC12400l.yandex;
        SocketChannel socketChannel = this.f21145l;
        SocketAddress localAddress = z ? socketChannel.getLocalAddress() : socketChannel.socket().getLocalSocketAddress();
        if (localAddress != null) {
            return AbstractC17344l.billing(localAddress);
        }
        C8339l.smaato("Channel is not yet bound");
        return null;
    }

    @Override // defpackage.AbstractC4820l
    public final SelectableChannel mopub() {
        return this.f21145l;
    }

    /* JADX INFO: renamed from: super, reason: not valid java name */
    public final AbstractC9151l m2913super() {
        boolean z = AbstractC12400l.yandex;
        SocketChannel socketChannel = this.f21145l;
        SocketAddress remoteAddress = z ? socketChannel.getRemoteAddress() : socketChannel.socket().getRemoteSocketAddress();
        if (remoteAddress != null) {
            return AbstractC17344l.billing(remoteAddress);
        }
        C8339l.smaato("Channel is not yet connected");
        return null;
    }
}

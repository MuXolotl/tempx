package defpackage;

import java.io.IOException;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.nio.channels.SelectableChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

/* JADX INFO: renamed from: lؚٖۛ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C16251l extends AbstractC4820l implements InterfaceC15580l {

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public final C9268l f31803l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public final ServerSocketChannel f31804l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public final C0462l f31805l;

    public C16251l(ServerSocketChannel serverSocketChannel, C9268l c9268l) {
        this.f31804l = serverSocketChannel;
        this.f31803l = c9268l;
        if (serverSocketChannel.isBlocking()) {
            C8339l.metrica("Channel need to be configured as non-blocking.");
            throw null;
        }
        this.f31805l = AbstractC11174l.yandex();
    }

    @Override // defpackage.AbstractC4820l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C0462l c0462l = this.f31805l;
        C9268l c9268l = this.f31803l;
        try {
            try {
                this.f31804l.close();
                c9268l.m2629synchronized(this);
                c0462l.m561l();
            } catch (Throwable th) {
                c9268l.m2629synchronized(this);
                throw th;
            }
        } catch (Throwable th2) {
            c0462l.m560l(th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:18:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object inmobi(defpackage.AbstractC0283l r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C15086l
            if (r0 == 0) goto L13
            r0 = r5
            lٔۖۜ r0 = (defpackage.C15086l) r0
            int r1 = r0.f29621l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29621l = r1
            goto L18
        L13:
            lٔۖۜ r0 = new lٔۖۜ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f29620l
            int r1 = r0.f29621l
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.AbstractC2829l.crashlytics(r5)
            goto L41
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.C8339l.smaato(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.AbstractC2829l.crashlytics(r5)
        L2f:
            lٓۥؒ r5 = defpackage.EnumC14535l.ACCEPT
            r4.signatures(r5, r2)
            r0.f29621l = r2
            lٍِؒ r1 = r4.f31803l
            java.lang.Object r5 = r1.m2628switch(r4, r5, r0)
            lٍؗؐ r1 = defpackage.EnumC9342l.f19165l
            if (r5 != r1) goto L41
            return r1
        L41:
            java.nio.channels.ServerSocketChannel r5 = r4.f31804l
            java.nio.channels.SocketChannel r5 = r5.accept()
            if (r5 == 0) goto L2f
            lَٗۨ r4 = r4.m4156package(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16251l.inmobi(lّؑۧ):java.lang.Object");
    }

    @Override // defpackage.Csuper
    /* JADX INFO: renamed from: lٍٔ۠ */
    public final C0462l mo3373l() {
        return this.f31805l;
    }

    @Override // defpackage.AbstractC4820l
    public final SelectableChannel mopub() {
        return this.f31804l;
    }

    /* JADX INFO: renamed from: package, reason: not valid java name */
    public final C10354l m4156package(SocketChannel socketChannel) throws IOException {
        signatures(EnumC14535l.ACCEPT, false);
        socketChannel.configureBlocking(false);
        if (m4157synchronized() instanceof C4378l) {
            if (AbstractC12400l.yandex) {
                socketChannel.setOption((SocketOption<Boolean>) StandardSocketOptions.TCP_NODELAY, Boolean.TRUE);
            } else {
                socketChannel.socket().setTcpNoDelay(true);
            }
        }
        return new C10354l(socketChannel, this.f31803l);
    }

    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public final AbstractC9151l m4157synchronized() {
        boolean z = AbstractC12400l.yandex;
        ServerSocketChannel serverSocketChannel = this.f31804l;
        return AbstractC17344l.billing(z ? serverSocketChannel.getLocalAddress() : serverSocketChannel.socket().getLocalSocketAddress());
    }

    @Override // defpackage.AbstractC4820l, defpackage.InterfaceC11791l
    public final void yandex() {
        try {
            close();
        } catch (Throwable unused) {
        }
    }
}

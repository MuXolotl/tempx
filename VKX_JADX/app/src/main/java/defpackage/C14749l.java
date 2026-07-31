package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؚۣٔ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C14749l extends CancellationException implements InterfaceC14404l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final transient InterfaceC7042l f28820l;

    public C14749l(String str, InterfaceC7042l interfaceC7042l) {
        super(str);
        this.f28820l = interfaceC7042l;
    }

    @Override // defpackage.InterfaceC14404l
    public final Throwable yandex() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        C14749l c14749l = new C14749l(message, this.f28820l);
        c14749l.initCause(this);
        return c14749l;
    }
}

package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: lؚؑٙ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C0390l extends CancellationException implements InterfaceC14404l {

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final transient InterfaceC7042l f1484l;

    public C0390l(String str, Throwable th, C14750l c14750l) {
        super(str);
        this.f1484l = c14750l;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0390l)) {
            return false;
        }
        C0390l c0390l = (C0390l) obj;
        if (!AbstractC8576l.yandex(c0390l.getMessage(), getMessage())) {
            return false;
        }
        Object obj2 = c0390l.f1484l;
        if (obj2 == null) {
            obj2 = C8035l.f16723l;
        }
        Object obj3 = this.f1484l;
        if (obj3 == null) {
            obj3 = C8035l.f16723l;
        }
        return obj2.equals(obj3) && AbstractC8576l.yandex(c0390l.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int iHashCode = getMessage().hashCode() * 31;
        Object obj = this.f1484l;
        if (obj == null) {
            obj = C8035l.f16723l;
        }
        int iHashCode2 = (obj.hashCode() + iHashCode) * 31;
        Throwable cause = getCause();
        return iHashCode2 + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("; job=");
        Object obj = this.f1484l;
        if (obj == null) {
            obj = C8035l.f16723l;
        }
        sb.append(obj);
        return sb.toString();
    }

    @Override // defpackage.InterfaceC14404l
    public final /* bridge */ /* synthetic */ Throwable yandex() {
        return null;
    }
}

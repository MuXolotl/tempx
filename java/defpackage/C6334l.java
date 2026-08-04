package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: lًؙۢ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C6334l extends AbstractC5554l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f13281l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f13282l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4619l f13283l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f13284l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public long f13285l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public boolean f13286l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f13287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6334l(C4619l c4619l, InterfaceC10506l interfaceC10506l, long j, boolean z) {
        super(interfaceC10506l);
        this.f13283l = c4619l;
        this.f13284l = j;
        this.f13281l = z;
        this.f13287l = z;
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) throws IOException {
        if (this.f13282l) {
            C8339l.smaato("closed");
            return;
        }
        long j2 = this.f13284l;
        if (j2 != -1 && this.f13285l + j > j2) {
            throw new ProtocolException("expected " + this.f13284l + " bytes but received " + (this.f13285l + j));
        }
        try {
            if (this.f13287l) {
                this.f13287l = false;
                ((C17778l) this.f13283l.f9373l).f34630l.getClass();
            }
            super.mo390break(c0869l, j);
            this.f13285l += j;
        } catch (IOException e) {
            throw yandex(e);
        }
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f13282l) {
            return;
        }
        this.f13282l = true;
        long j = this.f13284l;
        if (j != -1 && this.f13285l != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            super.close();
            yandex(null);
        } catch (IOException e) {
            throw yandex(e);
        }
    }

    @Override // defpackage.AbstractC5554l, defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() throws IOException {
        try {
            super.flush();
        } catch (IOException e) {
            throw yandex(e);
        }
    }

    public final IOException yandex(IOException iOException) {
        if (this.f13286l) {
            return iOException;
        }
        this.f13286l = true;
        return C4619l.amazon(this.f13283l, this.f13281l, iOException, 4);
    }
}

package defpackage;

import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: lٖ٘ۖ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C17962l extends AbstractC11737l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public final boolean f34948l;

    /* JADX INFO: renamed from: lؓۡؑ, reason: contains not printable characters */
    public boolean f34949l;

    /* JADX INFO: renamed from: lؕؕؒ, reason: contains not printable characters */
    public final /* synthetic */ C4619l f34950l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final long f34951l;

    /* JADX INFO: renamed from: lٍۣۢ, reason: contains not printable characters */
    public boolean f34952l;

    /* JADX INFO: renamed from: lٍۥۗ, reason: contains not printable characters */
    public long f34953l;

    /* JADX INFO: renamed from: lَٕ۠, reason: contains not printable characters */
    public boolean f34954l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17962l(C4619l c4619l, InterfaceC14991l interfaceC14991l, long j, boolean z) {
        super(interfaceC14991l);
        this.f34950l = c4619l;
        this.f34951l = j;
        this.f34948l = z;
        this.f34952l = true;
        if (j == 0) {
            yandex(null);
        }
    }

    @Override // defpackage.InterfaceC14991l
    public final long ad(C0869l c0869l, long j) throws IOException {
        if (this.f34949l) {
            C8339l.smaato("closed");
            return 0L;
        }
        try {
            long jAd = this.f23514l.ad(c0869l, j);
            if (this.f34952l) {
                this.f34952l = false;
                ((C17778l) this.f34950l.f9373l).f34630l.getClass();
            }
            if (jAd == -1) {
                yandex(null);
                return -1L;
            }
            long j2 = this.f34953l + jAd;
            long j3 = this.f34951l;
            if (j3 != -1 && j2 > j3) {
                throw new ProtocolException("expected " + this.f34951l + " bytes but received " + j2);
            }
            this.f34953l = j2;
            if (((InterfaceC1029l) this.f34950l.f9374l).crashlytics()) {
                yandex(null);
            }
            return jAd;
        } catch (IOException e) {
            throw yandex(e);
        }
    }

    @Override // defpackage.AbstractC11737l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f34949l) {
            return;
        }
        this.f34949l = true;
        try {
            super.close();
            yandex(null);
        } catch (IOException e) {
            throw yandex(e);
        }
    }

    public final IOException yandex(IOException iOException) {
        if (this.f34954l) {
            return iOException;
        }
        this.f34954l = true;
        if (iOException == null && this.f34952l) {
            this.f34952l = false;
            ((C17778l) this.f34950l.f9373l).f34630l.getClass();
        }
        return C4619l.amazon(this.f34950l, this.f34948l, iOException, 8);
    }
}

package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: lَؚؑ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-7761d6fd52750600b6eeb3da7b88ede05d5cd0fcaae415e0ed7a2830c95bc1fb */
/* JADX INFO: loaded from: classes3.dex */
public final class C7167l implements InterfaceC16805l {

    /* JADX INFO: renamed from: lؓٝؕ, reason: contains not printable characters */
    public boolean f14997l;

    /* JADX INFO: renamed from: lؗۤؑ, reason: contains not printable characters */
    public final C0869l f14998l = new C0869l();

    /* JADX INFO: renamed from: lٌؘؒ, reason: contains not printable characters */
    public final InterfaceC10506l f14999l;

    public C7167l(InterfaceC10506l interfaceC10506l) {
        this.f14999l = interfaceC10506l;
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l appmetrica(C3844l c3844l) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m708import(c3844l);
        yandex();
        return this;
    }

    public final InterfaceC16805l billing(long j) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m737while(j);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC10506l
    /* JADX INFO: renamed from: break */
    public final void mo390break(C0869l c0869l, long j) {
        if (this.f14997l) {
            C8339l.smaato("closed");
        } else {
            this.f14998l.mo390break(c0869l, j);
            yandex();
        }
    }

    @Override // defpackage.InterfaceC10506l, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        InterfaceC10506l interfaceC10506l = this.f14999l;
        if (this.f14997l) {
            return;
        }
        C0869l c0869l = this.f14998l;
        long j = c0869l.f2526l;
        if (j > 0) {
            interfaceC10506l.mo390break(c0869l, j);
        }
        th = null;
        try {
            interfaceC10506l.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        this.f14997l = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // defpackage.InterfaceC16805l
    public final C0869l crashlytics() {
        return this.f14998l;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: finally */
    public final InterfaceC16805l mo706finally(String str) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m718l(str);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l, defpackage.InterfaceC10506l, java.io.Flushable
    public final void flush() {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return;
        }
        C0869l c0869l = this.f14998l;
        long j = c0869l.f2526l;
        InterfaceC10506l interfaceC10506l = this.f14999l;
        if (j > 0) {
            interfaceC10506l.mo390break(c0869l, j);
        }
        interfaceC10506l.flush();
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: for */
    public final InterfaceC16805l mo707for(int i) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m714l(AbstractC9334l.subs(i));
        yandex();
        return this;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f14997l;
    }

    @Override // defpackage.InterfaceC10506l
    public final C3446l isPro() {
        return this.f14999l.isPro();
    }

    public final InterfaceC16805l mopub(int i) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m720l(i);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: public */
    public final InterfaceC16805l mo728public(int i, byte[] bArr) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.write(bArr, 0, i);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: return */
    public final InterfaceC16805l mo729return(int i, int i2, String str) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m721l(i, i2, str);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: throws */
    public final InterfaceC16805l mo734throws(long j) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m722l(AbstractC9334l.isPro(j));
        yandex();
        return this;
    }

    public final String toString() {
        return "buffer(" + this.f14999l + ')';
    }

    @Override // defpackage.InterfaceC16805l
    /* JADX INFO: renamed from: volatile */
    public final long mo736volatile(InterfaceC14991l interfaceC14991l) {
        long j = 0;
        while (true) {
            long jAd = interfaceC14991l.ad(this.f14998l, 8192L);
            if (jAd == -1) {
                return j;
            }
            j += jAd;
            yandex();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return 0;
        }
        int iWrite = this.f14998l.write(byteBuffer);
        yandex();
        return iWrite;
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l writeByte(int i) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m709instanceof(i);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l writeInt(int i) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m714l(i);
        yandex();
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l writeShort(int i) {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        this.f14998l.m710l(i);
        yandex();
        return this;
    }

    public final InterfaceC16805l yandex() {
        if (this.f14997l) {
            C8339l.smaato("closed");
            return null;
        }
        C0869l c0869l = this.f14998l;
        long jVip = c0869l.vip();
        if (jVip > 0) {
            this.f14999l.mo390break(c0869l, jVip);
        }
        return this;
    }

    @Override // defpackage.InterfaceC16805l
    public final InterfaceC16805l write(byte[] bArr) {
        if (!this.f14997l) {
            this.f14998l.m738write(bArr);
            yandex();
            return this;
        }
        C8339l.smaato("closed");
        return null;
    }
}
